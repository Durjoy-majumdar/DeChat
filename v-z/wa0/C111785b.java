package wa0;

import fy3.C32226l;
import gy3.C87413o;
import p175j0.C60690y0;
import p560i2.C33181m;
import rx3.C13598b0;

/* renamed from: wa0.b */
public final class C111785b extends C87413o implements C32226l<C33181m, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ float f334732d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<Float> f334733e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111785b(float f, C60690y0<Float> y0Var) {
        super(1);
        this.f334732d = f;
        this.f334733e = y0Var;
    }

    public Object invoke(Object obj) {
        this.f334733e.setValue(Float.valueOf(((float) ((int) (((C33181m) obj).f90057a >> 32))) * this.f334732d));
        return C13598b0.f38549a;
    }
}
