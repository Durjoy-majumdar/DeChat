package com.google.android.gms.internal.stable;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzi {
    private static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static HashMap<String, String> zzagq;
    private static final Uri zzagv = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final Pattern zzagw = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final Pattern zzagx = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */
    public static final AtomicBoolean zzagy = new AtomicBoolean();
    private static final HashMap<String, Boolean> zzagz = new HashMap<>();
    private static final HashMap<String, Integer> zzaha = new HashMap<>();
    private static final HashMap<String, Long> zzahb = new HashMap<>();
    private static final HashMap<String, Float> zzahc = new HashMap<>();
    private static Object zzahd;
    private static boolean zzahe;
    private static String[] zzahf = new String[0];

    public static int getInt(ContentResolver contentResolver, String str, int i) {
        Object zzb = zzb(contentResolver);
        Integer num = (Integer) zza(zzaha, str, Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null) {
            try {
                int parseInt = Integer.parseInt(zza);
                num = Integer.valueOf(parseInt);
                i = parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        zza(zzb, zzaha, str, num);
        return i;
    }

    public static long getLong(ContentResolver contentResolver, String str, long j) {
        Object zzb = zzb(contentResolver);
        Long l = (Long) zza(zzahb, str, Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null) {
            try {
                long parseLong = Long.parseLong(zza);
                l = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        zza(zzb, zzahb, str, l);
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T zza(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.stable.zzi> r0 = com.google.android.gms.internal.stable.zzi.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.stable.zzi.zza(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r13 = r13.query(CONTENT_URI, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r13 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r13.moveToFirst() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        r0 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r0 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        if (r0.equals(r15) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        r0 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        zza(r1, r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r0 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008a, code lost:
        r15 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        zza(r1, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0093, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0095, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0098, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0099, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009a, code lost:
        if (r13 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009c, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009f, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        return r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.internal.stable.zzi> r0 = com.google.android.gms.internal.stable.zzi.class
            monitor-enter(r0)
            zza(r13)     // Catch:{ all -> 0x00a0 }
            java.lang.Object r1 = zzahd     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = zzagq     // Catch:{ all -> 0x00a0 }
            boolean r2 = r2.containsKey(r14)     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x001d
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzagq     // Catch:{ all -> 0x00a0 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x001b
            r15 = r13
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return r15
        L_0x001d:
            java.lang.String[] r2 = zzahf     // Catch:{ all -> 0x00a0 }
            int r3 = r2.length     // Catch:{ all -> 0x00a0 }
            r4 = 0
            r5 = 0
        L_0x0022:
            r6 = 1
            if (r5 >= r3) goto L_0x0060
            r7 = r2[r5]     // Catch:{ all -> 0x00a0 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00a0 }
            if (r7 == 0) goto L_0x005d
            boolean r1 = zzahe     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0039
            java.util.HashMap<java.lang.String, java.lang.String> r1 = zzagq     // Catch:{ all -> 0x00a0 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x005b
        L_0x0039:
            java.lang.String[] r1 = zzahf     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = zzagq     // Catch:{ all -> 0x00a0 }
            java.util.Map r13 = zza(r13, r1)     // Catch:{ all -> 0x00a0 }
            r2.putAll(r13)     // Catch:{ all -> 0x00a0 }
            zzahe = r6     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzagq     // Catch:{ all -> 0x00a0 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x005b
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzagq     // Catch:{ all -> 0x00a0 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x0059
            r15 = r13
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return r15
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return r15
        L_0x005d:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            android.net.Uri r8 = CONTENT_URI
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x008f
            boolean r0 = r13.moveToFirst()     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0078
            goto L_0x008f
        L_0x0078:
            java.lang.String r0 = r13.getString(r6)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0085
            boolean r2 = r0.equals(r15)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x0085
            r0 = r15
        L_0x0085:
            zza((java.lang.Object) r1, (java.lang.String) r14, (java.lang.String) r0)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x008b
            r15 = r0
        L_0x008b:
            r13.close()
            return r15
        L_0x008f:
            r0 = 0
            zza((java.lang.Object) r1, (java.lang.String) r14, (java.lang.String) r0)     // Catch:{ all -> 0x0099 }
            if (r13 == 0) goto L_0x0098
            r13.close()
        L_0x0098:
            return r15
        L_0x0099:
            r14 = move-exception
            if (r13 == 0) goto L_0x009f
            r13.close()
        L_0x009f:
            throw r14
        L_0x00a0:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.stable.zzi.zza(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzagv, (String[]) null, (String) null, strArr, (String) null);
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
        if (zzagq == null) {
            zzagy.set(false);
            zzagq = new HashMap<>();
            zzahd = new Object();
            zzahe = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzj((Handler) null));
        } else if (zzagy.getAndSet(false)) {
            zzagq.clear();
            zzagz.clear();
            zzaha.clear();
            zzahb.clear();
            zzahc.clear();
            zzahd = new Object();
            zzahe = false;
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzi.class) {
            if (obj == zzahd) {
                zzagq.put(str, str2);
            }
        }
    }

    private static <T> void zza(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (zzi.class) {
            if (obj == zzahd) {
                hashMap.put(str, t);
                zzagq.remove(str);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object zzb = zzb(contentResolver);
        HashMap<String, Boolean> hashMap = zzagz;
        Boolean bool = (Boolean) zza(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null && !zza.equals("")) {
            if (zzagw.matcher(zza).matches()) {
                z = true;
                bool = Boolean.TRUE;
            } else if (zzagx.matcher(zza).matches()) {
                z = false;
                bool = Boolean.FALSE;
            }
        }
        zza(zzb, hashMap, str, bool);
        return z;
    }

    private static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzi.class) {
            zza(contentResolver);
            obj = zzahd;
        }
        return obj;
    }
}
