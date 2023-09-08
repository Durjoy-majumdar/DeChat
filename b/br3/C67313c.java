package br3;

import android.animation.AnimatorSet;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;

/* renamed from: br3.c */
public class C67313c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WcPayKeyboard f193149d;

    public C67313c(WcPayKeyboard wcPayKeyboard) {
        this.f193149d = wcPayKeyboard;
    }

    public void run() {
        AnimatorSet animatorSet = this.f193149d.f220917x.f220948M;
        if (animatorSet != null) {
            animatorSet.start();
        }
        this.f193149d.mo104742g(false);
    }
}
