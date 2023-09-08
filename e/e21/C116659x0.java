package e21;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import e21.C116648v0;

/* renamed from: e21.x0 */
public class C116659x0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ AnimationSet f349798a;

    /* renamed from: b */
    public final /* synthetic */ C116648v0.C116655g f349799b;

    public C116659x0(C116648v0.C116655g gVar, AnimationSet animationSet) {
        this.f349799b = gVar;
        this.f349798a = animationSet;
    }

    public void onAnimationEnd(Animation animation) {
        this.f349798a.setStartOffset(1700);
        this.f349799b.f349785e.f349893Q.startAnimation(this.f349798a);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.f349799b.f349785e.f349893Q.setVisibility(0);
    }
}
