package x82;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: x82.h */
public final class C112097h extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112101k f335615d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112097h(C112101k kVar) {
        super(1);
        this.f335615d = kVar;
    }

    public Object invoke(Object obj) {
        C112080b0 thumbUiLayout;
        int intValue = ((Number) obj).intValue();
        boolean z = false;
        if (intValue >= 0 && intValue < this.f335615d.f335623K) {
            z = true;
        }
        if (z && (thumbUiLayout = this.f335615d.getThumbUiLayout()) != null) {
            thumbUiLayout.mo163782d(intValue);
        }
        return C13598b0.f38549a;
    }
}
