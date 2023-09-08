package aj3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: aj3.c */
public class C103380c extends C103374a {

    /* renamed from: g */
    public final WeakReference<ViewPropertyAnimator> f304885g;

    /* renamed from: h */
    public Interpolator f304886h;

    /* renamed from: aj3.c$a */
    public class C103381a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ ValueAnimator f304887d;

        public C103381a(ValueAnimator valueAnimator) {
            this.f304887d = valueAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C103380c.this.getClass();
            C103380c cVar = C103380c.this;
            cVar.f304886h = null;
            HashMap<Animator, Runnable> hashMap = cVar.f304863b;
            if (hashMap != null) {
                hashMap.remove(this.f304887d);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C103380c cVar = C103380c.this;
            cVar.getClass();
            cVar.f304886h = null;
            HashMap<Animator, Runnable> hashMap = C103380c.this.f304863b;
            if (hashMap != null) {
                Runnable runnable = hashMap.get(this.f304887d);
                if (runnable != null) {
                    runnable.run();
                }
                C103380c.this.f304863b.remove(this.f304887d);
            }
            C103380c.this.getClass();
        }

        public void onAnimationRepeat(Animator animator) {
            C103380c.this.getClass();
        }

        public void onAnimationStart(Animator animator) {
            C103380c.this.getClass();
            HashMap<Animator, Runnable> hashMap = C103380c.this.f304862a;
            if (hashMap != null) {
                Runnable runnable = hashMap.get(this.f304887d);
                if (runnable != null) {
                    runnable.run();
                }
                C103380c.this.f304862a.remove(this.f304887d);
            }
            C103380c.this.getClass();
        }
    }

    /* renamed from: aj3.c$b */
    public class C103382b implements ValueAnimator.AnimatorUpdateListener {
        public C103382b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C103380c.this.f304866e.mo91065a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C103380c(View view) {
        this.f304885g = new WeakReference<>(view.animate());
    }

    /* renamed from: b */
    public C103374a mo143279b(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotation(f);
        }
        return this;
    }

    /* renamed from: c */
    public C103374a mo143280c(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleX(f);
        }
        return this;
    }

    /* renamed from: d */
    public C103374a mo143281d(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleY(f);
        }
        return this;
    }

    /* renamed from: e */
    public C103374a mo143282e(long j) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j);
        }
        return this;
    }

    /* renamed from: f */
    public C103374a mo143283f(Interpolator interpolator) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
            this.f304886h = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C103374a mo143284g(long j) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public void mo143286i() {
        System.currentTimeMillis();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f});
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        Runnable runnable = this.f304864c;
        if (runnable != null) {
            this.f304862a.put(ofFloat, runnable);
            this.f304864c = null;
        }
        Runnable runnable2 = this.f304865d;
        if (runnable2 != null) {
            this.f304863b.put(ofFloat, runnable2);
            this.f304865d = null;
        }
        viewPropertyAnimator.setListener(new C103381a(ofFloat));
        if (this.f304866e != null) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ViewPropertyAnimator viewPropertyAnimator2 = this.f304885g.get();
            ofFloat2.setDuration(viewPropertyAnimator2 != null ? viewPropertyAnimator2.getDuration() : -1);
            Interpolator interpolator = this.f304886h;
            if (interpolator != null) {
                ofFloat2.setInterpolator(interpolator);
            }
            ofFloat2.setStartDelay(viewPropertyAnimator.getStartDelay());
            ofFloat2.addUpdateListener(new C103382b());
            ofFloat2.start();
        }
        viewPropertyAnimator.start();
    }

    /* renamed from: j */
    public C103374a mo143287j(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationX(f);
        }
        return this;
    }

    /* renamed from: k */
    public C103374a mo143288k(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f);
        }
        return this;
    }

    /* renamed from: l */
    public C103374a mo143289l(Runnable runnable) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.withEndAction(runnable);
        }
        return this;
    }

    /* renamed from: m */
    public C103374a mo143290m(Runnable runnable) {
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.withStartAction(runnable);
        }
        return this;
    }
}
