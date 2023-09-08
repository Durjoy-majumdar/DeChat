package l52;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import o52.C61943d;
import p004b0.C54372f0;
import p415q0.C110261c;
import rx3.C13598b0;

/* renamed from: l52.k */
public final class C61231k extends C87413o implements C32226l<C54372f0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C61943d> f174287d;

    /* renamed from: e */
    public final /* synthetic */ C109271t f174288e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61231k(List<? extends C61943d> list, C109271t tVar) {
        super(1);
        this.f174287d = list;
        this.f174288e = tVar;
    }

    public Object invoke(Object obj) {
        C54372f0 f0Var = (C54372f0) obj;
        C87412m.m108594g(f0Var, "$this$LazyColumn");
        List<C61943d> list = this.f174287d;
        C10465g gVar = C10465g.f31696d;
        f0Var.mo75141d(list.size(), gVar != null ? new C10466h(gVar, list) : null, new C10467i(list), C110261c.m149879c(-1091073711, true, new C61230j(list, this.f174288e)));
        return C13598b0.f38549a;
    }
}
