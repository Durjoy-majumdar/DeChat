package p155g0;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p152f0.C107343g0;
import p246u1.C111064a0;
import rx3.C13598b0;

/* renamed from: g0.b */
public final class C107600b extends C87413o implements C32226l<C111064a0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f321952d;

    /* renamed from: e */
    public final /* synthetic */ long f321953e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107600b(boolean z, long j) {
        super(1);
        this.f321952d = z;
        this.f321953e = j;
    }

    public Object invoke(Object obj) {
        C111064a0 a0Var = (C111064a0) obj;
        C87412m.m108594g(a0Var, "$this$semantics");
        a0Var.mo162814f(C107640p.f322031c, new C107639o(this.f321952d ? C107343g0.SelectionStart : C107343g0.SelectionEnd, this.f321953e, (C8480h) null));
        return C13598b0.f38549a;
    }
}
