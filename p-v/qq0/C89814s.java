package qq0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton;
import gy3.C87412m;
import qq0.C89816t;

/* renamed from: qq0.s */
public final class C89814s extends C89810o implements C89816t.C89818b {

    /* renamed from: d */
    public final AppBrandOptionButton f258217d;

    /* renamed from: e */
    public Animator f258218e;

    /* renamed from: qq0.s$a */
    public static final class C89815a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandOptionButton f258219d;

        /* renamed from: e */
        public final /* synthetic */ Drawable f258220e;

        public C89815a(AppBrandOptionButton appBrandOptionButton, Drawable drawable) {
            this.f258219d = appBrandOptionButton;
            this.f258220e = drawable;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f258219d.getButtonImage().setImageDrawable(this.f258220e);
        }
    }

    public C89814s(AppBrandOptionButton appBrandOptionButton) {
        C87412m.m108594g(appBrandOptionButton, "mButton");
        this.f258217d = appBrandOptionButton;
    }

    /* renamed from: a */
    public void mo124099a(CharSequence charSequence) {
    }

    /* renamed from: d */
    public void mo124100d(int i) {
    }

    public void dismiss() {
        mo124103i((Drawable) null);
    }

    /* renamed from: g */
    public void mo124102g(Drawable drawable) {
        mo124103i(drawable);
    }

    /* renamed from: i */
    public void mo124103i(Drawable drawable) {
        AppBrandOptionButton appBrandOptionButton = this.f258217d;
        Animator animator = this.f258218e;
        if (animator != null) {
            animator.cancel();
        }
        ImageView buttonImage = this.f258217d.getButtonImage();
        if (buttonImage != null) {
            buttonImage.clearAnimation();
        }
        if (drawable == null) {
            appBrandOptionButton.mo117731b();
            return;
        }
        appBrandOptionButton.getButtonImage().setImageDrawable(drawable);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appBrandOptionButton.getButtonImage(), "alpha", new float[]{1.0f, 0.0f, 1.0f});
        ofFloat.setDuration(2000);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.addUpdateListener(new C89815a(appBrandOptionButton, drawable));
        ofFloat.start();
        this.f258218e = ofFloat;
    }
}
