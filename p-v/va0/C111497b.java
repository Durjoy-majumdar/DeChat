package va0;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: va0.b */
public final class C111497b {

    /* renamed from: va0.b$a */
    public static final class C65559a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f188632d;

        /* renamed from: e */
        public final /* synthetic */ C111503f f188633e;

        /* renamed from: f */
        public final /* synthetic */ C14422e f188634f;

        /* renamed from: g */
        public final /* synthetic */ int f188635g;

        /* renamed from: h */
        public final /* synthetic */ int f188636h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65559a(C65503j jVar, C111503f fVar, C14422e eVar, int i, int i2) {
            super(2);
            this.f188632d = jVar;
            this.f188633e = fVar;
            this.f188634f = eVar;
            this.f188635g = i;
            this.f188636h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C111497b.m152004a(this.f188632d, this.f188633e, this.f188634f, (C108504h) obj, this.f188635g | 1, this.f188636h);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m152004a(p721v0.C65503j r38, va0.C111503f r39, va0.C14422e r40, p175j0.C108504h r41, int r42, int r43) {
        /*
            r4 = r42
            r0 = 1779595990(0x6a127ad6, float:4.427081E25)
            r1 = r41
            j0.h r0 = r1.mo51623z(r0)
            r1 = r43 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0016
            r3 = r4 | 6
            r5 = r3
            r3 = r38
            goto L_0x002a
        L_0x0016:
            r3 = r4 & 14
            if (r3 != 0) goto L_0x0027
            r3 = r38
            boolean r5 = r0.mo51619x(r3)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = 2
        L_0x0025:
            r5 = r5 | r4
            goto L_0x002a
        L_0x0027:
            r3 = r38
            r5 = r4
        L_0x002a:
            r6 = r43 & 2
            if (r6 == 0) goto L_0x0031
            r5 = r5 | 48
            goto L_0x0044
        L_0x0031:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0044
            r7 = r39
            boolean r8 = r0.mo51619x(r7)
            if (r8 == 0) goto L_0x0040
            r8 = 32
            goto L_0x0042
        L_0x0040:
            r8 = 16
        L_0x0042:
            r5 = r5 | r8
            goto L_0x0046
        L_0x0044:
            r7 = r39
        L_0x0046:
            r8 = r43 & 4
            if (r8 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0060
            r9 = r40
            boolean r10 = r0.mo51619x(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r10
            goto L_0x0062
        L_0x0060:
            r9 = r40
        L_0x0062:
            r5 = r5 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r5 != r10) goto L_0x0077
            boolean r5 = r0.mo51575a()
            if (r5 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            r0.mo51581d()
            r1 = r3
            r2 = r7
            r3 = r9
            goto L_0x0216
        L_0x0077:
            if (r1 == 0) goto L_0x007e
            int r1 = p721v0.C65503j.f188489K0
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            goto L_0x007f
        L_0x007e:
            r1 = r3
        L_0x007f:
            if (r6 == 0) goto L_0x0084
            va0.f r3 = va0.C111503f.Normal
            goto L_0x0085
        L_0x0084:
            r3 = r7
        L_0x0085:
            if (r8 == 0) goto L_0x008b
            va0.e r5 = va0.C14422e.White
            r15 = r5
            goto L_0x008c
        L_0x008b:
            r15 = r9
        L_0x008c:
            j0.f1<android.content.Context> r5 = androidx.compose.p002ui.platform.C103691v.f306268b
            java.lang.Object r5 = r0.mo51598m(r5)
            android.content.Context r5 = (android.content.Context) r5
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r6)
            java.lang.Object r6 = r0.mo51606q()
            int r7 = p175j0.C108504h.f324828a
            java.lang.Object r7 = p175j0.C108504h.C60656a.f172772a
            r12 = 1
            if (r6 != r7) goto L_0x00d4
            android.content.res.Resources r5 = r5.getResources()
            r3.getClass()
            java.lang.String r6 = "color"
            gy3.C87412m.m108594g(r15, r6)
            int r6 = r15.ordinal()
            if (r6 == 0) goto L_0x00c2
            if (r6 != r12) goto L_0x00bc
            int r6 = r3.f333821e
            goto L_0x00c4
        L_0x00bc:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x00c2:
            int r6 = r3.f333822f
        L_0x00c4:
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            java.lang.String r6 = "context.resources.getDrawable(size.getRes(color))"
            gy3.C87412m.m108593f(r5, r6)
            d1.c r6 = ua0.C111148c.m151602a(r5)
            r0.mo51553F(r6)
        L_0x00d4:
            r0.mo51565P()
            r13 = r6
            d1.c r13 = (p1104d1.C106969c) r13
            r14 = 0
            w.i0 r5 = p257w.C111648j0.m152176b(r0, r14)
            r6 = 1135869952(0x43b40000, float:360.0)
            r7 = 1000(0x3e8, float:1.401E-42)
            w.z r8 = p257w.C37890a0.f100293a
            w.a0$a r8 = p257w.C37890a0.C37891a.f100294a
            r11 = 0
            w.j1 r16 = p257w.C37903i.m41595c(r7, r14, r8, r2, r11)
            r17 = 0
            r18 = 0
            r20 = 6
            r21 = 0
            w.h0 r9 = p257w.C37903i.m41593a(r16, r17, r18, r20, r21)
            r2 = 469472752(0x1bfb95f0, float:4.1621362E-22)
            r0.mo51557H(r2)
            r2 = 0
            java.lang.Float r7 = java.lang.Float.valueOf(r2)
            java.lang.Float r8 = java.lang.Float.valueOf(r6)
            w.k1<java.lang.Float, w.l> r10 = p257w.C111656m1.f334256a
            r16 = 33208(0x81b8, float:4.6534E-41)
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r0
            r17 = r11
            r11 = r16
            j0.k2 r5 = p257w.C111648j0.m152175a(r5, r6, r7, r8, r9, r10, r11)
            r0.mo51565P()
            float r6 = r3.f333820d
            v0.j r6 = p435a0.C103214y0.m136594j(r1, r6)
            r7 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo51557H(r7)
            int r7 = p721v0.C111294a.f333218a
            v0.a r7 = p721v0.C111294a.C111295a.f333219a
            o1.y r7 = p435a0.C103141f.m136472c(r7, r14, r0, r14)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo51557H(r8)
            j0.f1<i2.d> r8 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r8 = r0.mo51598m(r8)
            i2.d r8 = (p560i2.C108322d) r8
            j0.f1<i2.o> r9 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r9 = r0.mo51598m(r9)
            i2.o r9 = (p560i2.C33183o) r9
            j0.f1<androidx.compose.ui.platform.i2> r10 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r10 = r0.mo51598m(r10)
            androidx.compose.ui.platform.i2 r10 = (androidx.compose.p002ui.platform.C103633i2) r10
            q1.a$a r11 = p658q1.C110269a.f329831D0
            r11.getClass()
            fy3.a<q1.a> r12 = p658q1.C110269a.C110270a.f329833b
            fy3.q r6 = p631o1.C109863q.m149330a(r6)
            j0.d r2 = r0.mo51543A()
            boolean r2 = r2 instanceof p175j0.C24665d
            if (r2 == 0) goto L_0x022b
            r0.mo51615v()
            boolean r2 = r0.mo51621y()
            if (r2 == 0) goto L_0x016d
            r0.mo51612t(r12)
            goto L_0x0170
        L_0x016d:
            r0.mo51579c()
        L_0x0170:
            r0.mo51561L()
            r11.getClass()
            fy3.p<q1.a, o1.y, rx3.b0> r2 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r0, r7, r2)
            r11.getClass()
            fy3.p<q1.a, i2.d, rx3.b0> r2 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r0, r8, r2)
            r11.getClass()
            fy3.p<q1.a, i2.o, rx3.b0> r2 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r0, r9, r2)
            r11.getClass()
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r2 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r0, r10, r2)
            r0.mo51590i()
            j0.x1 r2 = new j0.x1
            r2.<init>(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            q0.b r6 = (p415q0.C35747b) r6
            r6.invoke(r2, r0, r7)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo51557H(r2)
            r2 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r0.mo51557H(r2)
            int r2 = p721v0.C65503j.f188489K0
            v0.j$a r16 = p721v0.C65503j.C65504a.f188490d
            w.i0$a r5 = (p257w.C65915i0.C65920a) r5
            java.lang.Object r2 = r5.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r25 = r2.floatValue()
            r2 = 0
            int r2 = (r25 > r2 ? 1 : (r25 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x01c7
            r12 = 1
            goto L_0x01c8
        L_0x01c7:
            r12 = 0
        L_0x01c8:
            if (r12 != 0) goto L_0x01f3
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r36 = 65279(0xfeff, float:9.1475E-41)
            r37 = 0
            v0.j r2 = p436a1.C103221a0.m136603b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r34, r36, r37)
            r7 = r2
            goto L_0x01f5
        L_0x01f3:
            r7 = r16
        L_0x01f5:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2 = 56
            r14 = 120(0x78, float:1.68E-43)
            java.lang.String r6 = "loading"
            r5 = r13
            r12 = r0
            r13 = r2
            p267x.C111897d1.m152617a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
            r0.mo51565P()
            r2 = r3
            r3 = r15
        L_0x0216:
            j0.v1 r6 = r0.mo51596l()
            if (r6 != 0) goto L_0x021d
            goto L_0x022a
        L_0x021d:
            va0.b$a r7 = new va0.b$a
            r0 = r7
            r4 = r42
            r5 = r43
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo51650a(r7)
        L_0x022a:
            return
        L_0x022b:
            p175j0.C108501g.m147000a()
            throw r17
        */
        throw new UnsupportedOperationException("Method not decompiled: va0.C111497b.m152004a(v0.j, va0.f, va0.e, j0.h, int, int):void");
    }
}
