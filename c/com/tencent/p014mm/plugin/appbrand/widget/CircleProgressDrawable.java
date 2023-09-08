package com.tencent.p014mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable */
public class CircleProgressDrawable extends Drawable {

    /* renamed from: h */
    public static final RectF f311304h = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: i */
    public static final RectF f311305i = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: a */
    public Paint f311306a;

    /* renamed from: b */
    public ArrayList<Animator> f311307b;

    /* renamed from: c */
    public int f311308c;

    /* renamed from: d */
    public int f311309d = 4;

    /* renamed from: e */
    public int f311310e = -16777216;

    /* renamed from: f */
    public RingPathTransform f311311f = new RingPathTransform((C104819a) null);

    /* renamed from: g */
    public RingRotation f311312g = new RingRotation((C104819a) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$RingPathTransform */
    public static class RingPathTransform {

        /* renamed from: a */
        public float f311313a = 0.0f;

        /* renamed from: b */
        public float f311314b = 0.0f;

        /* renamed from: c */
        public float f311315c = 0.0f;

        public RingPathTransform(C104819a aVar) {
        }

        public void setTrimPathEnd(float f) {
            this.f311314b = f;
        }

        public void setTrimPathOffset(float f) {
            this.f311315c = f;
        }

        public void setTrimPathStart(float f) {
            this.f311313a = f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$RingRotation */
    public static class RingRotation {

        /* renamed from: a */
        public float f311316a;

        public RingRotation(C104819a aVar) {
        }

        public void setRotation(float f) {
            this.f311316a = f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$b */
    public static class C104820b {

        /* renamed from: a */
        public static final Interpolator f311317a = new LinearInterpolator();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$c */
    public static class C104821c {

        /* renamed from: a */
        public static final Interpolator f311318a;

        static {
            Path path = new Path();
            path.cubicTo(0.2f, 0.0f, 0.1f, 1.0f, 0.5f, 1.0f);
            path.lineTo(1.0f, 1.0f);
            f311318a = new PathInterpolator(path);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$d */
    public static class C104822d {

        /* renamed from: a */
        public static final Interpolator f311319a;

        static {
            Path path = new Path();
            path.lineTo(0.5f, 0.0f);
            path.cubicTo(0.7f, 0.0f, 0.6f, 1.0f, 1.0f, 1.0f);
            f311319a = new PathInterpolator(path);
        }
    }

    public CircleProgressDrawable(Context context) {
        this.f311308c = Math.round(context.getResources().getDisplayMetrics().density * 48.0f);
        this.f311307b = new ArrayList<>();
    }

    /* renamed from: a */
    public void mo148692a() {
        mo148694d();
        this.f311307b.clear();
        ArrayList<Animator> arrayList = this.f311307b;
        RingPathTransform ringPathTransform = this.f311311f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ringPathTransform, "trimPathStart", new float[]{0.0f, 0.75f});
        ofFloat.setDuration(1333);
        ofFloat.setInterpolator(C104822d.f311319a);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ringPathTransform, "trimPathEnd", new float[]{0.0f, 0.75f});
        ofFloat2.setDuration(1333);
        ofFloat2.setInterpolator(C104821c.f311318a);
        ofFloat2.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ringPathTransform, "trimPathOffset", new float[]{0.0f, 0.25f});
        ofFloat3.setDuration(1333);
        Interpolator interpolator = C104820b.f311317a;
        ofFloat3.setInterpolator(interpolator);
        ofFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        arrayList.add(animatorSet);
        ArrayList<Animator> arrayList2 = this.f311307b;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f311312g, "rotation", new float[]{0.0f, 720.0f});
        ofFloat4.setDuration(6665);
        ofFloat4.setInterpolator(interpolator);
        ofFloat4.setRepeatCount(-1);
        arrayList2.add(ofFloat4);
    }

    /* renamed from: c */
    public void mo148693c() {
        boolean z;
        Iterator<Animator> it = this.f311307b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().isStarted()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Iterator<Animator> it4 = this.f311307b.iterator();
            while (it4.hasNext()) {
                it4.next().start();
            }
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo148694d() {
        Iterator<Animator> it = this.f311307b.iterator();
        while (it.hasNext()) {
            it.next().end();
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() != 0 && bounds.height() != 0) {
            if (this.f311306a == null) {
                Paint paint = new Paint();
                this.f311306a = paint;
                paint.setAntiAlias(true);
                this.f311306a.setStyle(Paint.Style.STROKE);
                this.f311306a.setStrokeWidth((float) this.f311309d);
                this.f311306a.setStrokeCap(Paint.Cap.SQUARE);
                this.f311306a.setStrokeJoin(Paint.Join.MITER);
            }
            int save = canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            int width = bounds.width();
            int height = bounds.height();
            Paint paint2 = this.f311306a;
            RectF rectF = f311304h;
            canvas.scale(((float) width) / rectF.width(), ((float) height) / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
            int save2 = canvas.save();
            paint2.setColor(this.f311310e);
            canvas.rotate(this.f311312g.f311316a);
            RingPathTransform ringPathTransform = this.f311311f;
            float f = ringPathTransform.f311315c;
            float f2 = ringPathTransform.f311313a;
            float f3 = 360.0f * (ringPathTransform.f311314b - f2);
            Canvas canvas2 = canvas;
            canvas2.drawArc(f311305i, -90.0f + ((f + f2) * 360.0f), f3, false, paint2);
            canvas.restoreToCount(save2);
            canvas.restoreToCount(save);
        }
    }

    public int getIntrinsicHeight() {
        return this.f311308c;
    }

    public int getIntrinsicWidth() {
        return this.f311308c;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
