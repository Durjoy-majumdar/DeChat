package com.tencent.p014mm.plugin.multitalk.model;

import fy3.C32224a;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111141c;
import w80.C111742d;

/* renamed from: com.tencent.mm.plugin.multitalk.model.q0 */
public final class C105832q0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C105834r0 f314768d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105832q0(C105834r0 r0Var) {
        super(0);
        this.f314768d = r0Var;
    }

    public Object invoke() {
        C105834r0 r0Var = this.f314768d;
        C111141c cVar = r0Var.f314778i;
        if (cVar != null) {
            C110194c cVar2 = r0Var.f314770a;
            cVar.f332801G = cVar2 != null ? cVar2.f329652e : 0;
            cVar.mo143263u(r0Var.f314776g, r0Var.f314777h);
            cVar.mo158522s(r0Var.f314776g, r0Var.f314777h);
            cVar.f332766u = true;
            cVar.mo162879m();
            C111742d.C65942b bVar = r0Var.f314774e;
            if (bVar != null) {
                C111742d.f334647a.mo163474t(bVar.f189591a, bVar.f189592b);
            }
        }
        return C13598b0.f38549a;
    }
}
