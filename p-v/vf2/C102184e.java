package vf2;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: vf2.e */
public class C102184e implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ View f300874a;

    /* renamed from: b */
    public final /* synthetic */ C102186g f300875b;

    public C102184e(C102186g gVar, View view) {
        this.f300875b = gVar;
        this.f300874a = view;
    }

    public void onAnimationEnd(Animation animation) {
        this.f300874a.startAnimation(this.f300875b.f300881g);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
