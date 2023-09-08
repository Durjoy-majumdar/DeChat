package com.tencent.p014mm.plugin.battery.stats.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p329d3.C58104c;

/* renamed from: com.tencent.mm.plugin.battery.stats.chart.SimpleLineChart */
public class SimpleLineChart extends View {

    /* renamed from: C */
    public static final DateFormat f197516C = new SimpleDateFormat("HH:mm", Locale.US);

    /* renamed from: A */
    public float f197517A;

    /* renamed from: B */
    public int f197518B;

    /* renamed from: d */
    public Paint f197519d;

    /* renamed from: e */
    public Paint f197520e;

    /* renamed from: f */
    public Float[] f197521f;

    /* renamed from: g */
    public Long[] f197522g;

    /* renamed from: h */
    public float f197523h;

    /* renamed from: i */
    public float f197524i;

    /* renamed from: j */
    public float f197525j;

    /* renamed from: n */
    public float f197526n;

    /* renamed from: o */
    public float f197527o;

    /* renamed from: p */
    public float f197528p;

    /* renamed from: q */
    public float f197529q;

    /* renamed from: r */
    public float f197530r;

    /* renamed from: s */
    public float f197531s;

    /* renamed from: t */
    public float f197532t;

    /* renamed from: u */
    public float f197533u;

    /* renamed from: v */
    public float f197534v;

    /* renamed from: w */
    public float f197535w;

    /* renamed from: x */
    public Path f197536x;

    /* renamed from: y */
    public Path f197537y;

    /* renamed from: z */
    public List<PointF> f197538z;

    public SimpleLineChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m81040a(List<C58104c<Float, Long>> list, List<Integer> list2, float f, int i) {
        if (list.size() >= i && list2.size() < i) {
            int i2 = -1;
            float f2 = -1.0f;
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (!list2.contains(Integer.valueOf(i3))) {
                    float floatValue = ((Float) list.get(i3).f166179a).floatValue() - f;
                    if (Math.abs(floatValue) > f2) {
                        i2 = i3;
                        f2 = floatValue;
                    }
                }
            }
            list2.add(Integer.valueOf(i2));
            m81040a(list, list2, f, i);
        }
    }

    private float getMaxData() {
        float f = 0.0f;
        for (Float floatValue : this.f197521f) {
            f = Math.max(f, floatValue.floatValue());
        }
        return f;
    }

    public void onDraw(Canvas canvas) {
        String str;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        this.f197519d = new Paint(1);
        this.f197520e = new Paint(1);
        this.f197536x = new Path();
        this.f197537y = new Path();
        Rect rect = new Rect();
        long longValue = this.f197522g[0].longValue();
        long j = 0;
        String format = longValue <= 0 ? "NULL" : f197516C.format(new Date(longValue));
        this.f197519d.getTextBounds(format, 0, format.length(), rect);
        rect.width();
        this.f197525j = (float) rect.height();
        this.f197530r = (this.f197523h - (this.f197526n * 2.0f)) / ((float) this.f197522g.length);
        float maxData = ((this.f197524i - this.f197532t) - this.f197531s) / getMaxData();
        float f = this.f197526n + (this.f197530r / 2.0f);
        ((ArrayList) this.f197538z).clear();
        for (Float floatValue : this.f197521f) {
            ((ArrayList) this.f197538z).add(new PointF(f, (this.f197524i - this.f197531s) - (floatValue.floatValue() * maxData)));
            f += this.f197530r;
        }
        float f2 = (this.f197530r / 2.0f) + this.f197526n;
        float f3 = this.f197524i - this.f197527o;
        this.f197519d.setTextSize((float) ((int) ((getContext().getResources().getDisplayMetrics().scaledDensity * 13.0f) + 0.5f)));
        this.f197519d.setColor(getResources().getColor(C0966R.color.FG_2));
        this.f197519d.setTextAlign(Paint.Align.CENTER);
        Long[] lArr = this.f197522g;
        int length = lArr.length;
        int i = 0;
        while (i < length) {
            long longValue2 = lArr[i].longValue();
            canvas2.drawText(longValue2 <= j ? "NULL" : f197516C.format(new Date(longValue2)), f2, f3, this.f197519d);
            f2 += this.f197530r;
            i++;
            j = 0;
        }
        float f4 = this.f197526n;
        float f5 = this.f197523h - f4;
        float f6 = ((this.f197524i - this.f197525j) - this.f197529q) - this.f197527o;
        this.f197519d.setColor(getResources().getColor(C0966R.color.f2966ao));
        this.f197519d.setStrokeWidth(this.f197535w);
        canvas.drawLine(f4, f6, f5, f6, this.f197519d);
        float f7 = this.f197526n;
        float f8 = ((this.f197524i - this.f197525j) - this.f197529q) - this.f197527o;
        float f9 = this.f197528p + f8;
        if (this.f197518B == 1) {
            float f15 = f7;
            for (int i2 = 0; i2 < this.f197522g.length + 1; i2++) {
                canvas.drawLine(f15, f8, f15, f9, this.f197519d);
                f15 += this.f197530r;
            }
        }
        float f16 = this.f197524i;
        float f17 = f16 - f8;
        this.f197531s = f17;
        float maxData2 = ((f16 - this.f197532t) - f17) / getMaxData();
        this.f197537y.reset();
        this.f197537y.moveTo(this.f197526n + (this.f197530r / 2.0f), this.f197524i - this.f197531s);
        for (int i3 = 0; i3 < ((ArrayList) this.f197538z).size(); i3++) {
            this.f197537y.lineTo(((PointF) ((ArrayList) this.f197538z).get(i3)).x, ((PointF) ((ArrayList) this.f197538z).get(i3)).y);
        }
        ArrayList arrayList = (ArrayList) this.f197538z;
        this.f197537y.lineTo(((PointF) arrayList.get(arrayList.size() - 1)).x, this.f197524i - this.f197531s);
        this.f197537y.close();
        this.f197520e.setStyle(Paint.Style.FILL);
        float f18 = this.f197526n + (this.f197530r / 2.0f);
        this.f197520e.setShader(new LinearGradient(f18, (this.f197524i - this.f197531s) - (getMaxData() * maxData2), f18, (this.f197524i - this.f197531s) - this.f197532t, Color.parseColor("#4DFFB59C"), Color.parseColor("#4DFFF5F1"), Shader.TileMode.CLAMP));
        canvas2.drawPath(this.f197537y, this.f197520e);
        for (int i4 = 0; i4 < ((ArrayList) this.f197538z).size(); i4++) {
            if (this.f197518B == 1) {
                this.f197519d.setColor(getResources().getColor(C0966R.color.Red_170));
                canvas2.drawCircle(((PointF) ((ArrayList) this.f197538z).get(i4)).x, ((PointF) ((ArrayList) this.f197538z).get(i4)).y, this.f197534v, this.f197519d);
            }
            this.f197519d.setColor(getResources().getColor(C0966R.color.f2966ao));
            canvas2.drawCircle(((PointF) ((ArrayList) this.f197538z).get(i4)).x, ((PointF) ((ArrayList) this.f197538z).get(i4)).y, this.f197533u, this.f197519d);
        }
        this.f197536x.reset();
        for (int i5 = 0; i5 < ((ArrayList) this.f197538z).size(); i5++) {
            if (i5 == 0) {
                this.f197536x.moveTo(((PointF) ((ArrayList) this.f197538z).get(i5)).x, ((PointF) ((ArrayList) this.f197538z).get(i5)).y);
            } else {
                this.f197536x.lineTo(((PointF) ((ArrayList) this.f197538z).get(i5)).x, ((PointF) ((ArrayList) this.f197538z).get(i5)).y);
            }
        }
        this.f197519d.setStyle(Paint.Style.STROKE);
        this.f197519d.setStrokeWidth(this.f197535w);
        this.f197519d.setColor(getResources().getColor(C0966R.color.f2966ao));
        canvas2.drawPath(this.f197536x, this.f197519d);
        new Rect();
        this.f197519d.setStyle(Paint.Style.FILL);
        this.f197519d.setColor(getResources().getColor(C0966R.color.FG_0));
        this.f197519d.setTextAlign(Paint.Align.CENTER);
        for (int i6 = 0; i6 < this.f197521f.length; i6++) {
            float f19 = ((PointF) ((ArrayList) this.f197538z).get(i6)).x;
            float f25 = ((PointF) ((ArrayList) this.f197538z).get(i6)).y - this.f197517A;
            float floatValue2 = this.f197521f[i6].floatValue();
            if (floatValue2 < 0.0f) {
                str = "";
            } else {
                str = ((int) floatValue2) + "%";
            }
            canvas2.drawText(str, f19, f25, this.f197519d);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f197523h = (float) i;
        this.f197524i = (float) i2;
    }

    public void setData(List<C58104c<Float, Long>> list) {
        if (list.size() > 7) {
            float f = 0.0f;
            for (C58104c<Float, Long> cVar : list) {
                f += ((Float) cVar.f166179a).floatValue();
            }
            float size = f / ((float) list.size());
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            hashSet.add(Integer.valueOf(list.size() - 1));
            if (!list.isEmpty()) {
                float floatValue = ((Float) list.get(0).f166179a).floatValue();
                float floatValue2 = ((Float) list.get(0).f166179a).floatValue();
                int i = 0;
                int i2 = 0;
                for (int i3 = 1; i3 < list.size(); i3++) {
                    C58104c cVar2 = list.get(i3);
                    if (((Float) cVar2.f166179a).floatValue() < floatValue) {
                        floatValue = ((Float) cVar2.f166179a).floatValue();
                        i = i3;
                    }
                    if (((Float) cVar2.f166179a).floatValue() > floatValue2) {
                        floatValue2 = ((Float) cVar2.f166179a).floatValue();
                        i2 = i3;
                    }
                }
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(i2);
                hashSet.add(valueOf);
                hashSet.add(valueOf2);
                ArrayList arrayList = new ArrayList(hashSet);
                m81040a(list, arrayList, size, 7);
                Collections.sort(arrayList);
                ArrayList arrayList2 = new ArrayList(7);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(list.get(((Integer) it.next()).intValue()));
                }
                list = arrayList2;
            } else {
                throw new IllegalStateException("Input list in empty");
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C58104c next : list) {
            arrayList3.add((Float) next.f166179a);
            arrayList4.add((Long) next.f166180b);
        }
        this.f197521f = (Float[]) arrayList3.toArray(new Float[0]);
        this.f197522g = (Long[]) arrayList4.toArray(new Long[0]);
        invalidate();
    }

    public void setMode(int i) {
        this.f197518B = i;
    }

    public SimpleLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197521f = new Float[]{Float.valueOf(70.0f), Float.valueOf(100.0f), Float.valueOf(95.0f), Float.valueOf(88.0f)};
        this.f197522g = new Long[]{0L, 0L, 0L, 0L};
        this.f197526n = 10.0f;
        this.f197527o = 10.0f;
        this.f197528p = 20.0f;
        this.f197529q = 20.0f + 20.0f;
        this.f197532t = 120.0f;
        this.f197533u = 6.0f;
        this.f197534v = 12.0f;
        this.f197535w = 1.0f;
        this.f197538z = new ArrayList();
        this.f197517A = 20.0f;
        this.f197518B = 1;
    }
}
