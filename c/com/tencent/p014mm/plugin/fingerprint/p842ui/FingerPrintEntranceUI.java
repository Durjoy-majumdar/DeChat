package com.tencent.p014mm.plugin.fingerprint.p842ui;

import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI */
public class FingerPrintEntranceUI extends WalletBaseUI {

    /* renamed from: d */
    public static final /* synthetic */ int f198212d = 0;

    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            java.lang.String r8 = "MicroMsg.FingerPrintEntranceUI"
            java.lang.String r0 = "onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_HWFPMANAGER_BOOLEAN_SYNC
            java.lang.Class<tt1.i> r0 = tt1.C78101i.class
            java.lang.Class<yz.v> r1 = p281yz.C79173v.class
            java.lang.String r2 = "MicroMsg.FingerPrintUtil"
            java.lang.String r3 = "isShowFPSettingGuide"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            boolean r3 = st1.C48462m.m53817a()
            java.lang.String r4 = "will call showSetFingerPrintGuide()"
            r10 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002a
            java.lang.String r0 = "the fingerprint is open ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x00b1
        L_0x002a:
            k40.a r3 = f40.C86709a0.m107533q(r0)
            tt1.i r3 = (tt1.C78101i) r3
            int r6 = r3.fr0()
            if (r6 != r10) goto L_0x0042
            boolean r3 = r3.mo108079gv()
            if (r3 == 0) goto L_0x0042
            java.lang.String r0 = "device is not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x00b1
        L_0x0042:
            di3.d r3 = di3.C86312j.m106911c(r1)
            yz.v r3 = (p281yz.C79173v) r3
            b63.s0 r3 = r3.Ex0()
            boolean r3 = r3.mo91343y()
            if (r3 != 0) goto L_0x00ab
            di3.d r3 = di3.C86312j.m106911c(r1)
            yz.v r3 = (p281yz.C79173v) r3
            b63.s0 r3 = r3.Ex0()
            boolean r3 = r3.mo91342x()
            if (r3 == 0) goto L_0x0063
            goto L_0x00ab
        L_0x0063:
            di3.d r1 = di3.C86312j.m106911c(r1)
            yz.v r1 = (p281yz.C79173v) r1
            b63.s0 r1 = r1.Ex0()
            b63.q0 r1 = r1.mo91334p()
            boolean r1 = r1.mo91308h()
            if (r1 != 0) goto L_0x007d
            java.lang.String r0 = "isSupportTouchPay is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x00b1
        L_0x007d:
            k40.a r0 = f40.C86709a0.m107533q(r0)
            tt1.i r0 = (tt1.C78101i) r0
            boolean r0 = r0.mo108074Qk()
            if (r0 != 0) goto L_0x00b1
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r9, r1)
            if (r0 == 0) goto L_0x00a3
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            if (r0 != 0) goto L_0x00b1
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r0 = 1
            goto L_0x00b2
        L_0x00ab:
            java.lang.String r0 = "user had not reg wxpay"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            r1 = 2131821426(0x7f110372, float:1.9275595E38)
            if (r0 == 0) goto L_0x010f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            java.lang.String r0 = "hy: has standard action starting to fingerprint setting"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            android.content.res.Resources r0 = r12.getResources()
            r2 = 2131837572(0x7f114284, float:1.9308343E38)
            java.lang.String r2 = r0.getString(r2)
            android.content.res.Resources r0 = r12.getResources()
            java.lang.Class<vt1.a> r3 = vt1.C78473a.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            vt1.a r3 = (vt1.C78473a) r3
            boolean r3 = r3.mo107904BE()
            if (r3 == 0) goto L_0x00e0
            r3 = 2131822911(0x7f11093f, float:1.9278607E38)
            goto L_0x00e3
        L_0x00e0:
            r3 = 2131821617(0x7f110431, float:1.9275982E38)
        L_0x00e3:
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = r12.getString(r1)
            r5 = 1
            wt1.t r6 = new wt1.t
            r6.<init>(r12)
            wt1.u r7 = new wt1.u
            r7.<init>(r12)
            java.lang.String r11 = ""
            r0 = r12
            r1 = r2
            r2 = r11
            nj3.C76879j.m92709C(r0, r1, r2, r3, r4, r5, r6, r7)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.mo119677K(r9, r1)
            goto L_0x0173
        L_0x010f:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_BOOLEAN_SYNC
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r9, r2)
            if (r0 == 0) goto L_0x012b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x012c
        L_0x012b:
            r0 = 0
        L_0x012c:
            if (r0 != 0) goto L_0x0172
            java.lang.String r0 = "will showOpenFingerPrintPayGuide()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            android.content.res.Resources r0 = r12.getResources()
            r2 = 2131837571(0x7f114283, float:1.930834E38)
            java.lang.String r2 = r0.getString(r2)
            android.content.res.Resources r0 = r12.getResources()
            r3 = 2131822909(0x7f11093d, float:1.9278603E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = r12.getString(r1)
            wt1.v r6 = new wt1.v
            r6.<init>(r12)
            wt1.w r7 = new wt1.w
            r7.<init>(r12)
            r5 = 1
            java.lang.String r11 = ""
            r0 = r12
            r1 = r2
            r2 = r11
            nj3.C76879j.m92709C(r0, r1, r2, r3, r4, r5, r6, r7)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.mo119677K(r9, r1)
            goto L_0x0173
        L_0x0172:
            r10 = 0
        L_0x0173:
            if (r10 != 0) goto L_0x017d
            java.lang.String r0 = "finish FingerPrintEntranceUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r12.finish()
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintEntranceUI.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
