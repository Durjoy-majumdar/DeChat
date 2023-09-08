package p267x;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ny3.C89104m;
import p246u1.C111063a;
import p246u1.C111064a0;
import p246u1.C111072h;
import p246u1.C111074j;
import p246u1.C111092v;
import p246u1.C111095y;
import rx3.C13598b0;

/* renamed from: x.v */
public final class C111961v extends C87413o implements C32226l<C111064a0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111072h f335182d;

    /* renamed from: e */
    public final /* synthetic */ String f335183e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f335184f;

    /* renamed from: g */
    public final /* synthetic */ String f335185g;

    /* renamed from: h */
    public final /* synthetic */ boolean f335186h;

    /* renamed from: i */
    public final /* synthetic */ C32224a<C13598b0> f335187i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111961v(C111072h hVar, String str, C32224a<C13598b0> aVar, String str2, boolean z, C32224a<C13598b0> aVar2) {
        super(1);
        this.f335182d = hVar;
        this.f335183e = str;
        this.f335184f = aVar;
        this.f335185g = str2;
        this.f335186h = z;
        this.f335187i = aVar2;
    }

    public Object invoke(Object obj) {
        C111064a0 a0Var = (C111064a0) obj;
        C87412m.m108594g(a0Var, "$this$semantics");
        C111072h hVar = this.f335182d;
        if (hVar != null) {
            C111095y.m151494b(a0Var, hVar.f332604a);
        }
        String str = this.f335183e;
        C15614t tVar = new C15614t(this.f335187i);
        C89104m<Object>[] mVarArr = C111095y.f332674a;
        a0Var.mo162814f(C111074j.f332609b, new C111063a(str, tVar));
        C32224a<C13598b0> aVar = this.f335184f;
        if (aVar != null) {
            a0Var.mo162814f(C111074j.f332610c, new C111063a(this.f335185g, new C15615u(aVar)));
        }
        if (!this.f335186h) {
            a0Var.mo162814f(C111092v.f332654i, C13598b0.f38549a);
        }
        return C13598b0.f38549a;
    }
}
