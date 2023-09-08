package wd3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ic0.C21068c;
import jc0.C21210b;

/* renamed from: wd3.r */
public class C22908r implements C21068c {

    /* renamed from: a */
    public int f65866a;

    public C22908r() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A[Catch:{ Exception -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0115 A[Catch:{ Exception -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144 A[Catch:{ Exception -> 0x0151 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jc0.C21210b mo32789a(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "MicroMsg.ChattingBizImgDownloader"
            java.lang.String r6 = "get image data from url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r3)
            r3 = 2
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0151 }
            wd3.k r8 = wd3.C22900k.f65834a     // Catch:{ Exception -> 0x0151 }
            wd3.n r9 = new wd3.n     // Catch:{ Exception -> 0x0151 }
            int r10 = r1.f65866a     // Catch:{ Exception -> 0x0151 }
            r9.<init>(r10)     // Catch:{ Exception -> 0x0151 }
            jc0.b r8 = r8.mo36077a(r0, r4, r9)     // Catch:{ Exception -> 0x0151 }
            if (r8 == 0) goto L_0x0150
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0151 }
            long r6 = r9 - r6
            java.lang.String r9 = "alvinluo BizImage download responseContentType: %s, contentLength: %d, dataLength: %d, url: %s, download used %d ms"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0151 }
            java.lang.String r11 = r8.f59989e     // Catch:{ Exception -> 0x0151 }
            r10[r4] = r11     // Catch:{ Exception -> 0x0151 }
            int r11 = r8.f59990f     // Catch:{ Exception -> 0x0151 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0151 }
            r10[r2] = r11     // Catch:{ Exception -> 0x0151 }
            byte[] r11 = r8.f59987c     // Catch:{ Exception -> 0x0151 }
            if (r11 == 0) goto L_0x0042
            int r11 = r11.length     // Catch:{ Exception -> 0x0151 }
            goto L_0x0043
        L_0x0042:
            r11 = -1
        L_0x0043:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0151 }
            r10[r3] = r11     // Catch:{ Exception -> 0x0151 }
            r11 = 3
            r10[r11] = r0     // Catch:{ Exception -> 0x0151 }
            r11 = 4
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0151 }
            r10[r11] = r12     // Catch:{ Exception -> 0x0151 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r10)     // Catch:{ Exception -> 0x0151 }
            wd3.j r9 = wd3.C118762j.f355306a     // Catch:{ Exception -> 0x0151 }
            java.lang.String r10 = r8.f59989e     // Catch:{ Exception -> 0x0151 }
            boolean r11 = p248ug.C102027b.m134390e()     // Catch:{ Exception -> 0x0151 }
            if (r11 == 0) goto L_0x006e
            boolean r10 = r9.mo183491d(r10)     // Catch:{ Exception -> 0x0151 }
            if (r10 == 0) goto L_0x006e
            boolean r10 = p248ug.C102027b.m134391f(r20)     // Catch:{ Exception -> 0x0151 }
            if (r10 == 0) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 == 0) goto L_0x00f5
            byte[] r6 = r8.f59987c     // Catch:{ Exception -> 0x0151 }
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = "response.data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)     // Catch:{ Exception -> 0x0151 }
            r19.mo36088b()     // Catch:{ Exception -> 0x0151 }
            jc0.b r0 = r19.mo36089c(r20)     // Catch:{ Exception -> 0x0151 }
            return r0
        L_0x0083:
            int r7 = r8.f59990f     // Catch:{ Exception -> 0x0151 }
            if (r7 <= 0) goto L_0x0092
            int r6 = r6.length     // Catch:{ Exception -> 0x0151 }
            if (r7 == r6) goto L_0x0092
            r19.mo36088b()     // Catch:{ Exception -> 0x0151 }
            jc0.b r0 = r19.mo36089c(r20)     // Catch:{ Exception -> 0x0151 }
            return r0
        L_0x0092:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0151 }
            r6.<init>()     // Catch:{ Exception -> 0x0151 }
            r6.inJustDecodeBounds = r2     // Catch:{ Exception -> 0x0151 }
            byte[] r7 = r8.f59987c     // Catch:{ Exception -> 0x0151 }
            int r10 = r7.length     // Catch:{ Exception -> 0x0151 }
            com.tencent.p014mm.graphics.MMBitmapFactory.m98733b(r7, r4, r10, r6)     // Catch:{ Exception -> 0x0151 }
            int r7 = r6.outHeight     // Catch:{ Exception -> 0x0151 }
            if (r7 < r2) goto L_0x00cf
            int r6 = r6.outWidth     // Catch:{ Exception -> 0x0151 }
            if (r6 >= r2) goto L_0x00a8
            goto L_0x00cf
        L_0x00a8:
            int r0 = r1.f65866a     // Catch:{ Exception -> 0x0151 }
            boolean r0 = r9.mo183488a(r0)     // Catch:{ Exception -> 0x0151 }
            if (r0 == 0) goto L_0x00c8
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0151 }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0151 }
            r0[r4] = r6     // Catch:{ Exception -> 0x0151 }
            java.lang.String r6 = "MicroMsg.BizImageDownloadReporter"
            java.lang.String r7 = "alvinluo reportWxPicDataValid valid: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r7, r0)     // Catch:{ Exception -> 0x0151 }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0151 }
            r12 = 9
            r14 = 1
            r10 = 1111(0x457, double:5.49E-321)
            r9.mo175913w(r10, r12, r14)     // Catch:{ Exception -> 0x0151 }
        L_0x00c8:
            java.lang.String r0 = "decode wxpic success"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)     // Catch:{ Exception -> 0x0151 }
            goto L_0x0150
        L_0x00cf:
            java.lang.String r6 = "decode wxpic fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r6 = r8.f59989e     // Catch:{ Exception -> 0x0151 }
            int r7 = r1.f65866a     // Catch:{ Exception -> 0x0151 }
            boolean r7 = r9.mo183488a(r7)     // Catch:{ Exception -> 0x0151 }
            if (r7 == 0) goto L_0x00e3
            wd3.i r7 = wd3.C22899i.f65833a     // Catch:{ Exception -> 0x0151 }
            r7.mo36072b(r6, r4)     // Catch:{ Exception -> 0x0151 }
        L_0x00e3:
            boolean r6 = r9.mo183491d(r6)     // Catch:{ Exception -> 0x0151 }
            if (r6 == 0) goto L_0x00f0
            wd3.i r6 = wd3.C22899i.f65833a     // Catch:{ Exception -> 0x0151 }
            int r7 = r1.f65866a     // Catch:{ Exception -> 0x0151 }
            r6.mo36076f(r0, r3, r2, r7)     // Catch:{ Exception -> 0x0151 }
        L_0x00f0:
            jc0.b r0 = r19.mo36089c(r20)     // Catch:{ Exception -> 0x0151 }
            return r0
        L_0x00f5:
            java.lang.String r9 = r8.f59989e     // Catch:{ Exception -> 0x0151 }
            boolean r10 = com.tencent.p014mm.modelimage.C92856r0.m117121g()     // Catch:{ Exception -> 0x0151 }
            if (r10 == 0) goto L_0x0120
            if (r9 == 0) goto L_0x0108
            int r10 = r9.length()     // Catch:{ Exception -> 0x0151 }
            if (r10 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r10 = 0
            goto L_0x0109
        L_0x0108:
            r10 = 1
        L_0x0109:
            if (r10 != 0) goto L_0x0115
            java.lang.String r10 = "image/webp"
            boolean r9 = gy3.C87412m.m108589b(r9, r10)     // Catch:{ Exception -> 0x0151 }
            if (r9 == 0) goto L_0x0115
            r9 = 1
            goto L_0x0116
        L_0x0115:
            r9 = 0
        L_0x0116:
            if (r9 == 0) goto L_0x0120
            boolean r0 = p248ug.C102027b.m134392g(r20)     // Catch:{ Exception -> 0x0151 }
            if (r0 == 0) goto L_0x0120
            r0 = 1
            goto L_0x0121
        L_0x0120:
            r0 = 0
        L_0x0121:
            java.lang.String r9 = "getImageData, isDownloadWebp: %b, used %d ms"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0151 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0151 }
            r10[r4] = r11     // Catch:{ Exception -> 0x0151 }
            java.lang.Long r11 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0151 }
            r10[r2] = r11     // Catch:{ Exception -> 0x0151 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r10)     // Catch:{ Exception -> 0x0151 }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0151 }
            r12 = 86
            r14 = 4
            r18 = 0
            r11 = r9
            r16 = r6
            r11.idkeyStat(r12, r14, r16, r18)     // Catch:{ Exception -> 0x0151 }
            if (r0 == 0) goto L_0x0150
            r12 = 86
            r14 = 17
            r18 = 0
            r11 = r9
            r16 = r6
            r11.idkeyStat(r12, r14, r16, r18)     // Catch:{ Exception -> 0x0151 }
        L_0x0150:
            return r8
        L_0x0151:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            r2[r4] = r0
            java.lang.String r0 = "get image data failed.:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
            jc0.b r0 = new jc0.b
            r2 = 0
            r0.<init>((byte[]) r2, (int) r3, (java.lang.String) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wd3.C22908r.mo32789a(java.lang.String):jc0.b");
    }

    /* renamed from: b */
    public final void mo36088b() {
        if (C118762j.f355306a.mo183488a(this.f65866a)) {
            Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportWxPicDataValid valid: %b", false);
            C115669n.INSTANCE.mo175913w(1111, 10, 1);
        }
    }

    /* renamed from: c */
    public final C21210b mo36089c(String str) {
        Log.m105924i("MicroMsg.ChattingBizImgDownloader", "alvinluo tryToGetNormalImage after get WxPic failed");
        Log.m105919d("MicroMsg.ChattingBizImgDownloader", "getNormalImageData from url:%s", str);
        try {
            System.currentTimeMillis();
            C21210b a = C22900k.f65834a.mo36077a(str, true, new C22903n(this.f65866a));
            if (a == null) {
                return a;
            }
            System.currentTimeMillis();
            return a;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ChattingBizImgDownloader", "get image data failed.:%s", e.toString());
            return new C21210b((byte[]) null, 2, (String) null);
        }
    }

    public C22908r(int i) {
        this.f65866a = i;
    }
}
