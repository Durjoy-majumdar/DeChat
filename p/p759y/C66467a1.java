package p759y;

import fy3.C32226l;
import gy3.C87413o;
import p175j0.C60667k2;

/* renamed from: y.a1 */
public final class C66467a1 extends C87413o implements C32226l<Float, Float> {

    /* renamed from: d */
    public final /* synthetic */ C60667k2<C32226l<Float, Float>> f191230d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66467a1(C60667k2<? extends C32226l<? super Float, Float>> k2Var) {
        super(1);
        this.f191230d = k2Var;
    }

    public Object invoke(Object obj) {
        return (Float) this.f191230d.getValue().invoke(Float.valueOf(((Number) obj).floatValue()));
    }
}
