package p257w;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.coremedia.TimeUtil;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: w.e0 */
public final class C37898e0 implements C37894c0 {

    /* renamed from: a */
    public final float f100307a;

    /* renamed from: b */
    public final C37941v0 f100308b;

    public C37898e0() {
        this(0.0f, 0.0f, 0.0f, 7, (C8480h) null);
    }

    public C37898e0(float f, float f2, float f3) {
        this.f100307a = f3;
        C37941v0 v0Var = new C37941v0(1.0f);
        if (f >= 0.0f) {
            v0Var.f100386g = f;
            v0Var.f100382c = false;
            double d = v0Var.f100381b;
            if (((float) (d * d)) > 0.0f) {
                v0Var.f100381b = Math.sqrt((double) f2);
                v0Var.f100382c = false;
                this.f100308b = v0Var;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: a */
    public C37918n1 mo61393a(C37906k1 k1Var) {
        C87412m.m108594g(k1Var, "converter");
        return new C37935t1((C37894c0) this);
    }

    /* renamed from: b */
    public float mo61389b(long j, float f, float f2, float f3) {
        long j2 = j / TimeUtil.SECOND_TO_US;
        C37941v0 v0Var = this.f100308b;
        v0Var.f100380a = f2;
        return Float.intBitsToFloat((int) (v0Var.mo61436a(f, f3, j2) & Util.MAX_32BIT_VALUE));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0260, code lost:
        if (r15 > 0.0d) goto L_0x026e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo61390c(float r47, float r48, float r49) {
        /*
            r46 = this;
            r0 = r46
            w.v0 r1 = r0.f100308b
            double r2 = r1.f100381b
            double r2 = r2 * r2
            float r2 = (float) r2
            float r1 = r1.f100386g
            float r3 = r47 - r48
            float r4 = r0.f100307a
            float r3 = r3 / r4
            float r4 = r49 / r4
            r5 = 1065353216(0x3f800000, float:1.0)
            double r6 = (double) r2
            double r1 = (double) r1
            double r8 = (double) r4
            double r3 = (double) r3
            double r10 = (double) r5
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r1 * r12
            double r16 = java.lang.Math.sqrt(r6)
            double r14 = r14 * r16
            double r12 = -r14
            double r14 = r14 * r14
            r16 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r6 = r6 * r16
            double r14 = r14 - r6
            w.r r5 = p257w.C37929s.m41626a(r14)
            double r6 = r5.f100340a
            double r6 = r6 + r12
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r16
            r5.f100340a = r6
            double r6 = r5.f100341b
            double r6 = r6 / r16
            r5.f100341b = r6
            w.r r6 = p257w.C37929s.m41626a(r14)
            double r14 = r6.f100340a
            r7 = -1
            r18 = r10
            double r10 = (double) r7
            double r14 = r14 * r10
            r20 = r1
            double r0 = r6.f100341b
            double r0 = r0 * r10
            double r14 = r14 + r12
            double r14 = r14 / r16
            r6.f100340a = r14
            double r0 = r0 / r16
            r6.f100341b = r0
            r0 = 0
            r7 = 1
            int r10 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0062
            r11 = 1
            goto L_0x0063
        L_0x0062:
            r11 = 0
        L_0x0063:
            if (r11 == 0) goto L_0x0072
            int r11 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x006b
            r11 = 1
            goto L_0x006c
        L_0x006b:
            r11 = 0
        L_0x006c:
            if (r11 == 0) goto L_0x0072
            r0 = 0
            goto L_0x02be
        L_0x0072:
            if (r10 >= 0) goto L_0x0075
            double r8 = -r8
        L_0x0075:
            double r15 = java.lang.Math.abs(r3)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r31 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r33 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r10 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x01a9
            double r3 = r5.f100340a
            double r5 = r6.f100340a
            double r10 = r3 * r15
            double r10 = r10 - r8
            double r8 = r3 - r5
            double r10 = r10 / r8
            double r23 = r15 - r10
            double r14 = r18 / r23
            double r14 = java.lang.Math.abs(r14)
            double r14 = java.lang.Math.log(r14)
            double r14 = r14 / r3
            double r16 = r18 / r10
            double r16 = java.lang.Math.abs(r16)
            double r16 = java.lang.Math.log(r16)
            double r0 = r16 / r5
            boolean r12 = java.lang.Double.isInfinite(r14)
            if (r12 != 0) goto L_0x00ba
            boolean r12 = java.lang.Double.isNaN(r14)
            if (r12 != 0) goto L_0x00ba
            r12 = 1
            goto L_0x00bb
        L_0x00ba:
            r12 = 0
        L_0x00bb:
            r12 = r12 ^ r7
            if (r12 == 0) goto L_0x00c0
            r14 = r0
            goto L_0x00d7
        L_0x00c0:
            boolean r12 = java.lang.Double.isInfinite(r0)
            if (r12 != 0) goto L_0x00ce
            boolean r12 = java.lang.Double.isNaN(r0)
            if (r12 != 0) goto L_0x00ce
            r12 = 1
            goto L_0x00cf
        L_0x00ce:
            r12 = 0
        L_0x00cf:
            r7 = r7 ^ r12
            if (r7 == 0) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            double r14 = java.lang.Math.max(r14, r0)
        L_0x00d7:
            double r0 = r23 * r3
            r47 = r14
            double r13 = -r10
            double r13 = r13 * r5
            double r12 = r0 / r13
            double r12 = java.lang.Math.log(r12)
            double r14 = r5 - r3
            double r12 = r12 / r14
            boolean r7 = java.lang.Double.isNaN(r12)
            if (r7 != 0) goto L_0x0138
            r14 = 0
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x00f4
            goto L_0x0138
        L_0x00f4:
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x0125
            double r14 = r3 * r12
            double r14 = java.lang.Math.exp(r14)
            double r14 = r14 * r23
            double r12 = r12 * r5
            double r12 = java.lang.Math.exp(r12)
            double r12 = r12 * r10
            double r12 = r12 + r14
            double r12 = -r12
            int r7 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x0125
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            int r0 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x011d
            r12 = r18
            r0 = 0
            goto L_0x0121
        L_0x011d:
            r0 = r47
            r12 = r18
        L_0x0121:
            double r7 = -r12
            r14 = r0
            r12 = r7
            goto L_0x0135
        L_0x0125:
            r12 = r18
            double r14 = r10 * r5
            double r14 = r14 * r5
            double r14 = -r14
            double r0 = r0 * r3
            double r14 = r14 / r0
            double r0 = java.lang.Math.log(r14)
            double r0 = r0 / r8
            r14 = r0
        L_0x0135:
            r44 = r12
            goto L_0x013f
        L_0x0138:
            r12 = r18
            double r0 = -r12
            r14 = r47
            r44 = r0
        L_0x013f:
            w.t0 r0 = new w.t0
            r35 = r0
            r36 = r23
            r38 = r3
            r40 = r10
            r42 = r5
            r35.<init>(r36, r38, r40, r42, r44)
            w.u0 r1 = new w.u0
            r22 = r1
            r25 = r3
            r27 = r10
            r29 = r5
            r22.<init>(r23, r25, r27, r29)
            java.lang.Double r3 = java.lang.Double.valueOf(r14)
            java.lang.Object r3 = r0.invoke(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            double r3 = r3.doubleValue()
            double r3 = java.lang.Math.abs(r3)
            r5 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0178
            goto L_0x02b6
        L_0x0178:
            r2 = 0
        L_0x0179:
            int r3 = (r31 > r33 ? 1 : (r31 == r33 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b6
            r6 = 100
            if (r2 >= r6) goto L_0x02b6
            int r2 = r2 + 1
            java.lang.Double r3 = java.lang.Double.valueOf(r14)
            java.lang.Object r3 = r0.invoke(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            double r3 = r3.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r14)
            java.lang.Object r5 = r1.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            double r7 = r5.doubleValue()
            double r3 = r3 / r7
            double r3 = r14 - r3
            double r14 = r14 - r3
            double r31 = java.lang.Math.abs(r14)
            r14 = r3
            goto L_0x0179
        L_0x01a9:
            r12 = r18
            r6 = 100
            int r0 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01cc
            double r0 = r5.f100340a
            double r2 = r0 * r15
            double r8 = r8 - r2
            double r2 = r5.f100341b
            double r8 = r8 / r2
            double r15 = r15 * r15
            double r8 = r8 * r8
            double r15 = r15 + r8
            double r2 = java.lang.Math.sqrt(r15)
            double r10 = r12 / r2
            double r2 = java.lang.Math.log(r10)
            double r14 = r2 / r0
            goto L_0x02b6
        L_0x01cc:
            double r0 = r5.f100340a
            double r3 = r0 * r15
            double r8 = r8 - r3
            double r10 = r12 / r15
            double r10 = java.lang.Math.abs(r10)
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r0
            double r17 = r12 / r8
            double r17 = java.lang.Math.abs(r17)
            double r17 = java.lang.Math.log(r17)
            r19 = r17
            r5 = 0
        L_0x01e9:
            r14 = 6
            if (r5 >= r14) goto L_0x01fb
            double r19 = r19 / r0
            double r19 = java.lang.Math.abs(r19)
            double r19 = java.lang.Math.log(r19)
            double r19 = r17 - r19
            int r5 = r5 + 1
            goto L_0x01e9
        L_0x01fb:
            r21 = r3
            double r2 = r19 / r0
            boolean r4 = java.lang.Double.isInfinite(r10)
            if (r4 != 0) goto L_0x020d
            boolean r4 = java.lang.Double.isNaN(r10)
            if (r4 != 0) goto L_0x020d
            r4 = 1
            goto L_0x020e
        L_0x020d:
            r4 = 0
        L_0x020e:
            r4 = r4 ^ r7
            if (r4 == 0) goto L_0x0213
            r10 = r2
            goto L_0x022a
        L_0x0213:
            boolean r4 = java.lang.Double.isInfinite(r2)
            if (r4 != 0) goto L_0x0221
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L_0x0221
            r4 = 1
            goto L_0x0222
        L_0x0221:
            r4 = 0
        L_0x0222:
            r4 = r4 ^ r7
            if (r4 == 0) goto L_0x0226
            goto L_0x022a
        L_0x0226:
            double r10 = java.lang.Math.max(r10, r2)
        L_0x022a:
            double r3 = r21 + r8
            double r2 = -r3
            double r4 = r0 * r8
            double r2 = r2 / r4
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L_0x026d
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x023d
            goto L_0x026d
        L_0x023d:
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0263
            double r4 = r0 * r2
            double r17 = java.lang.Math.exp(r4)
            double r17 = r17 * r15
            double r2 = r2 * r8
            double r4 = java.lang.Math.exp(r4)
            double r2 = r2 * r4
            double r2 = r2 + r17
            double r2 = -r2
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0263
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x026d
            int r4 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x026d
            goto L_0x026e
        L_0x0263:
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r0
            double r2 = -r2
            double r4 = r15 / r8
            double r2 = r2 - r4
            r29 = r12
            goto L_0x0271
        L_0x026d:
            r2 = r10
        L_0x026e:
            double r10 = -r12
            r29 = r10
        L_0x0271:
            w.r0 r4 = new w.r0
            r22 = r4
            r23 = r15
            r25 = r8
            r27 = r0
            r22.<init>(r23, r25, r27, r29)
            w.s0 r5 = new w.s0
            r10 = r5
            r11 = r8
            r13 = r0
            r10.<init>(r11, r13, r15)
            r14 = r2
            r2 = 0
        L_0x0288:
            int r0 = (r31 > r33 ? 1 : (r31 == r33 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b6
            if (r2 >= r6) goto L_0x02b6
            int r2 = r2 + 1
            java.lang.Double r0 = java.lang.Double.valueOf(r14)
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r14)
            java.lang.Object r3 = r5.invoke(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            double r7 = r3.doubleValue()
            double r0 = r0 / r7
            double r0 = r14 - r0
            double r14 = r14 - r0
            double r31 = java.lang.Math.abs(r14)
            r14 = r0
            goto L_0x0288
        L_0x02b6:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r14 = r14 * r0
            long r0 = (long) r14
        L_0x02be:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p257w.C37898e0.mo61390c(float, float, float):long");
    }

    /* renamed from: d */
    public float mo61391d(float f, float f2, float f3) {
        return 0.0f;
    }

    /* renamed from: e */
    public float mo61392e(long j, float f, float f2, float f3) {
        long j2 = j / TimeUtil.SECOND_TO_US;
        C37941v0 v0Var = this.f100308b;
        v0Var.f100380a = f2;
        return Float.intBitsToFloat((int) (v0Var.mo61436a(f, f3, j2) >> 32));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37898e0(float f, float f2, float f3, int i, C8480h hVar) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
