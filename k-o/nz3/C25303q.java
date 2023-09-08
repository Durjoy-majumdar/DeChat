package nz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n04.C25143j0;
import wy3.C26436b;
import wy3.C26463h1;

/* renamed from: nz3.q */
public final class C25303q extends C87413o implements C32226l<C26436b, C25143j0> {

    /* renamed from: d */
    public final /* synthetic */ C26463h1 f71795d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25303q(C26463h1 h1Var) {
        super(1);
        this.f71795d = h1Var;
    }

    public Object invoke(Object obj) {
        C26436b bVar = (C26436b) obj;
        C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
        C25143j0 type = bVar.mo52639h().get(this.f71795d.getIndex()).getType();
        C87412m.m108593f(type, "it.valueParameters[p.index].type");
        return type;
    }
}
