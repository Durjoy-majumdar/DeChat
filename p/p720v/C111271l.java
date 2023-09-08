package p720v;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60667k2;
import p436a1.C103224b0;
import rx3.C13598b0;

/* renamed from: v.l */
public final class C111271l extends C87413o implements C32226l<C103224b0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60667k2<Float> f333171d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111271l(C60667k2<Float> k2Var) {
        super(1);
        this.f333171d = k2Var;
    }

    public Object invoke(Object obj) {
        C103224b0 b0Var = (C103224b0) obj;
        C87412m.m108594g(b0Var, "$this$graphicsLayer");
        b0Var.setAlpha(this.f333171d.getValue().floatValue());
        return C13598b0.f38549a;
    }
}
