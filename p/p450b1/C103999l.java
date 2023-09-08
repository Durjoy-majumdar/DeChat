package p450b1;

import gy3.C87412m;

/* renamed from: b1.l */
public final class C103999l {

    /* renamed from: a */
    public final double f307599a;

    /* renamed from: b */
    public final double f307600b;

    /* renamed from: c */
    public final double f307601c;

    /* renamed from: d */
    public final double f307602d;

    /* renamed from: e */
    public final double f307603e;

    /* renamed from: f */
    public final double f307604f;

    /* renamed from: g */
    public final double f307605g;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        if ((r1 == 0.0d) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b3, code lost:
        if ((r1 == 0.0d) != false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103999l(double r17, double r19, double r21, double r23, double r25, double r27, double r29, int r31, gy3.C8480h r32) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            r5 = r23
            r7 = r25
            r9 = r31 & 32
            if (r9 == 0) goto L_0x0011
            r12 = 0
            goto L_0x0013
        L_0x0011:
            r12 = r27
        L_0x0013:
            r9 = r31 & 64
            if (r9 == 0) goto L_0x001a
            r14 = 0
            goto L_0x001c
        L_0x001a:
            r14 = r29
        L_0x001c:
            r16.<init>()
            r0.f307599a = r1
            r0.f307600b = r3
            r10 = r21
            r0.f307601c = r10
            r0.f307602d = r5
            r0.f307603e = r7
            r0.f307604f = r12
            r0.f307605g = r14
            boolean r9 = java.lang.Double.isNaN(r19)
            if (r9 != 0) goto L_0x00f6
            boolean r9 = java.lang.Double.isNaN(r21)
            if (r9 != 0) goto L_0x00f6
            boolean r9 = java.lang.Double.isNaN(r23)
            if (r9 != 0) goto L_0x00f6
            boolean r9 = java.lang.Double.isNaN(r25)
            if (r9 != 0) goto L_0x00f6
            boolean r9 = java.lang.Double.isNaN(r12)
            if (r9 != 0) goto L_0x00f6
            boolean r9 = java.lang.Double.isNaN(r14)
            if (r9 != 0) goto L_0x00f6
            boolean r9 = java.lang.Double.isNaN(r17)
            if (r9 != 0) goto L_0x00f6
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00df
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x00df
            r13 = 0
            r14 = 1
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x006d
            r15 = 1
            goto L_0x006e
        L_0x006d:
            r15 = 0
        L_0x006e:
            if (r15 == 0) goto L_0x008b
            int r15 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x0076
            r15 = 1
            goto L_0x0077
        L_0x0076:
            r15 = 0
        L_0x0077:
            if (r15 != 0) goto L_0x0083
            int r15 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x007f
            r9 = 1
            goto L_0x0080
        L_0x007f:
            r9 = 0
        L_0x0080:
            if (r9 != 0) goto L_0x0083
            goto L_0x008b
        L_0x0083:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Parameter a or g is zero, the transfer function is constant"
            r1.<init>(r2)
            throw r1
        L_0x008b:
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r7 = 0
            if (r9 < 0) goto L_0x00a3
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0097
            r9 = 1
            goto L_0x0098
        L_0x0097:
            r9 = 0
        L_0x0098:
            if (r9 != 0) goto L_0x009b
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Parameter c is zero, the transfer function is constant"
            r1.<init>(r2)
            throw r1
        L_0x00a3:
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            if (r3 != 0) goto L_0x00b5
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x00b2
            r3 = 1
            goto L_0x00b3
        L_0x00b2:
            r3 = 0
        L_0x00b3:
            if (r3 == 0) goto L_0x00bc
        L_0x00b5:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x00ba
            r13 = 1
        L_0x00ba:
            if (r13 != 0) goto L_0x00d7
        L_0x00bc:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x00cf
            if (r9 < 0) goto L_0x00c7
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x00c7
            return
        L_0x00c7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The transfer function must be positive or increasing"
            r1.<init>(r2)
            throw r1
        L_0x00cf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The transfer function must be increasing"
            r1.<init>(r2)
            throw r1
        L_0x00d7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            r1.<init>(r2)
            throw r1
        L_0x00df:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parameter d must be in the range [0..1], was "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00f6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Parameters cannot be NaN"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p450b1.C103999l.<init>(double, double, double, double, double, double, double, int, gy3.h):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103999l)) {
            return false;
        }
        C103999l lVar = (C103999l) obj;
        return C87412m.m108589b(Double.valueOf(this.f307599a), Double.valueOf(lVar.f307599a)) && C87412m.m108589b(Double.valueOf(this.f307600b), Double.valueOf(lVar.f307600b)) && C87412m.m108589b(Double.valueOf(this.f307601c), Double.valueOf(lVar.f307601c)) && C87412m.m108589b(Double.valueOf(this.f307602d), Double.valueOf(lVar.f307602d)) && C87412m.m108589b(Double.valueOf(this.f307603e), Double.valueOf(lVar.f307603e)) && C87412m.m108589b(Double.valueOf(this.f307604f), Double.valueOf(lVar.f307604f)) && C87412m.m108589b(Double.valueOf(this.f307605g), Double.valueOf(lVar.f307605g));
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f307599a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f307600b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f307601c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f307602d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f307603e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f307604f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f307605g);
        return (((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f307599a + ", a=" + this.f307600b + ", b=" + this.f307601c + ", c=" + this.f307602d + ", d=" + this.f307603e + ", e=" + this.f307604f + ", f=" + this.f307605g + ')';
    }
}
