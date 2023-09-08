package p004b0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ny3.C89104m;
import p246u1.C111063a;
import p246u1.C111064a0;
import p246u1.C111065b;
import p246u1.C111073i;
import p246u1.C111074j;
import p246u1.C111092v;
import p246u1.C111095y;
import rx3.C13598b0;

/* renamed from: b0.q0 */
public final class C103965q0 extends C87413o implements C32226l<C111064a0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Object, Integer> f307473d;

    /* renamed from: e */
    public final /* synthetic */ boolean f307474e;

    /* renamed from: f */
    public final /* synthetic */ C111073i f307475f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<Float, Float, Boolean> f307476g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<Integer, Boolean> f307477h;

    /* renamed from: i */
    public final /* synthetic */ C111065b f307478i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103965q0(C32226l<Object, Integer> lVar, boolean z, C111073i iVar, C32227p<? super Float, ? super Float, Boolean> pVar, C32226l<? super Integer, Boolean> lVar2, C111065b bVar) {
        super(1);
        this.f307473d = lVar;
        this.f307474e = z;
        this.f307475f = iVar;
        this.f307476g = pVar;
        this.f307477h = lVar2;
        this.f307478i = bVar;
    }

    public Object invoke(Object obj) {
        C111064a0 a0Var = (C111064a0) obj;
        C87412m.m108594g(a0Var, "$this$semantics");
        C32226l<Object, Integer> lVar = this.f307473d;
        C89104m<Object>[] mVarArr = C111095y.f332674a;
        C87412m.m108594g(lVar, "mapping");
        a0Var.mo162814f(C111092v.f332671z, lVar);
        if (this.f307474e) {
            C111073i iVar = this.f307475f;
            C87412m.m108594g(iVar, "<set-?>");
            C111095y.f332677d.mo162844a(a0Var, C111095y.f332674a[6], iVar);
        } else {
            C111073i iVar2 = this.f307475f;
            C87412m.m108594g(iVar2, "<set-?>");
            C111095y.f332676c.mo162844a(a0Var, C111095y.f332674a[5], iVar2);
        }
        C32227p<Float, Float, Boolean> pVar = this.f307476g;
        if (pVar != null) {
            a0Var.mo162814f(C111074j.f332611d, new C111063a((String) null, pVar));
        }
        C32226l<Integer, Boolean> lVar2 = this.f307477h;
        if (lVar2 != null) {
            a0Var.mo162814f(C111074j.f332612e, new C111063a((String) null, lVar2));
        }
        C111065b bVar = this.f307478i;
        C87412m.m108594g(bVar, "<set-?>");
        C111095y.f332683j.mo162844a(a0Var, C111095y.f332674a[13], bVar);
        return C13598b0.f38549a;
    }
}
