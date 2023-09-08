package com.tencent.p014mm.plugin.appbrand.keylogger.stepview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.List;
import p385u2.C111105a;
import vo0.C78459b;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepViewIndicator */
public class VerticalStepViewIndicator extends View {

    /* renamed from: A */
    public C68624a f197116A;

    /* renamed from: B */
    public Rect f197117B;

    /* renamed from: C */
    public int f197118C;

    /* renamed from: D */
    public boolean f197119D;

    /* renamed from: d */
    public int f197120d;

    /* renamed from: e */
    public float f197121e;

    /* renamed from: f */
    public float f197122f;

    /* renamed from: g */
    public Drawable f197123g;

    /* renamed from: h */
    public Drawable f197124h;

    /* renamed from: i */
    public Drawable f197125i;

    /* renamed from: j */
    public Drawable f197126j;

    /* renamed from: n */
    public float f197127n;

    /* renamed from: o */
    public float f197128o;

    /* renamed from: p */
    public float f197129p;

    /* renamed from: q */
    public List<C78459b> f197130q;

    /* renamed from: r */
    public float f197131r;

    /* renamed from: s */
    public List<Float> f197132s;

    /* renamed from: t */
    public Paint f197133t;

    /* renamed from: u */
    public Paint f197134u;

    /* renamed from: v */
    public int f197135v;

    /* renamed from: w */
    public int f197136w;

    /* renamed from: x */
    public PathEffect f197137x;

    /* renamed from: y */
    public int f197138y;

    /* renamed from: z */
    public Path f197139z;

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepViewIndicator$a */
    public interface C68624a {
    }

    public VerticalStepViewIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public List<Float> getCircleCenterPointPositionList() {
        return this.f197132s;
    }

    public float getCircleRadius() {
        return this.f197122f;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C68624a aVar = this.f197116A;
        if (aVar != null) {
            ((VerticalStepView) aVar).mo94304a();
        }
        this.f197133t.setColor(this.f197135v);
        this.f197134u.setColor(this.f197136w);
        int i = 0;
        while (i < ((ArrayList) this.f197132s).size() - 1) {
            float floatValue = ((Float) ((ArrayList) this.f197132s).get(i)).floatValue();
            int i2 = i + 1;
            float floatValue2 = ((Float) ((ArrayList) this.f197132s).get(i2)).floatValue();
            if (i < this.f197138y) {
                if (this.f197119D) {
                    float f = this.f197128o;
                    float f2 = this.f197122f;
                    float f3 = (floatValue - f2) + 10.0f;
                    Canvas canvas2 = canvas;
                    float f4 = f;
                    canvas2.drawRect(f4, (floatValue2 + f2) - 10.0f, this.f197129p, f3, this.f197134u);
                } else {
                    float f5 = this.f197128o;
                    float f6 = this.f197122f;
                    canvas.drawRect(f5, (floatValue + f6) - 10.0f, this.f197129p, (floatValue2 - f6) + 10.0f, this.f197134u);
                }
            } else if (this.f197119D) {
                this.f197139z.moveTo(this.f197127n, floatValue2 + this.f197122f);
                this.f197139z.lineTo(this.f197127n, floatValue - this.f197122f);
                canvas.drawPath(this.f197139z, this.f197133t);
            } else {
                this.f197139z.moveTo(this.f197127n, floatValue + this.f197122f);
                this.f197139z.lineTo(this.f197127n, floatValue2 - this.f197122f);
                canvas.drawPath(this.f197139z, this.f197133t);
            }
            i = i2;
        }
        for (int i3 = 0; i3 < ((ArrayList) this.f197132s).size(); i3++) {
            float floatValue3 = ((Float) ((ArrayList) this.f197132s).get(i3)).floatValue();
            float f7 = this.f197127n;
            float f8 = this.f197122f;
            this.f197117B = new Rect((int) (f7 - f8), (int) (floatValue3 - f8), (int) (f7 + f8), (int) (floatValue3 + f8));
            int i4 = this.f197130q.get(i3).f229872b;
            if (i4 == 0) {
                this.f197123g.setBounds(this.f197117B);
                this.f197123g.draw(canvas);
            } else if (i4 == 2) {
                this.f197124h.setBounds(this.f197117B);
                this.f197124h.draw(canvas);
            } else if (i4 == -2) {
                this.f197125i.setBounds(this.f197117B);
                this.f197125i.draw(canvas);
            } else {
                this.f197126j.setBounds(this.f197117B);
                this.f197126j.draw(canvas);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f197120d;
        this.f197118C = 0;
        int size = this.f197130q.size();
        if (size > 0) {
            this.f197118C = (int) (((float) (getPaddingTop() + getPaddingBottom())) + (this.f197122f * 2.0f * ((float) size)) + (((float) (size - 1)) * this.f197131r));
        }
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = Math.min(i3, View.MeasureSpec.getSize(i));
        }
        setMeasuredDimension(i3, this.f197118C);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float width = (float) (getWidth() / 2);
        this.f197127n = width;
        float f = this.f197121e;
        this.f197128o = width - (f / 2.0f);
        this.f197129p = width + (f / 2.0f);
        for (int i5 = 0; i5 < this.f197130q.size(); i5++) {
            if (this.f197119D) {
                List<Float> list = this.f197132s;
                float f2 = this.f197122f;
                float f3 = (float) i5;
                ((ArrayList) list).add(Float.valueOf(((float) this.f197118C) - ((f2 + ((f3 * f2) * 2.0f)) + (f3 * this.f197131r))));
            } else {
                List<Float> list2 = this.f197132s;
                float f4 = this.f197122f;
                float f5 = (float) i5;
                ((ArrayList) list2).add(Float.valueOf(f4 + (f5 * f4 * 2.0f) + (f5 * this.f197131r)));
            }
        }
        C68624a aVar = this.f197116A;
        if (aVar != null) {
            ((VerticalStepView) aVar).mo94304a();
        }
    }

    public void setAttentionIcon(Drawable drawable) {
        this.f197124h = drawable;
    }

    public void setComplectingPosition(int i) {
        this.f197138y = i;
        requestLayout();
    }

    public void setCompleteIcon(Drawable drawable) {
        this.f197123g = drawable;
    }

    public void setCompletedLineColor(int i) {
        this.f197136w = i;
    }

    public void setDefaultIcon(Drawable drawable) {
        this.f197125i = drawable;
    }

    public void setIndicatorLinePaddingProportion(float f) {
        this.f197131r = f * ((float) this.f197120d);
    }

    public void setOnDrawListener(C68624a aVar) {
        this.f197116A = aVar;
    }

    public void setSteps(List<C78459b> list) {
        if (list == null) {
            this.f197130q = new ArrayList();
            return;
        }
        this.f197130q = list;
        requestLayout();
    }

    public void setUnCompletedLineColor(int i) {
        this.f197135v = i;
    }

    public VerticalStepViewIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197120d = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        this.f197130q = new ArrayList();
        this.f197135v = C111105a.m151500b(getContext(), C0966R.color.ahr);
        this.f197136w = -1;
        this.f197139z = new Path();
        this.f197137x = new DashPathEffect(new float[]{8.0f, 8.0f, 8.0f, 8.0f}, 1.0f);
        this.f197132s = new ArrayList();
        this.f197133t = new Paint();
        this.f197134u = new Paint();
        this.f197133t.setAntiAlias(true);
        this.f197133t.setColor(this.f197135v);
        this.f197133t.setStyle(Paint.Style.STROKE);
        this.f197133t.setStrokeWidth(2.0f);
        this.f197134u.setAntiAlias(true);
        this.f197134u.setColor(this.f197136w);
        this.f197134u.setStyle(Paint.Style.STROKE);
        this.f197134u.setStrokeWidth(2.0f);
        this.f197133t.setPathEffect(this.f197137x);
        this.f197134u.setStyle(Paint.Style.FILL);
        float f = (float) this.f197120d;
        this.f197121e = 0.05f * f;
        this.f197122f = 0.28f * f;
        this.f197131r = f * 0.85f;
        this.f197123g = C111105a.C111110c.m151511b(getContext(), C0966R.C0969drawable.bqm);
        this.f197124h = C111105a.C111110c.m151511b(getContext(), C0966R.C0969drawable.bqk);
        this.f197125i = C111105a.C111110c.m151511b(getContext(), C0966R.C0969drawable.bqn);
        this.f197126j = C111105a.C111110c.m151511b(getContext(), C0966R.C0969drawable.bql);
        this.f197119D = true;
    }
}
