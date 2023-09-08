package com.tencent.p014mm.mj_template.sns.compose.widget;

import androidx.paging.compose.C54222c;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p415q0.C110261c;
import p560i2.C108319b;
import p631o1.C109827a0;
import p631o1.C109893x;
import p631o1.C109894x0;
import p631o1.C109899z;
import sx3.C110818d0;
import te3.o74;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.b0 */
public final class C104654b0 extends C87413o implements C32227p<C109894x0, C108319b, C109899z> {

    /* renamed from: d */
    public final /* synthetic */ float f310785d;

    /* renamed from: e */
    public final /* synthetic */ C55341p0 f310786e;

    /* renamed from: f */
    public final /* synthetic */ C54222c<C28971l<o74>> f310787f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104654b0(float f, C55341p0 p0Var, C54222c<C28971l<o74>> cVar) {
        super(2);
        this.f310785d = f;
        this.f310786e = p0Var;
        this.f310787f = cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C109894x0 x0Var = (C109894x0) obj;
        long j = ((C108319b) obj2).f324343a;
        C87412m.m108594g(x0Var, "$this$SubcomposeLayout");
        C109893x xVar = (C109893x) C110818d0.m150916N(x0Var.mo161192q0(0, C110261c.m149879c(-1740260358, true, new C104653a0(this.f310786e, this.f310787f, (((float) C108319b.m146697h(j)) / this.f310785d) - (((float) 2) * ((float) 8))))));
        return C109827a0.C109828a.m149247b(x0Var, C108319b.m146697h(j), C108319b.m146696g(j), (Map) null, new C104681u(xVar != null ? xVar.mo161155K(j) : null), 4, (Object) null);
    }
}
