package p436a1;

import com.tencent.p014mm.sdk.platformtools.Util;
import p450b1.C103978b;
import p450b1.C103979c;
import p450b1.C103980d;
import p450b1.C103990k;

/* renamed from: a1.y */
public final class C103276y {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m136790a(float r10, float r11, float r12, float r13, p450b1.C103979c r14) {
        /*
            java.lang.String r0 = "colorSpace"
            gy3.C87412m.m108594g(r14, r0)
            r0 = 0
            float r1 = r14.mo145586c(r0)
            float r2 = r14.mo145585b(r0)
            r3 = 1
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0019
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0019
            r1 = 1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r1 == 0) goto L_0x0059
            float r1 = r14.mo145586c(r3)
            float r5 = r14.mo145585b(r3)
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 == 0) goto L_0x0059
            r1 = 2
            float r5 = r14.mo145586c(r1)
            float r1 = r14.mo145585b(r1)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 == 0) goto L_0x0059
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r1 == 0) goto L_0x00f5
            boolean r1 = r14.mo145587d()
            r5 = 16
            r6 = 32
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x008d
            r14 = 1132396544(0x437f0000, float:255.0)
            float r13 = r13 * r14
            float r13 = r13 + r7
            int r13 = (int) r13
            int r13 = r13 << 24
            float r10 = r10 * r14
            float r10 = r10 + r7
            int r10 = (int) r10
            int r10 = r10 << r5
            r10 = r10 | r13
            float r11 = r11 * r14
            float r11 = r11 + r7
            int r11 = (int) r11
            int r11 = r11 << 8
            r10 = r10 | r11
            float r12 = r12 * r14
            float r12 = r12 + r7
            int r11 = (int) r12
            r10 = r10 | r11
            long r10 = (long) r10
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            long r10 = r10 << r6
            int r12 = p436a1.C103272w.f304516h
            return r10
        L_0x008d:
            long r8 = r14.f307536b
            int r1 = p450b1.C103978b.f307534e
            long r8 = r8 >> r6
            int r1 = (int) r8
            r8 = 3
            if (r1 != r8) goto L_0x0098
            r1 = 1
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            if (r1 == 0) goto L_0x00e9
            int r14 = r14.f307537c
            r1 = -1
            if (r14 == r1) goto L_0x00a1
            r0 = 1
        L_0x00a1:
            if (r0 == 0) goto L_0x00dd
            short r10 = p436a1.C103278z.m136798a(r10)
            short r11 = p436a1.C103278z.m136798a(r11)
            short r12 = p436a1.C103278z.m136798a(r12)
            float r13 = java.lang.Math.min(r13, r2)
            float r13 = java.lang.Math.max(r4, r13)
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r13 = r13 * r0
            float r13 = r13 + r7
            int r13 = (int) r13
            long r0 = (long) r10
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            r10 = 48
            long r0 = r0 << r10
            long r10 = (long) r11
            long r10 = r10 & r2
            long r10 = r10 << r6
            long r10 = r10 | r0
            long r0 = (long) r12
            long r0 = r0 & r2
            long r0 = r0 << r5
            long r10 = r10 | r0
            long r12 = (long) r13
            r0 = 1023(0x3ff, double:5.054E-321)
            long r12 = r12 & r0
            r0 = 6
            long r12 = r12 << r0
            long r10 = r10 | r12
            long r12 = (long) r14
            r0 = 63
            long r12 = r12 & r0
            long r10 = r10 | r12
            int r12 = p436a1.C103272w.f304516h
            return r10
        L_0x00dd:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Unknown color space, please use a color space in ColorSpaces"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00e9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Color only works with ColorSpaces with 3 components"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00f5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "red = "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = ", green = "
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = ", blue = "
            r0.append(r10)
            r0.append(r12)
            java.lang.String r10 = ", alpha = "
            r0.append(r10)
            r0.append(r13)
            java.lang.String r10 = " outside the range for "
            r0.append(r10)
            r0.append(r14)
            java.lang.String r10 = r0.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p436a1.C103276y.m136790a(float, float, float, float, b1.c):long");
    }

    /* renamed from: b */
    public static final long m136791b(int i) {
        long j = ((long) i) << 32;
        int i2 = C103272w.f304516h;
        return j;
    }

    /* renamed from: c */
    public static final long m136792c(long j) {
        long j2 = (j & Util.MAX_32BIT_VALUE) << 32;
        int i = C103272w.f304516h;
        return j2;
    }

    /* renamed from: d */
    public static final long m136793d(long j, long j2) {
        long a = C103272w.m136779a(j, C103272w.m136784f(j2));
        float d = C103272w.m136782d(j2);
        float d2 = C103272w.m136782d(a);
        float f = 1.0f - d2;
        float f2 = (d * f) + d2;
        boolean z = true;
        float f3 = 0.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        float h = i == 0 ? 0.0f : ((C103272w.m136786h(a) * d2) + ((C103272w.m136786h(j2) * d) * f)) / f2;
        float g = i == 0 ? 0.0f : ((C103272w.m136785g(a) * d2) + ((C103272w.m136785g(j2) * d) * f)) / f2;
        float e = C103272w.m136783e(a);
        float e2 = C103272w.m136783e(j2);
        if (i != 0) {
            z = false;
        }
        if (!z) {
            f3 = ((e * d2) + ((e2 * d) * f)) / f2;
        }
        return m136790a(h, g, f3, f2, C103272w.m136784f(j2));
    }

    /* renamed from: e */
    public static final float[] m136794e(long j) {
        return new float[]{C103272w.m136786h(j), C103272w.m136785g(j), C103272w.m136783e(j), C103272w.m136782d(j)};
    }

    /* renamed from: f */
    public static final float m136795f(long j) {
        C103979c f = C103272w.m136784f(j);
        long j2 = f.f307536b;
        int i = C103978b.f307534e;
        if (C103978b.m138706a(j2, C103978b.f307530a)) {
            C103990k.C103997i iVar = (C103990k.C103997i) ((C103990k) f).f307589n;
            float doubleValue = (float) ((((Number) iVar.invoke(Double.valueOf((double) C103272w.m136786h(j)))).doubleValue() * 0.2126d) + (((Number) iVar.invoke(Double.valueOf((double) C103272w.m136785g(j)))).doubleValue() * 0.7152d) + (((Number) iVar.invoke(Double.valueOf((double) C103272w.m136783e(j)))).doubleValue() * 0.0722d));
            if (doubleValue <= 0.0f) {
                return 0.0f;
            }
            if (doubleValue >= 1.0f) {
                return 1.0f;
            }
            return doubleValue;
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + C103978b.m138707b(f.f307536b)).toString());
    }

    /* renamed from: g */
    public static final int m136796g(long j) {
        C103979c f = C103272w.m136784f(j);
        if (f.mo145587d()) {
            return (int) (j >>> 32);
        }
        float[] e = m136794e(j);
        C103980d.m138716d(f, (C103979c) null, 0, 3, (Object) null).mo145592a(e);
        return ((int) ((e[2] * 255.0f) + 0.5f)) | (((int) ((e[3] * 255.0f) + 0.5f)) << 24) | (((int) ((e[0] * 255.0f) + 0.5f)) << 16) | (((int) ((e[1] * 255.0f) + 0.5f)) << 8);
    }
}
