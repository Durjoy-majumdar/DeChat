package com.tencent.p014mm.wallet_core.p137ui;

import yq3.C79143a;

/* renamed from: com.tencent.mm.wallet_core.ui.a0 */
public class C75190a0 {

    /* renamed from: a */
    public static int f221224a;

    /* renamed from: b */
    public static int f221225b;

    /* renamed from: c */
    public static String f221226c;

    /* renamed from: a */
    public static void m90155a(WalletBaseUI walletBaseUI) {
        if (f221224a == 1000) {
            int i = f221225b;
            if (i == 1) {
                if (!walletBaseUI.onProgressFinish()) {
                    walletBaseUI.setContentViewVisibility(0);
                }
                walletBaseUI.cleanUiData(0);
            } else if (i == 3) {
                C79143a.m95764c(walletBaseUI.getContext(), walletBaseUI.getInput(), f221225b);
            } else if (walletBaseUI.isTransparent() || walletBaseUI.getContentViewVisibility() != 0) {
                walletBaseUI.finish();
            } else {
                walletBaseUI.cleanUiData(0);
            }
        } else {
            C79143a.m95763b(walletBaseUI.getContext(), f221225b);
        }
        f221224a = 0;
        f221225b = 0;
        f221226c = null;
    }
}
