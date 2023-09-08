package yz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n04.C25143j0;
import n04.C25158m1;
import n04.C25202z1;

/* renamed from: yz3.e */
public final class C23409e extends C87413o implements C32226l<C25158m1, CharSequence> {

    /* renamed from: d */
    public final /* synthetic */ C26649d f67167d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23409e(C26649d dVar) {
        super(1);
        this.f67167d = dVar;
    }

    public Object invoke(Object obj) {
        C25158m1 m1Var = (C25158m1) obj;
        C87412m.m108594g(m1Var, LocaleUtil.ITALIAN);
        if (m1Var.mo52296b()) {
            return "*";
        }
        C26649d dVar = this.f67167d;
        C25143j0 type = m1Var.getType();
        C87412m.m108593f(type, "it.type");
        String u = dVar.mo36863u(type);
        if (m1Var.mo52295a() == C25202z1.INVARIANT) {
            return u;
        }
        return m1Var.mo52295a() + ' ' + u;
    }
}
