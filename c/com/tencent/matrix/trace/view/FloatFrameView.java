package com.tencent.matrix.trace.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import java.util.Iterator;
import java.util.LinkedList;

public class FloatFrameView extends LinearLayout {

    /* renamed from: A */
    public TextView f235596A;

    /* renamed from: d */
    public TextView f235597d;

    /* renamed from: e */
    public LineChartView f235598e;

    /* renamed from: f */
    public TextView f235599f;

    /* renamed from: g */
    public TextView f235600g;

    /* renamed from: h */
    public TextView f235601h;

    /* renamed from: i */
    public TextView f235602i;

    /* renamed from: j */
    public TextView f235603j;

    /* renamed from: n */
    public TextView f235604n;

    /* renamed from: o */
    public TextView f235605o;

    /* renamed from: p */
    public TextView f235606p;

    /* renamed from: q */
    public TextView f235607q;

    /* renamed from: r */
    public TextView f235608r;

    /* renamed from: s */
    public TextView f235609s;

    /* renamed from: t */
    public TextView f235610t;

    /* renamed from: u */
    public TextView f235611u;

    /* renamed from: v */
    public TextView f235612v;

    /* renamed from: w */
    public TextView f235613w;

    /* renamed from: x */
    public TextView f235614x;

    /* renamed from: y */
    public TextView f235615y;

    /* renamed from: z */
    public TextView f235616z;

    public FloatFrameView(Context context) {
        super(context);
        mo112132a(context);
    }

    /* renamed from: a */
    public final void mo112132a(Context context) {
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        LayoutInflater.from(context).inflate(C0966R.C0971layout.arr, this);
        this.f235597d = (TextView) findViewById(C0966R.C0970id.eej);
        this.f235599f = (TextView) findViewById(C0966R.C0970id.f357954co3);
        TextView textView = (TextView) findViewById(C0966R.C0970id.j2_);
        this.f235599f.setText("{other info}");
        this.f235600g = (TextView) findViewById(C0966R.C0970id.f359456oj3);
        this.f235601h = (TextView) findViewById(C0966R.C0970id.of6);
        this.f235602i = (TextView) findViewById(C0966R.C0970id.e0v);
        this.f235603j = (TextView) findViewById(C0966R.C0970id.ofd);
        this.f235604n = (TextView) findViewById(C0966R.C0970id.ocb);
        this.f235605o = (TextView) findViewById(C0966R.C0970id.oiy);
        this.f235606p = (TextView) findViewById(C0966R.C0970id.obo);
        this.f235607q = (TextView) findViewById(C0966R.C0970id.oix);
        this.f235608r = (TextView) findViewById(C0966R.C0970id.oef);
        this.f235609s = (TextView) findViewById(C0966R.C0970id.f359413oj2);
        this.f235610t = (TextView) findViewById(C0966R.C0970id.oiw);
        this.f235611u = (TextView) findViewById(C0966R.C0970id.oiv);
        this.f235612v = (TextView) findViewById(C0966R.C0970id.oiu);
        this.f235613w = (TextView) findViewById(C0966R.C0970id.oit);
        this.f235614x = (TextView) findViewById(C0966R.C0970id.fn8);
        this.f235615y = (TextView) findViewById(C0966R.C0970id.fn7);
        this.f235616z = (TextView) findViewById(C0966R.C0970id.fn5);
        this.f235596A = (TextView) findViewById(C0966R.C0970id.fn4);
        this.f235598e = (LineChartView) findViewById(C0966R.C0970id.f357646b01);
    }

    public FloatFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112132a(context);
    }

    public static class LineChartView extends View {

        /* renamed from: A */
        public float f193434A;

        /* renamed from: d */
        public final Paint f193435d;

        /* renamed from: e */
        public final TextPaint f193436e;

        /* renamed from: f */
        public final Paint f193437f;

        /* renamed from: g */
        public final Paint f193438g;

        /* renamed from: h */
        public final LinkedList<C67647a> f193439h;

        /* renamed from: i */
        public float f193440i;

        /* renamed from: j */
        public float f193441j;

        /* renamed from: n */
        public Path f193442n;

        /* renamed from: o */
        public Path f193443o;

        /* renamed from: p */
        public float[] f193444p;

        /* renamed from: q */
        public float[] f193445q;

        /* renamed from: r */
        public int f193446r;

        /* renamed from: s */
        public int f193447s;

        /* renamed from: t */
        public int f193448t;

        /* renamed from: u */
        public int f193449u;

        /* renamed from: v */
        public int f193450v;

        /* renamed from: w */
        public int f193451w;

        /* renamed from: x */
        public float f193452x;

        /* renamed from: y */
        public float f193453y;

        /* renamed from: z */
        public float f193454z;

        /* renamed from: com.tencent.matrix.trace.view.FloatFrameView$LineChartView$a */
        public class C67647a {

            /* renamed from: a */
            public float[] f193455a;

            /* renamed from: b */
            public int f193456b;

            /* renamed from: c */
            public int f193457c;

            public C67647a(int i, int i2) {
                float[] fArr = new float[4];
                this.f193455a = fArr;
                this.f193456b = i;
                this.f193457c = i2;
                fArr[0] = LineChartView.this.f193453y;
                fArr[2] = ((((float) (60 - i)) * LineChartView.this.f193454z) / 60.0f) + (((float) LineChartView.this.getWidth()) - LineChartView.this.f193454z);
            }
        }

        public LineChartView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f193442n = new Path();
            this.f193443o = new Path();
            this.f193444p = new float[2];
            this.f193445q = new float[2];
            this.f193446r = getContext().getResources().getColor(C0966R.color.a0z);
            this.f193447s = getContext().getResources().getColor(C0966R.color.f356942a13);
            this.f193448t = getContext().getResources().getColor(C0966R.color.f356941a12);
            this.f193449u = getContext().getResources().getColor(C0966R.color.f356940a11);
            this.f193450v = getContext().getResources().getColor(C0966R.color.f356939a10);
            this.f193451w = getContext().getResources().getColor(C0966R.color.f3280m1);
            this.f193452x = (float) m79858a(getContext(), 8.0f);
            this.f193435d = new Paint();
            TextPaint textPaint = new TextPaint(1);
            this.f193436e = textPaint;
            float a = (float) m79858a(getContext(), 8.0f);
            this.f193434A = a;
            textPaint.setTextSize(a);
            textPaint.setStrokeWidth((float) m79858a(getContext(), 1.0f));
            textPaint.setColor(this.f193451w);
            TextPaint textPaint2 = new TextPaint(1);
            this.f193437f = textPaint2;
            textPaint2.setStrokeWidth((float) m79858a(getContext(), 1.0f));
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setPathEffect(new DashPathEffect(new float[]{6.0f, 6.0f}, 0.0f));
            Paint paint = new Paint(textPaint);
            this.f193438g = paint;
            paint.setStrokeWidth((float) m79858a(getContext(), 1.0f));
            paint.setColor(this.f193451w);
            paint.setStyle(Paint.Style.STROKE);
            paint.setPathEffect(new DashPathEffect(new float[]{6.0f, 6.0f}, 0.0f));
            this.f193439h = new LinkedList<>();
        }

        /* renamed from: a */
        public static int m79858a(Context context, float f) {
            return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
        }

        public void draw(Canvas canvas) {
            Canvas canvas2 = canvas;
            super.draw(canvas);
            Iterator<C67647a> it = this.f193439h.iterator();
            int i = 0;
            int i2 = 1;
            while (it.hasNext()) {
                C67647a next = it.next();
                int i3 = i + next.f193456b;
                int color = LineChartView.this.f193435d.getColor();
                int i4 = next.f193457c;
                if (color != i4) {
                    LineChartView.this.f193435d.setColor(i4);
                }
                float[] fArr = next.f193455a;
                int i5 = i2 + 1;
                LineChartView lineChartView = LineChartView.this;
                float f = ((float) i5) * lineChartView.f193440i;
                fArr[1] = f;
                fArr[3] = f;
                canvas.drawLine(fArr[0], f, fArr[2], f, lineChartView.f193435d);
                if (i2 % 25 == 0) {
                    Path path = new Path();
                    float f2 = next.f193455a[1];
                    path.moveTo(0.0f, f2);
                    path.lineTo((float) getMeasuredHeight(), f2);
                    canvas2.drawPath(path, this.f193438g);
                    this.f193436e.setColor(this.f193451w);
                    canvas2.drawText((i2 / 5) + "s", 0.0f, this.f193434A + f2, this.f193436e);
                    if (i2 > 0) {
                        int i6 = i3 / i2;
                        this.f193436e.setColor(i6 > 57 ? this.f193446r : i6 > 51 ? this.f193447s : i6 > 36 ? this.f193448t : i6 > 18 ? this.f193449u : this.f193450v);
                        canvas2.drawText(i6 + "FPS", 0.0f, f2 - (this.f193434A / 2.0f), this.f193436e);
                    }
                }
                i = i3;
                i2 = i5;
            }
            this.f193436e.setColor(this.f193451w);
            this.f193437f.setColor(this.f193447s);
            canvas2.drawPath(this.f193442n, this.f193437f);
            float[] fArr2 = this.f193444p;
            float f3 = fArr2[0];
            float f4 = this.f193434A;
            canvas2.drawText("50", f3 - (f4 / 2.0f), fArr2[1] + f4, this.f193436e);
            this.f193437f.setColor(this.f193448t);
            canvas2.drawPath(this.f193443o, this.f193437f);
            float[] fArr3 = this.f193445q;
            float f5 = fArr3[0];
            float f6 = this.f193434A;
            canvas2.drawText(PayuSecureEncrypt.ENCRYPT_VERSION_HASH, f5 - (f6 / 2.0f), fArr3[1] + f6, this.f193436e);
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (z) {
                this.f193453y = (float) getMeasuredWidth();
                getMeasuredHeight();
                this.f193454z = this.f193453y - (this.f193452x * 3.0f);
                float a = (float) m79858a(getContext(), 1.0f);
                this.f193441j = a;
                this.f193435d.setStrokeWidth(a);
                float f = this.f193441j * 2.0f;
                this.f193440i = f;
                float f2 = this.f193454z;
                float f3 = f2 / 60.0f;
                float[] fArr = this.f193444p;
                float f4 = (10.0f * f3) + (this.f193453y - f2);
                fArr[0] = f4;
                float f5 = (f * 50.0f) + this.f193452x;
                fArr[1] = f5;
                this.f193442n.moveTo(f4, f5);
                this.f193442n.lineTo(this.f193444p[0], 0.0f);
                float[] fArr2 = this.f193445q;
                float f6 = (f3 * 30.0f) + (this.f193453y - this.f193454z);
                fArr2[0] = f6;
                float f7 = (this.f193440i * 50.0f) + this.f193452x;
                fArr2[1] = f7;
                this.f193443o.moveTo(f6, f7);
                this.f193443o.lineTo(this.f193445q[0], 0.0f);
            }
        }

        public LineChartView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }
    }
}
