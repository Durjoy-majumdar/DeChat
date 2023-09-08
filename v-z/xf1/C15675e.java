package xf1;

import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: xf1.e */
public final class C15675e extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ FinderThumbPlayerProxy f42361d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15675e(FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(1);
        this.f42361d = finderThumbPlayerProxy;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, "view");
        return Boolean.valueOf(C87412m.m108589b(o2Var, this.f42361d));
    }
}
