package p267x;

import fy3.C32224a;
import gy3.C87413o;
import p175j0.C60690y0;

/* renamed from: x.r */
public final class C66226r extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<Boolean> f190270d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<Boolean> f190271e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66226r(C60690y0<Boolean> y0Var, C32224a<Boolean> aVar) {
        super(0);
        this.f190270d = y0Var;
        this.f190271e = aVar;
    }

    public Object invoke() {
        return Boolean.valueOf(this.f190270d.getValue().booleanValue() || this.f190271e.invoke().booleanValue());
    }
}
