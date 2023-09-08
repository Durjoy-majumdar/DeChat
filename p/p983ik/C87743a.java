package p983ik;

import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;

/* renamed from: ik.a */
public class C87743a {

    /* renamed from: a */
    public static int f254037a = -1;

    /* renamed from: b */
    public static final long[] f254038b = {17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L};

    /* renamed from: c */
    public static final long[] f254039c = {DownloadHelper.SAVE_LENGTH, 314572800, 314572800, 314572800, 314572800};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m109162a() {
        /*
            java.lang.String r0 = "MicroMsg.DbChecker"
            r1 = 0
            android.os.StatFs r3 = new android.os.StatFs     // Catch:{ Exception -> 0x0039 }
            java.io.File r4 = p206nj.C88956h.m111060a()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r4 = r4.getPath()     // Catch:{ Exception -> 0x0039 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0039 }
            int r4 = r3.getAvailableBlocks()     // Catch:{ Exception -> 0x0039 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x0039 }
            int r6 = r3.getBlockSize()     // Catch:{ Exception -> 0x0039 }
            long r6 = (long) r6
            long r4 = r4 * r6
            int r6 = r3.getBlockCount()     // Catch:{ Exception -> 0x003a }
            long r6 = (long) r6     // Catch:{ Exception -> 0x003a }
            int r8 = r3.getBlockSize()     // Catch:{ Exception -> 0x003a }
            long r8 = (long) r8     // Catch:{ Exception -> 0x003a }
            long r6 = r6 * r8
            int r8 = r3.getFreeBlocks()     // Catch:{ Exception -> 0x003a }
            long r8 = (long) r8     // Catch:{ Exception -> 0x003a }
            int r3 = r3.getBlockSize()     // Catch:{ Exception -> 0x003a }
            long r10 = (long) r3
            long r8 = r8 * r10
            double r10 = (double) r4
            double r12 = (double) r6
            double r10 = r10 / r12
            goto L_0x0043
        L_0x0039:
            r4 = r1
        L_0x003a:
            java.lang.String r3 = "get db spare space error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            r10 = 0
            r6 = r1
            r8 = r6
        L_0x0043:
            r3 = 5
            r12 = 4
            r13 = 2
            r14 = 1
            r15 = 0
            int r16 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r16 <= 0) goto L_0x0078
            r1 = 52428800(0x3200000, double:2.5903269E-316)
            int r16 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r16 >= 0) goto L_0x0055
            r1 = 2
            goto L_0x0079
        L_0x0055:
            int r1 = f254037a
            if (r1 >= 0) goto L_0x006c
            f254037a = r12
            r1 = 0
        L_0x005c:
            long[] r2 = f254038b
            if (r1 >= r3) goto L_0x006c
            r16 = r2[r1]
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0069
            f254037a = r1
            goto L_0x006c
        L_0x0069:
            int r1 = r1 + 1
            goto L_0x005c
        L_0x006c:
            long[] r1 = f254039c
            int r2 = f254037a
            r16 = r1[r2]
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0078
            r1 = 1
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
            r2[r15] = r16
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2[r14] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r2[r13] = r4
            r4 = 3
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r2[r4] = r5
            java.lang.Double r4 = java.lang.Double.valueOf(r10)
            r2[r12] = r4
            int r4 = f254037a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r3 = "checkRomSparespace[%d] available:%d all:%d freeSize :%d availPercent %f mobileSizeIndex %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p983ik.C87743a.m109162a():int");
    }
}
