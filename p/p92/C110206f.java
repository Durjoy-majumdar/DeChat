package p92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskFloatBallView;
import gy3.C87412m;

/* renamed from: p92.f */
public final class C110206f extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ MultiTaskFloatBallView f329693d;

    public C110206f(MultiTaskFloatBallView multiTaskFloatBallView) {
        this.f329693d = multiTaskFloatBallView;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        super.onAnimationEnd(animator);
        ViewGroup.LayoutParams layoutParams = this.f329693d.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f329693d.mo151067h(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, true, false);
    }
}
