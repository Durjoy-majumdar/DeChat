package rs1;

import android.animation.Animator;
import de1.C7290r;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: rs1.e7 */
public final class C13218e7 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f37555d;

    public C13218e7(C32224a<C13598b0> aVar) {
        this.f37555d = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        C32224a<C13598b0> aVar = this.f37555d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
