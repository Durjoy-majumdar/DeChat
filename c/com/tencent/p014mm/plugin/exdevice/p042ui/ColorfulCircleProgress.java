package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.wxmm.v2helper;
import gy3.C87412m;
import kotlin.Metadata;
import t00.C110883a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/exdevice/ui/ColorfulCircleProgress;", "Landroid/view/View;", "", "d", "I", "getAnimateDuration", "()I", "setAnimateDuration", "(I)V", "animateDuration", "e", "getOutDestDegree", "setOutDestDegree", "outDestDegree", "f", "getMidDestDegree", "setMidDestDegree", "midDestDegree", "g", "getInnerDestDegree", "setInnerDestDegree", "innerDestDegree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.exdevice.ui.ColorfulCircleProgress */
public final class ColorfulCircleProgress extends View {

    /* renamed from: A */
    public final Paint f312581A;

    /* renamed from: d */
    public int f312582d = 500;

    /* renamed from: e */
    public int f312583e;

    /* renamed from: f */
    public int f312584f;

    /* renamed from: g */
    public int f312585g;

    /* renamed from: h */
    public final int f312586h;

    /* renamed from: i */
    public final int[] f312587i;

    /* renamed from: j */
    public final int f312588j;

    /* renamed from: n */
    public final int[] f312589n;

    /* renamed from: o */
    public final int f312590o;

    /* renamed from: p */
    public final int[] f312591p;

    /* renamed from: q */
    public int[] f312592q;

    /* renamed from: r */
    public final RectF f312593r = new RectF();

    /* renamed from: s */
    public float f312594s;

    /* renamed from: t */
    public final Paint f312595t;

    /* renamed from: u */
    public float f312596u;

    /* renamed from: v */
    public final Matrix f312597v = new Matrix();

    /* renamed from: w */
    public float f312598w;

    /* renamed from: x */
    public final Paint f312599x;

    /* renamed from: y */
    public final Paint f312600y;

    /* renamed from: z */
    public final Paint f312601z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColorfulCircleProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        Paint paint = new Paint();
        this.f312599x = paint;
        this.f312600y = new Paint();
        Paint paint2 = new Paint();
        this.f312601z = paint2;
        Paint paint3 = new Paint();
        this.f312581A = paint3;
        setLayerType(1, (Paint) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C110883a.f331685a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…e.ColorfulProgressCircle)");
        obtainStyledAttributes.getBoolean(0, false);
        int color = obtainStyledAttributes.getColor(8, getResources().getColor(C0966R.color.a7y));
        int color2 = obtainStyledAttributes.getColor(7, getResources().getColor(C0966R.color.a7z));
        this.f312586h = obtainStyledAttributes.getColor(9, getResources().getColor(C0966R.color.f356965a80));
        this.f312587i = new int[]{color, color2};
        int color3 = obtainStyledAttributes.getColor(5, getResources().getColor(C0966R.color.a4j));
        int color4 = obtainStyledAttributes.getColor(4, getResources().getColor(C0966R.color.a4i));
        this.f312588j = obtainStyledAttributes.getColor(6, getResources().getColor(C0966R.color.a4l));
        this.f312589n = new int[]{color3, color4};
        int color5 = obtainStyledAttributes.getColor(2, getResources().getColor(C0966R.color.a08));
        int color6 = obtainStyledAttributes.getColor(1, getResources().getColor(C0966R.color.a07));
        this.f312590o = obtainStyledAttributes.getColor(3, getResources().getColor(C0966R.color.a0_));
        this.f312591p = new int[]{color5, color6};
        obtainStyledAttributes.recycle();
        Paint paint4 = new Paint();
        this.f312595t = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setColor(getResources().getColor(C0966R.color.f3136gk));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        paint2.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        paint3.setColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
        this.f312592q = new int[]{getResources().getColor(C0966R.color.f3131gg), getResources().getColor(C0966R.color.f3131gg), getResources().getColor(C0966R.color.f3131gg)};
        C87412m.m108593f(ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}), "ofFloat(0f, 1f)");
    }

    /* renamed from: b */
    public static void m141305b(ColorfulCircleProgress colorfulCircleProgress, Canvas canvas, int[] iArr, float f, float f2, float f3, int i, Object obj) {
        ColorfulCircleProgress colorfulCircleProgress2 = colorfulCircleProgress;
        int[] iArr2 = iArr;
        float f4 = f;
        float f5 = (i & 16) != 0 ? -90.0f : f3;
        float f6 = colorfulCircleProgress2.f312594s / ((float) 2);
        float[] fArr = {0.0f, f2 / 360.0f};
        int i2 = (f2 > 360.0f ? 1 : (f2 == 360.0f ? 0 : -1));
        if (i2 > 0) {
            fArr[1] = 1.0f;
        }
        SweepGradient sweepGradient = new SweepGradient(f6, f6, iArr, fArr);
        if (i2 > 0) {
            colorfulCircleProgress2.f312597v.setRotate((f2 - ((float) v2helper.VOIP_ENC_HEIGHT_LV1)) + f5, f6, f6);
        } else {
            colorfulCircleProgress2.f312597v.setRotate(f5, f6, f6);
        }
        sweepGradient.setLocalMatrix(colorfulCircleProgress2.f312597v);
        colorfulCircleProgress2.f312595t.setShader(sweepGradient);
        RectF rectF = colorfulCircleProgress2.f312593r;
        float f7 = colorfulCircleProgress2.f312594s - f4;
        rectF.set(f, f, f7, f7);
        if (f2 <= 360.0f) {
            if (canvas != null) {
                canvas.drawArc(colorfulCircleProgress2.f312593r, f5, f2, false, colorfulCircleProgress2.f312595t);
            }
            colorfulCircleProgress.mo149573c(canvas, colorfulCircleProgress2.f312593r, f6 - f4, 0.0f, iArr2[0], false);
        } else if (canvas != null) {
            canvas.drawArc(colorfulCircleProgress2.f312593r, f5 + (f2 - ((float) v2helper.VOIP_ENC_HEIGHT_LV1)), 360.0f, false, colorfulCircleProgress2.f312595t);
        }
        if (iArr2.length != 1) {
            colorfulCircleProgress.mo149573c(canvas, colorfulCircleProgress2.f312593r, f6 - f4, f2, iArr2[1], false);
        }
    }

    /* renamed from: a */
    public final void mo149572a(Canvas canvas, int i, float f, float f2, float f3) {
        RectF rectF = this.f312593r;
        float f4 = this.f312594s;
        rectF.set(f, f, f4 - f, f4 - f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(this.f312598w);
        if (canvas != null) {
            canvas.drawArc(this.f312593r, f3, f2, false, paint);
        }
    }

    /* renamed from: c */
    public final void mo149573c(Canvas canvas, RectF rectF, float f, float f2, int i, boolean z) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        float f3 = f;
        if (z) {
            double d = ((double) ((f2 - 90.0f) + ((float) 5))) * 0.017453292519943295d;
            float f4 = (float) 2;
            double d2 = (double) f3;
            float width = (float) (((double) (rectF2.left + (rectF.width() / f4))) + (Math.cos(d) * d2));
            float height = (float) (((double) (rectF2.top + (rectF.height() / 2.0f))) + (d2 * Math.sin(d)));
            float f5 = width;
            float f6 = height;
            this.f312600y.setShader(new RadialGradient(f5, f6, this.f312598w / f4, this.f312592q, (float[]) null, Shader.TileMode.CLAMP));
            if (canvas2 != null) {
                canvas2.drawCircle(width, height, this.f312598w / f4, this.f312600y);
            }
        }
        double d3 = ((double) (f2 - 90.0f)) * 0.017453292519943295d;
        this.f312599x.setColor(i);
        if (canvas2 != null) {
            float f7 = (float) 2;
            double d4 = (double) f3;
            canvas2.drawCircle((float) (((double) (rectF2.left + (rectF.width() / f7))) + (Math.cos(d3) * d4)), (float) (((double) (rectF2.top + (rectF.height() / 2.0f))) + (d4 * Math.sin(d3))), this.f312598w / f7, this.f312599x);
        }
    }

    public final int getAnimateDuration() {
        return this.f312582d;
    }

    public final int getInnerDestDegree() {
        return this.f312585g;
    }

    public final int getMidDestDegree() {
        return this.f312584f;
    }

    public final int getOutDestDegree() {
        return this.f312583e;
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (canvas2 != null) {
            float f = this.f312594s;
            float f2 = (float) 2;
            canvas2.drawCircle(f / f2, f / f2, f / f2, this.f312601z);
        }
        if (this.f312583e < 360) {
            mo149572a(canvas, this.f312586h, this.f312598w / ((float) 2), 360.0f, 0.0f);
        }
        float f3 = (float) 2;
        m141305b(this, canvas, this.f312587i, this.f312598w / f3, (float) this.f312583e, 0.0f, 16, (Object) null);
        float f4 = this.f312598w;
        float f5 = (f4 / 2.0f) + f4 + this.f312596u;
        int i = this.f312584f;
        if (i < 360) {
            float f6 = ((float) i) + 360.0f;
            float f7 = (((float) i) - 0.049804688f) + f4;
            mo149572a(canvas, this.f312588j, f5, f6, f7);
        }
        m141305b(this, canvas, this.f312589n, f5, (float) this.f312584f, 0.0f, 16, (Object) null);
        float f8 = this.f312598w;
        float f9 = this.f312596u;
        float f15 = (f3 * f8) + (f8 / 2.0f) + f9 + f9;
        int i2 = this.f312585g;
        if (i2 < 360) {
            float f16 = ((float) i2) + 360.0f;
            float f17 = (((float) i2) - 0.049804688f) + f8;
            mo149572a(canvas, this.f312590o, f15, f16, f17);
        }
        m141305b(this, canvas, this.f312591p, f15, (float) this.f312585g, 0.0f, 16, (Object) null);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f312594s = measuredWidth;
        float f = (float) (((double) measuredWidth) * 0.12d);
        this.f312598w = f;
        this.f312596u = measuredWidth * 0.03f;
        this.f312595t.setStrokeWidth(f);
        this.f312581A.setStrokeWidth(this.f312598w);
    }

    public final void setAnimateDuration(int i) {
        this.f312582d = i;
    }

    public final void setInnerDestDegree(int i) {
        this.f312585g = i;
    }

    public final void setMidDestDegree(int i) {
        this.f312584f = i;
    }

    public final void setOutDestDegree(int i) {
        this.f312583e = i;
    }
}
