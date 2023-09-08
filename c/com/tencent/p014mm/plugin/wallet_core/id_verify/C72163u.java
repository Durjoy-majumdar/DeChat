package com.tencent.p014mm.plugin.wallet_core.id_verify;

import androidx.lifecycle.C0120a0;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.u */
public class C72163u implements C0120a0<String> {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209329d;

    public C72163u(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f209329d = wcPayRealnameVerifyIdInputUI;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f209329d;
        if (!wcPayRealnameVerifyIdInputUI.f209200z) {
            wcPayRealnameVerifyIdInputUI.f209185h.setText(str);
        }
    }
}
