package p257w;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60655g0;

/* renamed from: w.g1 */
public final class C111641g1 {

    /* renamed from: w.g1$a */
    public static final class C111642a extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C111629c1<S> f334226d;

        /* renamed from: e */
        public final /* synthetic */ C111629c1<S>.a<T, V> f334227e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111642a(C111629c1<S> c1Var, C111629c1<S>.a<T, V> aVar) {
            super(1);
            this.f334226d = c1Var;
            this.f334227e = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            return new C111639f1(this.f334226d, this.f334227e);
        }
    }

    /* renamed from: w.g1$b */
    public static final class C111643b extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C111629c1<S> f334228d;

        /* renamed from: e */
        public final /* synthetic */ C111629c1<S>.d<T, V> f334229e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111643b(C111629c1<S> c1Var, C111629c1<S>.d<T, V> dVar) {
            super(1);
            this.f334228d = c1Var;
            this.f334229e = dVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            C111629c1<S> c1Var = this.f334228d;
            C111629c1<S>.d<T, V> dVar = this.f334229e;
            c1Var.getClass();
            C87412m.m108594g(dVar, "animation");
            c1Var.f334184h.add(dVar);
            return new C111645h1(this.f334228d, this.f334229e);
        }
    }

    /* renamed from: w.g1$c */
    public static final class C111644c extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C111629c1<T> f334230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111644c(C111629c1<T> c1Var) {
            super(1);
            this.f334230d = c1Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            return new C111646i1(this.f334230d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r7 == p175j0.C108504h.C60656a.f172772a) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T, V extends p257w.C37919o> p257w.C111629c1<S>.a<T, V> m152172a(p257w.C111629c1<S> r2, p257w.C37906k1<T, V> r3, java.lang.String r4, p175j0.C108504h r5, int r6, int r7) {
        /*
            java.lang.String r6 = "<this>"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r6 = "typeConverter"
            gy3.C87412m.m108594g(r3, r6)
            r6 = -1714122528(0xffffffff99d490e0, float:-2.19788E-23)
            r5.mo51557H(r6)
            r6 = r7 & 2
            if (r6 == 0) goto L_0x0016
            java.lang.String r4 = "DeferredAnimation"
        L_0x0016:
            r6 = 1157296644(0x44faf204, float:2007.563)
            r5.mo51557H(r6)
            boolean r6 = r5.mo51619x(r2)
            java.lang.Object r7 = r5.mo51606q()
            if (r6 != 0) goto L_0x002c
            int r6 = p175j0.C108504h.f324828a
            java.lang.Object r6 = p175j0.C108504h.C60656a.f172772a
            if (r7 != r6) goto L_0x0034
        L_0x002c:
            w.c1$a r7 = new w.c1$a
            r7.<init>(r2, r3, r4)
            r5.mo51553F(r7)
        L_0x0034:
            r5.mo51565P()
            w.c1$a r7 = (p257w.C111629c1.C111630a) r7
            w.g1$a r3 = new w.g1$a
            r3.<init>(r2, r7)
            r4 = 8
            p175j0.C60655g0.m70930a(r7, r3, r5, r4)
            boolean r2 = r2.mo163301e()
            if (r2 == 0) goto L_0x007c
            w.c1<S>$a<T, V>$a<T, V> r2 = r7.f334191c
            if (r2 == 0) goto L_0x007c
            w.c1<S> r3 = r7.f334192d
            w.c1<S>$d<T, V> r4 = r2.f334193d
            fy3.l<? super S, ? extends T> r6 = r2.f334195f
            w.c1$b r0 = r3.mo163299c()
            java.lang.Object r0 = r0.mo163308b()
            java.lang.Object r6 = r6.invoke(r0)
            fy3.l<? super S, ? extends T> r0 = r2.f334195f
            w.c1$b r1 = r3.mo163299c()
            java.lang.Object r1 = r1.mo163309c()
            java.lang.Object r0 = r0.invoke(r1)
            fy3.l<? super w.c1$b<S>, ? extends w.b0<T>> r2 = r2.f334194e
            w.c1$b r3 = r3.mo163299c()
            java.lang.Object r2 = r2.invoke(r3)
            w.b0 r2 = (p257w.C37892b0) r2
            r4.mo163313g(r6, r0, r2)
        L_0x007c:
            r5.mo51565P()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p257w.C111641g1.m152172a(w.c1, w.k1, java.lang.String, j0.h, int, int):w.c1$a");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: w.c1$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: w.c1$d} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r0 == p175j0.C108504h.C60656a.f172772a) goto L_0x0030;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T, V extends p257w.C37919o> p175j0.C60667k2<T> m152173b(p257w.C111629c1<S> r7, T r8, T r9, p257w.C37892b0<T> r10, p257w.C37906k1<T, V> r11, java.lang.String r12, p175j0.C108504h r13, int r14) {
        /*
            java.lang.String r14 = "<this>"
            gy3.C87412m.m108594g(r7, r14)
            java.lang.String r14 = "animationSpec"
            gy3.C87412m.m108594g(r10, r14)
            java.lang.String r14 = "typeConverter"
            gy3.C87412m.m108594g(r11, r14)
            java.lang.String r14 = "label"
            gy3.C87412m.m108594g(r12, r14)
            r14 = -304821198(0xffffffffedd4cc32, float:-8.23221E27)
            r13.mo51557H(r14)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r13.mo51557H(r14)
            boolean r14 = r13.mo51619x(r7)
            java.lang.Object r0 = r13.mo51606q()
            if (r14 != 0) goto L_0x0030
            int r14 = p175j0.C108504h.f324828a
            java.lang.Object r14 = p175j0.C108504h.C60656a.f172772a
            if (r0 != r14) goto L_0x0041
        L_0x0030:
            w.c1$d r0 = new w.c1$d
            w.o r4 = p257w.C111651k.m152179c(r11, r9)
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r13.mo51553F(r0)
        L_0x0041:
            r13.mo51565P()
            w.c1$d r0 = (p257w.C111629c1.C111634d) r0
            boolean r11 = r7.mo163301e()
            if (r11 == 0) goto L_0x0050
            r0.mo163313g(r8, r9, r10)
            goto L_0x0053
        L_0x0050:
            r0.mo163314h(r9, r10)
        L_0x0053:
            w.g1$b r8 = new w.g1$b
            r8.<init>(r7, r0)
            r7 = 0
            p175j0.C60655g0.m70930a(r0, r8, r13, r7)
            r13.mo51565P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p257w.C111641g1.m152173b(w.c1, java.lang.Object, java.lang.Object, w.b0, w.k1, java.lang.String, j0.h, int):j0.k2");
    }

    /* renamed from: c */
    public static final <T> C111629c1<T> m152174c(T t, String str, C108504h hVar, int i, int i2) {
        hVar.mo51557H(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i3 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = new C111629c1(new C111655m0(t), str);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C111629c1<T> c1Var = (C111629c1) q;
        c1Var.mo163297a(t, hVar, (i & 8) | 48 | (i & 14));
        C60655g0.m70930a(c1Var, new C111644c(c1Var), hVar, 6);
        hVar.mo51565P();
        return c1Var;
    }
}
