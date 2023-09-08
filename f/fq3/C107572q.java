package fq3;

import fy3.C32226l;
import fy3.C32228q;
import gy3.C59741c0;
import gy3.C87413o;
import p004b0.C103941f;
import p157gk.C59480d;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: fq3.q */
public final class C107572q extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59480d f321859d;

    /* renamed from: e */
    public final /* synthetic */ C59741c0 f321860e;

    /* renamed from: f */
    public final /* synthetic */ C59741c0 f321861f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<String, C13598b0> f321862g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107572q(C59480d dVar, C59741c0 c0Var, C59741c0 c0Var2, C32226l<? super String, C13598b0> lVar, int i) {
        super(3);
        this.f321859d = dVar;
        this.f321860e = c0Var;
        this.f321861f = c0Var2;
        this.f321862g = lVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: fy3.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            b0.f r1 = (p004b0.C103941f) r1
            r2 = r22
            j0.h r2 = (p175j0.C108504h) r2
            r3 = r23
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "$this$item"
            gy3.C87412m.m108594g(r1, r4)
            r1 = r3 & 81
            r3 = 16
            if (r1 != r3) goto L_0x0029
            boolean r1 = r2.mo51575a()
            if (r1 != 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            r2.mo51581d()
            goto L_0x0180
        L_0x0029:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            gk.d r3 = r0.f321859d
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r4 = r3.f169960b
            gy3.c0 r5 = r0.f321860e
            gy3.c0 r6 = r0.f321861f
            fy3.l<java.lang.String, rx3.b0> r7 = r0.f321862g
            java.util.Iterator r4 = r4.iterator()
            r9 = 0
        L_0x003d:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0180
            java.lang.Object r10 = r4.next()
            int r11 = r9 + 1
            r12 = 0
            if (r9 < 0) goto L_0x017b
            com.tencent.mm.api.QueryImageData r10 = (com.tencent.p014mm.api.QueryImageData) r10
            java.lang.String r9 = r10.f154725f
            r1.add(r9)
            int r9 = r11 % 4
            if (r9 == 0) goto L_0x0063
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r3.f169960b
            int r9 = r9.size()
            if (r11 != r9) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r12 = 0
            goto L_0x0173
        L_0x0063:
            int r9 = p721v0.C65503j.f188489K0
            v0.j$a r9 = p721v0.C65503j.C65504a.f188490d
            r10 = 0
            r13 = 1
            v0.j r9 = p435a0.C103214y0.m136591g(r9, r10, r13, r12)
            float r10 = r5.f170634d
            r13 = 4593671619917905920(0x3fc0000000000000, double:0.125)
            float r13 = (float) r13
            r14 = 8
            float r14 = (float) r14
            float r13 = r13 * r14
            v0.j r9 = p435a0.C103166l0.m136522f(r9, r10, r13, r10, r13)
            a0.a r10 = p435a0.C103111a.f304234a
            r12 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            float r12 = (float) r12
            float r12 = r12 * r14
            a0.a$e r10 = r10.mo142861g(r12)
            r12 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.mo51557H(r12)
            int r12 = p721v0.C111294a.f333218a
            v0.a$c r12 = p721v0.C111294a.C111295a.f333226h
            r13 = 6
            o1.y r10 = p435a0.C103199s0.m136579a(r10, r12, r2, r13)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo51557H(r12)
            j0.f1<i2.d> r12 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r12 = r2.mo51598m(r12)
            i2.d r12 = (p560i2.C108322d) r12
            j0.f1<i2.o> r13 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r13 = r2.mo51598m(r13)
            i2.o r13 = (p560i2.C33183o) r13
            j0.f1<androidx.compose.ui.platform.i2> r14 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r14 = r2.mo51598m(r14)
            androidx.compose.ui.platform.i2 r14 = (androidx.compose.p002ui.platform.C103633i2) r14
            q1.a$a r15 = p658q1.C110269a.f329831D0
            r15.getClass()
            fy3.a<q1.a> r15 = p658q1.C110269a.C110270a.f329833b
            fy3.q r9 = p631o1.C109863q.m149330a(r9)
            j0.d r8 = r2.mo51543A()
            boolean r8 = r8 instanceof p175j0.C24665d
            if (r8 == 0) goto L_0x0176
            r2.mo51615v()
            boolean r8 = r2.mo51621y()
            if (r8 == 0) goto L_0x00d3
            r2.mo51612t(r15)
            goto L_0x00d6
        L_0x00d3:
            r2.mo51579c()
        L_0x00d6:
            r2.mo51561L()
            fy3.p<q1.a, o1.y, rx3.b0> r8 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r2, r10, r8)
            fy3.p<q1.a, i2.d, rx3.b0> r8 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r2, r12, r8)
            fy3.p<q1.a, i2.o, rx3.b0> r8 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r2, r13, r8)
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r8 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r2, r14, r8)
            r2.mo51590i()
            j0.x1 r8 = new j0.x1
            r8.<init>(r2)
            r10 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            q0.b r9 = (p415q0.C35747b) r9
            r9.invoke(r8, r2, r12)
            r8 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo51557H(r8)
            r8 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r2.mo51557H(r8)
            java.util.Iterator r8 = r1.iterator()
        L_0x010f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0160
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            int r10 = p721v0.C65503j.f188489K0
            v0.j$a r10 = p721v0.C65503j.C65504a.f188490d
            float r12 = r6.f170634d
            v0.j r13 = p435a0.C103214y0.m136594j(r10, r12)
            r14 = 0
            r15 = 0
            r16 = 0
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2.mo51557H(r10)
            boolean r10 = r2.mo51619x(r7)
            boolean r12 = r2.mo51619x(r9)
            r10 = r10 | r12
            java.lang.Object r12 = r2.mo51606q()
            if (r10 != 0) goto L_0x0144
            int r10 = p175j0.C108504h.f324828a
            java.lang.Object r10 = p175j0.C108504h.C60656a.f172772a
            if (r12 != r10) goto L_0x014c
        L_0x0144:
            fq3.p r12 = new fq3.p
            r12.<init>(r7, r9)
            r2.mo51553F(r12)
        L_0x014c:
            r2.mo51565P()
            r17 = r12
            fy3.a r17 = (fy3.C32224a) r17
            r18 = 7
            r19 = 0
            v0.j r10 = p267x.C111940o.m152651d(r13, r14, r15, r16, r17, r18, r19)
            r12 = 0
            fq3.C107569j.m145739c(r10, r9, r2, r12)
            goto L_0x010f
        L_0x0160:
            r12 = 0
            r2.mo51565P()
            r2.mo51565P()
            r2.mo51610s()
            r2.mo51565P()
            r2.mo51565P()
            r1.clear()
        L_0x0173:
            r9 = r11
            goto L_0x003d
        L_0x0176:
            p175j0.C108501g.m147000a()
            r1 = 0
            throw r1
        L_0x017b:
            r1 = r12
            sx3.C64197v.m75542k()
            throw r1
        L_0x0180:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fq3.C107572q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
