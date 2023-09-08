package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar */
public class MMSightCircularProgressBar extends View {

    /* renamed from: A */
    public boolean f313749A = false;

    /* renamed from: B */
    public boolean f313750B = false;

    /* renamed from: C */
    public boolean f313751C = false;

    /* renamed from: d */
    public int f313752d = Color.parseColor("#1AAD19");

    /* renamed from: e */
    public int f313753e = Color.parseColor("#FFFFFF");

    /* renamed from: f */
    public int f313754f = Color.parseColor("#FA5151");

    /* renamed from: g */
    public RectF f313755g;

    /* renamed from: h */
    public Paint f313756h;

    /* renamed from: i */
    public Paint f313757i;

    /* renamed from: j */
    public Paint f313758j;

    /* renamed from: n */
    public float f313759n = 0.0f;

    /* renamed from: o */
    public float f313760o = 0.0f;

    /* renamed from: p */
    public int f313761p = 153;

    /* renamed from: q */
    public float f313762q = 0.0f;

    /* renamed from: r */
    public int f313763r = 0;

    /* renamed from: s */
    public int f313764s = 0;

    /* renamed from: t */
    public int f313765t = 0;

    /* renamed from: u */
    public boolean f313766u = false;

    /* renamed from: v */
    public Context f313767v;

    /* renamed from: w */
    public C105522d0 f313768w;

    /* renamed from: x */
    public C105492a f313769x;

    /* renamed from: y */
    public ArrayList<Float> f313770y = new ArrayList<>();

    /* renamed from: z */
    public ArrayList<Float> f313771z = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar$a */
    public interface C105492a {
        /* renamed from: a */
        void mo128042a(boolean z);

        /* renamed from: b */
        void mo128043b(ArrayList<Float> arrayList);
    }

    public MMSightCircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f313767v = context;
    }

    /* renamed from: a */
    public void mo150303a() {
        Log.m105924i("MicroMsg.MMSightCircularProgressBar", "reset");
        this.f313769x = null;
        this.f313763r = 0;
        this.f313764s = 100;
        this.f313765t = 0;
        this.f313766u = false;
        this.f313770y.clear();
        this.f313762q = 0.0f;
        C105522d0 d0Var = this.f313768w;
        if (d0Var != null) {
            d0Var.f313916h = false;
            d0Var.f313913e = 0;
            this.f313768w = null;
        }
        invalidate();
    }

    public int getDrawWidth() {
        return (int) this.f313755g.width();
    }

    public ArrayList<Float> getSubProgress() {
        return this.f313770y;
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        float f = this.f313760o;
        canvas.translate(f, f);
        RectF rectF = this.f313755g;
        canvas.rotate(180.0f, rectF.right / 2.0f, rectF.bottom / 2.0f);
        if (this.f313749A) {
            float f2 = 0.0f;
            int i = 0;
            while (i < this.f313770y.size()) {
                if (!this.f313750B || i != this.f313770y.size() - 1) {
                    canvas.drawArc(this.f313755g, ((f2 / ((float) this.f313764s)) * 360.0f) + 90.0f, ((this.f313770y.get(i).floatValue() - f2) / ((float) this.f313764s)) * 360.0f, false, this.f313756h);
                } else {
                    canvas.drawArc(this.f313755g, ((f2 / ((float) this.f313764s)) * 360.0f) + 90.0f, ((this.f313770y.get(i).floatValue() - f2) / ((float) this.f313764s)) * 360.0f, false, this.f313758j);
                }
                float floatValue = this.f313770y.get(i).floatValue();
                RectF rectF2 = this.f313755g;
                float f3 = (float) this.f313764s;
                canvas.drawArc(rectF2, (((floatValue - 0.85f) / f3) * 360.0f) + 90.0f, (0.85f / f3) * 360.0f, false, this.f313757i);
                i++;
                f2 = floatValue;
            }
            int i2 = this.f313764s;
            if (i2 > 0) {
                float f4 = (float) i2;
                canvas.drawArc(this.f313755g, ((f2 / f4) * 360.0f) + 90.0f, ((this.f313762q - f2) / f4) * 360.0f, false, this.f313756h);
            }
        } else {
            canvas.drawArc(this.f313755g, 90.0f, (this.f313762q / ((float) this.f313764s)) * 360.0f, false, this.f313756h);
        }
        canvas.restore();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f313751C) {
            this.f313751C = true;
            float dimensionPixelSize = (float) this.f313767v.getResources().getDimensionPixelSize(C0966R.dimen.agf);
            this.f313759n = dimensionPixelSize;
            this.f313760o = dimensionPixelSize / 2.0f;
            float f = this.f313760o;
            float width = ((float) getWidth()) - f;
            this.f313755g = new RectF(f, f, width, width);
            Paint paint = new Paint();
            this.f313756h = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f313756h.setStrokeWidth(this.f313759n);
            this.f313756h.setColor(this.f313752d);
            this.f313756h.setAlpha(this.f313761p);
            this.f313756h.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.f313757i = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f313757i.setStrokeWidth(this.f313759n);
            this.f313757i.setColor(this.f313753e);
            this.f313757i.setAlpha(this.f313761p);
            this.f313757i.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f313758j = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.f313758j.setStrokeWidth(this.f313759n);
            this.f313758j.setColor(this.f313754f);
            this.f313758j.setAntiAlias(true);
        }
    }

    public void setCircularColor(int i) {
        this.f313752d = i;
        this.f313761p = 255;
        Paint paint = this.f313756h;
        if (paint != null && i != 0) {
            paint.setColor(i);
        }
    }

    public void setDuration(int i) {
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "setDuration: %s", Integer.valueOf(i));
        this.f313765t = i;
    }

    public void setEnableSubProgress(boolean z) {
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "setEnableSubProgress: %s", Boolean.valueOf(z));
        this.f313749A = z;
    }

    public void setInitProgress(int i) {
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "setInitProgress: %s, isStart: %s", Integer.valueOf(i), Boolean.valueOf(this.f313766u));
        if (!this.f313766u) {
            this.f313763r = i;
        }
    }

    public void setMaxProgress(int i) {
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "setMaxProgress: %s", Integer.valueOf(i));
        this.f313764s = i;
    }

    public void setProgressCallback(C105492a aVar) {
        this.f313769x = aVar;
    }

    public MMSightCircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f313767v = context;
    }
}
