package po3;

import android.animation.Animator;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import gy3.C87412m;

/* renamed from: po3.m */
public final class C110243m implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ Animator.AnimatorListener f329771d;

    /* renamed from: e */
    public final /* synthetic */ CropLayout f329772e;

    public C110243m(Animator.AnimatorListener animatorListener, CropLayout cropLayout) {
        this.f329771d = animatorListener;
        this.f329772e = cropLayout;
    }

    public void onAnimationCancel(Animator animator) {
        C87412m.m108594g(animator, "animation");
        Animator.AnimatorListener animatorListener = this.f329771d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        Animator.AnimatorListener animatorListener = this.f329771d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        CropLayout.C106804b onChangeListener = this.f329772e.getOnChangeListener();
        CropLayout.C106805c cVar = onChangeListener instanceof CropLayout.C106805c ? (CropLayout.C106805c) onChangeListener : null;
        if (cVar != null) {
            cVar.mo154489a();
        }
    }

    public void onAnimationRepeat(Animator animator) {
        C87412m.m108594g(animator, "animation");
        Animator.AnimatorListener animatorListener = this.f329771d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animation");
        Animator.AnimatorListener animatorListener = this.f329771d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
