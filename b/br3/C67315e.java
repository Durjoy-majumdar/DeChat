package br3;

import android.view.animation.Animation;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;

/* renamed from: br3.e */
public class C67315e implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f193151a;

    /* renamed from: b */
    public final /* synthetic */ WcPayKeyboard f193152b;

    public C67315e(WcPayKeyboard wcPayKeyboard, boolean z) {
        this.f193152b = wcPayKeyboard;
        this.f193151a = z;
    }

    public void onAnimationEnd(Animation animation) {
        this.f193152b.f220917x.setVisibility(4);
        if (this.f193151a) {
            this.f193152b.setVisibility(8);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
