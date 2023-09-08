package p247u3;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import d14.C45252f;
import d14.C45253g;
import d14.C58063m0;
import d14.C58080r;
import d14.C58095x0;
import d14.C58100z0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.ResultKt;
import p247u3.C65056f2;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: u3.o0 */
public final class C65097o0<Key, Value> {

    /* renamed from: a */
    public final C65096o<Boolean> f187367a = new C65096o<>((Object) null, 1, (C8480h) null);

    /* renamed from: b */
    public final C65096o<C13598b0> f187368b = new C65096o<>((Object) null, 1, (C8480h) null);

    /* renamed from: c */
    public final C45252f<C65081m1<Value>> f187369c = C65180v1.m76764a(new C65100c(this, (C15601d) null));

    /* renamed from: d */
    public final C32226l<C15601d<? super C65145q1<Key, Value>>, Object> f187370d;

    /* renamed from: e */
    public final Key f187371e;

    /* renamed from: f */
    public final C65078l1 f187372f;

    /* renamed from: u3.o0$a */
    public static final class C65098a<Key, Value> {

        /* renamed from: a */
        public final C65125q0<Key, Value> f187373a;

        /* renamed from: b */
        public final C65164r1<Key, Value> f187374b;

        public C65098a(C65125q0<Key, Value> q0Var, C65164r1<Key, Value> r1Var) {
            C87412m.m108594g(q0Var, AppBrandFileCleaner.f238098c);
            this.f187373a = q0Var;
            this.f187374b = r1Var;
        }
    }

    /* renamed from: u3.o0$b */
    public final class C65099b<Key, Value> implements C65053e2 {

        /* renamed from: a */
        public final C65125q0<Key, Value> f187375a;

        /* renamed from: b */
        public final /* synthetic */ C65097o0 f187376b;

        public C65099b(C65097o0 o0Var, C65125q0<Key, Value> q0Var, C65096o<C13598b0> oVar) {
            C87412m.m108594g(q0Var, "pageFetcherSnapshot");
            C87412m.m108594g(oVar, "retryEventBus");
            this.f187376b = o0Var;
            this.f187375a = q0Var;
        }

        /* renamed from: a */
        public void mo89249a() {
            this.f187376b.f187367a.mo89296a(Boolean.TRUE);
        }

        /* renamed from: b */
        public void mo89250b(C65056f2 f2Var) {
            C87412m.m108594g(f2Var, "viewportHint");
            C65125q0<Key, Value> q0Var = this.f187375a;
            q0Var.getClass();
            if (f2Var instanceof C65056f2.C65057a) {
                q0Var.f187455b = (C65056f2.C65057a) f2Var;
            }
            ((C58100z0) q0Var.f187454a).mo82832d(f2Var);
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcher$flow$1", mo125469f = "PageFetcher.kt", mo125470l = {254}, mo125471m = "invokeSuspend")
    /* renamed from: u3.o0$c */
    public static final class C65100c extends C91594j implements C32227p<C65189w1<C65081m1<Value>>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187377d;

        /* renamed from: e */
        public int f187378e;

        /* renamed from: f */
        public final /* synthetic */ C65097o0 f187379f;

        @C91590f(mo125468c = "androidx.paging.PageFetcher$flow$1$1", mo125469f = "PageFetcher.kt", mo125470l = {58, 58}, mo125471m = "invokeSuspend")
        /* renamed from: u3.o0$c$a */
        public static final class C65101a extends C91594j implements C32227p<C45253g<? super Boolean>, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f187380d;

            /* renamed from: e */
            public int f187381e;

            public C65101a(C65171t1 t1Var, C15601d dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C87412m.m108594g(dVar, "completion");
                C65101a aVar = new C65101a((C65171t1) null, dVar);
                aVar.f187380d = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C65101a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d14.g} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r6.f187381e
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0023
                    if (r1 == r4) goto L_0x0019
                    if (r1 != r3) goto L_0x0011
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L_0x0041
                L_0x0011:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L_0x0019:
                    java.lang.Object r1 = r6.f187380d
                    d14.g r1 = (d14.C45253g) r1
                    kotlin.ResultKt.throwOnFailure(r7)
                    u3.s1$a r7 = (p247u3.C37336s1.C37337a) r7
                    goto L_0x002c
                L_0x0023:
                    kotlin.ResultKt.throwOnFailure(r7)
                    java.lang.Object r7 = r6.f187380d
                    r1 = r7
                    d14.g r1 = (d14.C45253g) r1
                    r7 = r2
                L_0x002c:
                    u3.s1$a r5 = p247u3.C37336s1.C37337a.LAUNCH_INITIAL_REFRESH
                    if (r7 != r5) goto L_0x0031
                    goto L_0x0032
                L_0x0031:
                    r4 = 0
                L_0x0032:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                    r6.f187380d = r2
                    r6.f187381e = r3
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L_0x0041
                    return r0
                L_0x0041:
                    rx3.b0 r7 = rx3.C13598b0.f38549a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p247u3.C65097o0.C65100c.C65101a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @C91590f(mo125468c = "androidx.paging.PageFetcher$flow$1$2", mo125469f = "PageFetcher.kt", mo125470l = {63, 66, 69}, mo125471m = "invokeSuspend")
        /* renamed from: u3.o0$c$b */
        public static final class C65102b extends C91594j implements C32228q<C65098a<Key, Value>, Boolean, C15601d<? super C65098a<Key, Value>>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f187382d;

            /* renamed from: e */
            public /* synthetic */ boolean f187383e;

            /* renamed from: f */
            public Object f187384f;

            /* renamed from: g */
            public Object f187385g;

            /* renamed from: h */
            public int f187386h;

            /* renamed from: i */
            public final /* synthetic */ C65100c f187387i;

            /* renamed from: u3.o0$c$b$a */
            public static final /* synthetic */ class C65103a extends C24565l implements C32224a<C13598b0> {
                public C65103a(C65097o0 o0Var) {
                    super(0, o0Var, C65097o0.class, "refresh", "refresh()V", 0);
                }

                public Object invoke() {
                    ((C65097o0) this.receiver).f187367a.mo89296a(Boolean.TRUE);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65102b(C65100c cVar, C65171t1 t1Var, C15601d dVar) {
                super(3, dVar);
                this.f187387i = cVar;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                C15601d dVar = (C15601d) obj3;
                C87412m.m108594g(dVar, "continuation");
                C65102b bVar = new C65102b(this.f187387i, (C65171t1) null, dVar);
                bVar.f187382d = (C65098a) obj;
                bVar.f187383e = booleanValue;
                return bVar.invokeSuspend(C13598b0.f38549a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: T} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: T} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: T} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: u3.o0$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: T} */
            /* JADX WARNING: type inference failed for: r5v1, types: [java.util.concurrent.CancellationException, java.lang.Object] */
            /* JADX WARNING: type inference failed for: r5v5 */
            /* JADX WARNING: type inference failed for: r5v9 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x00f4  */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00f8  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x0122  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x0125  */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    r19 = this;
                    r0 = r19
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f187386h
                    r3 = 2
                    r4 = 3
                    r5 = 0
                    r6 = 1
                    if (r2 == 0) goto L_0x0063
                    if (r2 == r6) goto L_0x004d
                    if (r2 == r3) goto L_0x002c
                    if (r2 != r4) goto L_0x0024
                    boolean r1 = r0.f187383e
                    java.lang.Object r2 = r0.f187384f
                    gy3.f0 r2 = (gy3.C8479f0) r2
                    java.lang.Object r3 = r0.f187382d
                    u3.o0$a r3 = (p247u3.C65097o0.C65098a) r3
                    kotlin.ResultKt.throwOnFailure(r20)
                    r4 = r20
                    r8 = r0
                    goto L_0x00ed
                L_0x0024:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x002c:
                    boolean r2 = r0.f187383e
                    java.lang.Object r7 = r0.f187385g
                    gy3.f0 r7 = (gy3.C8479f0) r7
                    java.lang.Object r8 = r0.f187384f
                    gy3.f0 r8 = (gy3.C8479f0) r8
                    java.lang.Object r9 = r0.f187382d
                    u3.o0$a r9 = (p247u3.C65097o0.C65098a) r9
                    kotlin.ResultKt.throwOnFailure(r20)
                    r10 = r20
                    r6 = r5
                    r11 = r8
                    r3 = r9
                    r4 = 2
                    r5 = 3
                    r8 = 1
                    r9 = r0
                    r18 = r2
                    r2 = r1
                    r1 = r18
                    goto L_0x00cb
                L_0x004d:
                    boolean r2 = r0.f187383e
                    java.lang.Object r7 = r0.f187385g
                    gy3.f0 r7 = (gy3.C8479f0) r7
                    java.lang.Object r8 = r0.f187384f
                    gy3.f0 r8 = (gy3.C8479f0) r8
                    java.lang.Object r9 = r0.f187382d
                    u3.o0$a r9 = (p247u3.C65097o0.C65098a) r9
                    kotlin.ResultKt.throwOnFailure(r20)
                    r10 = r9
                    r9 = r8
                    r8 = r20
                    goto L_0x0093
                L_0x0063:
                    kotlin.ResultKt.throwOnFailure(r20)
                    java.lang.Object r2 = r0.f187382d
                    r9 = r2
                    u3.o0$a r9 = (p247u3.C65097o0.C65098a) r9
                    boolean r2 = r0.f187383e
                    gy3.f0 r7 = new gy3.f0
                    r7.<init>()
                    u3.o0$c r8 = r0.f187387i
                    u3.o0 r8 = r8.f187379f
                    if (r9 == 0) goto L_0x007f
                    u3.q0<Key, Value> r10 = r9.f187373a
                    if (r10 == 0) goto L_0x007f
                    u3.q1<Key, Value> r10 = r10.f187462i
                    goto L_0x0080
                L_0x007f:
                    r10 = r5
                L_0x0080:
                    r0.f187382d = r9
                    r0.f187384f = r7
                    r0.f187385g = r7
                    r0.f187383e = r2
                    r0.f187386h = r6
                    java.lang.Object r8 = r8.mo89297a(r10, r0)
                    if (r8 != r1) goto L_0x0091
                    return r1
                L_0x0091:
                    r10 = r9
                    r9 = r7
                L_0x0093:
                    u3.q1 r8 = (p247u3.C65145q1) r8
                    r7.f27484d = r8
                    r8 = r0
                    r6 = r5
                    r3 = r10
                    r4 = 2
                    r5 = 3
                    r7 = 1
                    r18 = r2
                    r2 = r1
                    r1 = r18
                L_0x00a2:
                    T r10 = r9.f27484d
                    u3.q1 r10 = (p247u3.C65145q1) r10
                    java.util.concurrent.atomic.AtomicBoolean r10 = r10.f187555b
                    boolean r10 = r10.get()
                    if (r10 == 0) goto L_0x00d3
                    u3.o0$c r10 = r8.f187387i
                    u3.o0 r10 = r10.f187379f
                    T r11 = r9.f27484d
                    u3.q1 r11 = (p247u3.C65145q1) r11
                    r8.f187382d = r3
                    r8.f187384f = r9
                    r8.f187385g = r9
                    r8.f187383e = r1
                    r8.f187386h = r4
                    java.lang.Object r10 = r10.mo89297a(r11, r8)
                    if (r10 != r2) goto L_0x00c7
                    return r2
                L_0x00c7:
                    r11 = r9
                    r9 = r8
                    r8 = r7
                    r7 = r11
                L_0x00cb:
                    u3.q1 r10 = (p247u3.C65145q1) r10
                    r7.f27484d = r10
                    r7 = r8
                    r8 = r9
                    r9 = r11
                    goto L_0x00a2
                L_0x00d3:
                    if (r3 == 0) goto L_0x00f4
                    u3.q0<Key, Value> r4 = r3.f187373a
                    if (r4 == 0) goto L_0x00f4
                    r8.f187382d = r3
                    r8.f187384f = r9
                    r8.f187385g = r6
                    r8.f187383e = r1
                    r8.f187386h = r5
                    java.lang.Object r4 = r4.mo89301c(r8)
                    if (r4 != r2) goto L_0x00ea
                    return r2
                L_0x00ea:
                    r5 = r6
                    r6 = r7
                    r2 = r9
                L_0x00ed:
                    u3.r1 r4 = (p247u3.C65164r1) r4
                    r14 = r1
                    r9 = r2
                    r7 = r6
                    r6 = r4
                    goto L_0x00f6
                L_0x00f4:
                    r14 = r1
                    r5 = r6
                L_0x00f6:
                    if (r6 == 0) goto L_0x00fb
                    java.util.List<u3.q1$b$b<Key, Value>> r1 = r6.f187590a
                    goto L_0x00fc
                L_0x00fb:
                    r1 = r5
                L_0x00fc:
                    if (r1 == 0) goto L_0x0107
                    boolean r1 = r1.isEmpty()
                    if (r1 == 0) goto L_0x0105
                    goto L_0x0107
                L_0x0105:
                    r1 = 0
                    goto L_0x0108
                L_0x0107:
                    r1 = 1
                L_0x0108:
                    if (r1 == 0) goto L_0x011d
                    if (r3 == 0) goto L_0x011d
                    u3.r1<Key, Value> r1 = r3.f187374b
                    if (r1 == 0) goto L_0x011d
                    java.util.List<u3.q1$b$b<Key, Value>> r1 = r1.f187590a
                    if (r1 == 0) goto L_0x011d
                    boolean r1 = r1.isEmpty()
                    r1 = r1 ^ r7
                    if (r1 != r7) goto L_0x011d
                    u3.r1<Key, Value> r6 = r3.f187374b
                L_0x011d:
                    if (r6 == 0) goto L_0x0122
                    java.lang.Integer r1 = r6.f187591b
                    goto L_0x0123
                L_0x0122:
                    r1 = r5
                L_0x0123:
                    if (r1 != 0) goto L_0x0133
                    if (r3 == 0) goto L_0x012e
                    u3.r1<Key, Value> r1 = r3.f187374b
                    if (r1 == 0) goto L_0x012e
                    java.lang.Integer r1 = r1.f187591b
                    goto L_0x012f
                L_0x012e:
                    r1 = r5
                L_0x012f:
                    if (r1 == 0) goto L_0x0133
                    u3.r1<Key, Value> r6 = r3.f187374b
                L_0x0133:
                    if (r6 == 0) goto L_0x0140
                    T r1 = r9.f27484d
                    u3.q1 r1 = (p247u3.C65145q1) r1
                    java.lang.Object r1 = r1.mo72455b(r6)
                    if (r1 == 0) goto L_0x0140
                    goto L_0x0146
                L_0x0140:
                    u3.o0$c r1 = r8.f187387i
                    u3.o0 r1 = r1.f187379f
                    Key r1 = r1.f187371e
                L_0x0146:
                    r10 = r1
                    if (r3 == 0) goto L_0x0152
                    u3.q0<Key, Value> r1 = r3.f187373a
                    if (r1 == 0) goto L_0x0152
                    a14.w r1 = r1.f187459f
                    a14.C53973z1.C53974a.m60623a(r1, r5, r7, r5)
                L_0x0152:
                    u3.o0$a r1 = new u3.o0$a
                    u3.q0 r2 = new u3.q0
                    T r3 = r9.f27484d
                    r11 = r3
                    u3.q1 r11 = (p247u3.C65145q1) r11
                    u3.o0$c r3 = r8.f187387i
                    u3.o0 r3 = r3.f187379f
                    u3.l1 r12 = r3.f187372f
                    u3.o<rx3.b0> r3 = r3.f187368b
                    d14.f<T> r13 = r3.f187366b
                    r15 = 0
                    u3.o0$c$b$a r3 = new u3.o0$c$b$a
                    u3.o0$c r4 = r8.f187387i
                    u3.o0 r4 = r4.f187379f
                    r3.<init>(r4)
                    r9 = r2
                    r16 = r6
                    r17 = r3
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    r1.<init>(r2, r6)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p247u3.C65097o0.C65100c.C65102b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: u3.o0$c$c */
        public static final class C65104c implements C45253g<C65081m1<Value>> {

            /* renamed from: d */
            public final /* synthetic */ C65189w1 f187388d;

            public C65104c(C65189w1 w1Var) {
                this.f187388d = w1Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                Object o = this.f187388d.mo75536o((C65081m1) obj, dVar);
                return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", mo125469f = "PageFetcher.kt", mo125470l = {105}, mo125471m = "invokeSuspend")
        /* renamed from: u3.o0$c$d */
        public static final class C65105d extends C91594j implements C32228q<C45253g<? super C65081m1<Value>>, C65098a<Key, Value>, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f187389d;

            /* renamed from: e */
            public /* synthetic */ Object f187390e;

            /* renamed from: f */
            public int f187391f;

            /* renamed from: g */
            public final /* synthetic */ C65100c f187392g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65105d(C15601d dVar, C65100c cVar, C65171t1 t1Var) {
                super(3, dVar);
                this.f187392g = cVar;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C15601d dVar = (C15601d) obj3;
                C87412m.m108594g(gVar, "$this$create");
                C87412m.m108594g(dVar, "continuation");
                C65105d dVar2 = new C65105d(dVar, this.f187392g, (C65171t1) null);
                dVar2.f187389d = gVar;
                dVar2.f187390e = obj2;
                return dVar2.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f187391f;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C65098a aVar2 = (C65098a) this.f187390e;
                    C65097o0 o0Var = this.f187392g.f187379f;
                    C65125q0<Key, Value> q0Var = aVar2.f187373a;
                    o0Var.getClass();
                    C45252f<C65086n0<Value>> fVar = q0Var.f187460g;
                    C65097o0 o0Var2 = this.f187392g.f187379f;
                    C65081m1 m1Var = new C65081m1(fVar, new C65099b(o0Var2, aVar2.f187373a, o0Var2.f187368b));
                    this.f187391f = 1;
                    if (((C45253g) this.f187389d).emit(m1Var, this) == aVar) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65100c(C65097o0 o0Var, C15601d dVar) {
            super(2, dVar);
            this.f187379f = o0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            C65100c cVar = new C65100c(this.f187379f, dVar);
            cVar.f187377d = obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65100c) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f187378e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f187379f.getClass();
                C58080r rVar = new C58080r(new C65101a((C65171t1) null, (C15601d) null), this.f187379f.f187367a.f187366b);
                C65102b bVar = new C65102b(this, (C65171t1) null, (C15601d) null);
                Object obj2 = C65197y.f187697a;
                C45252f a = C65180v1.m76764a(new C65190x(new C58063m0(new C58095x0(new C65185w(rVar, (Object) null, bVar, (C15601d) null))), new C65105d((C15601d) null, this, (C65171t1) null), (C15601d) null));
                C65104c cVar = new C65104c((C65189w1) this.f187377d);
                this.f187378e = 1;
                if (a.mo31880a(cVar, this) == aVar) {
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

    @C91590f(mo125468c = "androidx.paging.PageFetcher", mo125469f = "PageFetcher.kt", mo125470l = {211}, mo125471m = "generateNewPagingSource")
    /* renamed from: u3.o0$d */
    public static final class C65106d extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187393d;

        /* renamed from: e */
        public int f187394e;

        /* renamed from: f */
        public final /* synthetic */ C65097o0 f187395f;

        /* renamed from: g */
        public Object f187396g;

        /* renamed from: h */
        public Object f187397h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65106d(C65097o0 o0Var, C15601d dVar) {
            super(dVar);
            this.f187395f = o0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187393d = obj;
            this.f187394e |= Integer.MIN_VALUE;
            return this.f187395f.mo89297a((C65145q1) null, this);
        }
    }

    /* renamed from: u3.o0$e */
    public static final /* synthetic */ class C65107e extends C24565l implements C32224a<C13598b0> {
        public C65107e(C65097o0 o0Var) {
            super(0, o0Var, C65097o0.class, "invalidate", "invalidate()V", 0);
        }

        public Object invoke() {
            ((C65097o0) this.receiver).f187367a.mo89296a(Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u3.o0$f */
    public static final /* synthetic */ class C65108f extends C24565l implements C32224a<C13598b0> {
        public C65108f(C65097o0 o0Var) {
            super(0, o0Var, C65097o0.class, "invalidate", "invalidate()V", 0);
        }

        public Object invoke() {
            ((C65097o0) this.receiver).f187367a.mo89296a(Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    public C65097o0(C32226l<? super C15601d<? super C65145q1<Key, Value>>, ? extends Object> lVar, Key key, C65078l1 l1Var, C37336s1<Key, Value> s1Var) {
        C87412m.m108594g(lVar, "pagingSourceFactory");
        C87412m.m108594g(l1Var, "config");
        this.f187370d = lVar;
        this.f187371e = key;
        this.f187372f = l1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89297a(p247u3.C65145q1<Key, Value> r5, wx3.C15601d<? super p247u3.C65145q1<Key, Value>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p247u3.C65097o0.C65106d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            u3.o0$d r0 = (p247u3.C65097o0.C65106d) r0
            int r1 = r0.f187394e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f187394e = r1
            goto L_0x0018
        L_0x0013:
            u3.o0$d r0 = new u3.o0$d
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f187393d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187394e
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f187397h
            u3.q1 r5 = (p247u3.C65145q1) r5
            java.lang.Object r0 = r0.f187396g
            u3.o0 r0 = (p247u3.C65097o0) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r6)
            fy3.l<wx3.d<? super u3.q1<Key, Value>>, java.lang.Object> r6 = r4.f187370d
            r0.f187396g = r4
            r0.f187397h = r5
            r0.f187394e = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r0 = r4
        L_0x004a:
            u3.q1 r6 = (p247u3.C65145q1) r6
            boolean r1 = r6 instanceof p247u3.C65030c0
            if (r1 == 0) goto L_0x005a
            r1 = r6
            u3.c0 r1 = (p247u3.C65030c0) r1
            u3.l1 r2 = r0.f187372f
            int r2 = r2.f187298a
            r1.mo89233e(r2)
        L_0x005a:
            if (r6 == r5) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x007f
            u3.o0$e r1 = new u3.o0$e
            r1.<init>(r0)
            r6.getClass()
            java.util.concurrent.CopyOnWriteArrayList<fy3.a<rx3.b0>> r2 = r6.f187554a
            r2.add(r1)
            if (r5 == 0) goto L_0x0079
            u3.o0$f r1 = new u3.o0$f
            r1.<init>(r0)
            java.util.concurrent.CopyOnWriteArrayList<fy3.a<rx3.b0>> r0 = r5.f187554a
            r0.remove(r1)
        L_0x0079:
            if (r5 == 0) goto L_0x007e
            r5.mo89308c()
        L_0x007e:
            return r6
        L_0x007f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65097o0.mo89297a(u3.q1, wx3.d):java.lang.Object");
    }
}
