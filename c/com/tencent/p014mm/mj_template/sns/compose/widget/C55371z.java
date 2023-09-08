package com.tencent.p014mm.mj_template.sns.compose.widget;

import androidx.paging.compose.C54222c;
import androidx.paging.compose.C54225d;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C54372f0;
import p175j0.C60667k2;
import p247u3.C65060g0;
import p415q0.C110261c;
import rx3.C13598b0;
import te3.o74;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.z */
public final class C55371z extends C87413o implements C32226l<C54372f0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54222c<C28971l<o74>> f157682d;

    /* renamed from: e */
    public final /* synthetic */ float f157683e;

    /* renamed from: f */
    public final /* synthetic */ C55341p0 f157684f;

    /* renamed from: g */
    public final /* synthetic */ C60667k2<C28971l<o74>> f157685g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55371z(C54222c<C28971l<o74>> cVar, float f, C55341p0 p0Var, C60667k2<C28971l<o74>> k2Var) {
        super(1);
        this.f157682d = cVar;
        this.f157683e = f;
        this.f157684f = p0Var;
        this.f157685g = k2Var;
    }

    public Object invoke(Object obj) {
        C54372f0 f0Var = (C54372f0) obj;
        C87412m.m108594g(f0Var, "$this$LazyColumn");
        if (this.f157682d.mo75007c().f187304a instanceof C65060g0.C65062b) {
            C54372f0.C54373a.m61062a(f0Var, (Object) null, (Object) null, C55286a.f157483a, 3, (Object) null);
        } else if (this.f157682d.mo75007c().f187304a instanceof C65060g0.C65061a) {
            C54372f0.C54373a.m61062a(f0Var, (Object) null, (Object) null, C55286a.f157484b, 3, (Object) null);
        } else if ((this.f157682d.mo75007c().f187304a instanceof C65060g0.C65062b) || (this.f157682d.mo75007c().f187306c instanceof C65060g0.C65062b) || this.f157682d.mo75006b() != 0) {
            C54225d.m60914b(f0Var, this.f157682d, C55356v.f157653d, C110261c.m149879c(1508269015, true, new C55364y(this.f157683e, this.f157684f, this.f157685g)));
        } else {
            C54372f0.C54373a.m61062a(f0Var, (Object) null, (Object) null, C55286a.f157485c, 3, (Object) null);
        }
        if (this.f157682d.mo75007c().f187306c instanceof C65060g0.C65062b) {
            C54372f0.C54373a.m61062a(f0Var, (Object) null, (Object) null, C55286a.f157486d, 3, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
