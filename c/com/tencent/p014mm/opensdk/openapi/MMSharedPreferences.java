package com.tencent.p014mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.p014mm.opensdk.channel.p943a.C81053a;
import com.tencent.p014mm.opensdk.utils.C1313a;
import com.tencent.p014mm.opensdk.utils.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.opensdk.openapi.MMSharedPreferences */
class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";
    private final String[] columns = {"_id", "key", "type", "value"};

    /* renamed from: cr */
    private final ContentResolver f10434cr;
    private REditor editor = null;
    private final HashMap<String, Object> values = new HashMap<>();

    /* renamed from: com.tencent.mm.opensdk.openapi.MMSharedPreferences$REditor */
    public static class REditor implements SharedPreferences.Editor {
        private boolean clear = false;

        /* renamed from: cr */
        private ContentResolver f10435cr;
        private Set<String> remove = new HashSet();
        private Map<String, Object> values = new HashMap();

        public REditor(ContentResolver contentResolver) {
            this.f10435cr = contentResolver;
        }

        public void apply() {
        }

        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x003f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean commit() {
            /*
                r10 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r1 = r10.clear
                r2 = 0
                if (r1 == 0) goto L_0x0014
                android.content.ContentResolver r1 = r10.f10435cr
                android.net.Uri r3 = com.tencent.p014mm.opensdk.utils.C1313a.f10436a
                r4 = 0
                r1.delete(r3, r4, r4)
                r10.clear = r2
            L_0x0014:
                java.util.Set<java.lang.String> r1 = r10.remove
                java.util.Iterator r1 = r1.iterator()
            L_0x001a:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "key = ?"
                r5 = 1
                if (r3 == 0) goto L_0x0035
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                android.content.ContentResolver r6 = r10.f10435cr
                android.net.Uri r7 = com.tencent.p014mm.opensdk.utils.C1313a.f10436a
                java.lang.String[] r5 = new java.lang.String[r5]
                r5[r2] = r3
                r6.delete(r7, r4, r5)
                goto L_0x001a
            L_0x0035:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r10.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x003f:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x00c8
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r6 = r3.getValue()
                java.lang.String r7 = "MicroMsg.SDK.PluginProvider.Resolver"
                if (r6 != 0) goto L_0x005b
                java.lang.String r8 = "unresolve failed, null value"
            L_0x0056:
                com.tencent.p014mm.opensdk.utils.Log.m99044e(r7, r8)
                r7 = 0
                goto L_0x009a
            L_0x005b:
                boolean r8 = r6 instanceof java.lang.Integer
                if (r8 == 0) goto L_0x0061
                r7 = 1
                goto L_0x009a
            L_0x0061:
                boolean r8 = r6 instanceof java.lang.Long
                if (r8 == 0) goto L_0x0067
                r7 = 2
                goto L_0x009a
            L_0x0067:
                boolean r8 = r6 instanceof java.lang.String
                if (r8 == 0) goto L_0x006d
                r7 = 3
                goto L_0x009a
            L_0x006d:
                boolean r8 = r6 instanceof java.lang.Boolean
                if (r8 == 0) goto L_0x0073
                r7 = 4
                goto L_0x009a
            L_0x0073:
                boolean r8 = r6 instanceof java.lang.Float
                if (r8 == 0) goto L_0x0079
                r7 = 5
                goto L_0x009a
            L_0x0079:
                boolean r8 = r6 instanceof java.lang.Double
                if (r8 == 0) goto L_0x007f
                r7 = 6
                goto L_0x009a
            L_0x007f:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "unresolve failed, unknown type="
                r8.append(r9)
                java.lang.Class r9 = r6.getClass()
                java.lang.String r9 = r9.toString()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                goto L_0x0056
            L_0x009a:
                if (r7 != 0) goto L_0x009e
                r6 = 0
                goto L_0x00b3
            L_0x009e:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r8 = "type"
                r0.put(r8, r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "value"
                r0.put(r7, r6)
                r6 = 1
            L_0x00b3:
                if (r6 == 0) goto L_0x003f
                android.content.ContentResolver r6 = r10.f10435cr
                android.net.Uri r7 = com.tencent.p014mm.opensdk.utils.C1313a.f10436a
                java.lang.String[] r8 = new java.lang.String[r5]
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                r8[r2] = r3
                r6.update(r7, r0, r4, r8)
                goto L_0x003f
            L_0x00c8:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.opensdk.openapi.MMSharedPreferences.REditor.commit():boolean");
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.values.put(str, Boolean.valueOf(z));
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.values.put(str, Float.valueOf(f));
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.values.put(str, Integer.valueOf(i));
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.values.put(str, Long.valueOf(j));
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.f10434cr = context.getContentResolver();
    }

    private Object getValue(String str) {
        try {
            Cursor query = this.f10434cr.query(C1313a.f10436a, this.columns, "key = ?", new String[]{str}, (String) null);
            if (query == null) {
                return null;
            }
            Object a = query.moveToFirst() ? C81053a.m99033a(query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex("value"))) : null;
            query.close();
            return a;
        } catch (Exception e) {
            Log.m99044e(TAG, "getValue exception:" + e.getMessage());
            return null;
        }
    }

    public boolean contains(String str) {
        return getValue(str) != null;
    }

    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.f10434cr);
        }
        return this.editor;
    }

    public Map<String, ?> getAll() {
        try {
            Cursor query = this.f10434cr.query(C1313a.f10436a, this.columns, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("key");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("value");
            while (query.moveToNext()) {
                this.values.put(query.getString(columnIndex), C81053a.m99033a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.values;
        } catch (Exception e) {
            Log.m99044e(TAG, "getAll exception:" + e.getMessage());
            return this.values;
        }
    }

    public boolean getBoolean(String str, boolean z) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z : ((Boolean) value).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f : ((Float) value).floatValue();
    }

    public int getInt(String str, int i) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i : ((Integer) value).intValue();
    }

    public long getLong(String str, long j) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j : ((Long) value).longValue();
    }

    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
