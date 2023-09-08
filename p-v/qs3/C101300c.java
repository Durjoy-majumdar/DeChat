package qs3;

import com.tencent.qbar.ScanIdentifyReportInfo;

/* renamed from: qs3.c */
public final class C101300c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanIdentifyReportInfo f296779d;

    /* renamed from: e */
    public final /* synthetic */ String f296780e;

    public C101300c(ScanIdentifyReportInfo scanIdentifyReportInfo, String str) {
        this.f296779d = scanIdentifyReportInfo;
        this.f296780e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if ((r1.length() > 0) == true) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.tencent.qbar.ScanIdentifyReportInfo r0 = r12.f296779d
            java.lang.String r1 = r0.f285787f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            if (r1 != r2) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            java.lang.String r1 = "MicroMsg.ScanIdentifyReportInfo"
            r4 = 0
            if (r2 == 0) goto L_0x0022
            java.lang.String r0 = r0.f285787f
            r2 = -1
            byte[] r0 = wl2.C102461j.m135248b(r0, r3, r2, r4)
            goto L_0x0063
        L_0x0022:
            android.graphics.Point r2 = r0.f285786e     // Catch:{ Exception -> 0x0055 }
            if (r2 != 0) goto L_0x0027
            goto L_0x0062
        L_0x0027:
            byte[] r6 = r0.f285785d     // Catch:{ Exception -> 0x0055 }
            if (r6 != 0) goto L_0x002c
            goto L_0x0062
        L_0x002c:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0055 }
            r0.<init>()     // Catch:{ Exception -> 0x0055 }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x0055 }
            int r5 = r2.x     // Catch:{ Exception -> 0x0055 }
            int r2 = r2.y     // Catch:{ Exception -> 0x0055 }
            r11.<init>(r3, r3, r5, r2)     // Catch:{ Exception -> 0x0055 }
            android.graphics.YuvImage r2 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x0055 }
            r7 = 17
            int r8 = r11.width()     // Catch:{ Exception -> 0x0055 }
            int r9 = r11.height()     // Catch:{ Exception -> 0x0055 }
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0055 }
            r5 = 30
            r2.compressToJpeg(r11, r5, r0)     // Catch:{ Exception -> 0x0055 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0063
        L_0x0055:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r5, r2)
            java.lang.String r0 = "failed create preview jpeg data"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0062:
            r0 = r4
        L_0x0063:
            java.lang.String r2 = r12.f296780e
            if (r2 == 0) goto L_0x007d
            if (r0 != 0) goto L_0x006a
            goto L_0x007d
        L_0x006a:
            com.tencent.mm.plugin.scanner.model.q r1 = new com.tencent.mm.plugin.scanner.model.q
            pe3.b r4 = new pe3.b
            int r5 = r0.length
            r4.<init>(r0, r3, r5)
            r1.<init>(r2, r4)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r1)
            return
        L_0x007d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "result: "
            r2.append(r3)
            java.lang.String r3 = r12.f296780e
            r2.append(r3)
            java.lang.String r3 = ", img: "
            r2.append(r3)
            if (r0 == 0) goto L_0x0099
            int r0 = r0.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0099:
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qs3.C101300c.run():void");
    }
}
