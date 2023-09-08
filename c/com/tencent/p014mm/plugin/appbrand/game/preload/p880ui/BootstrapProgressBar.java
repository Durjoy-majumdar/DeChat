package com.tencent.p014mm.plugin.appbrand.game.preload.p880ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar */
public class BootstrapProgressBar extends View implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public Paint f197076d;

    /* renamed from: e */
    public Paint f197077e;

    /* renamed from: f */
    public Paint f197078f;

    /* renamed from: g */
    public float f197079g = 0.0f;

    /* renamed from: h */
    public float f197080h = 0.0f;

    /* renamed from: i */
    public float f197081i = 100.0f;

    /* renamed from: j */
    public boolean f197082j = false;

    /* renamed from: n */
    public boolean f197083n = false;

    /* renamed from: o */
    public boolean f197084o = true;

    /* renamed from: p */
    public boolean f197085p = true;

    /* renamed from: q */
    public boolean f197086q = true;

    /* renamed from: r */
    public ValueAnimator f197087r;

    /* renamed from: s */
    public Paint f197088s;

    /* renamed from: t */
    public Canvas f197089t;

    /* renamed from: u */
    public Bitmap f197090u;

    /* renamed from: v */
    public Bitmap f197091v;

    /* renamed from: w */
    public int f197092w;

    /* renamed from: com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar$a */
    public class C68612a implements ValueAnimator.AnimatorUpdateListener {
        public C68612a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BootstrapProgressBar.this.invalidate();
        }
    }

    public BootstrapProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94282a();
    }

    /* renamed from: a */
    public final void mo94282a() {
        Log.m105918d("BootstrapProgressBar", "initialise");
        ValueAnimator.setFrameDelay(15);
        this.f197088s = new Paint();
        Paint paint = new Paint();
        this.f197076d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f197076d.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f197077e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f197077e.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f197078f = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f197078f.setARGB(38, 0, 0, 0);
        setProgress(this.f197079g);
        setMaxProgress(this.f197081i);
    }

    /* renamed from: b */
    public final void mo94283b() {
        if (this.f197082j && this.f197083n) {
            clearAnimation();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
            this.f197087r = ofFloat;
            ofFloat.setDuration(300);
            this.f197087r.setRepeatCount(-1);
            this.f197087r.setRepeatMode(1);
            this.f197087r.setInterpolator(new LinearInterpolator());
            this.f197087r.addUpdateListener(new C68612a());
            this.f197087r.start();
        }
    }

    public float getMaxProgress() {
        return this.f197081i;
    }

    public float getProgress() {
        return this.f197079g;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        mo94283b();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f197080h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (width > 0.0f && height > 0.0f) {
            if (this.f197090u == null) {
                this.f197090u = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
            }
            if (this.f197089t == null) {
                this.f197089t = new Canvas(this.f197090u);
            }
            this.f197089t.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = this.f197079g / this.f197081i;
            int i = (int) (width * f);
            float currentTimeMillis = (!this.f197082j || !this.f197083n) ? 0.0f : height * 2.0f * (1.0f - (((float) (System.currentTimeMillis() % 370)) / 370.0f));
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i2 < 0) {
                this.f197089t.save();
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                float f2 = (float) i;
                path.lineTo(f2, 0.0f);
                path.lineTo(f2 - height, height);
                path.lineTo(0.0f, height);
                this.f197089t.clipPath(path);
            }
            if (this.f197082j) {
                if (this.f197091v == null) {
                    Paint paint = this.f197077e;
                    Paint paint2 = this.f197076d;
                    int i3 = (int) height;
                    Bitmap createBitmap = Bitmap.createBitmap(i3 * 2, i3, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    Path path2 = new Path();
                    path2.moveTo(0.0f, 0.0f);
                    path2.lineTo(height, 0.0f);
                    path2.lineTo(0.0f, height);
                    canvas2.drawPath(path2, paint);
                    path2.reset();
                    float f3 = height + 0.0f;
                    path2.moveTo(f3, 0.0f);
                    path2.lineTo(0.0f, height);
                    path2.lineTo(f3, height);
                    float f4 = (height * 2.0f) + 0.0f;
                    path2.lineTo(f4, 0.0f);
                    canvas2.drawPath(path2, paint2);
                    path2.reset();
                    path2.moveTo(f4, 0.0f);
                    path2.lineTo(f4 - height, height);
                    path2.lineTo(f4, height);
                    canvas2.drawPath(path2, paint);
                    this.f197091v = createBitmap;
                }
                for (float f5 = 0.0f - currentTimeMillis; f5 < ((float) i); f5 += (float) this.f197091v.getWidth()) {
                    this.f197089t.drawBitmap(this.f197091v, f5, 0.0f, this.f197088s);
                }
            } else {
                this.f197089t.drawRect(0.0f, 0.0f, (float) i, height, this.f197076d);
            }
            if (i2 < 0) {
                this.f197089t.restore();
            }
            Path path3 = new Path();
            path3.moveTo(0.0f, 0.0f);
            path3.lineTo(width, 0.0f);
            path3.lineTo(width, height);
            path3.lineTo(0.0f, height);
            this.f197089t.drawPath(path3, this.f197078f);
            float f6 = this.f197084o ? height / 2.0f : 0.0f;
            Bitmap bitmap = this.f197090u;
            boolean z = this.f197086q;
            boolean z2 = this.f197085p;
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(createBitmap2);
            Paint paint3 = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Rect rect2 = new Rect(0, 0, bitmap.getWidth() / 2, bitmap.getHeight());
            Rect rect3 = new Rect(bitmap.getWidth() / 2, 0, bitmap.getWidth(), bitmap.getHeight());
            paint3.setAntiAlias(true);
            paint3.setColor(-1);
            paint3.setStyle(Paint.Style.FILL);
            canvas3.drawARGB(0, 0, 0, 0);
            canvas3.drawRoundRect(new RectF(rect), f6, f6, paint3);
            if (!z2) {
                canvas3.drawRect(rect2, paint3);
            }
            if (!z) {
                canvas3.drawRect(rect3, paint3);
            }
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas3.drawBitmap(bitmap, rect, rect, paint3);
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, this.f197088s);
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            this.f197091v = null;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setAnimated(boolean z) {
        this.f197083n = z;
        invalidate();
        mo94283b();
    }

    public void setMaxProgress(float f) {
        if (getProgress() <= f) {
            this.f197081i = f;
            invalidate();
            return;
        }
        throw new IllegalArgumentException(String.format("MaxProgress cant be smaller than the current progress %d<%d", new Object[]{Float.valueOf(getProgress()), Float.valueOf(f)}));
    }

    public void setProgress(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > this.f197081i) {
            f = 100.0f;
        }
        this.f197079g = f;
        if (this.f197083n) {
            clearAnimation();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f197080h, this.f197079g});
            this.f197087r = ofFloat;
            ofFloat.setDuration(300);
            this.f197087r.setRepeatCount(0);
            this.f197087r.setRepeatMode(1);
            this.f197087r.setInterpolator(new LinearInterpolator());
            this.f197087r.addUpdateListener(this);
            this.f197087r.addListener(this);
            this.f197087r.start();
            return;
        }
        this.f197080h = f;
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f197092w = i;
        this.f197076d.setColor(i);
        Paint paint = this.f197077e;
        int i2 = this.f197092w;
        paint.setColor(Color.rgb(((int) ((((float) Color.red(i2)) * 0.7f) + (((float) Color.red(-16777216)) * 0.3f))) / 1, ((int) ((((float) Color.green(i2)) * 0.7f) + (((float) Color.green(-16777216)) * 0.3f))) / 1, ((int) ((((float) Color.blue(i2)) * 0.7f) + (((float) Color.blue(-16777216)) * 0.3f))) / 1));
        this.f197091v = null;
        this.f197090u = null;
        this.f197089t = null;
        invalidate();
    }

    public void setStriped(boolean z) {
        this.f197082j = z;
        invalidate();
        mo94283b();
    }

    public BootstrapProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94282a();
    }
}
