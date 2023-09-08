package com.tencent.kinda.framework.widget.tools;

public class KindaWcKeyboardHelpr {
    private static String TAG = "MicroMsg.KindaWcKeyboardHelper";

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard bind(com.tencent.p014mm.framework.app.UIPageFragmentActivity r10, com.tencent.kinda.framework.widget.base.MMKEditText r11, java.lang.String r12, com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener r13) {
        /*
            java.lang.String r0 = ""
            com.tenpay.android.wechat.TenpaySecureEditText r9 = r11.getEditText()
            r1 = 0
            r2 = 0
            androidx.fragment.app.Fragment r3 = androidx.fragment.app.FragmentManager.findFragment(r9)     // Catch:{ Exception -> 0x0013 }
            boolean r4 = r3 instanceof com.tencent.kinda.framework.widget.base.BaseFragment     // Catch:{ Exception -> 0x0013 }
            if (r4 == 0) goto L_0x0022
            com.tencent.kinda.framework.widget.base.BaseFragment r3 = (com.tencent.kinda.framework.widget.base.BaseFragment) r3     // Catch:{ Exception -> 0x0013 }
            goto L_0x0023
        L_0x0013:
            r3 = move-exception
            java.lang.String r4 = TAG
            java.lang.String r5 = "error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            java.lang.String r4 = TAG
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r0, r5)
        L_0x0022:
            r3 = r2
        L_0x0023:
            if (r3 != 0) goto L_0x002b
            com.tencent.kinda.framework.widget.base.FrLifeController r3 = r10.f195308f
            com.tencent.kinda.framework.widget.base.BaseFragment r3 = r3.getCurrent()
        L_0x002b:
            r7 = r3
            int r3 = com.tencent.kinda.framework.C67448R.C67449id.lkw
            android.view.View r4 = r7.findViewById(r3)
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r4 = (com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard) r4
            if (r4 == 0) goto L_0x003f
            java.lang.String r0 = TAG
            java.lang.String r1 = "has exist keyboard"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x003d:
            r0 = r4
            goto L_0x007a
        L_0x003f:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x004b
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r0 = new com.tencent.mm.wallet_core.keyboard.WcPayKeyboard
            r0.<init>((android.content.Context) r10, (boolean) r1)
            goto L_0x0050
        L_0x004b:
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r0 = new com.tencent.mm.wallet_core.keyboard.WcPayKeyboard
            r0.<init>(r10)
        L_0x0050:
            r4 = r0
            r4.setId(r3)
            int r0 = com.tencent.kinda.framework.C67448R.C67449id.br4
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 != 0) goto L_0x0066
            java.lang.String r10 = TAG
            java.lang.String r11 = "can not find content layout"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)
            return r2
        L_0x0066:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r2 = 80
            r1.gravity = r2
            r0.addView(r4, r1)
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x003d
        L_0x007a:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x0083
            r0.setActionText(r12)
        L_0x0083:
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90251i0(r9)
            com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr$1 r12 = new com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr$1
            r1 = r12
            r2 = r10
            r3 = r0
            r4 = r13
            r5 = r7
            r6 = r9
            r8 = r11
            r1.<init>(r3, r4, r5, r6, r7, r8)
            r9.setOnFocusChangeListener(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr.bind(com.tencent.mm.framework.app.UIPageFragmentActivity, com.tencent.kinda.framework.widget.base.MMKEditText, java.lang.String, com.tencent.kinda.framework.widget.base.BaseFrActivity$IWalletTenpayKBStateCallBackListener):com.tencent.mm.wallet_core.keyboard.WcPayKeyboard");
    }
}
