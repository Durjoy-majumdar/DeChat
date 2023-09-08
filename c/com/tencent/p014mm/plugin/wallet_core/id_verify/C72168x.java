package com.tencent.p014mm.plugin.wallet_core.id_verify;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.x */
public class C72168x implements C0120a0<Profession> {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209344d;

    public C72168x(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f209344d = wcPayRealnameVerifyIdInputUI;
    }

    public void onChanged(Object obj) {
        this.f209344d.f209184g.setText(((Profession) obj).f209290d);
    }
}
