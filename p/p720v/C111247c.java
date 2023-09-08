package p720v;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import d14.C58012a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87413o;
import kotlin.ResultKt;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60690y0;
import p257w.C111629c1;
import p721v0.C65503j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: v.c */
public final class C111247c {

    @C91590f(mo125468c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", mo125469f = "AnimatedVisibility.kt", mo125470l = {746}, mo125471m = "invokeSuspend")
    /* renamed from: v.c$a */
    public static final class C65494a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f188465d;

        /* renamed from: e */
        public final /* synthetic */ C111629c1<C111277n> f188466e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<Boolean> f188467f;

        /* renamed from: v.c$a$a */
        public static final class C65495a extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C111629c1<C111277n> f188468d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65495a(C111629c1<C111277n> c1Var) {
                super(0);
                this.f188468d = c1Var;
            }

            public Object invoke() {
                C111277n b = this.f188468d.mo163298b();
                C111277n nVar = C111277n.Visible;
                return Boolean.valueOf(b == nVar || this.f188468d.mo163300d() == nVar);
            }
        }

        /* renamed from: v.c$a$b */
        public static final class C65496b implements C45253g<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C60690y0<Boolean> f188469d;

            public C65496b(C60690y0<Boolean> y0Var) {
                this.f188469d = y0Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                this.f188469d.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65494a(C111629c1<C111277n> c1Var, C60690y0<Boolean> y0Var, C15601d<? super C65494a> dVar) {
            super(2, dVar);
            this.f188466e = c1Var;
            this.f188467f = y0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65494a(this.f188466e, this.f188467f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65494a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f188465d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f f = C108500f2.m146999f(new C65495a(this.f188466e));
                C65496b bVar = new C65496b(this.f188467f);
                this.f188465d = 1;
                if (((C58012a) f).mo31880a(bVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v.c$b */
    public static final class C65497b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111629c1<T> f188470d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<T, Boolean> f188471e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f188472f;

        /* renamed from: g */
        public final /* synthetic */ C111292y f188473g;

        /* renamed from: h */
        public final /* synthetic */ C111239a0 f188474h;

        /* renamed from: i */
        public final /* synthetic */ C32228q<C65500d, C108504h, Integer, C13598b0> f188475i;

        /* renamed from: j */
        public final /* synthetic */ int f188476j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65497b(C111629c1<T> c1Var, C32226l<? super T, Boolean> lVar, C65503j jVar, C111292y yVar, C111239a0 a0Var, C32228q<? super C65500d, ? super C108504h, ? super Integer, C13598b0> qVar, int i) {
            super(2);
            this.f188470d = c1Var;
            this.f188471e = lVar;
            this.f188472f = jVar;
            this.f188473g = yVar;
            this.f188474h = a0Var;
            this.f188475i = qVar;
            this.f188476j = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C111247c.m151757a(this.f188470d, this.f188471e, this.f188472f, this.f188473g, this.f188474h, this.f188475i, (C108504h) obj, this.f188476j | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v.c$c */
    public static final class C65498c extends C87413o implements C32226l<Boolean, Boolean> {

        /* renamed from: d */
        public static final C65498c f188477d = new C65498c();

        public C65498c() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: v.c$d */
    public static final class C65499d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f188478d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f188479e;

        /* renamed from: f */
        public final /* synthetic */ C111292y f188480f;

        /* renamed from: g */
        public final /* synthetic */ C111239a0 f188481g;

        /* renamed from: h */
        public final /* synthetic */ String f188482h;

        /* renamed from: i */
        public final /* synthetic */ C32228q<C65500d, C108504h, Integer, C13598b0> f188483i;

        /* renamed from: j */
        public final /* synthetic */ int f188484j;

        /* renamed from: n */
        public final /* synthetic */ int f188485n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65499d(boolean z, C65503j jVar, C111292y yVar, C111239a0 a0Var, String str, C32228q<? super C65500d, ? super C108504h, ? super Integer, C13598b0> qVar, int i, int i2) {
            super(2);
            this.f188478d = z;
            this.f188479e = jVar;
            this.f188480f = yVar;
            this.f188481g = a0Var;
            this.f188482h = str;
            this.f188483i = qVar;
            this.f188484j = i;
            this.f188485n = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C111247c.m151758b(this.f188478d, this.f188479e, this.f188480f, this.f188481g, this.f188482h, this.f188483i, (C108504h) obj, this.f188484j | 1, this.f188485n);
            return C13598b0.f38549a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: w.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: v.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m151757a(p257w.C111629c1<T> r31, fy3.C32226l<? super T, java.lang.Boolean> r32, p721v0.C65503j r33, p720v.C111292y r34, p720v.C111239a0 r35, fy3.C32228q<? super p720v.C65500d, ? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r36, p175j0.C108504h r37, int r38) {
        /*
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r38
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = 808253933(0x302cf9ed, float:6.29284E-10)
            r8 = r37
            j0.h r0 = r8.mo51623z(r0)
            r8 = r7 & 14
            r15 = 2
            if (r8 != 0) goto L_0x0029
            boolean r8 = r0.mo51619x(r1)
            if (r8 == 0) goto L_0x0026
            r8 = 4
            goto L_0x0027
        L_0x0026:
            r8 = 2
        L_0x0027:
            r8 = r8 | r7
            goto L_0x002a
        L_0x0029:
            r8 = r7
        L_0x002a:
            r9 = r7 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x003a
            boolean r9 = r0.mo51619x(r2)
            if (r9 == 0) goto L_0x0037
            r9 = 32
            goto L_0x0039
        L_0x0037:
            r9 = 16
        L_0x0039:
            r8 = r8 | r9
        L_0x003a:
            r9 = r7 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x004a
            boolean r9 = r0.mo51619x(r3)
            if (r9 == 0) goto L_0x0047
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r8 = r8 | r9
        L_0x004a:
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x005a
            boolean r9 = r0.mo51619x(r4)
            if (r9 == 0) goto L_0x0057
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0059
        L_0x0057:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0059:
            r8 = r8 | r9
        L_0x005a:
            r16 = 57344(0xe000, float:8.0356E-41)
            r9 = r7 & r16
            if (r9 != 0) goto L_0x006d
            boolean r9 = r0.mo51619x(r5)
            if (r9 == 0) goto L_0x006a
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006c
        L_0x006a:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x006c:
            r8 = r8 | r9
        L_0x006d:
            r17 = 458752(0x70000, float:6.42848E-40)
            r9 = r7 & r17
            if (r9 != 0) goto L_0x007f
            boolean r9 = r0.mo51619x(r6)
            if (r9 == 0) goto L_0x007c
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007e
        L_0x007c:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x007e:
            r8 = r8 | r9
        L_0x007f:
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r8
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r10) goto L_0x0094
            boolean r9 = r0.mo51575a()
            if (r9 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            r0.mo51581d()
            goto L_0x06d7
        L_0x0094:
            r9 = r8 & 14
            r10 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r10)
            boolean r11 = r0.mo51619x(r1)
            java.lang.Object r12 = r0.mo51606q()
            r14 = 0
            if (r11 != 0) goto L_0x00ab
            java.lang.Object r11 = p175j0.C108504h.C60656a.f172772a
            if (r12 != r11) goto L_0x00ba
        L_0x00ab:
            java.lang.Object r11 = r31.mo163298b()
            java.lang.Object r11 = r2.invoke(r11)
            j0.y0 r12 = p175j0.C108500f2.m146996c(r11, r14, r15, r14)
            r0.mo51553F(r12)
        L_0x00ba:
            r0.mo51565P()
            j0.y0 r12 = (p175j0.C60690y0) r12
            java.lang.Object r11 = r31.mo163300d()
            java.lang.Object r11 = r2.invoke(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x00e1
            java.lang.Object r11 = r12.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x00e1
            boolean r11 = r31.mo163301e()
            if (r11 == 0) goto L_0x06d7
        L_0x00e1:
            r11 = r9 | 48
            r13 = 1215497572(0x48730564, float:248853.56)
            r0.mo51557H(r13)
            r13 = r11 & 14
            r0.mo51557H(r10)
            boolean r18 = r0.mo51619x(r1)
            java.lang.Object r15 = r0.mo51606q()
            if (r18 != 0) goto L_0x00fc
            java.lang.Object r14 = p175j0.C108504h.C60656a.f172772a
            if (r15 != r14) goto L_0x0103
        L_0x00fc:
            java.lang.Object r15 = r31.mo163298b()
            r0.mo51553F(r15)
        L_0x0103:
            r0.mo51565P()
            boolean r14 = r31.mo163301e()
            if (r14 == 0) goto L_0x0110
            java.lang.Object r15 = r31.mo163298b()
        L_0x0110:
            int r14 = r11 >> 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            r10 = -1220581778(0xffffffffb73f666e, float:-1.1408336E-5)
            r0.mo51557H(r10)
            r20 = r8 & 112(0x70, float:1.57E-43)
            r9 = r9 | r20
            int r14 = r14 << 6
            r14 = r14 & 896(0x380, float:1.256E-42)
            r9 = r9 | r14
            v.n r14 = m151759c(r1, r2, r15, r0, r9)
            r0.mo51565P()
            java.lang.Object r15 = r31.mo163300d()
            r0.mo51557H(r10)
            v.n r9 = m151759c(r1, r2, r15, r0, r9)
            r0.mo51565P()
            int r10 = r11 << 6
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r13
            r11 = -198307638(0xfffffffff42e10ca, float:-5.5163585E31)
            r0.mo51557H(r11)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r11)
            boolean r11 = r0.mo51619x(r1)
            java.lang.Object r13 = r0.mo51606q()
            if (r11 != 0) goto L_0x0157
            java.lang.Object r11 = p175j0.C108504h.C60656a.f172772a
            if (r13 != r11) goto L_0x017c
        L_0x0157:
            w.c1 r13 = new w.c1
            w.m0 r11 = new w.m0
            r11.<init>(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = r1.f334178b
            r15.append(r2)
            java.lang.String r2 = " > "
            r15.append(r2)
            java.lang.String r2 = "EnterExitTransition"
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r13.<init>(r11, r2)
            r0.mo51553F(r13)
        L_0x017c:
            r0.mo51565P()
            r2 = r13
            w.c1 r2 = (p257w.C111629c1) r2
            w.e1 r11 = new w.e1
            r11.<init>(r1, r2)
            r15 = 0
            p175j0.C60655g0.m70930a(r2, r11, r0, r15)
            boolean r11 = r31.mo163301e()
            if (r11 == 0) goto L_0x0197
            long r10 = r1.f334187k
            r2.mo163303g(r14, r9, r10)
            goto L_0x01ac
        L_0x0197:
            int r11 = r10 >> 3
            r11 = r11 & 8
            int r10 = r10 >> 6
            r10 = r10 & 14
            r10 = r10 | r11
            r2.mo163304h(r9, r0, r10)
            j0.y0 r9 = r2.f334186j
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            j0.d2 r9 = (p175j0.C108494d2) r9
            r9.setValue(r10)
        L_0x01ac:
            r0.mo51565P()
            r0.mo51565P()
            r9 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo51557H(r9)
            boolean r9 = r0.mo51619x(r2)
            boolean r10 = r0.mo51619x(r12)
            r9 = r9 | r10
            java.lang.Object r10 = r0.mo51606q()
            if (r9 != 0) goto L_0x01cb
            java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
            if (r10 != r9) goto L_0x01d4
        L_0x01cb:
            v.c$a r10 = new v.c$a
            r9 = 0
            r10.<init>(r2, r12, r9)
            r0.mo51553F(r10)
        L_0x01d4:
            r0.mo51565P()
            fy3.p r10 = (fy3.C32227p) r10
            p175j0.C60655g0.m70932c(r2, r10, r0, r15)
            int r8 = r8 >> 3
            r9 = r8 & 112(0x70, float:1.57E-43)
            r10 = r8 & 896(0x380, float:1.256E-42)
            r9 = r9 | r10
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r10
            r8 = r8 & r16
            r20 = r9 | r8
            r8 = -1967270694(0xffffffff8abdd4da, float:-1.8280104E-32)
            r0.mo51557H(r8)
            java.lang.Object r8 = r2.mo163298b()
            v.n r9 = p720v.C111277n.Visible
            if (r8 == r9) goto L_0x01fe
            java.lang.Object r8 = r2.mo163300d()
            if (r8 != r9) goto L_0x06d4
        L_0x01fe:
            r8 = r20 & 14
            r9 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r9)
            boolean r9 = r0.mo51619x(r2)
            java.lang.Object r10 = r0.mo51606q()
            if (r9 != 0) goto L_0x0214
            java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
            if (r10 != r9) goto L_0x021c
        L_0x0214:
            v.e r10 = new v.e
            r10.<init>(r2)
            r0.mo51553F(r10)
        L_0x021c:
            r0.mo51565P()
            r14 = r10
            v.e r14 = (p720v.C111254e) r14
            java.lang.String r9 = "Built-in"
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            int r10 = r20 >> 3
            r11 = r10 & 112(0x70, float:1.57E-43)
            r8 = r8 | r11
            r10 = r10 & 896(0x380, float:1.256E-42)
            r8 = r8 | r10
            w.k1<a1.a1, w.m> r10 = p720v.C111278o.f333187a
            java.lang.String r10 = "enter"
            gy3.C87412m.m108594g(r4, r10)
            java.lang.String r10 = "exit"
            gy3.C87412m.m108594g(r5, r10)
            r10 = 914000546(0x367a8aa2, float:3.7333598E-6)
            r0.mo51557H(r10)
            v0.j$a r10 = p721v0.C65503j.C65504a.f188490d
            v.p0 r11 = r34.mo163000a()
            v.k0 r11 = r11.f333197b
            j0.k2 r11 = p175j0.C108500f2.m146998e(r11, r0, r15)
            v.p0 r12 = r35.mo162991a()
            v.k0 r12 = r12.f333197b
            j0.k2 r12 = p175j0.C108500f2.m146998e(r12, r0, r15)
            v.x r13 = new v.x
            r13.<init>(r2, r11, r12, r9)
            r12 = 1
            r11 = 0
            v0.j r10 = p721v0.C111299g.m151787b(r10, r11, r13, r12, r11)
            v.p0 r13 = r34.mo163000a()
            v.g r13 = r13.f333198c
            j0.k2 r13 = p175j0.C108500f2.m146998e(r13, r0, r15)
            v.p0 r11 = r35.mo162991a()
            v.g r11 = r11.f333198c
            j0.k2 r11 = p175j0.C108500f2.m146998e(r11, r0, r15)
            v.v r15 = new v.v
            r15.<init>(r2, r13, r11, r9)
            r9 = 0
            v0.j r15 = p721v0.C111299g.m151787b(r10, r9, r15, r12, r9)
            r13 = r8 & 14
            r8 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r8)
            boolean r8 = r0.mo51619x(r2)
            java.lang.Object r9 = r0.mo51606q()
            if (r8 != 0) goto L_0x0295
            java.lang.Object r8 = p175j0.C108504h.C60656a.f172772a
            if (r9 != r8) goto L_0x02a1
        L_0x0295:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r9 = 0
            r10 = 2
            j0.y0 r8 = p175j0.C108500f2.m146996c(r8, r9, r10, r9)
            r0.mo51553F(r8)
            r9 = r8
        L_0x02a1:
            r0.mo51565P()
            r11 = r9
            j0.y0 r11 = (p175j0.C60690y0) r11
            r8 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r8)
            boolean r8 = r0.mo51619x(r2)
            java.lang.Object r9 = r0.mo51606q()
            if (r8 != 0) goto L_0x02be
            java.lang.Object r8 = p175j0.C108504h.C60656a.f172772a
            if (r9 != r8) goto L_0x02bc
            goto L_0x02be
        L_0x02bc:
            r10 = 0
            goto L_0x02ca
        L_0x02be:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r9 = 2
            r10 = 0
            j0.y0 r8 = p175j0.C108500f2.m146996c(r8, r10, r9, r10)
            r0.mo51553F(r8)
            r9 = r8
        L_0x02ca:
            r0.mo51565P()
            j0.y0 r9 = (p175j0.C60690y0) r9
            java.lang.Object r8 = r2.mo163298b()
            java.lang.Object r10 = r2.mo163300d()
            if (r8 != r10) goto L_0x02e8
            boolean r8 = r2.mo163301e()
            if (r8 != 0) goto L_0x02e8
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r11.setValue(r8)
            r9.setValue(r8)
            goto L_0x030b
        L_0x02e8:
            v.p0 r8 = r34.mo163000a()
            v.d0 r8 = r8.f333196a
            if (r8 != 0) goto L_0x02f8
            v.p0 r8 = r35.mo162991a()
            v.d0 r8 = r8.f333196a
            if (r8 == 0) goto L_0x02fd
        L_0x02f8:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r11.setValue(r8)
        L_0x02fd:
            v.p0 r8 = r34.mo163000a()
            r8.getClass()
            v.p0 r8 = r35.mo162991a()
            r8.getClass()
        L_0x030b:
            r8 = 1657240548(0x62c77be4, float:1.8399147E21)
            r0.mo51557H(r8)
            java.lang.Object r8 = r11.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r22 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0422
            v.s r8 = new v.s
            r8.<init>(r4, r5)
            r0.mo51557H(r12)
            java.lang.Object r12 = r0.mo51606q()
            java.lang.Object r10 = p175j0.C108504h.C60656a.f172772a
            if (r12 != r10) goto L_0x0337
            java.lang.String r12 = "Built-in alpha"
            r0.mo51553F(r12)
        L_0x0337:
            r0.mo51565P()
            r24 = r12
            java.lang.String r24 = (java.lang.String) r24
            r10 = r13 | 384(0x180, float:5.38E-43)
            r12 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r0.mo51557H(r12)
            w.k1<java.lang.Float, w.l> r23 = p257w.C111656m1.f334256a
            r25 = r10 & 14
            int r10 = r10 << 3
            r12 = r10 & 896(0x380, float:1.256E-42)
            r12 = r25 | r12
            r1 = r10 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r12
            r10 = r10 & r16
            r1 = r1 | r10
            r12 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r0.mo51557H(r12)
            java.lang.Object r10 = r2.mo163298b()
            v.n r10 = (p720v.C111277n) r10
            r12 = 755689166(0x2d0ae6ce, float:7.895641E-12)
            r0.mo51557H(r12)
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x0385
            r12 = 1
            if (r10 == r12) goto L_0x0390
            r12 = 2
            if (r10 != r12) goto L_0x037f
            v.p0 r10 = r35.mo162991a()
            v.d0 r10 = r10.f333196a
            if (r10 == 0) goto L_0x0390
            float r10 = r10.f99753a
            goto L_0x0392
        L_0x037f:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x0385:
            v.p0 r10 = r34.mo163000a()
            v.d0 r10 = r10.f333196a
            if (r10 == 0) goto L_0x0390
            float r10 = r10.f99753a
            goto L_0x0392
        L_0x0390:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x0392:
            r0.mo51565P()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object r12 = r2.mo163300d()
            v.n r12 = (p720v.C111277n) r12
            r7 = 755689166(0x2d0ae6ce, float:7.895641E-12)
            r0.mo51557H(r7)
            int r7 = r12.ordinal()
            if (r7 == 0) goto L_0x03c4
            r12 = 1
            r19 = r15
            r15 = 2
            if (r7 == r12) goto L_0x03d3
            if (r7 != r15) goto L_0x03be
            v.p0 r7 = r35.mo162991a()
            v.d0 r7 = r7.f333196a
            if (r7 == 0) goto L_0x03d3
            float r7 = r7.f99753a
            goto L_0x03d5
        L_0x03be:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x03c4:
            r19 = r15
            r12 = 1
            r15 = 2
            v.p0 r7 = r34.mo163000a()
            v.d0 r7 = r7.f333196a
            if (r7 == 0) goto L_0x03d3
            float r7 = r7.f99753a
            goto L_0x03d5
        L_0x03d3:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x03d5:
            r0.mo51565P()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            w.c1$b r12 = r2.mo163299c()
            int r26 = r1 >> 3
            r26 = r26 & 112(0x70, float:1.57E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r26)
            java.lang.Object r8 = r8.invoke(r12, r0, r15)
            r12 = r8
            w.b0 r12 = (p257w.C37892b0) r12
            r8 = r1 & 14
            int r15 = r1 << 9
            r15 = r15 & r16
            r8 = r8 | r15
            int r1 = r1 << 6
            r1 = r1 & r17
            r15 = r8 | r1
            r8 = r2
            r1 = r9
            r9 = r10
            r6 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r18 = 0
            r10 = r7
            r7 = r11
            r11 = r12
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12 = r23
            r27 = r13
            r13 = r24
            r28 = r14
            r14 = r0
            r29 = r19
            r19 = 0
            j0.k2 r8 = p257w.C111641g1.m152173b(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.mo51565P()
            r0.mo51565P()
            goto L_0x0433
        L_0x0422:
            r1 = r9
            r7 = r11
            r27 = r13
            r28 = r14
            r29 = r15
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r18 = 0
            r19 = 0
            j0.y0<java.lang.Float> r8 = p720v.C111278o.f333188b
        L_0x0433:
            r15 = r8
            r0.mo51565P()
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0603
            v.t r1 = new v.t
            r1.<init>(r4, r5)
            r0.mo51557H(r6)
            java.lang.Object r7 = r0.mo51606q()
            java.lang.Object r8 = p175j0.C108504h.C60656a.f172772a
            if (r7 != r8) goto L_0x0458
            java.lang.String r7 = "Built-in scale"
            r0.mo51553F(r7)
        L_0x0458:
            r0.mo51565P()
            r13 = r7
            java.lang.String r13 = (java.lang.String) r13
            r7 = r27
            r8 = r7 | 384(0x180, float:5.38E-43)
            r9 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r0.mo51557H(r9)
            w.k1<java.lang.Float, w.l> r12 = p257w.C111656m1.f334256a
            r9 = r8 & 14
            int r8 = r8 << 3
            r10 = r8 & 896(0x380, float:1.256E-42)
            r9 = r9 | r10
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r10
            r8 = r8 & r16
            r8 = r8 | r9
            r14 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r0.mo51557H(r14)
            java.lang.Object r9 = r2.mo163298b()
            v.n r9 = (p720v.C111277n) r9
            r10 = -596129937(0xffffffffdc77c76f, float:-2.78974395E17)
            r0.mo51557H(r10)
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x04a5
            r11 = 1
            if (r9 == r11) goto L_0x04a3
            r6 = 2
            if (r9 != r6) goto L_0x049d
            v.p0 r9 = r35.mo162991a()
            r9.getClass()
            goto L_0x04ae
        L_0x049d:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x04a3:
            r6 = 2
            goto L_0x04ae
        L_0x04a5:
            r6 = 2
            r11 = 1
            v.p0 r9 = r34.mo163000a()
            r9.getClass()
        L_0x04ae:
            r0.mo51565P()
            java.lang.Float r9 = java.lang.Float.valueOf(r22)
            java.lang.Object r21 = r2.mo163300d()
            v.n r21 = (p720v.C111277n) r21
            r0.mo51557H(r10)
            int r10 = r21.ordinal()
            if (r10 == 0) goto L_0x04d6
            if (r10 == r11) goto L_0x04dd
            if (r10 != r6) goto L_0x04d0
            v.p0 r10 = r35.mo162991a()
            r10.getClass()
            goto L_0x04dd
        L_0x04d0:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x04d6:
            v.p0 r10 = r34.mo163000a()
            r10.getClass()
        L_0x04dd:
            r0.mo51565P()
            java.lang.Float r10 = java.lang.Float.valueOf(r22)
            w.c1$b r11 = r2.mo163299c()
            int r21 = r8 >> 3
            r21 = r21 & 112(0x70, float:1.57E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r21)
            java.lang.Object r1 = r1.invoke(r11, r0, r14)
            r11 = r1
            w.b0 r11 = (p257w.C37892b0) r11
            r1 = r8 & 14
            int r14 = r8 << 9
            r14 = r14 & r16
            r1 = r1 | r14
            int r8 = r8 << 6
            r8 = r8 & r17
            r1 = r1 | r8
            r8 = r2
            r14 = 1
            r6 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r14 = r0
            r30 = r15
            r15 = r1
            j0.k2 r1 = p257w.C111641g1.m152173b(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.mo51565P()
            r0.mo51565P()
            java.lang.Object r8 = r2.mo163298b()
            v.n r9 = p720v.C111277n.PreEnter
            if (r8 != r9) goto L_0x052d
            v.p0 r8 = r34.mo163000a()
            r8.getClass()
            v.p0 r8 = r35.mo162991a()
            r8.getClass()
            goto L_0x053b
        L_0x052d:
            v.p0 r8 = r35.mo162991a()
            r8.getClass()
            v.p0 r8 = r34.mo163000a()
            r8.getClass()
        L_0x053b:
            w.k1<a1.a1, w.m> r12 = p720v.C111278o.f333187a
            r7 = r7 | 3136(0xc40, float:4.394E-42)
            r0.mo51557H(r6)
            v.p r6 = p720v.C111282p.f333195d
            java.lang.Object r8 = r2.mo163298b()
            v.n r8 = (p720v.C111277n) r8
            r9 = -288165413(0xffffffffeed2f1db, float:-3.2642119E28)
            r0.mo51557H(r9)
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x0571
            r10 = 1
            if (r8 == r10) goto L_0x0580
            r11 = 2
            if (r8 != r11) goto L_0x056b
            v.p0 r8 = r35.mo162991a()
            r8.getClass()
            v.p0 r8 = r34.mo163000a()
            r8.getClass()
            goto L_0x0580
        L_0x056b:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x0571:
            r10 = 1
            v.p0 r8 = r34.mo163000a()
            r8.getClass()
            v.p0 r8 = r35.mo162991a()
            r8.getClass()
        L_0x0580:
            long r13 = p436a1.C103222a1.f304424b
            r0.mo51565P()
            a1.a1 r11 = new a1.a1
            r11.<init>(r13)
            java.lang.Object r8 = r2.mo163300d()
            v.n r8 = (p720v.C111277n) r8
            r0.mo51557H(r9)
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x05b3
            if (r8 == r10) goto L_0x05c1
            r9 = 2
            if (r8 != r9) goto L_0x05ad
            v.p0 r8 = r35.mo162991a()
            r8.getClass()
            v.p0 r8 = r34.mo163000a()
            r8.getClass()
            goto L_0x05c1
        L_0x05ad:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x05b3:
            v.p0 r8 = r34.mo163000a()
            r8.getClass()
            v.p0 r8 = r35.mo162991a()
            r8.getClass()
        L_0x05c1:
            r0.mo51565P()
            a1.a1 r10 = new a1.a1
            r10.<init>(r13)
            w.c1$b r8 = r2.mo163299c()
            int r9 = r7 >> 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r6 = r6.invoke(r8, r0, r9)
            w.b0 r6 = (p257w.C37892b0) r6
            r8 = r7 & 14
            int r9 = r7 << 9
            r9 = r9 & r16
            r8 = r8 | r9
            int r7 = r7 << 6
            r7 = r7 & r17
            r15 = r8 | r7
            java.lang.String r13 = "TransformOriginInterruptionHandling"
            r8 = r2
            r9 = r11
            r11 = r6
            r14 = r0
            j0.k2 r2 = p257w.C111641g1.m152173b(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.mo51565P()
            v.q r6 = new v.q
            r8 = r30
            r6.<init>(r8, r1, r2)
            r1 = r29
            v0.j r15 = p436a1.C103221a0.m136602a(r1, r6)
            goto L_0x061d
        L_0x0603:
            r8 = r15
            r1 = r29
            java.lang.Object r2 = r7.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x061c
            v.r r2 = new v.r
            r2.<init>(r8)
            v0.j r15 = p436a1.C103221a0.m136602a(r1, r2)
            goto L_0x061d
        L_0x061c:
            r15 = r1
        L_0x061d:
            r0.mo51565P()
            v0.j r1 = r3.mo74972i0(r15)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r2)
            java.lang.Object r2 = r0.mo51606q()
            java.lang.Object r6 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r6) goto L_0x063d
            v.b r2 = new v.b
            r10 = r28
            r2.<init>(r10)
            r0.mo51553F(r2)
            goto L_0x063f
        L_0x063d:
            r10 = r28
        L_0x063f:
            r0.mo51565P()
            o1.y r2 = (p631o1.C109895y) r2
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo51557H(r6)
            j0.f1<i2.d> r6 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r6 = r0.mo51598m(r6)
            i2.d r6 = (p560i2.C108322d) r6
            j0.f1<i2.o> r7 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r7 = r0.mo51598m(r7)
            i2.o r7 = (p560i2.C33183o) r7
            j0.f1<androidx.compose.ui.platform.i2> r8 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r8 = r0.mo51598m(r8)
            androidx.compose.ui.platform.i2 r8 = (androidx.compose.p002ui.platform.C103633i2) r8
            q1.a$a r9 = p658q1.C110269a.f329831D0
            r9.getClass()
            fy3.a<q1.a> r9 = p658q1.C110269a.C110270a.f329833b
            fy3.q r1 = p631o1.C109863q.m149330a(r1)
            j0.d r11 = r0.mo51543A()
            boolean r11 = r11 instanceof p175j0.C24665d
            if (r11 == 0) goto L_0x06f8
            r0.mo51615v()
            boolean r11 = r0.mo51621y()
            if (r11 == 0) goto L_0x0682
            r0.mo51612t(r9)
            goto L_0x0685
        L_0x0682:
            r0.mo51579c()
        L_0x0685:
            r0.mo51561L()
            fy3.p<q1.a, o1.y, rx3.b0> r9 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r0, r2, r9)
            fy3.p<q1.a, i2.d, rx3.b0> r2 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r0, r6, r2)
            fy3.p<q1.a, i2.o, rx3.b0> r2 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r0, r7, r2)
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r2 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r0, r8, r2)
            r0.mo51590i()
            j0.x1 r2 = new j0.x1
            r2.<init>(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            q0.b r1 = (p415q0.C35747b) r1
            r1.invoke(r2, r0, r6)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo51557H(r1)
            r1 = 1797450476(0x6b22eaec, float:1.9695537E26)
            r0.mo51557H(r1)
            int r1 = r20 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = r36
            r6.invoke(r10, r0, r1)
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
        L_0x06d4:
            r0.mo51565P()
        L_0x06d7:
            j0.v1 r8 = r0.mo51596l()
            if (r8 != 0) goto L_0x06de
            goto L_0x06f5
        L_0x06de:
            v.c$b r9 = new v.c$b
            r0 = r9
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo51650a(r9)
        L_0x06f5:
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            return
        L_0x06f8:
            p175j0.C108501g.m147000a()
            throw r18
        */
        throw new UnsupportedOperationException("Method not decompiled: p720v.C111247c.m151757a(w.c1, fy3.l, v0.j, v.y, v.a0, fy3.q, j0.h, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151758b(boolean r23, p721v0.C65503j r24, p720v.C111292y r25, p720v.C111239a0 r26, java.lang.String r27, fy3.C32228q<? super p720v.C65500d, ? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r28, p175j0.C108504h r29, int r30, int r31) {
        /*
            r8 = r28
            r9 = r30
            java.lang.String r0 = "content"
            gy3.C87412m.m108594g(r8, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r1 = r29
            j0.h r10 = r1.mo51623z(r0)
            r0 = r31 & 1
            if (r0 == 0) goto L_0x001d
            r0 = r9 | 6
            r11 = r23
            goto L_0x002f
        L_0x001d:
            r0 = r9 & 14
            r11 = r23
            if (r0 != 0) goto L_0x002e
            boolean r0 = r10.mo51586g(r11)
            if (r0 == 0) goto L_0x002b
            r0 = 4
            goto L_0x002c
        L_0x002b:
            r0 = 2
        L_0x002c:
            r0 = r0 | r9
            goto L_0x002f
        L_0x002e:
            r0 = r9
        L_0x002f:
            r1 = r31 & 2
            if (r1 == 0) goto L_0x0036
            r0 = r0 | 48
            goto L_0x0049
        L_0x0036:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0049
            r2 = r24
            boolean r3 = r10.mo51619x(r2)
            if (r3 == 0) goto L_0x0045
            r3 = 32
            goto L_0x0047
        L_0x0045:
            r3 = 16
        L_0x0047:
            r0 = r0 | r3
            goto L_0x004b
        L_0x0049:
            r2 = r24
        L_0x004b:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0065
            r4 = r25
            boolean r5 = r10.mo51619x(r4)
            if (r5 == 0) goto L_0x0061
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r5
            goto L_0x0067
        L_0x0065:
            r4 = r25
        L_0x0067:
            r5 = r31 & 8
            if (r5 == 0) goto L_0x006e
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0081
            r6 = r26
            boolean r7 = r10.mo51619x(r6)
            if (r7 == 0) goto L_0x007d
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r0 = r0 | r7
            goto L_0x0083
        L_0x0081:
            r6 = r26
        L_0x0083:
            r7 = r31 & 16
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008d
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008d:
            r13 = r9 & r12
            if (r13 != 0) goto L_0x00a0
            r13 = r27
            boolean r14 = r10.mo51619x(r13)
            if (r14 == 0) goto L_0x009c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r0 = r0 | r14
            goto L_0x00a2
        L_0x00a0:
            r13 = r27
        L_0x00a2:
            r14 = r31 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00ab
            r14 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00ba
        L_0x00ab:
            r14 = r9 & r15
            if (r14 != 0) goto L_0x00bb
            boolean r14 = r10.mo51619x(r8)
            if (r14 == 0) goto L_0x00b8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r0 = r0 | r14
        L_0x00bb:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r0
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d3
            boolean r14 = r10.mo51575a()
            if (r14 != 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            r10.mo51581d()
            r3 = r4
            r4 = r6
        L_0x00d0:
            r5 = r13
            goto L_0x0206
        L_0x00d3:
            if (r1 == 0) goto L_0x00d9
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            r14 = r1
            goto L_0x00da
        L_0x00d9:
            r14 = r2
        L_0x00da:
            r2 = 0
            r15 = 3
            r12 = 1
            r1 = 0
            if (r3 == 0) goto L_0x014e
            v.y r3 = p720v.C111278o.m151774a(r1, r2, r15, r1)
            java.util.Map<w.k1<?, ?>, java.lang.Float> r4 = p257w.C111679z1.f334306a
            long r1 = p560i2.C108329n.m146743a(r12, r12)
            i2.m r4 = new i2.m
            r4.<init>(r1)
            r1 = 1137180672(0x43c80000, float:400.0)
            r2 = 0
            r15 = 0
            w.w0 r4 = p257w.C37903i.m41594b(r2, r1, r4, r12, r15)
            v0.a r1 = p721v0.C111294a.C111295a.f333225g
            v.u r2 = p720v.C111288u.f333207d
            java.lang.String r15 = "initialSize"
            gy3.C87412m.m108594g(r2, r15)
            v.z r15 = new v.z
            v.p0 r6 = new v.p0
            v.g r8 = new v.g
            r8.<init>(r1, r2, r4, r12)
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 11
            r22 = 0
            r16 = r6
            r19 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r15.<init>(r6)
            v.z r1 = new v.z
            v.p0 r2 = new v.p0
            v.z r3 = (p720v.C111293z) r3
            v.p0 r3 = r3.f333217a
            v.d0 r4 = r3.f333196a
            if (r4 != 0) goto L_0x012d
            v.p0 r4 = r15.f333217a
            v.d0 r4 = r4.f333196a
        L_0x012d:
            v.k0 r6 = r3.f333197b
            if (r6 != 0) goto L_0x0135
            v.p0 r6 = r15.f333217a
            v.k0 r6 = r6.f333197b
        L_0x0135:
            v.g r8 = r3.f333198c
            if (r8 != 0) goto L_0x013d
            v.p0 r8 = r15.f333217a
            v.g r8 = r8.f333198c
        L_0x013d:
            r3.getClass()
            v.p0 r3 = r15.f333217a
            r3.getClass()
            r3 = 0
            r2.<init>(r4, r6, r8, r3)
            r1.<init>(r2)
            r8 = r1
            goto L_0x014f
        L_0x014e:
            r8 = r4
        L_0x014f:
            if (r5 == 0) goto L_0x01cd
            w.k1<a1.a1, w.m> r1 = p720v.C111278o.f333187a
            java.util.Map<w.k1<?, ?>, java.lang.Float> r1 = p257w.C111679z1.f334306a
            long r1 = p560i2.C108329n.m146743a(r12, r12)
            i2.m r3 = new i2.m
            r3.<init>(r1)
            r1 = 1137180672(0x43c80000, float:400.0)
            r2 = 0
            r4 = 0
            w.w0 r1 = p257w.C37903i.m41594b(r2, r1, r3, r12, r4)
            v0.a r2 = p721v0.C111294a.C111295a.f333225g
            v.w r3 = p720v.C111290w.f333212d
            java.lang.String r4 = "targetSize"
            gy3.C87412m.m108594g(r3, r4)
            v.b0 r4 = new v.b0
            v.p0 r5 = new v.p0
            v.g r6 = new v.g
            r6.<init>(r2, r3, r1, r12)
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 11
            r22 = 0
            r16 = r5
            r19 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r4.<init>(r5)
            r1 = 0
            r2 = 3
            r3 = 0
            v.a0 r1 = p720v.C111278o.m151775b(r3, r1, r2, r3)
            v.b0 r2 = new v.b0
            v.p0 r3 = new v.p0
            v.p0 r4 = r4.f333116a
            v.d0 r5 = r4.f333196a
            if (r5 != 0) goto L_0x01a4
            r5 = r1
            v.b0 r5 = (p720v.C111246b0) r5
            v.p0 r5 = r5.f333116a
            v.d0 r5 = r5.f333196a
        L_0x01a4:
            v.k0 r6 = r4.f333197b
            if (r6 != 0) goto L_0x01af
            r6 = r1
            v.b0 r6 = (p720v.C111246b0) r6
            v.p0 r6 = r6.f333116a
            v.k0 r6 = r6.f333197b
        L_0x01af:
            v.g r12 = r4.f333198c
            if (r12 != 0) goto L_0x01ba
            r12 = r1
            v.b0 r12 = (p720v.C111246b0) r12
            v.p0 r12 = r12.f333116a
            v.g r12 = r12.f333198c
        L_0x01ba:
            r4.getClass()
            v.b0 r1 = (p720v.C111246b0) r1
            v.p0 r1 = r1.f333116a
            r1.getClass()
            r1 = 0
            r3.<init>(r5, r6, r12, r1)
            r2.<init>(r3)
            r12 = r2
            goto L_0x01cf
        L_0x01cd:
            r12 = r26
        L_0x01cf:
            if (r7 == 0) goto L_0x01d4
            java.lang.String r1 = "AnimatedVisibility"
            r13 = r1
        L_0x01d4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)
            r2 = r0 & 14
            int r3 = r0 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 0
            w.c1 r1 = p257w.C111641g1.m152174c(r1, r13, r10, r2, r3)
            v.c$c r2 = p720v.C111247c.C65498c.f188477d
            int r3 = r0 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r5
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r4
            r7 = r3 | r0
            r0 = r1
            r1 = r2
            r2 = r14
            r3 = r8
            r4 = r12
            r5 = r28
            r6 = r10
            m151757a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00d0
        L_0x0206:
            j0.v1 r10 = r10.mo51596l()
            if (r10 != 0) goto L_0x020d
            goto L_0x021e
        L_0x020d:
            v.c$d r12 = new v.c$d
            r0 = r12
            r1 = r23
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.mo51650a(r12)
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p720v.C111247c.m151758b(boolean, v0.j, v.y, v.a0, java.lang.String, fy3.q, j0.h, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if (((java.lang.Boolean) r2.getValue()).booleanValue() != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if (r6.invoke(r5.mo163298b()).booleanValue() != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r9 = r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> p720v.C111277n m151759c(p257w.C111629c1<T> r5, fy3.C32226l<? super T, java.lang.Boolean> r6, T r7, p175j0.C108504h r8, int r9) {
        /*
            v.n r9 = p720v.C111277n.PostExit
            v.n r0 = p720v.C111277n.PreEnter
            v.n r1 = p720v.C111277n.Visible
            r2 = 361571134(0x158d233e, float:5.700505E-26)
            r8.mo51557H(r2)
            r2 = -721837556(0xffffffffd4f9a20c, float:-8.5773244E12)
            r8.mo51560K(r2, r5)
            boolean r2 = r5.mo163301e()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r7 = r6.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0026
        L_0x0024:
            r9 = r1
            goto L_0x0087
        L_0x0026:
            java.lang.Object r5 = r5.mo163298b()
            java.lang.Object r5 = r6.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0037
            goto L_0x0087
        L_0x0037:
            r9 = r0
            goto L_0x0087
        L_0x0039:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo51557H(r2)
            java.lang.Object r2 = r8.mo51606q()
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r3) goto L_0x0054
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 2
            r4 = 0
            j0.y0 r2 = p175j0.C108500f2.m146996c(r2, r4, r3, r4)
            r8.mo51553F(r2)
        L_0x0054:
            r8.mo51565P()
            j0.y0 r2 = (p175j0.C60690y0) r2
            java.lang.Object r5 = r5.mo163298b()
            java.lang.Object r5 = r6.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x006e
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.setValue(r5)
        L_0x006e:
            java.lang.Object r5 = r6.invoke(r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x007b
            goto L_0x0024
        L_0x007b:
            java.lang.Object r5 = r2.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0037
        L_0x0087:
            r8.mo51564O()
            r8.mo51565P()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p720v.C111247c.m151759c(w.c1, fy3.l, java.lang.Object, j0.h, int):v.n");
    }
}
