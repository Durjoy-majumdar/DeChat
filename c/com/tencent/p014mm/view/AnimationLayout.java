package com.tencent.p014mm.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.view.ViewAnimHelper;

/* renamed from: com.tencent.mm.view.AnimationLayout */
public class AnimationLayout extends FrameLayout {

    /* renamed from: d */
    public RectF f285618d = new RectF();

    /* renamed from: e */
    public Rect f285619e = new Rect();

    /* renamed from: com.tencent.mm.view.AnimationLayout$a */
    public class C97320a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public Matrix f285620d = new Matrix();

        /* renamed from: e */
        public final /* synthetic */ float f285621e;

        /* renamed from: f */
        public final /* synthetic */ float f285622f;

        /* renamed from: g */
        public final /* synthetic */ float f285623g;

        /* renamed from: h */
        public final /* synthetic */ float f285624h;

        /* renamed from: i */
        public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f285625i;

        public C97320a(float f, float f2, float f3, float f4, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            this.f285621e = f;
            this.f285622f = f2;
            this.f285623g = f3;
            this.f285624h = f4;
            this.f285625i = animatorUpdateListener;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.f285621e;
            if (f > 1.0f || this.f285622f > 1.0f) {
                if (f > 1.0f) {
                    this.f285620d.setScale(((this.f285623g * floatValue) / this.f285624h) + (1.0f - floatValue), 1.0f, (float) AnimationLayout.this.f285619e.centerX(), (float) AnimationLayout.this.f285619e.centerY());
                } else if (this.f285622f > 1.0f) {
                    this.f285620d.setScale(1.0f, ((this.f285624h * floatValue) / this.f285623g) + (1.0f - floatValue), (float) AnimationLayout.this.f285619e.centerX(), (float) AnimationLayout.this.f285619e.centerY());
                }
                this.f285620d.mapRect(AnimationLayout.this.f285618d, new RectF(AnimationLayout.this.f285619e));
                AnimationLayout.this.invalidate();
            }
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f285625i;
            if (animatorUpdateListener != null) {
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
        }
    }

    public AnimationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo136401a(View view, View view2, ViewAnimHelper.ViewInfo viewInfo, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ViewAnimHelper.ViewInfo viewInfo2 = viewInfo;
        ViewAnimHelper.ViewInfo b = ViewAnimHelper.m90033b(this, view2);
        float width = (((float) b.f220867d.width()) * 1.0f) / ((float) viewInfo2.f220867d.width());
        float height = (((float) b.f220867d.height()) * 1.0f) / ((float) viewInfo2.f220867d.height());
        C97320a aVar = new C97320a(width > height ? width : 1.0f, height > width ? height : 1.0f, height, width, animatorUpdateListener);
        ViewAnimHelper.ViewInfo b2 = ViewAnimHelper.m90033b(this, (View) null);
        float max = Math.max((((float) viewInfo2.f220867d.height()) * 1.0f) / ((float) b2.f220867d.height()), (((float) viewInfo2.f220867d.width()) * 1.0f) / ((float) b2.f220867d.width()));
        float scaleX = getScaleX();
        float translationX = getTranslationX();
        float scaleY = getScaleY();
        float translationY = getTranslationY();
        float alpha = view.getAlpha();
        float centerX = (float) b2.f220867d.centerX();
        float centerY = (float) b2.f220867d.centerY();
        float centerX2 = (float) viewInfo2.f220867d.centerX();
        float centerY2 = (float) viewInfo2.f220867d.centerY();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new DecelerateInterpolator(1.2f));
        C7085o oVar = r0;
        C7085o oVar2 = new C7085o(this, translationX, centerX2, centerX, translationY, centerY2, centerY, scaleX, max, scaleY, view, alpha, aVar);
        ofFloat.addUpdateListener(oVar);
        ofFloat.addListener(new C106866p(animatorListener));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(240);
        ofFloat.start();
    }

    public void draw(Canvas canvas) {
        if (this.f285619e.isEmpty()) {
            canvas.getClipBounds(this.f285619e);
        }
        if (this.f285618d.isEmpty()) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(this.f285618d);
        super.draw(canvas);
        canvas.restore();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getBackground() == null) {
            setBackgroundColor(0);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f285618d.setEmpty();
    }

    public AnimationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
