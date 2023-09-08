package qj1;

import android.animation.ValueAnimator;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.r */
public final class C62946r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62898o f178615d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62946r(C62898o oVar) {
        super(0);
        this.f178615d = oVar;
    }

    public Object invoke() {
        C63064w wVar = (C63064w) this.f178615d.mo87687E0(C63064w.class);
        if (wVar != null) {
            ValueAnimator valueAnimator = wVar.f178973w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            wVar.mo88000Z0();
        }
        return C13598b0.f38549a;
    }
}
