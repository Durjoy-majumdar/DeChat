package p152f0;

import fy3.C32226l;
import gy3.C87413o;
import p175j0.C108494d2;

/* renamed from: f0.h2 */
public final class C107348h2 extends C87413o implements C32226l<Float, Float> {

    /* renamed from: d */
    public final /* synthetic */ C107356k2 f321178d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107348h2(C107356k2 k2Var) {
        super(1);
        this.f321178d = k2Var;
    }

    public Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        float a = this.f321178d.mo157808a() + floatValue;
        if (a > ((Number) ((C108494d2) this.f321178d.f321199b).getValue()).floatValue()) {
            floatValue = ((Number) ((C108494d2) this.f321178d.f321199b).getValue()).floatValue() - this.f321178d.mo157808a();
        } else if (a < 0.0f) {
            floatValue = -this.f321178d.mo157808a();
        }
        C107356k2 k2Var = this.f321178d;
        ((C108494d2) k2Var.f321198a).setValue(Float.valueOf(k2Var.mo157808a() + floatValue));
        return Float.valueOf(floatValue);
    }
}
