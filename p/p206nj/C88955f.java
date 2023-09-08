package p206nj;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.File;

/* renamed from: nj.f */
public class C88955f {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m111057a() {
        /*
            java.lang.String r0 = "MicroMsg.CUtil"
            boolean r1 = m111058b()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 0
            r3 = 1
            r4 = 0
            android.os.StatFs r6 = new android.os.StatFs     // Catch:{ Exception -> 0x0030 }
            java.lang.String r7 = a70.C112760b.m154230f0()     // Catch:{ Exception -> 0x0030 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0030 }
            int r1 = r6.getBlockCount()     // Catch:{ Exception -> 0x002c }
            long r7 = (long) r1
            int r1 = r6.getAvailableBlocks()     // Catch:{ Exception -> 0x0029 }
            long r9 = (long) r1
            int r1 = r6.getBlockSize()     // Catch:{ Exception -> 0x0027 }
            long r11 = (long) r1
            goto L_0x0040
        L_0x0027:
            r1 = move-exception
            goto L_0x0036
        L_0x0029:
            r1 = move-exception
            r9 = r4
            goto L_0x0036
        L_0x002c:
            r1 = move-exception
            r7 = r4
            r9 = r7
            goto L_0x0036
        L_0x0030:
            r6 = move-exception
            r7 = r4
            r9 = r7
            r15 = r6
            r6 = r1
            r1 = r15
        L_0x0036:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r2] = r1
            java.lang.String r1 = "checkSDCardFull"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r11)
            r11 = r4
        L_0x0040:
            if (r6 != 0) goto L_0x0043
            return r2
        L_0x0043:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0048
            return r2
        L_0x0048:
            long r13 = r7 - r9
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x004f
            return r2
        L_0x004f:
            r4 = 100
            long r13 = r13 * r4
            long r13 = r13 / r7
            int r1 = (int) r13
            long r4 = r11 * r9
            long r13 = r11 * r7
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r2] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r6[r3] = r7
            r7 = 2
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r6[r7] = r8
            r7 = 3
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r6[r7] = r8
            r7 = 4
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            r6[r7] = r8
            r7 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r6[r7] = r8
            java.lang.String r7 = "checkSDCardFull blockCount: %d, availCount: %d, blockSize: %d, totalSize: %d, availSize: %d, used percent: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r6)
            r6 = 95
            if (r6 <= r1) goto L_0x008e
            return r2
        L_0x008e:
            r6 = 524288000(0x1f400000, double:2.590326893E-315)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.String r1 = "checkSDCardFull is full!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88955f.m111057a():boolean");
    }

    /* renamed from: b */
    public static boolean m111058b() {
        try {
            return new File(C112760b.m154230f0()).canWrite();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CUtil", e, "summer isSDCardAvail 1 e: " + e.getMessage() + " SDCARD_ROOT: " + C112760b.m154230f0(), new Object[0]);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m111059c(long r12) {
        /*
            boolean r0 = m111058b()
            java.lang.String r1 = "MicroMsg.CUtil"
            r2 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r12 = "summer isSDCardHaveEnoughSpace sdcard not avail and ret false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            return r2
        L_0x0010:
            r0 = 0
            r3 = 1
            r4 = 0
            android.os.StatFs r6 = new android.os.StatFs     // Catch:{ Exception -> 0x002d }
            java.lang.String r7 = a70.C112760b.m154230f0()     // Catch:{ Exception -> 0x002d }
            r6.<init>(r7)     // Catch:{ Exception -> 0x002d }
            int r0 = r6.getBlockCount()     // Catch:{ Exception -> 0x002a }
            long r7 = (long) r0
            int r0 = r6.getAvailableBlocks()     // Catch:{ Exception -> 0x0028 }
            long r9 = (long) r0
            goto L_0x003c
        L_0x0028:
            r0 = move-exception
            goto L_0x0032
        L_0x002a:
            r0 = move-exception
            r7 = r4
            goto L_0x0032
        L_0x002d:
            r6 = move-exception
            r7 = r4
            r11 = r6
            r6 = r0
            r0 = r11
        L_0x0032:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r0
            java.lang.String r0 = "isSDCardHaveEnoughSpace"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r9)
            r9 = r4
        L_0x003c:
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0044
            return r2
        L_0x0044:
            long r7 = r7 - r9
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            return r2
        L_0x004a:
            int r0 = r6.getBlockSize()
            long r4 = (long) r0
            int r0 = r6.getFreeBlocks()
            long r6 = (long) r0
            long r4 = r4 * r6
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "summer isSDCardHaveEnoughSpace needSize: "
            r0.append(r3)
            r0.append(r12)
            java.lang.String r12 = " not enough and ret false"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            return r2
        L_0x0075:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88955f.m111059c(long):boolean");
    }
}
