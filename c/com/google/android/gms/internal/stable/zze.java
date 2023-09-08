package com.google.android.gms.internal.stable;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Handler;
import android.provider.BaseColumns;
import java.util.HashMap;

public final class zze {

    public static class zza implements BaseColumns {
        private static HashMap<Uri, zzh> zzagq = new HashMap<>();

        private static zzh zza(ContentResolver contentResolver, Uri uri) {
            zzh zzh = zzagq.get(uri);
            if (zzh == null) {
                zzh zzh2 = new zzh();
                zzagq.put(uri, zzh2);
                contentResolver.registerContentObserver(uri, true, new zzf((Handler) null, zzh2));
                return zzh2;
            } else if (!zzh.zzagu.getAndSet(false)) {
                return zzh;
            } else {
                synchronized (zzh) {
                    zzh.zzags.clear();
                    zzh.zzagt = new Object();
                }
                return zzh;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r11 = r11.query(r12, new java.lang.String[]{"value"}, "name=?", new java.lang.String[]{r13}, (java.lang.String) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            if (r11 == null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
            if (r11.moveToFirst() != false) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
            r2 = r11.getString(0);
            zza(r1, r0, r13, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            zza(r1, r0, r13, (java.lang.String) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
            if (r11 == null) goto L_0x0050;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
            r12 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
            r2 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
            r2 = r11;
            r11 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
            r12 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
            r11 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            java.util.Objects.toString(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005e, code lost:
            if (r2 != null) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0060, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0065, code lost:
            if (r2 != null) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:
            throw r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            return r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            return r2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0067  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String zza(android.content.ContentResolver r11, android.net.Uri r12, java.lang.String r13) {
            /*
                java.lang.Class<com.google.android.gms.internal.stable.zze$zza> r0 = com.google.android.gms.internal.stable.zze.zza.class
                monitor-enter(r0)
                com.google.android.gms.internal.stable.zzh r1 = zza(r11, r12)     // Catch:{ all -> 0x006e }
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                monitor-enter(r1)
                java.lang.Object r0 = r1.zzagt     // Catch:{ all -> 0x006b }
                java.util.HashMap<java.lang.String, java.lang.String> r2 = r1.zzags     // Catch:{ all -> 0x006b }
                boolean r2 = r2.containsKey(r13)     // Catch:{ all -> 0x006b }
                if (r2 == 0) goto L_0x001d
                java.util.HashMap<java.lang.String, java.lang.String> r11 = r1.zzags     // Catch:{ all -> 0x006b }
                java.lang.Object r11 = r11.get(r13)     // Catch:{ all -> 0x006b }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x006b }
                monitor-exit(r1)     // Catch:{ all -> 0x006b }
                return r11
            L_0x001d:
                monitor-exit(r1)     // Catch:{ all -> 0x006b }
                r2 = 0
                java.lang.String r3 = "value"
                java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLException -> 0x005a }
                java.lang.String r7 = "name=?"
                r3 = 1
                java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x005a }
                r3 = 0
                r8[r3] = r13     // Catch:{ SQLException -> 0x005a }
                r9 = 0
                r4 = r11
                r5 = r12
                android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ SQLException -> 0x005a }
                if (r11 == 0) goto L_0x0048
                boolean r4 = r11.moveToFirst()     // Catch:{ SQLException -> 0x0054, all -> 0x0051 }
                if (r4 != 0) goto L_0x003d
                goto L_0x0048
            L_0x003d:
                java.lang.String r2 = r11.getString(r3)     // Catch:{ SQLException -> 0x0054, all -> 0x0051 }
                zza(r1, r0, r13, r2)     // Catch:{ SQLException -> 0x0054, all -> 0x0051 }
                r11.close()
                goto L_0x0064
            L_0x0048:
                zza(r1, r0, r13, r2)     // Catch:{ SQLException -> 0x0054, all -> 0x0051 }
                if (r11 == 0) goto L_0x0050
                r11.close()
            L_0x0050:
                return r2
            L_0x0051:
                r12 = move-exception
                r2 = r11
                goto L_0x0065
            L_0x0054:
                r10 = r2
                r2 = r11
                r11 = r10
                goto L_0x005b
            L_0x0058:
                r12 = move-exception
                goto L_0x0065
            L_0x005a:
                r11 = r2
            L_0x005b:
                java.util.Objects.toString(r12)     // Catch:{ all -> 0x0058 }
                if (r2 == 0) goto L_0x0063
                r2.close()
            L_0x0063:
                r2 = r11
            L_0x0064:
                return r2
            L_0x0065:
                if (r2 == 0) goto L_0x006a
                r2.close()
            L_0x006a:
                throw r12
            L_0x006b:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x006b }
                throw r11
            L_0x006e:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.stable.zze.zza.zza(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
        }

        private static void zza(zzh zzh, Object obj, String str, String str2) {
            synchronized (zzh) {
                if (obj == zzh.zzagt) {
                    zzh.zzags.put(str, str2);
                }
            }
        }
    }
}
