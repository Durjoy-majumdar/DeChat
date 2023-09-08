package com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView */
public class ViewPagerControlView extends LinearLayout {

    /* renamed from: A */
    public boolean f281598A;

    /* renamed from: d */
    public Context f281599d;

    /* renamed from: e */
    public int f281600e;

    /* renamed from: f */
    public int f281601f;

    /* renamed from: g */
    public float f281602g;

    /* renamed from: h */
    public float f281603h;

    /* renamed from: i */
    public float f281604i;

    /* renamed from: j */
    public float f281605j;

    /* renamed from: n */
    public float f281606n;

    /* renamed from: o */
    public Paint f281607o;

    /* renamed from: p */
    public Paint f281608p;

    /* renamed from: q */
    public Paint f281609q;

    /* renamed from: r */
    public Paint f281610r;

    /* renamed from: s */
    public Paint f281611s;

    /* renamed from: t */
    public int f281612t;

    /* renamed from: u */
    public float f281613u;

    /* renamed from: v */
    public int f281614v;

    /* renamed from: w */
    public float f281615w;

    /* renamed from: x */
    public float f281616x;

    /* renamed from: y */
    public float f281617y;

    /* renamed from: z */
    public float f281618z;

    public ViewPagerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo134127a(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("drawGrayPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        canvas.drawCircle(this.f281616x, this.f281617y, this.f281605j, this.f281609q);
        canvas.drawCircle(this.f281616x, this.f281617y, this.f281605j, this.f281608p);
        float f = this.f281615w + (this.f281604i * 2.0f);
        this.f281615w = f;
        this.f281616x = f + this.f281605j;
        SnsMethodCalculate.markEndTimeMs("drawGrayPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    /* renamed from: b */
    public final void mo134128b(Canvas canvas, boolean z) {
        float f;
        float f2;
        SnsMethodCalculate.markStartTimeMs("drawRoundRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        if (z) {
            float f3 = this.f281603h;
            float f4 = this.f281613u;
            f2 = f3 - (this.f281606n * f4);
            f = f4 <= 0.3f ? 1.0f - ((f4 * 10.0f) / 3.0f) : 0.0f;
        } else {
            float f5 = this.f281613u;
            float f6 = (this.f281606n * f5) + this.f281604i;
            f = f5 >= 0.7f ? ((f5 - 0.7f) * 10.0f) / 3.0f : 0.0f;
            f2 = f6;
        }
        int i = (int) (f * 255.0f);
        float f7 = this.f281615w + f2;
        RectF rectF = new RectF(this.f281615w, 0.0f, f7, this.f281604i);
        float f8 = this.f281605j;
        canvas.drawRoundRect(rectF, f8, f8, this.f281607o);
        if (z) {
            this.f281611s.setAlpha(i);
            float f9 = this.f281616x;
            float f15 = this.f281605j;
            canvas.drawLine(f9, f15, f9 + ((f2 - (2.0f * f15)) * this.f281618z), f15, this.f281611s);
        } else if (!this.f281598A) {
            this.f281611s.setAlpha(i);
            float f16 = this.f281616x;
            float f17 = this.f281605j;
            canvas.drawLine(f16, f17, f16 + ((f2 - (2.0f * f17)) * this.f281618z), f17, this.f281611s);
        } else {
            this.f281610r.setAlpha(i);
            canvas.drawCircle(this.f281616x, this.f281617y, this.f281605j, this.f281610r);
        }
        float f18 = this.f281605j;
        canvas.drawRoundRect(rectF, f18, f18, this.f281608p);
        float f19 = f7 + this.f281604i;
        this.f281615w = f19;
        this.f281616x = f19 + this.f281605j;
        SnsMethodCalculate.markEndTimeMs("drawRoundRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        super.onDraw(canvas);
        float f = this.f281602g;
        this.f281615w = f;
        float f2 = this.f281605j;
        this.f281616x = f + f2;
        this.f281617y = f2;
        SnsMethodCalculate.markStartTimeMs("scrollingAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        int i = this.f281614v;
        if (i == 1 || i == 2) {
            SnsMethodCalculate.markStartTimeMs("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            mo134128b(canvas, false);
            SnsMethodCalculate.markEndTimeMs("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            SnsMethodCalculate.markStartTimeMs("drawMiddlePoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i2 = 2; i2 <= this.f281600e - 1; i2++) {
                mo134127a(canvas);
            }
            SnsMethodCalculate.markEndTimeMs("drawMiddlePoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            SnsMethodCalculate.markStartTimeMs("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            mo134128b(canvas, true);
            SnsMethodCalculate.markEndTimeMs("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        } else {
            SnsMethodCalculate.markStartTimeMs("drawfrontPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i3 = 1; i3 < this.f281612t; i3++) {
                mo134127a(canvas);
            }
            SnsMethodCalculate.markEndTimeMs("drawfrontPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            SnsMethodCalculate.markStartTimeMs("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            mo134128b(canvas, true);
            SnsMethodCalculate.markEndTimeMs("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            SnsMethodCalculate.markStartTimeMs("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            mo134128b(canvas, false);
            SnsMethodCalculate.markEndTimeMs("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            SnsMethodCalculate.markStartTimeMs("drawPostPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i4 = this.f281612t + 2; i4 <= this.f281600e; i4++) {
                mo134127a(canvas);
            }
            SnsMethodCalculate.markEndTimeMs("drawPostPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        }
        SnsMethodCalculate.markEndTimeMs("scrollingAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    public ViewPagerControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f281598A = false;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f281599d = context;
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f281601f = C95198o2.m121130b(this.f281599d)[0];
        this.f281603h = (float) C76577a.m92151b(this.f281599d, 28);
        float b = (float) C76577a.m92151b(this.f281599d, 7);
        this.f281604i = b;
        this.f281605j = b / 2.0f;
        this.f281606n = this.f281603h - b;
        Paint paint = new Paint();
        this.f281607o = paint;
        paint.setFlags(1);
        this.f281607o.setColor(this.f281599d.getResources().getColor(C0966R.color.ac6));
        Paint paint2 = new Paint();
        this.f281608p = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f281608p.setStrokeWidth(0.5f);
        this.f281608p.setFlags(1);
        this.f281608p.setColor(this.f281599d.getResources().getColor(C0966R.color.ac5));
        Paint paint3 = new Paint();
        this.f281609q = paint3;
        paint3.setFlags(1);
        this.f281609q.setColor(this.f281599d.getResources().getColor(C0966R.color.ac6));
        Paint paint4 = new Paint();
        this.f281610r = paint4;
        paint4.setFlags(1);
        this.f281610r.setColor(-1);
        this.f281610r.setAlpha(0);
        Paint paint5 = new Paint();
        this.f281611s = paint5;
        paint5.setFlags(1);
        this.f281611s.setColor(-1);
        this.f281611s.setAlpha(0);
        this.f281611s.setStyle(Paint.Style.STROKE);
        this.f281611s.setStrokeWidth(this.f281604i);
        this.f281611s.setStrokeCap(Paint.Cap.ROUND);
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        setWillNotDraw(false);
    }
}
