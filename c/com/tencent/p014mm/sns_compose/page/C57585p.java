package com.tencent.p014mm.sns_compose.page;

import a14.C0000n0;
import androidx.paging.compose.C54222c;
import androidx.paging.compose.C54225d;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import lh3.C99474g;
import p004b0.C103953l0;
import p004b0.C54372f0;
import p175j0.C60690y0;
import p247u3.C65060g0;
import p415q0.C110261c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.sns_compose.page.p */
public final class C57585p extends C87413o implements C32226l<C54372f0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54222c<C99474g> f164892d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<String> f164893e;

    /* renamed from: f */
    public final /* synthetic */ String f164894f;

    /* renamed from: g */
    public final /* synthetic */ C0000n0 f164895g;

    /* renamed from: h */
    public final /* synthetic */ C57589s f164896h;

    /* renamed from: i */
    public final /* synthetic */ C103953l0 f164897i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57585p(C54222c<C99474g> cVar, C60690y0<String> y0Var, String str, C0000n0 n0Var, C57589s sVar, C103953l0 l0Var) {
        super(1);
        this.f164892d = cVar;
        this.f164893e = y0Var;
        this.f164894f = str;
        this.f164895g = n0Var;
        this.f164896h = sVar;
        this.f164897i = l0Var;
    }

    public Object invoke(Object obj) {
        C54372f0 f0Var = (C54372f0) obj;
        C87412m.m108594g(f0Var, "$this$LazyColumn");
        C54372f0.C54373a.m61062a(f0Var, (Object) null, (Object) null, C110261c.m149879c(-822235289, true, new C57581l(this.f164894f, this.f164893e)), 3, (Object) null);
        if (this.f164892d.mo75007c().f187304a instanceof C65060g0.C65062b) {
            C54372f0.C54373a.m61062a(f0Var, (Object) null, (Object) null, C57554b.f164801a, 3, (Object) null);
        } else {
            this.f164893e.setValue("");
            C54222c<C99474g> cVar = this.f164892d;
            C54225d.m60914b(f0Var, cVar, C57582m.f164885d, C110261c.m149879c(422118722, true, new C57584o(this.f164895g, this.f164896h, this.f164897i, cVar)));
            if (this.f164892d.mo75007c().f187306c instanceof C65060g0.C65062b) {
                C54372f0.C54373a.m61062a(f0Var, (Object) null, (Object) null, C57554b.f164802b, 3, (Object) null);
            }
            C54372f0.C54373a.m61062a(f0Var, (Object) null, (Object) null, C57554b.f164803c, 3, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
