package ej3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Objects;
import rx3.C13598b0;

/* renamed from: ej3.d */
public final class C45665d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45668e f123464d;

    /* renamed from: e */
    public final /* synthetic */ long f123465e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f123466f;

    /* renamed from: ej3.d$a */
    public static final class C45666a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C45668e f123467d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f123468e;

        /* renamed from: f */
        public final /* synthetic */ ViewPropertyAnimator f123469f;

        public C45666a(C45668e eVar, C32224a<C13598b0> aVar, ViewPropertyAnimator viewPropertyAnimator) {
            this.f123467d = eVar;
            this.f123468e = aVar;
            this.f123469f = viewPropertyAnimator;
        }

        public final void run() {
            this.f123467d.mo71163a();
            C32224a<C13598b0> aVar = this.f123468e;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f123469f.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
        }
    }

    /* renamed from: ej3.d$b */
    public static final class C45667b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C45668e f123470d;

        public C45667b(C45668e eVar) {
            this.f123470d = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C45668e eVar = this.f123470d;
            C87412m.m108593f(valueAnimator, "animation");
            eVar.mo71172e(valueAnimator);
        }
    }

    public C45665d(C45668e eVar, long j, C32224a<C13598b0> aVar) {
        this.f123464d = eVar;
        this.f123465e = j;
        this.f123466f = aVar;
    }

    public final void run() {
        this.f123464d.mo71164b();
        C45668e eVar = this.f123464d;
        View view = eVar.f123474d;
        if (view != null) {
            long j = this.f123465e;
            C32224a<C13598b0> aVar = this.f123466f;
            C45667b bVar = new C45667b(eVar);
            ViewPropertyAnimator interpolator = view.animate().setInterpolator(eVar.mo71167c());
            Objects.toString(eVar.f123471a);
            Objects.toString(eVar.f123472b);
            Objects.toString(eVar.f123473c);
            C87412m.m108593f(interpolator, "this");
            eVar.mo71165d(interpolator);
            interpolator.setUpdateListener(bVar);
            interpolator.withEndAction(new C45666a(eVar, aVar, interpolator));
            interpolator.setDuration(j).start();
        }
    }
}
