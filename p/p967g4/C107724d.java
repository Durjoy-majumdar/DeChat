package p967g4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p1136n3.C109678b;
import p1136n3.C109680d;

/* renamed from: g4.d */
public class C107724d extends Drawable implements Animatable {

    /* renamed from: j */
    public static final Interpolator f322320j = new LinearInterpolator();

    /* renamed from: n */
    public static final Interpolator f322321n = new C109678b();

    /* renamed from: o */
    public static final int[] f322322o = {-16777216};

    /* renamed from: d */
    public final C107725a f322323d;

    /* renamed from: e */
    public float f322324e;

    /* renamed from: f */
    public Resources f322325f;

    /* renamed from: g */
    public Animator f322326g;

    /* renamed from: h */
    public float f322327h;

    /* renamed from: i */
    public boolean f322328i;

    /* renamed from: g4.d$a */
    public static class C107725a {

        /* renamed from: a */
        public final RectF f322329a = new RectF();

        /* renamed from: b */
        public final Paint f322330b;

        /* renamed from: c */
        public final Paint f322331c;

        /* renamed from: d */
        public final Paint f322332d;

        /* renamed from: e */
        public float f322333e;

        /* renamed from: f */
        public float f322334f;

        /* renamed from: g */
        public float f322335g;

        /* renamed from: h */
        public float f322336h;

        /* renamed from: i */
        public int[] f322337i;

        /* renamed from: j */
        public int f322338j;

        /* renamed from: k */
        public float f322339k;

        /* renamed from: l */
        public float f322340l;

        /* renamed from: m */
        public float f322341m;

        /* renamed from: n */
        public boolean f322342n;

        /* renamed from: o */
        public Path f322343o;

        /* renamed from: p */
        public float f322344p;

        /* renamed from: q */
        public float f322345q;

        /* renamed from: r */
        public int f322346r;

        /* renamed from: s */
        public int f322347s;

        /* renamed from: t */
        public int f322348t;

        /* renamed from: u */
        public int f322349u;

        public C107725a() {
            Paint paint = new Paint();
            this.f322330b = paint;
            Paint paint2 = new Paint();
            this.f322331c = paint2;
            Paint paint3 = new Paint();
            this.f322332d = paint3;
            this.f322333e = 0.0f;
            this.f322334f = 0.0f;
            this.f322335g = 0.0f;
            this.f322336h = 5.0f;
            this.f322344p = 1.0f;
            this.f322348t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: a */
        public void mo158143a(int i) {
            this.f322338j = i;
            this.f322349u = this.f322337i[i];
        }
    }

    public C107724d(Context context) {
        context.getClass();
        this.f322325f = context.getResources();
        C107725a aVar = new C107725a();
        this.f322323d = aVar;
        aVar.f322337i = f322322o;
        aVar.mo158143a(0);
        aVar.f322336h = 2.5f;
        aVar.f322330b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C107722b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f322320j);
        ofFloat.addListener(new C107723c(this, aVar));
        this.f322326g = ofFloat;
    }

    /* renamed from: a */
    public void mo158131a(float f, C107725a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f322328i) {
            mo158134d(f, aVar);
            float floor = (float) (Math.floor((double) (aVar.f322341m / 0.8f)) + 1.0d);
            float f4 = aVar.f322339k;
            float f5 = aVar.f322340l;
            aVar.f322333e = f4 + (((f5 - 0.01f) - f4) * f);
            aVar.f322334f = f5;
            float f6 = aVar.f322341m;
            aVar.f322335g = f6 + ((floor - f6) * f);
        } else if (f != 1.0f || z) {
            float f7 = aVar.f322341m;
            if (f < 0.5f) {
                f2 = aVar.f322339k;
                f3 = (((C109680d) f322321n).getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float f8 = aVar.f322339k + 0.79f;
                float f9 = f8;
                f2 = f8 - (((1.0f - ((C109680d) f322321n).getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f9;
            }
            aVar.f322333e = f2;
            aVar.f322334f = f3;
            aVar.f322335g = f7 + (0.20999998f * f);
            this.f322324e = (f + this.f322327h) * 216.0f;
        }
    }

    /* renamed from: b */
    public final void mo158132b(float f, float f2, float f3, float f4) {
        C107725a aVar = this.f322323d;
        float f5 = this.f322325f.getDisplayMetrics().density;
        float f6 = f2 * f5;
        aVar.f322336h = f6;
        aVar.f322330b.setStrokeWidth(f6);
        aVar.f322345q = f * f5;
        aVar.mo158143a(0);
        aVar.f322346r = (int) (f3 * f5);
        aVar.f322347s = (int) (f4 * f5);
    }

    /* renamed from: c */
    public void mo158133c(int i) {
        if (i == 0) {
            mo158132b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            mo158132b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo158134d(float f, C107725a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = aVar.f322337i;
            int i = aVar.f322338j;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            int i4 = (i2 >> 24) & 255;
            int i5 = (i2 >> 16) & 255;
            int i6 = (i2 >> 8) & 255;
            int i7 = i2 & 255;
            aVar.f322349u = ((i4 + ((int) (((float) (((i3 >> 24) & 255) - i4)) * f2))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & 255) - i5)) * f2))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & 255) - i6)) * f2))) << 8) | (i7 + ((int) (f2 * ((float) ((i3 & 255) - i7)))));
            return;
        }
        aVar.f322349u = aVar.f322337i[aVar.f322338j];
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f322324e, bounds.exactCenterX(), bounds.exactCenterY());
        C107725a aVar = this.f322323d;
        RectF rectF = aVar.f322329a;
        float f = aVar.f322345q;
        float f2 = (aVar.f322336h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aVar.f322346r) * aVar.f322344p) / 2.0f, aVar.f322336h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = aVar.f322333e;
        float f4 = aVar.f322335g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((aVar.f322334f + f4) * 360.0f) - f5;
        aVar.f322330b.setColor(aVar.f322349u);
        aVar.f322330b.setAlpha(aVar.f322348t);
        float f7 = aVar.f322336h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f322332d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, aVar.f322330b);
        if (aVar.f322342n) {
            Path path = aVar.f322343o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f322343o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.f322343o.moveTo(0.0f, 0.0f);
            aVar.f322343o.lineTo(((float) aVar.f322346r) * aVar.f322344p, 0.0f);
            Path path3 = aVar.f322343o;
            float f9 = aVar.f322344p;
            path3.lineTo((((float) aVar.f322346r) * f9) / 2.0f, ((float) aVar.f322347s) * f9);
            aVar.f322343o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) aVar.f322346r) * aVar.f322344p) / 2.0f), rectF.centerY() + (aVar.f322336h / 2.0f));
            aVar.f322343o.close();
            aVar.f322331c.setColor(aVar.f322349u);
            aVar.f322331c.setAlpha(aVar.f322348t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f322343o, aVar.f322331c);
            canvas.restore();
        }
        canvas.restore();
    }

    public int getAlpha() {
        return this.f322323d.f322348t;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f322326g.isRunning();
    }

    public void setAlpha(int i) {
        this.f322323d.f322348t = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f322323d.f322330b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f322326g.cancel();
        C107725a aVar = this.f322323d;
        float f = aVar.f322333e;
        aVar.f322339k = f;
        float f2 = aVar.f322334f;
        aVar.f322340l = f2;
        aVar.f322341m = aVar.f322335g;
        if (f2 != f) {
            this.f322328i = true;
            this.f322326g.setDuration(666);
            this.f322326g.start();
            return;
        }
        aVar.mo158143a(0);
        C107725a aVar2 = this.f322323d;
        aVar2.f322339k = 0.0f;
        aVar2.f322340l = 0.0f;
        aVar2.f322341m = 0.0f;
        aVar2.f322333e = 0.0f;
        aVar2.f322334f = 0.0f;
        aVar2.f322335g = 0.0f;
        this.f322326g.setDuration(1332);
        this.f322326g.start();
    }

    public void stop() {
        this.f322326g.cancel();
        this.f322324e = 0.0f;
        C107725a aVar = this.f322323d;
        if (aVar.f322342n) {
            aVar.f322342n = false;
        }
        aVar.mo158143a(0);
        C107725a aVar2 = this.f322323d;
        aVar2.f322339k = 0.0f;
        aVar2.f322340l = 0.0f;
        aVar2.f322341m = 0.0f;
        aVar2.f322333e = 0.0f;
        aVar2.f322334f = 0.0f;
        aVar2.f322335g = 0.0f;
        invalidateSelf();
    }
}
