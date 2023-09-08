package ca0;

import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.util.List;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: ca0.q */
public final class C104355q extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f308989d;

    /* renamed from: e */
    public final /* synthetic */ String f308990e;

    /* renamed from: f */
    public final /* synthetic */ boolean f308991f;

    /* renamed from: g */
    public final /* synthetic */ int f308992g;

    /* renamed from: h */
    public final /* synthetic */ long f308993h;

    /* renamed from: i */
    public final /* synthetic */ C32224a<List<String>> f308994i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104355q(String str, String str2, boolean z, int i, long j, C32224a<? extends List<String>> aVar) {
        super(2);
        this.f308989d = str;
        this.f308990e = str2;
        this.f308991f = z;
        this.f308992g = i;
        this.f308993h = j;
        this.f308994i = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01fe, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0252, code lost:
        if ((r8.length() > 0) != false) goto L_0x0257;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r45, java.lang.Object r46) {
        /*
            r44 = this;
            r0 = r44
            r14 = r45
            j0.h r14 = (p175j0.C108504h) r14
            r1 = r46
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r1 = r1 & 11
            r2 = 2
            if (r1 != r2) goto L_0x001f
            boolean r1 = r14.mo51575a()
            if (r1 != 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r14.mo51581d()
            goto L_0x02d3
        L_0x001f:
            int r1 = p721v0.C65503j.f188489K0
            v0.j$a r11 = p721v0.C65503j.C65504a.f188490d
            r1 = 0
            r12 = 1
            r13 = 0
            v0.j r3 = p435a0.C103214y0.m136590f(r11, r1, r12, r13)
            float r2 = (float) r2
            r4 = 8
            float r15 = (float) r4
            float r2 = r2 * r15
            v0.j r2 = p435a0.C103166l0.m136519c(r3, r2)
            java.lang.String r10 = r0.f308989d
            java.lang.String r9 = r0.f308990e
            boolean r8 = r0.f308991f
            int r7 = r0.f308992g
            long r5 = r0.f308993h
            fy3.a<java.util.List<java.lang.String>> r4 = r0.f308994i
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo51557H(r3)
            a0.a$l r3 = p435a0.C103111a.f304237d
            int r16 = p721v0.C111294a.f333218a
            v0.a$b r1 = p721v0.C111294a.C111295a.f333228j
            r16 = r10
            r10 = 0
            o1.y r1 = p435a0.C103157j.m136499a(r3, r1, r14, r10)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo51557H(r3)
            r17 = r9
            j0.f1<i2.d> r9 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r18 = r14.mo51598m(r9)
            r3 = r18
            i2.d r3 = (p560i2.C108322d) r3
            j0.f1<i2.o> r12 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r19 = r14.mo51598m(r12)
            r13 = r19
            i2.o r13 = (p560i2.C33183o) r13
            j0.f1<androidx.compose.ui.platform.i2> r10 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r21 = r14.mo51598m(r10)
            r0 = r21
            androidx.compose.ui.platform.i2 r0 = (androidx.compose.p002ui.platform.C103633i2) r0
            q1.a$a r21 = p658q1.C110269a.f329831D0
            r21.getClass()
            r21 = r4
            fy3.a<q1.a> r4 = p658q1.C110269a.C110270a.f329833b
            fy3.q r2 = p631o1.C109863q.m149330a(r2)
            r22 = r5
            j0.d r5 = r14.mo51543A()
            boolean r5 = r5 instanceof p175j0.C24665d
            if (r5 == 0) goto L_0x02db
            r14.mo51615v()
            boolean r5 = r14.mo51621y()
            if (r5 == 0) goto L_0x009d
            r14.mo51612t(r4)
            goto L_0x00a0
        L_0x009d:
            r14.mo51579c()
        L_0x00a0:
            r14.mo51561L()
            fy3.p<q1.a, o1.y, rx3.b0> r5 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r14, r1, r5)
            fy3.p<q1.a, i2.d, rx3.b0> r1 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r14, r3, r1)
            fy3.p<q1.a, i2.o, rx3.b0> r3 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r14, r13, r3)
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r6 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r14, r0, r6)
            r14.mo51590i()
            j0.x1 r0 = new j0.x1
            r0.<init>(r14)
            r24 = r7
            r13 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            q0.b r2 = (p415q0.C35747b) r2
            r2.invoke(r0, r14, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo51557H(r0)
            r2 = -1163856341(0xffffffffbaa0f62b, float:-0.0012280395)
            r14.mo51557H(r2)
            a0.a$e r2 = p435a0.C103111a.f304241h
            v0.a$c r7 = p721v0.C111294a.C111295a.f333227i
            r25 = r8
            r0 = 1
            r8 = 0
            r13 = 0
            v0.j r26 = p435a0.C103214y0.m136591g(r11, r13, r0, r8)
            r27 = 0
            r28 = 0
            r29 = 0
            float r8 = (float) r0
            float r30 = r8 * r15
            r31 = 7
            r32 = 0
            v0.j r0 = p435a0.C103166l0.m136523g(r26, r27, r28, r29, r30, r31, r32)
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo51557H(r8)
            r8 = 54
            o1.y r2 = p435a0.C103199s0.m136579a(r2, r7, r14, r8)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo51557H(r7)
            java.lang.Object r7 = r14.mo51598m(r9)
            i2.d r7 = (p560i2.C108322d) r7
            java.lang.Object r8 = r14.mo51598m(r12)
            i2.o r8 = (p560i2.C33183o) r8
            java.lang.Object r10 = r14.mo51598m(r10)
            androidx.compose.ui.platform.i2 r10 = (androidx.compose.p002ui.platform.C103633i2) r10
            fy3.q r0 = p631o1.C109863q.m149330a(r0)
            j0.d r12 = r14.mo51543A()
            boolean r12 = r12 instanceof p175j0.C24665d
            if (r12 == 0) goto L_0x02d6
            r14.mo51615v()
            boolean r12 = r14.mo51621y()
            if (r12 == 0) goto L_0x0132
            r14.mo51612t(r4)
            goto L_0x0135
        L_0x0132:
            r14.mo51579c()
        L_0x0135:
            r14.mo51561L()
            p175j0.C108508o2.m147049a(r14, r2, r5)
            p175j0.C108508o2.m147049a(r14, r7, r1)
            p175j0.C108508o2.m147049a(r14, r8, r3)
            p175j0.C108508o2.m147049a(r14, r10, r6)
            r14.mo51590i()
            j0.x1 r1 = new j0.x1
            r1.<init>(r14)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            q0.b r0 = (p415q0.C35747b) r0
            r0.invoke(r1, r14, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo51557H(r0)
            r0 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r14.mo51557H(r0)
            j0.f1<ca0.e0> r0 = ca0.C104353p.f308980a
            java.lang.Object r1 = r14.mo51598m(r0)
            ca0.e0 r1 = (ca0.C104344e0) r1
            int r1 = r1.f308948g
            java.lang.Object r2 = r14.mo51598m(r0)
            ca0.e0 r2 = (ca0.C104344e0) r2
            long r2 = r2.f308946e
            r10 = 0
            d1.c r1 = ta0.C110954a.m151253a(r1, r2, r14, r10)
            r2 = 0
            r3 = 3
            float r3 = (float) r3
            float r3 = r3 * r15
            v0.j r3 = p435a0.C103214y0.m136594j(r11, r3)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r12 = 440(0x1b8, float:6.17E-43)
            r13 = 120(0x78, float:1.68E-43)
            r19 = r21
            r28 = r22
            r21 = r24
            r24 = r25
            r8 = r14
            r34 = r9
            r33 = r17
            r9 = r12
            r12 = r16
            r10 = r13
            p267x.C111897d1.m152617a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r14.mo51598m(r0)
            ca0.e0 r1 = (ca0.C104344e0) r1
            long r1 = r1.f308945d
            r3 = 4618722892845154304(0x4019000000000000, double:6.25)
            float r3 = (float) r3
            float r3 = r3 * r15
            r4 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            float r4 = (float) r4
            float r4 = r4 * r15
            v0.j r4 = p435a0.C103214y0.m136595k(r11, r3, r4)
            r5 = 0
            int r3 = r21 >> 9
            r15 = r3 & 112(0x70, float:1.57E-43)
            r7 = r15 | 384(0x180, float:5.38E-43)
            r8 = 8
            r3 = r24
            r6 = r14
            ca0.C54686j0.m61557a(r1, r3, r4, r5, r6, r7, r8)
            r14.mo51565P()
            r14.mo51565P()
            r14.mo51610s()
            r14.mo51565P()
            r14.mo51565P()
            java.lang.Object r1 = r14.mo51598m(r0)
            ca0.e0 r1 = (ca0.C104344e0) r1
            boolean r1 = r1.f308951j
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r24)
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            r14.mo51557H(r3)
            boolean r3 = r14.mo51619x(r12)
            r4 = r33
            boolean r5 = r14.mo51619x(r4)
            r3 = r3 | r5
            boolean r2 = r14.mo51619x(r2)
            r2 = r2 | r3
            java.lang.Object r3 = r14.mo51606q()
            if (r2 != 0) goto L_0x0200
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r2) goto L_0x0277
        L_0x0200:
            if (r1 != 0) goto L_0x0217
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r2 = 45
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x026f
        L_0x0217:
            if (r24 == 0) goto L_0x0255
            java.lang.Object r1 = r19.invoke()
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0255
            int r1 = r8.size()
            r2 = 1
            if (r1 <= r2) goto L_0x022b
            r10 = 1
            goto L_0x022c
        L_0x022b:
            r10 = 0
        L_0x022c:
            if (r10 == 0) goto L_0x0231
            r35 = r8
            goto L_0x0233
        L_0x0231:
            r35 = 0
        L_0x0233:
            if (r35 == 0) goto L_0x0256
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 62
            r43 = 0
            java.lang.String r36 = " "
            java.lang.String r8 = sx3.C110818d0.m150921S(r35, r36, r37, r38, r39, r40, r41, r42, r43)
            int r1 = r8.length()
            if (r1 <= 0) goto L_0x0251
            r10 = 1
            goto L_0x0252
        L_0x0251:
            r10 = 0
        L_0x0252:
            if (r10 == 0) goto L_0x0256
            goto L_0x0257
        L_0x0255:
            r2 = 1
        L_0x0256:
            r8 = 0
        L_0x0257:
            if (r8 != 0) goto L_0x0273
            int r1 = r12.length()
            if (r1 <= 0) goto L_0x0260
            goto L_0x0261
        L_0x0260:
            r2 = 0
        L_0x0261:
            if (r2 == 0) goto L_0x0265
            r13 = r12
            goto L_0x0266
        L_0x0265:
            r13 = 0
        L_0x0266:
            if (r13 != 0) goto L_0x0271
            r1 = 2131832604(0x7f112f1c, float:1.9298267E38)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r1)
        L_0x026f:
            r3 = r1
            goto L_0x0274
        L_0x0271:
            r3 = r13
            goto L_0x0274
        L_0x0273:
            r3 = r8
        L_0x0274:
            r14.mo51553F(r3)
        L_0x0277:
            r14.mo51565P()
            java.lang.String r3 = (java.lang.String) r3
            r1 = r3
            java.lang.Object r0 = r14.mo51598m(r0)
            ca0.e0 r0 = (ca0.C104344e0) r0
            long r7 = r0.f308946e
            r0 = 17
            float r0 = (float) r0
            r2 = r34
            java.lang.Object r2 = r14.mo51598m(r2)
            i2.d r2 = (p560i2.C108322d) r2
            long r9 = r2.mo143031F(r0)
            java.lang.String r0 = "info"
            gy3.C87412m.m108593f(r3, r0)
            r5 = 0
            r6 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r2 = 0
            r0 = r14
            r4 = r15
            r14 = r2
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r2 = 1597440(0x186000, float:2.23849E-39)
            r25 = r4 | r2
            r26 = 0
            r27 = 262024(0x3ff88, float:3.67174E-40)
            r2 = r24
            r3 = r28
            r24 = r0
            ca0.C104335e.m139318a(r1, r2, r3, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
            r0.mo51565P()
        L_0x02d3:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x02d6:
            p175j0.C108501g.m147000a()
            r0 = 0
            throw r0
        L_0x02db:
            r0 = 0
            p175j0.C108501g.m147000a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C104355q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
