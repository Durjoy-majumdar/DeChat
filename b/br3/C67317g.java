package br3;

import android.animation.ValueAnimator;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton;

/* renamed from: br3.g */
public class C67317g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ WcPayKeyboardAnimationActionButton f193153d;

    public C67317g(WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton) {
        this.f193153d = wcPayKeyboardAnimationActionButton;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f193153d.f220964s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Log.m105927v("MicroMsg.WcPayKeyBoard.WcPayKeyboardAnimationActionButton", "interim_height:%s", Integer.valueOf(this.f193153d.f220964s));
        WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f193153d;
        if (wcPayKeyboardAnimationActionButton.f220964s <= wcPayKeyboardAnimationActionButton.f220962q) {
            wcPayKeyboardAnimationActionButton.f220936A = true;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) wcPayKeyboardAnimationActionButton.getLayoutParams();
            WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton2 = this.f193153d;
            int i = wcPayKeyboardAnimationActionButton2.f220959n;
            int i2 = wcPayKeyboardAnimationActionButton2.f220962q;
            layoutParams.height = ((i - i2) / 2) + i2;
            wcPayKeyboardAnimationActionButton2.setLayoutParams(layoutParams);
        }
        this.f193153d.invalidate();
    }
}
