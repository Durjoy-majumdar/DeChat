package ul2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeMaskView;
import gy3.C87412m;

/* renamed from: ul2.g */
public final class C111202g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeMaskView f333017d;

    public C111202g(ScanCodeMaskView scanCodeMaskView) {
        this.f333017d = scanCodeMaskView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ImageView imageView = this.f333017d.f315999v;
        if (imageView != null) {
            imageView.setTranslationY(floatValue);
            ScanCodeMaskView scanCodeMaskView = this.f333017d;
            float height = ((float) this.f333017d.f315986K.height()) * scanCodeMaskView.f315984I;
            Rect rect = scanCodeMaskView.f315986K;
            float f = floatValue - ((float) rect.top);
            if (f <= height) {
                float f2 = 1.0f - ((height - f) / height);
                ImageView imageView2 = scanCodeMaskView.f315999v;
                if (imageView2 != null) {
                    imageView2.setAlpha(f2);
                } else {
                    C87412m.m108603p("scanLineImageView");
                    throw null;
                }
            } else {
                float f3 = (float) 1;
                ScanCodeMaskView scanCodeMaskView2 = this.f333017d;
                if (f >= ((float) rect.height()) * (f3 - scanCodeMaskView2.f315984I)) {
                    ScanCodeMaskView scanCodeMaskView3 = this.f333017d;
                    float height2 = 1.0f - ((f - (((float) scanCodeMaskView2.f315986K.height()) * (f3 - scanCodeMaskView3.f315984I))) / height);
                    ImageView imageView3 = scanCodeMaskView3.f315999v;
                    if (imageView3 != null) {
                        imageView3.setAlpha(height2);
                    } else {
                        C87412m.m108603p("scanLineImageView");
                        throw null;
                    }
                } else {
                    ImageView imageView4 = scanCodeMaskView2.f315999v;
                    if (imageView4 != null) {
                        imageView4.setAlpha(1.0f);
                    } else {
                        C87412m.m108603p("scanLineImageView");
                        throw null;
                    }
                }
            }
        } else {
            C87412m.m108603p("scanLineImageView");
            throw null;
        }
    }
}
