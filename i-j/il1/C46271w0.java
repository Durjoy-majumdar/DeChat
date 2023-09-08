package il1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: il1.w0 */
public final class C46271w0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f124726d;

    public C46271w0(C32224a<C13598b0> aVar) {
        this.f124726d = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        C32224a<C13598b0> aVar = this.f124726d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
