package com.tencent.p014mm.plugin.wallet_core.id_verify;

import com.tencent.p014mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI;
import fy3.C32224a;
import gy3.C87413o;
import o60.C100284b;
import rx3.C13598b0;
import x60.C102564a;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.d */
public final class C96590d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RealnameVerifySelectGuardianUI.C72070b f282755d;

    /* renamed from: e */
    public final /* synthetic */ String f282756e;

    /* renamed from: f */
    public final /* synthetic */ C100284b.C100286b f282757f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96590d(RealnameVerifySelectGuardianUI.C72070b bVar, String str, C100284b.C100286b bVar2) {
        super(0);
        this.f282755d = bVar;
        this.f282756e = str;
        this.f282757f = bVar2;
    }

    public Object invoke() {
        RealnameVerifySelectGuardianUI.C72070b bVar = this.f282755d;
        bVar.f209048a.mo95802a(new C102564a(this.f282756e), bVar.f209049b, new C96587c(this.f282757f));
        return C13598b0.f38549a;
    }
}
