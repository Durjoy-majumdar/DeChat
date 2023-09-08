package com.tencent.p014mm.vfs;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.vfs.d1 */
public final class C116277d1 extends C87413o implements C32226l<C86001b0, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C116300h1 f348940d;

    /* renamed from: e */
    public final /* synthetic */ int f348941e;

    /* renamed from: f */
    public final /* synthetic */ C116302i1 f348942f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116277d1(C116300h1 h1Var, int i, C116302i1 i1Var) {
        super(1);
        this.f348940d = h1Var;
        this.f348941e = i;
        this.f348942f = i1Var;
    }

    public Object invoke(Object obj) {
        C86001b0 b0Var = (C86001b0) obj;
        C87412m.m108594g(b0Var, "fe");
        return Boolean.valueOf(this.f348940d.mo137953c(this.f348941e, this.f348942f.f349016b, b0Var));
    }
}
