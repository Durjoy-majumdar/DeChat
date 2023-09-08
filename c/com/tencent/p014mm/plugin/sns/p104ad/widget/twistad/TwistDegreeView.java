package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView */
public class TwistDegreeView extends View {

    /* renamed from: d */
    public RectF f274572d;

    /* renamed from: e */
    public int f274573e;

    /* renamed from: f */
    public int f274574f;

    /* renamed from: g */
    public int f274575g;

    /* renamed from: h */
    public int f274576h;

    /* renamed from: i */
    public int f274577i;

    /* renamed from: j */
    public int f274578j;

    /* renamed from: n */
    public Paint f274579n;

    /* renamed from: o */
    public Paint f274580o;

    /* renamed from: p */
    public Paint f274581p;

    /* renamed from: q */
    public Paint f274582q;

    /* renamed from: r */
    public Paint f274583r;

    /* renamed from: s */
    public Paint f274584s;

    /* renamed from: t */
    public float f274585t = 0.9f;

    /* renamed from: u */
    public int f274586u = 0;

    public TwistDegreeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        setLayerType(1, (Paint) null);
        this.f274573e = C76577a.m92151b(context, 50);
        this.f274574f = C76577a.m92151b(context, 7);
        this.f274575g = C76577a.m92151b(context, 7);
        this.f274576h = C76577a.m92151b(context, 14);
        C76577a.m92151b(context, 4);
        C76577a.m92151b(context, 3);
        this.f274578j = C76577a.m92151b(context, 1);
        Paint paint = new Paint();
        this.f274579n = paint;
        paint.setColor(Color.parseColor("#99FFFFFF"));
        this.f274579n.setAntiAlias(true);
        this.f274579n.setDither(true);
        this.f274579n.setStyle(Paint.Style.STROKE);
        this.f274579n.setStrokeCap(Paint.Cap.ROUND);
        this.f274579n.setStrokeWidth((float) this.f274574f);
        Paint paint2 = new Paint();
        this.f274583r = paint2;
        paint2.setColor(Color.parseColor("#99FFFFFF"));
        this.f274583r.setAntiAlias(true);
        this.f274583r.setDither(true);
        Paint paint3 = new Paint();
        this.f274580o = paint3;
        paint3.setColor(Color.parseColor("#4DFFFFFF"));
        this.f274580o.setAntiAlias(true);
        this.f274580o.setDither(true);
        Paint paint4 = new Paint();
        this.f274581p = paint4;
        paint4.setColor(Color.parseColor("#FFFFFF"));
        this.f274581p.setAntiAlias(true);
        this.f274581p.setDither(true);
        this.f274581p.setStyle(Paint.Style.STROKE);
        this.f274581p.setStrokeCap(Paint.Cap.ROUND);
        this.f274581p.setStrokeWidth((float) this.f274575g);
        Paint paint5 = new Paint();
        this.f274584s = paint5;
        paint5.setColor(Color.parseColor("#FFFFFF"));
        this.f274584s.setAntiAlias(true);
        this.f274584s.setDither(true);
        Paint paint6 = new Paint();
        this.f274582q = paint6;
        paint6.setColor(Color.parseColor("#CCFFFFFF"));
        this.f274582q.setAntiAlias(true);
        this.f274582q.setDither(true);
        float f = (float) (this.f274574f / 2);
        float f2 = ((float) (this.f274573e * 2)) - f;
        this.f274572d = new RectF(f, f, f2, f2);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    /* renamed from: a */
    public void mo130644a(Canvas canvas, Paint paint) {
        Point point;
        Point point2;
        Point point3;
        SnsMethodCalculate.markStartTimeMs("drawTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        SnsMethodCalculate.markStartTimeMs("getTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        double radians = Math.toRadians(45.0d);
        if (this.f274586u == 0) {
            radians = Math.toRadians(135.0d);
        }
        int i = this.f274573e;
        int cos = (int) (((double) i) + (((double) (i - (this.f274574f / 2))) * Math.cos(radians)));
        int i2 = this.f274573e;
        int sin = (int) (((double) i2) - (((double) (i2 - (this.f274574f / 2))) * Math.sin(radians)));
        int i3 = this.f274576h / 2;
        if (this.f274586u == 0) {
            int i4 = cos - i3;
            int i5 = sin + i3;
            point2 = new Point(i4, i5);
            point = new Point(cos + i3, i5);
            point3 = new Point(i4, sin - i3);
        } else {
            int i6 = sin + i3;
            point2 = new Point(cos - i3, i6);
            int i7 = cos + i3;
            point = new Point(i7, i6);
            point3 = new Point(i7, sin - i3);
        }
        Path path = new Path();
        path.moveTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point.x, (float) point.y);
        path.lineTo((float) point3.x, (float) point3.y);
        path.close();
        SnsMethodCalculate.markEndTimeMs("getTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        canvas.drawPath(path, paint);
        SnsMethodCalculate.markEndTimeMs("drawTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        if (this.f274572d != null) {
            canvas.save();
            canvas.translate((float) (-this.f274577i), (float) this.f274578j);
            SnsMethodCalculate.markStartTimeMs("doDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            SnsMethodCalculate.markStartTimeMs("drawOutArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            canvas.drawArc(this.f274572d, 225.0f, 90.0f, false, this.f274579n);
            SnsMethodCalculate.markEndTimeMs("drawOutArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            mo130644a(canvas, this.f274583r);
            float f = this.f274585t;
            SnsMethodCalculate.markStartTimeMs("drawInnerArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            if (this.f274586u == 0) {
                canvas.drawArc(this.f274572d, 315.0f - f, f, false, this.f274581p);
            } else {
                canvas.drawArc(this.f274572d, 225.0f, f, false, this.f274581p);
            }
            SnsMethodCalculate.markEndTimeMs("drawInnerArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            if (this.f274585t >= 86.4f) {
                mo130644a(canvas, this.f274584s);
            }
            SnsMethodCalculate.markEndTimeMs("doDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            canvas.restore();
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        double radians = Math.toRadians(45.0d);
        int i3 = this.f274573e;
        int sin = (int) (((double) i3) - (((double) i3) * Math.sin(radians)));
        int i4 = this.f274573e;
        int i5 = this.f274574f;
        this.f274577i = (int) ((((double) i4) - (((double) i4) * Math.cos(radians))) - ((double) (i5 / 2)));
        setMeasuredDimension(((int) (((double) (this.f274573e * 2)) * Math.cos(radians))) + i5, sin + i5 + (this.f274578j * 2));
        invalidate();
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    public void setProgress(float f) {
        SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        if (f <= 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = f * 90.0f;
        this.f274585t = f2;
        if (f2 < 0.9f) {
            this.f274585t = 0.9f;
        }
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    public void setShowMode(int i) {
        SnsMethodCalculate.markStartTimeMs("setShowMode", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        this.f274586u = i;
        postInvalidate();
        SnsMethodCalculate.markEndTimeMs("setShowMode", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }
}
