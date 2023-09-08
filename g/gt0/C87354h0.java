package gt0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

/* renamed from: gt0.h0 */
public final class C87354h0 {

    /* renamed from: a */
    public View f253177a;

    /* renamed from: b */
    public int f253178b;

    /* renamed from: c */
    public ValueAnimator f253179c;

    /* renamed from: gt0.h0$a */
    public class C87355a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ Runnable f253180d;

        public C87355a(Runnable runnable) {
            this.f253180d = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            C87354h0.this.f253179c = null;
        }

        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f253180d;
            if (runnable != null) {
                runnable.run();
            }
            C87354h0.this.f253179c = null;
        }
    }

    /* renamed from: gt0.h0$b */
    public class C87356b implements ValueAnimator.AnimatorUpdateListener {
        public C87356b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = C87354h0.this.f253177a;
            if (view != null) {
                view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    public C87354h0(View view) {
        this.f253177a = view;
    }

    /* renamed from: a */
    public void mo121765a(int i, Runnable runnable) {
        if (this.f253177a != null) {
            ValueAnimator valueAnimator = this.f253179c;
            if (!(valueAnimator != null && valueAnimator.isRunning()) || this.f253178b != i) {
                this.f253178b = i;
                if (!(this.f253177a.getBackground() instanceof ColorDrawable) || ((ColorDrawable) this.f253177a.getBackground()).getColor() != i) {
                    C87355a aVar = new C87355a(runnable);
                    ValueAnimator valueAnimator2 = this.f253179c;
                    if (valueAnimator2 == null || !valueAnimator2.isStarted() || !this.f253179c.isRunning() || this.f253178b != i) {
                        ValueAnimator valueAnimator3 = this.f253179c;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                        }
                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(this.f253177a.getBackground() instanceof ColorDrawable ? ((ColorDrawable) this.f253177a.getBackground()).getColor() : 0), Integer.valueOf(this.f253178b)});
                        this.f253179c = ofObject;
                        ofObject.addListener(aVar);
                        this.f253179c.addUpdateListener(new C87356b());
                        this.f253179c.start();
                        return;
                    }
                    this.f253179c.addListener(aVar);
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
                ValueAnimator valueAnimator4 = this.f253179c;
                if (valueAnimator4 != null) {
                    valueAnimator4.cancel();
                }
            }
        }
    }
}
