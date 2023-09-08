package p450b1;

import fy3.C32226l;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import my3.C61595o;

/* renamed from: b1.k */
public final class C103990k extends C103979c {

    /* renamed from: p */
    public static final C28229h f307577p = new C28229h((C8480h) null);

    /* renamed from: q */
    public static final C32226l<Double, Double> f307578q = C28228g.f77768d;

    /* renamed from: d */
    public final C104000m f307579d;

    /* renamed from: e */
    public final float f307580e;

    /* renamed from: f */
    public final float f307581f;

    /* renamed from: g */
    public final C103999l f307582g;

    /* renamed from: h */
    public final float[] f307583h;

    /* renamed from: i */
    public final float[] f307584i;

    /* renamed from: j */
    public final float[] f307585j;

    /* renamed from: k */
    public final C32226l<Double, Double> f307586k;

    /* renamed from: l */
    public final C32226l<Double, Double> f307587l;

    /* renamed from: m */
    public final C32226l<Double, Double> f307588m;

    /* renamed from: n */
    public final C32226l<Double, Double> f307589n;

    /* renamed from: o */
    public final boolean f307590o;

    /* renamed from: b1.k$g */
    public static final class C28228g extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public static final C28228g f77768d = new C28228g();

        public C28228g() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
    }

    /* renamed from: b1.k$h */
    public static final class C28229h {
        public C28229h(C8480h hVar) {
        }

        /* renamed from: a */
        public final float mo55849a(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        /* renamed from: b */
        public final boolean mo55850b(double d, C32226l<? super Double, Double> lVar, C32226l<? super Double, Double> lVar2) {
            return Math.abs(lVar.invoke(Double.valueOf(d)).doubleValue() - lVar2.invoke(Double.valueOf(d)).doubleValue()) <= 0.001d;
        }
    }

    /* renamed from: b1.k$a */
    public static final class C103991a extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public final /* synthetic */ C103999l f307591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103991a(C103999l lVar) {
            super(1);
            this.f307591d = lVar;
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            C103999l lVar = this.f307591d;
            double d = lVar.f307600b;
            double d2 = lVar.f307601c;
            double d3 = lVar.f307602d;
            return Double.valueOf(doubleValue >= lVar.f307603e * d3 ? (Math.pow(doubleValue, 1.0d / lVar.f307599a) - d2) / d : doubleValue / d3);
        }
    }

    /* renamed from: b1.k$b */
    public static final class C103992b extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public final /* synthetic */ C103999l f307592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103992b(C103999l lVar) {
            super(1);
            this.f307592d = lVar;
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            C103999l lVar = this.f307592d;
            double d = lVar.f307600b;
            double d2 = lVar.f307601c;
            double d3 = lVar.f307602d;
            return Double.valueOf(doubleValue >= lVar.f307603e * d3 ? (Math.pow(doubleValue - lVar.f307604f, 1.0d / lVar.f307599a) - d2) / d : (doubleValue - lVar.f307605g) / d3);
        }
    }

    /* renamed from: b1.k$c */
    public static final class C103993c extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public final /* synthetic */ C103999l f307593d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103993c(C103999l lVar) {
            super(1);
            this.f307593d = lVar;
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            C103999l lVar = this.f307593d;
            double d = lVar.f307600b;
            return Double.valueOf(doubleValue >= lVar.f307603e ? Math.pow((d * doubleValue) + lVar.f307601c, lVar.f307599a) : doubleValue * lVar.f307602d);
        }
    }

    /* renamed from: b1.k$d */
    public static final class C103994d extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public final /* synthetic */ C103999l f307594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103994d(C103999l lVar) {
            super(1);
            this.f307594d = lVar;
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            C103999l lVar = this.f307594d;
            double d = lVar.f307600b;
            double d2 = lVar.f307601c;
            double d3 = lVar.f307602d;
            return Double.valueOf(doubleValue >= lVar.f307603e ? Math.pow((d * doubleValue) + d2, lVar.f307599a) + lVar.f307604f : (d3 * doubleValue) + lVar.f307605g);
        }
    }

    /* renamed from: b1.k$e */
    public static final class C103995e extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public final /* synthetic */ double f307595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103995e(double d) {
            super(1);
            this.f307595d = d;
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            if (doubleValue < 0.0d) {
                doubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(doubleValue, 1.0d / this.f307595d));
        }
    }

    /* renamed from: b1.k$f */
    public static final class C103996f extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public final /* synthetic */ double f307596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103996f(double d) {
            super(1);
            this.f307596d = d;
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            if (doubleValue < 0.0d) {
                doubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(doubleValue, this.f307596d));
        }
    }

    /* renamed from: b1.k$i */
    public static final class C103997i extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public final /* synthetic */ C103990k f307597d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103997i(C103990k kVar) {
            super(1);
            this.f307597d = kVar;
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            C103990k kVar = this.f307597d;
            return kVar.f307588m.invoke(Double.valueOf(C61595o.m72295c(doubleValue, (double) kVar.f307580e, (double) kVar.f307581f)));
        }
    }

    /* renamed from: b1.k$j */
    public static final class C103998j extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public final /* synthetic */ C103990k f307598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103998j(C103990k kVar) {
            super(1);
            this.f307598d = kVar;
        }

        public Object invoke(Object obj) {
            double doubleValue = this.f307598d.f307586k.invoke(Double.valueOf(((Number) obj).doubleValue())).doubleValue();
            C103990k kVar = this.f307598d;
            return Double.valueOf(C61595o.m72295c(doubleValue, (double) kVar.f307580e, (double) kVar.f307581f));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103990k(java.lang.String r13, float[] r14, p450b1.C104000m r15, p450b1.C103999l r16, int r17) {
        /*
            r12 = this;
            r9 = r16
            java.lang.String r0 = "name"
            r1 = r13
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "primaries"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "function"
            gy3.C87412m.m108594g(r9, r0)
            double r4 = r9.f307604f
            r0 = 1
            r6 = 0
            r7 = 0
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x0039
            double r4 = r9.f307605g
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            if (r4 == 0) goto L_0x0039
            b1.k$a r4 = new b1.k$a
            r4.<init>(r9)
            goto L_0x003e
        L_0x0039:
            b1.k$b r4 = new b1.k$b
            r4.<init>(r9)
        L_0x003e:
            r5 = r4
            double r10 = r9.f307604f
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0047
            r4 = 1
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            if (r4 == 0) goto L_0x005a
            double r10 = r9.f307605g
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x005a
            b1.k$c r0 = new b1.k$c
            r0.<init>(r9)
            goto L_0x005f
        L_0x005a:
            b1.k$d r0 = new b1.k$d
            r0.<init>(r9)
        L_0x005f:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p450b1.C103990k.<init>(java.lang.String, float[], b1.m, b1.l, int):void");
    }

    /* renamed from: a */
    public float[] mo145584a(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        C103980d.m138720h(this.f307585j, fArr);
        fArr[0] = (float) ((Number) ((C103998j) this.f307587l).invoke(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) ((C103998j) this.f307587l).invoke(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) ((C103998j) this.f307587l).invoke(Double.valueOf((double) fArr[2]))).doubleValue();
        return fArr;
    }

    /* renamed from: b */
    public float mo145585b(int i) {
        return this.f307581f;
    }

    /* renamed from: c */
    public float mo145586c(int i) {
        return this.f307580e;
    }

    /* renamed from: d */
    public boolean mo145587d() {
        return this.f307590o;
    }

    /* renamed from: e */
    public float[] mo145588e(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        fArr[0] = (float) ((Number) ((C103997i) this.f307589n).invoke(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) ((C103997i) this.f307589n).invoke(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) ((C103997i) this.f307589n).invoke(Double.valueOf((double) fArr[2]))).doubleValue();
        C103980d.m138720h(this.f307584i, fArr);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C87412m.m108589b(C24560g0.m30725a(C103990k.class), C24560g0.m30725a(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        C103990k kVar = (C103990k) obj;
        if (Float.compare(kVar.f307580e, this.f307580e) != 0 || Float.compare(kVar.f307581f, this.f307581f) != 0 || !C87412m.m108589b(this.f307579d, kVar.f307579d) || !Arrays.equals(this.f307583h, kVar.f307583h)) {
            return false;
        }
        C103999l lVar = this.f307582g;
        if (lVar != null) {
            return C87412m.m108589b(lVar, kVar.f307582g);
        }
        if (kVar.f307582g == null) {
            return true;
        }
        if (!C87412m.m108589b(this.f307586k, kVar.f307586k)) {
            return false;
        }
        return C87412m.m108589b(this.f307588m, kVar.f307588m);
    }

    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f307579d.hashCode()) * 31) + Arrays.hashCode(this.f307583h)) * 31;
        float f = this.f307580e;
        boolean z = true;
        int i = 0;
        int floatToIntBits = (hashCode + (!((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f307581f;
        if (f2 != 0.0f) {
            z = false;
        }
        int floatToIntBits2 = (floatToIntBits + (!z ? Float.floatToIntBits(f2) : 0)) * 31;
        C103999l lVar = this.f307582g;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        int i2 = floatToIntBits2 + i;
        return this.f307582g == null ? (((i2 * 31) + this.f307586k.hashCode()) * 31) + this.f307588m.hashCode() : i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103990k(java.lang.String r30, float[] r31, p450b1.C104000m r32, float[] r33, fy3.C32226l<? super java.lang.Double, java.lang.Double> r34, fy3.C32226l<? super java.lang.Double, java.lang.Double> r35, float r36, float r37, p450b1.C103999l r38, int r39) {
        /*
            r29 = this;
            r6 = r29
            r7 = r31
            r14 = r32
            r15 = r33
            r13 = r34
            r12 = r35
            r11 = r36
            r10 = r37
            java.lang.String r0 = "name"
            r1 = r30
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "primaries"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "whitePoint"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "oetf"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "eotf"
            gy3.C87412m.m108594g(r12, r0)
            int r0 = p450b1.C103978b.f307534e
            long r2 = p450b1.C103978b.f307530a
            r5 = 0
            r0 = r29
            r1 = r30
            r4 = r39
            r0.<init>(r1, r2, r4, r5)
            r6.f307579d = r14
            r6.f307580e = r11
            r6.f307581f = r10
            r0 = r38
            r6.f307582g = r0
            r6.f307586k = r13
            b1.k$j r0 = new b1.k$j
            r0.<init>(r6)
            r6.f307587l = r0
            r6.f307588m = r12
            b1.k$i r0 = new b1.k$i
            r0.<init>(r6)
            r6.f307589n = r0
            int r0 = r7.length
            r1 = 6
            r2 = 9
            if (r0 == r1) goto L_0x0067
            int r0 = r7.length
            if (r0 != r2) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r0.<init>(r1)
            throw r0
        L_0x0067:
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a4
            b1.k$h r0 = f307577p
            float[] r3 = new float[r1]
            int r4 = r7.length
            r5 = 8
            r16 = 7
            r17 = 4
            r18 = 3
            r19 = 2
            r20 = 5
            r9 = 1
            r21 = 0
            if (r4 != r2) goto L_0x00ba
            r4 = r7[r21]
            r8 = r7[r9]
            float r22 = r4 + r8
            r23 = r7[r19]
            float r22 = r22 + r23
            float r4 = r4 / r22
            r3[r21] = r4
            float r8 = r8 / r22
            r3[r9] = r8
            r4 = r7[r18]
            r8 = r7[r17]
            float r22 = r4 + r8
            r23 = r7[r20]
            float r22 = r22 + r23
            float r4 = r4 / r22
            r3[r19] = r4
            float r8 = r8 / r22
            r3[r18] = r8
            r4 = r7[r1]
            r8 = r7[r16]
            float r22 = r4 + r8
            r7 = r7[r5]
            float r22 = r22 + r7
            float r4 = r4 / r22
            r3[r17] = r4
            float r8 = r8 / r22
            r3[r20] = r8
            r4 = r10
            r5 = 1
            goto L_0x00d4
        L_0x00ba:
            r4 = 0
            r22 = 0
            r23 = 6
            r24 = 6
            r25 = 0
            r7 = r31
            r8 = r3
            r5 = 1
            r9 = r4
            r4 = r10
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            sx3.C110821n.m150964k(r7, r8, r9, r10, r11, r12, r13)
        L_0x00d4:
            r6.f307583h = r3
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r15 != 0) goto L_0x015b
            r8 = r3[r21]
            r9 = r3[r5]
            r10 = r3[r19]
            r11 = r3[r18]
            r12 = r3[r17]
            r13 = r3[r20]
            float r15 = r14.f307606a
            float r1 = r14.f307607b
            float r2 = (float) r5
            float r23 = r2 - r8
            float r23 = r23 / r9
            float r24 = r2 - r10
            float r24 = r24 / r11
            float r25 = r2 - r12
            float r25 = r25 / r13
            float r2 = r2 - r15
            float r2 = r2 / r1
            float r26 = r8 / r9
            float r27 = r10 / r11
            float r28 = r12 / r13
            float r15 = r15 / r1
            float r2 = r2 - r23
            float r27 = r27 - r26
            float r2 = r2 * r27
            float r15 = r15 - r26
            float r24 = r24 - r23
            float r1 = r15 * r24
            float r2 = r2 - r1
            float r25 = r25 - r23
            float r25 = r25 * r27
            float r28 = r28 - r26
            float r24 = r24 * r28
            float r25 = r25 - r24
            float r2 = r2 / r25
            float r28 = r28 * r2
            float r15 = r15 - r28
            float r15 = r15 / r27
            float r1 = r7 - r15
            float r1 = r1 - r2
            float r23 = r1 / r9
            float r24 = r15 / r11
            float r25 = r2 / r13
            r7 = 9
            float[] r7 = new float[r7]
            float r22 = r23 * r8
            r7[r21] = r22
            r7[r5] = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r8 = r1 - r8
            float r8 = r8 - r9
            float r23 = r23 * r8
            r7[r19] = r23
            float r8 = r24 * r10
            r7[r18] = r8
            r7[r17] = r15
            float r8 = r1 - r10
            float r8 = r8 - r11
            float r24 = r24 * r8
            r7[r20] = r24
            float r8 = r25 * r12
            r9 = 6
            r7[r9] = r8
            r7[r16] = r2
            float r2 = r1 - r12
            float r2 = r2 - r13
            float r25 = r25 * r2
            r1 = 8
            r7[r1] = r25
            r6.f307584i = r7
            goto L_0x0162
        L_0x015b:
            int r1 = r15.length
            r2 = 9
            if (r1 != r2) goto L_0x028c
            r6.f307584i = r15
        L_0x0162:
            float[] r1 = r6.f307584i
            float[] r1 = p450b1.C103980d.m138717e(r1)
            r6.f307585j = r1
            float r1 = r0.mo55849a(r3)
            b1.e r2 = p450b1.C103981e.f307538a
            r2.getClass()
            float[] r7 = p450b1.C103981e.f307540c
            float r7 = r0.mo55849a(r7)
            float r1 = r1 / r7
            r7 = 1063675494(0x3f666666, float:0.9)
            r8 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0200
            float[] r1 = p450b1.C103981e.f307539b
            r7 = r3[r21]
            r9 = r1[r21]
            float r7 = r7 - r9
            r10 = r3[r5]
            r11 = r1[r5]
            float r10 = r10 - r11
            r12 = r3[r19]
            r13 = r1[r19]
            float r12 = r12 - r13
            r15 = r3[r18]
            r16 = r1[r18]
            float r15 = r15 - r16
            r18 = r3[r17]
            r17 = r1[r17]
            float r18 = r18 - r17
            r19 = r3[r20]
            r1 = r1[r20]
            float r19 = r19 - r1
            float r20 = r9 - r17
            float r22 = r11 - r1
            float r22 = r22 * r7
            float r20 = r20 * r10
            float r22 = r22 - r20
            int r20 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r20 < 0) goto L_0x01f9
            float r20 = r9 - r13
            float r22 = r11 - r16
            float r20 = r20 * r10
            float r22 = r22 * r7
            float r20 = r20 - r22
            int r7 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x01c2
            goto L_0x01f9
        L_0x01c2:
            float r7 = r13 - r9
            float r10 = r16 - r11
            float r10 = r10 * r12
            float r7 = r7 * r15
            float r10 = r10 - r7
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x01f9
            float r7 = r13 - r17
            float r10 = r16 - r1
            float r7 = r7 * r15
            float r10 = r10 * r12
            float r7 = r7 - r10
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x01dd
            goto L_0x01f9
        L_0x01dd:
            float r7 = r17 - r13
            float r10 = r1 - r16
            float r10 = r10 * r18
            float r7 = r7 * r19
            float r10 = r10 - r7
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x01f9
            float r17 = r17 - r9
            float r1 = r1 - r11
            float r17 = r17 * r19
            float r1 = r1 * r18
            float r17 = r17 - r1
            int r1 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x01f9
            r9 = 1
            goto L_0x01fa
        L_0x01f9:
            r9 = 0
        L_0x01fa:
            if (r9 != 0) goto L_0x01fd
            goto L_0x0200
        L_0x01fd:
            r1 = r36
            goto L_0x0204
        L_0x0200:
            r1 = r36
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
        L_0x0204:
            if (r39 != 0) goto L_0x0208
            goto L_0x0288
        L_0x0208:
            r2.getClass()
            float[] r2 = p450b1.C103981e.f307539b
            java.lang.String r7 = "b"
            gy3.C87412m.m108594g(r2, r7)
            if (r3 != r2) goto L_0x0215
            goto L_0x0238
        L_0x0215:
            int r7 = r3.length
            r9 = 0
        L_0x0217:
            if (r9 >= r7) goto L_0x0238
            r10 = r3[r9]
            r11 = r2[r9]
            int r10 = java.lang.Float.compare(r10, r11)
            if (r10 == 0) goto L_0x0235
            r10 = r3[r9]
            r11 = r2[r9]
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            r11 = 981668463(0x3a83126f, float:0.001)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0235
            r9 = 0
            goto L_0x0239
        L_0x0235:
            int r9 = r9 + 1
            goto L_0x0217
        L_0x0238:
            r9 = 1
        L_0x0239:
            if (r9 != 0) goto L_0x023c
            goto L_0x027f
        L_0x023c:
            b1.m r2 = p450b1.C103987h.f307571d
            boolean r2 = p450b1.C103980d.m138715c(r14, r2)
            if (r2 != 0) goto L_0x0245
            goto L_0x027f
        L_0x0245:
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x024b
            r9 = 1
            goto L_0x024c
        L_0x024b:
            r9 = 0
        L_0x024c:
            if (r9 != 0) goto L_0x024f
            goto L_0x027f
        L_0x024f:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0257
            r9 = 1
            goto L_0x0258
        L_0x0257:
            r9 = 0
        L_0x0258:
            if (r9 != 0) goto L_0x025b
            goto L_0x027f
        L_0x025b:
            b1.e r1 = p450b1.C103981e.f307538a
            r1.getClass()
            b1.k r1 = p450b1.C103981e.f307541d
            r2 = 0
        L_0x0264:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0288
            fy3.l<java.lang.Double, java.lang.Double> r4 = r1.f307586k
            r7 = r34
            boolean r4 = r0.mo55850b(r2, r7, r4)
            if (r4 != 0) goto L_0x0275
            goto L_0x027f
        L_0x0275:
            fy3.l<java.lang.Double, java.lang.Double> r4 = r1.f307588m
            r8 = r35
            boolean r4 = r0.mo55850b(r2, r8, r4)
            if (r4 != 0) goto L_0x0281
        L_0x027f:
            r9 = 0
            goto L_0x0289
        L_0x0281:
            r9 = 4571171282956062736(0x3f70101010101010, double:0.00392156862745098)
            double r2 = r2 + r9
            goto L_0x0264
        L_0x0288:
            r9 = 1
        L_0x0289:
            r6.f307590o = r9
            return
        L_0x028c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Transform must have 9 entries! Has "
            r1.append(r2)
            int r2 = r15.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02a4:
            r4 = r10
            r1 = r11
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid range: min="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", max="
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = "; min must be strictly < max"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p450b1.C103990k.<init>(java.lang.String, float[], b1.m, float[], fy3.l, fy3.l, float, float, b1.l, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103990k(java.lang.String r23, float[] r24, p450b1.C104000m r25, double r26, float r28, float r29, int r30) {
        /*
            r22 = this;
            r1 = r26
            java.lang.String r0 = "name"
            r15 = r23
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r24
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r25
            gy3.C87412m.m108594g(r14, r0)
            r0 = 1
            r3 = 0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 == 0) goto L_0x0027
            fy3.l<java.lang.Double, java.lang.Double> r4 = f307578q
            goto L_0x002c
        L_0x0027:
            b1.k$e r4 = new b1.k$e
            r4.<init>(r1)
        L_0x002c:
            r17 = r4
            if (r6 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            fy3.l<java.lang.Double, java.lang.Double> r0 = f307578q
            goto L_0x003c
        L_0x0037:
            b1.k$f r0 = new b1.k$f
            r0.<init>(r1)
        L_0x003c:
            r18 = r0
            b1.l r19 = new b1.l
            r0 = r19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r20 = 0
            r13 = r20
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r26
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r5 = 0
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r17
            r7 = r18
            r8 = r28
            r9 = r29
            r10 = r19
            r11 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p450b1.C103990k.<init>(java.lang.String, float[], b1.m, double, float, float, int):void");
    }
}
