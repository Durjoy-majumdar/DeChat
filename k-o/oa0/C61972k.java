package oa0;

import ca0.C54683f0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p415q0.C110261c;
import p415q0.C25518a;
import p720v.C65500d;
import rx3.C13598b0;

/* renamed from: oa0.k */
public final class C61972k extends C87413o implements C32228q<C65500d, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f176163d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f176164e;

    /* renamed from: f */
    public final /* synthetic */ int f176165f;

    /* renamed from: g */
    public final /* synthetic */ C54683f0 f176166g;

    /* renamed from: h */
    public final /* synthetic */ C55366y1 f176167h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61972k(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, int i, C54683f0 f0Var, C55366y1 y1Var) {
        super(3);
        this.f176163d = aVar;
        this.f176164e = aVar2;
        this.f176165f = i;
        this.f176166g = f0Var;
        this.f176167h = y1Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65500d) obj, "$this$AnimatedVisibility");
        C32224a<C13598b0> aVar = this.f176163d;
        C32224a<C13598b0> aVar2 = this.f176164e;
        C25518a b = C110261c.m149878b(hVar, 1548374391, true, new C61971j(this.f176166g, this.f176167h));
        int i = this.f176165f >> 15;
        C110008g.m149534f(aVar, aVar2, b, hVar, (i & 112) | (i & 14) | 384);
        return C13598b0.f38549a;
    }
}
