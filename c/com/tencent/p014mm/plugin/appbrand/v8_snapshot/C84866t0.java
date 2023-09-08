package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicInteger;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.t0 */
public final class C84866t0 extends C87413o implements C32226l<C84872v0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ICommLibReader f247363d;

    /* renamed from: e */
    public final /* synthetic */ String f247364e;

    /* renamed from: f */
    public final /* synthetic */ AtomicInteger f247365f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84866t0(ICommLibReader iCommLibReader, String str, AtomicInteger atomicInteger) {
        super(1);
        this.f247363d = iCommLibReader;
        this.f247364e = str;
        this.f247365f = atomicInteger;
    }

    public Object invoke(Object obj) {
        C84872v0 v0Var = (C84872v0) obj;
        C87412m.m108594g(v0Var, LocaleUtil.ITALIAN);
        C84852n0 n0Var = C84852n0.f247339d;
        ICommLibReader iCommLibReader = this.f247363d;
        n0Var.mo117594B(iCommLibReader, this.f247364e, v0Var, C84840f0.f247297a.mo117577i(iCommLibReader, v0Var), new C84865s0(this.f247365f, this.f247363d));
        return C13598b0.f38549a;
    }
}
