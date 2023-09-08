package ya0;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import d14.C58042h;
import d14.C58091w;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p004b0.C54372f0;
import p004b0.C54380k;
import p175j0.C108494d2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p415q0.C110261c;
import p435a0.C103177n0;
import p721v0.C111294a;
import p721v0.C65503j;
import p759y.C112195b0;
import rx3.C13598b0;
import wx3.C15601d;
import xa0.C112139f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ya0.c */
public final class C112409c {

    /* renamed from: ya0.c$a */
    public static final class C112410a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f336586d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f336587e;

        /* renamed from: f */
        public final /* synthetic */ C112430i f336588f;

        /* renamed from: g */
        public final /* synthetic */ boolean f336589g;

        /* renamed from: h */
        public final /* synthetic */ float f336590h;

        /* renamed from: i */
        public final /* synthetic */ C103177n0 f336591i;

        /* renamed from: j */
        public final /* synthetic */ C111294a.C37634c f336592j;

        /* renamed from: n */
        public final /* synthetic */ C112195b0 f336593n;

        /* renamed from: o */
        public final /* synthetic */ C32226l<Integer, Object> f336594o;

        /* renamed from: p */
        public final /* synthetic */ C32229r<C66599g, Integer, C108504h, Integer, C13598b0> f336595p;

        /* renamed from: q */
        public final /* synthetic */ int f336596q;

        /* renamed from: r */
        public final /* synthetic */ int f336597r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112410a(int i, C65503j jVar, C112430i iVar, boolean z, float f, C103177n0 n0Var, C111294a.C37634c cVar, C112195b0 b0Var, C32226l<? super Integer, ? extends Object> lVar, C32229r<? super C66599g, ? super Integer, ? super C108504h, ? super Integer, C13598b0> rVar, int i2, int i3) {
            super(2);
            this.f336586d = i;
            this.f336587e = jVar;
            this.f336588f = iVar;
            this.f336589g = z;
            this.f336590h = f;
            this.f336591i = n0Var;
            this.f336592j = cVar;
            this.f336593n = b0Var;
            this.f336594o = lVar;
            this.f336595p = rVar;
            this.f336596q = i2;
            this.f336597r = i3;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C112409c.m153440a(this.f336586d, this.f336587e, this.f336588f, this.f336589g, this.f336590h, this.f336591i, this.f336592j, this.f336593n, this.f336594o, this.f336595p, (C108504h) obj, this.f336596q | 1, this.f336597r);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ya0.c$b */
    public static final class C112411b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C112195b0 f336598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112411b(C112195b0 b0Var) {
            super(0);
            this.f336598d = b0Var;
        }

        public Object invoke() {
            C112195b0 b0Var = this.f336598d;
            C112139f fVar = b0Var instanceof C112139f ? (C112139f) b0Var : null;
            if (fVar != null) {
                return (Integer) ((C108494d2) fVar.f335749e).getValue();
            }
            return null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.pager.PagerKt$Pager$3$1", mo125469f = "Pager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ya0.c$c */
    public static final class C112412c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C112430i f336599d;

        /* renamed from: e */
        public final /* synthetic */ int f336600e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112412c(C112430i iVar, int i, C15601d<? super C112412c> dVar) {
            super(2, dVar);
            this.f336599d = iVar;
            this.f336600e = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112412c(this.f336599d, this.f336600e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112412c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C112430i iVar = this.f336599d;
            int min = Math.min(this.f336600e - 1, iVar.mo164141i());
            if (min < 0) {
                min = 0;
            }
            if (min != iVar.mo164141i()) {
                ((C108494d2) iVar.f336656b).setValue(Integer.valueOf(min));
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.pager.PagerKt$Pager$4$1", mo125469f = "Pager.kt", mo125470l = {248}, mo125471m = "invokeSuspend")
    /* renamed from: ya0.c$d */
    public static final class C112413d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f336601d;

        /* renamed from: e */
        public final /* synthetic */ C112430i f336602e;

        /* renamed from: ya0.c$d$a */
        public static final class C112414a extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C112430i f336603d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112414a(C112430i iVar) {
                super(0);
                this.f336603d = iVar;
            }

            public Object invoke() {
                return Boolean.valueOf(this.f336603d.mo90552a());
            }
        }

        /* renamed from: ya0.c$d$b */
        public static final class C112415b implements C45253g<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C112430i f336604d;

            public C112415b(C112430i iVar) {
                this.f336604d = iVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                ((Boolean) obj).booleanValue();
                C112430i iVar = this.f336604d;
                C54380k e = iVar.mo164137e();
                int index = e != null ? e.getIndex() : 0;
                if (index != iVar.mo164141i()) {
                    ((C108494d2) iVar.f336656b).setValue(Integer.valueOf(index));
                }
                ((C108494d2) iVar.f336659e).setValue(null);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ya0.c$d$c */
        public static final class C112416c implements C45252f<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f336605d;

            /* renamed from: ya0.c$d$c$a */
            public static final class C112417a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f336606d;

                @C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.pager.PagerKt$Pager$4$1$invokeSuspend$$inlined$filter$1$2", mo125469f = "Pager.kt", mo125470l = {224}, mo125471m = "emit")
                /* renamed from: ya0.c$d$c$a$a */
                public static final class C112418a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f336607d;

                    /* renamed from: e */
                    public int f336608e;

                    /* renamed from: f */
                    public final /* synthetic */ C112417a f336609f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C112418a(C112417a aVar, C15601d dVar) {
                        super(dVar);
                        this.f336609f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f336607d = obj;
                        this.f336608e |= Integer.MIN_VALUE;
                        return this.f336609f.emit((Object) null, this);
                    }
                }

                public C112417a(C45253g gVar) {
                    this.f336606d = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, wx3.C15601d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof ya0.C112409c.C112413d.C112416c.C112417a.C112418a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        ya0.c$d$c$a$a r0 = (ya0.C112409c.C112413d.C112416c.C112417a.C112418a) r0
                        int r1 = r0.f336608e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f336608e = r1
                        goto L_0x0018
                    L_0x0013:
                        ya0.c$d$c$a$a r0 = new ya0.c$d$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f336607d
                        xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r2 = r0.f336608e
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L_0x0047
                    L_0x0027:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x002f:
                        kotlin.ResultKt.throwOnFailure(r6)
                        d14.g r6 = r4.f336606d
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L_0x0047
                        r0.f336608e = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        rx3.b0 r5 = rx3.C13598b0.f38549a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ya0.C112409c.C112413d.C112416c.C112417a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C112416c(C45252f fVar) {
                this.f336605d = fVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                Object a = this.f336605d.mo31880a(new C112417a(gVar), dVar);
                return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112413d(C112430i iVar, C15601d<? super C112413d> dVar) {
            super(2, dVar);
            this.f336602e = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112413d(this.f336602e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112413d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f336601d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f f = C58042h.m67197f(new C112416c(C108500f2.m146999f(new C112414a(this.f336602e))), 1);
                C112415b bVar = new C112415b(this.f336602e);
                this.f336601d = 1;
                if (((C58091w) f).mo31880a(bVar, this) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.pager.PagerKt$Pager$5$1", mo125469f = "Pager.kt", mo125470l = {255}, mo125471m = "invokeSuspend")
    /* renamed from: ya0.c$e */
    public static final class C112419e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f336610d;

        /* renamed from: e */
        public final /* synthetic */ C112430i f336611e;

        /* renamed from: ya0.c$e$a */
        public static final class C112420a extends C87413o implements C32224a<C54380k> {

            /* renamed from: d */
            public final /* synthetic */ C112430i f336612d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112420a(C112430i iVar) {
                super(0);
                this.f336612d = iVar;
            }

            public Object invoke() {
                return this.f336612d.mo164137e();
            }
        }

        /* renamed from: ya0.c$e$b */
        public static final class C112421b implements C45253g<C54380k> {

            /* renamed from: d */
            public final /* synthetic */ C112430i f336613d;

            public C112421b(C112430i iVar) {
                this.f336613d = iVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C54380k kVar = (C54380k) obj;
                C112430i iVar = this.f336613d;
                C54380k e = iVar.mo164137e();
                int index = e != null ? e.getIndex() : 0;
                if (index != iVar.mo164141i()) {
                    ((C108494d2) iVar.f336656b).setValue(Integer.valueOf(index));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112419e(C112430i iVar, C15601d<? super C112419e> dVar) {
            super(2, dVar);
            this.f336611e = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112419e(this.f336611e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112419e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f336610d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f f = C108500f2.m146999f(new C112420a(this.f336611e));
                C112430i iVar = this.f336611e;
                C112421b bVar = new C112421b(iVar);
                this.f336610d = 1;
                Object a = f.mo31880a(new C112425d(bVar, iVar), this);
                if (a != aVar) {
                    a = C13598b0.f38549a;
                }
                if (a == aVar) {
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

    /* renamed from: ya0.c$f */
    public static final class C112422f extends C87413o implements C32226l<C54372f0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f336614d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Integer, Object> f336615e;

        /* renamed from: f */
        public final /* synthetic */ C112408a f336616f;

        /* renamed from: g */
        public final /* synthetic */ C32229r<C66599g, Integer, C108504h, Integer, C13598b0> f336617g;

        /* renamed from: h */
        public final /* synthetic */ C112429h f336618h;

        /* renamed from: i */
        public final /* synthetic */ int f336619i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112422f(int i, C32226l<? super Integer, ? extends Object> lVar, C112408a aVar, C32229r<? super C66599g, ? super Integer, ? super C108504h, ? super Integer, C13598b0> rVar, C112429h hVar, int i2) {
            super(1);
            this.f336614d = i;
            this.f336615e = lVar;
            this.f336616f = aVar;
            this.f336617g = rVar;
            this.f336618h = hVar;
            this.f336619i = i2;
        }

        public Object invoke(Object obj) {
            C54372f0 f0Var = (C54372f0) obj;
            C87412m.m108594g(f0Var, "$this$LazyColumn");
            C54372f0.C54373a.m61063b(f0Var, this.f336614d, this.f336615e, (C32226l) null, C110261c.m149879c(-1123025260, true, new C112427e(this.f336616f, this.f336617g, this.f336618h, this.f336619i)), 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ya0.c$g */
    public static final class C112423g extends C87413o implements C32226l<C54372f0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f336620d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Integer, Object> f336621e;

        /* renamed from: f */
        public final /* synthetic */ C112408a f336622f;

        /* renamed from: g */
        public final /* synthetic */ C32229r<C66599g, Integer, C108504h, Integer, C13598b0> f336623g;

        /* renamed from: h */
        public final /* synthetic */ C112429h f336624h;

        /* renamed from: i */
        public final /* synthetic */ int f336625i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112423g(int i, C32226l<? super Integer, ? extends Object> lVar, C112408a aVar, C32229r<? super C66599g, ? super Integer, ? super C108504h, ? super Integer, C13598b0> rVar, C112429h hVar, int i2) {
            super(1);
            this.f336620d = i;
            this.f336621e = lVar;
            this.f336622f = aVar;
            this.f336623g = rVar;
            this.f336624h = hVar;
            this.f336625i = i2;
        }

        public Object invoke(Object obj) {
            C54372f0 f0Var = (C54372f0) obj;
            C87412m.m108594g(f0Var, "$this$LazyRow");
            C54372f0.C54373a.m61063b(f0Var, this.f336620d, this.f336621e, (C32226l) null, C110261c.m149879c(887510419, true, new C112428f(this.f336622f, this.f336623g, this.f336624h, this.f336625i)), 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ya0.c$h */
    public static final class C112424h extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f336626d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f336627e;

        /* renamed from: f */
        public final /* synthetic */ C112430i f336628f;

        /* renamed from: g */
        public final /* synthetic */ boolean f336629g;

        /* renamed from: h */
        public final /* synthetic */ float f336630h;

        /* renamed from: i */
        public final /* synthetic */ boolean f336631i;

        /* renamed from: j */
        public final /* synthetic */ C112195b0 f336632j;

        /* renamed from: n */
        public final /* synthetic */ C32226l<Integer, Object> f336633n;

        /* renamed from: o */
        public final /* synthetic */ C103177n0 f336634o;

        /* renamed from: p */
        public final /* synthetic */ C111294a.C37634c f336635p;

        /* renamed from: q */
        public final /* synthetic */ C111294a.C37633b f336636q;

        /* renamed from: r */
        public final /* synthetic */ C32229r<C66599g, Integer, C108504h, Integer, C13598b0> f336637r;

        /* renamed from: s */
        public final /* synthetic */ int f336638s;

        /* renamed from: t */
        public final /* synthetic */ int f336639t;

        /* renamed from: u */
        public final /* synthetic */ int f336640u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112424h(int i, C65503j jVar, C112430i iVar, boolean z, float f, boolean z2, C112195b0 b0Var, C32226l<? super Integer, ? extends Object> lVar, C103177n0 n0Var, C111294a.C37634c cVar, C111294a.C37633b bVar, C32229r<? super C66599g, ? super Integer, ? super C108504h, ? super Integer, C13598b0> rVar, int i2, int i3, int i4) {
            super(2);
            this.f336626d = i;
            this.f336627e = jVar;
            this.f336628f = iVar;
            this.f336629g = z;
            this.f336630h = f;
            this.f336631i = z2;
            this.f336632j = b0Var;
            this.f336633n = lVar;
            this.f336634o = n0Var;
            this.f336635p = cVar;
            this.f336636q = bVar;
            this.f336637r = rVar;
            this.f336638s = i2;
            this.f336639t = i3;
            this.f336640u = i4;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C112409c.m153441b(this.f336626d, this.f336627e, this.f336628f, this.f336629g, this.f336630h, this.f336631i, this.f336632j, this.f336633n, this.f336634o, this.f336635p, this.f336636q, this.f336637r, (C108504h) obj, this.f336638s | 1, this.f336639t, this.f336640u);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0127  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m153440a(int r30, p721v0.C65503j r31, ya0.C112430i r32, boolean r33, float r34, p435a0.C103177n0 r35, p721v0.C111294a.C37634c r36, p759y.C112195b0 r37, fy3.C32226l<? super java.lang.Integer, ? extends java.lang.Object> r38, fy3.C32229r<? super ya0.C66599g, ? super java.lang.Integer, ? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r39, p175j0.C108504h r40, int r41, int r42) {
        /*
            r15 = r39
            r14 = r41
            r13 = r42
            java.lang.String r0 = "content"
            gy3.C87412m.m108594g(r15, r0)
            r0 = 736090720(0x2bdfda60, float:1.5905714E-12)
            r1 = r40
            j0.h r12 = r1.mo51623z(r0)
            r0 = r13 & 1
            if (r0 == 0) goto L_0x001d
            r0 = r14 | 6
            r11 = r30
            goto L_0x002f
        L_0x001d:
            r0 = r14 & 14
            r11 = r30
            if (r0 != 0) goto L_0x002e
            boolean r0 = r12.mo51592j(r11)
            if (r0 == 0) goto L_0x002b
            r0 = 4
            goto L_0x002c
        L_0x002b:
            r0 = 2
        L_0x002c:
            r0 = r0 | r14
            goto L_0x002f
        L_0x002e:
            r0 = r14
        L_0x002f:
            r1 = r13 & 2
            if (r1 == 0) goto L_0x0036
            r0 = r0 | 48
            goto L_0x0049
        L_0x0036:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0049
            r2 = r31
            boolean r3 = r12.mo51619x(r2)
            if (r3 == 0) goto L_0x0045
            r3 = 32
            goto L_0x0047
        L_0x0045:
            r3 = 16
        L_0x0047:
            r0 = r0 | r3
            goto L_0x004b
        L_0x0049:
            r2 = r31
        L_0x004b:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0064
            r3 = r13 & 4
            if (r3 != 0) goto L_0x005e
            r3 = r32
            boolean r4 = r12.mo51619x(r3)
            if (r4 == 0) goto L_0x0060
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r3 = r32
        L_0x0060:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r0 = r0 | r4
            goto L_0x0066
        L_0x0064:
            r3 = r32
        L_0x0066:
            r4 = r13 & 8
            if (r4 == 0) goto L_0x006d
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0080
            r5 = r33
            boolean r6 = r12.mo51586g(r5)
            if (r6 == 0) goto L_0x007c
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r0 = r0 | r6
            goto L_0x0082
        L_0x0080:
            r5 = r33
        L_0x0082:
            r6 = r13 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x008c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008c:
            r8 = r14 & r7
            if (r8 != 0) goto L_0x009f
            r8 = r34
            boolean r9 = r12.mo51588h(r8)
            if (r9 == 0) goto L_0x009b
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r0 = r0 | r9
            goto L_0x00a1
        L_0x009f:
            r8 = r34
        L_0x00a1:
            r9 = r13 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00ad
            r0 = r0 | r10
            r7 = r35
            goto L_0x00c0
        L_0x00ad:
            r17 = r14 & r16
            r7 = r35
            if (r17 != 0) goto L_0x00c0
            boolean r17 = r12.mo51619x(r7)
            if (r17 == 0) goto L_0x00bc
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r0 = r0 | r17
        L_0x00c0:
            r17 = r13 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00cd
            r19 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r19
            r10 = r36
            goto L_0x00e0
        L_0x00cd:
            r19 = r14 & r18
            r10 = r36
            if (r19 != 0) goto L_0x00e0
            boolean r20 = r12.mo51619x(r10)
            if (r20 == 0) goto L_0x00dc
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r0 = r0 | r20
        L_0x00e0:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r21 = r14 & r20
            if (r21 != 0) goto L_0x00fc
            r2 = r13 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f5
            r2 = r37
            boolean r21 = r12.mo51619x(r2)
            if (r21 == 0) goto L_0x00f7
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f5:
            r2 = r37
        L_0x00f7:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r0 = r0 | r21
            goto L_0x00fe
        L_0x00fc:
            r2 = r37
        L_0x00fe:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x010b
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r22
            r3 = r38
            goto L_0x011e
        L_0x010b:
            r22 = r14 & r21
            r3 = r38
            if (r22 != 0) goto L_0x011e
            boolean r22 = r12.mo51619x(r3)
            if (r22 == 0) goto L_0x011a
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r0 = r0 | r22
        L_0x011e:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r22 = 1879048192(0x70000000, float:1.58456325E29)
            if (r3 == 0) goto L_0x0127
            r3 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x0136
        L_0x0127:
            r3 = r14 & r22
            if (r3 != 0) goto L_0x0137
            boolean r3 = r12.mo51619x(r15)
            if (r3 == 0) goto L_0x0134
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r0 = r0 | r3
        L_0x0137:
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r3 & r0
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x015b
            boolean r3 = r12.mo51575a()
            if (r3 != 0) goto L_0x0147
            goto L_0x015b
        L_0x0147:
            r12.mo51581d()
            r2 = r31
            r3 = r32
            r4 = r33
            r9 = r38
            r6 = r7
            r5 = r8
            r7 = r10
            r21 = r12
            r8 = r37
            goto L_0x02cd
        L_0x015b:
            r12.mo51559J()
            r3 = r14 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r3 == 0) goto L_0x018c
            boolean r3 = r12.mo51582e()
            if (r3 == 0) goto L_0x016c
            goto L_0x018c
        L_0x016c:
            r12.mo51581d()
            r1 = r13 & 4
            if (r1 == 0) goto L_0x0175
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0175:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x017a
            r0 = r0 & r5
        L_0x017a:
            r25 = r31
            r28 = r32
            r16 = r33
            r26 = r37
            r27 = r38
            r23 = r7
            r17 = r8
            r24 = r10
            goto L_0x026f
        L_0x018c:
            if (r1 == 0) goto L_0x0191
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            goto L_0x0193
        L_0x0191:
            r1 = r31
        L_0x0193:
            r3 = r13 & 4
            r5 = 0
            if (r3 == 0) goto L_0x01a0
            r3 = 1
            ya0.i r3 = ya0.C112433j.m153454a(r5, r12, r5, r3)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01a2
        L_0x01a0:
            r3 = r32
        L_0x01a2:
            if (r4 == 0) goto L_0x01a6
            r4 = 0
            goto L_0x01a8
        L_0x01a6:
            r4 = r33
        L_0x01a8:
            if (r6 == 0) goto L_0x01ac
            float r6 = (float) r5
            goto L_0x01ad
        L_0x01ac:
            r6 = r8
        L_0x01ad:
            if (r9 == 0) goto L_0x01c2
            float r7 = (float) r5
            a0.o0 r8 = new a0.o0
            r29 = 0
            r24 = r8
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r24.<init>(r25, r26, r27, r28, r29)
            r7 = r8
        L_0x01c2:
            if (r17 == 0) goto L_0x01c7
            v0.a$c r8 = p721v0.C111294a.C111295a.f333227i
            goto L_0x01c8
        L_0x01c7:
            r8 = r10
        L_0x01c8:
            r9 = r13 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0257
            fy3.l<xa0.k, java.lang.Float> r9 = ya0.C66597b.f191509a
            i2.o r9 = p560i2.C33183o.Ltr
            java.lang.String r10 = "<this>"
            gy3.C87412m.m108594g(r7, r10)
            float r9 = r7.mo142920b(r9)
            int r10 = r0 >> 6
            r10 = r10 & 14
            r17 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 | r17
            java.lang.String r5 = "state"
            gy3.C87412m.m108594g(r3, r5)
            r5 = -1189098321(0xffffffffb91fccaf, float:-1.5239672E-4)
            r12.mo51557H(r5)
            r5 = 0
            w.v r5 = p720v.C111281o0.m151778a(r12, r5)
            w.h<java.lang.Float> r17 = xa0.C38468i.f101454a
            fy3.l<xa0.k, java.lang.Float> r24 = ya0.C66597b.f191509a
            r25 = r1
            b0.l0 r1 = r3.f336655a
            fy3.p<xa0.k, xa0.l, java.lang.Integer> r26 = xa0.C66241e.f190296a
            r27 = 36912(0x9030, float:5.1725E-41)
            r28 = r3
            int r3 = r10 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | r27
            int r10 = r10 << 6
            r10 = r10 & r16
            r3 = r3 | r10
            java.lang.String r10 = "lazyListState"
            gy3.C87412m.m108594g(r1, r10)
            r10 = -1929943367(0xffffffff8cf766b9, float:-3.81182E-31)
            r12.mo51557H(r10)
            r10 = r3 & 14
            r16 = r3 & 112(0x70, float:1.57E-43)
            r10 = r10 | r16
            r16 = r4
            r4 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | r10
            r10 = 0
            r27 = 0
            r31 = r1
            r32 = r26
            r33 = r9
            r34 = r12
            r35 = r4
            r36 = r27
            xa0.c r1 = xa0.C66237a.m78164a(r31, r32, r33, r34, r35, r36)
            int r3 = r3 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 576(0x240, float:8.07E-43)
            r31 = r1
            r32 = r5
            r33 = r17
            r34 = r24
            r35 = r12
            r36 = r3
            r37 = r10
            xa0.f r1 = xa0.C112146j.m152880a(r31, r32, r33, r34, r35, r36, r37)
            r12.mo51565P()
            r12.mo51565P()
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r3
            goto L_0x025f
        L_0x0257:
            r25 = r1
            r28 = r3
            r16 = r4
            r1 = r37
        L_0x025f:
            if (r2 == 0) goto L_0x0263
            r2 = 0
            goto L_0x0265
        L_0x0263:
            r2 = r38
        L_0x0265:
            r26 = r1
            r27 = r2
            r17 = r6
            r23 = r7
            r24 = r8
        L_0x026f:
            r12.mo51555G()
            r5 = 0
            r10 = 0
            r1 = r0 & 14
            r2 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r2
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r1 = r1 | r2
            int r2 = r0 >> 3
            r3 = r2 & r18
            r1 = r1 | r3
            r2 = r2 & r20
            r1 = r1 | r2
            int r2 = r0 << 9
            r3 = r2 & r21
            r1 = r1 | r3
            r2 = r2 & r22
            r18 = r1 | r2
            int r0 = r0 >> 24
            r19 = r0 & 112(0x70, float:1.57E-43)
            r20 = 1024(0x400, float:1.435E-42)
            r0 = r30
            r1 = r25
            r2 = r28
            r3 = r16
            r4 = r17
            r6 = r26
            r7 = r27
            r8 = r23
            r9 = r24
            r11 = r39
            r21 = r12
            r13 = r18
            r14 = r19
            r15 = r20
            m153441b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = r16
            r5 = r17
            r6 = r23
            r7 = r24
            r2 = r25
            r8 = r26
            r9 = r27
            r3 = r28
        L_0x02cd:
            j0.v1 r13 = r21.mo51596l()
            if (r13 != 0) goto L_0x02d4
            goto L_0x02e5
        L_0x02d4:
            ya0.c$a r14 = new ya0.c$a
            r0 = r14
            r1 = r30
            r10 = r39
            r11 = r41
            r12 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.mo51650a(r14)
        L_0x02e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ya0.C112409c.m153440a(int, v0.j, ya0.i, boolean, float, a0.n0, v0.a$c, y.b0, fy3.l, fy3.r, j0.h, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: ya0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: ya0.c$g} */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01ce, code lost:
        if (r1 == p175j0.C108504h.C60656a.f172772a) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x020f, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x023b, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0261, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0287, code lost:
        if (r2 == p175j0.C108504h.C60656a.f172772a) goto L_0x0289;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m153441b(int r30, p721v0.C65503j r31, ya0.C112430i r32, boolean r33, float r34, boolean r35, p759y.C112195b0 r36, fy3.C32226l<? super java.lang.Integer, ? extends java.lang.Object> r37, p435a0.C103177n0 r38, p721v0.C111294a.C37634c r39, p721v0.C111294a.C37633b r40, fy3.C32229r<? super ya0.C66599g, ? super java.lang.Integer, ? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r41, p175j0.C108504h r42, int r43, int r44, int r45) {
        /*
            r7 = r30
            r15 = r31
            r14 = r32
            r13 = r34
            r12 = r35
            r11 = r36
            r10 = r37
            r9 = r38
            r8 = r41
            r6 = r43
            r5 = r45
            java.lang.String r0 = "modifier"
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "state"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "flingBehavior"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "contentPadding"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "content"
            gy3.C87412m.m108594g(r8, r0)
            r0 = 365809804(0x15cdd08c, float:8.312787E-26)
            r1 = r42
            j0.h r4 = r1.mo51623z(r0)
            r0 = r5 & 1
            if (r0 == 0) goto L_0x003f
            r0 = r6 | 6
            goto L_0x004f
        L_0x003f:
            r0 = r6 & 14
            if (r0 != 0) goto L_0x004e
            boolean r0 = r4.mo51592j(r7)
            if (r0 == 0) goto L_0x004b
            r0 = 4
            goto L_0x004c
        L_0x004b:
            r0 = 2
        L_0x004c:
            r0 = r0 | r6
            goto L_0x004f
        L_0x004e:
            r0 = r6
        L_0x004f:
            r3 = r5 & 2
            r16 = 32
            r17 = 16
            if (r3 == 0) goto L_0x005a
            r0 = r0 | 48
            goto L_0x006a
        L_0x005a:
            r3 = r6 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x006a
            boolean r3 = r4.mo51619x(r15)
            if (r3 == 0) goto L_0x0067
            r3 = 32
            goto L_0x0069
        L_0x0067:
            r3 = 16
        L_0x0069:
            r0 = r0 | r3
        L_0x006a:
            r3 = r5 & 4
            if (r3 == 0) goto L_0x0071
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0081
        L_0x0071:
            r3 = r6 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0081
            boolean r3 = r4.mo51619x(r14)
            if (r3 == 0) goto L_0x007e
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0080
        L_0x007e:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0080:
            r0 = r0 | r3
        L_0x0081:
            r3 = r5 & 8
            if (r3 == 0) goto L_0x0088
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x009c
        L_0x0088:
            r3 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x009c
            r3 = r33
            boolean r18 = r4.mo51586g(r3)
            if (r18 == 0) goto L_0x0097
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0099
        L_0x0097:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r0 = r0 | r18
            goto L_0x009e
        L_0x009c:
            r3 = r33
        L_0x009e:
            r18 = r5 & 16
            if (r18 == 0) goto L_0x00a5
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b9
        L_0x00a5:
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r6 & r18
            if (r18 != 0) goto L_0x00b9
            boolean r18 = r4.mo51588h(r13)
            if (r18 == 0) goto L_0x00b5
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b7
        L_0x00b5:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00b7:
            r0 = r0 | r18
        L_0x00b9:
            r18 = r5 & 32
            r19 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x00c4
            r18 = 196608(0x30000, float:2.75506E-40)
        L_0x00c1:
            r0 = r0 | r18
            goto L_0x00d4
        L_0x00c4:
            r18 = r6 & r19
            if (r18 != 0) goto L_0x00d4
            boolean r18 = r4.mo51586g(r12)
            if (r18 == 0) goto L_0x00d1
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00d1:
            r18 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00c1
        L_0x00d4:
            r18 = r5 & 64
            r20 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00df
            r18 = 1572864(0x180000, float:2.204052E-39)
        L_0x00dc:
            r0 = r0 | r18
            goto L_0x00ef
        L_0x00df:
            r18 = r6 & r20
            if (r18 != 0) goto L_0x00ef
            boolean r18 = r4.mo51619x(r11)
            if (r18 == 0) goto L_0x00ec
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00ec:
            r18 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00dc
        L_0x00ef:
            r1 = r5 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00f7
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00f5:
            r0 = r0 | r1
            goto L_0x0108
        L_0x00f7:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r6
            if (r1 != 0) goto L_0x0108
            boolean r1 = r4.mo51619x(r10)
            if (r1 == 0) goto L_0x0105
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x0105:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00f5
        L_0x0108:
            r1 = r5 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0110
            r1 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x010e:
            r0 = r0 | r1
            goto L_0x0121
        L_0x0110:
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r6
            if (r1 != 0) goto L_0x0121
            boolean r1 = r4.mo51619x(r9)
            if (r1 == 0) goto L_0x011e
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x011e:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x010e
        L_0x0121:
            r1 = r5 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x012c
            r18 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r18
            r2 = r39
            goto L_0x0141
        L_0x012c:
            r18 = 1879048192(0x70000000, float:1.58456325E29)
            r18 = r6 & r18
            r2 = r39
            if (r18 != 0) goto L_0x0141
            boolean r21 = r4.mo51619x(r2)
            if (r21 == 0) goto L_0x013d
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013f
        L_0x013d:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013f:
            r0 = r0 | r21
        L_0x0141:
            r2 = r5 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x014a
            r21 = r44 | 6
            r3 = r40
            goto L_0x0160
        L_0x014a:
            r21 = r44 & 14
            r3 = r40
            if (r21 != 0) goto L_0x015e
            boolean r21 = r4.mo51619x(r3)
            if (r21 == 0) goto L_0x0159
            r21 = 4
            goto L_0x015b
        L_0x0159:
            r21 = 2
        L_0x015b:
            r21 = r44 | r21
            goto L_0x0160
        L_0x015e:
            r21 = r44
        L_0x0160:
            r3 = r5 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0169
            r3 = r21 | 48
        L_0x0166:
            r21 = r3
            goto L_0x0179
        L_0x0169:
            r3 = r44 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0179
            boolean r3 = r4.mo51619x(r8)
            if (r3 == 0) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            r16 = 16
        L_0x0176:
            r3 = r21 | r16
            goto L_0x0166
        L_0x0179:
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r3 & r0
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x0199
            r3 = r21 & 91
            r5 = 18
            if (r3 != r5) goto L_0x0199
            boolean r3 = r4.mo51575a()
            if (r3 != 0) goto L_0x018f
            goto L_0x0199
        L_0x018f:
            r4.mo51581d()
            r10 = r39
            r11 = r40
            r1 = r4
            goto L_0x040a
        L_0x0199:
            if (r1 == 0) goto L_0x01a1
            int r1 = p721v0.C111294a.f333218a
            v0.a$c r1 = p721v0.C111294a.C111295a.f333227i
            r5 = r1
            goto L_0x01a3
        L_0x01a1:
            r5 = r39
        L_0x01a3:
            if (r2 == 0) goto L_0x01ab
            int r1 = p721v0.C111294a.f333218a
            v0.a$b r1 = p721v0.C111294a.C111295a.f333229k
            r3 = r1
            goto L_0x01ad
        L_0x01ab:
            r3 = r40
        L_0x01ad:
            if (r7 < 0) goto L_0x01b2
            r16 = 1
            goto L_0x01b4
        L_0x01b2:
            r16 = 0
        L_0x01b4:
            if (r16 == 0) goto L_0x043d
            int r2 = r0 >> 18
            r1 = 1157296644(0x44faf204, float:2007.563)
            r4.mo51557H(r1)
            boolean r16 = r4.mo51619x(r11)
            java.lang.Object r1 = r4.mo51606q()
            if (r16 != 0) goto L_0x01d1
            int r16 = p175j0.C108504h.f324828a
            r16 = r2
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r1 != r2) goto L_0x01db
            goto L_0x01d3
        L_0x01d1:
            r16 = r2
        L_0x01d3:
            ya0.c$b r1 = new ya0.c$b
            r1.<init>(r11)
            r4.mo51553F(r1)
        L_0x01db:
            r4.mo51565P()
            fy3.a r1 = (fy3.C32224a) r1
            j0.y0 r2 = r14.f336660f
            j0.d2 r2 = (p175j0.C108494d2) r2
            r2.setValue(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            int r22 = r0 >> 6
            r22 = r22 & 14
            r23 = r3
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.mo51557H(r3)
            boolean r3 = r4.mo51619x(r14)
            boolean r2 = r4.mo51619x(r2)
            r2 = r2 | r3
            java.lang.Object r3 = r4.mo51606q()
            r6 = 0
            if (r2 != 0) goto L_0x0211
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r2) goto L_0x0219
        L_0x0211:
            ya0.c$c r3 = new ya0.c$c
            r3.<init>(r14, r7, r6)
            r4.mo51553F(r3)
        L_0x0219:
            r4.mo51565P()
            fy3.p r3 = (fy3.C32227p) r3
            r2 = r0 & 14
            r2 = r2 | 64
            p175j0.C60655g0.m70932c(r1, r3, r4, r2)
            r1 = r22 | 64
            r2 = 1157296644(0x44faf204, float:2007.563)
            r4.mo51557H(r2)
            boolean r2 = r4.mo51619x(r14)
            java.lang.Object r3 = r4.mo51606q()
            if (r2 != 0) goto L_0x023d
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r2) goto L_0x0245
        L_0x023d:
            ya0.c$d r3 = new ya0.c$d
            r3.<init>(r14, r6)
            r4.mo51553F(r3)
        L_0x0245:
            r4.mo51565P()
            fy3.p r3 = (fy3.C32227p) r3
            p175j0.C60655g0.m70932c(r14, r3, r4, r1)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r4.mo51557H(r2)
            boolean r2 = r4.mo51619x(r14)
            java.lang.Object r3 = r4.mo51606q()
            if (r2 != 0) goto L_0x0263
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r2) goto L_0x026b
        L_0x0263:
            ya0.c$e r3 = new ya0.c$e
            r3.<init>(r14, r6)
            r4.mo51553F(r3)
        L_0x026b:
            r4.mo51565P()
            fy3.p r3 = (fy3.C32227p) r3
            p175j0.C60655g0.m70932c(r14, r3, r4, r1)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r4.mo51557H(r1)
            boolean r1 = r4.mo51619x(r14)
            java.lang.Object r2 = r4.mo51606q()
            if (r1 != 0) goto L_0x0289
            int r1 = p175j0.C108504h.f324828a
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r1) goto L_0x0291
        L_0x0289:
            ya0.h r2 = new ya0.h
            r2.<init>(r14)
            r4.mo51553F(r2)
        L_0x0291:
            r4.mo51565P()
            r17 = r2
            ya0.h r17 = (ya0.C112429h) r17
            ya0.a r3 = new ya0.a
            r1 = r12 ^ 1
            r3.<init>(r1, r12)
            if (r12 == 0) goto L_0x0364
            r2 = -264483715(0xfffffffff03c4c7d, float:-2.331026E29)
            r4.mo51557H(r2)
            b0.l0 r2 = r14.f336655a
            a0.a r22 = p435a0.C103111a.f304234a
            java.lang.String r1 = "alignment"
            gy3.C87412m.m108594g(r5, r1)
            a0.a$i r1 = new a0.a$i
            r24 = r0
            a0.c r0 = new a0.c
            r0.<init>(r5)
            r25 = r2
            r2 = 0
            r1.<init>(r13, r2, r0, r6)
            r26 = 0
            r0 = 5
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Integer r27 = java.lang.Integer.valueOf(r30)
            r6[r2] = r27
            r2 = 1
            r6[r2] = r10
            r2 = 2
            r6[r2] = r3
            r2 = 3
            r6[r2] = r8
            r2 = 4
            r6[r2] = r17
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r4.mo51557H(r2)
            r2 = 0
            r18 = 0
        L_0x02df:
            if (r2 >= r0) goto L_0x02ed
            r0 = r6[r2]
            boolean r0 = r4.mo51619x(r0)
            r18 = r18 | r0
            int r2 = r2 + 1
            r0 = 5
            goto L_0x02df
        L_0x02ed:
            java.lang.Object r0 = r4.mo51606q()
            if (r18 != 0) goto L_0x0306
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r0 != r2) goto L_0x02fa
            goto L_0x0306
        L_0x02fa:
            r18 = r1
            r15 = r4
            r8 = r16
            r7 = r24
            r16 = r25
            r24 = r5
            goto L_0x0327
        L_0x0306:
            ya0.c$f r6 = new ya0.c$f
            r2 = r24
            r0 = r6
            r18 = r1
            r1 = r30
            r7 = r2
            r8 = r16
            r16 = r25
            r2 = r37
            r15 = r4
            r4 = r41
            r24 = r5
            r5 = r17
            r9 = r6
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.mo51553F(r9)
            r0 = r9
        L_0x0327:
            r15.mo51565P()
            fy3.l r0 = (fy3.C32226l) r0
            int r1 = r7 >> 3
            r1 = r1 & 14
            r2 = r8 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r7 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r21 << 15
            r2 = r2 & r19
            r1 = r1 | r2
            r2 = r7 & r20
            r1 = r1 | r2
            r19 = 128(0x80, float:1.794E-43)
            r8 = r31
            r9 = r16
            r10 = r38
            r11 = r33
            r12 = r18
            r5 = r13
            r13 = r23
            r4 = r14
            r14 = r36
            r2 = r15
            r15 = r26
            r16 = r0
            r17 = r2
            r18 = r1
            p004b0.C103937e.m138656a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.mo51565P()
            r1 = r2
            r2 = r23
            goto L_0x0407
        L_0x0364:
            r7 = r0
            r2 = r4
            r24 = r5
            r5 = r13
            r4 = r14
            r8 = r16
            r0 = -264482559(0xfffffffff03c5101, float:-2.3312444E29)
            r2.mo51557H(r0)
            b0.l0 r9 = r4.f336655a
            a0.a r0 = p435a0.C103111a.f304234a
            java.lang.String r0 = "alignment"
            r15 = r23
            gy3.C87412m.m108594g(r15, r0)
            a0.a$i r12 = new a0.a$i
            a0.b r0 = new a0.b
            r0.<init>(r15)
            r1 = 1
            r12.<init>(r5, r1, r0, r6)
            r16 = 0
            r0 = 5
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r30)
            r11 = 0
            r6[r11] = r10
            r6[r1] = r37
            r1 = 2
            r6[r1] = r3
            r1 = 3
            r6[r1] = r41
            r1 = 4
            r6[r1] = r17
            r1 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r2.mo51557H(r1)
            r1 = 0
        L_0x03a6:
            if (r1 >= r0) goto L_0x03b2
            r10 = r6[r1]
            boolean r10 = r2.mo51619x(r10)
            r11 = r11 | r10
            int r1 = r1 + 1
            goto L_0x03a6
        L_0x03b2:
            java.lang.Object r0 = r2.mo51606q()
            if (r11 != 0) goto L_0x03c1
            int r1 = p175j0.C108504h.f324828a
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r0 != r1) goto L_0x03bf
            goto L_0x03c1
        L_0x03bf:
            r14 = r2
            goto L_0x03d5
        L_0x03c1:
            ya0.c$g r10 = new ya0.c$g
            r0 = r10
            r1 = r30
            r14 = r2
            r2 = r37
            r4 = r41
            r5 = r17
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.mo51553F(r10)
        L_0x03d5:
            r14.mo51565P()
            fy3.l r0 = (fy3.C32226l) r0
            int r1 = r7 >> 3
            r1 = r1 & 14
            r2 = r8 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r7 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r7 >> 12
            r2 = r2 & r19
            r1 = r1 | r2
            r2 = r7 & r20
            r18 = r1 | r2
            r19 = 128(0x80, float:1.794E-43)
            r8 = r31
            r10 = r38
            r11 = r33
            r13 = r24
            r1 = r14
            r14 = r36
            r2 = r15
            r15 = r16
            r16 = r0
            r17 = r1
            p004b0.C103937e.m138657b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.mo51565P()
        L_0x0407:
            r11 = r2
            r10 = r24
        L_0x040a:
            j0.v1 r15 = r1.mo51596l()
            if (r15 != 0) goto L_0x0411
            goto L_0x043c
        L_0x0411:
            ya0.c$h r14 = new ya0.c$h
            r0 = r14
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r12 = r41
            r13 = r43
            r28 = r14
            r14 = r44
            r29 = r15
            r15 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r28
            r0 = r29
            r0.mo51650a(r1)
        L_0x043c:
            return
        L_0x043d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "pageCount must be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ya0.C112409c.m153441b(int, v0.j, ya0.i, boolean, float, boolean, y.b0, fy3.l, a0.n0, v0.a$c, v0.a$b, fy3.r, j0.h, int, int, int):void");
    }
}
