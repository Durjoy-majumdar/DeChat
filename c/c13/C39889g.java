package c13;

import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: c13.g */
public class C39889g extends C79913b {

    /* renamed from: d */
    public long f106948d = -1;

    /* renamed from: e */
    public long f106949e = -1;

    /* renamed from: f */
    public long f106950f = -1;

    /* renamed from: g */
    public long f106951g = -1;

    /* renamed from: h */
    public long f106952h = 0;

    /* renamed from: i */
    public long f106953i = 0;

    /* renamed from: j */
    public long f106954j = 0;

    /* renamed from: k */
    public long f106955k = 0;

    /* renamed from: l */
    public final C86009m1 f106956l;

    public C39889g() {
        C86009m1 m1Var = new C86009m1("/proc/net/xt_qtaguid/stats");
        this.f106956l = !m1Var.mo119978p() ? null : m1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d9, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00dd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd A[ExcHandler: all (th java.lang.Throwable), PHI: r16 
      PHI: (r16v6 java.io.BufferedReader) = (r16v4 java.io.BufferedReader), (r16v4 java.io.BufferedReader), (r16v8 java.io.BufferedReader), (r16v8 java.io.BufferedReader) binds: [B:44:0x0099, B:33:0x0081, B:14:0x0043, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE], Splitter:B:14:0x0043] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17893k() {
        /*
            r21 = this;
            r1 = r21
            r0 = 0
            r4 = 0
            com.tencent.mm.vfs.m1 r5 = r1.f106956l     // Catch:{ Exception -> 0x00f1 }
            r6 = 1
            if (r5 == 0) goto L_0x00ea
            int r5 = android.os.Process.myUid()     // Catch:{ Exception -> 0x00f1 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00f1 }
            com.tencent.mm.vfs.t1 r8 = new com.tencent.mm.vfs.t1     // Catch:{ Exception -> 0x00f1 }
            com.tencent.mm.vfs.m1 r9 = r1.f106956l     // Catch:{ Exception -> 0x00f1 }
            r8.<init>((com.tencent.p014mm.vfs.C86009m1) r9)     // Catch:{ Exception -> 0x00f1 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00f1 }
            r7.readLine()     // Catch:{ Exception -> 0x00e5, all -> 0x00df }
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
        L_0x0024:
            java.lang.String r4 = r7.readLine()     // Catch:{ Exception -> 0x00e5, all -> 0x00df }
            if (r4 == 0) goto L_0x0077
            java.lang.String r2 = "[ :\\t]+"
            java.lang.String[] r2 = r4.split(r2)     // Catch:{ Exception -> 0x00e5, all -> 0x00df }
            r3 = 3
            r3 = r2[r3]     // Catch:{ Exception -> 0x00e5, all -> 0x00df }
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r0)     // Catch:{ Exception -> 0x00e5, all -> 0x00df }
            if (r3 == r5) goto L_0x003a
            goto L_0x0024
        L_0x003a:
            r3 = r2[r6]     // Catch:{ Exception -> 0x00e5, all -> 0x00df }
            r4 = 5
            r4 = r2[r4]     // Catch:{ Exception -> 0x00e5, all -> 0x00df }
            r16 = r7
            r6 = 0
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r6)     // Catch:{ Exception -> 0x0074, all -> 0x00dd }
            r4 = 7
            r2 = r2[r4]     // Catch:{ Exception -> 0x0074, all -> 0x00dd }
            long r19 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r6)     // Catch:{ Exception -> 0x0074, all -> 0x00dd }
            java.lang.String r2 = "rmnet"
            boolean r2 = r3.startsWith(r2)     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            if (r2 != 0) goto L_0x006c
            java.lang.String r2 = "ccmni"
            boolean r2 = r3.startsWith(r2)     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            if (r2 == 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            java.lang.String r2 = "lo"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            if (r2 != 0) goto L_0x0070
            long r12 = r12 + r17
            long r14 = r14 + r19
            goto L_0x0070
        L_0x006c:
            long r8 = r8 + r17
            long r10 = r10 + r19
        L_0x0070:
            r7 = r16
            r6 = 1
            goto L_0x0024
        L_0x0074:
            r2 = r6
            goto L_0x00da
        L_0x0077:
            r16 = r7
            long r2 = r1.f106949e     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0083
            r1.f106949e = r8     // Catch:{ Exception -> 0x00d9, all -> 0x00dd }
        L_0x0083:
            long r2 = r1.f106948d     // Catch:{ Exception -> 0x00d9, all -> 0x00dd }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x008b
            r1.f106948d = r10     // Catch:{ Exception -> 0x00d9, all -> 0x00dd }
        L_0x008b:
            long r2 = r1.f106951g     // Catch:{ Exception -> 0x00d9, all -> 0x00dd }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0093
            r1.f106951g = r12     // Catch:{ Exception -> 0x00d9, all -> 0x00dd }
        L_0x0093:
            long r2 = r1.f106950f     // Catch:{ Exception -> 0x00d9, all -> 0x00dd }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x009b
            r1.f106950f = r14     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
        L_0x009b:
            long r2 = r1.f106948d     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00a4
            long r2 = r10 - r2
            goto L_0x00a5
        L_0x00a4:
            r2 = r10
        L_0x00a5:
            r1.f106952h = r2     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            long r2 = r1.f106949e     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00b0
            long r2 = r8 - r2
            goto L_0x00b1
        L_0x00b0:
            r2 = r8
        L_0x00b1:
            r1.f106953i = r2     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            long r2 = r1.f106950f     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00bc
            long r2 = r14 - r2
            goto L_0x00bd
        L_0x00bc:
            r2 = r14
        L_0x00bd:
            r1.f106954j = r2     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            long r2 = r1.f106951g     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00c8
            long r2 = r12 - r2
            goto L_0x00c9
        L_0x00c8:
            r2 = r12
        L_0x00c9:
            r1.f106955k = r2     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            r1.f106948d = r10     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            r1.f106949e = r8     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            r1.f106950f = r14     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            r1.f106951g = r12     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r16)     // Catch:{ Exception -> 0x00e7, all -> 0x00dd }
            r4 = r16
            goto L_0x00ea
        L_0x00d9:
            r2 = r4
        L_0x00da:
            r4 = r16
            goto L_0x00f3
        L_0x00dd:
            r0 = move-exception
            goto L_0x00e2
        L_0x00df:
            r0 = move-exception
            r16 = r7
        L_0x00e2:
            r4 = r16
            goto L_0x0109
        L_0x00e5:
            r16 = r7
        L_0x00e7:
            r4 = r16
            goto L_0x00f1
        L_0x00ea:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            r0 = 1
            return r0
        L_0x00ef:
            r0 = move-exception
            goto L_0x0109
        L_0x00f1:
            r2 = 0
        L_0x00f3:
            r1.f106952h = r2     // Catch:{ all -> 0x00ef }
            r1.f106953i = r2     // Catch:{ all -> 0x00ef }
            r1.f106954j = r2     // Catch:{ all -> 0x00ef }
            r1.f106955k = r2     // Catch:{ all -> 0x00ef }
            r2 = -1
            r1.f106948d = r2     // Catch:{ all -> 0x00ef }
            r1.f106949e = r2     // Catch:{ all -> 0x00ef }
            r1.f106950f = r2     // Catch:{ all -> 0x00ef }
            r1.f106951g = r2     // Catch:{ all -> 0x00ef }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            return r0
        L_0x0109:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c13.C39889g.mo17893k():boolean");
    }

    /* renamed from: l */
    public long mo17894l(long j) {
        return Math.max(this.f106953i, j);
    }

    /* renamed from: m */
    public long mo17895m(long j) {
        return Math.max(this.f106955k, j);
    }

    /* renamed from: n */
    public long mo17896n(long j) {
        return Math.max(this.f106954j, j);
    }

    /* renamed from: o */
    public long mo17897o(long j) {
        return Math.max(this.f106952h, j);
    }
}
