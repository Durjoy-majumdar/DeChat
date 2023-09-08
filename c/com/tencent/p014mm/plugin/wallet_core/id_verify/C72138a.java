package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.os.Bundle;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import hp3.C87581a;
import ob0.C89132b;
import te3.C50288ln3;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.a */
public class C72138a implements C87581a<Object, C89132b.C89134c<C50288ln3>> {

    /* renamed from: a */
    public final /* synthetic */ RealNameVerifyProcess$$h f209267a;

    public C72138a(RealNameVerifyProcess$$h realNameVerifyProcess$$h) {
        this.f209267a = realNameVerifyProcess$$h;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (this.f209267a.f221418a.isFinishing() || this.f209267a.f221418a.isDestroyed()) {
            return null;
        }
        ((WalletBaseUI) this.f209267a.f221418a).hideProgress();
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C50288ln3 ln32 = (C50288ln3) cVar.f256796d;
            if (ln32.f137526d == 0) {
                RealNameVerifyProcess$$h realNameVerifyProcess$$h = this.f209267a;
                realNameVerifyProcess$$h.f209039d.mo91264o(realNameVerifyProcess$$h.f221418a, 0, new Bundle());
            } else {
                C75228t.m90211D(this.f209267a.f221418a, ln32.f137527e);
            }
            return Boolean.TRUE;
        }
        C75228t.m90209B(this.f209267a.f221418a, cVar.f256795c);
        return null;
    }
}
