package fi2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Vibrator;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import sx3.C36904l0;
import sx3.C64197v;

/* renamed from: fi2.b */
public final class C107554b {

    /* renamed from: A */
    public boolean f321798A;

    /* renamed from: B */
    public int f321799B;

    /* renamed from: a */
    public ArrayList<Integer> f321800a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<Integer> f321801b = new ArrayList<>();

    /* renamed from: c */
    public float[] f321802c = new float[2];

    /* renamed from: d */
    public float[] f321803d = new float[4];

    /* renamed from: e */
    public float[] f321804e = new float[2];

    /* renamed from: f */
    public C32057b f321805f = C32057b.NONE;

    /* renamed from: g */
    public Matrix f321806g = new Matrix();

    /* renamed from: h */
    public Rect f321807h;

    /* renamed from: i */
    public int f321808i;

    /* renamed from: j */
    public float f321809j;

    /* renamed from: k */
    public float f321810k;

    /* renamed from: l */
    public float[] f321811l = new float[8];

    /* renamed from: m */
    public float[] f321812m = new float[8];

    /* renamed from: n */
    public float[] f321813n = new float[4];

    /* renamed from: o */
    public int f321814o;

    /* renamed from: p */
    public int f321815p;

    /* renamed from: q */
    public float f321816q = 10.0f;

    /* renamed from: r */
    public float f321817r = 0.1f;

    /* renamed from: s */
    public boolean f321818s;

    /* renamed from: t */
    public C32056a f321819t = C32056a.FREE;

    /* renamed from: u */
    public boolean f321820u = true;

    /* renamed from: v */
    public float f321821v = 15.0f;

    /* renamed from: w */
    public float f321822w;

    /* renamed from: x */
    public float f321823x;

    /* renamed from: y */
    public final Vibrator f321824y;

    /* renamed from: z */
    public boolean f321825z;

    /* renamed from: fi2.b$a */
    public enum C32056a {
        FREE,
        CENTER
    }

    /* renamed from: fi2.b$b */
    public enum C32057b {
        NONE,
        DRAG,
        SCALE
    }

    public C107554b() {
        Object systemService = MMApplicationContext.getContext().getSystemService("vibrator");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f321824y = (Vibrator) systemService;
        this.f321798A = true;
        this.f321806g.setScale(1.0f, 1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x043a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo157997a(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r1, r2)
            int r2 = r18.getActionMasked()
            r3 = 0
            r4 = 1
            r5 = 3
            r6 = 2
            java.lang.String r7 = "pIndices[0]"
            r8 = 0
            if (r2 == 0) goto L_0x051e
            if (r2 == r4) goto L_0x050e
            if (r2 == r6) goto L_0x0092
            if (r2 == r5) goto L_0x050e
            r3 = 5
            if (r2 == r3) goto L_0x0045
            r3 = 6
            if (r2 == r3) goto L_0x0025
            goto L_0x05e5
        L_0x0025:
            r17.mo157998b(r18)
            java.util.ArrayList<java.lang.Integer> r2 = r0.f321801b
            int r3 = r18.getActionIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.indexOf(r3)
            java.util.ArrayList<java.lang.Integer> r3 = r0.f321801b
            r3.remove(r2)
            java.util.ArrayList<java.lang.Integer> r3 = r0.f321800a
            r3.remove(r2)
            r17.mo158005i(r18)
            goto L_0x05e5
        L_0x0045:
            java.util.ArrayList<java.lang.Integer> r2 = r0.f321800a
            int r3 = r18.getActionIndex()
            int r3 = r1.getPointerId(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            java.util.ArrayList<java.lang.Integer> r2 = r0.f321801b
            int r3 = r18.getActionIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            r17.mo158005i(r18)
            int r1 = r18.getPointerCount()
            if (r1 != r6) goto L_0x05e5
            r0.f321823x = r8
            android.graphics.Matrix r1 = r0.f321806g
            float r1 = r0.mo158003g(r1)
            r0.f321822w = r1
            r0.f321823x = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "downRotate :"
            r1.append(r2)
            float r2 = r0.f321822w
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TouchTracker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x05e5
        L_0x0092:
            r17.mo157998b(r18)
            int r2 = r18.getPointerCount()
            if (r2 != r4) goto L_0x009f
            fi2.b$b r2 = fi2.C107554b.C32057b.DRAG
            r0.f321805f = r2
        L_0x009f:
            fi2.b$b r2 = r0.f321805f
            int r2 = r2.ordinal()
            if (r2 == r4) goto L_0x0364
            if (r2 == r6) goto L_0x00ab
            goto L_0x05e5
        L_0x00ab:
            r2 = 4
            float[] r12 = new float[r2]
            java.util.ArrayList<java.lang.Integer> r9 = r0.f321801b
            java.lang.Object r9 = r9.get(r3)
            gy3.C87412m.m108593f(r9, r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = r1.getX(r9)
            r12[r3] = r9
            java.util.ArrayList<java.lang.Integer> r9 = r0.f321801b
            java.lang.Object r9 = r9.get(r3)
            gy3.C87412m.m108593f(r9, r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = r1.getY(r9)
            r12[r4] = r9
            java.util.ArrayList<java.lang.Integer> r9 = r0.f321801b
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r15 = "pIndices[1]"
            gy3.C87412m.m108593f(r9, r15)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = r1.getX(r9)
            r12[r6] = r9
            java.util.ArrayList<java.lang.Integer> r9 = r0.f321801b
            java.lang.Object r9 = r9.get(r4)
            gy3.C87412m.m108593f(r9, r15)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = r1.getY(r9)
            r12[r5] = r9
            android.graphics.Matrix r9 = r0.f321806g
            float[] r10 = r0.f321803d
            r11 = 0
            r13 = 0
            r14 = 2
            r9.setPolyToPoly(r10, r11, r12, r13, r14)
            float[] r9 = new float[r6]
            java.util.ArrayList<java.lang.Integer> r10 = r0.f321801b
            java.lang.Object r10 = r10.get(r3)
            gy3.C87412m.m108593f(r10, r7)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            float r10 = r1.getX(r10)
            java.util.ArrayList<java.lang.Integer> r11 = r0.f321801b
            java.lang.Object r11 = r11.get(r4)
            gy3.C87412m.m108593f(r11, r15)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            float r11 = r1.getX(r11)
            float r10 = r10 + r11
            float r11 = (float) r6
            float r10 = r10 / r11
            r9[r3] = r10
            java.util.ArrayList<java.lang.Integer> r10 = r0.f321801b
            java.lang.Object r10 = r10.get(r3)
            gy3.C87412m.m108593f(r10, r7)
            java.lang.Number r10 = (java.lang.Number) r10
            int r7 = r10.intValue()
            float r7 = r1.getY(r7)
            java.util.ArrayList<java.lang.Integer> r10 = r0.f321801b
            java.lang.Object r10 = r10.get(r4)
            gy3.C87412m.m108593f(r10, r15)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            float r1 = r1.getY(r10)
            float r7 = r7 + r1
            float r7 = r7 / r11
            r9[r4] = r7
            boolean r1 = r0.f321820u
            if (r1 == 0) goto L_0x028f
            android.graphics.Matrix r1 = r0.f321806g
            float r1 = r0.mo158003g(r1)
            float r7 = r0.f321822w
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            float r10 = r0.f321821v
            r11 = 10
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            r14 = 90
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x01c8
            android.graphics.Matrix r7 = r0.f321806g
            float r8 = r0.f321822w
            float r8 = r1 - r8
            r10 = r9[r3]
            r15 = r9[r4]
            r7.postRotate(r8, r10, r15)
            float r7 = r0.f321823x
            float r8 = r0.f321822w
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x01a1
            r7 = 1
            goto L_0x01a2
        L_0x01a1:
            r7 = 0
        L_0x01a2:
            if (r7 != 0) goto L_0x01bb
            float r7 = r0.f321822w
            int r7 = (int) r7
            int r7 = r7 % r14
            if (r7 != 0) goto L_0x01bb
            boolean r7 = r0.f321798A
            if (r7 == 0) goto L_0x01bb
            android.os.Vibrator r7 = r0.f321824y
            if (r7 == 0) goto L_0x01b5
            r7.vibrate(r11)
        L_0x01b5:
            r0.f321798A = r3
            float r7 = r0.f321822w
            r0.f321823x = r7
        L_0x01bb:
            float r7 = r0.f321822w
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x01c3
            r1 = 1
            goto L_0x01c4
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            r0.f321825z = r1
            goto L_0x028f
        L_0x01c8:
            float r7 = r0.f321822w
            float r1 = r1 - r7
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x01d0
            goto L_0x01d1
        L_0x01d0:
            float r10 = -r10
        L_0x01d1:
            android.graphics.Matrix r1 = r0.f321806g
            r7 = r9[r3]
            r8 = r9[r4]
            r1.postRotate(r10, r7, r8)
            android.graphics.Matrix r1 = r0.f321806g
            float r1 = r0.mo158003g(r1)
            boolean r7 = r0.f321825z
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r7 == 0) goto L_0x01ef
            double r7 = (double) r1
            float r10 = r0.f321823x
            double r5 = (double) r10
            double r5 = r5 + r15
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x01f8
        L_0x01ef:
            double r5 = (double) r1
            float r7 = r0.f321823x
            double r7 = (double) r7
            double r7 = r7 - r15
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0243
        L_0x01f8:
            float r5 = (float) r14
            float r6 = r1 - r5
            float r6 = r6 / r5
            int r5 = (int) r6
            int r5 = r5 * 90
            float r6 = (float) r5
            float r7 = r1 - r6
            float r8 = java.lang.Math.abs(r7)
            float r10 = r0.f321821v
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x0238
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0238
            android.graphics.Matrix r8 = r0.f321806g
            r10 = r9[r3]
            r14 = r9[r4]
            r8.postRotate(r7, r10, r14)
            float r7 = r0.f321822w
            float r7 = r7 - r6
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x0226
            r7 = 1
            goto L_0x0227
        L_0x0226:
            r7 = 0
        L_0x0227:
            if (r7 == 0) goto L_0x022d
            boolean r7 = r0.f321798A
            if (r7 == 0) goto L_0x0238
        L_0x022d:
            r0.f321822w = r6
            r0.f321798A = r3
            android.os.Vibrator r6 = r0.f321824y
            if (r6 == 0) goto L_0x0238
            r6.vibrate(r11)
        L_0x0238:
            int r6 = r0.f321799B
            if (r6 == r5) goto L_0x0240
            r0.f321799B = r5
            r0.f321798A = r4
        L_0x0240:
            r0.f321825z = r4
            goto L_0x028d
        L_0x0243:
            float r5 = (float) r14
            float r6 = r1 + r5
            float r6 = r6 / r5
            int r5 = (int) r6
            int r5 = r5 * 90
            float r6 = (float) r5
            float r7 = r1 - r6
            float r8 = java.lang.Math.abs(r7)
            float r10 = r0.f321821v
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x0283
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0283
            android.graphics.Matrix r8 = r0.f321806g
            r10 = r9[r3]
            r14 = r9[r4]
            r8.postRotate(r7, r10, r14)
            float r7 = r0.f321822w
            float r7 = r7 - r6
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x0271
            r7 = 1
            goto L_0x0272
        L_0x0271:
            r7 = 0
        L_0x0272:
            if (r7 == 0) goto L_0x0278
            boolean r7 = r0.f321798A
            if (r7 == 0) goto L_0x0283
        L_0x0278:
            r0.f321822w = r6
            r0.f321798A = r3
            android.os.Vibrator r6 = r0.f321824y
            if (r6 == 0) goto L_0x0283
            r6.vibrate(r11)
        L_0x0283:
            int r6 = r0.f321799B
            if (r6 == r5) goto L_0x028b
            r0.f321799B = r5
            r0.f321798A = r4
        L_0x028b:
            r0.f321825z = r3
        L_0x028d:
            r0.f321823x = r1
        L_0x028f:
            fi2.b$a r1 = r0.f321819t
            fi2.b$a r5 = fi2.C107554b.C32056a.CENTER
            if (r1 != r5) goto L_0x02be
            r1 = 2
            float[] r5 = new float[r1]
            android.graphics.Matrix r6 = r0.f321806g
            float[] r7 = new float[r1]
            int r1 = r0.f321815p
            float r1 = (float) r1
            r8 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r8
            r7[r3] = r1
            int r1 = r0.f321814o
            float r1 = (float) r1
            float r1 = r1 / r8
            r7[r4] = r1
            r6.mapPoints(r5, r7)
            android.graphics.Matrix r1 = r0.f321806g
            float[] r6 = r0.f321804e
            r7 = r6[r3]
            r8 = r5[r3]
            float r7 = r7 - r8
            r6 = r6[r4]
            r5 = r5[r4]
            float r6 = r6 - r5
            r1.postTranslate(r7, r6)
        L_0x02be:
            android.graphics.Matrix r1 = r0.f321806g
            float r5 = r0.f321817r
            float r6 = r0.f321816q
            java.lang.String r7 = "matrix"
            gy3.C87412m.m108594g(r1, r7)
            r7 = 9
            float[] r8 = new float[r7]
            r1.getValues(r8)
            r10 = r8[r3]
            double r10 = (double) r10
            r12 = 3
            r8 = r8[r12]
            double r12 = (double) r8
            double r10 = r10 * r10
            double r12 = r12 * r12
            double r10 = r10 + r12
            double r10 = java.lang.Math.sqrt(r10)
            float r8 = (float) r10
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x02e7
            goto L_0x02ec
        L_0x02e7:
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0337
            r5 = r6
        L_0x02ec:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r1.invert(r6)
            r8 = 2
            float[] r10 = new float[r8]
            r6.mapPoints(r10, r9)
            float[] r6 = new float[r7]
            r1.getValues(r6)
            r7 = r6[r3]
            double r7 = (double) r7
            r11 = 3
            r12 = r6[r11]
            double r11 = (double) r12
            r2 = r6[r2]
            double r13 = (double) r2
            double r7 = r7 * r7
            double r15 = r11 * r11
            double r7 = r7 + r15
            java.lang.Math.sqrt(r7)
            double r6 = java.lang.Math.atan2(r11, r13)
            r11 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r6 = r6 * r11
            long r6 = java.lang.Math.round(r6)
            float r2 = (float) r6
            r6 = r10[r3]
            float r6 = -r6
            r7 = r10[r4]
            float r7 = -r7
            r1.setTranslate(r6, r7)
            r1.postScale(r5, r5)
            r1.postRotate(r2)
            r2 = r9[r3]
            r5 = r9[r4]
            r1.postTranslate(r2, r5)
        L_0x0337:
            android.graphics.Matrix r1 = r0.f321806g
            float[] r2 = r0.f321812m
            float[] r5 = r0.f321811l
            r1.mapPoints(r2, r5)
            float[] r1 = r0.f321813n
            float r2 = r17.mo158001e()
            r1[r3] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo158002f()
            r1[r4] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo158000d()
            r3 = 2
            r1[r3] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo157999c()
            r3 = 3
            r1[r3] = r2
            goto L_0x05e5
        L_0x0364:
            java.util.ArrayList<java.lang.Integer> r2 = r0.f321801b
            java.lang.Object r2 = r2.get(r3)
            gy3.C87412m.m108593f(r2, r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r2 = r1.getX(r2)
            java.util.ArrayList<java.lang.Integer> r5 = r0.f321801b
            java.lang.Object r5 = r5.get(r3)
            gy3.C87412m.m108593f(r5, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            float r1 = r1.getY(r5)
            float[] r5 = r0.f321802c
            r6 = r5[r3]
            float r6 = r2 - r6
            r5 = r5[r4]
            float r5 = r1 - r5
            android.graphics.Matrix r7 = r0.f321806g
            r7.postTranslate(r6, r5)
            float[] r7 = r0.f321802c
            r7[r3] = r2
            r7[r4] = r1
            android.graphics.Matrix r1 = r0.f321806g
            float[] r2 = r0.f321812m
            float[] r7 = r0.f321811l
            r1.mapPoints(r2, r7)
            float[] r1 = r0.f321813n
            float r2 = r17.mo158001e()
            r1[r3] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo158002f()
            r1[r4] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo158000d()
            r7 = 2
            r1[r7] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo157999c()
            r9 = 3
            r1[r9] = r2
            android.graphics.Rect r1 = r0.f321807h
            if (r1 == 0) goto L_0x0508
            float[] r2 = r0.f321813n
            r10 = r2[r3]
            float r10 = r10 + r6
            r11 = r2[r4]
            float r11 = r11 + r5
            r12 = r2[r7]
            float r12 = r12 + r6
            r2 = r2[r9]
            float r2 = r2 + r5
            int r7 = r1.left
            float r7 = (float) r7
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0437
            gy3.C87412m.m108591d(r1)
            int r1 = r1.right
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0437
            android.graphics.Rect r1 = r0.f321807h
            gy3.C87412m.m108591d(r1)
            int r1 = r1.top
            float r1 = (float) r1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0437
            android.graphics.Rect r1 = r0.f321807h
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bottom
            float r1 = (float) r1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0437
            android.graphics.Rect r1 = r0.f321807h
            gy3.C87412m.m108591d(r1)
            int r1 = r1.left
            float r1 = (float) r1
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0437
            android.graphics.Rect r1 = r0.f321807h
            gy3.C87412m.m108591d(r1)
            int r1 = r1.right
            float r1 = (float) r1
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0437
            android.graphics.Rect r1 = r0.f321807h
            gy3.C87412m.m108591d(r1)
            int r1 = r1.top
            float r1 = (float) r1
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0437
            android.graphics.Rect r1 = r0.f321807h
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bottom
            float r1 = (float) r1
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0437
            r1 = 1
            goto L_0x0438
        L_0x0437:
            r1 = 0
        L_0x0438:
            if (r1 != 0) goto L_0x0508
            float r1 = java.lang.Math.abs(r6)
            float r2 = java.lang.Math.abs(r5)
            android.graphics.Rect r5 = r0.f321807h
            gy3.C87412m.m108591d(r5)
            int r5 = r5.left
            float r5 = (float) r5
            float[] r6 = r0.f321813n
            r6 = r6[r3]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0472
            float r5 = r0.f321809j
            int r6 = r0.f321808i
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0472
            android.graphics.Matrix r5 = r0.f321806g
            android.graphics.Rect r6 = r0.f321807h
            gy3.C87412m.m108591d(r6)
            int r6 = r6.left
            float r6 = (float) r6
            float[] r7 = r0.f321813n
            r3 = r7[r3]
            float r6 = r6 - r3
            r5.postTranslate(r6, r8)
            float r3 = r0.f321809j
            float r3 = r3 + r1
            r0.f321809j = r3
        L_0x0472:
            android.graphics.Rect r3 = r0.f321807h
            gy3.C87412m.m108591d(r3)
            int r3 = r3.top
            float r3 = (float) r3
            float[] r5 = r0.f321813n
            r5 = r5[r4]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x04a2
            float r3 = r0.f321810k
            int r5 = r0.f321808i
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x04a2
            android.graphics.Matrix r3 = r0.f321806g
            android.graphics.Rect r5 = r0.f321807h
            gy3.C87412m.m108591d(r5)
            int r5 = r5.top
            float r5 = (float) r5
            float[] r6 = r0.f321813n
            r6 = r6[r4]
            float r5 = r5 - r6
            r3.postTranslate(r8, r5)
            float r3 = r0.f321810k
            float r3 = r3 + r2
            r0.f321810k = r3
        L_0x04a2:
            android.graphics.Rect r3 = r0.f321807h
            gy3.C87412m.m108591d(r3)
            int r3 = r3.right
            float r3 = (float) r3
            float[] r5 = r0.f321813n
            r6 = 2
            r5 = r5[r6]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x04d4
            float r3 = r0.f321809j
            int r5 = r0.f321808i
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x04d4
            android.graphics.Matrix r3 = r0.f321806g
            android.graphics.Rect r5 = r0.f321807h
            gy3.C87412m.m108591d(r5)
            int r5 = r5.right
            float r5 = (float) r5
            float[] r6 = r0.f321813n
            r7 = 2
            r6 = r6[r7]
            float r5 = r5 - r6
            r3.postTranslate(r5, r8)
            float r3 = r0.f321809j
            float r3 = r3 + r1
            r0.f321809j = r3
        L_0x04d4:
            android.graphics.Rect r1 = r0.f321807h
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bottom
            float r1 = (float) r1
            float[] r3 = r0.f321813n
            r5 = 3
            r3 = r3[r5]
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x05e5
            float r1 = r0.f321810k
            int r3 = r0.f321808i
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x05e5
            android.graphics.Matrix r1 = r0.f321806g
            android.graphics.Rect r3 = r0.f321807h
            gy3.C87412m.m108591d(r3)
            int r3 = r3.bottom
            float r3 = (float) r3
            float[] r5 = r0.f321813n
            r6 = 3
            r5 = r5[r6]
            float r3 = r3 - r5
            r1.postTranslate(r8, r3)
            float r1 = r0.f321810k
            float r1 = r1 + r2
            r0.f321810k = r1
            goto L_0x05e5
        L_0x0508:
            r0.f321809j = r8
            r0.f321810k = r8
            goto L_0x05e5
        L_0x050e:
            fi2.b$b r1 = fi2.C107554b.C32057b.NONE
            r0.f321805f = r1
            java.util.ArrayList<java.lang.Integer> r1 = r0.f321800a
            r1.clear()
            java.util.ArrayList<java.lang.Integer> r1 = r0.f321801b
            r1.clear()
            goto L_0x05e5
        L_0x051e:
            r2 = 2
            float[] r5 = new float[r2]
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            android.graphics.Matrix r9 = r0.f321806g
            r9.invert(r6)
            float[] r9 = new float[r2]
            float r2 = r18.getX()
            r9[r3] = r2
            float r2 = r18.getY()
            r9[r4] = r2
            r6.mapPoints(r5, r9)
            r2 = r5[r3]
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x05e6
            int r6 = r0.f321815p
            float r6 = (float) r6
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x05e6
            r2 = r5[r4]
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x05e6
            int r5 = r0.f321814o
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0558
            goto L_0x05e6
        L_0x0558:
            java.util.ArrayList<java.lang.Integer> r2 = r0.f321800a
            int r5 = r18.getActionIndex()
            int r5 = r1.getPointerId(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.add(r5)
            java.util.ArrayList<java.lang.Integer> r2 = r0.f321801b
            int r5 = r18.getActionIndex()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.add(r5)
            r17.mo158005i(r18)
            boolean r2 = r0.f321818s
            if (r2 != 0) goto L_0x05e5
            java.util.ArrayList<java.lang.Integer> r2 = r0.f321801b
            java.lang.Object r2 = r2.get(r3)
            gy3.C87412m.m108593f(r2, r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r2 = r1.getX(r2)
            java.util.ArrayList<java.lang.Integer> r5 = r0.f321801b
            java.lang.Object r5 = r5.get(r3)
            gy3.C87412m.m108593f(r5, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            float r1 = r1.getY(r5)
            float[] r5 = r0.f321802c
            r6 = r5[r3]
            float r6 = r2 - r6
            r5 = r5[r4]
            float r5 = r1 - r5
            android.graphics.Matrix r7 = r0.f321806g
            r7.postTranslate(r6, r5)
            float[] r5 = r0.f321802c
            r5[r3] = r2
            r5[r4] = r1
            android.graphics.Matrix r1 = r0.f321806g
            float[] r2 = r0.f321812m
            float[] r5 = r0.f321811l
            r1.mapPoints(r2, r5)
            float[] r1 = r0.f321813n
            float r2 = r17.mo158001e()
            r1[r3] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo158002f()
            r1[r4] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo158000d()
            r3 = 2
            r1[r3] = r2
            float[] r1 = r0.f321813n
            float r2 = r17.mo157999c()
            r3 = 3
            r1[r3] = r2
            r0.f321818s = r4
        L_0x05e5:
            return r4
        L_0x05e6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.C107554b.mo157997a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public final void mo157998b(MotionEvent motionEvent) {
        Iterator it = C64197v.m75535d(this.f321800a).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            ArrayList<Integer> arrayList = this.f321801b;
            Integer num = this.f321800a.get(a);
            C87412m.m108593f(num, "pIds[i]");
            arrayList.set(a, Integer.valueOf(motionEvent.findPointerIndex(num.intValue())));
        }
    }

    /* renamed from: c */
    public final float mo157999c() {
        float[] fArr = this.f321812m;
        float f = fArr[1];
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f2 = fArr[i];
            int i3 = i2 + 1;
            if (i2 == 3) {
                f = Math.max(f, f2);
            } else if (i2 == 5) {
                f = Math.max(f, f2);
            } else if (i2 == 7) {
                f = Math.max(f, f2);
            }
            i++;
            i2 = i3;
        }
        return f;
    }

    /* renamed from: d */
    public final float mo158000d() {
        float f;
        float[] fArr = this.f321812m;
        int i = 0;
        float f2 = fArr[0];
        int length = fArr.length;
        float f3 = f2;
        int i2 = 0;
        while (i < length) {
            float f4 = fArr[i];
            int i3 = i2 + 1;
            if (i2 == 2) {
                f = Math.max(f3, f4);
            } else if (i2 == 4) {
                f = Math.max(f3, f4);
            } else if (i2 != 6) {
                i++;
                i2 = i3;
            } else {
                f = Math.max(f3, f4);
            }
            f3 = f;
            i++;
            i2 = i3;
        }
        return f3;
    }

    /* renamed from: e */
    public final float mo158001e() {
        float f;
        float[] fArr = this.f321812m;
        int i = 0;
        float f2 = fArr[0];
        int length = fArr.length;
        float f3 = f2;
        int i2 = 0;
        while (i < length) {
            float f4 = fArr[i];
            int i3 = i2 + 1;
            if (i2 == 2) {
                f = Math.min(f3, f4);
            } else if (i2 == 4) {
                f = Math.min(f3, f4);
            } else if (i2 != 6) {
                i++;
                i2 = i3;
            } else {
                f = Math.min(f3, f4);
            }
            f3 = f;
            i++;
            i2 = i3;
        }
        return f3;
    }

    /* renamed from: f */
    public final float mo158002f() {
        float[] fArr = this.f321812m;
        float f = fArr[1];
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f2 = fArr[i];
            int i3 = i2 + 1;
            if (i2 == 3) {
                f = Math.min(f, f2);
            } else if (i2 == 5) {
                f = Math.min(f, f2);
            } else if (i2 == 7) {
                f = Math.min(f, f2);
            }
            i++;
            i2 = i3;
        }
        return f;
    }

    /* renamed from: g */
    public final float mo158003g(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float atan2 = (float) (Math.atan2((double) fArr[1], (double) fArr[0]) * 57.29577951308232d);
        float f = this.f321823x;
        return (f >= -90.0f || atan2 <= 0.0f) ? (f <= 90.0f || atan2 >= 0.0f) ? atan2 : atan2 + ((float) v2helper.VOIP_ENC_HEIGHT_LV1) : atan2 - ((float) v2helper.VOIP_ENC_HEIGHT_LV1);
    }

    /* renamed from: h */
    public final void mo158004h(Matrix matrix) {
        C87412m.m108594g(matrix, "m");
        this.f321806g.set(matrix);
        this.f321806g.mapPoints(this.f321812m, this.f321811l);
        this.f321813n[0] = mo158001e();
        this.f321813n[1] = mo158002f();
        this.f321813n[2] = mo158000d();
        this.f321813n[3] = mo157999c();
    }

    /* renamed from: i */
    public final void mo158005i(MotionEvent motionEvent) {
        if (this.f321800a.size() == 1) {
            this.f321805f = C32057b.DRAG;
            float[] fArr = this.f321802c;
            Integer num = this.f321801b.get(0);
            C87412m.m108593f(num, "pIndices[0]");
            fArr[0] = motionEvent.getX(num.intValue());
            float[] fArr2 = this.f321802c;
            Integer num2 = this.f321801b.get(0);
            C87412m.m108593f(num2, "pIndices[0]");
            fArr2[1] = motionEvent.getY(num2.intValue());
        } else if (this.f321800a.size() == 2) {
            this.f321805f = C32057b.SCALE;
            if (this.f321819t == C32056a.CENTER) {
                this.f321806g.mapPoints(this.f321804e, new float[]{((float) this.f321815p) / 2.0f, ((float) this.f321814o) / 2.0f});
            }
            Matrix matrix = new Matrix();
            this.f321806g.invert(matrix);
            mo157998b(motionEvent);
            Integer num3 = this.f321801b.get(0);
            C87412m.m108593f(num3, "pIndices[0]");
            if (num3.intValue() < motionEvent.getPointerCount()) {
                Integer num4 = this.f321801b.get(1);
                C87412m.m108593f(num4, "pIndices[1]");
                if (num4.intValue() < motionEvent.getPointerCount()) {
                    float[] fArr3 = this.f321803d;
                    Integer num5 = this.f321801b.get(0);
                    C87412m.m108593f(num5, "pIndices[0]");
                    Integer num6 = this.f321801b.get(0);
                    C87412m.m108593f(num6, "pIndices[0]");
                    Integer num7 = this.f321801b.get(1);
                    C87412m.m108593f(num7, "pIndices[1]");
                    Integer num8 = this.f321801b.get(1);
                    C87412m.m108593f(num8, "pIndices[1]");
                    matrix.mapPoints(fArr3, new float[]{motionEvent.getX(num5.intValue()), motionEvent.getY(num6.intValue()), motionEvent.getX(num7.intValue()), motionEvent.getY(num8.intValue())});
                }
            }
        }
    }
}
