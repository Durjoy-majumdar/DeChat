package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView;
import java.util.Map;
import rs2.C101460a;
import rs2.C101461b;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer */
public class RadarDataLayer extends DataLayerView {

    /* renamed from: o */
    public static final Point f275766o = new Point(0, 0);

    /* renamed from: d */
    public C101460a f275767d;

    /* renamed from: e */
    public C101461b f275768e = new C101461b();

    /* renamed from: f */
    public boolean f275769f = true;

    /* renamed from: g */
    public int f275770g = 4;

    /* renamed from: h */
    public int f275771h = 80;

    /* renamed from: i */
    public Point f275772i = f275766o;

    /* renamed from: j */
    public float f275773j = 1.0f;

    /* renamed from: n */
    public Path f275774n = new Path();

    public RadarDataLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        setMinimumHeight(160);
        setMinimumWidth(160);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    private Paint getPaintLayerBorder() {
        SnsMethodCalculate.markStartTimeMs("getPaintLayerBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        Paint paint = new Paint();
        C101461b bVar = this.f275768e;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i = bVar.f297137a;
        SnsMethodCalculate.markEndTimeMs("getLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        C101461b bVar2 = this.f275768e;
        bVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        float f = bVar2.f297138b;
        SnsMethodCalculate.markEndTimeMs("getLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setStrokeWidth(f);
        paint.setAntiAlias(true);
        SnsMethodCalculate.markEndTimeMs("getPaintLayerBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return paint;
    }

    private Paint getPaintLayerDotPoint() {
        SnsMethodCalculate.markStartTimeMs("getPaintLayerDotPoint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        Paint paint = new Paint();
        C101461b bVar = this.f275768e;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getLayerDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i = bVar.f297141e;
        SnsMethodCalculate.markEndTimeMs("getLayerDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setColor(i);
        SnsMethodCalculate.markEndTimeMs("getPaintLayerDotPoint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return paint;
    }

    private Paint getPaintLayerFilling() {
        SnsMethodCalculate.markStartTimeMs("getPaintLayerFilling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        Paint paint = new Paint();
        C101461b bVar = this.f275768e;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getLayerFillColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i = bVar.f297139c;
        if (i == -1) {
            i = bVar.f297137a;
        }
        SnsMethodCalculate.markEndTimeMs("getLayerFillColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        C101461b bVar2 = this.f275768e;
        bVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getLayerFillAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i2 = bVar2.f297140d;
        SnsMethodCalculate.markEndTimeMs("getLayerFillAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setAlpha(i2);
        SnsMethodCalculate.markEndTimeMs("getPaintLayerFilling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return paint;
    }

    private Paint getPaintLayerPoint() {
        SnsMethodCalculate.markStartTimeMs("getPaintLayerPoint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        Paint paint = new Paint();
        C101461b bVar = this.f275768e;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i = bVar.f297137a;
        SnsMethodCalculate.markEndTimeMs("getLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setColor(i);
        C101461b bVar2 = this.f275768e;
        bVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        float f = bVar2.f297138b;
        SnsMethodCalculate.markEndTimeMs("getLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setStrokeWidth(f);
        SnsMethodCalculate.markEndTimeMs("getPaintLayerPoint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return paint;
    }

    /* renamed from: a */
    public int mo131465a() {
        SnsMethodCalculate.markStartTimeMs("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        int i = this.f275771h * 2;
        SnsMethodCalculate.markEndTimeMs("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return i;
    }

    /* renamed from: b */
    public int mo131466b() {
        SnsMethodCalculate.markStartTimeMs("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        int i = this.f275771h * 2;
        SnsMethodCalculate.markEndTimeMs("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return i;
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        String str = "onDraw";
        String str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer";
        SnsMethodCalculate.markStartTimeMs(str, str2);
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.f275771h = (int) (((double) (((float) Math.min(height, width)) / 2.0f)) * 0.8d);
        this.f275772i.set((int) (((float) width) / 2.0f), (int) (((float) height) / 2.0f));
        C101460a aVar = this.f275767d;
        if (aVar != null) {
            int i = 0;
            for (Map.Entry entry : aVar.entrySet()) {
                double d = ((double) (i * 2)) * 3.141592653589793d;
                float floatValue = (float) (((double) this.f275772i.x) - (((double) ((((Float) entry.getValue()).floatValue() / this.f275773j) * ((float) this.f275771h))) * Math.sin(6.283185307179586d - (d / ((double) this.f275770g)))));
                String str3 = str;
                String str4 = str2;
                float floatValue2 = (float) (((double) this.f275772i.y) - (((double) ((((Float) entry.getValue()).floatValue() / this.f275773j) * ((float) this.f275771h))) * Math.cos(6.283185307179586d - (d / ((double) this.f275770g)))));
                if (i == 0) {
                    this.f275774n.moveTo(floatValue, floatValue2);
                } else {
                    this.f275774n.lineTo(floatValue, floatValue2);
                }
                if (this.f275769f) {
                    C101461b bVar = this.f275768e;
                    bVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("getLayerDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                    int i2 = bVar.f297142f;
                    SnsMethodCalculate.markEndTimeMs("getLayerDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                    canvas2.drawCircle(floatValue, floatValue2, (float) i2, getPaintLayerDotPoint());
                }
                i++;
                str = str3;
                str2 = str4;
            }
            this.f275774n.close();
            canvas2.drawPath(this.f275774n, getPaintLayerFilling());
            canvas2.drawPath(this.f275774n, getPaintLayerBorder());
            this.f275774n.reset();
            SnsMethodCalculate.markEndTimeMs(str, str2);
            return;
        }
        RuntimeException runtimeException = new RuntimeException("Error: NullPointerException at data.");
        SnsMethodCalculate.markEndTimeMs(str, str2);
        throw runtimeException;
    }

    public void setData(C101460a aVar) {
        SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        this.f275767d = aVar;
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public void setGlobalMax(float f) {
        SnsMethodCalculate.markStartTimeMs("setGlobalMax", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        this.f275773j = f;
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGlobalMax", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public void setLayerStyle(C101461b bVar) {
        SnsMethodCalculate.markStartTimeMs("setLayerStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        this.f275768e = bVar;
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setLayerStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public void setMaxValue(float f) {
        SnsMethodCalculate.markStartTimeMs("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        this.f275773j = f;
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public RadarDataLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        setMinimumHeight(160);
        setMinimumWidth(160);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public RadarDataLayer(Context context, float f, C101460a aVar) {
        super(context);
        this.f275773j = f;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getLayerStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        C101461b bVar = aVar.f297136d;
        SnsMethodCalculate.markEndTimeMs("getLayerStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        this.f275768e = bVar;
        this.f275770g = aVar.size();
        this.f275767d = aVar;
        SnsMethodCalculate.markStartTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        SnsMethodCalculate.markEndTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        SnsMethodCalculate.markStartTimeMs("animateLayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        SnsMethodCalculate.markEndTimeMs("animateLayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }
}
