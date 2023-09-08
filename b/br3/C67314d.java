package br3;

import android.animation.AnimatorSet;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;

/* renamed from: br3.d */
public class C67314d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WcPayKeyboard f193150d;

    public C67314d(WcPayKeyboard wcPayKeyboard) {
        this.f193150d = wcPayKeyboard;
    }

    public void run() {
        WcPayKeyboard wcPayKeyboard = this.f193150d;
        int i = WcPayKeyboard.f220893G;
        wcPayKeyboard.mo104754q(false);
        AnimatorSet animatorSet = this.f193150d.f220917x.f220951Q;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
