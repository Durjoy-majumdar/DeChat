package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.ImageView;
import gy3.C87412m;
import qj1.C63049v9;

/* renamed from: qj1.z9 */
public final class C63160z9 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f179214d;

    /* renamed from: e */
    public final /* synthetic */ C63049v9 f179215e;

    /* renamed from: f */
    public final /* synthetic */ PointF f179216f;

    /* renamed from: g */
    public final /* synthetic */ PointF f179217g;

    /* renamed from: qj1.z9$a */
    public static final class C63161a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ ImageView f179218d;

        /* renamed from: e */
        public final /* synthetic */ C63049v9 f179219e;

        /* renamed from: f */
        public final /* synthetic */ PointF f179220f;

        /* renamed from: g */
        public final /* synthetic */ PointF f179221g;

        public C63161a(ImageView imageView, C63049v9 v9Var, PointF pointF, PointF pointF2) {
            this.f179218d = imageView;
            this.f179219e = v9Var;
            this.f179220f = pointF;
            this.f179221g = pointF2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator.getAnimatedValue() instanceof Float) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                if (floatValue <= 0.3f) {
                    float f = 3.3333333f * floatValue;
                    this.f179218d.setAlpha(f);
                    this.f179218d.setScaleX(f);
                    this.f179218d.setScaleY(f);
                } else {
                    float f2 = 1.0f;
                    if (floatValue > 0.7f) {
                        this.f179218d.setAlpha((1.0f - floatValue) * 3.3333333f);
                        float f3 = 1.0f - ((0.3f - (((float) 1) - floatValue)) * 0.6666666f);
                        int i = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
                        this.f179218d.setScaleX(i > 0 ? 1.0f : f3);
                        ImageView imageView = this.f179218d;
                        if (i <= 0) {
                            f2 = f3;
                        }
                        imageView.setScaleY(f2);
                    } else {
                        this.f179218d.setAlpha(1.0f);
                        this.f179218d.setScaleX(1.0f);
                        this.f179218d.setScaleY(1.0f);
                    }
                }
                C63049v9 v9Var = this.f179219e;
                PointF pointF = this.f179220f;
                PointF pointF2 = this.f179221g;
                v9Var.getClass();
                PointF pointF3 = new PointF();
                pointF3.x = pointF.x;
                float f4 = pointF.y;
                pointF3.y = f4 - ((f4 - pointF2.y) * floatValue);
                ViewGroup.LayoutParams layoutParams = this.f179218d.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) pointF3.x);
                ViewGroup.LayoutParams layoutParams2 = this.f179218d.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) pointF3.y;
                this.f179218d.requestLayout();
            }
        }
    }

    /* renamed from: qj1.z9$b */
    public static final class C63162b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C63049v9 f179222d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f179223e;

        public C63162b(C63049v9 v9Var, ImageView imageView) {
            this.f179222d = v9Var;
            this.f179223e = imageView;
        }

        public void onAnimationCancel(Animator animator) {
            this.f179222d.mo87987b1().removeView(this.f179223e);
        }

        public void onAnimationEnd(Animator animator) {
            this.f179222d.mo87987b1().removeView(this.f179223e);
        }
    }

    public C63160z9(ImageView imageView, C63049v9 v9Var, PointF pointF, PointF pointF2) {
        this.f179214d = imageView;
        this.f179215e = v9Var;
        this.f179216f = pointF;
        this.f179217g = pointF2;
    }

    public final void run() {
        this.f179214d.animate().setDuration(this.f179215e.f178924J).setInterpolator(new C63049v9.C63051b(new PointF(0.18f, 0.3f))).setUpdateListener(new C63161a(this.f179214d, this.f179215e, this.f179216f, this.f179217g)).setListener(new C63162b(this.f179215e, this.f179214d)).start();
    }
}
