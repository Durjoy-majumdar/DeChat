package wz0;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: wz0.q */
public class C78745q implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ View f230450a;

    /* renamed from: b */
    public final /* synthetic */ ScaleAnimation f230451b;

    public C78745q(View view, ScaleAnimation scaleAnimation) {
        this.f230450a = view;
        this.f230451b = scaleAnimation;
    }

    public void onAnimationEnd(Animation animation) {
        this.f230450a.startAnimation(this.f230451b);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
