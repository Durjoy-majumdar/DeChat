package g63;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardLuckyMoneyDialog;

/* renamed from: g63.l */
public class C45896l implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ View f123859a;

    /* renamed from: b */
    public final /* synthetic */ ScaleAnimation f123860b;

    public C45896l(WalletSuccPageAwardLuckyMoneyDialog walletSuccPageAwardLuckyMoneyDialog, View view, ScaleAnimation scaleAnimation) {
        this.f123859a = view;
        this.f123860b = scaleAnimation;
    }

    public void onAnimationEnd(Animation animation) {
        this.f123859a.startAnimation(this.f123860b);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
