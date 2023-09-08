package p004b0;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: b0.s0 */
public final class C103966s0 extends C87413o implements C32224a<Float> {

    /* renamed from: d */
    public final /* synthetic */ C103953l0 f307479d;

    /* renamed from: e */
    public final /* synthetic */ C103962o f307480e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103966s0(C103953l0 l0Var, C103962o oVar) {
        super(0);
        this.f307479d = l0Var;
        this.f307480e = oVar;
    }

    public Object invoke() {
        float f;
        float f2;
        C103953l0 l0Var = this.f307479d;
        if (l0Var.f307431p) {
            f2 = (float) this.f307480e.getItemCount();
            f = 1.0f;
        } else {
            f2 = (float) l0Var.mo145571e();
            f = ((float) this.f307479d.mo145572f()) / 100000.0f;
        }
        return Float.valueOf(f2 + f);
    }
}
