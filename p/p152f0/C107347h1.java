package p152f0;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p451b2.C104014i;
import p560i2.C108322d;
import p560i2.C33183o;
import p735w1.C111686a0;
import p735w1.C111688e;
import p735w1.C111705z;
import p735w1.C37958a;
import p735w1.C37967m;

/* renamed from: f0.h1 */
public final class C107347h1 {

    /* renamed from: a */
    public final C37958a f321168a;

    /* renamed from: b */
    public final C111705z f321169b;

    /* renamed from: c */
    public final int f321170c;

    /* renamed from: d */
    public final boolean f321171d;

    /* renamed from: e */
    public final int f321172e;

    /* renamed from: f */
    public final C108322d f321173f;

    /* renamed from: g */
    public final C104014i.C104015a f321174g;

    /* renamed from: h */
    public final List<C37958a.C37961b<C37967m>> f321175h;

    /* renamed from: i */
    public C111688e f321176i;

    /* renamed from: j */
    public C33183o f321177j;

    public C107347h1(C37958a aVar, C111705z zVar, int i, boolean z, int i2, C108322d dVar, C104014i.C104015a aVar2, List list, C8480h hVar) {
        this.f321168a = aVar;
        this.f321169b = zVar;
        this.f321170c = i;
        this.f321171d = z;
        this.f321172e = i2;
        this.f321173f = dVar;
        this.f321174g = aVar2;
        this.f321175h = list;
        if (!(i > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if ((r10 == 2) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        if (p560i2.C108319b.m146696g(r31) == p560i2.C108319b.m146696g(r2.f334370j)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cd, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ee  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p735w1.C111703v mo157803a(long r31, p560i2.C33183o r33, p735w1.C111703v r34) {
        /*
            r30 = this;
            r0 = r30
            r14 = r31
            r9 = r33
            r13 = r34
            java.lang.String r1 = "layoutDirection"
            gy3.C87412m.m108594g(r9, r1)
            if (r13 == 0) goto L_0x011e
            w1.a r4 = r0.f321168a
            w1.z r5 = r0.f321169b
            java.util.List<w1.a$b<w1.m>> r6 = r0.f321175h
            int r7 = r0.f321170c
            boolean r8 = r0.f321171d
            int r10 = r0.f321172e
            i2.d r11 = r0.f321173f
            b2.i$a r12 = r0.f321174g
            java.lang.String r2 = "text"
            gy3.C87412m.m108594g(r4, r2)
            java.lang.String r2 = "style"
            gy3.C87412m.m108594g(r5, r2)
            java.lang.String r2 = "placeholders"
            gy3.C87412m.m108594g(r6, r2)
            java.lang.String r2 = "density"
            gy3.C87412m.m108594g(r11, r2)
            java.lang.String r2 = "fontFamilyResolver"
            gy3.C87412m.m108594g(r12, r2)
            w1.u r2 = r13.f334371a
            w1.d r3 = r13.f334372b
            w1.e r3 = r3.f334314a
            boolean r3 = r3.mo157586b()
            if (r3 == 0) goto L_0x0046
            goto L_0x00cf
        L_0x0046:
            w1.a r3 = r2.f334361a
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x00cf
            w1.z r3 = r2.f334362b
            r3.getClass()
            if (r3 == r5) goto L_0x006c
            w1.k r4 = r3.f334380b
            w1.k r1 = r5.f334380b
            boolean r1 = gy3.C87412m.m108589b(r4, r1)
            if (r1 == 0) goto L_0x006a
            w1.r r1 = r3.f334379a
            w1.r r3 = r5.f334379a
            boolean r1 = r1.mo163355b(r3)
            if (r1 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r1 = 0
            goto L_0x006d
        L_0x006c:
            r1 = 1
        L_0x006d:
            if (r1 == 0) goto L_0x00cf
            java.util.List<w1.a$b<w1.m>> r1 = r2.f334363c
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 == 0) goto L_0x00cf
            int r1 = r2.f334364d
            if (r1 != r7) goto L_0x00cf
            boolean r1 = r2.f334365e
            if (r1 != r8) goto L_0x00cf
            int r1 = r2.f334366f
            if (r1 != r10) goto L_0x0085
            r1 = 1
            goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            if (r1 == 0) goto L_0x00cf
            i2.d r1 = r2.f334367g
            boolean r1 = gy3.C87412m.m108589b(r1, r11)
            if (r1 == 0) goto L_0x00cf
            i2.o r1 = r2.f334368h
            if (r1 != r9) goto L_0x00cf
            b2.i$a r1 = r2.f334369i
            boolean r1 = gy3.C87412m.m108589b(r1, r12)
            if (r1 != 0) goto L_0x009d
            goto L_0x00cf
        L_0x009d:
            int r1 = p560i2.C108319b.m146699j(r31)
            long r3 = r2.f334370j
            int r3 = p560i2.C108319b.m146699j(r3)
            if (r1 == r3) goto L_0x00aa
            goto L_0x00cf
        L_0x00aa:
            if (r8 != 0) goto L_0x00b5
            r1 = 2
            if (r10 != r1) goto L_0x00b1
            r1 = 1
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            if (r1 != 0) goto L_0x00b5
            goto L_0x00cd
        L_0x00b5:
            int r1 = p560i2.C108319b.m146697h(r31)
            long r3 = r2.f334370j
            int r3 = p560i2.C108319b.m146697h(r3)
            if (r1 != r3) goto L_0x00cf
            int r1 = p560i2.C108319b.m146696g(r31)
            long r2 = r2.f334370j
            int r2 = p560i2.C108319b.m146696g(r2)
            if (r1 != r2) goto L_0x00cf
        L_0x00cd:
            r1 = 1
            goto L_0x00d0
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            if (r1 == 0) goto L_0x011e
            w1.u r16 = new w1.u
            w1.u r1 = r13.f334371a
            w1.a r2 = r1.f334361a
            w1.z r3 = r0.f321169b
            java.util.List<w1.a$b<w1.m>> r4 = r1.f334363c
            int r5 = r1.f334364d
            boolean r6 = r1.f334365e
            int r7 = r1.f334366f
            i2.d r8 = r1.f334367g
            i2.o r9 = r1.f334368h
            b2.i$a r10 = r1.f334369i
            r17 = 0
            r1 = r16
            r11 = r31
            r0 = r13
            r13 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            w1.d r1 = r0.f334372b
            float r1 = r1.f334317d
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            w1.d r2 = r0.f334372b
            float r2 = r2.f334318e
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            long r1 = p560i2.C108329n.m146743a(r1, r2)
            long r5 = p560i2.C108321c.m146706c(r14, r1)
            w1.v r1 = new w1.v
            w1.d r4 = r0.f334372b
            r7 = 0
            r2 = r1
            r3 = r16
            r2.<init>(r3, r4, r5, r7)
            return r1
        L_0x011e:
            r0 = r30
            r0.mo157804b(r9)
            int r1 = p560i2.C108319b.m146699j(r31)
            boolean r2 = r0.f321171d
            if (r2 != 0) goto L_0x0138
            int r2 = r0.f321172e
            r3 = 2
            if (r2 != r3) goto L_0x0132
            r2 = 1
            goto L_0x0133
        L_0x0132:
            r2 = 0
        L_0x0133:
            if (r2 == 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r2 = 0
            goto L_0x0139
        L_0x0138:
            r2 = 1
        L_0x0139:
            if (r2 == 0) goto L_0x0146
            boolean r2 = p560i2.C108319b.m146693d(r31)
            if (r2 == 0) goto L_0x0146
            int r2 = p560i2.C108319b.m146697h(r31)
            goto L_0x0149
        L_0x0146:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0149:
            boolean r3 = r0.f321171d
            if (r3 != 0) goto L_0x0159
            int r3 = r0.f321172e
            r4 = 2
            if (r3 != r4) goto L_0x0154
            r3 = 1
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            if (r3 == 0) goto L_0x0159
            r3 = 1
            goto L_0x015a
        L_0x0159:
            r3 = 0
        L_0x015a:
            if (r3 == 0) goto L_0x015f
            r23 = 1
            goto L_0x0163
        L_0x015f:
            int r3 = r0.f321170c
            r23 = r3
        L_0x0163:
            java.lang.String r3 = "layoutIntrinsics must be called first"
            if (r1 != r2) goto L_0x0168
            goto L_0x017b
        L_0x0168:
            w1.e r4 = r0.f321176i
            if (r4 == 0) goto L_0x01f4
            float r4 = r4.mo157585a()
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            int r2 = my3.C61595o.m72297e(r4, r1, r2)
        L_0x017b:
            r25 = r2
            w1.d r13 = new w1.d
            w1.e r1 = r0.f321176i
            if (r1 == 0) goto L_0x01ee
            r24 = 0
            r26 = 0
            int r27 = p560i2.C108319b.m146696g(r31)
            r28 = 5
            r29 = 0
            long r21 = p560i2.C108321c.m146705b(r24, r25, r26, r27, r28, r29)
            int r2 = r0.f321172e
            r3 = 2
            if (r2 != r3) goto L_0x019b
            r24 = 1
            goto L_0x019d
        L_0x019b:
            r24 = 0
        L_0x019d:
            r25 = 0
            r19 = r13
            r20 = r1
            r19.<init>(r20, r21, r23, r24, r25)
            float r1 = r13.f334317d
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            float r2 = r13.f334318e
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            long r1 = p560i2.C108329n.m146743a(r1, r2)
            long r16 = p560i2.C108321c.m146706c(r14, r1)
            w1.v r18 = new w1.v
            w1.u r19 = new w1.u
            w1.a r2 = r0.f321168a
            w1.z r3 = r0.f321169b
            java.util.List<w1.a$b<w1.m>> r4 = r0.f321175h
            int r5 = r0.f321170c
            boolean r6 = r0.f321171d
            int r7 = r0.f321172e
            i2.d r8 = r0.f321173f
            b2.i$a r10 = r0.f321174g
            r20 = 0
            r1 = r19
            r9 = r33
            r11 = r31
            r14 = r13
            r13 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            r9 = 0
            r4 = r18
            r5 = r19
            r6 = r14
            r7 = r16
            r4.<init>(r5, r6, r7, r9)
            return r18
        L_0x01ee:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            throw r1
        L_0x01f4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p152f0.C107347h1.mo157803a(long, i2.o, w1.v):w1.v");
    }

    /* renamed from: b */
    public final void mo157804b(C33183o oVar) {
        C87412m.m108594g(oVar, "layoutDirection");
        C111688e eVar = this.f321176i;
        if (eVar == null || oVar != this.f321177j || eVar.mo157586b()) {
            this.f321177j = oVar;
            eVar = new C111688e(this.f321168a, C111686a0.m152214a(this.f321169b, oVar), this.f321175h, this.f321173f, this.f321174g);
        }
        this.f321176i = eVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C107347h1(p735w1.C37958a r13, p735w1.C111705z r14, int r15, boolean r16, int r17, p560i2.C108322d r18, p451b2.C104014i.C104015a r19, java.util.List r20, int r21, gy3.C8480h r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000d
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x000e
        L_0x000d:
            r5 = r15
        L_0x000e:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L_0x0015
            r6 = 1
            goto L_0x0017
        L_0x0015:
            r6 = r16
        L_0x0017:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001d
            r7 = 1
            goto L_0x001f
        L_0x001d:
            r7 = r17
        L_0x001f:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0027
            sx3.f0 r0 = sx3.C64186f0.f181907d
            r10 = r0
            goto L_0x0029
        L_0x0027:
            r10 = r20
        L_0x0029:
            r11 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r8 = r18
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p152f0.C107347h1.<init>(w1.a, w1.z, int, boolean, int, i2.d, b2.i$a, java.util.List, int, gy3.h):void");
    }
}
