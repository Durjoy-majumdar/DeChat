package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: qj1.kg */
public final class C47854kg extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f128453d;

    public C47854kg(C32224a<C13598b0> aVar) {
        this.f128453d = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f128453d.invoke();
    }
}
