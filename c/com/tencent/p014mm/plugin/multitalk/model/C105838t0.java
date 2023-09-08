package com.tencent.p014mm.plugin.multitalk.model;

import fy3.C32224a;
import fy3.C32228q;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;
import u80.C111141c;

/* renamed from: com.tencent.mm.plugin.multitalk.model.t0 */
public final class C105838t0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C105834r0 f314782d;

    /* renamed from: e */
    public final /* synthetic */ C32228q<ByteBuffer, Integer, Integer, C13598b0> f314783e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105838t0(C105834r0 r0Var, C32228q<? super ByteBuffer, ? super Integer, ? super Integer, C13598b0> qVar) {
        super(0);
        this.f314782d = r0Var;
        this.f314783e = qVar;
    }

    public Object invoke() {
        C105834r0 r0Var = this.f314782d;
        C111141c cVar = r0Var.f314778i;
        if (cVar != null) {
            cVar.f332763r = new C105836s0(this.f314783e, r0Var);
        }
        return C13598b0.f38549a;
    }
}
