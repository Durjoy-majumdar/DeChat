package p543h0;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import kotlin.ResultKt;
import p1165z.C112515b;
import p1165z.C112517d;
import p1165z.C112518e;
import p1165z.C112521g;
import p1165z.C112522h;
import p1165z.C112525j;
import p1165z.C112526k;
import p1165z.C112529n;
import p1165z.C112530o;
import p1165z.C112531p;
import p1166z0.C112539e;
import p175j0.C108494d2;
import p241t0.C110872v;
import p257w.C111626b;
import p257w.C37905j1;
import p257w.C37907l;
import p560i2.C108325f;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: h0.l */
public final class C107963l implements C107926c {

    /* renamed from: a */
    public final float f323318a;

    /* renamed from: b */
    public final float f323319b;

    /* renamed from: c */
    public final float f323320c;

    /* renamed from: d */
    public final float f323321d;

    /* renamed from: e */
    public final float f323322e;

    @C91590f(mo125468c = "androidx.compose.material.DefaultButtonElevation$elevation$1", mo125469f = "Button.kt", mo125470l = {506}, mo125471m = "invokeSuspend")
    /* renamed from: h0.l$a */
    public static final class C107964a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f323323d;

        /* renamed from: e */
        public final /* synthetic */ C112526k f323324e;

        /* renamed from: f */
        public final /* synthetic */ C110872v<C112525j> f323325f;

        /* renamed from: h0.l$a$a */
        public static final class C107965a implements C45253g<C112525j> {

            /* renamed from: d */
            public final /* synthetic */ C110872v<C112525j> f323326d;

            public C107965a(C110872v<C112525j> vVar) {
                this.f323326d = vVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C112525j jVar = (C112525j) obj;
                if (jVar instanceof C112521g) {
                    this.f323326d.add(jVar);
                } else if (jVar instanceof C112522h) {
                    this.f323326d.remove((Object) ((C112522h) jVar).f336934a);
                } else if (jVar instanceof C112517d) {
                    this.f323326d.add(jVar);
                } else if (jVar instanceof C112518e) {
                    this.f323326d.remove((Object) ((C112518e) jVar).f336928a);
                } else if (jVar instanceof C112530o) {
                    this.f323326d.add(jVar);
                } else if (jVar instanceof C112531p) {
                    this.f323326d.remove((Object) ((C112531p) jVar).f336943a);
                } else if (jVar instanceof C112529n) {
                    this.f323326d.remove((Object) ((C112529n) jVar).f336941a);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107964a(C112526k kVar, C110872v<C112525j> vVar, C15601d<? super C107964a> dVar) {
            super(2, dVar);
            this.f323324e = kVar;
            this.f323325f = vVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107964a(this.f323324e, this.f323325f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107964a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f323323d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<C112525j> c = this.f323324e.mo164251c();
                C107965a aVar2 = new C107965a(this.f323325f);
                this.f323323d = 1;
                if (c.mo31880a(aVar2, this) == aVar) {
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

    @C91590f(mo125468c = "androidx.compose.material.DefaultButtonElevation$elevation$2", mo125469f = "Button.kt", mo125470l = {551}, mo125471m = "invokeSuspend")
    /* renamed from: h0.l$b */
    public static final class C107966b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f323327d;

        /* renamed from: e */
        public final /* synthetic */ C111626b<C108325f, C37907l> f323328e;

        /* renamed from: f */
        public final /* synthetic */ float f323329f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107966b(C111626b<C108325f, C37907l> bVar, float f, C15601d<? super C107966b> dVar) {
            super(2, dVar);
            this.f323328e = bVar;
            this.f323329f = f;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107966b(this.f323328e, this.f323329f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107966b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f323327d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111626b<C108325f, C37907l> bVar = this.f323328e;
                C108325f fVar = new C108325f(this.f323329f);
                this.f323327d = 1;
                if (bVar.mo163296d(fVar, this) == aVar) {
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

    @C91590f(mo125468c = "androidx.compose.material.DefaultButtonElevation$elevation$3", mo125469f = "Button.kt", mo125470l = {561}, mo125471m = "invokeSuspend")
    /* renamed from: h0.l$c */
    public static final class C107967c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f323330d;

        /* renamed from: e */
        public final /* synthetic */ C111626b<C108325f, C37907l> f323331e;

        /* renamed from: f */
        public final /* synthetic */ C107963l f323332f;

        /* renamed from: g */
        public final /* synthetic */ float f323333g;

        /* renamed from: h */
        public final /* synthetic */ C112525j f323334h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107967c(C111626b<C108325f, C37907l> bVar, C107963l lVar, float f, C112525j jVar, C15601d<? super C107967c> dVar) {
            super(2, dVar);
            this.f323331e = bVar;
            this.f323332f = lVar;
            this.f323333g = f;
            this.f323334h = jVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107967c(this.f323331e, this.f323332f, this.f323333g, this.f323334h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107967c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C37905j1<C108325f> j1Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f323330d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float f = ((C108325f) ((C108494d2) this.f323331e.f334168e).getValue()).f324346d;
                C37905j1<C108325f> j1Var2 = null;
                Object oVar = C108325f.m146734a(f, this.f323332f.f323319b) ? new C112530o(C112539e.f336955b, (C8480h) null) : C108325f.m146734a(f, this.f323332f.f323321d) ? new C112521g() : C108325f.m146734a(f, this.f323332f.f323322e) ? new C112517d() : null;
                C111626b<C108325f, C37907l> bVar = this.f323331e;
                float f2 = this.f323333g;
                C112525j jVar = this.f323334h;
                this.f323330d = 1;
                C37905j1<C108325f> j1Var3 = C32638o.f86634a;
                if (jVar != null) {
                    if (jVar instanceof C112530o) {
                        j1Var2 = C32638o.f86634a;
                    } else if (jVar instanceof C112515b) {
                        j1Var2 = C32638o.f86634a;
                    } else if (jVar instanceof C112521g) {
                        j1Var2 = C32638o.f86634a;
                    } else if (jVar instanceof C112517d) {
                        j1Var2 = C32638o.f86634a;
                    }
                } else if (oVar != null) {
                    if (oVar instanceof C112530o) {
                        j1Var = C32638o.f86635b;
                    } else if (oVar instanceof C112515b) {
                        j1Var = C32638o.f86635b;
                    } else if (oVar instanceof C112521g) {
                        j1Var = C32638o.f86636c;
                    } else if (oVar instanceof C112517d) {
                        j1Var = C32638o.f86635b;
                    }
                    j1Var2 = j1Var;
                }
                C37905j1<C108325f> j1Var4 = j1Var2;
                if (j1Var4 == null ? (obj2 = bVar.mo163296d(new C108325f(f2), this)) != aVar : (obj2 = C111626b.m152137b(bVar, new C108325f(f2), j1Var4, (Object) null, (C32226l) null, this, 12, (Object) null)) != aVar) {
                    obj2 = C13598b0.f38549a;
                }
                if (obj2 == aVar) {
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

    public C107963l(float f, float f2, float f3, float f4, float f5, C8480h hVar) {
        this.f323318a = f;
        this.f323319b = f2;
        this.f323320c = f3;
        this.f323321d = f4;
        this.f323322e = f5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: w.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: w.b} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p175j0.C60667k2<p560i2.C108325f> mo158353a(boolean r16, p1165z.C112526k r17, p175j0.C108504h r18, int r19) {
        /*
            r15 = this;
            r6 = r15
            r0 = r17
            r7 = r18
            java.lang.String r1 = "interactionSource"
            gy3.C87412m.m108594g(r0, r1)
            r1 = -1588756907(0xffffffffa14d7e55, float:-6.96239E-19)
            r7.mo51557H(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo51557H(r1)
            java.lang.Object r2 = r18.mo51606q()
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r3) goto L_0x0028
            t0.v r2 = new t0.v
            r2.<init>()
            r7.mo51553F(r2)
        L_0x0028:
            r18.mo51565P()
            t0.v r2 = (p241t0.C110872v) r2
            h0.l$a r4 = new h0.l$a
            r5 = 0
            r4.<init>(r0, r2, r5)
            int r8 = r19 >> 3
            r8 = r8 & 14
            p175j0.C60655g0.m70932c(r0, r4, r7, r8)
            java.lang.Object r0 = sx3.C110818d0.m150925W(r2)
            r4 = r0
            z.j r4 = (p1165z.C112525j) r4
            if (r16 != 0) goto L_0x0047
            float r0 = r6.f323320c
        L_0x0045:
            r8 = r0
            goto L_0x005f
        L_0x0047:
            boolean r0 = r4 instanceof p1165z.C112530o
            if (r0 == 0) goto L_0x004e
            float r0 = r6.f323319b
            goto L_0x0045
        L_0x004e:
            boolean r0 = r4 instanceof p1165z.C112521g
            if (r0 == 0) goto L_0x0055
            float r0 = r6.f323321d
            goto L_0x0045
        L_0x0055:
            boolean r0 = r4 instanceof p1165z.C112517d
            if (r0 == 0) goto L_0x005c
            float r0 = r6.f323322e
            goto L_0x0045
        L_0x005c:
            float r0 = r6.f323318a
            goto L_0x0045
        L_0x005f:
            r7.mo51557H(r1)
            java.lang.Object r0 = r18.mo51606q()
            if (r0 != r3) goto L_0x007d
            w.b r0 = new w.b
            i2.f r10 = new i2.f
            r10.<init>(r8)
            w.k1<java.lang.Float, w.l> r1 = p257w.C111656m1.f334256a
            w.k1<i2.f, w.l> r11 = p257w.C111656m1.f334258c
            r12 = 0
            r13 = 4
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            r7.mo51553F(r0)
        L_0x007d:
            r18.mo51565P()
            r9 = r0
            w.b r9 = (p257w.C111626b) r9
            r10 = 0
            if (r16 != 0) goto L_0x009d
            r0 = -1598807481(0xffffffffa0b42247, float:-3.051587E-19)
            r7.mo51557H(r0)
            i2.f r0 = new i2.f
            r0.<init>(r8)
            h0.l$b r1 = new h0.l$b
            r1.<init>(r9, r8, r5)
            p175j0.C60655g0.m70932c(r0, r1, r7, r10)
            r18.mo51565P()
            goto L_0x00b8
        L_0x009d:
            r0 = -1598807310(0xffffffffa0b422f2, float:-3.051631E-19)
            r7.mo51557H(r0)
            i2.f r11 = new i2.f
            r11.<init>(r8)
            h0.l$c r12 = new h0.l$c
            r5 = 0
            r0 = r12
            r1 = r9
            r2 = r15
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            p175j0.C60655g0.m70932c(r11, r12, r7, r10)
            r18.mo51565P()
        L_0x00b8:
            w.j<T, V> r0 = r9.f334166c
            r18.mo51565P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p543h0.C107963l.mo158353a(boolean, z.k, j0.h, int):j0.k2");
    }
}
