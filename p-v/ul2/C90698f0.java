package ul2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.scanner.view.ScanProductDetectRectView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ul2.f0 */
public final class C90698f0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScanProductDetectRectView f260530d;

    /* renamed from: e */
    public final /* synthetic */ float f260531e;

    public C90698f0(ScanProductDetectRectView scanProductDetectRectView, float f) {
        this.f260530d = scanProductDetectRectView;
        this.f260531e = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.3f) {
            this.f260530d.setAlpha(animatedFraction / 0.3f);
            this.f260530d.setScaleX(1.0f);
            this.f260530d.setScaleY(1.0f);
        } else if (animatedFraction <= 0.5f) {
            float f = ((float) 1) + (((animatedFraction - 0.3f) / 0.2f) * this.f260531e);
            this.f260530d.setAlpha(1.0f);
            this.f260530d.setScaleX(f);
            this.f260530d.setScaleY(f);
        } else if (animatedFraction <= 0.7f) {
            float f2 = ((float) 1) + (((0.7f - animatedFraction) / 0.2f) * this.f260531e);
            this.f260530d.setAlpha(1.0f);
            this.f260530d.setScaleX(f2);
            this.f260530d.setScaleY(f2);
        } else {
            this.f260530d.setAlpha((((float) 1) - animatedFraction) / 0.3f);
            this.f260530d.setScaleX(1.0f);
            this.f260530d.setScaleY(1.0f);
        }
        Log.m105924i("MicroMsg.ScanProductMaskDecorView", "fraction:" + animatedFraction + "  alpha:" + this.f260530d.getAlpha() + "  scale:" + this.f260530d.getScaleY());
    }
}
