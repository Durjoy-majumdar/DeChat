package com.tencent.p014mm.plugin.wallet_core.id_verify;

import androidx.lifecycle.C0120a0;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.s */
public class C72161s implements C0120a0<Integer> {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209327d;

    public C72161s(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f209327d = wcPayRealnameVerifyIdInputUI;
    }

    public void onChanged(Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            this.f209327d.f209188n.setText("");
            return;
        }
        this.f209327d.f209188n.setText(this.f209327d.f209166H[num.intValue()]);
    }
}
