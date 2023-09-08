package com.tencent.p014mm.plugin.scanner.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.scanner.view.ScanRectDecorView */
public class ScanRectDecorView extends FrameLayout {

    /* renamed from: d */
    public ValueAnimator f53880d;

    /* renamed from: e */
    public ImageView f53881e;

    /* renamed from: f */
    public RectView f53882f;

    /* renamed from: g */
    public Rect f53883g;

    /* renamed from: h */
    public int f53884h;

    /* renamed from: i */
    public int f53885i;

    /* renamed from: j */
    public float f53886j = 0.0f;

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanRectDecorView$a */
    public class C19143a extends AnimatorListenerAdapter {
        public C19143a() {
        }

        public void onAnimationEnd(Animator animator) {
            ScanRectDecorView.this.f53881e.setVisibility(8);
        }

        public void onAnimationStart(Animator animator) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ScanRectDecorView.this.f53881e.getLayoutParams();
            layoutParams.topMargin = ScanRectDecorView.this.f53882f.getRect().top;
            ScanRectDecorView.this.f53881e.setLayoutParams(layoutParams);
            ScanRectDecorView.this.f53881e.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanRectDecorView$b */
    public class C19144b implements ValueAnimator.AnimatorUpdateListener {
        public C19144b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ScanRectDecorView.this.f53881e.getLayoutParams();
            int i = ScanRectDecorView.this.f53882f.getRect().top;
            ScanRectDecorView scanRectDecorView = ScanRectDecorView.this;
            layoutParams.topMargin = i + ((int) (((float) (scanRectDecorView.f53885i - scanRectDecorView.f53881e.getHeight())) * floatValue));
            ScanRectDecorView.this.f53881e.setLayoutParams(layoutParams);
            ScanRectDecorView scanRectDecorView2 = ScanRectDecorView.this;
            float f = scanRectDecorView2.f53886j;
            if (floatValue <= f) {
                scanRectDecorView2.f53881e.setAlpha(1.0f - ((f - floatValue) / f));
            } else if (floatValue >= 1.0f - f) {
                scanRectDecorView2.f53881e.setAlpha(1.0f - ((floatValue - (1.0f - f)) / f));
            } else {
                scanRectDecorView2.f53881e.setAlpha(1.0f);
            }
        }
    }

    public ScanRectDecorView(Context context) {
        super(context);
        mo24539a();
    }

    /* renamed from: a */
    public final void mo24539a() {
        this.f53884h = getContext().getResources().getDimensionPixelSize(C0966R.dimen.alk);
        this.f53885i = getContext().getResources().getDimensionPixelSize(C0966R.dimen.alj);
        RectView rectView = new RectView(getContext());
        this.f53882f = rectView;
        addView(rectView, new FrameLayout.LayoutParams(-1, -1));
        mo24540b();
        setWillNotDraw(false);
        ImageView imageView = new ImageView(getContext());
        this.f53881e = imageView;
        addView(imageView, new FrameLayout.LayoutParams(this.f53884h, -2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53881e.getLayoutParams();
        layoutParams.gravity = 1;
        this.f53881e.setLayoutParams(layoutParams);
        this.f53881e.setBackgroundResource(C0966R.C0969drawable.f357323ca0);
        this.f53881e.setVisibility(8);
        this.f53886j = 0.15384616f;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(1300);
        this.f53880d = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f53880d.addListener(new C19143a());
        this.f53880d.addUpdateListener(new C19144b());
        this.f53880d.setRepeatMode(1);
        this.f53880d.setRepeatCount(-1);
    }

    /* renamed from: b */
    public final void mo24540b() {
        Point point = new Point();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getSize(point);
        int i = (point.x / 2) - (this.f53884h / 2);
        int i2 = (point.y / 2) - (this.f53885i / 2);
        Rect rect = new Rect(i, i2, this.f53884h + i, this.f53885i + i2);
        this.f53883g = rect;
        this.f53882f.setRect(rect);
    }

    /* renamed from: c */
    public void mo24541c(int i, int i2) {
        this.f53884h = i;
        this.f53885i = i2;
        mo24540b();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53881e.getLayoutParams();
        layoutParams.width = i;
        this.f53881e.setLayoutParams(layoutParams);
    }

    public Rect getDecorRect() {
        return this.f53883g;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f53880d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setDecorRect(Rect rect) {
        if (rect != null) {
            this.f53884h = rect.width();
            this.f53885i = rect.height();
            this.f53883g = new Rect(rect);
        }
        this.f53882f.setRect(this.f53883g);
        this.f53882f.postInvalidate();
    }

    public ScanRectDecorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo24539a();
    }

    public ScanRectDecorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo24539a();
    }
}
