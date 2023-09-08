package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.ImageView;
import gy3.C87412m;
import qj1.C63049v9;

/* renamed from: qj1.w9 */
public final class C63087w9 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f179026d;

    /* renamed from: e */
    public final /* synthetic */ C63049v9 f179027e;

    /* renamed from: f */
    public final /* synthetic */ PointF f179028f;

    /* renamed from: g */
    public final /* synthetic */ PointF f179029g;

    /* renamed from: h */
    public final /* synthetic */ PointF f179030h;

    /* renamed from: i */
    public final /* synthetic */ PointF f179031i;

    /* renamed from: j */
    public final /* synthetic */ PointF f179032j;

    /* renamed from: qj1.w9$a */
    public static final class C63088a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ ImageView f179033d;

        /* renamed from: e */
        public final /* synthetic */ C63049v9 f179034e;

        /* renamed from: f */
        public final /* synthetic */ PointF f179035f;

        /* renamed from: g */
        public final /* synthetic */ PointF f179036g;

        /* renamed from: h */
        public final /* synthetic */ PointF f179037h;

        /* renamed from: i */
        public final /* synthetic */ PointF f179038i;

        /* renamed from: j */
        public final /* synthetic */ PointF f179039j;

        public C63088a(ImageView imageView, C63049v9 v9Var, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5) {
            this.f179033d = imageView;
            this.f179034e = v9Var;
            this.f179035f = pointF;
            this.f179036g = pointF2;
            this.f179037h = pointF3;
            this.f179038i = pointF4;
            this.f179039j = pointF5;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PointF pointF;
            if (valueAnimator.getAnimatedValue() instanceof Float) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                int i = (floatValue > 0.3f ? 1 : (floatValue == 0.3f ? 0 : -1));
                if (i <= 0) {
                    float f = 3.3333333f * floatValue;
                    this.f179033d.setAlpha(f);
                    this.f179033d.setScaleX(f);
                    this.f179033d.setScaleY(f);
                } else {
                    float f2 = 1.0f;
                    if (floatValue > 0.7f) {
                        this.f179033d.setAlpha((1.0f - floatValue) * 3.3333333f);
                        float f3 = 1.0f - ((0.3f - (((float) 1) - floatValue)) * 0.6666666f);
                        int i2 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
                        this.f179033d.setScaleX(i2 > 0 ? 1.0f : f3);
                        ImageView imageView = this.f179033d;
                        if (i2 <= 0) {
                            f2 = f3;
                        }
                        imageView.setScaleY(f2);
                    } else {
                        this.f179033d.setAlpha(1.0f);
                        this.f179033d.setScaleX(1.0f);
                        this.f179033d.setScaleY(1.0f);
                    }
                }
                if (i < 0) {
                    C63049v9 v9Var = this.f179034e;
                    PointF pointF2 = this.f179035f;
                    PointF pointF3 = this.f179036g;
                    v9Var.getClass();
                    pointF = new PointF();
                    pointF.x = pointF2.x;
                    float f4 = pointF2.y;
                    pointF.y = f4 - ((f4 - pointF3.y) * floatValue);
                } else {
                    float f5 = (floatValue - 0.3f) / 0.7f;
                    PointF pointF4 = this.f179037h;
                    PointF pointF5 = this.f179038i;
                    PointF pointF6 = this.f179039j;
                    C87412m.m108594g(pointF4, "p0");
                    C87412m.m108594g(pointF5, "p1");
                    C87412m.m108594g(pointF6, "p2");
                    PointF pointF7 = new PointF();
                    float f6 = ((float) 1) - f5;
                    float f7 = f6 * f6;
                    float f8 = ((float) 2) * f5 * f6;
                    float f9 = f5 * f5;
                    pointF7.x = (pointF4.x * f7) + (pointF5.x * f8) + (pointF6.x * f9);
                    pointF7.y = (f7 * pointF4.y) + (f8 * pointF5.y) + (f9 * pointF6.y);
                    pointF = pointF7;
                }
                ViewGroup.LayoutParams layoutParams = this.f179033d.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) pointF.x);
                ViewGroup.LayoutParams layoutParams2 = this.f179033d.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) pointF.y;
                this.f179033d.requestLayout();
            }
        }
    }

    /* renamed from: qj1.w9$b */
    public static final class C63089b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C63049v9 f179040d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f179041e;

        public C63089b(C63049v9 v9Var, ImageView imageView) {
            this.f179040d = v9Var;
            this.f179041e = imageView;
        }

        public void onAnimationCancel(Animator animator) {
            this.f179040d.mo87987b1().removeView(this.f179041e);
        }

        public void onAnimationEnd(Animator animator) {
            this.f179040d.mo87987b1().removeView(this.f179041e);
        }
    }

    public C63087w9(ImageView imageView, C63049v9 v9Var, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5) {
        this.f179026d = imageView;
        this.f179027e = v9Var;
        this.f179028f = pointF;
        this.f179029g = pointF2;
        this.f179030h = pointF3;
        this.f179031i = pointF4;
        this.f179032j = pointF5;
    }

    public final void run() {
        this.f179026d.animate().setDuration(this.f179027e.f178924J).setInterpolator(new C63049v9.C63051b(new PointF(0.18f, 0.3f))).setUpdateListener(new C63088a(this.f179026d, this.f179027e, this.f179028f, this.f179029g, this.f179030h, this.f179031i, this.f179032j)).setListener(new C63089b(this.f179027e, this.f179026d)).start();
    }
}
