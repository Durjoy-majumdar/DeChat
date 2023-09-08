package il1;

import android.animation.Animator;
import android.view.animation.AccelerateDecelerateInterpolator;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: il1.b1 */
public final class C60346b1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60535v0 f172005d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60346b1(C60535v0 v0Var) {
        super(0);
        this.f172005d = v0Var;
    }

    public Object invoke() {
        this.f172005d.f172550d.animate().translationX(0.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
        return C13598b0.f38549a;
    }
}
