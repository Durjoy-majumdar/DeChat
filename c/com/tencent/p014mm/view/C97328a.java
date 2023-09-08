package com.tencent.p014mm.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.tencent.p014mm.view.ViewAnimHelper;

/* renamed from: com.tencent.mm.view.a */
public class C97328a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f285665d;

    /* renamed from: e */
    public final /* synthetic */ ViewAnimHelper.ViewInfo f285666e;

    /* renamed from: f */
    public final /* synthetic */ View f285667f;

    /* renamed from: g */
    public final /* synthetic */ Animator.AnimatorListener f285668g;

    /* renamed from: h */
    public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f285669h;

    /* renamed from: i */
    public final /* synthetic */ AnimationLayout f285670i;

    /* renamed from: com.tencent.mm.view.a$a */
    public class C97329a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public Matrix f285671d = new Matrix();

        /* renamed from: e */
        public final /* synthetic */ float f285672e;

        /* renamed from: f */
        public final /* synthetic */ float f285673f;

        /* renamed from: g */
        public final /* synthetic */ float f285674g;

        /* renamed from: h */
        public final /* synthetic */ float f285675h;

        public C97329a(float f, float f2, float f3, float f4) {
            this.f285672e = f;
            this.f285673f = f2;
            this.f285674g = f3;
            this.f285675h = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f285672e > 1.0f) {
                this.f285671d.setScale(((this.f285673f * floatValue) / this.f285674g) + (1.0f - floatValue), 1.0f, (float) C97328a.this.f285670i.f285619e.centerX(), (float) C97328a.this.f285670i.f285619e.centerY());
            } else if (this.f285675h > 1.0f) {
                this.f285671d.setScale(1.0f, ((this.f285674g * floatValue) / this.f285673f) + (1.0f - floatValue), (float) C97328a.this.f285670i.f285619e.centerX(), (float) C97328a.this.f285670i.f285619e.centerY());
            }
            this.f285671d.mapRect(C97328a.this.f285670i.f285618d, new RectF(C97328a.this.f285670i.f285619e));
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = C97328a.this.f285669h;
            if (animatorUpdateListener != null) {
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
            C97328a.this.f285670i.invalidate();
        }
    }

    public C97328a(AnimationLayout animationLayout, View view, ViewAnimHelper.ViewInfo viewInfo, View view2, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f285670i = animationLayout;
        this.f285665d = view;
        this.f285666e = viewInfo;
        this.f285667f = view2;
        this.f285668g = animatorListener;
        this.f285669h = animatorUpdateListener;
    }

    public void run() {
        ViewAnimHelper.ViewInfo b = ViewAnimHelper.m90033b(this.f285670i, this.f285665d);
        float width = (((float) b.f220867d.width()) * 1.0f) / ((float) this.f285666e.f220867d.width());
        float height = (((float) b.f220867d.height()) * 1.0f) / ((float) this.f285666e.f220867d.height());
        float f = width > height ? width : 1.0f;
        float f2 = height > width ? height : 1.0f;
        ViewAnimHelper.m90032a(this.f285670i, this.f285667f, this.f285666e, this.f285668g, (f > 1.0f || f2 > 1.0f) ? new C97329a(f, height, width, f2) : null);
    }
}
