package tg3;

import java.io.File;

/* renamed from: tg3.s */
public class C90492s {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[SYNTHETIC, Splitter:B:25:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0049 A[SYNTHETIC, Splitter:B:32:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m113305a(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r7 = r1.exists()
            if (r7 == 0) goto L_0x004c
            r7 = 102400(0x19000, float:1.43493E-40)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0019
            goto L_0x004c
        L_0x0019:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x003e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x003e }
            long r3 = (long) r7
            long r5 = r1.length()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            long r3 = r1.length()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
        L_0x002c:
            int r7 = (int) r3     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.String r7 = p823sg.C90193h.m112874b(r2, r7)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.close()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r0 = r7
            goto L_0x004c
        L_0x0039:
            r7 = move-exception
            r0 = r2
            goto L_0x003f
        L_0x003c:
            goto L_0x0047
        L_0x003e:
            r7 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            throw r7
        L_0x0045:
            r2 = r0
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tg3.C90492s.m113305a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static final boolean m113306b(String str, String str2, String str3) {
        if (!(str == null || str2 == null || str3 == null)) {
            File file = new File(str + str2);
            File file2 = new File(str + str3);
            if (file.exists()) {
                return file.renameTo(file2);
            }
        }
        return false;
    }
}
