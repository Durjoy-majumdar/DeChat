package com.tencent.p014mm.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.tencent.p014mm.view.ViewAnimHelper;

/* renamed from: com.tencent.mm.view.c */
public class C97331c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f285679d;

    /* renamed from: e */
    public final /* synthetic */ ViewAnimHelper.ViewInfo f285680e;

    /* renamed from: f */
    public final /* synthetic */ View f285681f;

    /* renamed from: g */
    public final /* synthetic */ Animator.AnimatorListener f285682g;

    /* renamed from: h */
    public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f285683h;

    /* renamed from: i */
    public final /* synthetic */ AnimationLayout f285684i;

    /* renamed from: com.tencent.mm.view.c$a */
    public class C97332a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public Matrix f285685d = new Matrix();

        /* renamed from: e */
        public final /* synthetic */ float f285686e;

        /* renamed from: f */
        public final /* synthetic */ float f285687f;

        /* renamed from: g */
        public final /* synthetic */ float f285688g;

        /* renamed from: h */
        public final /* synthetic */ float f285689h;

        public C97332a(float f, float f2, float f3, float f4) {
            this.f285686e = f;
            this.f285687f = f2;
            this.f285688g = f3;
            this.f285689h = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f285686e > 1.0f) {
                this.f285685d.setScale(floatValue + ((this.f285687f / this.f285688g) * (1.0f - floatValue)), 1.0f, (float) C97331c.this.f285684i.f285619e.centerX(), (float) C97331c.this.f285684i.f285619e.centerY());
            } else if (this.f285689h > 1.0f) {
                this.f285685d.setScale(1.0f, floatValue + ((this.f285688g / this.f285687f) * (1.0f - floatValue)), (float) C97331c.this.f285684i.f285619e.centerX(), (float) C97331c.this.f285684i.f285619e.centerY());
            }
            this.f285685d.mapRect(C97331c.this.f285684i.f285618d, new RectF(C97331c.this.f285684i.f285619e));
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = C97331c.this.f285683h;
            if (animatorUpdateListener != null) {
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
            C97331c.this.f285684i.invalidate();
        }
    }

    public C97331c(AnimationLayout animationLayout, View view, ViewAnimHelper.ViewInfo viewInfo, View view2, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f285684i = animationLayout;
        this.f285679d = view;
        this.f285680e = viewInfo;
        this.f285681f = view2;
        this.f285682g = animatorListener;
        this.f285683h = animatorUpdateListener;
    }

    public void run() {
        ViewAnimHelper.ViewInfo b = ViewAnimHelper.m90033b(this.f285684i, this.f285679d);
        float width = (((float) b.f220867d.width()) * 1.0f) / ((float) this.f285680e.f220867d.width());
        float height = (((float) b.f220867d.height()) * 1.0f) / ((float) this.f285680e.f220867d.height());
        float f = width > height ? width : 1.0f;
        float f2 = height > width ? height : 1.0f;
        ViewAnimHelper.m90032a(this.f285684i, this.f285681f, this.f285680e, this.f285682g, (f > 1.0f || f2 > 1.0f) ? new C97332a(f, height, width, f2) : null);
    }
}
