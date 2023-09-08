package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView;
import fm0.C86937f0;
import java.util.ArrayList;
import java.util.List;
import rs2.C101462c;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid */
public class RadarGrid extends ChartGridView {

    /* renamed from: o */
    public static final Point f275775o = new Point(0, 0);

    /* renamed from: d */
    public int f275776d = 4;

    /* renamed from: e */
    public int f275777e = 4;

    /* renamed from: f */
    public Spannable[] f275778f;

    /* renamed from: g */
    public int f275779g = 80;

    /* renamed from: h */
    public Point f275780h = f275775o;

    /* renamed from: i */
    public C101462c f275781i;

    /* renamed from: j */
    public List<PointF> f275782j;

    /* renamed from: n */
    public Path f275783n = new Path();

    public RadarGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        setMinimumHeight(160);
        setMinimumWidth(160);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    private int getGridDotRadius() {
        SnsMethodCalculate.markStartTimeMs("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297158p;
        SnsMethodCalculate.markEndTimeMs("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        SnsMethodCalculate.markEndTimeMs("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i;
    }

    private Paint getPaintGLabelFont() {
        SnsMethodCalculate.markStartTimeMs("getPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        Paint paint = new Paint();
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297150h;
        SnsMethodCalculate.markEndTimeMs("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i);
        C101462c cVar2 = this.f275781i;
        cVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f = cVar2.f297151i;
        SnsMethodCalculate.markEndTimeMs("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setTextSize(f);
        SnsMethodCalculate.markEndTimeMs("getPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private Paint getPaintGScaleFont() {
        SnsMethodCalculate.markStartTimeMs("getPaintGScaleFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        Paint paint = new Paint();
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297153k;
        if (i == -1) {
            i = cVar.f297150h;
        }
        SnsMethodCalculate.markEndTimeMs("getGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i);
        C101462c cVar2 = this.f275781i;
        cVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f = cVar2.f297154l;
        SnsMethodCalculate.markEndTimeMs("getGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setTextSize(f);
        SnsMethodCalculate.markEndTimeMs("getPaintGScaleFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private Paint getPaintGridBorder() {
        SnsMethodCalculate.markStartTimeMs("getPaintGridBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        Paint paint = new Paint();
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297145c;
        if (i == -1) {
            i = cVar.f297146d;
        }
        SnsMethodCalculate.markEndTimeMs("getGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        C101462c cVar2 = this.f275781i;
        cVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f = cVar2.f297149g;
        if (f == -1.0f) {
            f = cVar2.f297148f;
        }
        SnsMethodCalculate.markEndTimeMs("getGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f);
        paint.setAntiAlias(true);
        SnsMethodCalculate.markEndTimeMs("getPaintGridBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private Paint getPaintGridDot() {
        SnsMethodCalculate.markStartTimeMs("getPaintGridDot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        Paint paint = new Paint();
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297157o;
        SnsMethodCalculate.markEndTimeMs("getGridDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        SnsMethodCalculate.markEndTimeMs("getPaintGridDot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private Paint getPaintGridFill() {
        SnsMethodCalculate.markStartTimeMs("getPaintGridFill", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        Paint paint = new Paint();
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297144b;
        SnsMethodCalculate.markEndTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i);
        paint.setAntiAlias(true);
        SnsMethodCalculate.markEndTimeMs("getPaintGridFill", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private Paint getPaintGridLatitude() {
        SnsMethodCalculate.markStartTimeMs("getPaintGridLatitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        Paint paint = new Paint();
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297146d;
        SnsMethodCalculate.markEndTimeMs("getGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        C101462c cVar2 = this.f275781i;
        cVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f = cVar2.f297148f;
        SnsMethodCalculate.markEndTimeMs("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f);
        paint.setAntiAlias(true);
        SnsMethodCalculate.markEndTimeMs("getPaintGridLatitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private Paint getPaintGridLongitude() {
        SnsMethodCalculate.markStartTimeMs("getPaintGridLongitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        Paint paint = new Paint();
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297147e;
        SnsMethodCalculate.markEndTimeMs("getGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i);
        C101462c cVar2 = this.f275781i;
        cVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f = cVar2.f297148f;
        SnsMethodCalculate.markEndTimeMs("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f);
        SnsMethodCalculate.markEndTimeMs("getPaintGridLongitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private TextPaint getTextPaintGLabelFont() {
        SnsMethodCalculate.markStartTimeMs("getTextPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        TextPaint textPaint = new TextPaint();
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i = cVar.f297150h;
        SnsMethodCalculate.markEndTimeMs("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        textPaint.setColor(i);
        C101462c cVar2 = this.f275781i;
        cVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f = cVar2.f297151i;
        SnsMethodCalculate.markEndTimeMs("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        textPaint.setTextSize(f);
        SnsMethodCalculate.markEndTimeMs("getTextPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return textPaint;
    }

    /* renamed from: a */
    public int mo131460a() {
        SnsMethodCalculate.markStartTimeMs("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        int i = this.f275779g * 2;
        SnsMethodCalculate.markEndTimeMs("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i;
    }

    /* renamed from: b */
    public int mo131461b() {
        SnsMethodCalculate.markStartTimeMs("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        int i = this.f275779g * 2;
        SnsMethodCalculate.markEndTimeMs("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i;
    }

    /* renamed from: c */
    public List<PointF> mo131480c(float f) {
        SnsMethodCalculate.markStartTimeMs("getGridPoints", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f275776d; i++) {
            PointF pointF = new PointF();
            double d = ((double) (i * 2)) * 3.141592653589793d;
            pointF.set((float) (((double) this.f275780h.x) - (((double) (((float) this.f275779g) * f)) * Math.sin(d / ((double) this.f275776d)))), (float) (((double) this.f275780h.y) - (((double) (((float) this.f275779g) * f)) * Math.cos(d / ((double) this.f275776d)))));
            arrayList.add(pointF);
        }
        SnsMethodCalculate.markEndTimeMs("getGridPoints", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return arrayList;
    }

    public C101462c getGridStyle() {
        SnsMethodCalculate.markStartTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        SnsMethodCalculate.markEndTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return cVar;
    }

    public void onDraw(Canvas canvas) {
        String str;
        String str2;
        int i;
        Canvas canvas2 = canvas;
        String str3 = "onDraw";
        String str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid";
        SnsMethodCalculate.markStartTimeMs(str3, str4);
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.f275779g = (int) (((double) (((float) Math.min(height, width)) / 2.0f)) * 0.8d);
        int i2 = (int) (((float) width) / 2.0f);
        int i3 = (int) (((float) height) / 2.0f);
        this.f275780h.set(i2, i3);
        Object obj = null;
        int i4 = 0;
        int i5 = 1;
        if (this.f275781i.mo140960a() != null) {
            C101462c cVar = this.f275781i;
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            float f = cVar.f297156n;
            SnsMethodCalculate.markEndTimeMs("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i6 = (int) (((float) (this.f275779g * 2)) + (f * 2.0f));
            int width2 = (this.f275781i.mo140960a().getWidth() * i6) / this.f275781i.mo140960a().getHeight();
            if (this.f275781i.mo140960a() != null) {
                canvas2.drawBitmap(Bitmap.createScaledBitmap(this.f275781i.mo140960a(), width2, i6, false), (float) (i2 - (width2 >>> 1)), (float) (i3 - (i6 >>> 1)), (Paint) null);
            }
        }
        this.f275781i.getClass();
        SnsMethodCalculate.markStartTimeMs("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        SnsMethodCalculate.markEndTimeMs("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        C101462c cVar2 = this.f275781i;
        cVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i7 = cVar2.f297143a;
        SnsMethodCalculate.markEndTimeMs("getGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        if (i7 == 0) {
            this.f275782j = mo131480c(1.0f);
            for (int i8 = 0; i8 < this.f275776d; i8++) {
                PointF pointF = (PointF) ((ArrayList) this.f275782j).get(i8);
                if (i8 == 0) {
                    this.f275783n.moveTo(pointF.x, pointF.y);
                } else {
                    this.f275783n.lineTo(pointF.x, pointF.y);
                }
            }
            this.f275783n.close();
            C101462c cVar3 = this.f275781i;
            cVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i9 = cVar3.f297144b;
            SnsMethodCalculate.markEndTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            if (i9 != 0 && this.f275781i.mo140960a() == null) {
                canvas2.drawPath(this.f275783n, getPaintGridFill());
            }
        } else if (i7 == 1) {
            Point point = this.f275780h;
            canvas2.drawCircle((float) point.x, (float) point.y, (float) this.f275779g, getPaintGridFill());
        }
        this.f275781i.getClass();
        SnsMethodCalculate.markStartTimeMs("isLonAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        SnsMethodCalculate.markEndTimeMs("isLonAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        this.f275782j = mo131480c(1.0f);
        for (int i15 = 0; i15 < this.f275776d; i15++) {
            PointF pointF2 = (PointF) ((ArrayList) this.f275782j).get(i15);
            Point point2 = this.f275780h;
            canvas.drawLine((float) point2.x, (float) point2.y, pointF2.x, pointF2.y, getPaintGridLongitude());
        }
        this.f275781i.getClass();
        SnsMethodCalculate.markStartTimeMs("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        SnsMethodCalculate.markEndTimeMs("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        C101462c cVar4 = this.f275781i;
        cVar4.getClass();
        SnsMethodCalculate.markStartTimeMs("getGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i16 = cVar4.f297143a;
        SnsMethodCalculate.markEndTimeMs("getGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        if (i16 == 0) {
            canvas2.drawPath(this.f275783n, getPaintGridBorder());
            this.f275783n.reset();
            int i17 = 1;
            while (true) {
                int i18 = this.f275777e;
                if (i17 >= i18) {
                    break;
                }
                this.f275782j = mo131480c((((float) i17) * 1.0f) / ((float) i18));
                for (int i19 = 0; i19 < this.f275776d; i19++) {
                    PointF pointF3 = (PointF) ((ArrayList) this.f275782j).get(i19);
                    if (i19 == 0) {
                        this.f275783n.moveTo(pointF3.x, pointF3.y);
                    } else {
                        this.f275783n.lineTo(pointF3.x, pointF3.y);
                    }
                    canvas2.drawCircle(pointF3.x, pointF3.y, (float) getGridDotRadius(), getPaintGridDot());
                }
                this.f275783n.close();
                canvas2.drawPath(this.f275783n, getPaintGridLatitude());
                this.f275783n.reset();
                i17++;
            }
        } else if (i16 == 1) {
            Point point3 = this.f275780h;
            canvas2.drawCircle((float) point3.x, (float) point3.y, (float) this.f275779g, getPaintGridBorder());
            int i25 = 1;
            while (true) {
                int i26 = this.f275777e;
                if (i25 >= i26) {
                    break;
                }
                Point point4 = this.f275780h;
                canvas2.drawCircle((float) point4.x, (float) point4.y, ((float) this.f275779g) * ((((float) i25) * 1.0f) / ((float) i26)), getPaintGridLatitude());
                i25++;
            }
        }
        if (this.f275778f != null) {
            this.f275781i.getClass();
            SnsMethodCalculate.markStartTimeMs("isLabels", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            SnsMethodCalculate.markEndTimeMs("isLabels", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            if (this.f275778f.length == this.f275776d) {
                int i27 = 0;
                while (i27 < this.f275776d) {
                    Spannable spannable = this.f275778f[i27];
                    if (spannable.equals(obj)) {
                        str2 = str3;
                        str = str4;
                    } else {
                        float f2 = 0.0f;
                        float f3 = (i27 == 0 || i27 == (i = this.f275776d >>> i5)) ? 0.5f : (i27 <= 0 || i27 >= i) ? 1.0f : 0.0f;
                        if (i27 == 0) {
                            f2 = this.f275781i.mo140961b();
                        } else if (i27 == (this.f275776d >>> i5)) {
                            f2 = -this.f275781i.mo140961b();
                        }
                        StaticLayout staticLayout = new StaticLayout(spannable, getTextPaintGLabelFont(), 1000, Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, false);
                        double b = (double) (((float) this.f275779g) + this.f275781i.mo140961b());
                        double d = ((double) (i27 * 2)) * 3.141592653589793d;
                        str2 = str3;
                        str = str4;
                        canvas.save();
                        canvas2.translate((float) (((double) (((float) this.f275780h.x) - (staticLayout.getLineWidth(i4) * f3))) - (b * Math.sin(6.283185307179586d - (d / ((double) this.f275776d))))), (float) ((((double) (this.f275780h.y - (staticLayout.getHeight() / 2))) - (((double) (((float) this.f275779g) + this.f275781i.mo140961b())) * Math.cos(6.283185307179586d - (d / ((double) this.f275776d))))) - ((double) f2)));
                        staticLayout.draw(canvas2);
                        canvas.restore();
                    }
                    i27++;
                    str3 = str2;
                    str4 = str;
                    obj = null;
                    i4 = 0;
                    i5 = 1;
                }
            } else {
                RuntimeException runtimeException = new RuntimeException("Labels array length not matches longitude lines number.");
                SnsMethodCalculate.markEndTimeMs(str3, str4);
                throw runtimeException;
            }
        }
        SnsMethodCalculate.markEndTimeMs(str3, str4);
    }

    public void setBackgroundColor(int i) {
        SnsMethodCalculate.markStartTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297144b = i;
        SnsMethodCalculate.markEndTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridBorderColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297145c = i;
        SnsMethodCalculate.markEndTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridBorderStrokeWidth(float f) {
        SnsMethodCalculate.markStartTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297149g = f;
        SnsMethodCalculate.markEndTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridChartType(int i) {
        SnsMethodCalculate.markStartTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297143a = i;
        SnsMethodCalculate.markEndTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLabelColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297150h = i;
        SnsMethodCalculate.markEndTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLabelPadding(float f) {
        SnsMethodCalculate.markStartTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297152j = f;
        SnsMethodCalculate.markEndTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLabelSize(float f) {
        SnsMethodCalculate.markStartTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297151i = f;
        SnsMethodCalculate.markEndTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLatitudeColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297146d = i;
        SnsMethodCalculate.markEndTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLongitudeColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297147e = i;
        SnsMethodCalculate.markEndTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridScaleColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297153k = i;
        SnsMethodCalculate.markEndTimeMs("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridScaleLabelPadding(float f) {
        SnsMethodCalculate.markStartTimeMs("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f275781i.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        SnsMethodCalculate.markEndTimeMs("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridScaleSize(float f) {
        SnsMethodCalculate.markStartTimeMs("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297154l = f;
        SnsMethodCalculate.markEndTimeMs("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridStrokeWidth(float f) {
        SnsMethodCalculate.markStartTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        C101462c cVar = this.f275781i;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f297148f = f;
        SnsMethodCalculate.markEndTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridStyle(C101462c cVar) {
        SnsMethodCalculate.markStartTimeMs("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f275781i = cVar;
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setLabelsArray(Spannable[] spannableArr) {
        SnsMethodCalculate.markStartTimeMs("setLabelsArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f275778f = spannableArr;
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setLabelsArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setLatNum(int i) {
        SnsMethodCalculate.markStartTimeMs("setLatNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f275777e = i;
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setLatNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setLonNum(int i) {
        SnsMethodCalculate.markStartTimeMs("setLonNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f275776d = i;
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setLonNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setMaxValue(float f) {
        SnsMethodCalculate.markStartTimeMs("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public RadarGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        setMinimumHeight(160);
        setMinimumWidth(160);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public RadarGrid(Context context, int i, int i2, float f, Spannable[] spannableArr, C101462c cVar) {
        super(context);
        new Rect();
        this.f275776d = i;
        this.f275777e = i2;
        this.f275778f = spannableArr;
        this.f275781i = cVar;
    }
}
