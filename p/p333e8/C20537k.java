package p333e8;

import java.util.Arrays;

/* renamed from: e8.k */
public final class C20537k {

    /* renamed from: a */
    public static final byte[] f57788a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f57789b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f57790c = new Object();

    /* renamed from: d */
    public static int[] f57791d = new int[10];

    /* renamed from: e8.k$a */
    public static final class C20538a {

        /* renamed from: a */
        public final int f57792a;

        /* renamed from: b */
        public final int f57793b;

        /* renamed from: c */
        public final boolean f57794c;

        public C20538a(int i, int i2, boolean z) {
            this.f57792a = i;
            this.f57793b = i2;
            this.f57794c = z;
        }
    }

    /* renamed from: e8.k$b */
    public static final class C20539b {

        /* renamed from: a */
        public final int f57795a;

        /* renamed from: b */
        public final int f57796b;

        /* renamed from: c */
        public final int f57797c;

        /* renamed from: d */
        public final float f57798d;

        /* renamed from: e */
        public final boolean f57799e;

        /* renamed from: f */
        public final boolean f57800f;

        /* renamed from: g */
        public final int f57801g;

        /* renamed from: h */
        public final int f57802h;

        /* renamed from: i */
        public final int f57803i;

        /* renamed from: j */
        public final boolean f57804j;

        public C20539b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f57795a = i;
            this.f57796b = i2;
            this.f57797c = i3;
            this.f57798d = f;
            this.f57799e = z;
            this.f57800f = z2;
            this.f57801g = i4;
            this.f57802h = i5;
            this.f57803i = i6;
            this.f57804j = z3;
        }
    }

    /* renamed from: a */
    public static void m22254a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0095, code lost:
        r9 = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m22255b(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            p333e8.C20528a.m22240d(r3)
            if (r0 != 0) goto L_0x000f
            return r10
        L_0x000f:
            r3 = 2
            if (r11 == 0) goto L_0x0040
            boolean r4 = r11[r1]
            if (r4 == 0) goto L_0x001c
            m22254a(r11)
            int r9 = r9 + -3
            return r9
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r11[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r8[r9]
            if (r4 != r2) goto L_0x002b
            m22254a(r11)
            int r9 = r9 - r3
            return r9
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r11[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r8[r9]
            if (r4 != 0) goto L_0x0040
            int r4 = r9 + 1
            byte r4 = r8[r4]
            if (r4 != r2) goto L_0x0040
            m22254a(r11)
            int r9 = r9 - r2
            return r9
        L_0x0040:
            int r4 = r10 + -1
            int r9 = r9 + r3
        L_0x0043:
            if (r9 >= r4) goto L_0x0065
            byte r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            int r6 = r9 + -2
            byte r7 = r8[r6]
            if (r7 != 0) goto L_0x0060
            int r7 = r9 + -1
            byte r7 = r8[r7]
            if (r7 != 0) goto L_0x0060
            if (r5 != r2) goto L_0x0060
            if (r11 == 0) goto L_0x005f
            m22254a(r11)
        L_0x005f:
            return r6
        L_0x0060:
            int r9 = r9 + -2
        L_0x0062:
            int r9 = r9 + 3
            goto L_0x0043
        L_0x0065:
            if (r11 == 0) goto L_0x00b9
            if (r0 <= r3) goto L_0x007c
            int r9 = r10 + -3
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007a
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007a
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007a
            goto L_0x0095
        L_0x007a:
            r9 = 0
            goto L_0x0096
        L_0x007c:
            if (r0 != r3) goto L_0x008d
            boolean r9 = r11[r3]
            if (r9 == 0) goto L_0x007a
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007a
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007a
            goto L_0x0095
        L_0x008d:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L_0x007a
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007a
        L_0x0095:
            r9 = 1
        L_0x0096:
            r11[r1] = r9
            if (r0 <= r2) goto L_0x00a5
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x00af
            byte r9 = r8[r4]
            if (r9 != 0) goto L_0x00af
            goto L_0x00ad
        L_0x00a5:
            boolean r9 = r11[r3]
            if (r9 == 0) goto L_0x00af
            byte r9 = r8[r4]
            if (r9 != 0) goto L_0x00af
        L_0x00ad:
            r9 = 1
            goto L_0x00b0
        L_0x00af:
            r9 = 0
        L_0x00b0:
            r11[r2] = r9
            byte r8 = r8[r4]
            if (r8 != 0) goto L_0x00b7
            r1 = 1
        L_0x00b7:
            r11[r3] = r1
        L_0x00b9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p333e8.C20537k.m22255b(byte[], int, int, boolean[]):int");
    }

    /* renamed from: c */
    public static C20538a m22256c(byte[] bArr, int i, int i2) {
        C20542n nVar = new C20542n(bArr, i, i2);
        nVar.mo32124j(8);
        int f = nVar.mo32120f();
        int f2 = nVar.mo32120f();
        nVar.mo32123i();
        return new C20538a(f, f2, nVar.mo32118d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0155  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p333e8.C20537k.C20539b m22257d(byte[] r19, int r20, int r21) {
        /*
            e8.n r0 = new e8.n
            r1 = r19
            r2 = r20
            r3 = r21
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo32124j(r1)
            int r2 = r0.mo32119e(r1)
            r3 = 16
            r0.mo32124j(r3)
            int r5 = r0.mo32120f()
            r4 = 100
            r6 = 3
            r8 = 1
            if (r2 == r4) goto L_0x004b
            r4 = 110(0x6e, float:1.54E-43)
            if (r2 == r4) goto L_0x004b
            r4 = 122(0x7a, float:1.71E-43)
            if (r2 == r4) goto L_0x004b
            r4 = 244(0xf4, float:3.42E-43)
            if (r2 == r4) goto L_0x004b
            r4 = 44
            if (r2 == r4) goto L_0x004b
            r4 = 83
            if (r2 == r4) goto L_0x004b
            r4 = 86
            if (r2 == r4) goto L_0x004b
            r4 = 118(0x76, float:1.65E-43)
            if (r2 == r4) goto L_0x004b
            r4 = 128(0x80, float:1.794E-43)
            if (r2 == r4) goto L_0x004b
            r4 = 138(0x8a, float:1.93E-43)
            if (r2 != r4) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r2 = 1
            r9 = 0
            goto L_0x009b
        L_0x004b:
            int r2 = r0.mo32120f()
            if (r2 != r6) goto L_0x0056
            boolean r4 = r0.mo32118d()
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            r0.mo32120f()
            r0.mo32120f()
            r0.mo32123i()
            boolean r9 = r0.mo32118d()
            if (r9 == 0) goto L_0x009a
            if (r2 == r6) goto L_0x006b
            r9 = 8
            goto L_0x006d
        L_0x006b:
            r9 = 12
        L_0x006d:
            r10 = 0
        L_0x006e:
            if (r10 >= r9) goto L_0x009a
            boolean r11 = r0.mo32118d()
            if (r11 == 0) goto L_0x0097
            r11 = 6
            if (r10 >= r11) goto L_0x007c
            r11 = 16
            goto L_0x007e
        L_0x007c:
            r11 = 64
        L_0x007e:
            r12 = 0
            r13 = 8
            r14 = 8
        L_0x0083:
            if (r12 >= r11) goto L_0x0097
            if (r13 == 0) goto L_0x0090
            int r13 = r0.mo32121g()
            int r13 = r13 + r14
            int r13 = r13 + 256
            int r13 = r13 % 256
        L_0x0090:
            if (r13 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r14 = r13
        L_0x0094:
            int r12 = r12 + 1
            goto L_0x0083
        L_0x0097:
            int r10 = r10 + 1
            goto L_0x006e
        L_0x009a:
            r9 = r4
        L_0x009b:
            int r4 = r0.mo32120f()
            int r11 = r4 + 4
            int r12 = r0.mo32120f()
            if (r12 != 0) goto L_0x00af
            int r4 = r0.mo32120f()
            int r4 = r4 + 4
            r13 = r4
            goto L_0x00d0
        L_0x00af:
            if (r12 != r8) goto L_0x00cf
            boolean r4 = r0.mo32118d()
            r0.mo32121g()
            r0.mo32121g()
            int r10 = r0.mo32120f()
            long r13 = (long) r10
            r10 = 0
        L_0x00c1:
            long r6 = (long) r10
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00cc
            r0.mo32120f()
            int r10 = r10 + 1
            goto L_0x00c1
        L_0x00cc:
            r14 = r4
            r13 = 0
            goto L_0x00d1
        L_0x00cf:
            r13 = 0
        L_0x00d0:
            r14 = 0
        L_0x00d1:
            r0.mo32120f()
            r0.mo32123i()
            int r4 = r0.mo32120f()
            int r4 = r4 + r8
            int r6 = r0.mo32120f()
            int r6 = r6 + r8
            boolean r10 = r0.mo32118d()
            int r7 = 2 - r10
            int r7 = r7 * r6
            if (r10 != 0) goto L_0x00ee
            r0.mo32123i()
        L_0x00ee:
            r0.mo32123i()
            int r4 = r4 * 16
            int r7 = r7 * 16
            boolean r6 = r0.mo32118d()
            if (r6 == 0) goto L_0x012a
            int r6 = r0.mo32120f()
            int r15 = r0.mo32120f()
            int r16 = r0.mo32120f()
            int r17 = r0.mo32120f()
            if (r2 != 0) goto L_0x0110
            int r2 = 2 - r10
            goto L_0x0120
        L_0x0110:
            r18 = 2
            r3 = 3
            if (r2 != r3) goto L_0x0117
            r3 = 1
            goto L_0x0118
        L_0x0117:
            r3 = 2
        L_0x0118:
            if (r2 != r8) goto L_0x011b
            r8 = 2
        L_0x011b:
            int r2 = 2 - r10
            int r2 = r2 * r8
            r8 = r3
        L_0x0120:
            int r6 = r6 + r15
            int r6 = r6 * r8
            int r4 = r4 - r6
            int r16 = r16 + r17
            int r16 = r16 * r2
            int r7 = r7 - r16
        L_0x012a:
            r6 = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.mo32118d()
            if (r3 == 0) goto L_0x015f
            boolean r3 = r0.mo32118d()
            if (r3 == 0) goto L_0x015f
            int r1 = r0.mo32119e(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0155
            r3 = 16
            int r1 = r0.mo32119e(r3)
            int r0 = r0.mo32119e(r3)
            if (r1 == 0) goto L_0x0153
            if (r0 == 0) goto L_0x0153
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = r1 / r0
        L_0x0153:
            r8 = r2
            goto L_0x0161
        L_0x0155:
            float[] r0 = f57789b
            r3 = 17
            if (r1 >= r3) goto L_0x015f
            r0 = r0[r1]
            r8 = r0
            goto L_0x0161
        L_0x015f:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0161:
            e8.k$b r0 = new e8.k$b
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p333e8.C20537k.m22257d(byte[], int, int):e8.k$b");
    }

    /* renamed from: e */
    public static int m22258e(byte[] bArr, int i) {
        int i2;
        synchronized (f57790c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f57791d;
                    if (iArr.length <= i4) {
                        f57791d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f57791d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f57791d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i15 = i9 + 1;
                bArr[i9] = 0;
                i5 = i15 + 1;
                bArr[i15] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
