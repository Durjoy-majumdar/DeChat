package n04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import n04.C25127i;
import sx3.C110818d0;

/* renamed from: n04.j */
public final class C25142j extends C87413o implements C32226l<C25144j1, Iterable<? extends C25143j0>> {

    /* renamed from: d */
    public final /* synthetic */ C25127i f71587d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25142j(C25127i iVar) {
        super(1);
        this.f71587d = iVar;
    }

    public Object invoke(Object obj) {
        C25144j1 j1Var = (C25144j1) obj;
        C87412m.m108594g(j1Var, LocaleUtil.ITALIAN);
        this.f71587d.getClass();
        C25127i iVar = j1Var instanceof C25127i ? (C25127i) j1Var : null;
        if (iVar != null) {
            return C110818d0.m150933e0(((C25127i.C25130b) iVar.f71564b.invoke()).f71570a, iVar.mo52235e(false));
        }
        Collection<C25143j0> r = j1Var.mo37096r();
        C87412m.m108593f(r, "supertypes");
        return r;
    }
}
