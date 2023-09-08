package dj3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: dj3.a */
public final class C45405a implements Runnable {

    /* renamed from: d */
    public final View f122924d;

    /* renamed from: dj3.a$a */
    public static final class C45406a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ Drawable f122925d;

        public C45406a(Drawable drawable) {
            this.f122925d = drawable;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Drawable drawable = this.f122925d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            drawable.setAlpha(255 - ((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: dj3.a$b */
    public static final class C45407b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ Drawable f122926d;

        /* renamed from: e */
        public final /* synthetic */ C45405a f122927e;

        public C45407b(Drawable drawable, C45405a aVar) {
            this.f122926d = drawable;
            this.f122927e = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        public void onAnimationEnd(Animator animator) {
            this.f122926d.setAlpha(255);
            this.f122927e.f122924d.setBackgroundResource(C0966R.C0969drawable.f4855pa);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C45405a(View view) {
        C87412m.m108594g(view, "view");
        this.f122924d = view;
    }

    public void run() {
        this.f122924d.setSelected(false);
        Drawable drawable = this.f122924d.getContext().getDrawable(C0966R.color.a1i);
        C87412m.m108591d(drawable);
        this.f122924d.setBackground(drawable);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{240});
        ofInt.addUpdateListener(new C45406a(drawable));
        ofInt.setDuration(100);
        ofInt.addListener(new C45407b(drawable, this));
        ofInt.start();
    }
}
