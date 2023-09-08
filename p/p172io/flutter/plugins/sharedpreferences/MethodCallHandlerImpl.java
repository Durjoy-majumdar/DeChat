package p172io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: io.flutter.plugins.sharedpreferences.MethodCallHandlerImpl */
class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler {
    private static final String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
    private static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    private static final String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    private static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    private final ExecutorService executor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    /* access modifiers changed from: private */
    public final Handler handler = new Handler(Looper.getMainLooper());
    private final SharedPreferences preferences;

    public MethodCallHandlerImpl(Context context) {
        this.preferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    private void commitAsync(final SharedPreferences.Editor editor, final MethodChannel.Result result) {
        this.executor.execute(new Runnable() {
            public void run() {
                final boolean commit = editor.commit();
                MethodCallHandlerImpl.this.handler.post(new Runnable() {
                    public void run() {
                        result.success(Boolean.valueOf(commit));
                    }
                });
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.lang.String> decodeList(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0022 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ ClassNotFoundException -> 0x0022 }
            r3 = 0
            byte[] r5 = android.util.Base64.decode(r5, r3)     // Catch:{ ClassNotFoundException -> 0x0022 }
            r2.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x0022 }
            r1.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0022 }
            java.lang.Object r5 = r1.readObject()     // Catch:{ ClassNotFoundException -> 0x001d, all -> 0x001a }
            java.util.List r5 = (java.util.List) r5     // Catch:{ ClassNotFoundException -> 0x001d, all -> 0x001a }
            r1.close()
            return r5
        L_0x001a:
            r5 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x001d:
            r5 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0020:
            r5 = move-exception
            goto L_0x0029
        L_0x0022:
            r5 = move-exception
        L_0x0023:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0020 }
            r1.<init>(r5)     // Catch:{ all -> 0x0020 }
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.close()
        L_0x002e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.plugins.sharedpreferences.MethodCallHandlerImpl.decodeList(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String encodeList(java.util.List<java.lang.String> r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0021 }
            r1.<init>()     // Catch:{ all -> 0x0021 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0021 }
            r2.<init>(r1)     // Catch:{ all -> 0x0021 }
            r2.writeObject(r4)     // Catch:{ all -> 0x001e }
            r2.flush()     // Catch:{ all -> 0x001e }
            byte[] r4 = r1.toByteArray()     // Catch:{ all -> 0x001e }
            r0 = 0
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ all -> 0x001e }
            r2.close()
            return r4
        L_0x001e:
            r4 = move-exception
            r0 = r2
            goto L_0x0022
        L_0x0021:
            r4 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.plugins.sharedpreferences.MethodCallHandlerImpl.encodeList(java.util.List):java.lang.String");
    }

    private Map<String, Object> getAllPrefs() {
        BigInteger bigInteger;
        Map<String, ?> all = this.preferences.getAll();
        HashMap hashMap = new HashMap();
        for (String next : all.keySet()) {
            if (next.startsWith("flutter.")) {
                Object obj = all.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.startsWith(LIST_IDENTIFIER)) {
                        obj = decodeList(str.substring(40));
                    } else if (str.startsWith(BIG_INTEGER_PREFIX)) {
                        bigInteger = new BigInteger(str.substring(44), 36);
                    } else if (str.startsWith(DOUBLE_PREFIX)) {
                        obj = Double.valueOf(str.substring(40));
                    }
                    hashMap.put(next, obj);
                } else {
                    if (obj instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj);
                        SharedPreferences.Editor remove = this.preferences.edit().remove(next);
                        bigInteger = arrayList;
                        if (!remove.putString(next, LIST_IDENTIFIER + encodeList(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                    }
                    hashMap.put(next, obj);
                }
                obj = bigInteger;
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("key");
        try {
            String str2 = methodCall.method;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1354815177:
                    if (str2.equals("commit")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1249367445:
                    if (str2.equals("getAll")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1096934831:
                    if (str2.equals("setStringList")) {
                        c = 4;
                        break;
                    }
                    break;
                case -934610812:
                    if (str2.equals("remove")) {
                        c = 7;
                        break;
                    }
                    break;
                case -905809875:
                    if (str2.equals("setInt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c = 8;
                        break;
                    }
                    break;
                case 155439827:
                    if (str2.equals("setDouble")) {
                        c = 1;
                        break;
                    }
                    break;
                case 589412115:
                    if (str2.equals("setString")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1984457324:
                    if (str2.equals("setBool")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    commitAsync(this.preferences.edit().putBoolean(str, ((Boolean) methodCall.argument("value")).booleanValue()), result);
                    return;
                case 1:
                    String d = Double.toString(((Number) methodCall.argument("value")).doubleValue());
                    SharedPreferences.Editor edit = this.preferences.edit();
                    commitAsync(edit.putString(str, DOUBLE_PREFIX + d), result);
                    return;
                case 2:
                    Number number = (Number) methodCall.argument("value");
                    if (number instanceof BigInteger) {
                        SharedPreferences.Editor edit2 = this.preferences.edit();
                        commitAsync(edit2.putString(str, BIG_INTEGER_PREFIX + ((BigInteger) number).toString(36)), result);
                        return;
                    }
                    commitAsync(this.preferences.edit().putLong(str, number.longValue()), result);
                    return;
                case 3:
                    String str3 = (String) methodCall.argument("value");
                    if (!str3.startsWith(LIST_IDENTIFIER) && !str3.startsWith(BIG_INTEGER_PREFIX)) {
                        if (!str3.startsWith(DOUBLE_PREFIX)) {
                            commitAsync(this.preferences.edit().putString(str, str3), result);
                            return;
                        }
                    }
                    result.error("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", (Object) null);
                    return;
                case 4:
                    SharedPreferences.Editor edit3 = this.preferences.edit();
                    commitAsync(edit3.putString(str, LIST_IDENTIFIER + encodeList((List) methodCall.argument("value"))), result);
                    return;
                case 5:
                    result.success(Boolean.TRUE);
                    return;
                case 6:
                    result.success(getAllPrefs());
                    return;
                case 7:
                    commitAsync(this.preferences.edit().remove(str), result);
                    return;
                case 8:
                    Set<String> keySet = getAllPrefs().keySet();
                    SharedPreferences.Editor edit4 = this.preferences.edit();
                    for (String remove : keySet) {
                        edit4.remove(remove);
                    }
                    commitAsync(edit4, result);
                    return;
                default:
                    result.notImplemented();
                    return;
            }
        } catch (IOException e) {
            result.error("IOException encountered", methodCall.method, e);
        }
        result.error("IOException encountered", methodCall.method, e);
    }

    public void teardown() {
        this.handler.removeCallbacksAndMessages((Object) null);
        this.executor.shutdown();
    }
}
