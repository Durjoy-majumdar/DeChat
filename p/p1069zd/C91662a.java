package p1069zd;

/* renamed from: zd.a */
public class C91662a {

    /* renamed from: a */
    public static String f262639a;

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086 A[SYNTHETIC, Splitter:B:46:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008c A[SYNTHETIC, Splitter:B:52:0x008c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m115197a(android.content.Context r7, int r8) {
        /*
            java.lang.String r0 = ""
            if (r7 == 0) goto L_0x008f
            if (r8 > 0) goto L_0x0008
            goto L_0x008f
        L_0x0008:
            java.lang.String r1 = "activity"
            java.lang.Object r7 = r7.getSystemService(r1)     // Catch:{ Exception -> 0x0037 }
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch:{ Exception -> 0x0037 }
            java.util.List r7 = r7.getRunningAppProcesses()     // Catch:{ Exception -> 0x0037 }
            if (r7 == 0) goto L_0x0037
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x0037 }
        L_0x001a:
            boolean r1 = r7.hasNext()     // Catch:{ Exception -> 0x0037 }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x0037 }
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch:{ Exception -> 0x0037 }
            int r2 = r1.pid     // Catch:{ Exception -> 0x0037 }
            if (r2 != r8) goto L_0x001a
            java.lang.String r2 = r1.processName     // Catch:{ Exception -> 0x0037 }
            if (r2 == 0) goto L_0x001a
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x0037 }
            if (r2 != 0) goto L_0x001a
            java.lang.String r7 = r1.processName     // Catch:{ Exception -> 0x0037 }
            return r7
        L_0x0037:
            r7 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r7]
            r2 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            r5.<init>()     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            java.lang.String r6 = "/proc/"
            r5.append(r6)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            r5.append(r8)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            java.lang.String r8 = "/cmdline"
            r5.append(r8)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            java.lang.String r8 = r5.toString()     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            int r8 = r3.read(r1)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            if (r8 <= 0) goto L_0x007a
            r2 = 0
            r4 = 0
        L_0x0064:
            if (r4 >= r8) goto L_0x0071
            byte r5 = r1[r4]     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            if (r5 > r7) goto L_0x0070
            if (r5 > 0) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            int r4 = r4 + 1
            goto L_0x0064
        L_0x0070:
            r8 = r4
        L_0x0071:
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r7.<init>(r1, r2, r8)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r3.close()     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            return r7
        L_0x007a:
            r3.close()     // Catch:{ Exception -> 0x008f }
            goto L_0x008f
        L_0x007e:
            r7 = move-exception
            r2 = r3
            goto L_0x0084
        L_0x0081:
            r2 = r3
            goto L_0x008a
        L_0x0083:
            r7 = move-exception
        L_0x0084:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            throw r7
        L_0x008a:
            if (r2 == 0) goto L_0x008f
            r2.close()     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1069zd.C91662a.m115197a(android.content.Context, int):java.lang.String");
    }
}
