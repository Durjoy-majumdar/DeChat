package il1;

import android.animation.Animator;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: il1.e2 */
public final class C60390e2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60557z1 f172195d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60390e2(C60557z1 z1Var) {
        super(0);
        this.f172195d = z1Var;
    }

    public Object invoke() {
        this.f172195d.f172605a.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
        return C13598b0.f38549a;
    }
}
