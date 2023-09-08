package p543h0;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import p415q0.C110261c;
import rx3.C13598b0;

/* renamed from: h0.v */
public final class C107979v {

    /* renamed from: h0.v$a */
    public static final class C107980a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107957i0 f323354d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f323355e;

        /* renamed from: f */
        public final /* synthetic */ int f323356f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107980a(C107957i0 i0Var, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f323354d = i0Var;
            this.f323355e = pVar;
            this.f323356f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C107944f0.m146240a(this.f323354d.f323305i, C110261c.m149878b(hVar, 181426554, true, new C59745u(this.f323355e, this.f323356f)), hVar, 48);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h0.v$b */
    public static final class C107981b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107951g f323357d;

        /* renamed from: e */
        public final /* synthetic */ C107957i0 f323358e;

        /* renamed from: f */
        public final /* synthetic */ C107984y f323359f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f323360g;

        /* renamed from: h */
        public final /* synthetic */ int f323361h;

        /* renamed from: i */
        public final /* synthetic */ int f323362i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107981b(C107951g gVar, C107957i0 i0Var, C107984y yVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i, int i2) {
            super(2);
            this.f323357d = gVar;
            this.f323358e = i0Var;
            this.f323359f = yVar;
            this.f323360g = pVar;
            this.f323361h = i;
            this.f323362i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107979v.m146264a(this.f323357d, this.f323358e, this.f323359f, this.f323360g, (C108504h) obj, this.f323361h | 1, this.f323362i);
            return C13598b0.f38549a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: g0.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: g0.j0} */
    /* JADX WARNING: type inference failed for: r11v34 */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ae, code lost:
        if ((r46 & 4) != 0) goto L_0x00d9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0331  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m146264a(p543h0.C107951g r40, p543h0.C107957i0 r41, p543h0.C107984y r42, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r43, p175j0.C108504h r44, int r45, int r46) {
        /*
            r4 = r43
            r5 = r45
            java.lang.String r0 = "content"
            gy3.C87412m.m108594g(r4, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -891417079(0xffffffffcade0e09, float:-7276292.5)
            r1 = r44
            j0.h r0 = r1.mo51623z(r0)
            r1 = r5 & 14
            if (r1 != 0) goto L_0x002b
            r1 = r46 & 1
            if (r1 != 0) goto L_0x0026
            r1 = r40
            boolean r6 = r0.mo51619x(r1)
            if (r6 == 0) goto L_0x0028
            r6 = 4
            goto L_0x0029
        L_0x0026:
            r1 = r40
        L_0x0028:
            r6 = 2
        L_0x0029:
            r6 = r6 | r5
            goto L_0x002e
        L_0x002b:
            r1 = r40
            r6 = r5
        L_0x002e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r46 & 2
            if (r7 != 0) goto L_0x0041
            r7 = r41
            boolean r8 = r0.mo51619x(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0041:
            r7 = r41
        L_0x0043:
            r8 = 16
        L_0x0045:
            r6 = r6 | r8
            goto L_0x0049
        L_0x0047:
            r7 = r41
        L_0x0049:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r46 & 4
            if (r8 != 0) goto L_0x005c
            r8 = r42
            boolean r9 = r0.mo51619x(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005c:
            r8 = r42
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r9
            goto L_0x0064
        L_0x0062:
            r8 = r42
        L_0x0064:
            r9 = r46 & 8
            if (r9 == 0) goto L_0x006b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007b
            boolean r9 = r0.mo51619x(r4)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r6 = r6 | r9
        L_0x007b:
            r9 = r6 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008f
            boolean r9 = r0.mo51575a()
            if (r9 != 0) goto L_0x0088
            goto L_0x008f
        L_0x0088:
            r0.mo51581d()
            r2 = r7
            r3 = r8
            goto L_0x0449
        L_0x008f:
            r0.mo51559J()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x00b1
            boolean r9 = r0.mo51582e()
            if (r9 == 0) goto L_0x009d
            goto L_0x00b1
        L_0x009d:
            r0.mo51581d()
            r9 = r46 & 1
            if (r9 == 0) goto L_0x00a6
            r6 = r6 & -15
        L_0x00a6:
            r9 = r46 & 2
            if (r9 == 0) goto L_0x00ac
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ac:
            r9 = r46 & 4
            if (r9 == 0) goto L_0x00db
            goto L_0x00d9
        L_0x00b1:
            r9 = r46 & 1
            if (r9 == 0) goto L_0x00bf
            j0.f1<h0.g> r1 = p543h0.C107953h.f323293a
            java.lang.Object r1 = r0.mo51598m(r1)
            h0.g r1 = (p543h0.C107951g) r1
            r6 = r6 & -15
        L_0x00bf:
            r9 = r46 & 2
            if (r9 == 0) goto L_0x00cd
            j0.f1<h0.i0> r7 = p543h0.C107960j0.f323312a
            java.lang.Object r7 = r0.mo51598m(r7)
            h0.i0 r7 = (p543h0.C107957i0) r7
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00cd:
            r9 = r46 & 4
            if (r9 == 0) goto L_0x00db
            j0.f1<h0.y> r8 = p543h0.C107985z.f323370a
            java.lang.Object r8 = r0.mo51598m(r8)
            h0.y r8 = (p543h0.C107984y) r8
        L_0x00d9:
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00db:
            r39 = r8
            r8 = r7
            r7 = r39
            r0.mo51555G()
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r9)
            java.lang.Object r9 = r0.mo51606q()
            java.lang.Object r14 = p175j0.C108504h.C60656a.f172772a
            if (r9 != r14) goto L_0x011b
            r10 = 0
            r12 = 0
            r15 = 0
            r9 = r14
            r14 = r15
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r35 = 8191(0x1fff, float:1.1478E-41)
            r36 = 0
            r2 = r9
            r9 = r1
            h0.g r9 = p543h0.C107951g.m146243a(r9, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r35, r36)
            r0.mo51553F(r9)
            goto L_0x011c
        L_0x011b:
            r2 = r14
        L_0x011c:
            r0.mo51565P()
            r13 = r9
            h0.g r13 = (p543h0.C107951g) r13
            j0.f1<h0.g> r9 = p543h0.C107953h.f323293a
            java.lang.String r9 = "<this>"
            gy3.C87412m.m108594g(r13, r9)
            java.lang.String r9 = "other"
            gy3.C87412m.m108594g(r1, r9)
            long r9 = r1.mo158359f()
            j0.y0 r11 = r13.f323279a
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            j0.y0 r9 = r1.f323280b
            j0.d2 r9 = (p175j0.C108494d2) r9
            java.lang.Object r9 = r9.getValue()
            a1.w r9 = (p436a1.C103272w) r9
            long r9 = r9.f304517a
            j0.y0 r11 = r13.f323280b
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            j0.y0 r9 = r1.f323281c
            j0.d2 r9 = (p175j0.C108494d2) r9
            java.lang.Object r9 = r9.getValue()
            a1.w r9 = (p436a1.C103272w) r9
            long r9 = r9.f304517a
            j0.y0 r11 = r13.f323281c
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            j0.y0 r9 = r1.f323282d
            j0.d2 r9 = (p175j0.C108494d2) r9
            java.lang.Object r9 = r9.getValue()
            a1.w r9 = (p436a1.C103272w) r9
            long r9 = r9.f304517a
            j0.y0 r11 = r13.f323282d
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            long r9 = r1.mo158355b()
            j0.y0 r11 = r13.f323283e
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            long r9 = r1.mo158360g()
            j0.y0 r11 = r13.f323284f
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            j0.y0 r9 = r1.f323285g
            j0.d2 r9 = (p175j0.C108494d2) r9
            java.lang.Object r9 = r9.getValue()
            a1.w r9 = (p436a1.C103272w) r9
            long r9 = r9.f304517a
            j0.y0 r11 = r13.f323285g
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            long r9 = r1.mo158356c()
            j0.y0 r11 = r13.f323286h
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            long r9 = r1.mo158357d()
            j0.y0 r11 = r13.f323287i
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            j0.y0 r9 = r1.f323288j
            j0.d2 r9 = (p175j0.C108494d2) r9
            java.lang.Object r9 = r9.getValue()
            a1.w r9 = (p436a1.C103272w) r9
            long r9 = r9.f304517a
            j0.y0 r11 = r13.f323288j
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            long r9 = r1.mo158358e()
            j0.y0 r11 = r13.f323289k
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            j0.y0 r9 = r1.f323290l
            j0.d2 r9 = (p175j0.C108494d2) r9
            java.lang.Object r9 = r9.getValue()
            a1.w r9 = (p436a1.C103272w) r9
            long r9 = r9.f304517a
            j0.y0 r11 = r13.f323290l
            a1.w r12 = new a1.w
            r12.<init>(r9)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r12)
            boolean r9 = r1.mo158361h()
            j0.y0 r10 = r13.f323291m
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            j0.d2 r10 = (p175j0.C108494d2) r10
            r10.setValue(r9)
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 7
            r37 = r6
            r6 = r9
            r9 = r7
            r7 = r10
            r38 = r8
            r10 = r9
            r8 = r11
            r12 = r10
            r10 = r0
            r11 = r14
            r14 = r12
            r12 = r15
            x.e1 r6 = p558i0.C108308p.m146678a(r6, r7, r8, r10, r11, r12)
            r7 = -721696685(0xffffffffd4fbc853, float:-8.6511814E12)
            r0.mo51557H(r7)
            long r7 = r13.mo158359f()
            long r9 = r13.mo158355b()
            r11 = 35572910(0x21eccae, float:1.1666747E-37)
            r0.mo51557H(r11)
            long r11 = p543h0.C107953h.m146251a(r13, r9)
            long r15 = p436a1.C103272w.f304515g
            r23 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0267
            r15 = 1
            goto L_0x0268
        L_0x0267:
            r15 = 0
        L_0x0268:
            if (r15 == 0) goto L_0x026b
            goto L_0x0275
        L_0x026b:
            j0.f1<a1.w> r11 = p543h0.C107958j.f323310a
            java.lang.Object r11 = r0.mo51598m(r11)
            a1.w r11 = (p436a1.C103272w) r11
            long r11 = r11.f304517a
        L_0x0275:
            r15 = r11
            r0.mo51565P()
            r11 = 1999054879(0x7727281f, float:3.390341E33)
            r0.mo51557H(r11)
            r11 = -1528360391(0xffffffffa4e71239, float:-1.0021115E-16)
            r0.mo51557H(r11)
            j0.f1<a1.w> r12 = p543h0.C107958j.f323310a
            java.lang.Object r12 = r0.mo51598m(r12)
            a1.w r12 = (p436a1.C103272w) r12
            long r3 = r12.f304517a
            j0.f1<h0.g> r12 = p543h0.C107953h.f323293a
            java.lang.Object r12 = r0.mo51598m(r12)
            h0.g r12 = (p543h0.C107951g) r12
            boolean r12 = r12.mo158361h()
            r25 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r12 == 0) goto L_0x02a9
            float r3 = p436a1.C103276y.m136795f(r3)
            double r3 = (double) r3
            int r12 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r12 <= 0) goto L_0x02b9
            goto L_0x02b2
        L_0x02a9:
            float r3 = p436a1.C103276y.m136795f(r3)
            double r3 = (double) r3
            int r12 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r12 >= 0) goto L_0x02b9
        L_0x02b2:
            r3 = 1060991140(0x3f3d70a4, float:0.74)
            r17 = 1060991140(0x3f3d70a4, float:0.74)
            goto L_0x02bf
        L_0x02b9:
            r3 = 1058642330(0x3f19999a, float:0.6)
            r17 = 1058642330(0x3f19999a, float:0.6)
        L_0x02bf:
            r0.mo51565P()
            r0.mo51565P()
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            long r3 = p436a1.C103272w.m136780b(r15, r17, r18, r19, r20, r21, r22)
            a1.w r12 = new a1.w
            r12.<init>(r7)
            a1.w r15 = new a1.w
            r15.<init>(r9)
            a1.w r11 = new a1.w
            r11.<init>(r3)
            r42 = r1
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.mo51557H(r1)
            boolean r1 = r0.mo51619x(r12)
            boolean r12 = r0.mo51619x(r15)
            r1 = r1 | r12
            boolean r11 = r0.mo51619x(r11)
            r1 = r1 | r11
            java.lang.Object r11 = r0.mo51606q()
            r15 = 7
            if (r1 != 0) goto L_0x0307
            if (r11 != r2) goto L_0x0302
            goto L_0x0307
        L_0x0302:
            r12 = 7
            r27 = 1065353216(0x3f800000, float:1.0)
            goto L_0x039e
        L_0x0307:
            g0.j0 r11 = new g0.j0
            long r1 = r13.mo158359f()
            r17 = 1053609165(0x3ecccccd, float:0.4)
            r12 = 7
            r15 = r7
            r18 = r3
            r20 = r9
            float r22 = p543h0.C107978t.m146263a(r15, r17, r18, r20)
            r17 = 1045220557(0x3e4ccccd, float:0.2)
            float r15 = p543h0.C107978t.m146263a(r15, r17, r18, r20)
            r28 = 1083179008(0x40900000, float:4.5)
            r16 = 1045220557(0x3e4ccccd, float:0.2)
            r17 = 1053609165(0x3ecccccd, float:0.4)
            int r18 = (r22 > r28 ? 1 : (r22 == r28 ? 0 : -1))
            if (r18 < 0) goto L_0x0331
            r16 = 1053609165(0x3ecccccd, float:0.4)
            goto L_0x0335
        L_0x0331:
            int r15 = (r15 > r28 ? 1 : (r15 == r28 ? 0 : -1))
            if (r15 >= 0) goto L_0x033a
        L_0x0335:
            r17 = r16
            r27 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0383
        L_0x033a:
            r15 = 0
            r22 = 1045220557(0x3e4ccccd, float:0.2)
            r29 = 1053609165(0x3ecccccd, float:0.4)
            r30 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0344:
            if (r15 >= r12) goto L_0x037f
            r31 = r15
            r15 = r7
            r17 = r29
            r18 = r3
            r20 = r9
            float r15 = p543h0.C107978t.m146263a(r15, r17, r18, r20)
            float r15 = r15 / r28
            r27 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 - r27
            r16 = 0
            int r17 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
            if (r17 > 0) goto L_0x0369
            r17 = 1008981770(0x3c23d70a, float:0.01)
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 > 0) goto L_0x0369
            r17 = 1
            goto L_0x036b
        L_0x0369:
            r17 = 0
        L_0x036b:
            if (r17 != 0) goto L_0x0381
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 >= 0) goto L_0x0374
            r30 = r29
            goto L_0x0376
        L_0x0374:
            r22 = r29
        L_0x0376:
            float r15 = r30 + r22
            r16 = 1073741824(0x40000000, float:2.0)
            float r29 = r15 / r16
            int r15 = r31 + 1
            goto L_0x0344
        L_0x037f:
            r27 = 1065353216(0x3f800000, float:1.0)
        L_0x0381:
            r17 = r29
        L_0x0383:
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            r15 = r7
            long r19 = p436a1.C103272w.m136780b(r15, r17, r18, r19, r20, r21, r22)
            r21 = 0
            r16 = r11
            r17 = r1
            r16.<init>(r17, r19, r21)
            r0.mo51553F(r11)
        L_0x039e:
            r0.mo51565P()
            g0.j0 r11 = (p155g0.C107624j0) r11
            r0.mo51565P()
            j0.g1[] r1 = new p175j0.C108502g1[r12]
            j0.f1<h0.g> r2 = p543h0.C107953h.f323293a
            j0.g1 r3 = r2.mo159370b(r13)
            r1[r23] = r3
            j0.f1<java.lang.Float> r3 = p543h0.C107956i.f323296a
            r4 = 629162431(0x258041bf, float:2.2249012E-16)
            r0.mo51557H(r4)
            r4 = -1528360391(0xffffffffa4e71239, float:-1.0021115E-16)
            r0.mo51557H(r4)
            j0.f1<a1.w> r4 = p543h0.C107958j.f323310a
            java.lang.Object r4 = r0.mo51598m(r4)
            a1.w r4 = (p436a1.C103272w) r4
            long r7 = r4.f304517a
            java.lang.Object r2 = r0.mo51598m(r2)
            h0.g r2 = (p543h0.C107951g) r2
            boolean r2 = r2.mo158361h()
            if (r2 == 0) goto L_0x03de
            float r2 = p436a1.C103276y.m136795f(r7)
            double r7 = (double) r2
            int r2 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x03ea
            goto L_0x03e7
        L_0x03de:
            float r2 = p436a1.C103276y.m136795f(r7)
            double r7 = (double) r2
            int r2 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r2 >= 0) goto L_0x03ea
        L_0x03e7:
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03ed
        L_0x03ea:
            r12 = 1063172178(0x3f5eb852, float:0.87)
        L_0x03ed:
            r0.mo51565P()
            r0.mo51565P()
            java.lang.Float r2 = java.lang.Float.valueOf(r12)
            j0.g1 r2 = r3.mo159370b(r2)
            r3 = 1
            r1[r3] = r2
            j0.f1<x.e1> r2 = p267x.C111912g1.f335027a
            j0.g1 r2 = r2.mo159370b(r6)
            r3 = 2
            r1[r3] = r2
            r2 = 3
            j0.f1<i0.q> r3 = p558i0.C108310r.f324313a
            h0.s r4 = p543h0.C107977s.f323353a
            j0.g1 r3 = r3.mo159370b(r4)
            r1[r2] = r3
            j0.f1<h0.y> r2 = p543h0.C107985z.f323370a
            j0.g1 r2 = r2.mo159370b(r14)
            r3 = 4
            r1[r3] = r2
            r2 = 5
            j0.f1<g0.j0> r3 = p155g0.C107626k0.f322019a
            j0.g1 r3 = r3.mo159370b(r11)
            r1[r2] = r3
            j0.f1<h0.i0> r2 = p543h0.C107960j0.f323312a
            r7 = r38
            j0.g1 r2 = r2.mo159370b(r7)
            r3 = 6
            r1[r3] = r2
            r2 = -1740102967(0xffffffff984822c9, float:-2.5866956E-24)
            h0.v$a r3 = new h0.v$a
            r4 = r43
            r6 = r37
            r3.<init>(r7, r4, r6)
            r6 = 1
            q0.a r2 = p415q0.C110261c.m149878b(r0, r2, r6, r3)
            r3 = 56
            p175j0.C108513w.m147056a(r1, r2, r0, r3)
            r1 = r42
            r2 = r7
            r3 = r14
        L_0x0449:
            j0.v1 r7 = r0.mo51596l()
            if (r7 != 0) goto L_0x0450
            goto L_0x045f
        L_0x0450:
            h0.v$b r8 = new h0.v$b
            r0 = r8
            r4 = r43
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo51650a(r8)
        L_0x045f:
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p543h0.C107979v.m146264a(h0.g, h0.i0, h0.y, fy3.p, j0.h, int, int):void");
    }
}
