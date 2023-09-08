package l52;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: l52.m */
public final class C61232m extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<Integer> f174289d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61232m(C60690y0<Integer> y0Var) {
        super(2);
        this.f174289d = y0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        this.f174289d.setValue(Integer.valueOf(((Number) obj2).intValue()));
        return C13598b0.f38549a;
    }
}
