package br3;

import android.view.animation.Animation;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;

/* renamed from: br3.a */
public class C67310a implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f193144a;

    /* renamed from: b */
    public final /* synthetic */ WcPayKeyboard f193145b;

    public C67310a(WcPayKeyboard wcPayKeyboard, boolean z) {
        this.f193145b = wcPayKeyboard;
        this.f193144a = z;
    }

    public void onAnimationEnd(Animation animation) {
        this.f193145b.f220916w.setVisibility(4);
        if (this.f193144a) {
            this.f193145b.setVisibility(8);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
