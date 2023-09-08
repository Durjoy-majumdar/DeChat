package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.p0 */
public final class C84861p0 extends C87413o implements C32226l<String, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C84872v0 f247356d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84861p0(C84872v0 v0Var) {
        super(1);
        this.f247356d = v0Var;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "wxaPkgPath");
        C84878x0 O = C84852n0.f247339d.mo117596O();
        return Boolean.valueOf((O != null ? O.mo117635qq(str, this.f247356d) : null) != null);
    }
}
