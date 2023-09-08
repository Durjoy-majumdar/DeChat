package nb1;

import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceAgreementUI;
import ie3.C76324c;

public final /* synthetic */ class j$$a implements C76324c.C76325a {

    /* renamed from: a */
    public final /* synthetic */ FaceAgreementUI f32920a;

    public /* synthetic */ j$$a(FaceAgreementUI faceAgreementUI) {
        this.f32920a = faceAgreementUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r5.equals("cancel") != false) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5281a(android.content.Intent r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI r2 = r0.f32920a
            r2.getClass()
            java.lang.String r3 = "MicroMsg.FaceAgreementUI"
            java.lang.String r4 = "onKindaBackResult"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            if (r1 != 0) goto L_0x001d
            java.lang.String r1 = "resultData == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            r2.mo2183I7()
            goto L_0x00ee
        L_0x001d:
            r4 = 90024(0x15fa8, float:1.2615E-40)
            int r4 = com.tencent.p014mm.plugin.facedetect.model.C2271r.m2060a(r4)
            java.lang.String r5 = "error_code"
            int r4 = r1.getIntExtra(r5, r4)
            java.lang.String r5 = "error_msg"
            java.lang.String r5 = r1.getStringExtra(r5)
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r10 = 1
            r7[r10] = r9
            java.lang.String r9 = "errorMsg：%s errorCode：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 == 0) goto L_0x004d
            r2.mo2183I7()
            goto L_0x00ee
        L_0x004d:
            int r7 = r5.hashCode()
            r9 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
            java.lang.String r11 = "fail"
            if (r7 == r9) goto L_0x0074
            r6 = 3548(0xddc, float:4.972E-42)
            if (r7 == r6) goto L_0x006a
            r6 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r7 == r6) goto L_0x0062
            goto L_0x007d
        L_0x0062:
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x007d
            r6 = 1
            goto L_0x007e
        L_0x006a:
            java.lang.String r6 = "ok"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x007d
            r6 = 0
            goto L_0x007e
        L_0x0074:
            java.lang.String r7 = "cancel"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r6 = -1
        L_0x007e:
            if (r6 == 0) goto L_0x00b6
            if (r6 == r10) goto L_0x0086
            r2.mo2183I7()
            goto L_0x00ee
        L_0x0086:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "err_msg"
            r1.putExtra(r3, r11)
            java.lang.String r3 = "err_code"
            r5 = 90114(0x16002, float:1.26277E-40)
            if (r4 != r5) goto L_0x00a6
            r1.putExtra(r3, r5)
            java.lang.String r3 = "click_other_verify_btn_front"
            java.lang.String r4 = "yes"
            r1.putExtra(r3, r4)
            au1.C0222b.m169h(r5)
            goto L_0x00af
        L_0x00a6:
            r4 = 90110(0x15ffe, float:1.26271E-40)
            r1.putExtra(r3, r4)
            au1.C0222b.m169h(r4)
        L_0x00af:
            r2.setResult(r10, r1)
            r2.finish()
            goto L_0x00ee
        L_0x00b6:
            java.lang.String r4 = "go to face recognize"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 917(0x395, double:4.53E-321)
            r14 = 65
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI> r4 = com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI.class
            r3.<init>(r2, r4)
            android.content.Intent r4 = r2.getIntent()
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L_0x00dc
            r3.putExtras(r4)
        L_0x00dc:
            java.lang.String r4 = "need_show_protocal"
            int r1 = r1.getIntExtra(r4, r8)
            if (r1 != r10) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r8 = 1
        L_0x00e6:
            java.lang.String r1 = "needContract"
            r3.putExtra(r1, r8)
            r2.startActivityForResult((android.content.Intent) r3, (int) r10)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb1.j$$a.mo5281a(android.content.Intent):void");
    }
}
