package com.tencent.p014mm.plugin.wallet_core.id_verify;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.z */
public class C72170z implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f209346a;

    /* renamed from: b */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209347b;

    public C72170z(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI, C101218e0 e0Var) {
        this.f209347b = wcPayRealnameVerifyIdInputUI;
        this.f209346a = e0Var;
    }

    /* renamed from: a */
    public void mo2001a() {
        this.f209346a.mo140680z();
        C75228t.m90245f0(21, 1, Util.nowSecond(), this.f209347b.f209178U);
    }
}
