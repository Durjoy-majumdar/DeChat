package com.tencent.p014mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
/* renamed from: com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences */
public class MultiProcessSharedPreferences extends ContentProvider implements SharedPreferences {
    private static final int APPLY = 8;
    private static String AUTHORITY = null;
    /* access modifiers changed from: private */
    public static volatile Uri AUTHORITY_URI = null;
    private static final int COMMIT = 9;
    private static final int CONTAINS = 7;
    public static final boolean DEBUG = false;
    private static final int GET_ALL = 1;
    private static final int GET_BOOLEAN = 6;
    private static final int GET_FLOAT = 5;
    private static final int GET_INT = 3;
    private static final int GET_LONG = 4;
    private static final int GET_STRING = 2;
    private static final String KEY = "value";
    private static final String KEY_NAME = "name";
    private static final String PATH_APPLY = "apply";
    private static final String PATH_COMMIT = "commit";
    private static final String PATH_CONTAINS = "contains";
    private static final String PATH_GET_ALL = "getAll";
    private static final String PATH_GET_BOOLEAN = "getBoolean";
    private static final String PATH_GET_FLOAT = "getFloat";
    private static final String PATH_GET_INT = "getInt";
    private static final String PATH_GET_LONG = "getLong";
    private static final String PATH_GET_STRING = "getString";
    private static final String PATH_REGISTER_ON_SHARED_PREFERENCE_CHANGE_LISTENER = "registerOnSharedPreferenceChangeListener";
    private static final String PATH_UNREGISTER_ON_SHARED_PREFERENCE_CHANGE_LISTENER = "unregisterOnSharedPreferenceChangeListener";
    private static final String PATH_WILDCARD = "*/";
    private static final int REGISTER_ON_SHARED_PREFERENCE_CHANGE_LISTENER = 10;
    private static final String TAG = "MicroMsg.MultiProcessSharedPreferences";
    private static final int UNREGISTER_ON_SHARED_PREFERENCE_CHANGE_LISTENER = 11;
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public boolean mIsSafeMode;
    /* access modifiers changed from: private */
    public List<SoftReference<SharedPreferences.OnSharedPreferenceChangeListener>> mListeners;
    private Map<String, Integer> mListenersCount;
    /* access modifiers changed from: private */
    public int mMode;
    /* access modifiers changed from: private */
    public String mName;
    private BroadcastReceiver mReceiver;
    private UriMatcher mUriMatcher;

    /* renamed from: com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences$BundleCursor */
    public static final class BundleCursor extends MatrixCursor {
        private Bundle mBundle;

        public BundleCursor(Bundle bundle) {
            super(new String[0], 0);
            this.mBundle = bundle;
        }

        public Bundle getExtras() {
            return this.mBundle;
        }

        public Bundle respond(Bundle bundle) {
            this.mBundle = bundle;
            return bundle;
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences$EditorImpl */
    public final class EditorImpl implements SharedPreferences.Editor {
        private boolean mClear = false;
        private final Map<String, Object> mModified = new HashMap();

        public EditorImpl() {
        }

        private boolean setValue(String str) {
            boolean z = false;
            if (MultiProcessSharedPreferences.this.mIsSafeMode) {
                return false;
            }
            synchronized (MultiProcessSharedPreferences.this) {
                MultiProcessSharedPreferences multiProcessSharedPreferences = MultiProcessSharedPreferences.this;
                multiProcessSharedPreferences.checkInitAuthority(multiProcessSharedPreferences.mContext);
                String[] strArr = {String.valueOf(MultiProcessSharedPreferences.this.mMode), String.valueOf(this.mClear)};
                synchronized (this) {
                    if (MultiProcessSharedPreferences.this.mContext.getContentResolver().update(Uri.withAppendedPath(Uri.withAppendedPath(MultiProcessSharedPreferences.AUTHORITY_URI, MultiProcessSharedPreferences.this.mName), str), ReflectionUtil.contentValuesNewInstance((HashMap) this.mModified), (String) null, strArr) > 0) {
                        z = true;
                    }
                }
            }
            return z;
        }

        public void apply() {
            setValue(MultiProcessSharedPreferences.PATH_APPLY);
        }

        public SharedPreferences.Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        public boolean commit() {
            return setValue(MultiProcessSharedPreferences.PATH_COMMIT);
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            synchronized (this) {
                this.mModified.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            synchronized (this) {
                this.mModified.put(str, Float.valueOf(f));
            }
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            synchronized (this) {
                this.mModified.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            synchronized (this) {
                this.mModified.put(str, Long.valueOf(j));
            }
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this) {
                this.mModified.put(str, str2);
            }
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            synchronized (this) {
                this.mModified.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            synchronized (this) {
                this.mModified.put(str, (Object) null);
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences$ReflectionUtil */
    public static class ReflectionUtil {
        private ReflectionUtil() {
        }

        public static ContentValues contentValuesNewInstance(HashMap<String, Object> hashMap) {
            try {
                Constructor<ContentValues> declaredConstructor = ContentValues.class.getDeclaredConstructor(new Class[]{HashMap.class});
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[]{hashMap});
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException(e5);
            }
        }

        public static void editorApply(SharedPreferences.Editor editor) {
            try {
                editor.getClass().getDeclaredMethod(MultiProcessSharedPreferences.PATH_APPLY, new Class[0]).invoke(editor, new Object[0]);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            }
        }

        public static SharedPreferences.Editor editorPutStringSet(SharedPreferences.Editor editor, String str, Set<String> set) {
            try {
                return (SharedPreferences.Editor) editor.getClass().getDeclaredMethod("putStringSet", new Class[]{String.class, Set.class}).invoke(editor, new Object[]{str, set});
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public MultiProcessSharedPreferences() {
    }

    /* access modifiers changed from: private */
    public void checkInitAuthority(Context context) {
        if (AUTHORITY_URI == null) {
            String str = null;
            Uri uri = AUTHORITY_URI;
            synchronized (this) {
                if (uri == null) {
                    try {
                        str = queryAuthority(context);
                        if (str == null) {
                            str = context.getPackageName() + ".sdk.platformtools.MultiProcessSharedPreferences";
                        }
                        uri = Uri.parse("content://" + str);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str == null) {
                    throw new IllegalArgumentException("'AUTHORITY' initialize failed.");
                }
            }
            AUTHORITY = str;
            AUTHORITY_URI = uri;
        }
    }

    private void checkInitListenersCount() {
        if (this.mListenersCount == null) {
            this.mListenersCount = new HashMap();
        }
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, int i) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(str);
        MultiProcessMMKV.transport2MMKV(new MultiProcessSharedPreferences(context, str, i), mmkv);
        return mmkv;
    }

    private Object getValue(String str, String str2, Object obj) {
        Object obj2 = null;
        if (this.mIsSafeMode) {
            return null;
        }
        checkInitAuthority(this.mContext);
        Uri withAppendedPath = Uri.withAppendedPath(Uri.withAppendedPath(AUTHORITY_URI, this.mName), str);
        String[] strArr = new String[3];
        strArr[0] = String.valueOf(this.mMode);
        strArr[1] = str2;
        strArr[2] = obj == null ? null : String.valueOf(obj);
        Cursor query = this.mContext.getContentResolver().query(withAppendedPath, (String[]) null, (String) null, strArr, (String) null);
        if (query != null) {
            try {
                Bundle extras = query.getExtras();
                if (extras != null) {
                    obj2 = extras.get("value");
                    extras.clear();
                }
            } catch (Exception unused) {
            }
            query.close();
        }
        return obj2 != null ? obj2 : obj;
    }

    private String makeAction(String str) {
        return String.format("%1$s_%2$s", new Object[]{MultiProcessSharedPreferences.class.getName(), str});
    }

    private void notifyListeners(String str, ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            Intent intent = new Intent();
            intent.setAction(makeAction(str));
            intent.setPackage(getContext().getPackageName());
            intent.putExtra("name", str);
            intent.putExtra("value", arrayList);
            getContext().sendBroadcast(intent);
        }
    }

    private static String queryAuthority(Context context) {
        PackageInfo packageInfo;
        ProviderInfo[] providerInfoArr;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 8);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (!(packageInfo == null || (providerInfoArr = packageInfo.providers) == null)) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (providerInfo.name.equals(MultiProcessSharedPreferences.class.getName())) {
                    return providerInfo.authority;
                }
            }
        }
        return null;
    }

    public boolean contains(String str) {
        Boolean bool = (Boolean) getValue(PATH_CONTAINS, str, (Object) null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external delete");
    }

    public SharedPreferences.Editor edit() {
        return new EditorImpl();
    }

    public Map<String, ?> getAll() {
        return (Map) getValue(PATH_GET_ALL, (String) null, (Object) null);
    }

    public boolean getBoolean(String str, boolean z) {
        Boolean bool = (Boolean) getValue(PATH_GET_BOOLEAN, str, Boolean.valueOf(z));
        return bool != null ? bool.booleanValue() : z;
    }

    public float getFloat(String str, float f) {
        Float f2 = (Float) getValue(PATH_GET_FLOAT, str, Float.valueOf(f));
        return f2 != null ? f2.floatValue() : f;
    }

    public int getInt(String str, int i) {
        Integer num = (Integer) getValue(PATH_GET_INT, str, Integer.valueOf(i));
        return num != null ? num.intValue() : i;
    }

    public long getLong(String str, long j) {
        Long l = (Long) getValue(PATH_GET_LONG, str, Long.valueOf(j));
        return l != null ? l.longValue() : j;
    }

    public String getString(String str, String str2) {
        String str3 = (String) getValue(PATH_GET_STRING, str, str2);
        return str3 != null ? str3 : str2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        synchronized (this) {
            Set<String> set2 = (Set) getValue(PATH_GET_STRING, str, set);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    public String getType(Uri uri) {
        throw new UnsupportedOperationException("No external call");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external insert");
    }

    public boolean onCreate() {
        checkInitAuthority(getContext());
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.mUriMatcher = uriMatcher;
        uriMatcher.addURI(AUTHORITY, "*/getAll", 1);
        this.mUriMatcher.addURI(AUTHORITY, "*/getString", 2);
        this.mUriMatcher.addURI(AUTHORITY, "*/getInt", 3);
        this.mUriMatcher.addURI(AUTHORITY, "*/getLong", 4);
        this.mUriMatcher.addURI(AUTHORITY, "*/getFloat", 5);
        this.mUriMatcher.addURI(AUTHORITY, "*/getBoolean", 6);
        this.mUriMatcher.addURI(AUTHORITY, "*/contains", 7);
        this.mUriMatcher.addURI(AUTHORITY, "*/apply", 8);
        this.mUriMatcher.addURI(AUTHORITY, "*/commit", 9);
        this.mUriMatcher.addURI(AUTHORITY, "*/registerOnSharedPreferenceChangeListener", 10);
        this.mUriMatcher.addURI(AUTHORITY, "*/unregisterOnSharedPreferenceChangeListener", 11);
        return true;
    }

    public void onLowMemory() {
        Map<String, Integer> map = this.mListenersCount;
        if (map != null) {
            map.clear();
        }
        super.onLowMemory();
    }

    public void onTrimMemory(int i) {
        Map<String, Integer> map = this.mListenersCount;
        if (map != null) {
            map.clear();
        }
        super.onTrimMemory(i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z = false;
        String str3 = uri.getPathSegments().get(0);
        int parseInt = Integer.parseInt(strArr2[0]);
        String str4 = strArr2[1];
        String str5 = strArr2[2];
        Bundle bundle = new Bundle();
        switch (this.mUriMatcher.match(uri)) {
            case 1:
                bundle.putSerializable("value", (HashMap) getContext().getSharedPreferences(str3, parseInt).getAll());
                break;
            case 2:
                bundle.putString("value", getContext().getSharedPreferences(str3, parseInt).getString(str4, str5));
                break;
            case 3:
                bundle.putInt("value", getContext().getSharedPreferences(str3, parseInt).getInt(str4, Integer.parseInt(str5)));
                break;
            case 4:
                bundle.putLong("value", getContext().getSharedPreferences(str3, parseInt).getLong(str4, Long.parseLong(str5)));
                break;
            case 5:
                bundle.putFloat("value", getContext().getSharedPreferences(str3, parseInt).getFloat(str4, Float.parseFloat(str5)));
                break;
            case 6:
                bundle.putBoolean("value", getContext().getSharedPreferences(str3, parseInt).getBoolean(str4, Boolean.parseBoolean(str5)));
                break;
            case 7:
                bundle.putBoolean("value", getContext().getSharedPreferences(str3, parseInt).contains(str4));
                break;
            case 10:
                checkInitListenersCount();
                Integer num = this.mListenersCount.get(str3);
                int intValue = (num == null ? 0 : num.intValue()) + 1;
                this.mListenersCount.put(str3, Integer.valueOf(intValue));
                Integer num2 = this.mListenersCount.get(str3);
                if (intValue == (num2 == null ? 0 : num2.intValue())) {
                    z = true;
                }
                bundle.putBoolean("value", z);
                break;
            case 11:
                checkInitListenersCount();
                Integer num3 = this.mListenersCount.get(str3);
                int intValue2 = (num3 == null ? 0 : num3.intValue()) - 1;
                if (intValue2 > 0) {
                    this.mListenersCount.put(str3, Integer.valueOf(intValue2));
                    Integer num4 = this.mListenersCount.get(str3);
                    if (intValue2 == (num4 == null ? 0 : num4.intValue())) {
                        z = true;
                    }
                    bundle.putBoolean("value", z);
                    break;
                } else {
                    this.mListenersCount.remove(str3);
                    bundle.putBoolean("value", !this.mListenersCount.containsKey(str3));
                    break;
                }
            default:
                throw new IllegalArgumentException("This is Unknown Uri：" + uri);
        }
        return new BundleCursor(bundle);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            Boolean bool = (Boolean) getValue(PATH_REGISTER_ON_SHARED_PREFERENCE_CHANGE_LISTENER, (String) null, Boolean.FALSE);
            if (bool != null && bool.booleanValue()) {
                this.mListeners.add(new SoftReference(onSharedPreferenceChangeListener));
                if (this.mReceiver == null) {
                    C1159791 r4 = new BroadcastReceiver() {
                        public void onReceive(Context context, Intent intent) {
                            List access$100;
                            String stringExtra = intent.getStringExtra("name");
                            List list = (List) intent.getSerializableExtra("value");
                            if (MultiProcessSharedPreferences.this.mName.equals(stringExtra) && list != null) {
                                synchronized (MultiProcessSharedPreferences.this) {
                                    access$100 = MultiProcessSharedPreferences.this.mListeners;
                                }
                                ArrayList arrayList = new ArrayList(access$100);
                                for (int size = list.size() - 1; size >= 0; size--) {
                                    String str = (String) list.get(size);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) ((SoftReference) it.next()).get();
                                        if (onSharedPreferenceChangeListener != null) {
                                            onSharedPreferenceChangeListener.onSharedPreferenceChanged(MultiProcessSharedPreferences.this, str);
                                        }
                                    }
                                }
                            }
                        }
                    };
                    this.mReceiver = r4;
                    this.mContext.registerReceiver(r4, new IntentFilter(makeAction(this.mName)));
                }
            }
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        BroadcastReceiver broadcastReceiver;
        synchronized (this) {
            getValue(PATH_UNREGISTER_ON_SHARED_PREFERENCE_CHANGE_LISTENER, (String) null, Boolean.FALSE);
            if (this.mListeners != null) {
                ArrayList arrayList = new ArrayList();
                for (SoftReference next : this.mListeners) {
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = (SharedPreferences.OnSharedPreferenceChangeListener) next.get();
                    if (onSharedPreferenceChangeListener2 != null && onSharedPreferenceChangeListener2.equals(onSharedPreferenceChangeListener)) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.mListeners.remove((SoftReference) it.next());
                }
                if (this.mListeners.isEmpty() && (broadcastReceiver = this.mReceiver) != null) {
                    this.mContext.unregisterReceiver(broadcastReceiver);
                    this.mReceiver = null;
                    this.mListeners = null;
                }
            }
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Uri uri2 = uri;
        int i = 0;
        String str2 = uri.getPathSegments().get(0);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(str2, Integer.parseInt(strArr[0]));
        int match = this.mUriMatcher.match(uri2);
        if (match == 8 || match == 9) {
            Map<String, Integer> map = this.mListenersCount;
            boolean z = (map == null || map.get(str2) == null || this.mListenersCount.get(str2).intValue() <= 0) ? false : true;
            ArrayList arrayList = null;
            Map hashMap = new HashMap();
            if (z) {
                arrayList = new ArrayList();
                hashMap = sharedPreferences.getAll();
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (Boolean.parseBoolean(strArr[1])) {
                if (z && hashMap != null && !hashMap.isEmpty()) {
                    for (Map.Entry key : hashMap.entrySet()) {
                        arrayList.add((String) key.getKey());
                    }
                }
                edit.clear();
            }
            for (Map.Entry next : contentValues.valueSet()) {
                String str3 = (String) next.getKey();
                Object value = next.getValue();
                if ((value instanceof EditorImpl) || value == null) {
                    edit.remove(str3);
                    if (z && hashMap != null && hashMap.containsKey(str3)) {
                        arrayList.add(str3);
                    }
                } else if (z && hashMap != null && (!hashMap.containsKey(str3) || (hashMap.containsKey(str3) && !value.equals(hashMap.get(str3))))) {
                    arrayList.add(str3);
                }
                if (value instanceof String) {
                    edit.putString(str3, (String) value);
                } else if (value instanceof Set) {
                    ReflectionUtil.editorPutStringSet(edit, str3, (Set) value);
                } else if (value instanceof Integer) {
                    edit.putInt(str3, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    edit.putLong(str3, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(str3, ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    edit.putBoolean(str3, ((Boolean) value).booleanValue());
                }
            }
            if (!z || !arrayList.isEmpty()) {
                if (match != 8) {
                    if (match == 9 && edit.commit()) {
                        notifyListeners(str2, arrayList);
                    }
                    contentValues.clear();
                    return i;
                }
                ReflectionUtil.editorApply(edit);
                notifyListeners(str2, arrayList);
            }
            i = 1;
            contentValues.clear();
            return i;
        }
        throw new IllegalArgumentException("This is Unknown Uri：" + uri2);
    }

    private MultiProcessSharedPreferences(Context context, String str, int i) {
        this.mContext = context;
        this.mName = str;
        this.mMode = i;
        this.mIsSafeMode = context.getPackageManager().isSafeMode();
    }
}
