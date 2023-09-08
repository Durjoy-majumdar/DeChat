package br3;

import android.animation.Animator;
import android.widget.RelativeLayout;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton;

/* renamed from: br3.h */
public class C67318h implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ WcPayKeyboardAnimationActionButton f193154d;

    public C67318h(WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton) {
        this.f193154d = wcPayKeyboardAnimationActionButton;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f193154d;
        wcPayKeyboardAnimationActionButton.f220936A = true;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) wcPayKeyboardAnimationActionButton.getLayoutParams();
        WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton2 = this.f193154d;
        int i = wcPayKeyboardAnimationActionButton2.f220959n;
        int i2 = wcPayKeyboardAnimationActionButton2.f220962q;
        layoutParams.height = ((i - i2) / 2) + i2;
        wcPayKeyboardAnimationActionButton2.setLayoutParams(layoutParams);
        this.f193154d.invalidate();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
