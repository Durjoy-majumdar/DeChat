package br3;

import android.animation.ValueAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton;

/* renamed from: br3.i */
public class C67319i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ WcPayKeyboardAnimationActionButton f193155d;

    public C67319i(WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton) {
        this.f193155d = wcPayKeyboardAnimationActionButton;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f193155d.f220965t = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Log.m105927v("MicroMsg.WcPayKeyBoard.WcPayKeyboardAnimationActionButton", "interim_width:%s", Integer.valueOf(this.f193155d.f220965t));
        this.f193155d.invalidate();
    }
}
