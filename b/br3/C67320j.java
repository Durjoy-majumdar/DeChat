package br3;

import android.animation.ValueAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton;

/* renamed from: br3.j */
public class C67320j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ WcPayKeyboardAnimationActionButton f193156d;

    public C67320j(WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton) {
        this.f193156d = wcPayKeyboardAnimationActionButton;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f193156d.f220964s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Log.m105927v("MicroMsg.WcPayKeyBoard.WcPayKeyboardAnimationActionButton", "interim_height:%s", Integer.valueOf(this.f193156d.f220964s));
        this.f193156d.invalidate();
    }
}
