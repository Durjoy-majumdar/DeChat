package zp3;

import android.animation.Animator;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;

/* renamed from: zp3.f0 */
public final class C66955f0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout f192357d;

    public C66955f0(RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f192357d = refreshLoadMoreLayout;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f192357d;
        refreshLoadMoreLayout.f165602C = false;
        refreshLoadMoreLayout.setTranslationY(0.0f);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f192357d.f165602C = true;
    }
}
