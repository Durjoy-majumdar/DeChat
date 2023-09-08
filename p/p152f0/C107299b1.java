package p152f0;

import fy3.C32228q;
import gy3.C87413o;
import p175j0.C108504h;
import p721v0.C65503j;
import p735w1.C111705z;

/* renamed from: f0.b1 */
public final class C107299b1 extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ int f321034d;

    /* renamed from: e */
    public final /* synthetic */ C111705z f321035e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107299b1(int i, C111705z zVar) {
        super(3);
        this.f321034d = i;
        this.f321035e = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0068, code lost:
        if (r10 == p175j0.C108504h.C60656a.f172772a) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008c, code lost:
        if (r8 == p175j0.C108504h.C60656a.f172772a) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        if (r9 == p175j0.C108504h.C60656a.f172772a) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0138, code lost:
        if (r4 == p175j0.C108504h.C60656a.f172772a) goto L_0x013a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            v0.j r1 = (p721v0.C65503j) r1
            r2 = r19
            j0.h r2 = (p175j0.C108504h) r2
            r3 = r20
            java.lang.Number r3 = (java.lang.Number) r3
            r3.intValue()
            java.lang.String r3 = "$this$composed"
            gy3.C87412m.m108594g(r1, r3)
            r1 = -1027014173(0xffffffffc2c901e3, float:-100.503685)
            r2.mo51557H(r1)
            int r1 = r0.f321034d
            r3 = 1
            r4 = 0
            if (r1 <= 0) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            if (r5 == 0) goto L_0x0181
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r5) goto L_0x0035
            int r1 = p721v0.C65503j.f188489K0
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            r2.mo51565P()
            goto L_0x0180
        L_0x0035:
            j0.f1<i2.d> r1 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r1 = r2.mo51598m(r1)
            i2.d r1 = (p560i2.C108322d) r1
            j0.f1<b2.i$a> r5 = androidx.compose.p002ui.platform.C103645l0.f306127h
            java.lang.Object r5 = r2.mo51598m(r5)
            b2.i$a r5 = (p451b2.C104014i.C104015a) r5
            j0.f1<i2.o> r6 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r6 = r2.mo51598m(r6)
            i2.o r6 = (p560i2.C33183o) r6
            w1.z r7 = r0.f321035e
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2.mo51557H(r8)
            boolean r9 = r2.mo51619x(r7)
            boolean r10 = r2.mo51619x(r6)
            r9 = r9 | r10
            java.lang.Object r10 = r2.mo51606q()
            if (r9 != 0) goto L_0x006a
            int r9 = p175j0.C108504h.f324828a
            java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
            if (r10 != r9) goto L_0x0071
        L_0x006a:
            w1.z r10 = p735w1.C111686a0.m152214a(r7, r6)
            r2.mo51553F(r10)
        L_0x0071:
            r2.mo51565P()
            w1.z r10 = (p735w1.C111705z) r10
            r2.mo51557H(r8)
            boolean r7 = r2.mo51619x(r5)
            boolean r8 = r2.mo51619x(r10)
            r7 = r7 | r8
            java.lang.Object r8 = r2.mo51606q()
            if (r7 != 0) goto L_0x008e
            int r7 = p175j0.C108504h.f324828a
            java.lang.Object r7 = p175j0.C108504h.C60656a.f172772a
            if (r8 != r7) goto L_0x00af
        L_0x008e:
            w1.r r7 = r10.f334379a
            b2.i r8 = r7.f334346f
            b2.q r9 = r7.f334343c
            if (r9 != 0) goto L_0x0098
            b2.q r9 = p451b2.C104022q.f307654i
        L_0x0098:
            b2.o r11 = r7.f334344d
            if (r11 == 0) goto L_0x009f
            int r11 = r11.f307648a
            goto L_0x00a0
        L_0x009f:
            r11 = 0
        L_0x00a0:
            b2.p r7 = r7.f334345e
            if (r7 == 0) goto L_0x00a7
            int r7 = r7.f307649a
            goto L_0x00a8
        L_0x00a7:
            r7 = 1
        L_0x00a8:
            j0.k2 r8 = r5.mo145610a(r8, r9, r11, r7)
            r2.mo51553F(r8)
        L_0x00af:
            r2.mo51565P()
            j0.k2 r8 = (p175j0.C60667k2) r8
            r7 = 5
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r4] = r1
            r9[r3] = r5
            w1.z r11 = r0.f321035e
            r12 = 2
            r9[r12] = r11
            r11 = 3
            r9[r11] = r6
            java.lang.Object r13 = r8.getValue()
            r14 = 4
            r9[r14] = r13
            r13 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r2.mo51557H(r13)
            r15 = 0
            r16 = 0
        L_0x00d3:
            if (r15 >= r7) goto L_0x00e3
            r13 = r9[r15]
            boolean r13 = r2.mo51619x(r13)
            r16 = r16 | r13
            int r15 = r15 + 1
            r13 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            goto L_0x00d3
        L_0x00e3:
            java.lang.Object r9 = r2.mo51606q()
            if (r16 != 0) goto L_0x00ef
            int r13 = p175j0.C108504h.f324828a
            java.lang.Object r13 = p175j0.C108504h.C60656a.f172772a
            if (r9 != r13) goto L_0x0100
        L_0x00ef:
            java.lang.String r9 = p152f0.C107393p1.f321312a
            long r15 = p152f0.C107393p1.m145499a(r10, r1, r5, r9, r3)
            int r9 = p560i2.C33181m.m39966b(r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2.mo51553F(r9)
        L_0x0100:
            r2.mo51565P()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r4] = r1
            r13[r3] = r5
            w1.z r15 = r0.f321035e
            r13[r12] = r15
            r13[r11] = r6
            java.lang.Object r6 = r8.getValue()
            r13[r14] = r6
            r6 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r2.mo51557H(r6)
            r6 = 0
        L_0x0122:
            if (r4 >= r7) goto L_0x012e
            r8 = r13[r4]
            boolean r8 = r2.mo51619x(r8)
            r6 = r6 | r8
            int r4 = r4 + 1
            goto L_0x0122
        L_0x012e:
            java.lang.Object r4 = r2.mo51606q()
            if (r6 != 0) goto L_0x013a
            int r6 = p175j0.C108504h.f324828a
            java.lang.Object r6 = p175j0.C108504h.C60656a.f172772a
            if (r4 != r6) goto L_0x015f
        L_0x013a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = p152f0.C107393p1.f321312a
            r4.append(r6)
            r7 = 10
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            long r4 = p152f0.C107393p1.m145499a(r10, r1, r5, r4, r12)
            int r4 = p560i2.C33181m.m39966b(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.mo51553F(r4)
        L_0x015f:
            r2.mo51565P()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 - r9
            int r5 = r0.f321034d
            int r5 = r5 - r3
            int r4 = r4 * r5
            int r9 = r9 + r4
            int r4 = p721v0.C65503j.f188489K0
            v0.j$a r4 = p721v0.C65503j.C65504a.f188490d
            r5 = 0
            float r1 = r1.mo143039m(r9)
            r6 = 0
            v0.j r1 = p435a0.C103214y0.m136593i(r4, r5, r1, r3, r6)
            r2.mo51565P()
        L_0x0180:
            return r1
        L_0x0181:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "maxLines must be greater than 0"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p152f0.C107299b1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
