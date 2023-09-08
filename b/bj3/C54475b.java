package bj3;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: bj3.b */
public final class C54475b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f152735d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f152736e;

    public C54475b(ViewPropertyAnimator viewPropertyAnimator, C32224a<C13598b0> aVar) {
        this.f152735d = viewPropertyAnimator;
        this.f152736e = aVar;
    }

    public final void run() {
        this.f152735d.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
        C32224a<C13598b0> aVar = this.f152736e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
