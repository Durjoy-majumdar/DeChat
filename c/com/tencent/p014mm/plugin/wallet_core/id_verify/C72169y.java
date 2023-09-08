package com.tencent.p014mm.plugin.wallet_core.id_verify;

import androidx.lifecycle.C0120a0;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.y */
public class C72169y implements C0120a0<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209345d;

    public C72169y(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f209345d = wcPayRealnameVerifyIdInputUI;
    }

    public void onChanged(Object obj) {
        this.f209345d.f209193s.setEnabled(((Boolean) obj).booleanValue());
    }
}
