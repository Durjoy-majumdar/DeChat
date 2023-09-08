package yz2;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: yz2.i0 */
public final class C53681i0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f150759d;

    /* renamed from: e */
    public final /* synthetic */ int f150760e;

    /* renamed from: f */
    public final /* synthetic */ int f150761f;

    /* renamed from: g */
    public final /* synthetic */ int f150762g;

    /* renamed from: yz2.i0$a */
    public static final class C53682a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ int f150763a;

        /* renamed from: b */
        public final /* synthetic */ int f150764b;

        /* renamed from: c */
        public final /* synthetic */ float f150765c;

        /* renamed from: d */
        public final /* synthetic */ int f150766d;

        public C53682a(int i, int i2, float f, int i3) {
            this.f150763a = i;
            this.f150764b = i2;
            this.f150765c = f;
            this.f150766d = i3;
        }

        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            if (!(view.getWidth() == 0 || view.getHeight() == 0)) {
                float width = ((float) this.f150763a) / ((float) view.getWidth());
                float height = ((float) this.f150764b) / ((float) view.getHeight());
                float f = this.f150765c;
                view.setScaleX(width + ((1.0f - width) * f));
                view.setScaleY(height + ((1.0f - height) * f));
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (((double) this.f150765c) >= 0.9d ? Float.valueOf(0.0f) : Integer.valueOf(this.f150766d)).floatValue());
        }
    }

    public C53681i0(View view, int i, int i2, int i3) {
        this.f150759d = view;
        this.f150760e = i;
        this.f150761f = i2;
        this.f150762g = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "handleEnterAnim2() called fra：" + animatedFraction);
        View view = this.f150759d;
        if (view != null) {
            view.setOutlineProvider(new C53682a(this.f150760e, this.f150761f, animatedFraction, this.f150762g));
        }
    }
}
