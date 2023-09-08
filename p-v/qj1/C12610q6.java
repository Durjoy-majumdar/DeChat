package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import cl1.C0654b;
import cl1.C55001u;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import java.util.Map;
import rx3.C13598b0;
import wc3.C15130a;
import wc3.C15140v;
import wd3.C78545b;

/* renamed from: qj1.q6 */
public final class C12610q6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12543n6 f36150d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12610q6(C12543n6 n6Var) {
        super(0);
        this.f36150d = n6Var;
    }

    public Object invoke() {
        C15130a aVar = new C15130a();
        aVar.f41257b = 215;
        aVar.f41260e = 2;
        aVar.f41261f = false;
        aVar.f41258c = String.valueOf(((C55001u) this.f36150d.mo87696x0(C55001u.class)).f154420q.f182392d);
        ((C78545b) ((C15140v) C86312j.m106911c(C15140v.class)).mo14099ne(this.f36150d.f166287d.getContext(), ((C0654b) this.f36150d.mo87684A0().mo71262a(C0654b.class)).f1545g, 215, true, C12597p6.f36123a, aVar)).mo108519f();
        C12543n6 n6Var = this.f36150d;
        n6Var.mo10792g(8);
        n6Var.f36032p.statusChange(C58124b.C58125b.FINDER_LIVE_CLOSE_LIVE_FROM_FOLLOW_GUIDE, (Bundle) null);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.FOLLOW_GUIDE_LEAVE_FOLLOW, (Map) null, (String) null, 6, (Object) null);
        return C13598b0.f38549a;
    }
}
