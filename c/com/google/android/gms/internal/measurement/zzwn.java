package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzwn {
    private static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri zzbmh = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzbmi = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzbmj = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */
    public static final AtomicBoolean zzbmk = new AtomicBoolean();
    private static HashMap<String, String> zzbml;
    private static final HashMap<String, Boolean> zzbmm = new HashMap<>();
    private static final HashMap<String, Integer> zzbmn = new HashMap<>();
    private static final HashMap<String, Long> zzbmo = new HashMap<>();
    private static final HashMap<String, Float> zzbmp = new HashMap<>();
    private static Object zzbmq;
    private static boolean zzbmr;
    private static String[] zzbms = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T zza(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzwn> r0 = com.google.android.gms.internal.measurement.zzwn.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0015 }
            if (r2 == 0) goto L_0x0010
            r4 = r2
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r4
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            r2 = 0
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzwn.zza(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r13 = r13.query(CONTENT_URI, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r13.moveToFirst() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r15 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r15.equals((java.lang.Object) null) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        zza(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r15 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        zza(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009a, code lost:
        if (r13 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009f, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzwn> r15 = com.google.android.gms.internal.measurement.zzwn.class
            monitor-enter(r15)
            zza(r13)     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = zzbmq     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = zzbml     // Catch:{ all -> 0x00a0 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x00a0 }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzbml     // Catch:{ all -> 0x00a0 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x001c
            r2 = r13
        L_0x001c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x001e:
            java.lang.String[] r1 = zzbms     // Catch:{ all -> 0x00a0 }
            int r3 = r1.length     // Catch:{ all -> 0x00a0 }
            r4 = 0
            r5 = 0
        L_0x0023:
            r6 = 1
            if (r5 >= r3) goto L_0x0061
            r7 = r1[r5]     // Catch:{ all -> 0x00a0 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00a0 }
            if (r7 == 0) goto L_0x005e
            boolean r0 = zzbmr     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x003a
            java.util.HashMap<java.lang.String, java.lang.String> r0 = zzbml     // Catch:{ all -> 0x00a0 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x005c
        L_0x003a:
            java.lang.String[] r0 = zzbms     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = zzbml     // Catch:{ all -> 0x00a0 }
            java.util.Map r13 = zza(r13, r0)     // Catch:{ all -> 0x00a0 }
            r1.putAll(r13)     // Catch:{ all -> 0x00a0 }
            zzbmr = r6     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzbml     // Catch:{ all -> 0x00a0 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x005c
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzbml     // Catch:{ all -> 0x00a0 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x005a
            r2 = r13
        L_0x005a:
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x005c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0061:
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            android.net.Uri r8 = CONTENT_URI
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0090
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x0099 }
            if (r15 != 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            java.lang.String r15 = r13.getString(r6)     // Catch:{ all -> 0x0099 }
            if (r15 == 0) goto L_0x0086
            boolean r1 = r15.equals(r2)     // Catch:{ all -> 0x0099 }
            if (r1 == 0) goto L_0x0086
            r15 = r2
        L_0x0086:
            zza((java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x0099 }
            if (r15 == 0) goto L_0x008c
            r2 = r15
        L_0x008c:
            r13.close()
            return r2
        L_0x0090:
            zza((java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r2)     // Catch:{ all -> 0x0099 }
            if (r13 == 0) goto L_0x0098
            r13.close()
        L_0x0098:
            return r2
        L_0x0099:
            r14 = move-exception
            if (r13 == 0) goto L_0x009f
            r13.close()
        L_0x009f:
            throw r14
        L_0x00a0:
            r13 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzwn.zza(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzbmh, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void zza(ContentResolver contentResolver) {
        if (zzbml == null) {
            zzbmk.set(false);
            zzbml = new HashMap<>();
            zzbmq = new Object();
            zzbmr = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzwo((Handler) null));
        } else if (zzbmk.getAndSet(false)) {
            zzbml.clear();
            zzbmm.clear();
            zzbmn.clear();
            zzbmo.clear();
            zzbmp.clear();
            zzbmq = new Object();
            zzbmr = false;
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzwn.class) {
            if (obj == zzbmq) {
                zzbml.put(str, str2);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object zzb = zzb(contentResolver);
        HashMap<String, Boolean> hashMap = zzbmm;
        Boolean bool = (Boolean) zza(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null && !zza.equals("")) {
            if (zzbmi.matcher(zza).matches()) {
                z = true;
                bool = Boolean.TRUE;
            } else if (zzbmj.matcher(zza).matches()) {
                z = false;
                bool = Boolean.FALSE;
            }
        }
        synchronized (zzwn.class) {
            if (zzb == zzbmq) {
                hashMap.put(str, bool);
                zzbml.remove(str);
            }
        }
        return z;
    }

    private static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzwn.class) {
            zza(contentResolver);
            obj = zzbmq;
        }
        return obj;
    }
}
