package h21;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import e21.C116673y0;

/* renamed from: h21.s1 */
public class C117046s1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C116673y0.C116675c f350715d;

    public C117046s1(WalletCollectQrCodeUI walletCollectQrCodeUI, C116673y0.C116675c cVar) {
        this.f350715d = cVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f350715d.f349896T.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
