package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceStepChartView */
public class ExdeviceStepChartView extends View {

    /* renamed from: A */
    public final int f197925A;

    /* renamed from: B */
    public final int f197926B;

    /* renamed from: C */
    public final int f197927C;

    /* renamed from: D */
    public final int f197928D;

    /* renamed from: E */
    public int f197929E;

    /* renamed from: F */
    public final Typeface f197930F;

    /* renamed from: G */
    public int f197931G;

    /* renamed from: H */
    public int[] f197932H;

    /* renamed from: I */
    public float[] f197933I;

    /* renamed from: J */
    public float[] f197934J;

    /* renamed from: K */
    public boolean[] f197935K;

    /* renamed from: L */
    public Paint f197936L;

    /* renamed from: M */
    public Path f197937M;

    /* renamed from: N */
    public Path f197938N;

    /* renamed from: P */
    public List<Point> f197939P;

    /* renamed from: Q */
    public List<String> f197940Q;

    /* renamed from: R */
    public int f197941R;

    /* renamed from: S */
    public int f197942S;

    /* renamed from: T */
    public boolean f197943T;

    /* renamed from: d */
    public final int f197944d = getResources().getColor(C0966R.color.f3345or);

    /* renamed from: e */
    public final int f197945e = getResources().getColor(C0966R.color.f3346os);

    /* renamed from: f */
    public final int f197946f = getResources().getColor(C0966R.color.f3346os);

    /* renamed from: g */
    public int f197947g = Integer.MAX_VALUE;

    /* renamed from: h */
    public final int f197948h = ((int) mo94765b(1, 2.5f));

    /* renamed from: i */
    public final int f197949i = ((int) mo94765b(1, 4.0f));

    /* renamed from: j */
    public final int f197950j = ((int) mo94765b(1, 1.8f));

    /* renamed from: n */
    public final int f197951n = ((int) mo94765b(1, 1.0f));

    /* renamed from: o */
    public final int f197952o = ((int) mo94765b(1, 8.0f));

    /* renamed from: p */
    public final int f197953p = ((int) mo94765b(1, 22.0f));

    /* renamed from: q */
    public final int f197954q = ((int) mo94765b(1, 67.0f));

    /* renamed from: r */
    public final int f197955r = ((int) mo94765b(1, 40.0f));

    /* renamed from: s */
    public final int f197956s = ((int) mo94765b(1, 22.0f));

    /* renamed from: t */
    public final int f197957t;

    /* renamed from: u */
    public final int f197958u;

    /* renamed from: v */
    public final float f197959v;

    /* renamed from: w */
    public final float f197960w;

    /* renamed from: x */
    public final int f197961x;

    /* renamed from: y */
    public final int f197962y;

    /* renamed from: z */
    public final int f197963z;

    public ExdeviceStepChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94765b(1, 55.0f);
        this.f197957t = (int) mo94765b(1, 35.0f);
        this.f197958u = (int) mo94765b(1, 45.0f);
        this.f197959v = (float) ((int) mo94765b(1, 8.0f));
        this.f197960w = (float) ((int) mo94765b(1, 8.0f));
        this.f197961x = (int) mo94765b(1, 2.0f);
        this.f197962y = (int) mo94765b(1, 15.0f);
        this.f197963z = (int) mo94765b(1, 33.0f);
        this.f197925A = (int) mo94765b(1, 8.0f);
        this.f197926B = (int) mo94765b(1, 35.0f);
        this.f197927C = (int) mo94765b(1, 10.0f);
        this.f197928D = (int) mo94765b(1, 58.0f);
        mo94765b(1, 1.0f);
        this.f197929E = 0;
        this.f197930F = Typeface.create(Typeface.DEFAULT_BOLD, 0);
        Typeface.create(Typeface.DEFAULT_BOLD, 1);
        this.f197931G = 0;
        this.f197932H = new int[]{0, 0, 0, 0, 0, 0, 0};
        this.f197933I = new float[7];
        this.f197934J = new float[7];
        this.f197935K = new boolean[7];
        new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        mo94766c();
    }

    private void getData() {
        ((LinkedList) this.f197939P).clear();
        this.f197931G = ((0 - this.f197952o) - this.f197953p) / 6;
        int i = ((0 - this.f197954q) - this.f197955r) / 2;
        int i2 = 0;
        while (true) {
            float[] fArr = this.f197933I;
            if (i2 >= fArr.length) {
                break;
            }
            fArr[i2] = (float) (this.f197952o + (this.f197931G * i2));
            i2++;
        }
        int length = this.f197932H.length;
        if (length > 7) {
            length = 7;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int[] iArr = this.f197932H;
            if (iArr[i4] > 100000) {
                iArr[i4] = 100000;
            }
            if (iArr[i4] < 0) {
                iArr[i4] = 0;
            }
            int i5 = iArr[i4];
            if (i5 > i3) {
                i3 = i5;
            }
        }
        if (i3 <= 15000 && i3 >= 0) {
            i3 = 15000;
        } else if (i3 <= 15000 || i3 > 100000) {
            i3 = 0;
        } else if (((double) i3) / 5000.0d > ((double) (((float) i3) / 5000.0f))) {
            i3 = ((i3 / 5000) + 1) * 5000;
        }
        int i6 = this.f197955r;
        this.f197929E = (0 - i6) - ((((0 - this.f197954q) - i6) * 10000) / i3);
        for (int i7 = 0; i7 < length; i7++) {
            float[] fArr2 = this.f197934J;
            int i8 = this.f197955r;
            fArr2[i7] = ((float) (0 - i8)) - ((((float) this.f197932H[i7]) / ((float) i3)) * ((float) ((0 - this.f197954q) - i8)));
            ((LinkedList) this.f197939P).add(new Point((int) this.f197933I[i7], (int) this.f197934J[i7]));
        }
    }

    /* renamed from: a */
    public final void mo94764a(Canvas canvas, boolean z) {
        if (z) {
            this.f197938N.reset();
            this.f197938N.moveTo((float) ((Point) ((LinkedList) this.f197939P).get(0)).x, (float) ((Point) ((LinkedList) this.f197939P).get(0)).y);
            for (int i = 0; i < ((LinkedList) this.f197939P).size(); i++) {
                this.f197938N.lineTo((float) ((Point) ((LinkedList) this.f197939P).get(i)).x, (float) ((Point) ((LinkedList) this.f197939P).get(i)).y);
            }
            Path path = this.f197938N;
            float[] fArr = this.f197933I;
            path.lineTo(fArr[fArr.length - 1], (float) ((0 - this.f197957t) - 1));
            this.f197938N.lineTo((float) this.f197952o, (float) ((0 - this.f197957t) - 1));
            this.f197938N.lineTo((float) this.f197952o, this.f197934J[0]);
            canvas.drawPath(this.f197938N, this.f197936L);
            return;
        }
        this.f197938N.reset();
        this.f197938N.moveTo((float) ((Point) ((LinkedList) this.f197939P).get(0)).x, (float) ((Point) ((LinkedList) this.f197939P).get(0)).y);
        for (int i2 = 0; i2 < ((LinkedList) this.f197939P).size(); i2++) {
            if (i2 > 0) {
                if (((Point) ((LinkedList) this.f197939P).get(i2 - 1)).y == 0 - this.f197955r) {
                    this.f197936L.reset();
                    this.f197936L.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
                    this.f197936L.setAntiAlias(true);
                    this.f197936L.setStrokeWidth((float) this.f197950j);
                    this.f197936L.setStyle(Paint.Style.STROKE);
                    this.f197936L.setColor(-1);
                } else {
                    mo94767d();
                }
            } else {
                mo94767d();
            }
            this.f197938N.lineTo((float) ((Point) ((LinkedList) this.f197939P).get(i2)).x, (float) ((Point) ((LinkedList) this.f197939P).get(i2)).y);
            canvas.drawPath(this.f197938N, this.f197936L);
            this.f197938N.reset();
            this.f197938N.moveTo((float) ((Point) ((LinkedList) this.f197939P).get(i2)).x, (float) ((Point) ((LinkedList) this.f197939P).get(i2)).y);
        }
    }

    /* renamed from: b */
    public float mo94765b(int i, float f) {
        Context context = getContext();
        return TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
    }

    /* renamed from: c */
    public final void mo94766c() {
        this.f197936L = new Paint();
        this.f197937M = new Path();
        this.f197938N = new Path();
        this.f197939P = new LinkedList();
        this.f197940Q = new LinkedList();
        for (int i = 0; i < 7; i++) {
            if (i == 6) {
                this.f197935K[i] = true;
            } else {
                this.f197935K[i] = false;
            }
        }
    }

    /* renamed from: d */
    public final void mo94767d() {
        this.f197936L.reset();
        this.f197936L.setAntiAlias(true);
        this.f197936L.setStrokeWidth((float) this.f197950j);
        this.f197936L.setStyle(Paint.Style.STROKE);
        this.f197936L.setColor(-1);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        getData();
        super.onDraw(canvas);
        this.f197936L.reset();
        this.f197936L.setAntiAlias(true);
        this.f197936L.setColor(-1);
        this.f197936L.setStrokeWidth(0.0f);
        this.f197936L.setStyle(Paint.Style.FILL);
        for (int i = 0; i < ((LinkedList) this.f197939P).size(); i++) {
            Point point = (Point) ((LinkedList) this.f197939P).get(i);
            if (i == ((LinkedList) this.f197939P).size() - 1) {
                canvas2.drawCircle((float) point.x, (float) point.y, (float) this.f197949i, this.f197936L);
            } else {
                canvas2.drawCircle((float) point.x, (float) point.y, (float) this.f197948h, this.f197936L);
            }
        }
        int i2 = this.f197947g;
        if (i2 != Integer.MAX_VALUE) {
            this.f197936L.reset();
            this.f197936L.setColor(this.f197945e);
            this.f197936L.setAntiAlias(true);
            this.f197936L.setStrokeWidth(0.0f);
            this.f197936L.setTextSize(mo94765b(2, 12.0f));
            this.f197936L.setTextAlign(Paint.Align.CENTER);
            if (i2 >= 0 && i2 <= 6) {
                if (i2 == 0) {
                    this.f197936L.setTextAlign(Paint.Align.LEFT);
                }
                if (i2 == 6) {
                    this.f197936L.setTextAlign(Paint.Align.RIGHT);
                }
                if (!this.f197943T) {
                    int i3 = ((Point) ((LinkedList) this.f197939P).get(i2)).y - this.f197928D;
                    this.f197941R = i3;
                    this.f197942S = i3;
                    this.f197943T = true;
                }
                if (this.f197943T) {
                    int i4 = this.f197942S;
                    float f = (float) (((double) i4) / 8.0d);
                    int i5 = this.f197941R;
                    if (i5 > 0) {
                        this.f197936L.setAlpha(((i4 - i5) * 255) / i4);
                    }
                    canvas2.drawText("" + this.f197932H[i2], (float) ((Point) ((LinkedList) this.f197939P).get(i2)).x, (float) (this.f197941R + this.f197928D), this.f197936L);
                    int i6 = this.f197941R;
                    if (i6 > 0) {
                        float f2 = (float) i6;
                        float f3 = f2 / ((float) this.f197942S);
                        if (f3 <= 1.0f / f) {
                            this.f197941R = i6 - 1;
                        } else {
                            this.f197941R = (int) (f2 - (f3 * f));
                        }
                        invalidate();
                    } else {
                        this.f197943T = false;
                    }
                }
            }
            int i7 = this.f197947g;
            if (i7 >= 0 && i7 <= 6) {
                this.f197935K[i7] = true;
            }
        }
        this.f197936L.reset();
        this.f197937M.reset();
        this.f197936L.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.f197936L.setColor(this.f197944d);
        this.f197936L.setStrokeWidth((float) this.f197951n);
        this.f197936L.setAlpha(102);
        this.f197936L.setStyle(Paint.Style.STROKE);
        int i8 = this.f197929E;
        if (i8 != 0) {
            this.f197937M.moveTo((float) this.f197952o, (float) i8);
            this.f197937M.lineTo((float) (0 - this.f197956s), (float) this.f197929E);
            canvas2.drawPath(this.f197937M, this.f197936L);
        }
        this.f197936L.reset();
        this.f197937M.reset();
        this.f197936L.setColor(this.f197944d);
        this.f197936L.setStrokeWidth((float) this.f197951n);
        this.f197936L.setStyle(Paint.Style.STROKE);
        this.f197936L.setAlpha(102);
        this.f197937M.reset();
        this.f197937M.moveTo(this.f197959v, (float) (0 - this.f197957t));
        float f4 = (float) 0;
        this.f197937M.lineTo(f4 - this.f197960w, (float) (0 - this.f197957t));
        this.f197937M.moveTo(this.f197959v, (float) this.f197958u);
        this.f197937M.lineTo(f4 - this.f197960w, (float) this.f197958u);
        canvas2.drawPath(this.f197937M, this.f197936L);
        this.f197936L.reset();
        this.f197936L.setColor(this.f197946f);
        this.f197936L.setAntiAlias(true);
        this.f197936L.setAlpha(102);
        this.f197936L.setStrokeWidth(0.0f);
        this.f197936L.setTextSize(mo94765b(2, 12.0f));
        this.f197936L.setTextAlign(Paint.Align.RIGHT);
        canvas2.drawText(getResources().getString(C0966R.string.f360395cf1), (float) (0 - this.f197961x), (float) (((double) this.f197929E) + (((double) this.f197936L.getTextSize()) * 0.34d)), this.f197936L);
        this.f197936L.reset();
        this.f197936L.setColor(-1);
        this.f197936L.setAntiAlias(true);
        this.f197936L.setStrokeWidth(0.0f);
        this.f197936L.setTypeface(this.f197930F);
        this.f197936L.setTextSize(mo94765b(2, 28.0f));
        canvas2.drawText(getResources().getString(C0966R.string.f360396cf3), (float) this.f197925A, (float) this.f197963z, this.f197936L);
        this.f197936L.setTextAlign(Paint.Align.RIGHT);
        this.f197936L.setTextSize(mo94765b(2, 33.0f));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int[] iArr = this.f197932H;
        sb.append(iArr[iArr.length - 1]);
        canvas2.drawText(sb.toString(), (float) (0 - this.f197927C), (float) this.f197926B, this.f197936L);
        if (((LinkedList) this.f197939P).size() > 2) {
            this.f197936L.reset();
            this.f197936L.setAntiAlias(true);
            this.f197936L.setStrokeWidth(0.0f);
            this.f197936L.setAlpha(102);
            this.f197936L.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f197936L.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) (0 - this.f197957t), -1, 16777215, Shader.TileMode.REPEAT));
            this.f197936L.setColor(-1);
            mo94764a(canvas2, true);
            mo94767d();
            mo94764a(canvas2, false);
        }
        List<String> list = this.f197940Q;
        if (list != null) {
            LinkedList linkedList = (LinkedList) list;
            if (linkedList.size() == 7) {
                this.f197936L.reset();
                this.f197936L.setAntiAlias(true);
                this.f197936L.setStrokeWidth(0.0f);
                this.f197936L.setTextSize(mo94765b(2, 12.0f));
                this.f197936L.setAlpha(153);
                for (int i9 = 0; i9 < linkedList.size(); i9++) {
                    if (i9 == 0) {
                        this.f197936L.setTextAlign(Paint.Align.LEFT);
                    } else {
                        this.f197936L.setTextAlign(Paint.Align.CENTER);
                    }
                    if (this.f197935K[i9]) {
                        this.f197936L.setColor(-1);
                    } else {
                        this.f197936L.setColor(this.f197945e);
                    }
                    canvas2.drawText((String) linkedList.get(i9), (float) ((Point) ((LinkedList) this.f197939P).get(i9)).x, (float) (0 - this.f197962y), this.f197936L);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent.getY();
        Log.m105924i("MicroMsg.exdevice.ExdeviceStepChartView", "mOnTouchLinePsition:" + this.f197947g);
        int action = motionEvent.getAction();
        if (action == 0) {
            Log.m105918d("MicroMsg.exdevice.ExdeviceStepChartView", "ACTION_DOWN");
            return true;
        } else if (action != 1) {
            Log.m105918d("MicroMsg.exdevice.ExdeviceStepChartView", "default");
            return false;
        } else {
            Log.m105918d("MicroMsg.exdevice.ExdeviceStepChartView", "ACTION_UP");
            this.f197947g = Integer.MAX_VALUE;
            if (((LinkedList) this.f197939P).size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= ((LinkedList) this.f197939P).size()) {
                        break;
                    }
                    if (i != 0) {
                        if (i > 0 && i < ((LinkedList) this.f197939P).size() - 1) {
                            if (x < ((float) (((Point) ((LinkedList) this.f197939P).get(i)).x + (this.f197931G / 2))) && x > ((float) (((Point) ((LinkedList) this.f197939P).get(i)).x - (this.f197931G / 2)))) {
                                this.f197947g = i;
                                invalidate();
                                break;
                            }
                        } else if (i == ((LinkedList) this.f197939P).size() - 1) {
                            if (x < ((float) 0) && x > ((float) (((Point) ((LinkedList) this.f197939P).get(i)).x - (this.f197931G / 2)))) {
                                this.f197947g = i;
                                invalidate();
                                break;
                            }
                        } else {
                            this.f197947g = Integer.MAX_VALUE;
                            break;
                        }
                    } else if (x < ((float) (((Point) ((LinkedList) this.f197939P).get(i)).x + (this.f197931G / 2))) && x > 0.0f) {
                        this.f197947g = i;
                        invalidate();
                        break;
                    }
                    i++;
                }
            }
            this.f197947g = this.f197947g;
            for (int i2 = 0; i2 < 7; i2++) {
                if (i2 == 6) {
                    this.f197935K[i2] = true;
                } else {
                    this.f197935K[i2] = false;
                }
            }
            this.f197943T = false;
            invalidate();
            return false;
        }
    }

    public ExdeviceStepChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94765b(1, 55.0f);
        this.f197957t = (int) mo94765b(1, 35.0f);
        this.f197958u = (int) mo94765b(1, 45.0f);
        this.f197959v = (float) ((int) mo94765b(1, 8.0f));
        this.f197960w = (float) ((int) mo94765b(1, 8.0f));
        this.f197961x = (int) mo94765b(1, 2.0f);
        this.f197962y = (int) mo94765b(1, 15.0f);
        this.f197963z = (int) mo94765b(1, 33.0f);
        this.f197925A = (int) mo94765b(1, 8.0f);
        this.f197926B = (int) mo94765b(1, 35.0f);
        this.f197927C = (int) mo94765b(1, 10.0f);
        this.f197928D = (int) mo94765b(1, 58.0f);
        mo94765b(1, 1.0f);
        this.f197929E = 0;
        this.f197930F = Typeface.create(Typeface.DEFAULT_BOLD, 0);
        Typeface.create(Typeface.DEFAULT_BOLD, 1);
        this.f197931G = 0;
        this.f197932H = new int[]{0, 0, 0, 0, 0, 0, 0};
        this.f197933I = new float[7];
        this.f197934J = new float[7];
        this.f197935K = new boolean[7];
        new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        mo94766c();
    }
}
