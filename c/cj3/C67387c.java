package cj3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import cj3.C67383b;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: cj3.c */
public final class C67387c implements C67383b {

    /* renamed from: b */
    public final View f193263b;

    /* renamed from: c */
    public boolean f193264c;

    /* renamed from: d */
    public boolean f193265d;

    /* renamed from: e */
    public boolean f193266e;

    /* renamed from: f */
    public int f193267f = -1;

    /* renamed from: g */
    public Integer f193268g;

    /* renamed from: h */
    public ValueAnimator f193269h;

    /* renamed from: i */
    public C67383b.C67386b f193270i;

    /* renamed from: j */
    public Integer f193271j;

    /* renamed from: cj3.c$a */
    public static final class C67388a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C67387c f193272d;

        public C67388a(C67387c cVar) {
            this.f193272d = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C87412m.m108594g(valueAnimator, "animation");
            C67387c cVar = this.f193272d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            cVar.f193268g = (Integer) animatedValue;
            this.f193272d.f193263b.requestLayout();
        }
    }

    /* renamed from: cj3.c$b */
    public static final class C67389b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C67387c f193273d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f193274e;

        public C67389b(C67387c cVar, C32224a<C13598b0> aVar) {
            this.f193273d = cVar;
            this.f193274e = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            C67387c cVar = this.f193273d;
            C67383b.C67386b bVar = cVar.f193270i;
            if (bVar != null) {
                bVar.mo91530n2(cVar.hashCode(), false);
            }
            C32224a<C13598b0> aVar = this.f193274e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animation");
            C67387c cVar = this.f193273d;
            C67383b.C67386b bVar = cVar.f193270i;
            if (bVar != null) {
                bVar.mo91530n2(cVar.hashCode(), true);
            }
        }
    }

    public C67387c(View view) {
        C87412m.m108594g(view, "attachView");
        this.f193263b = view;
    }

    /* renamed from: a */
    public void mo91525a(boolean z) {
        this.f193264c = z;
    }

    /* renamed from: b */
    public void mo91526b(C67383b.C67386b bVar) {
        this.f193270i = bVar;
    }

    /* renamed from: c */
    public final C13604l<Integer, Integer> mo91531c(int i, int i2, boolean z, C32224a<C13598b0> aVar) {
        ValueAnimator valueAnimator = this.f193269h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            this.f193266e = true;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        int measuredWidth = this.f193263b.getMeasuredWidth();
        this.f193271j = Integer.valueOf(i2);
        ofInt.addUpdateListener(new C67388a(this));
        ofInt.addListener(new C67389b(this, aVar));
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(200);
        if (this.f193265d) {
            this.f193269h = ofInt;
        } else {
            ofInt.start();
            this.f193269h = ofInt;
        }
        return new C13604l<>(Integer.valueOf(measuredWidth), Integer.valueOf(i));
    }

    public void cancel() {
        if (!this.f193265d) {
            ValueAnimator valueAnimator = this.f193269h;
            boolean z = true;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                z = false;
            }
            if (z) {
                ValueAnimator valueAnimator2 = this.f193269h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f193269h = null;
                this.f193266e = false;
                Integer num = this.f193271j;
                if (num != null) {
                    this.f193267f = num.intValue();
                }
                this.f193263b.requestLayout();
            }
        }
    }

    /* renamed from: d */
    public void mo91532d(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        ValueAnimator valueAnimator = this.f193269h;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f193266e = true;
            return;
        }
        this.f193266e = false;
        this.f193267f = i5;
    }

    /* renamed from: e */
    public C13604l<Integer, Integer> mo91533e(int i, int i2) {
        if (!this.f193264c) {
            return null;
        }
        this.f193263b.getMeasuredWidth();
        int measuredHeight = this.f193263b.getMeasuredHeight();
        int i3 = this.f193267f;
        if (i3 != -1 && measuredHeight != i3) {
            return mo91531c(i3, measuredHeight, false, (C32224a<C13598b0>) null);
        }
        ValueAnimator valueAnimator = this.f193269h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f193269h = null;
        return null;
    }

    /* renamed from: f */
    public C13604l<Integer, Integer> mo91534f(int i, int i2) {
        boolean z = this.f193264c;
        if (!z || !z || this.f193268g == null || !this.f193266e) {
            return null;
        }
        Integer valueOf = Integer.valueOf(this.f193263b.getMeasuredWidth());
        Integer num = this.f193268g;
        C87412m.m108591d(num);
        return new C13604l<>(valueOf, num);
    }

    public void pause() {
        this.f193265d = true;
    }

    public void resume() {
        this.f193265d = false;
        ValueAnimator valueAnimator = this.f193269h;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        this.f193269h = null;
    }
}
