package il1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: il1.j1 */
public final class C46260j1 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f124703d;

    public C46260j1(C32224a<C13598b0> aVar) {
        this.f124703d = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        C32224a<C13598b0> aVar = this.f124703d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
