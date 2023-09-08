package p720v;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60667k2;
import p436a1.C103222a1;
import p436a1.C103224b0;
import rx3.C13598b0;

/* renamed from: v.q */
public final class C111284q extends C87413o implements C32226l<C103224b0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60667k2<Float> f333199d;

    /* renamed from: e */
    public final /* synthetic */ C60667k2<Float> f333200e;

    /* renamed from: f */
    public final /* synthetic */ C60667k2<C103222a1> f333201f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111284q(C60667k2<Float> k2Var, C60667k2<Float> k2Var2, C60667k2<C103222a1> k2Var3) {
        super(1);
        this.f333199d = k2Var;
        this.f333200e = k2Var2;
        this.f333201f = k2Var3;
    }

    public Object invoke(Object obj) {
        C103224b0 b0Var = (C103224b0) obj;
        C87412m.m108594g(b0Var, "$this$graphicsLayer");
        b0Var.setAlpha(this.f333199d.getValue().floatValue());
        b0Var.setScaleX(this.f333200e.getValue().floatValue());
        b0Var.setScaleY(this.f333200e.getValue().floatValue());
        b0Var.mo142966Z(this.f333201f.getValue().f304426a);
        return C13598b0.f38549a;
    }
}
