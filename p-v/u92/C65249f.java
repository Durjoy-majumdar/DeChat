package u92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import gy3.C87412m;
import iy3.C60641c;
import u92.C65238a;

/* renamed from: u92.f */
public final class C65249f extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ View f187842d;

    /* renamed from: e */
    public final /* synthetic */ C65238a.C65240b f187843e;

    /* renamed from: f */
    public final /* synthetic */ View f187844f;

    /* renamed from: g */
    public final /* synthetic */ ValueAnimator f187845g;

    public C65249f(View view, C65238a.C65240b bVar, View view2, ValueAnimator valueAnimator) {
        this.f187842d = view;
        this.f187843e = bVar;
        this.f187844f = view2;
        this.f187845g = valueAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        C87412m.m108594g(animator, "animator");
        ViewGroup.LayoutParams layoutParams = this.f187842d.getLayoutParams();
        int i = this.f187843e.f187811c;
        MultiTaskUIC.C115597a aVar = MultiTaskUIC.f346667E;
        layoutParams.height = C60641c.m70921b(((float) (i - MultiTaskUIC.f346672J)) * MultiTaskUIC.f346683S0);
        this.f187844f.getLayoutParams().width = this.f187843e.f187811c;
        this.f187844f.getLayoutParams().height = C60641c.m70921b(((float) this.f187843e.f187811c) * MultiTaskUIC.f346681R0);
        this.f187844f.requestLayout();
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f187845g.removeListener(this);
        this.f187843e.getClass();
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animator");
    }
}
