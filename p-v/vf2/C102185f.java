package vf2;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: vf2.f */
public class C102185f implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ View f300876a;

    /* renamed from: b */
    public final /* synthetic */ C102186g f300877b;

    public C102185f(C102186g gVar, View view) {
        this.f300877b = gVar;
        this.f300876a = view;
    }

    public void onAnimationEnd(Animation animation) {
        this.f300876a.startAnimation(this.f300877b.f300882h);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
