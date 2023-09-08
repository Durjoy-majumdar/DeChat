package xf1;

import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: xf1.g */
public final class C66254g extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoPassiveMiniViewHelper f190313d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66254g(FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper) {
        super(1);
        this.f190313d = finderVideoPassiveMiniViewHelper;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, "view");
        return Boolean.valueOf(C87412m.m108589b(o2Var, this.f190313d.f159091w));
    }
}
