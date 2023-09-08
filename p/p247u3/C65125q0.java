package p247u3;

import a14.C0000n0;
import a14.C0002w;
import a14.C53873d2;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import d14.C45252f;
import d14.C45253g;
import d14.C58017a1;
import d14.C58022c;
import d14.C58042h;
import d14.C58085t0;
import d14.C58095x0;
import d14.C58100z0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import p247u3.C65056f2;
import p247u3.C65060g0;
import p247u3.C65145q1;
import p247u3.C65173u0;
import rx3.C13598b0;
import rx3.C13603j;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: u3.q0 */
public final class C65125q0<Key, Value> {

    /* renamed from: a */
    public final C58085t0<C65056f2> f187454a;

    /* renamed from: b */
    public C65056f2.C65057a f187455b;

    /* renamed from: c */
    public final AtomicBoolean f187456c;

    /* renamed from: d */
    public final C54625h<C65086n0<Value>> f187457d;

    /* renamed from: e */
    public final C65173u0.C65174a<Key, Value> f187458e;

    /* renamed from: f */
    public final C0002w f187459f;

    /* renamed from: g */
    public final C45252f<C65086n0<Value>> f187460g;

    /* renamed from: h */
    public final Key f187461h;

    /* renamed from: i */
    public final C65145q1<Key, Value> f187462i;

    /* renamed from: j */
    public final C65078l1 f187463j;

    /* renamed from: k */
    public final C45252f<C13598b0> f187464k;

    /* renamed from: l */
    public final boolean f187465l;

    /* renamed from: m */
    public final C65175u1<Key, Value> f187466m;

    /* renamed from: n */
    public final C65164r1<Key, Value> f187467n;

    /* renamed from: o */
    public final C32224a<C13598b0> f187468o;

    /* renamed from: u3.q0$a */
    public static final class C65126a implements C45253g<C65206z> {

        /* renamed from: d */
        public final /* synthetic */ C65125q0 f187469d;

        /* renamed from: e */
        public final /* synthetic */ C65069i0 f187470e;

        public C65126a(C65125q0 q0Var, C65069i0 i0Var) {
            this.f187469d = q0Var;
            this.f187470e = i0Var;
        }

        public Object emit(Object obj, C15601d dVar) {
            Object e = this.f187469d.mo89303e(this.f187470e, (C65206z) obj, dVar);
            return e == C15911a.COROUTINE_SUSPENDED ? e : C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {109, 130}, mo125471m = "invokeSuspend")
    /* renamed from: u3.q0$b */
    public static final class C65127b extends C91594j implements C32228q<C45253g<? super C65206z>, Integer, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187471d;

        /* renamed from: e */
        public /* synthetic */ Object f187472e;

        /* renamed from: f */
        public int f187473f;

        /* renamed from: g */
        public final /* synthetic */ C65125q0 f187474g;

        /* renamed from: h */
        public final /* synthetic */ C65069i0 f187475h;

        /* renamed from: i */
        public Object f187476i;

        /* renamed from: j */
        public int f187477j;

        /* renamed from: u3.q0$b$a */
        public static final class C65128a implements C45252f<C65206z> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f187478d;

            /* renamed from: e */
            public final /* synthetic */ int f187479e;

            /* renamed from: u3.q0$b$a$a */
            public static final class C65129a implements C45253g<C65056f2> {

                /* renamed from: d */
                public final /* synthetic */ C45253g f187480d;

                /* renamed from: e */
                public final /* synthetic */ C65128a f187481e;

                /* renamed from: u3.q0$b$a$a$a */
                public static final class C65130a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f187482d;

                    /* renamed from: e */
                    public int f187483e;

                    /* renamed from: f */
                    public final /* synthetic */ C65129a f187484f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65130a(C65129a aVar, C15601d dVar) {
                        super(dVar);
                        this.f187484f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f187482d = obj;
                        this.f187483e |= Integer.MIN_VALUE;
                        return this.f187484f.emit((Object) null, this);
                    }
                }

                public C65129a(C45253g gVar, C65128a aVar) {
                    this.f187480d = gVar;
                    this.f187481e = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r6, wx3.C15601d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof p247u3.C65125q0.C65127b.C65128a.C65129a.C65130a
                        if (r0 == 0) goto L_0x0013
                        r0 = r7
                        u3.q0$b$a$a$a r0 = (p247u3.C65125q0.C65127b.C65128a.C65129a.C65130a) r0
                        int r1 = r0.f187483e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f187483e = r1
                        goto L_0x0018
                    L_0x0013:
                        u3.q0$b$a$a$a r0 = new u3.q0$b$a$a$a
                        r0.<init>(r5, r7)
                    L_0x0018:
                        java.lang.Object r7 = r0.f187482d
                        xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r2 = r0.f187483e
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L_0x0048
                    L_0x0027:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L_0x002f:
                        kotlin.ResultKt.throwOnFailure(r7)
                        d14.g r7 = r5.f187480d
                        u3.f2 r6 = (p247u3.C65056f2) r6
                        u3.z r2 = new u3.z
                        u3.q0$b$a r4 = r5.f187481e
                        int r4 = r4.f187479e
                        r2.<init>(r4, r6)
                        r0.f187483e = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L_0x0048
                        return r1
                    L_0x0048:
                        rx3.b0 r6 = rx3.C13598b0.f38549a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.C65127b.C65128a.C65129a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C65128a(C45252f fVar, int i) {
                this.f187478d = fVar;
                this.f187479e = i;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                Object a = this.f187478d.mo31880a(new C65129a(gVar, this), dVar);
                return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65127b(C15601d dVar, C65125q0 q0Var, C65069i0 i0Var) {
            super(3, dVar);
            this.f187474g = q0Var;
            this.f187475h = i0Var;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C15601d dVar = (C15601d) obj3;
            C87412m.m108594g(gVar, "$this$create");
            C87412m.m108594g(dVar, "continuation");
            C65127b bVar = new C65127b(dVar, this.f187474g, this.f187475h);
            bVar.f187471d = gVar;
            bVar.f187472e = obj2;
            return bVar.invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: d14.g} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: k14.d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r10.f187473f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x002c
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x00ac
            L_0x0012:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001a:
                int r1 = r10.f187477j
                java.lang.Object r5 = r10.f187476i
                k14.c r5 = (k14.C99088c) r5
                java.lang.Object r6 = r10.f187472e
                u3.u0$a r6 = (p247u3.C65173u0.C65174a) r6
                java.lang.Object r7 = r10.f187471d
                d14.g r7 = (d14.C45253g) r7
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0056
            L_0x002c:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.f187471d
                r7 = r11
                d14.g r7 = (d14.C45253g) r7
                java.lang.Object r11 = r10.f187472e
                java.lang.Number r11 = (java.lang.Number) r11
                int r1 = r11.intValue()
                u3.q0 r11 = r10.f187474g
                u3.u0$a<Key, Value> r6 = r11.f187458e
                k14.c r11 = r6.f187640a
                r10.f187471d = r7
                r10.f187472e = r6
                r10.f187476i = r11
                r10.f187477j = r1
                r10.f187473f = r3
                r5 = r11
                k14.d r5 = (k14.C60942d) r5
                java.lang.Object r11 = r5.mo85908b(r4, r10)
                if (r11 != r0) goto L_0x0056
                return r0
            L_0x0056:
                u3.u0<Key, Value> r11 = r6.f187641b     // Catch:{ all -> 0x00af }
                u3.h0 r6 = r11.f187638k     // Catch:{ all -> 0x00af }
                u3.i0 r8 = r10.f187475h     // Catch:{ all -> 0x00af }
                u3.g0 r6 = r6.mo89264b(r8)     // Catch:{ all -> 0x00af }
                u3.g0$c r8 = p247u3.C65060g0.C65063c.f187264b     // Catch:{ all -> 0x00af }
                boolean r6 = gy3.C87412m.m108589b(r6, r8)     // Catch:{ all -> 0x00af }
                r8 = 0
                if (r6 == 0) goto L_0x0074
                u3.z[] r11 = new p247u3.C65206z[r8]     // Catch:{ all -> 0x00af }
                d14.j r1 = new d14.j     // Catch:{ all -> 0x00af }
                r1.<init>(r11)     // Catch:{ all -> 0x00af }
                r5.mo85909c(r4)
                goto L_0x009d
            L_0x0074:
                u3.h0 r6 = r11.f187638k     // Catch:{ all -> 0x00af }
                u3.i0 r9 = r10.f187475h     // Catch:{ all -> 0x00af }
                u3.g0 r6 = r6.mo89264b(r9)     // Catch:{ all -> 0x00af }
                boolean r6 = r6 instanceof p247u3.C65060g0.C65061a     // Catch:{ all -> 0x00af }
                if (r6 != 0) goto L_0x0087
                u3.i0 r6 = r10.f187475h     // Catch:{ all -> 0x00af }
                u3.g0$c r9 = p247u3.C65060g0.C65063c.f187265c     // Catch:{ all -> 0x00af }
                r11.mo89334f(r6, r9)     // Catch:{ all -> 0x00af }
            L_0x0087:
                rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00af }
                r5.mo85909c(r4)
                u3.q0 r11 = r10.f187474g
                d14.t0<u3.f2> r11 = r11.f187454a
                if (r1 != 0) goto L_0x0093
                r3 = 0
            L_0x0093:
                d14.f r11 = d14.C58042h.m67197f(r11, r3)
                u3.q0$b$a r3 = new u3.q0$b$a
                r3.<init>(r11, r1)
                r1 = r3
            L_0x009d:
                r10.f187471d = r4
                r10.f187472e = r4
                r10.f187476i = r4
                r10.f187473f = r2
                java.lang.Object r11 = r1.mo31880a(r7, r10)
                if (r11 != r0) goto L_0x00ac
                return r0
            L_0x00ac:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            L_0x00af:
                r11 = move-exception
                r5.mo85909c(r4)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.C65127b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: u3.q0$c */
    public static final class C65131c extends C91594j implements C32228q<C65206z, C65206z, C15601d<? super C65206z>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187485d;

        /* renamed from: e */
        public /* synthetic */ Object f187486e;

        /* renamed from: f */
        public final /* synthetic */ C65069i0 f187487f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65131c(C65069i0 i0Var, C15601d dVar) {
            super(3, dVar);
            this.f187487f = i0Var;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C65206z zVar = (C65206z) obj;
            C65206z zVar2 = (C65206z) obj2;
            C15601d dVar = (C15601d) obj3;
            C87412m.m108594g(zVar, "previous");
            C87412m.m108594g(zVar2, "next");
            C87412m.m108594g(dVar, "continuation");
            C65131c cVar = new C65131c(this.f187487f, dVar);
            cVar.f187485d = zVar;
            cVar.f187486e = zVar2;
            return cVar.invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
            if (r2.f187252a < r3.f187252a) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
            if (r2.f187253b < r3.f187253b) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
            if ((r2 instanceof p247u3.C65056f2.C65057a) != false) goto L_0x0061;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.f187485d
                u3.z r8 = (p247u3.C65206z) r8
                java.lang.Object r0 = r7.f187486e
                u3.z r0 = (p247u3.C65206z) r0
                u3.i0 r1 = r7.f187487f
                java.lang.String r2 = "$this$shouldPrioritizeOver"
                gy3.C87412m.m108594g(r0, r2)
                java.lang.String r2 = "previous"
                gy3.C87412m.m108594g(r8, r2)
                java.lang.String r2 = "loadType"
                gy3.C87412m.m108594g(r1, r2)
                int r2 = r0.f187728a
                int r3 = r8.f187728a
                r4 = 0
                if (r2 <= r3) goto L_0x0024
                goto L_0x0060
            L_0x0024:
                u3.f2 r2 = r8.f187729b
                boolean r3 = r2 instanceof p247u3.C65056f2.C65058b
                if (r3 == 0) goto L_0x0031
                u3.f2 r3 = r0.f187729b
                boolean r3 = r3 instanceof p247u3.C65056f2.C65057a
                if (r3 == 0) goto L_0x0031
                goto L_0x0060
            L_0x0031:
                u3.f2 r3 = r0.f187729b
                boolean r5 = r3 instanceof p247u3.C65056f2.C65058b
                if (r5 == 0) goto L_0x003c
                boolean r5 = r2 instanceof p247u3.C65056f2.C65057a
                if (r5 == 0) goto L_0x003c
                goto L_0x0061
            L_0x003c:
                int r5 = r3.f187254c
                int r6 = r2.f187254c
                if (r5 == r6) goto L_0x0043
                goto L_0x0060
            L_0x0043:
                int r5 = r3.f187255d
                int r6 = r2.f187255d
                if (r5 == r6) goto L_0x004a
                goto L_0x0060
            L_0x004a:
                u3.i0 r5 = p247u3.C65069i0.PREPEND
                if (r1 != r5) goto L_0x0055
                int r5 = r2.f187252a
                int r6 = r3.f187252a
                if (r5 >= r6) goto L_0x0055
                goto L_0x0061
            L_0x0055:
                u3.i0 r5 = p247u3.C65069i0.APPEND
                if (r1 != r5) goto L_0x0060
                int r1 = r2.f187253b
                int r2 = r3.f187253b
                if (r1 >= r2) goto L_0x0060
                goto L_0x0061
            L_0x0060:
                r4 = 1
            L_0x0061:
                if (r4 == 0) goto L_0x0064
                r8 = r0
            L_0x0064:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.C65131c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {595}, mo125471m = "currentPagingState")
    /* renamed from: u3.q0$d */
    public static final class C65132d extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187488d;

        /* renamed from: e */
        public int f187489e;

        /* renamed from: f */
        public final /* synthetic */ C65125q0 f187490f;

        /* renamed from: g */
        public Object f187491g;

        /* renamed from: h */
        public Object f187492h;

        /* renamed from: i */
        public Object f187493i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65132d(C65125q0 q0Var, C15601d dVar) {
            super(dVar);
            this.f187490f = q0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187488d = obj;
            this.f187489e |= Integer.MIN_VALUE;
            return this.f187490f.mo89301c(this);
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {611, 272, 275, 623, 635, 647, 304, 659, 671, 329}, mo125471m = "doInitialLoad")
    /* renamed from: u3.q0$e */
    public static final class C65133e extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187494d;

        /* renamed from: e */
        public int f187495e;

        /* renamed from: f */
        public final /* synthetic */ C65125q0 f187496f;

        /* renamed from: g */
        public Object f187497g;

        /* renamed from: h */
        public Object f187498h;

        /* renamed from: i */
        public Object f187499i;

        /* renamed from: j */
        public Object f187500j;

        /* renamed from: n */
        public boolean f187501n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65133e(C65125q0 q0Var, C15601d dVar) {
            super(dVar);
            this.f187496f = q0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187494d = obj;
            this.f187495e |= Integer.MIN_VALUE;
            return this.f187496f.mo89302d(this);
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {684, 696, 386, 394, 708, 720, 437, 732, 456, 482, 744}, mo125471m = "doLoad")
    /* renamed from: u3.q0$f */
    public static final class C65134f extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187502d;

        /* renamed from: e */
        public int f187503e;

        /* renamed from: f */
        public final /* synthetic */ C65125q0 f187504f;

        /* renamed from: g */
        public Object f187505g;

        /* renamed from: h */
        public Object f187506h;

        /* renamed from: i */
        public Object f187507i;

        /* renamed from: j */
        public Object f187508j;

        /* renamed from: n */
        public Object f187509n;

        /* renamed from: o */
        public Object f187510o;

        /* renamed from: p */
        public Object f187511p;

        /* renamed from: q */
        public Object f187512q;

        /* renamed from: r */
        public Object f187513r;

        /* renamed from: s */
        public Object f187514s;

        /* renamed from: t */
        public Object f187515t;

        /* renamed from: u */
        public int f187516u;

        /* renamed from: v */
        public int f187517v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65134f(C65125q0 q0Var, C15601d dVar) {
            super(dVar);
            this.f187504f = q0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187502d = obj;
            this.f187503e |= Integer.MIN_VALUE;
            return this.f187504f.mo89303e((C65069i0) null, (C65206z) null, this);
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {595, 160, 607}, mo125471m = "invokeSuspend")
    /* renamed from: u3.q0$g */
    public static final class C65135g extends C91594j implements C32227p<C65189w1<C65086n0<Value>>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187518d;

        /* renamed from: e */
        public Object f187519e;

        /* renamed from: f */
        public Object f187520f;

        /* renamed from: g */
        public Object f187521g;

        /* renamed from: h */
        public int f187522h;

        /* renamed from: i */
        public final /* synthetic */ C65125q0 f187523i;

        @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {589}, mo125471m = "invokeSuspend")
        /* renamed from: u3.q0$g$a */
        public static final class C65136a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f187524d;

            /* renamed from: e */
            public final /* synthetic */ C65135g f187525e;

            /* renamed from: f */
            public final /* synthetic */ C65189w1 f187526f;

            /* renamed from: u3.q0$g$a$a */
            public static final class C65137a implements C45253g<C65086n0<Value>> {

                /* renamed from: d */
                public final /* synthetic */ C65136a f187527d;

                @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {134}, mo125471m = "emit")
                /* renamed from: u3.q0$g$a$a$a */
                public static final class C65138a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f187528d;

                    /* renamed from: e */
                    public int f187529e;

                    /* renamed from: f */
                    public final /* synthetic */ C65137a f187530f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65138a(C65137a aVar, C15601d dVar) {
                        super(dVar);
                        this.f187530f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f187528d = obj;
                        this.f187529e |= Integer.MIN_VALUE;
                        return this.f187530f.emit((Object) null, this);
                    }
                }

                public C65137a(C65136a aVar) {
                    this.f187527d = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, wx3.C15601d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p247u3.C65125q0.C65135g.C65136a.C65137a.C65138a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        u3.q0$g$a$a$a r0 = (p247u3.C65125q0.C65135g.C65136a.C65137a.C65138a) r0
                        int r1 = r0.f187529e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f187529e = r1
                        goto L_0x0018
                    L_0x0013:
                        u3.q0$g$a$a$a r0 = new u3.q0$g$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f187528d
                        xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r2 = r0.f187529e
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ p -> 0x0041 }
                        goto L_0x0041
                    L_0x0027:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x002f:
                        kotlin.ResultKt.throwOnFailure(r6)
                        u3.n0 r5 = (p247u3.C65086n0) r5
                        u3.q0$g$a r6 = r4.f187527d     // Catch:{ p -> 0x0041 }
                        u3.w1 r6 = r6.f187526f     // Catch:{ p -> 0x0041 }
                        r0.f187529e = r3     // Catch:{ p -> 0x0041 }
                        java.lang.Object r5 = r6.mo75536o(r5, r0)     // Catch:{ p -> 0x0041 }
                        if (r5 != r1) goto L_0x0041
                        return r1
                    L_0x0041:
                        rx3.b0 r5 = rx3.C13598b0.f38549a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.C65135g.C65136a.C65137a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65136a(C65135g gVar, C65189w1 w1Var, C15601d dVar) {
                super(2, dVar);
                this.f187525e = gVar;
                this.f187526f = w1Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C87412m.m108594g(dVar, "completion");
                return new C65136a(this.f187525e, this.f187526f, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C65136a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f187524d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C45252f<T> d = C58042h.m67195d(this.f187525e.f187523i.f187457d);
                    C65137a aVar2 = new C65137a(this);
                    this.f187524d = 1;
                    if (((C58022c) d).mo31880a(aVar2, this) == aVar) {
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

        @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {589}, mo125471m = "invokeSuspend")
        /* renamed from: u3.q0$g$b */
        public static final class C65139b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f187531d;

            /* renamed from: e */
            public final /* synthetic */ C65135g f187532e;

            /* renamed from: f */
            public final /* synthetic */ C54625h f187533f;

            /* renamed from: u3.q0$g$b$a */
            public static final class C65140a implements C45253g<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C65139b f187534d;

                public C65140a(C65139b bVar) {
                    this.f187534d = bVar;
                }

                public Object emit(Object obj, C15601d dVar) {
                    this.f187534d.f187533f.offer((C13598b0) obj);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65139b(C65135g gVar, C54625h hVar, C15601d dVar) {
                super(2, dVar);
                this.f187532e = gVar;
                this.f187533f = hVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C87412m.m108594g(dVar, "completion");
                return new C65139b(this.f187532e, this.f187533f, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C65139b) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f187531d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C45252f<C13598b0> fVar = this.f187532e.f187523i.f187464k;
                    C65140a aVar2 = new C65140a(this);
                    this.f187531d = 1;
                    if (fVar.mo31880a(aVar2, this) == aVar) {
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

        @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {589}, mo125471m = "invokeSuspend")
        /* renamed from: u3.q0$g$c */
        public static final class C65141c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f187535d;

            /* renamed from: e */
            public int f187536e;

            /* renamed from: f */
            public final /* synthetic */ C65135g f187537f;

            /* renamed from: g */
            public final /* synthetic */ C54625h f187538g;

            /* renamed from: u3.q0$g$c$a */
            public static final class C65142a implements C45253g<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C65141c f187539d;

                /* renamed from: e */
                public final /* synthetic */ C0000n0 f187540e;

                @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {140, 162, 155, 180, 170, 195, 214, 155, 226, 170, 238, 251, 155, 263, 170, 275}, mo125471m = "emit")
                /* renamed from: u3.q0$g$c$a$a */
                public static final class C65143a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f187541d;

                    /* renamed from: e */
                    public int f187542e;

                    /* renamed from: f */
                    public final /* synthetic */ C65142a f187543f;

                    /* renamed from: g */
                    public Object f187544g;

                    /* renamed from: h */
                    public Object f187545h;

                    /* renamed from: i */
                    public Object f187546i;

                    /* renamed from: j */
                    public Object f187547j;

                    /* renamed from: n */
                    public Object f187548n;

                    /* renamed from: o */
                    public Object f187549o;

                    /* renamed from: p */
                    public Object f187550p;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65143a(C65142a aVar, C15601d dVar) {
                        super(dVar);
                        this.f187543f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f187541d = obj;
                        this.f187542e |= Integer.MIN_VALUE;
                        return this.f187543f.emit((Object) null, this);
                    }
                }

                public C65142a(C65141c cVar, C0000n0 n0Var) {
                    this.f187539d = cVar;
                    this.f187540e = n0Var;
                }

                /* JADX INFO: finally extract failed */
                /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fe, code lost:
                    r5 = r6;
                    r9 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:101:0x0300, code lost:
                    r12 = rx3.C13598b0.f38549a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:102:0x0302, code lost:
                    r3.mo85909c((java.lang.Object) null);
                    r12 = r9.f187539d.f187537f.f187523i;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:103:0x030f, code lost:
                    if (r5.ordinal() == 0) goto L_0x0355;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:104:0x0311, code lost:
                    r7 = r9.f187539d.f187537f.f187523i.f187458e;
                    r3 = r7.f187640a;
                    r1.f187544g = r9;
                    r1.f187545h = r5;
                    r1.f187546i = r7;
                    r1.f187547j = r3;
                    r1.f187548n = r11;
                    r1.f187549o = r5;
                    r1.f187550p = r12;
                    r1.f187542e = 9;
                    r6 = (k14.C60942d) r3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:105:0x0334, code lost:
                    if (r6.mo85908b((java.lang.Object) null, r1) != r2) goto L_0x0337;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:106:0x0336, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:107:0x0337, code lost:
                    r3 = r5;
                    r8 = r3;
                    r5 = r11;
                    r11 = r12;
                    r6 = r6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
                    r12 = (p247u3.C65056f2) ((java.util.LinkedHashMap) r7.f187641b.f187637j).get(r8);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:110:0x0347, code lost:
                    r6.mo85909c((java.lang.Object) null);
                    r6 = r3;
                    r3 = r12;
                    r12 = r11;
                    r11 = r5;
                    r5 = r8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:111:0x0350, code lost:
                    r11 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:112:0x0351, code lost:
                    r6.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:113:0x0354, code lost:
                    throw r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:114:0x0355, code lost:
                    r3 = null;
                    r6 = r5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:115:0x0357, code lost:
                    r1.f187544g = r9;
                    r1.f187545h = r5;
                    r1.f187546i = r11;
                    r1.f187547j = null;
                    r1.f187548n = null;
                    r1.f187549o = null;
                    r1.f187550p = null;
                    r1.f187542e = 10;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:116:0x036d, code lost:
                    if (r12.mo89306h(r6, r3, r1) != r2) goto L_0x0370;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:117:0x036f, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:118:0x0370, code lost:
                    r3 = r5;
                    r6 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:119:0x0372, code lost:
                    if (r3 != r0) goto L_0x03b4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:120:0x0374, code lost:
                    r5 = r6.f187539d.f187537f.f187523i.f187458e;
                    r12 = r5.f187640a;
                    r1.f187544g = r6;
                    r1.f187545h = r5;
                    r1.f187546i = r12;
                    r1.f187547j = r11;
                    r1.f187542e = 11;
                    r3 = (k14.C60942d) r12;
                    r12 = r3.mo85908b((java.lang.Object) null, r1);
                    r3 = r3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:121:0x0391, code lost:
                    if (r12 != r2) goto L_0x0394;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:122:0x0393, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
                    r12 = r5.f187641b.f187638k.mo89264b(r0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:125:0x039c, code lost:
                    r3.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a1, code lost:
                    if ((r12 instanceof p247u3.C65060g0.C65061a) != false) goto L_0x03b4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:127:0x03a3, code lost:
                    p247u3.C65125q0.m76723a(r6.f187539d.f187537f.f187523i, r6.f187540e);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:128:0x03af, code lost:
                    r11 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b0, code lost:
                    r3.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b3, code lost:
                    throw r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:131:0x03b4, code lost:
                    r5 = p247u3.C65069i0.APPEND;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:132:0x03ba, code lost:
                    if ((r11.f187271c instanceof p247u3.C65060g0.C65061a) != false) goto L_0x03be;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:133:0x03be, code lost:
                    r3 = r6.f187539d.f187537f.f187523i.f187458e;
                    r11 = r3.f187640a;
                    r1.f187544g = r6;
                    r1.f187545h = r5;
                    r1.f187546i = r3;
                    r1.f187547j = r11;
                    r1.f187542e = 12;
                    r11 = (k14.C60942d) r11;
                    r12 = r11.mo85908b((java.lang.Object) null, r1);
                    r11 = r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:134:0x03da, code lost:
                    if (r12 != r2) goto L_0x03dd;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:135:0x03dc, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:136:0x03dd, code lost:
                    r11 = r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
                    r12 = r3.f187641b;
                    r3 = r6.f187539d.f187537f.f187523i;
                    r1.f187544g = r6;
                    r1.f187545h = r5;
                    r1.f187546i = r11;
                    r1.f187547j = null;
                    r1.f187542e = 13;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:138:0x03f5, code lost:
                    if (r3.mo89307i(r12, r5, r1) != r2) goto L_0x03f8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:139:0x03f7, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f8, code lost:
                    r3 = r5;
                    r8 = r6;
                    r11 = r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:141:0x03fa, code lost:
                    r12 = rx3.C13598b0.f38549a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:142:0x03fc, code lost:
                    r11.mo85909c((java.lang.Object) null);
                    r11 = r8.f187539d.f187537f.f187523i;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:143:0x0409, code lost:
                    if (r3.ordinal() == 0) goto L_0x0449;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:144:0x040b, code lost:
                    r6 = r8.f187539d.f187537f.f187523i.f187458e;
                    r12 = r6.f187640a;
                    r1.f187544g = r8;
                    r1.f187545h = r3;
                    r1.f187546i = r6;
                    r1.f187547j = r12;
                    r1.f187548n = r3;
                    r1.f187549o = r11;
                    r1.f187542e = 14;
                    r5 = (k14.C60942d) r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:145:0x042c, code lost:
                    if (r5.mo85908b((java.lang.Object) null, r1) != r2) goto L_0x042f;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:146:0x042e, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:147:0x042f, code lost:
                    r7 = r3;
                    r5 = r5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
                    r12 = (p247u3.C65056f2) ((java.util.LinkedHashMap) r6.f187641b.f187637j).get(r7);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:150:0x043c, code lost:
                    r5.mo85909c((java.lang.Object) null);
                    r5 = r3;
                    r3 = r12;
                    r12 = r11;
                    r11 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:151:0x0444, code lost:
                    r11 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:152:0x0445, code lost:
                    r5.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:153:0x0448, code lost:
                    throw r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:154:0x0449, code lost:
                    r12 = r11;
                    r11 = r3;
                    r5 = r11;
                    r3 = null;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:155:0x044d, code lost:
                    r1.f187544g = r8;
                    r1.f187545h = r11;
                    r1.f187546i = null;
                    r1.f187547j = null;
                    r1.f187548n = null;
                    r1.f187549o = null;
                    r1.f187542e = 15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:156:0x0461, code lost:
                    if (r12.mo89306h(r5, r3, r1) != r2) goto L_0x0464;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:157:0x0463, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:158:0x0464, code lost:
                    r3 = r8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:159:0x0465, code lost:
                    if (r11 != r0) goto L_0x04a7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:160:0x0467, code lost:
                    r11 = r3.f187539d.f187537f.f187523i.f187458e;
                    r12 = r11.f187640a;
                    r1.f187544g = r3;
                    r1.f187545h = r11;
                    r1.f187546i = r12;
                    r1.f187542e = 16;
                    r12 = (k14.C60942d) r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:161:0x0481, code lost:
                    if (r12.mo85908b((java.lang.Object) null, r1) != r2) goto L_0x0484;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:162:0x0483, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:163:0x0484, code lost:
                    r2 = r11;
                    r11 = r12;
                    r1 = r3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
                    r12 = r2.f187641b.f187638k.mo89264b(r0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:166:0x048f, code lost:
                    r11.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:167:0x0494, code lost:
                    if ((r12 instanceof p247u3.C65060g0.C65061a) != false) goto L_0x04a7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:168:0x0496, code lost:
                    p247u3.C65125q0.m76723a(r1.f187539d.f187537f.f187523i, r1.f187540e);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:169:0x04a2, code lost:
                    r12 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:170:0x04a3, code lost:
                    r11.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:171:0x04a6, code lost:
                    throw r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:173:0x04a9, code lost:
                    return rx3.C13598b0.f38549a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:178:0x04b2, code lost:
                    r12 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:179:0x04b3, code lost:
                    r11.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:180:0x04b6, code lost:
                    throw r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:41:0x019e, code lost:
                    r12 = rx3.C13598b0.f38549a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:42:0x01a0, code lost:
                    r3.mo85909c((java.lang.Object) null);
                    r3 = r5;
                    r9 = r6;
                    r5 = r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
                    r12 = r3.f187641b;
                    r3 = r12.f187638k;
                    r12 = r12.mo89329a(r5.f187539d.f187537f.f187523i.f187455b);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ed, code lost:
                    r11.mo85909c((java.lang.Object) null);
                    r11 = r5.f187539d.f187537f.f187523i.f187466m;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:53:0x01f8, code lost:
                    if (r11 == null) goto L_0x01ff;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:54:0x01fa, code lost:
                    r11.mo89336b(r12);
                    r11 = rx3.C13598b0.f38549a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:56:0x0203, code lost:
                    if ((r3.f187269a instanceof p247u3.C65060g0.C65061a) != false) goto L_0x0209;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:57:0x0205, code lost:
                    r11 = r3;
                    r7 = r5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:58:0x0209, code lost:
                    r9 = r5;
                    r5 = r3;
                    r3 = r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:59:0x020c, code lost:
                    r11 = r9.f187539d.f187537f.f187523i;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:60:0x0216, code lost:
                    if (r3.ordinal() == 0) goto L_0x0256;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:61:0x0218, code lost:
                    r7 = r9.f187539d.f187537f.f187523i.f187458e;
                    r12 = r7.f187640a;
                    r1.f187544g = r9;
                    r1.f187545h = r3;
                    r1.f187546i = r7;
                    r1.f187547j = r12;
                    r1.f187548n = r5;
                    r1.f187549o = r3;
                    r1.f187550p = r11;
                    r1.f187542e = 4;
                    r6 = (k14.C60942d) r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:62:0x023a, code lost:
                    if (r6.mo85908b((java.lang.Object) null, r1) != r2) goto L_0x023d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:63:0x023c, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:64:0x023d, code lost:
                    r8 = r3;
                    r6 = r6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
                    r12 = (p247u3.C65056f2) ((java.util.LinkedHashMap) r7.f187641b.f187637j).get(r8);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:67:0x024a, code lost:
                    r6.mo85909c((java.lang.Object) null);
                    r6 = r5;
                    r5 = r3;
                    r3 = r8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:68:0x0251, code lost:
                    r11 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:69:0x0252, code lost:
                    r6.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:70:0x0255, code lost:
                    throw r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:0x0256, code lost:
                    r12 = null;
                    r6 = r5;
                    r5 = r3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:72:0x0259, code lost:
                    r1.f187544g = r9;
                    r1.f187545h = r3;
                    r1.f187546i = r6;
                    r1.f187547j = null;
                    r1.f187548n = null;
                    r1.f187549o = null;
                    r1.f187550p = null;
                    r1.f187542e = 5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:73:0x026e, code lost:
                    if (r11.mo89306h(r5, r12, r1) != r2) goto L_0x0271;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:74:0x0270, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:75:0x0271, code lost:
                    r11 = r6;
                    r6 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:76:0x0273, code lost:
                    if (r3 != r0) goto L_0x02b4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:77:0x0275, code lost:
                    r5 = r6.f187539d.f187537f.f187523i.f187458e;
                    r12 = r5.f187640a;
                    r1.f187544g = r6;
                    r1.f187545h = r5;
                    r1.f187546i = r12;
                    r1.f187547j = r11;
                    r1.f187542e = 6;
                    r3 = (k14.C60942d) r12;
                    r12 = r3.mo85908b((java.lang.Object) null, r1);
                    r3 = r3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:78:0x0291, code lost:
                    if (r12 != r2) goto L_0x0294;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:79:0x0293, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
                    r12 = r5.f187641b.f187638k.mo89264b(r0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:82:0x029c, code lost:
                    r3.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:83:0x02a1, code lost:
                    if ((r12 instanceof p247u3.C65060g0.C65061a) != false) goto L_0x02b4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:84:0x02a3, code lost:
                    p247u3.C65125q0.m76723a(r6.f187539d.f187537f.f187523i, r6.f187540e);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:85:0x02af, code lost:
                    r11 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:86:0x02b0, code lost:
                    r3.mo85909c((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:87:0x02b3, code lost:
                    throw r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:88:0x02b4, code lost:
                    r7 = r6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b5, code lost:
                    r6 = p247u3.C65069i0.PREPEND;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:90:0x02bb, code lost:
                    if ((r11.f187270b instanceof p247u3.C65060g0.C65061a) != false) goto L_0x02c0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:91:0x02bd, code lost:
                    r6 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c0, code lost:
                    r5 = r7.f187539d.f187537f.f187523i.f187458e;
                    r12 = r5.f187640a;
                    r1.f187544g = r7;
                    r1.f187545h = r6;
                    r1.f187546i = r5;
                    r1.f187547j = r12;
                    r1.f187548n = r11;
                    r1.f187542e = 7;
                    r12 = (k14.C60942d) r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:93:0x02dd, code lost:
                    if (r12.mo85908b((java.lang.Object) null, r1) != r2) goto L_0x02e0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:94:0x02df, code lost:
                    return r2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:95:0x02e0, code lost:
                    r3 = r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
                    r12 = r5.f187641b;
                    r5 = r7.f187539d.f187537f.f187523i;
                    r1.f187544g = r7;
                    r1.f187545h = r6;
                    r1.f187546i = r3;
                    r1.f187547j = r11;
                    r1.f187548n = null;
                    r1.f187542e = 8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:98:0x02fb, code lost:
                    if (r5.mo89307i(r12, r6, r1) != r2) goto L_0x02fe;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:99:0x02fd, code lost:
                    return r2;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
                /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x00a6  */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x00b8  */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x00d9  */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x00f2  */
                /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x0120  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x0132  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0153  */
                /* JADX WARNING: Removed duplicated region for block: B:35:0x0169  */
                /* JADX WARNING: Removed duplicated region for block: B:45:0x01ab  */
                /* JADX WARNING: Removed duplicated region for block: B:46:0x01bb  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r11, wx3.C15601d r12) {
                    /*
                        r10 = this;
                        u3.i0 r0 = p247u3.C65069i0.REFRESH
                        boolean r1 = r12 instanceof p247u3.C65125q0.C65135g.C65141c.C65142a.C65143a
                        if (r1 == 0) goto L_0x0015
                        r1 = r12
                        u3.q0$g$c$a$a r1 = (p247u3.C65125q0.C65135g.C65141c.C65142a.C65143a) r1
                        int r2 = r1.f187542e
                        r3 = -2147483648(0xffffffff80000000, float:-0.0)
                        r4 = r2 & r3
                        if (r4 == 0) goto L_0x0015
                        int r2 = r2 - r3
                        r1.f187542e = r2
                        goto L_0x001a
                    L_0x0015:
                        u3.q0$g$c$a$a r1 = new u3.q0$g$c$a$a
                        r1.<init>(r10, r12)
                    L_0x001a:
                        java.lang.Object r12 = r1.f187541d
                        xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r3 = r1.f187542e
                        r4 = 0
                        switch(r3) {
                            case 0: goto L_0x01bb;
                            case 1: goto L_0x01ab;
                            case 2: goto L_0x0169;
                            case 3: goto L_0x0153;
                            case 4: goto L_0x0132;
                            case 5: goto L_0x0120;
                            case 6: goto L_0x010b;
                            case 7: goto L_0x00f2;
                            case 8: goto L_0x00d9;
                            case 9: goto L_0x00b8;
                            case 10: goto L_0x00a6;
                            case 11: goto L_0x0091;
                            case 12: goto L_0x007c;
                            case 13: goto L_0x0067;
                            case 14: goto L_0x004a;
                            case 15: goto L_0x003d;
                            case 16: goto L_0x002c;
                            default: goto L_0x0024;
                        }
                    L_0x0024:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L_0x002c:
                        java.lang.Object r11 = r1.f187546i
                        k14.c r11 = (k14.C99088c) r11
                        java.lang.Object r2 = r1.f187545h
                        u3.u0$a r2 = (p247u3.C65173u0.C65174a) r2
                        java.lang.Object r1 = r1.f187544g
                        u3.q0$g$c$a r1 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r1
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x0487
                    L_0x003d:
                        java.lang.Object r11 = r1.f187545h
                        u3.i0 r11 = (p247u3.C65069i0) r11
                        java.lang.Object r3 = r1.f187544g
                        u3.q0$g$c$a r3 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r3
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x0465
                    L_0x004a:
                        java.lang.Object r11 = r1.f187549o
                        u3.q0 r11 = (p247u3.C65125q0) r11
                        java.lang.Object r3 = r1.f187548n
                        u3.i0 r3 = (p247u3.C65069i0) r3
                        java.lang.Object r5 = r1.f187547j
                        k14.c r5 = (k14.C99088c) r5
                        java.lang.Object r6 = r1.f187546i
                        u3.u0$a r6 = (p247u3.C65173u0.C65174a) r6
                        java.lang.Object r7 = r1.f187545h
                        u3.i0 r7 = (p247u3.C65069i0) r7
                        java.lang.Object r8 = r1.f187544g
                        u3.q0$g$c$a r8 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r8
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x0430
                    L_0x0067:
                        java.lang.Object r11 = r1.f187546i
                        k14.c r11 = (k14.C99088c) r11
                        java.lang.Object r3 = r1.f187545h
                        u3.i0 r3 = (p247u3.C65069i0) r3
                        java.lang.Object r5 = r1.f187544g
                        u3.q0$g$c$a r5 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r5
                        kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0079 }
                        r8 = r5
                        goto L_0x03fa
                    L_0x0079:
                        r12 = move-exception
                        goto L_0x04aa
                    L_0x007c:
                        java.lang.Object r11 = r1.f187547j
                        k14.c r11 = (k14.C99088c) r11
                        java.lang.Object r3 = r1.f187546i
                        u3.u0$a r3 = (p247u3.C65173u0.C65174a) r3
                        java.lang.Object r5 = r1.f187545h
                        u3.i0 r5 = (p247u3.C65069i0) r5
                        java.lang.Object r6 = r1.f187544g
                        u3.q0$g$c$a r6 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r6
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x03dd
                    L_0x0091:
                        java.lang.Object r11 = r1.f187547j
                        u3.h0 r11 = (p247u3.C65066h0) r11
                        java.lang.Object r3 = r1.f187546i
                        k14.c r3 = (k14.C99088c) r3
                        java.lang.Object r5 = r1.f187545h
                        u3.u0$a r5 = (p247u3.C65173u0.C65174a) r5
                        java.lang.Object r6 = r1.f187544g
                        u3.q0$g$c$a r6 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r6
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x0394
                    L_0x00a6:
                        java.lang.Object r11 = r1.f187546i
                        u3.h0 r11 = (p247u3.C65066h0) r11
                        java.lang.Object r3 = r1.f187545h
                        u3.i0 r3 = (p247u3.C65069i0) r3
                        java.lang.Object r5 = r1.f187544g
                        u3.q0$g$c$a r5 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r5
                        kotlin.ResultKt.throwOnFailure(r12)
                        r6 = r5
                        goto L_0x0372
                    L_0x00b8:
                        java.lang.Object r11 = r1.f187550p
                        u3.q0 r11 = (p247u3.C65125q0) r11
                        java.lang.Object r3 = r1.f187549o
                        u3.i0 r3 = (p247u3.C65069i0) r3
                        java.lang.Object r5 = r1.f187548n
                        u3.h0 r5 = (p247u3.C65066h0) r5
                        java.lang.Object r6 = r1.f187547j
                        k14.c r6 = (k14.C99088c) r6
                        java.lang.Object r7 = r1.f187546i
                        u3.u0$a r7 = (p247u3.C65173u0.C65174a) r7
                        java.lang.Object r8 = r1.f187545h
                        u3.i0 r8 = (p247u3.C65069i0) r8
                        java.lang.Object r9 = r1.f187544g
                        u3.q0$g$c$a r9 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r9
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x033b
                    L_0x00d9:
                        java.lang.Object r11 = r1.f187547j
                        u3.h0 r11 = (p247u3.C65066h0) r11
                        java.lang.Object r3 = r1.f187546i
                        k14.c r3 = (k14.C99088c) r3
                        java.lang.Object r5 = r1.f187545h
                        u3.i0 r5 = (p247u3.C65069i0) r5
                        java.lang.Object r6 = r1.f187544g
                        u3.q0$g$c$a r6 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r6
                        kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x00ef }
                        r9 = r6
                        goto L_0x0300
                    L_0x00ef:
                        r11 = move-exception
                        goto L_0x04ae
                    L_0x00f2:
                        java.lang.Object r11 = r1.f187548n
                        u3.h0 r11 = (p247u3.C65066h0) r11
                        java.lang.Object r3 = r1.f187547j
                        k14.c r3 = (k14.C99088c) r3
                        java.lang.Object r5 = r1.f187546i
                        u3.u0$a r5 = (p247u3.C65173u0.C65174a) r5
                        java.lang.Object r6 = r1.f187545h
                        u3.i0 r6 = (p247u3.C65069i0) r6
                        java.lang.Object r7 = r1.f187544g
                        u3.q0$g$c$a r7 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r7
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x02e1
                    L_0x010b:
                        java.lang.Object r11 = r1.f187547j
                        u3.h0 r11 = (p247u3.C65066h0) r11
                        java.lang.Object r3 = r1.f187546i
                        k14.c r3 = (k14.C99088c) r3
                        java.lang.Object r5 = r1.f187545h
                        u3.u0$a r5 = (p247u3.C65173u0.C65174a) r5
                        java.lang.Object r6 = r1.f187544g
                        u3.q0$g$c$a r6 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r6
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x0294
                    L_0x0120:
                        java.lang.Object r11 = r1.f187546i
                        u3.h0 r11 = (p247u3.C65066h0) r11
                        java.lang.Object r3 = r1.f187545h
                        u3.i0 r3 = (p247u3.C65069i0) r3
                        java.lang.Object r5 = r1.f187544g
                        u3.q0$g$c$a r5 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r5
                        kotlin.ResultKt.throwOnFailure(r12)
                        r6 = r5
                        goto L_0x0273
                    L_0x0132:
                        java.lang.Object r11 = r1.f187550p
                        u3.q0 r11 = (p247u3.C65125q0) r11
                        java.lang.Object r3 = r1.f187549o
                        u3.i0 r3 = (p247u3.C65069i0) r3
                        java.lang.Object r5 = r1.f187548n
                        u3.h0 r5 = (p247u3.C65066h0) r5
                        java.lang.Object r6 = r1.f187547j
                        k14.c r6 = (k14.C99088c) r6
                        java.lang.Object r7 = r1.f187546i
                        u3.u0$a r7 = (p247u3.C65173u0.C65174a) r7
                        java.lang.Object r8 = r1.f187545h
                        u3.i0 r8 = (p247u3.C65069i0) r8
                        java.lang.Object r9 = r1.f187544g
                        u3.q0$g$c$a r9 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r9
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x023e
                    L_0x0153:
                        java.lang.Object r11 = r1.f187547j
                        u3.h0 r11 = (p247u3.C65066h0) r11
                        java.lang.Object r3 = r1.f187546i
                        k14.c r3 = (k14.C99088c) r3
                        java.lang.Object r5 = r1.f187545h
                        u3.i0 r5 = (p247u3.C65069i0) r5
                        java.lang.Object r6 = r1.f187544g
                        u3.q0$g$c$a r6 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r6
                        kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0167 }
                        goto L_0x019e
                    L_0x0167:
                        r11 = move-exception
                        goto L_0x01a7
                    L_0x0169:
                        java.lang.Object r11 = r1.f187548n
                        u3.h0 r11 = (p247u3.C65066h0) r11
                        java.lang.Object r3 = r1.f187547j
                        k14.c r3 = (k14.C99088c) r3
                        java.lang.Object r5 = r1.f187546i
                        u3.u0$a r5 = (p247u3.C65173u0.C65174a) r5
                        java.lang.Object r6 = r1.f187545h
                        u3.i0 r6 = (p247u3.C65069i0) r6
                        java.lang.Object r7 = r1.f187544g
                        u3.q0$g$c$a r7 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r7
                        kotlin.ResultKt.throwOnFailure(r12)
                        u3.u0<Key, Value> r12 = r5.f187641b     // Catch:{ all -> 0x0167 }
                        u3.q0$g$c r5 = r7.f187539d     // Catch:{ all -> 0x0167 }
                        u3.q0$g r5 = r5.f187537f     // Catch:{ all -> 0x0167 }
                        u3.q0 r5 = r5.f187523i     // Catch:{ all -> 0x0167 }
                        r1.f187544g = r7     // Catch:{ all -> 0x0167 }
                        r1.f187545h = r6     // Catch:{ all -> 0x0167 }
                        r1.f187546i = r3     // Catch:{ all -> 0x0167 }
                        r1.f187547j = r11     // Catch:{ all -> 0x0167 }
                        r1.f187548n = r4     // Catch:{ all -> 0x0167 }
                        r8 = 3
                        r1.f187542e = r8     // Catch:{ all -> 0x0167 }
                        java.lang.Object r12 = r5.mo89307i(r12, r6, r1)     // Catch:{ all -> 0x0167 }
                        if (r12 != r2) goto L_0x019c
                        return r2
                    L_0x019c:
                        r5 = r6
                        r6 = r7
                    L_0x019e:
                        rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0167 }
                        r3.mo85909c(r4)
                        r3 = r5
                        r9 = r6
                        r5 = r11
                        goto L_0x020c
                    L_0x01a7:
                        r3.mo85909c(r4)
                        throw r11
                    L_0x01ab:
                        java.lang.Object r11 = r1.f187546i
                        k14.c r11 = (k14.C99088c) r11
                        java.lang.Object r3 = r1.f187545h
                        u3.u0$a r3 = (p247u3.C65173u0.C65174a) r3
                        java.lang.Object r5 = r1.f187544g
                        u3.q0$g$c$a r5 = (p247u3.C65125q0.C65135g.C65141c.C65142a) r5
                        kotlin.ResultKt.throwOnFailure(r12)
                        goto L_0x01dd
                    L_0x01bb:
                        kotlin.ResultKt.throwOnFailure(r12)
                        rx3.b0 r11 = (rx3.C13598b0) r11
                        u3.q0$g$c r11 = r10.f187539d
                        u3.q0$g r11 = r11.f187537f
                        u3.q0 r11 = r11.f187523i
                        u3.u0$a<Key, Value> r3 = r11.f187458e
                        k14.c r11 = r3.f187640a
                        r1.f187544g = r10
                        r1.f187545h = r3
                        r1.f187546i = r11
                        r12 = 1
                        r1.f187542e = r12
                        k14.d r11 = (k14.C60942d) r11
                        java.lang.Object r12 = r11.mo85908b(r4, r1)
                        if (r12 != r2) goto L_0x01dc
                        return r2
                    L_0x01dc:
                        r5 = r10
                    L_0x01dd:
                        u3.u0<Key, Value> r12 = r3.f187641b     // Catch:{ all -> 0x04b2 }
                        u3.h0 r3 = r12.f187638k     // Catch:{ all -> 0x04b2 }
                        u3.q0$g$c r6 = r5.f187539d     // Catch:{ all -> 0x04b2 }
                        u3.q0$g r6 = r6.f187537f     // Catch:{ all -> 0x04b2 }
                        u3.q0 r6 = r6.f187523i     // Catch:{ all -> 0x04b2 }
                        u3.f2$a r6 = r6.f187455b     // Catch:{ all -> 0x04b2 }
                        u3.r1 r12 = r12.mo89329a(r6)     // Catch:{ all -> 0x04b2 }
                        r11.mo85909c(r4)
                        u3.q0$g$c r11 = r5.f187539d
                        u3.q0$g r11 = r11.f187537f
                        u3.q0 r11 = r11.f187523i
                        u3.u1<Key, Value> r11 = r11.f187466m
                        if (r11 == 0) goto L_0x01ff
                        r11.mo89336b(r12)
                        rx3.b0 r11 = rx3.C13598b0.f38549a
                    L_0x01ff:
                        u3.g0 r11 = r3.f187269a
                        boolean r11 = r11 instanceof p247u3.C65060g0.C65061a
                        if (r11 != 0) goto L_0x0209
                        r11 = r3
                        r7 = r5
                        goto L_0x02b5
                    L_0x0209:
                        r9 = r5
                        r5 = r3
                        r3 = r0
                    L_0x020c:
                        u3.q0$g$c r11 = r9.f187539d
                        u3.q0$g r11 = r11.f187537f
                        u3.q0 r11 = r11.f187523i
                        int r12 = r3.ordinal()
                        if (r12 == 0) goto L_0x0256
                        u3.q0$g$c r12 = r9.f187539d
                        u3.q0$g r12 = r12.f187537f
                        u3.q0 r12 = r12.f187523i
                        u3.u0$a<Key, Value> r7 = r12.f187458e
                        k14.c r12 = r7.f187640a
                        r1.f187544g = r9
                        r1.f187545h = r3
                        r1.f187546i = r7
                        r1.f187547j = r12
                        r1.f187548n = r5
                        r1.f187549o = r3
                        r1.f187550p = r11
                        r6 = 4
                        r1.f187542e = r6
                        r6 = r12
                        k14.d r6 = (k14.C60942d) r6
                        java.lang.Object r12 = r6.mo85908b(r4, r1)
                        if (r12 != r2) goto L_0x023d
                        return r2
                    L_0x023d:
                        r8 = r3
                    L_0x023e:
                        u3.u0<Key, Value> r12 = r7.f187641b     // Catch:{ all -> 0x0251 }
                        java.util.Map<u3.i0, u3.f2> r12 = r12.f187637j     // Catch:{ all -> 0x0251 }
                        java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12     // Catch:{ all -> 0x0251 }
                        java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0251 }
                        u3.f2 r12 = (p247u3.C65056f2) r12     // Catch:{ all -> 0x0251 }
                        r6.mo85909c(r4)
                        r6 = r5
                        r5 = r3
                        r3 = r8
                        goto L_0x0259
                    L_0x0251:
                        r11 = move-exception
                        r6.mo85909c(r4)
                        throw r11
                    L_0x0256:
                        r12 = r4
                        r6 = r5
                        r5 = r3
                    L_0x0259:
                        r1.f187544g = r9
                        r1.f187545h = r3
                        r1.f187546i = r6
                        r1.f187547j = r4
                        r1.f187548n = r4
                        r1.f187549o = r4
                        r1.f187550p = r4
                        r7 = 5
                        r1.f187542e = r7
                        java.lang.Object r11 = r11.mo89306h(r5, r12, r1)
                        if (r11 != r2) goto L_0x0271
                        return r2
                    L_0x0271:
                        r11 = r6
                        r6 = r9
                    L_0x0273:
                        if (r3 != r0) goto L_0x02b4
                        u3.q0$g$c r12 = r6.f187539d
                        u3.q0$g r12 = r12.f187537f
                        u3.q0 r12 = r12.f187523i
                        u3.u0$a<Key, Value> r5 = r12.f187458e
                        k14.c r12 = r5.f187640a
                        r1.f187544g = r6
                        r1.f187545h = r5
                        r1.f187546i = r12
                        r1.f187547j = r11
                        r3 = 6
                        r1.f187542e = r3
                        r3 = r12
                        k14.d r3 = (k14.C60942d) r3
                        java.lang.Object r12 = r3.mo85908b(r4, r1)
                        if (r12 != r2) goto L_0x0294
                        return r2
                    L_0x0294:
                        u3.u0<Key, Value> r12 = r5.f187641b     // Catch:{ all -> 0x02af }
                        u3.h0 r12 = r12.f187638k     // Catch:{ all -> 0x02af }
                        u3.g0 r12 = r12.mo89264b(r0)     // Catch:{ all -> 0x02af }
                        r3.mo85909c(r4)
                        boolean r12 = r12 instanceof p247u3.C65060g0.C65061a
                        if (r12 != 0) goto L_0x02b4
                        u3.q0$g$c r12 = r6.f187539d
                        u3.q0$g r12 = r12.f187537f
                        u3.q0 r12 = r12.f187523i
                        a14.n0 r3 = r6.f187540e
                        p247u3.C65125q0.m76723a(r12, r3)
                        goto L_0x02b4
                    L_0x02af:
                        r11 = move-exception
                        r3.mo85909c(r4)
                        throw r11
                    L_0x02b4:
                        r7 = r6
                    L_0x02b5:
                        u3.i0 r6 = p247u3.C65069i0.PREPEND
                        u3.g0 r12 = r11.f187270b
                        boolean r12 = r12 instanceof p247u3.C65060g0.C65061a
                        if (r12 != 0) goto L_0x02c0
                        r6 = r7
                        goto L_0x03b4
                    L_0x02c0:
                        u3.q0$g$c r12 = r7.f187539d
                        u3.q0$g r12 = r12.f187537f
                        u3.q0 r12 = r12.f187523i
                        u3.u0$a<Key, Value> r5 = r12.f187458e
                        k14.c r12 = r5.f187640a
                        r1.f187544g = r7
                        r1.f187545h = r6
                        r1.f187546i = r5
                        r1.f187547j = r12
                        r1.f187548n = r11
                        r3 = 7
                        r1.f187542e = r3
                        k14.d r12 = (k14.C60942d) r12
                        java.lang.Object r3 = r12.mo85908b(r4, r1)
                        if (r3 != r2) goto L_0x02e0
                        return r2
                    L_0x02e0:
                        r3 = r12
                    L_0x02e1:
                        u3.u0<Key, Value> r12 = r5.f187641b     // Catch:{ all -> 0x00ef }
                        u3.q0$g$c r5 = r7.f187539d     // Catch:{ all -> 0x00ef }
                        u3.q0$g r5 = r5.f187537f     // Catch:{ all -> 0x00ef }
                        u3.q0 r5 = r5.f187523i     // Catch:{ all -> 0x00ef }
                        r1.f187544g = r7     // Catch:{ all -> 0x00ef }
                        r1.f187545h = r6     // Catch:{ all -> 0x00ef }
                        r1.f187546i = r3     // Catch:{ all -> 0x00ef }
                        r1.f187547j = r11     // Catch:{ all -> 0x00ef }
                        r1.f187548n = r4     // Catch:{ all -> 0x00ef }
                        r8 = 8
                        r1.f187542e = r8     // Catch:{ all -> 0x00ef }
                        java.lang.Object r12 = r5.mo89307i(r12, r6, r1)     // Catch:{ all -> 0x00ef }
                        if (r12 != r2) goto L_0x02fe
                        return r2
                    L_0x02fe:
                        r5 = r6
                        r9 = r7
                    L_0x0300:
                        rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ef }
                        r3.mo85909c(r4)
                        u3.q0$g$c r12 = r9.f187539d
                        u3.q0$g r12 = r12.f187537f
                        u3.q0 r12 = r12.f187523i
                        int r3 = r5.ordinal()
                        if (r3 == 0) goto L_0x0355
                        u3.q0$g$c r3 = r9.f187539d
                        u3.q0$g r3 = r3.f187537f
                        u3.q0 r3 = r3.f187523i
                        u3.u0$a<Key, Value> r7 = r3.f187458e
                        k14.c r3 = r7.f187640a
                        r1.f187544g = r9
                        r1.f187545h = r5
                        r1.f187546i = r7
                        r1.f187547j = r3
                        r1.f187548n = r11
                        r1.f187549o = r5
                        r1.f187550p = r12
                        r6 = 9
                        r1.f187542e = r6
                        r6 = r3
                        k14.d r6 = (k14.C60942d) r6
                        java.lang.Object r3 = r6.mo85908b(r4, r1)
                        if (r3 != r2) goto L_0x0337
                        return r2
                    L_0x0337:
                        r3 = r5
                        r8 = r3
                        r5 = r11
                        r11 = r12
                    L_0x033b:
                        u3.u0<Key, Value> r12 = r7.f187641b     // Catch:{ all -> 0x0350 }
                        java.util.Map<u3.i0, u3.f2> r12 = r12.f187637j     // Catch:{ all -> 0x0350 }
                        java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12     // Catch:{ all -> 0x0350 }
                        java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0350 }
                        u3.f2 r12 = (p247u3.C65056f2) r12     // Catch:{ all -> 0x0350 }
                        r6.mo85909c(r4)
                        r6 = r3
                        r3 = r12
                        r12 = r11
                        r11 = r5
                        r5 = r8
                        goto L_0x0357
                    L_0x0350:
                        r11 = move-exception
                        r6.mo85909c(r4)
                        throw r11
                    L_0x0355:
                        r3 = r4
                        r6 = r5
                    L_0x0357:
                        r1.f187544g = r9
                        r1.f187545h = r5
                        r1.f187546i = r11
                        r1.f187547j = r4
                        r1.f187548n = r4
                        r1.f187549o = r4
                        r1.f187550p = r4
                        r7 = 10
                        r1.f187542e = r7
                        java.lang.Object r12 = r12.mo89306h(r6, r3, r1)
                        if (r12 != r2) goto L_0x0370
                        return r2
                    L_0x0370:
                        r3 = r5
                        r6 = r9
                    L_0x0372:
                        if (r3 != r0) goto L_0x03b4
                        u3.q0$g$c r12 = r6.f187539d
                        u3.q0$g r12 = r12.f187537f
                        u3.q0 r12 = r12.f187523i
                        u3.u0$a<Key, Value> r5 = r12.f187458e
                        k14.c r12 = r5.f187640a
                        r1.f187544g = r6
                        r1.f187545h = r5
                        r1.f187546i = r12
                        r1.f187547j = r11
                        r3 = 11
                        r1.f187542e = r3
                        r3 = r12
                        k14.d r3 = (k14.C60942d) r3
                        java.lang.Object r12 = r3.mo85908b(r4, r1)
                        if (r12 != r2) goto L_0x0394
                        return r2
                    L_0x0394:
                        u3.u0<Key, Value> r12 = r5.f187641b     // Catch:{ all -> 0x03af }
                        u3.h0 r12 = r12.f187638k     // Catch:{ all -> 0x03af }
                        u3.g0 r12 = r12.mo89264b(r0)     // Catch:{ all -> 0x03af }
                        r3.mo85909c(r4)
                        boolean r12 = r12 instanceof p247u3.C65060g0.C65061a
                        if (r12 != 0) goto L_0x03b4
                        u3.q0$g$c r12 = r6.f187539d
                        u3.q0$g r12 = r12.f187537f
                        u3.q0 r12 = r12.f187523i
                        a14.n0 r3 = r6.f187540e
                        p247u3.C65125q0.m76723a(r12, r3)
                        goto L_0x03b4
                    L_0x03af:
                        r11 = move-exception
                        r3.mo85909c(r4)
                        throw r11
                    L_0x03b4:
                        u3.i0 r5 = p247u3.C65069i0.APPEND
                        u3.g0 r11 = r11.f187271c
                        boolean r11 = r11 instanceof p247u3.C65060g0.C65061a
                        if (r11 != 0) goto L_0x03be
                        goto L_0x04a7
                    L_0x03be:
                        u3.q0$g$c r11 = r6.f187539d
                        u3.q0$g r11 = r11.f187537f
                        u3.q0 r11 = r11.f187523i
                        u3.u0$a<Key, Value> r3 = r11.f187458e
                        k14.c r11 = r3.f187640a
                        r1.f187544g = r6
                        r1.f187545h = r5
                        r1.f187546i = r3
                        r1.f187547j = r11
                        r12 = 12
                        r1.f187542e = r12
                        k14.d r11 = (k14.C60942d) r11
                        java.lang.Object r12 = r11.mo85908b(r4, r1)
                        if (r12 != r2) goto L_0x03dd
                        return r2
                    L_0x03dd:
                        u3.u0<Key, Value> r12 = r3.f187641b     // Catch:{ all -> 0x0079 }
                        u3.q0$g$c r3 = r6.f187539d     // Catch:{ all -> 0x0079 }
                        u3.q0$g r3 = r3.f187537f     // Catch:{ all -> 0x0079 }
                        u3.q0 r3 = r3.f187523i     // Catch:{ all -> 0x0079 }
                        r1.f187544g = r6     // Catch:{ all -> 0x0079 }
                        r1.f187545h = r5     // Catch:{ all -> 0x0079 }
                        r1.f187546i = r11     // Catch:{ all -> 0x0079 }
                        r1.f187547j = r4     // Catch:{ all -> 0x0079 }
                        r7 = 13
                        r1.f187542e = r7     // Catch:{ all -> 0x0079 }
                        java.lang.Object r12 = r3.mo89307i(r12, r5, r1)     // Catch:{ all -> 0x0079 }
                        if (r12 != r2) goto L_0x03f8
                        return r2
                    L_0x03f8:
                        r3 = r5
                        r8 = r6
                    L_0x03fa:
                        rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0079 }
                        r11.mo85909c(r4)
                        u3.q0$g$c r11 = r8.f187539d
                        u3.q0$g r11 = r11.f187537f
                        u3.q0 r11 = r11.f187523i
                        int r12 = r3.ordinal()
                        if (r12 == 0) goto L_0x0449
                        u3.q0$g$c r12 = r8.f187539d
                        u3.q0$g r12 = r12.f187537f
                        u3.q0 r12 = r12.f187523i
                        u3.u0$a<Key, Value> r6 = r12.f187458e
                        k14.c r12 = r6.f187640a
                        r1.f187544g = r8
                        r1.f187545h = r3
                        r1.f187546i = r6
                        r1.f187547j = r12
                        r1.f187548n = r3
                        r1.f187549o = r11
                        r5 = 14
                        r1.f187542e = r5
                        r5 = r12
                        k14.d r5 = (k14.C60942d) r5
                        java.lang.Object r12 = r5.mo85908b(r4, r1)
                        if (r12 != r2) goto L_0x042f
                        return r2
                    L_0x042f:
                        r7 = r3
                    L_0x0430:
                        u3.u0<Key, Value> r12 = r6.f187641b     // Catch:{ all -> 0x0444 }
                        java.util.Map<u3.i0, u3.f2> r12 = r12.f187637j     // Catch:{ all -> 0x0444 }
                        java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12     // Catch:{ all -> 0x0444 }
                        java.lang.Object r12 = r12.get(r7)     // Catch:{ all -> 0x0444 }
                        u3.f2 r12 = (p247u3.C65056f2) r12     // Catch:{ all -> 0x0444 }
                        r5.mo85909c(r4)
                        r5 = r3
                        r3 = r12
                        r12 = r11
                        r11 = r7
                        goto L_0x044d
                    L_0x0444:
                        r11 = move-exception
                        r5.mo85909c(r4)
                        throw r11
                    L_0x0449:
                        r12 = r11
                        r11 = r3
                        r5 = r11
                        r3 = r4
                    L_0x044d:
                        r1.f187544g = r8
                        r1.f187545h = r11
                        r1.f187546i = r4
                        r1.f187547j = r4
                        r1.f187548n = r4
                        r1.f187549o = r4
                        r6 = 15
                        r1.f187542e = r6
                        java.lang.Object r12 = r12.mo89306h(r5, r3, r1)
                        if (r12 != r2) goto L_0x0464
                        return r2
                    L_0x0464:
                        r3 = r8
                    L_0x0465:
                        if (r11 != r0) goto L_0x04a7
                        u3.q0$g$c r11 = r3.f187539d
                        u3.q0$g r11 = r11.f187537f
                        u3.q0 r11 = r11.f187523i
                        u3.u0$a<Key, Value> r11 = r11.f187458e
                        k14.c r12 = r11.f187640a
                        r1.f187544g = r3
                        r1.f187545h = r11
                        r1.f187546i = r12
                        r5 = 16
                        r1.f187542e = r5
                        k14.d r12 = (k14.C60942d) r12
                        java.lang.Object r1 = r12.mo85908b(r4, r1)
                        if (r1 != r2) goto L_0x0484
                        return r2
                    L_0x0484:
                        r2 = r11
                        r11 = r12
                        r1 = r3
                    L_0x0487:
                        u3.u0<Key, Value> r12 = r2.f187641b     // Catch:{ all -> 0x04a2 }
                        u3.h0 r12 = r12.f187638k     // Catch:{ all -> 0x04a2 }
                        u3.g0 r12 = r12.mo89264b(r0)     // Catch:{ all -> 0x04a2 }
                        r11.mo85909c(r4)
                        boolean r11 = r12 instanceof p247u3.C65060g0.C65061a
                        if (r11 != 0) goto L_0x04a7
                        u3.q0$g$c r11 = r1.f187539d
                        u3.q0$g r11 = r11.f187537f
                        u3.q0 r11 = r11.f187523i
                        a14.n0 r12 = r1.f187540e
                        p247u3.C65125q0.m76723a(r11, r12)
                        goto L_0x04a7
                    L_0x04a2:
                        r12 = move-exception
                        r11.mo85909c(r4)
                        throw r12
                    L_0x04a7:
                        rx3.b0 r11 = rx3.C13598b0.f38549a
                        return r11
                    L_0x04aa:
                        r11.mo85909c(r4)
                        throw r12
                    L_0x04ae:
                        r3.mo85909c(r4)
                        throw r11
                    L_0x04b2:
                        r12 = move-exception
                        r11.mo85909c(r4)
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.C65135g.C65141c.C65142a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65141c(C65135g gVar, C54625h hVar, C15601d dVar) {
                super(2, dVar);
                this.f187537f = gVar;
                this.f187538g = hVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C87412m.m108594g(dVar, "completion");
                C65141c cVar = new C65141c(this.f187537f, this.f187538g, dVar);
                cVar.f187535d = obj;
                return cVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C65141c) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f187536e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C45252f d = C58042h.m67195d(this.f187538g);
                    C65142a aVar2 = new C65142a(this, (C0000n0) this.f187535d);
                    this.f187536e = 1;
                    if (((C58022c) d).mo31880a(aVar2, this) == aVar) {
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
        public C65135g(C65125q0 q0Var, C15601d dVar) {
            super(2, dVar);
            this.f187523i = q0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            C65135g gVar = new C65135g(this.f187523i, dVar);
            gVar.f187518d = obj;
            return gVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65135g) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d1 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ea  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00fc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                u3.i0 r0 = p247u3.C65069i0.REFRESH
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r3 = r1.f187522h
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r3 == 0) goto L_0x004a
                if (r3 == r6) goto L_0x0036
                if (r3 == r5) goto L_0x002d
                if (r3 != r4) goto L_0x0025
                java.lang.Object r2 = r1.f187520f
                k14.c r2 = (k14.C99088c) r2
                java.lang.Object r3 = r1.f187519e
                u3.u0$a r3 = (p247u3.C65173u0.C65174a) r3
                java.lang.Object r4 = r1.f187518d
                u3.w1 r4 = (p247u3.C65189w1) r4
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x00ed
            L_0x0025:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x002d:
                java.lang.Object r3 = r1.f187518d
                u3.w1 r3 = (p247u3.C65189w1) r3
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x00d2
            L_0x0036:
                java.lang.Object r3 = r1.f187521g
                k14.c r3 = (k14.C99088c) r3
                java.lang.Object r6 = r1.f187520f
                u3.u0$a r6 = (p247u3.C65173u0.C65174a) r6
                java.lang.Object r8 = r1.f187519e
                u3.u1 r8 = (p247u3.C65175u1) r8
                java.lang.Object r9 = r1.f187518d
                u3.w1 r9 = (p247u3.C65189w1) r9
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x00ab
            L_0x004a:
                kotlin.ResultKt.throwOnFailure(r17)
                java.lang.Object r3 = r1.f187518d
                u3.w1 r3 = (p247u3.C65189w1) r3
                u3.q0 r8 = r1.f187523i
                java.util.concurrent.atomic.AtomicBoolean r8 = r8.f187456c
                r14 = 0
                boolean r8 = r8.compareAndSet(r14, r6)
                if (r8 == 0) goto L_0x0109
                r9 = 0
                r10 = 0
                u3.q0$g$a r11 = new u3.q0$g$a
                r11.<init>(r1, r3, r7)
                r12 = 3
                r13 = 0
                r8 = r3
                a14.C53895h.m60466d(r8, r9, r10, r11, r12, r13)
                r8 = 6
                c14.h r14 = c14.C54629k.m61479a(r14, r7, r7, r8, r7)
                u3.q0$g$b r11 = new u3.q0$g$b
                r11.<init>(r1, r14, r7)
                r8 = r3
                a14.C53895h.m60466d(r8, r9, r10, r11, r12, r13)
                u3.q0$g$c r11 = new u3.q0$g$c
                r11.<init>(r1, r14, r7)
                a14.C53895h.m60466d(r8, r9, r10, r11, r12, r13)
                u3.q0 r8 = r1.f187523i
                boolean r9 = r8.f187465l
                if (r9 == 0) goto L_0x00bf
                u3.u1<Key, Value> r9 = r8.f187466m
                if (r9 == 0) goto L_0x00bf
                u3.r1<Key, Value> r10 = r8.f187467n
                if (r10 == 0) goto L_0x008e
                goto L_0x00b6
            L_0x008e:
                u3.u0$a<Key, Value> r8 = r8.f187458e
                k14.c r10 = r8.f187640a
                r1.f187518d = r3
                r1.f187519e = r9
                r1.f187520f = r8
                r1.f187521g = r10
                r1.f187522h = r6
                r6 = r10
                k14.d r6 = (k14.C60942d) r6
                java.lang.Object r10 = r6.mo85908b(r7, r1)
                if (r10 != r2) goto L_0x00a6
                return r2
            L_0x00a6:
                r15 = r9
                r9 = r3
                r3 = r6
                r6 = r8
                r8 = r15
            L_0x00ab:
                u3.u0<Key, Value> r6 = r6.f187641b     // Catch:{ all -> 0x00ba }
                u3.r1 r10 = r6.mo89329a(r7)     // Catch:{ all -> 0x00ba }
                r3.mo85909c(r7)
                r3 = r9
                r9 = r8
            L_0x00b6:
                r9.mo89337c(r0, r10)
                goto L_0x00bf
            L_0x00ba:
                r0 = move-exception
                r3.mo85909c(r7)
                throw r0
            L_0x00bf:
                u3.q0 r6 = r1.f187523i
                r1.f187518d = r3
                r1.f187519e = r7
                r1.f187520f = r7
                r1.f187521g = r7
                r1.f187522h = r5
                java.lang.Object r5 = r6.mo89302d(r1)
                if (r5 != r2) goto L_0x00d2
                return r2
            L_0x00d2:
                u3.q0 r5 = r1.f187523i
                u3.u0$a<Key, Value> r5 = r5.f187458e
                k14.c r6 = r5.f187640a
                r1.f187518d = r3
                r1.f187519e = r5
                r1.f187520f = r6
                r1.f187522h = r4
                r4 = r6
                k14.d r4 = (k14.C60942d) r4
                java.lang.Object r6 = r4.mo85908b(r7, r1)
                if (r6 != r2) goto L_0x00ea
                return r2
            L_0x00ea:
                r2 = r4
                r4 = r3
                r3 = r5
            L_0x00ed:
                u3.u0<Key, Value> r3 = r3.f187641b     // Catch:{ all -> 0x0104 }
                u3.h0 r3 = r3.f187638k     // Catch:{ all -> 0x0104 }
                u3.g0 r0 = r3.mo89264b(r0)     // Catch:{ all -> 0x0104 }
                r2.mo85909c(r7)
                boolean r0 = r0 instanceof p247u3.C65060g0.C65061a
                if (r0 != 0) goto L_0x0101
                u3.q0 r0 = r1.f187523i
                p247u3.C65125q0.m76723a(r0, r4)
            L_0x0101:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0104:
                r0 = move-exception
                r2.mo85909c(r7)
                throw r0
            L_0x0109:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.C65135g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {506}, mo125471m = "setLoading")
    /* renamed from: u3.q0$h */
    public static final class C65144h extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187551d;

        /* renamed from: e */
        public int f187552e;

        /* renamed from: f */
        public final /* synthetic */ C65125q0 f187553f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65144h(C65125q0 q0Var, C15601d dVar) {
            super(dVar);
            this.f187553f = q0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187551d = obj;
            this.f187552e |= Integer.MIN_VALUE;
            return this.f187553f.mo89307i((C65173u0) null, (C65069i0) null, this);
        }
    }

    public C65125q0(Key key, C65145q1<Key, Value> q1Var, C65078l1 l1Var, C45252f<C13598b0> fVar, boolean z, C65175u1<Key, Value> u1Var, C65164r1<Key, Value> r1Var, C32224a<C13598b0> aVar) {
        C87412m.m108594g(q1Var, "pagingSource");
        C87412m.m108594g(l1Var, "config");
        C87412m.m108594g(fVar, "retryFlow");
        C87412m.m108594g(aVar, "invalidate");
        this.f187461h = key;
        this.f187462i = q1Var;
        this.f187463j = l1Var;
        this.f187464k = fVar;
        this.f187465l = z;
        this.f187466m = u1Var;
        this.f187467n = r1Var;
        this.f187468o = aVar;
        if (l1Var.f187303f == Integer.MIN_VALUE || q1Var.mo89232a()) {
            this.f187454a = C58017a1.m67173b(1, 0, (C54624g) null, 6, (Object) null);
            this.f187456c = new AtomicBoolean(false);
            this.f187457d = C54629k.m61479a(-2, (C54624g) null, (C32226l) null, 6, (Object) null);
            this.f187458e = new C65173u0.C65174a<>(l1Var);
            C0002w a = C53873d2.m60389a((C53973z1) null, 1, (Object) null);
            this.f187459f = a;
            this.f187460g = C65180v1.m76764a(new C65074k(a, new C65135g(this, (C15601d) null), (C15601d) null));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }

    /* renamed from: a */
    public static final void m76723a(C65125q0 q0Var, C0000n0 n0Var) {
        C65125q0 q0Var2 = q0Var;
        if (q0Var2.f187463j.f187303f != Integer.MIN_VALUE) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C65159r0(q0Var2, (C15601d) null), 3, (Object) null);
        }
        C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C65166s0(q0Var2, (C15601d) null), 3, (Object) null);
        C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C65170t0(q0Var2, (C15601d) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final Object mo89300b(C45252f<Integer> fVar, C65069i0 i0Var, C15601d<? super C13598b0> dVar) {
        C65127b bVar = new C65127b((C15601d) null, this, i0Var);
        Object obj = C65197y.f187697a;
        C87412m.m108594g(fVar, "$this$simpleTransformLatest");
        C45252f a = C65180v1.m76764a(new C65190x(fVar, bVar, (C15601d) null));
        C65131c cVar = new C65131c(i0Var, (C15601d) null);
        C87412m.m108594g(a, "$this$simpleRunningReduce");
        Object a2 = C58042h.m67192a(new C58095x0(new C65176v(a, cVar, (C15601d) null)), -1, (C54624g) null, 2, (Object) null).mo31880a(new C65126a(this, i0Var), dVar);
        return a2 == C15911a.COROUTINE_SUSPENDED ? a2 : C13598b0.f38549a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89301c(wx3.C15601d<? super p247u3.C65164r1<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p247u3.C65125q0.C65132d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            u3.q0$d r0 = (p247u3.C65125q0.C65132d) r0
            int r1 = r0.f187489e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f187489e = r1
            goto L_0x0018
        L_0x0013:
            u3.q0$d r0 = new u3.q0$d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f187488d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187489e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r1 = r0.f187493i
            k14.c r1 = (k14.C99088c) r1
            java.lang.Object r2 = r0.f187492h
            u3.u0$a r2 = (p247u3.C65173u0.C65174a) r2
            java.lang.Object r0 = r0.f187491g
            u3.q0 r0 = (p247u3.C65125q0) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0056
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r6)
            u3.u0$a<Key, Value> r2 = r5.f187458e
            k14.c r6 = r2.f187640a
            r0.f187491g = r5
            r0.f187492h = r2
            r0.f187493i = r6
            r0.f187489e = r4
            k14.d r6 = (k14.C60942d) r6
            java.lang.Object r0 = r6.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r5
            r1 = r6
        L_0x0056:
            u3.u0<Key, Value> r6 = r2.f187641b     // Catch:{ all -> 0x0062 }
            u3.f2$a r0 = r0.f187455b     // Catch:{ all -> 0x0062 }
            u3.r1 r6 = r6.mo89329a(r0)     // Catch:{ all -> 0x0062 }
            r1.mo85909c(r3)
            return r6
        L_0x0062:
            r6 = move-exception
            r1.mo85909c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.mo89301c(wx3.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: k14.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: k14.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: k14.d} */
    /* JADX WARNING: type inference failed for: r5v37, types: [k14.c] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0240, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0241, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0242, code lost:
        r6.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0245, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0246, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0247, code lost:
        r5.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x024a, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x024d, code lost:
        if ((r5 instanceof p247u3.C65145q1.C65150b.C65151a) == false) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024f, code lost:
        r1 = r8.f187458e;
        r13 = r1.f187640a;
        r3.f187497g = r8;
        r3.f187498h = r5;
        r3.f187499i = r1;
        r3.f187500j = r13;
        r3.f187495e = 9;
        r13 = (k14.C60942d) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0265, code lost:
        if (r13.mo85908b((java.lang.Object) null, r3) != r4) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0267, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0268, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r13 = r1.f187641b;
        r1 = new p247u3.C65060g0.C65061a(((p247u3.C65145q1.C65150b.C65151a) r5).f187561a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0278, code lost:
        if (r13.mo89334f(r2, r1) == false) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x027a, code lost:
        r13 = r8.f187457d;
        r5 = new p247u3.C65086n0.C65091c(r2, false, r1);
        r3.f187497g = r0;
        r3.f187498h = null;
        r3.f187499i = null;
        r3.f187500j = null;
        r3.f187495e = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0293, code lost:
        if (((c14.C54614c) r13).mo75536o(r5, r3) != r4) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0295, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0296, code lost:
        r13 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0298, code lost:
        r0.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a2, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r13 = r8.f187641b;
        r3.f187497g = r9;
        r3.f187498h = r5;
        r3.f187499i = null;
        r3.f187495e = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0110, code lost:
        if (r9.mo89307i(r13, r2, r3) != r4) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0112, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0114, code lost:
        r13 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
        r5.mo85909c((java.lang.Object) null);
        r13 = r8.mo89304f(r2, r8.f187461h);
        r5 = r8.f187462i;
        r3.f187497g = r8;
        r3.f187498h = null;
        r3.f187495e = 3;
        r13 = r5.mo72456d(r13, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012c, code lost:
        if (r13 != r4) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012f, code lost:
        r5 = (p247u3.C65145q1.C65150b) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        if ((r5 instanceof p247u3.C65145q1.C65150b.C65152b) == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0136, code lost:
        r13 = r8.f187458e;
        r9 = r13.f187640a;
        r3.f187497g = r8;
        r3.f187498h = r5;
        r3.f187499i = r13;
        r3.f187500j = r9;
        r3.f187495e = 4;
        r9 = (k14.C60942d) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014b, code lost:
        if (r9.mo85908b((java.lang.Object) null, r3) != r4) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014e, code lost:
        r10 = r8;
        r8 = r13;
        r11 = r9;
        r9 = r5;
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r13 = java.lang.Boolean.valueOf(r8.f187641b.mo89333e(0, r2, (p247u3.C65145q1.C65150b.C65152b) r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0160, code lost:
        r5.mo85909c((java.lang.Object) null);
        r5 = r13.booleanValue();
        r8 = r10.f187458e;
        r13 = r8.f187640a;
        r3.f187497g = r10;
        r3.f187498h = r9;
        r3.f187499i = r8;
        r3.f187500j = r13;
        r3.f187501n = r5;
        r3.f187495e = 5;
        r6 = (k14.C60942d) r13;
        r13 = r6.mo85908b((java.lang.Object) null, r3);
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017f, code lost:
        if (r13 != r4) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r13 = r8.f187641b;
        r13.mo89334f(r2, p247u3.C65060g0.C65063c.f187265c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018e, code lost:
        if (((p247u3.C65145q1.C65150b.C65152b) r9).f187563b != null) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0190, code lost:
        r13.mo89334f(r1, p247u3.C65060g0.C65063c.f187264b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019a, code lost:
        if (((p247u3.C65145q1.C65150b.C65152b) r9).f187564c != null) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019c, code lost:
        r13.mo89334f(r0, p247u3.C65060g0.C65063c.f187264b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a1, code lost:
        r13 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a6, code lost:
        if (r5 == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a8, code lost:
        r6 = r10.f187458e;
        r13 = r6.f187640a;
        r3.f187497g = r10;
        r3.f187498h = r9;
        r3.f187499i = r6;
        r3.f187500j = r13;
        r3.f187495e = 6;
        r13 = (k14.C60942d) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01bd, code lost:
        if (r13.mo85908b((java.lang.Object) null, r3) != r4) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bf, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c0, code lost:
        r5 = r9;
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r6 = r6.f187641b;
        r8 = r9.f187457d;
        r2 = r6.mo89335g((p247u3.C65145q1.C65150b.C65152b) r5, r2);
        r3.f187497g = r9;
        r3.f187498h = r5;
        r3.f187499i = r13;
        r3.f187500j = null;
        r3.f187495e = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01de, code lost:
        if (((c14.C54614c) r8).mo75536o(r2, r3) != r4) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e1, code lost:
        r2 = r13;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r13 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e5, code lost:
        r2.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ea, code lost:
        r2 = r13;
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ec, code lost:
        r2.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ef, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f0, code lost:
        r5 = r9;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f4, code lost:
        if (r6.f187466m == null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f6, code lost:
        r13 = (p247u3.C65145q1.C65150b.C65152b) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fb, code lost:
        if (r13.f187563b == null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ff, code lost:
        if (r13.f187564c != null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0201, code lost:
        r13 = r6.f187458e;
        r2 = r13.f187640a;
        r3.f187497g = r6;
        r3.f187498h = r5;
        r3.f187499i = r13;
        r3.f187500j = r2;
        r3.f187495e = 8;
        r2 = (k14.C60942d) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0217, code lost:
        if (r2.mo85908b((java.lang.Object) null, r3) != r4) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0219, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021a, code lost:
        r4 = r13;
        r3 = r6;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r13 = r4.f187641b.mo89329a(r3.f187455b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0224, code lost:
        r2.mo85909c((java.lang.Object) null);
        r5 = (p247u3.C65145q1.C65150b.C65152b) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022b, code lost:
        if (r5.f187563b != null) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022d, code lost:
        r3.f187466m.mo89337c(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0234, code lost:
        if (r5.f187564c != null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0236, code lost:
        r3.f187466m.mo89337c(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023c, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023d, code lost:
        r2.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89302d(wx3.C15601d<? super rx3.C13598b0> r13) {
        /*
            r12 = this;
            u3.i0 r0 = p247u3.C65069i0.APPEND
            u3.i0 r1 = p247u3.C65069i0.PREPEND
            u3.i0 r2 = p247u3.C65069i0.REFRESH
            boolean r3 = r13 instanceof p247u3.C65125q0.C65133e
            if (r3 == 0) goto L_0x0019
            r3 = r13
            u3.q0$e r3 = (p247u3.C65125q0.C65133e) r3
            int r4 = r3.f187495e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f187495e = r4
            goto L_0x001e
        L_0x0019:
            u3.q0$e r3 = new u3.q0$e
            r3.<init>(r12, r13)
        L_0x001e:
            java.lang.Object r13 = r3.f187494d
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f187495e
            r6 = 0
            r7 = 0
            switch(r5) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00be;
                case 4: goto L_0x00a9;
                case 5: goto L_0x0092;
                case 6: goto L_0x007b;
                case 7: goto L_0x0067;
                case 8: goto L_0x0052;
                case 9: goto L_0x003d;
                case 10: goto L_0x0031;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0031:
            java.lang.Object r0 = r3.f187497g
            k14.c r0 = (k14.C99088c) r0
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x003a }
            goto L_0x0296
        L_0x003a:
            r13 = move-exception
            goto L_0x029c
        L_0x003d:
            java.lang.Object r0 = r3.f187500j
            k14.c r0 = (k14.C99088c) r0
            java.lang.Object r1 = r3.f187499i
            u3.u0$a r1 = (p247u3.C65173u0.C65174a) r1
            java.lang.Object r5 = r3.f187498h
            u3.q1$b r5 = (p247u3.C65145q1.C65150b) r5
            java.lang.Object r8 = r3.f187497g
            u3.q0 r8 = (p247u3.C65125q0) r8
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0269
        L_0x0052:
            java.lang.Object r2 = r3.f187500j
            k14.c r2 = (k14.C99088c) r2
            java.lang.Object r4 = r3.f187499i
            u3.u0$a r4 = (p247u3.C65173u0.C65174a) r4
            java.lang.Object r5 = r3.f187498h
            u3.q1$b r5 = (p247u3.C65145q1.C65150b) r5
            java.lang.Object r3 = r3.f187497g
            u3.q0 r3 = (p247u3.C65125q0) r3
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x021c
        L_0x0067:
            java.lang.Object r2 = r3.f187499i
            k14.c r2 = (k14.C99088c) r2
            java.lang.Object r5 = r3.f187498h
            u3.q1$b r5 = (p247u3.C65145q1.C65150b) r5
            java.lang.Object r6 = r3.f187497g
            u3.q0 r6 = (p247u3.C65125q0) r6
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0078 }
            goto L_0x01e3
        L_0x0078:
            r13 = move-exception
            goto L_0x01ec
        L_0x007b:
            java.lang.Object r5 = r3.f187500j
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r6 = r3.f187499i
            u3.u0$a r6 = (p247u3.C65173u0.C65174a) r6
            java.lang.Object r8 = r3.f187498h
            u3.q1$b r8 = (p247u3.C65145q1.C65150b) r8
            java.lang.Object r9 = r3.f187497g
            u3.q0 r9 = (p247u3.C65125q0) r9
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r5
            r5 = r8
            goto L_0x01c2
        L_0x0092:
            boolean r5 = r3.f187501n
            java.lang.Object r6 = r3.f187500j
            k14.c r6 = (k14.C99088c) r6
            java.lang.Object r8 = r3.f187499i
            u3.u0$a r8 = (p247u3.C65173u0.C65174a) r8
            java.lang.Object r9 = r3.f187498h
            u3.q1$b r9 = (p247u3.C65145q1.C65150b) r9
            java.lang.Object r10 = r3.f187497g
            u3.q0 r10 = (p247u3.C65125q0) r10
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0182
        L_0x00a9:
            java.lang.Object r5 = r3.f187500j
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r8 = r3.f187499i
            u3.u0$a r8 = (p247u3.C65173u0.C65174a) r8
            java.lang.Object r9 = r3.f187498h
            u3.q1$b r9 = (p247u3.C65145q1.C65150b) r9
            java.lang.Object r10 = r3.f187497g
            u3.q0 r10 = (p247u3.C65125q0) r10
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0153
        L_0x00be:
            java.lang.Object r5 = r3.f187497g
            u3.q0 r5 = (p247u3.C65125q0) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r8 = r5
            goto L_0x012f
        L_0x00c7:
            java.lang.Object r5 = r3.f187498h
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r8 = r3.f187497g
            u3.q0 r8 = (p247u3.C65125q0) r8
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x00d3 }
            goto L_0x0114
        L_0x00d3:
            r13 = move-exception
            goto L_0x02a3
        L_0x00d6:
            java.lang.Object r5 = r3.f187499i
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r8 = r3.f187498h
            u3.u0$a r8 = (p247u3.C65173u0.C65174a) r8
            java.lang.Object r9 = r3.f187497g
            u3.q0 r9 = (p247u3.C65125q0) r9
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0101
        L_0x00e6:
            kotlin.ResultKt.throwOnFailure(r13)
            u3.u0$a<Key, Value> r8 = r12.f187458e
            k14.c r13 = r8.f187640a
            r3.f187497g = r12
            r3.f187498h = r8
            r3.f187499i = r13
            r5 = 1
            r3.f187495e = r5
            k14.d r13 = (k14.C60942d) r13
            java.lang.Object r5 = r13.mo85908b(r7, r3)
            if (r5 != r4) goto L_0x00ff
            return r4
        L_0x00ff:
            r9 = r12
            r5 = r13
        L_0x0101:
            u3.u0<Key, Value> r13 = r8.f187641b     // Catch:{ all -> 0x00d3 }
            r3.f187497g = r9     // Catch:{ all -> 0x00d3 }
            r3.f187498h = r5     // Catch:{ all -> 0x00d3 }
            r3.f187499i = r7     // Catch:{ all -> 0x00d3 }
            r8 = 2
            r3.f187495e = r8     // Catch:{ all -> 0x00d3 }
            java.lang.Object r13 = r9.mo89307i(r13, r2, r3)     // Catch:{ all -> 0x00d3 }
            if (r13 != r4) goto L_0x0113
            return r4
        L_0x0113:
            r8 = r9
        L_0x0114:
            rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00d3 }
            r5.mo85909c(r7)
            Key r13 = r8.f187461h
            u3.q1$a r13 = r8.mo89304f(r2, r13)
            u3.q1<Key, Value> r5 = r8.f187462i
            r3.f187497g = r8
            r3.f187498h = r7
            r9 = 3
            r3.f187495e = r9
            java.lang.Object r13 = r5.mo72456d(r13, r3)
            if (r13 != r4) goto L_0x012f
            return r4
        L_0x012f:
            r5 = r13
            u3.q1$b r5 = (p247u3.C65145q1.C65150b) r5
            boolean r13 = r5 instanceof p247u3.C65145q1.C65150b.C65152b
            if (r13 == 0) goto L_0x024b
            u3.u0$a<Key, Value> r13 = r8.f187458e
            k14.c r9 = r13.f187640a
            r3.f187497g = r8
            r3.f187498h = r5
            r3.f187499i = r13
            r3.f187500j = r9
            r10 = 4
            r3.f187495e = r10
            k14.d r9 = (k14.C60942d) r9
            java.lang.Object r10 = r9.mo85908b(r7, r3)
            if (r10 != r4) goto L_0x014e
            return r4
        L_0x014e:
            r10 = r8
            r8 = r13
            r11 = r9
            r9 = r5
            r5 = r11
        L_0x0153:
            u3.u0<Key, Value> r13 = r8.f187641b     // Catch:{ all -> 0x0246 }
            r8 = r9
            u3.q1$b$b r8 = (p247u3.C65145q1.C65150b.C65152b) r8     // Catch:{ all -> 0x0246 }
            boolean r13 = r13.mo89333e(r6, r2, r8)     // Catch:{ all -> 0x0246 }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0246 }
            r5.mo85909c(r7)
            boolean r5 = r13.booleanValue()
            u3.u0$a<Key, Value> r8 = r10.f187458e
            k14.c r13 = r8.f187640a
            r3.f187497g = r10
            r3.f187498h = r9
            r3.f187499i = r8
            r3.f187500j = r13
            r3.f187501n = r5
            r6 = 5
            r3.f187495e = r6
            r6 = r13
            k14.d r6 = (k14.C60942d) r6
            java.lang.Object r13 = r6.mo85908b(r7, r3)
            if (r13 != r4) goto L_0x0182
            return r4
        L_0x0182:
            u3.u0<Key, Value> r13 = r8.f187641b     // Catch:{ all -> 0x0241 }
            u3.g0$c r8 = p247u3.C65060g0.C65063c.f187265c     // Catch:{ all -> 0x0241 }
            r13.mo89334f(r2, r8)     // Catch:{ all -> 0x0241 }
            r8 = r9
            u3.q1$b$b r8 = (p247u3.C65145q1.C65150b.C65152b) r8     // Catch:{ all -> 0x0241 }
            Key r8 = r8.f187563b     // Catch:{ all -> 0x0241 }
            if (r8 != 0) goto L_0x0195
            u3.g0$c r8 = p247u3.C65060g0.C65063c.f187264b     // Catch:{ all -> 0x0241 }
            r13.mo89334f(r1, r8)     // Catch:{ all -> 0x0241 }
        L_0x0195:
            r8 = r9
            u3.q1$b$b r8 = (p247u3.C65145q1.C65150b.C65152b) r8     // Catch:{ all -> 0x0241 }
            Key r8 = r8.f187564c     // Catch:{ all -> 0x0241 }
            if (r8 != 0) goto L_0x01a1
            u3.g0$c r8 = p247u3.C65060g0.C65063c.f187264b     // Catch:{ all -> 0x0241 }
            r13.mo89334f(r0, r8)     // Catch:{ all -> 0x0241 }
        L_0x01a1:
            rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0241 }
            r6.mo85909c(r7)
            if (r5 == 0) goto L_0x01f0
            u3.u0$a<Key, Value> r6 = r10.f187458e
            k14.c r13 = r6.f187640a
            r3.f187497g = r10
            r3.f187498h = r9
            r3.f187499i = r6
            r3.f187500j = r13
            r5 = 6
            r3.f187495e = r5
            k14.d r13 = (k14.C60942d) r13
            java.lang.Object r5 = r13.mo85908b(r7, r3)
            if (r5 != r4) goto L_0x01c0
            return r4
        L_0x01c0:
            r5 = r9
            r9 = r10
        L_0x01c2:
            u3.u0<Key, Value> r6 = r6.f187641b     // Catch:{ all -> 0x01e9 }
            c14.h<u3.n0<Value>> r8 = r9.f187457d     // Catch:{ all -> 0x01e9 }
            r10 = r5
            u3.q1$b$b r10 = (p247u3.C65145q1.C65150b.C65152b) r10     // Catch:{ all -> 0x01e9 }
            u3.n0 r2 = r6.mo89335g(r10, r2)     // Catch:{ all -> 0x01e9 }
            r3.f187497g = r9     // Catch:{ all -> 0x01e9 }
            r3.f187498h = r5     // Catch:{ all -> 0x01e9 }
            r3.f187499i = r13     // Catch:{ all -> 0x01e9 }
            r3.f187500j = r7     // Catch:{ all -> 0x01e9 }
            r6 = 7
            r3.f187495e = r6     // Catch:{ all -> 0x01e9 }
            c14.c r8 = (c14.C54614c) r8     // Catch:{ all -> 0x01e9 }
            java.lang.Object r2 = r8.mo75536o(r2, r3)     // Catch:{ all -> 0x01e9 }
            if (r2 != r4) goto L_0x01e1
            return r4
        L_0x01e1:
            r2 = r13
            r6 = r9
        L_0x01e3:
            rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0078 }
            r2.mo85909c(r7)
            goto L_0x01f2
        L_0x01e9:
            r0 = move-exception
            r2 = r13
            r13 = r0
        L_0x01ec:
            r2.mo85909c(r7)
            throw r13
        L_0x01f0:
            r5 = r9
            r6 = r10
        L_0x01f2:
            u3.u1<Key, Value> r13 = r6.f187466m
            if (r13 == 0) goto L_0x02a0
            r13 = r5
            u3.q1$b$b r13 = (p247u3.C65145q1.C65150b.C65152b) r13
            Key r2 = r13.f187563b
            if (r2 == 0) goto L_0x0201
            Key r13 = r13.f187564c
            if (r13 != 0) goto L_0x02a0
        L_0x0201:
            u3.u0$a<Key, Value> r13 = r6.f187458e
            k14.c r2 = r13.f187640a
            r3.f187497g = r6
            r3.f187498h = r5
            r3.f187499i = r13
            r3.f187500j = r2
            r8 = 8
            r3.f187495e = r8
            k14.d r2 = (k14.C60942d) r2
            java.lang.Object r3 = r2.mo85908b(r7, r3)
            if (r3 != r4) goto L_0x021a
            return r4
        L_0x021a:
            r4 = r13
            r3 = r6
        L_0x021c:
            u3.u0<Key, Value> r13 = r4.f187641b     // Catch:{ all -> 0x023c }
            u3.f2$a r4 = r3.f187455b     // Catch:{ all -> 0x023c }
            u3.r1 r13 = r13.mo89329a(r4)     // Catch:{ all -> 0x023c }
            r2.mo85909c(r7)
            u3.q1$b$b r5 = (p247u3.C65145q1.C65150b.C65152b) r5
            Key r2 = r5.f187563b
            if (r2 != 0) goto L_0x0232
            u3.u1<Key, Value> r2 = r3.f187466m
            r2.mo89337c(r1, r13)
        L_0x0232:
            Key r1 = r5.f187564c
            if (r1 != 0) goto L_0x02a0
            u3.u1<Key, Value> r1 = r3.f187466m
            r1.mo89337c(r0, r13)
            goto L_0x02a0
        L_0x023c:
            r13 = move-exception
            r2.mo85909c(r7)
            throw r13
        L_0x0241:
            r13 = move-exception
            r6.mo85909c(r7)
            throw r13
        L_0x0246:
            r13 = move-exception
            r5.mo85909c(r7)
            throw r13
        L_0x024b:
            boolean r13 = r5 instanceof p247u3.C65145q1.C65150b.C65151a
            if (r13 == 0) goto L_0x02a0
            u3.u0$a<Key, Value> r1 = r8.f187458e
            k14.c r13 = r1.f187640a
            r3.f187497g = r8
            r3.f187498h = r5
            r3.f187499i = r1
            r3.f187500j = r13
            r0 = 9
            r3.f187495e = r0
            k14.d r13 = (k14.C60942d) r13
            java.lang.Object r0 = r13.mo85908b(r7, r3)
            if (r0 != r4) goto L_0x0268
            return r4
        L_0x0268:
            r0 = r13
        L_0x0269:
            u3.u0<Key, Value> r13 = r1.f187641b     // Catch:{ all -> 0x003a }
            u3.g0$a r1 = new u3.g0$a     // Catch:{ all -> 0x003a }
            u3.q1$b$a r5 = (p247u3.C65145q1.C65150b.C65151a) r5     // Catch:{ all -> 0x003a }
            java.lang.Throwable r5 = r5.f187561a     // Catch:{ all -> 0x003a }
            r1.<init>(r5)     // Catch:{ all -> 0x003a }
            boolean r13 = r13.mo89334f(r2, r1)     // Catch:{ all -> 0x003a }
            if (r13 == 0) goto L_0x0296
            c14.h<u3.n0<Value>> r13 = r8.f187457d     // Catch:{ all -> 0x003a }
            u3.n0$c r5 = new u3.n0$c     // Catch:{ all -> 0x003a }
            r5.<init>(r2, r6, r1)     // Catch:{ all -> 0x003a }
            r3.f187497g = r0     // Catch:{ all -> 0x003a }
            r3.f187498h = r7     // Catch:{ all -> 0x003a }
            r3.f187499i = r7     // Catch:{ all -> 0x003a }
            r3.f187500j = r7     // Catch:{ all -> 0x003a }
            r1 = 10
            r3.f187495e = r1     // Catch:{ all -> 0x003a }
            c14.c r13 = (c14.C54614c) r13     // Catch:{ all -> 0x003a }
            java.lang.Object r13 = r13.mo75536o(r5, r3)     // Catch:{ all -> 0x003a }
            if (r13 != r4) goto L_0x0296
            return r4
        L_0x0296:
            rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003a }
            r0.mo85909c(r7)
            goto L_0x02a0
        L_0x029c:
            r0.mo85909c(r7)
            throw r13
        L_0x02a0:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        L_0x02a3:
            r5.mo85909c(r7)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.mo89302d(wx3.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: u3.q1$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: k14.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: k14.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: k14.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: k14.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v61, resolved type: k14.c} */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r0v76, types: [k14.c] */
    /* JADX WARNING: type inference failed for: r0v87, types: [k14.c] */
    /* JADX WARNING: type inference failed for: r0v91, types: [k14.c] */
    /* JADX WARNING: type inference failed for: r1v70 */
    /* JADX WARNING: type inference failed for: r1v75 */
    /* JADX WARNING: type inference failed for: r1v76 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x038d, code lost:
        throw new java.lang.IllegalArgumentException(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x038e, code lost:
        r1 = ((p247u3.C65145q1.C65150b.C65152b) r0).f187563b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0394, code lost:
        r9.f187462i.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03a1, code lost:
        if ((!gy3.C87412m.m108589b(r1, r12.f27484d)) == false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03a3, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03a5, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03a6, code lost:
        if (r1 != false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03a8, code lost:
        if (r15 != r4) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03aa, code lost:
        r0 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03ad, code lost:
        r0 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03de, code lost:
        throw new java.lang.IllegalStateException(z04.C66725r.m78729c("The same value, " + r12.f27484d + ", was passed as the " + r0 + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", (java.lang.String) null, 1, (java.lang.Object) null).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03df, code lost:
        r7 = r9.f187458e;
        r1 = r7.f187640a;
        r5.f187505g = r9;
        r5.f187506h = r15;
        r5.f187507i = r14;
        r5.f187508j = r13;
        r5.f187509n = r12;
        r5.f187510o = r11;
        r5.f187511p = r10;
        r5.f187512q = r0;
        r5.f187513r = r7;
        r5.f187514s = r1;
        r5.f187503e = 5;
        r1 = (k14.C60942d) r1;
        r21 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0403, code lost:
        if (r1.mo85908b((java.lang.Object) null, r5) != r6) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0405, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0406, code lost:
        r7 = r21;
        r18 = r9;
        r9 = r0;
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r21 = r0;
        r0 = java.lang.Boolean.valueOf(r7.f187641b.mo89333e(r14.f187728a, r15, (p247u3.C65145q1.C65150b.C65152b) r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x041e, code lost:
        r1.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0426, code lost:
        if (r0.booleanValue() != false) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x042a, code lost:
        r1 = (p247u3.C65145q1.C65150b.C65152b) r9;
        r13.f27483d += r1.f187562a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0438, code lost:
        if (r15 != r4) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x043c, code lost:
        if (r1.f187563b == null) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0441, code lost:
        if (r15 != r3) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0445, code lost:
        if (r1.f187564c != null) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0448, code lost:
        r11.f27482d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x044a, code lost:
        r0 = r9;
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0450, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0451, code lost:
        r1.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0455, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0458, code lost:
        if ((r0 instanceof p247u3.C65145q1.C65150b.C65151a) == false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x045a, code lost:
        r3 = r9.f187458e;
        r1 = r3.f187640a;
        r5.f187505g = r9;
        r5.f187506h = r15;
        r5.f187507i = r14;
        r5.f187508j = r0;
        r5.f187509n = r3;
        r5.f187510o = r1;
        r5.f187511p = null;
        r5.f187503e = 6;
        r1 = (k14.C60942d) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0476, code lost:
        if (r1.mo85908b((java.lang.Object) null, r5) != r6) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0478, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0479, code lost:
        r4 = r0;
        r0 = r5;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r2 = r3.f187641b;
        r3 = new p247u3.C65060g0.C65061a(((p247u3.C65145q1.C65150b.C65151a) r4).f187561a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x048b, code lost:
        if (r2.mo89334f(r5, r3) == false) goto L_0x04bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x048d, code lost:
        r4 = r9.f187457d;
        r7 = new p247u3.C65086n0.C65091c(r5, false, r3);
        r0.f187505g = r5;
        r0.f187506h = r14;
        r0.f187507i = r1;
        r0.f187508j = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r0.f187509n = null;
        r0.f187510o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r0.f187503e = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04ab, code lost:
        if (((c14.C54614c) r4).mo75536o(r7, r0) != r6) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04ad, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04ae, code lost:
        r3 = r1;
        r0 = r2;
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04b1, code lost:
        r2 = r0;
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04b4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04b5, code lost:
        r3 = r1;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04bb, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r2.f187637j.put(r5, r14.f187729b);
        r0 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04c5, code lost:
        r3.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04cb, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04cc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04cd, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04d0, code lost:
        r3.mo85909c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04da, code lost:
        if (r15.ordinal() == 1) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04dc, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04de, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04df, code lost:
        r1 = r9.f187458e;
        r7 = r1.f187640a;
        r5.f187505g = r9;
        r5.f187506h = r15;
        r5.f187507i = r14;
        r5.f187508j = r13;
        r5.f187509n = r12;
        r5.f187510o = r11;
        r5.f187511p = r10;
        r5.f187512q = r0;
        r5.f187513r = r2;
        r5.f187514s = r1;
        r5.f187515t = r7;
        r21 = r0;
        r5.f187503e = 8;
        r7 = (k14.C60942d) r7;
        r22 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0508, code lost:
        if (r7.mo85908b((java.lang.Object) null, r5) != r6) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x050a, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x050b, code lost:
        r1 = r7;
        r0 = r9;
        r7 = r22;
        r9 = r2;
        r2 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        r7 = r7.f187641b;
        r16 = r8;
        r8 = r7.mo89331c(r9, r15.f187729b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0522, code lost:
        if (r8 == null) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0524, code lost:
        r7.mo89330b(r8);
        r9 = r0.f187457d;
        r5.f187505g = r0;
        r5.f187506h = r2;
        r5.f187507i = r15;
        r5.f187508j = r14;
        r5.f187509n = r13;
        r5.f187510o = r12;
        r5.f187511p = r11;
        r5.f187512q = r10;
        r5.f187513r = r1;
        r5.f187514s = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x053d, code lost:
        r21 = r1;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r5.f187515t = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0542, code lost:
        r1 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r5.f187503e = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x054c, code lost:
        if (((c14.C54614c) r9).mo75536o(r8, r5) != r6) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x054e, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x054f, code lost:
        r1 = r21;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0558, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r2 = rx3.C13598b0.f38549a;
        r2 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0560, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0561, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0564, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0567, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0568, code lost:
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x056c, code lost:
        r21 = r1;
        r9 = r10;
        r10 = r11;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0570, code lost:
        r17 = r3;
        r3 = r0.mo89305g(r7, r2, r15.f187728a, r15.mo89341a(r2) + r14.f27483d);
        r13.f27484d = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0581, code lost:
        if (r3 != null) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x058b, code lost:
        if ((r7.f187638k.mo89264b(r2) instanceof p247u3.C65060g0.C65061a) != false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x058f, code lost:
        if (r12.f27482d == false) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0591, code lost:
        r3 = p247u3.C65060g0.C65063c.f187264b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0594, code lost:
        r3 = p247u3.C65060g0.C65063c.f187265c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0596, code lost:
        r7.mo89334f(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0599, code lost:
        r3 = r7.mo89335g((p247u3.C65145q1.C65150b.C65152b) r9, r2);
        r7 = r0.f187457d;
        r5.f187505g = r0;
        r5.f187506h = r2;
        r5.f187507i = r15;
        r5.f187508j = r14;
        r5.f187509n = r13;
        r5.f187510o = r12;
        r5.f187511p = r10;
        r5.f187512q = r9;
        r5.f187513r = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        r5.f187514s = null;
        r5.f187515t = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05bb, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r5.f187503e = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05c3, code lost:
        if (((c14.C54614c) r7).mo75536o(r3, r5) != r6) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05c5, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05c6, code lost:
        r7 = r1;
        r1 = r12;
        r12 = r14;
        r11 = r15;
        r15 = r0;
        r0 = r9;
        r9 = r10;
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        r2 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05d0, code lost:
        r7.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05d6, code lost:
        if ((r9 instanceof p247u3.C65145q1.C65146a.C65148b) == false) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05dd, code lost:
        if (((p247u3.C65145q1.C65150b.C65152b) r0).f187563b != null) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05df, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05e1, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05e4, code lost:
        if ((r9 instanceof p247u3.C65145q1.C65146a.C65147a) == false) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05ea, code lost:
        if (((p247u3.C65145q1.C65150b.C65152b) r0).f187564c != null) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05ec, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05ee, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05f1, code lost:
        if (r15.f187466m == null) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05f3, code lost:
        if (r7 != 0) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05f5, code lost:
        if (r0 == 0) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05f7, code lost:
        r14 = r15.f187458e;
        r2 = r14.f187640a;
        r5.f187505g = r15;
        r5.f187506h = r10;
        r5.f187507i = r11;
        r5.f187508j = r12;
        r5.f187509n = r13;
        r5.f187510o = r1;
        r5.f187511p = r14;
        r5.f187512q = r2;
        r5.f187513r = null;
        r5.f187516u = r7;
        r5.f187517v = r0;
        r5.f187503e = 11;
        r2 = (k14.C60942d) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x061c, code lost:
        if (r2.mo85908b((java.lang.Object) null, r5) != r6) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x061e, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x061f, code lost:
        r9 = r13;
        r13 = r2;
        r18 = r1;
        r1 = r0;
        r0 = r15;
        r15 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        r2 = r14.f187641b.mo89329a(r0.f187455b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0633, code lost:
        if (r7 == 0) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0635, code lost:
        r0.f187466m.mo89337c(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x063a, code lost:
        if (r1 == 0) goto L_0x0644;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x063c, code lost:
        r3 = r17;
        r0.f187466m.mo89337c(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0644, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0646, code lost:
        r14 = r0;
        r13 = r10;
        r0 = r15;
        r10 = r9;
        r18 = r12;
        r12 = r11;
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0650, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0651, code lost:
        r13.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0655, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0656, code lost:
        r3 = r17;
        r0 = r1;
        r14 = r15;
        r18 = r13;
        r13 = r10;
        r10 = r18;
        r19 = r12;
        r12 = r11;
        r11 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0664, code lost:
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0668, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0669, code lost:
        r7 = r1;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x066c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x066d, code lost:
        r21 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0679, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x067a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x067b, code lost:
        r9 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x068b, code lost:
        throw new java.lang.IllegalStateException(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x068c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x068d, code lost:
        r2.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0122, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0691, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r7 = r7.f187641b;
        r11 = r0.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0244, code lost:
        if (r11 == 0) goto L_0x0682;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0247, code lost:
        if (r11 == 1) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x024a, code lost:
        if (r11 == 2) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x024e, code lost:
        r11 = (r7.f187630c + r10.f187729b.f187255d) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0257, code lost:
        if (r11 >= 0) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0259, code lost:
        r9.f27483d += r12.f187463j.f187298a * (-r11);
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0266, code lost:
        r13 = sx3.C64197v.m75536e(r7.f187629b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x026c, code lost:
        if (r11 > r13) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x026e, code lost:
        r9.f27483d += ((p247u3.C65145q1.C65150b.C65152b) ((java.util.ArrayList) r7.f187629b).get(r11)).f187562a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0283, code lost:
        if (r11 == r13) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0285, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0288, code lost:
        r11 = (r7.f187630c + r10.f187729b.f187254c) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0297, code lost:
        if (r11 <= sx3.C64197v.m75536e(r7.f187629b)) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0299, code lost:
        r9.f27483d += r12.f187463j.f187298a * (r11 - sx3.C64197v.m75536e(r7.f187629b));
        r11 = sx3.C64197v.m75536e(r7.f187629b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02b1, code lost:
        if (r11 < 0) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02b3, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02b4, code lost:
        r9.f27483d += ((p247u3.C65145q1.C65150b.C65152b) ((java.util.ArrayList) r7.f187629b).get(r13)).f187562a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02c9, code lost:
        if (r13 == r11) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02cb, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02ce, code lost:
        r7 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02d0, code lost:
        r2.mo85909c((java.lang.Object) null);
        r2 = new gy3.C8479f0();
        r7 = r12.f187458e;
        r11 = r7.f187640a;
        r5.f187505g = r12;
        r5.f187506h = r0;
        r5.f187507i = r10;
        r5.f187508j = r9;
        r5.f187509n = r2;
        r5.f187510o = r7;
        r5.f187511p = r11;
        r5.f187512q = r2;
        r5.f187503e = 2;
        r11 = (k14.C60942d) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02f7, code lost:
        if (r11.mo85908b((java.lang.Object) null, r5) != r6) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02f9, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02fa, code lost:
        r13 = r0;
        r0 = r2;
        r14 = r12;
        r12 = r10;
        r10 = r0;
        r18 = r9;
        r9 = r7;
        r7 = r11;
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r2 = r9.f187641b;
        r1 = r14.mo89305g(r2, r13, r12.f187728a, r12.mo89341a(r13) + r11.f27483d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0314, code lost:
        if (r1 == null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0316, code lost:
        r5.f187505g = r14;
        r5.f187506h = r13;
        r5.f187507i = r12;
        r5.f187508j = r11;
        r5.f187509n = r10;
        r5.f187510o = r7;
        r5.f187511p = r1;
        r5.f187512q = r0;
        r5.f187503e = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x032d, code lost:
        if (r14.mo89307i(r2, r13, r5) != r6) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x032f, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0330, code lost:
        r9 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0331, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0334, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0336, code lost:
        r7.mo85909c((java.lang.Object) null);
        r0.f27484d = r1;
        r0 = new gy3.C8477a0();
        r0.f27482d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0343, code lost:
        r1 = r10.f27484d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0345, code lost:
        if (r1 == null) goto L_0x0677;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0347, code lost:
        r1 = r14.mo89304f(r13, r1);
        r2 = r14.f187462i;
        r5.f187505g = r14;
        r5.f187506h = r13;
        r5.f187507i = r12;
        r5.f187508j = r11;
        r5.f187509n = r10;
        r5.f187510o = r0;
        r5.f187511p = r1;
        r5.f187512q = null;
        r5.f187513r = null;
        r5.f187503e = 4;
        r2 = r2.mo72456d(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0367, code lost:
        if (r2 != r6) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0369, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x036a, code lost:
        r15 = r13;
        r9 = r14;
        r13 = r11;
        r14 = r12;
        r11 = r0;
        r12 = r10;
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0371, code lost:
        r0 = (p247u3.C65145q1.C65150b) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0376, code lost:
        if ((r0 instanceof p247u3.C65145q1.C65150b.C65152b) == false) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0378, code lost:
        r1 = r15.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x037d, code lost:
        if (r1 == 1) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0380, code lost:
        if (r1 != 2) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0382, code lost:
        r1 = ((p247u3.C65145q1.C65150b.C65152b) r0).f187564c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89303e(p247u3.C65069i0 r21, p247u3.C65206z r22, wx3.C15601d<? super rx3.C13598b0> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            u3.i0 r3 = p247u3.C65069i0.APPEND
            u3.i0 r4 = p247u3.C65069i0.PREPEND
            boolean r5 = r2 instanceof p247u3.C65125q0.C65134f
            if (r5 == 0) goto L_0x001d
            r5 = r2
            u3.q0$f r5 = (p247u3.C65125q0.C65134f) r5
            int r6 = r5.f187503e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f187503e = r6
            goto L_0x0022
        L_0x001d:
            u3.q0$f r5 = new u3.q0$f
            r5.<init>(r1, r2)
        L_0x0022:
            java.lang.Object r2 = r5.f187502d
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f187503e
            java.lang.String r8 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r7) {
                case 0: goto L_0x020a;
                case 1: goto L_0x01ec;
                case 2: goto L_0x01c7;
                case 3: goto L_0x019f;
                case 4: goto L_0x0177;
                case 5: goto L_0x0146;
                case 6: goto L_0x0125;
                case 7: goto L_0x010c;
                case 8: goto L_0x00d3;
                case 9: goto L_0x009b;
                case 10: goto L_0x0066;
                case 11: goto L_0x0035;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            int r0 = r5.f187517v
            int r7 = r5.f187516u
            java.lang.Object r13 = r5.f187512q
            k14.c r13 = (k14.C99088c) r13
            java.lang.Object r14 = r5.f187511p
            u3.u0$a r14 = (p247u3.C65173u0.C65174a) r14
            java.lang.Object r15 = r5.f187510o
            gy3.a0 r15 = (gy3.C8477a0) r15
            java.lang.Object r9 = r5.f187509n
            gy3.f0 r9 = (gy3.C8479f0) r9
            java.lang.Object r12 = r5.f187508j
            gy3.d0 r12 = (gy3.C8478d0) r12
            java.lang.Object r11 = r5.f187507i
            u3.z r11 = (p247u3.C65206z) r11
            java.lang.Object r10 = r5.f187506h
            u3.i0 r10 = (p247u3.C65069i0) r10
            r21 = r0
            java.lang.Object r0 = r5.f187505g
            u3.q0 r0 = (p247u3.C65125q0) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r21
            r17 = r3
            r16 = r8
            goto L_0x0627
        L_0x0066:
            java.lang.Object r0 = r5.f187513r
            r7 = r0
            k14.c r7 = (k14.C99088c) r7
            java.lang.Object r0 = r5.f187512q
            u3.q1$b r0 = (p247u3.C65145q1.C65150b) r0
            java.lang.Object r9 = r5.f187511p
            u3.q1$a r9 = (p247u3.C65145q1.C65146a) r9
            java.lang.Object r10 = r5.f187510o
            gy3.a0 r10 = (gy3.C8477a0) r10
            java.lang.Object r11 = r5.f187509n
            gy3.f0 r11 = (gy3.C8479f0) r11
            java.lang.Object r12 = r5.f187508j
            gy3.d0 r12 = (gy3.C8478d0) r12
            java.lang.Object r13 = r5.f187507i
            u3.z r13 = (p247u3.C65206z) r13
            java.lang.Object r14 = r5.f187506h
            u3.i0 r14 = (p247u3.C65069i0) r14
            java.lang.Object r15 = r5.f187505g
            u3.q0 r15 = (p247u3.C65125q0) r15
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ all -> 0x00cf }
            r17 = r3
            r16 = r8
            r1 = r10
            r10 = r14
            r18 = r13
            r13 = r11
            r11 = r18
            goto L_0x05ce
        L_0x009b:
            java.lang.Object r0 = r5.f187514s
            u3.u0 r0 = (p247u3.C65173u0) r0
            java.lang.Object r7 = r5.f187513r
            k14.c r7 = (k14.C99088c) r7
            java.lang.Object r9 = r5.f187512q
            u3.q1$b r9 = (p247u3.C65145q1.C65150b) r9
            java.lang.Object r10 = r5.f187511p
            u3.q1$a r10 = (p247u3.C65145q1.C65146a) r10
            java.lang.Object r11 = r5.f187510o
            gy3.a0 r11 = (gy3.C8477a0) r11
            java.lang.Object r12 = r5.f187509n
            gy3.f0 r12 = (gy3.C8479f0) r12
            java.lang.Object r13 = r5.f187508j
            gy3.d0 r13 = (gy3.C8478d0) r13
            java.lang.Object r14 = r5.f187507i
            u3.z r14 = (p247u3.C65206z) r14
            java.lang.Object r15 = r5.f187506h
            u3.i0 r15 = (p247u3.C65069i0) r15
            r21 = r0
            java.lang.Object r0 = r5.f187505g
            u3.q0 r0 = (p247u3.C65125q0) r0
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ all -> 0x00cf }
            r1 = r7
            r16 = r8
            r7 = r21
            goto L_0x0558
        L_0x00cf:
            r0 = move-exception
        L_0x00d0:
            r1 = 0
            goto L_0x0673
        L_0x00d3:
            java.lang.Object r0 = r5.f187515t
            k14.c r0 = (k14.C99088c) r0
            java.lang.Object r7 = r5.f187514s
            u3.u0$a r7 = (p247u3.C65173u0.C65174a) r7
            java.lang.Object r9 = r5.f187513r
            u3.i0 r9 = (p247u3.C65069i0) r9
            java.lang.Object r10 = r5.f187512q
            u3.q1$b r10 = (p247u3.C65145q1.C65150b) r10
            java.lang.Object r11 = r5.f187511p
            u3.q1$a r11 = (p247u3.C65145q1.C65146a) r11
            java.lang.Object r12 = r5.f187510o
            gy3.a0 r12 = (gy3.C8477a0) r12
            java.lang.Object r13 = r5.f187509n
            gy3.f0 r13 = (gy3.C8479f0) r13
            java.lang.Object r14 = r5.f187508j
            gy3.d0 r14 = (gy3.C8478d0) r14
            java.lang.Object r15 = r5.f187507i
            u3.z r15 = (p247u3.C65206z) r15
            r21 = r0
            java.lang.Object r0 = r5.f187506h
            u3.i0 r0 = (p247u3.C65069i0) r0
            r22 = r0
            java.lang.Object r0 = r5.f187505g
            u3.q0 r0 = (p247u3.C65125q0) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r21
            r2 = r22
            goto L_0x0518
        L_0x010c:
            java.lang.Object r0 = r5.f187508j
            u3.u0 r0 = (p247u3.C65173u0) r0
            java.lang.Object r3 = r5.f187507i
            k14.c r3 = (k14.C99088c) r3
            java.lang.Object r4 = r5.f187506h
            u3.z r4 = (p247u3.C65206z) r4
            java.lang.Object r5 = r5.f187505g
            u3.i0 r5 = (p247u3.C65069i0) r5
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ all -> 0x0121 }
            goto L_0x04b1
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r1 = 0
            goto L_0x04d0
        L_0x0125:
            java.lang.Object r0 = r5.f187510o
            k14.c r0 = (k14.C99088c) r0
            java.lang.Object r3 = r5.f187509n
            u3.u0$a r3 = (p247u3.C65173u0.C65174a) r3
            java.lang.Object r4 = r5.f187508j
            u3.q1$b r4 = (p247u3.C65145q1.C65150b) r4
            java.lang.Object r7 = r5.f187507i
            u3.z r7 = (p247u3.C65206z) r7
            java.lang.Object r8 = r5.f187506h
            u3.i0 r8 = (p247u3.C65069i0) r8
            java.lang.Object r9 = r5.f187505g
            u3.q0 r9 = (p247u3.C65125q0) r9
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r0
            r0 = r5
            r14 = r7
            r5 = r8
            goto L_0x047c
        L_0x0146:
            java.lang.Object r0 = r5.f187514s
            k14.c r0 = (k14.C99088c) r0
            java.lang.Object r7 = r5.f187513r
            u3.u0$a r7 = (p247u3.C65173u0.C65174a) r7
            java.lang.Object r9 = r5.f187512q
            u3.q1$b r9 = (p247u3.C65145q1.C65150b) r9
            java.lang.Object r10 = r5.f187511p
            u3.q1$a r10 = (p247u3.C65145q1.C65146a) r10
            java.lang.Object r11 = r5.f187510o
            gy3.a0 r11 = (gy3.C8477a0) r11
            java.lang.Object r12 = r5.f187509n
            gy3.f0 r12 = (gy3.C8479f0) r12
            java.lang.Object r13 = r5.f187508j
            gy3.d0 r13 = (gy3.C8478d0) r13
            java.lang.Object r14 = r5.f187507i
            u3.z r14 = (p247u3.C65206z) r14
            java.lang.Object r15 = r5.f187506h
            u3.i0 r15 = (p247u3.C65069i0) r15
            r21 = r0
            java.lang.Object r0 = r5.f187505g
            u3.q0 r0 = (p247u3.C65125q0) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r21
            goto L_0x040d
        L_0x0177:
            java.lang.Object r0 = r5.f187511p
            u3.q1$a r0 = (p247u3.C65145q1.C65146a) r0
            java.lang.Object r7 = r5.f187510o
            gy3.a0 r7 = (gy3.C8477a0) r7
            java.lang.Object r9 = r5.f187509n
            gy3.f0 r9 = (gy3.C8479f0) r9
            java.lang.Object r10 = r5.f187508j
            gy3.d0 r10 = (gy3.C8478d0) r10
            java.lang.Object r11 = r5.f187507i
            u3.z r11 = (p247u3.C65206z) r11
            java.lang.Object r12 = r5.f187506h
            u3.i0 r12 = (p247u3.C65069i0) r12
            java.lang.Object r13 = r5.f187505g
            u3.q0 r13 = (p247u3.C65125q0) r13
            kotlin.ResultKt.throwOnFailure(r2)
            r14 = r11
            r15 = r12
            r11 = r7
            r12 = r9
            r9 = r13
            r13 = r10
            r10 = r0
            goto L_0x0371
        L_0x019f:
            java.lang.Object r0 = r5.f187512q
            gy3.f0 r0 = (gy3.C8479f0) r0
            java.lang.Object r7 = r5.f187511p
            java.lang.Object r9 = r5.f187510o
            k14.c r9 = (k14.C99088c) r9
            java.lang.Object r10 = r5.f187509n
            gy3.f0 r10 = (gy3.C8479f0) r10
            java.lang.Object r11 = r5.f187508j
            gy3.d0 r11 = (gy3.C8478d0) r11
            java.lang.Object r12 = r5.f187507i
            u3.z r12 = (p247u3.C65206z) r12
            java.lang.Object r13 = r5.f187506h
            u3.i0 r13 = (p247u3.C65069i0) r13
            java.lang.Object r14 = r5.f187505g
            u3.q0 r14 = (p247u3.C65125q0) r14
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ all -> 0x01c3 }
            r1 = r7
            goto L_0x0331
        L_0x01c3:
            r0 = move-exception
        L_0x01c4:
            r1 = 0
            goto L_0x067e
        L_0x01c7:
            java.lang.Object r0 = r5.f187512q
            gy3.f0 r0 = (gy3.C8479f0) r0
            java.lang.Object r7 = r5.f187511p
            k14.c r7 = (k14.C99088c) r7
            java.lang.Object r9 = r5.f187510o
            u3.u0$a r9 = (p247u3.C65173u0.C65174a) r9
            java.lang.Object r10 = r5.f187509n
            gy3.f0 r10 = (gy3.C8479f0) r10
            java.lang.Object r11 = r5.f187508j
            gy3.d0 r11 = (gy3.C8478d0) r11
            java.lang.Object r12 = r5.f187507i
            u3.z r12 = (p247u3.C65206z) r12
            java.lang.Object r13 = r5.f187506h
            u3.i0 r13 = (p247u3.C65069i0) r13
            java.lang.Object r14 = r5.f187505g
            u3.q0 r14 = (p247u3.C65125q0) r14
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0305
        L_0x01ec:
            java.lang.Object r0 = r5.f187510o
            k14.c r0 = (k14.C99088c) r0
            java.lang.Object r7 = r5.f187509n
            u3.u0$a r7 = (p247u3.C65173u0.C65174a) r7
            java.lang.Object r9 = r5.f187508j
            gy3.d0 r9 = (gy3.C8478d0) r9
            java.lang.Object r10 = r5.f187507i
            u3.z r10 = (p247u3.C65206z) r10
            java.lang.Object r11 = r5.f187506h
            u3.i0 r11 = (p247u3.C65069i0) r11
            java.lang.Object r12 = r5.f187505g
            u3.q0 r12 = (p247u3.C65125q0) r12
            kotlin.ResultKt.throwOnFailure(r2)
            r2 = r0
            r0 = r11
            goto L_0x023e
        L_0x020a:
            kotlin.ResultKt.throwOnFailure(r2)
            u3.i0 r2 = p247u3.C65069i0.REFRESH
            if (r0 == r2) goto L_0x0213
            r2 = 1
            goto L_0x0214
        L_0x0213:
            r2 = 0
        L_0x0214:
            if (r2 == 0) goto L_0x0692
            gy3.d0 r9 = new gy3.d0
            r9.<init>()
            r2 = 0
            r9.f27483d = r2
            u3.u0$a<Key, Value> r7 = r1.f187458e
            k14.c r2 = r7.f187640a
            r5.f187505g = r1
            r5.f187506h = r0
            r10 = r22
            r5.f187507i = r10
            r5.f187508j = r9
            r5.f187509n = r7
            r5.f187510o = r2
            r11 = 1
            r5.f187503e = r11
            k14.d r2 = (k14.C60942d) r2
            r11 = 0
            java.lang.Object r12 = r2.mo85908b(r11, r5)
            if (r12 != r6) goto L_0x023d
            return r6
        L_0x023d:
            r12 = r1
        L_0x023e:
            u3.u0<Key, Value> r7 = r7.f187641b     // Catch:{ all -> 0x068c }
            int r11 = r0.ordinal()     // Catch:{ all -> 0x068c }
            if (r11 == 0) goto L_0x0682
            r13 = 1
            if (r11 == r13) goto L_0x0288
            r13 = 2
            if (r11 == r13) goto L_0x024e
            goto L_0x02ce
        L_0x024e:
            int r11 = r7.f187630c     // Catch:{ all -> 0x068c }
            u3.f2 r13 = r10.f187729b     // Catch:{ all -> 0x068c }
            int r13 = r13.f187255d     // Catch:{ all -> 0x068c }
            int r11 = r11 + r13
            r13 = 1
            int r11 = r11 + r13
            if (r11 >= 0) goto L_0x0266
            int r13 = r9.f27483d     // Catch:{ all -> 0x068c }
            u3.l1 r14 = r12.f187463j     // Catch:{ all -> 0x068c }
            int r14 = r14.f187298a     // Catch:{ all -> 0x068c }
            int r11 = -r11
            int r14 = r14 * r11
            int r13 = r13 + r14
            r9.f27483d = r13     // Catch:{ all -> 0x068c }
            r11 = 0
        L_0x0266:
            java.util.List<u3.q1$b$b<Key, Value>> r13 = r7.f187629b     // Catch:{ all -> 0x068c }
            int r13 = sx3.C64197v.m75536e(r13)     // Catch:{ all -> 0x068c }
            if (r11 > r13) goto L_0x02ce
        L_0x026e:
            int r14 = r9.f27483d     // Catch:{ all -> 0x068c }
            java.util.List<u3.q1$b$b<Key, Value>> r15 = r7.f187629b     // Catch:{ all -> 0x068c }
            java.util.ArrayList r15 = (java.util.ArrayList) r15     // Catch:{ all -> 0x068c }
            java.lang.Object r15 = r15.get(r11)     // Catch:{ all -> 0x068c }
            u3.q1$b$b r15 = (p247u3.C65145q1.C65150b.C65152b) r15     // Catch:{ all -> 0x068c }
            java.util.List<Value> r15 = r15.f187562a     // Catch:{ all -> 0x068c }
            int r15 = r15.size()     // Catch:{ all -> 0x068c }
            int r14 = r14 + r15
            r9.f27483d = r14     // Catch:{ all -> 0x068c }
            if (r11 == r13) goto L_0x02ce
            int r11 = r11 + 1
            goto L_0x026e
        L_0x0288:
            int r11 = r7.f187630c     // Catch:{ all -> 0x068c }
            u3.f2 r13 = r10.f187729b     // Catch:{ all -> 0x068c }
            int r13 = r13.f187254c     // Catch:{ all -> 0x068c }
            int r11 = r11 + r13
            r13 = 1
            int r11 = r11 - r13
            java.util.List<u3.q1$b$b<Key, Value>> r13 = r7.f187629b     // Catch:{ all -> 0x068c }
            int r13 = sx3.C64197v.m75536e(r13)     // Catch:{ all -> 0x068c }
            if (r11 <= r13) goto L_0x02b1
            int r13 = r9.f27483d     // Catch:{ all -> 0x068c }
            u3.l1 r14 = r12.f187463j     // Catch:{ all -> 0x068c }
            int r14 = r14.f187298a     // Catch:{ all -> 0x068c }
            java.util.List<u3.q1$b$b<Key, Value>> r15 = r7.f187629b     // Catch:{ all -> 0x068c }
            int r15 = sx3.C64197v.m75536e(r15)     // Catch:{ all -> 0x068c }
            int r11 = r11 - r15
            int r14 = r14 * r11
            int r13 = r13 + r14
            r9.f27483d = r13     // Catch:{ all -> 0x068c }
            java.util.List<u3.q1$b$b<Key, Value>> r11 = r7.f187629b     // Catch:{ all -> 0x068c }
            int r11 = sx3.C64197v.m75536e(r11)     // Catch:{ all -> 0x068c }
        L_0x02b1:
            if (r11 < 0) goto L_0x02ce
            r13 = 0
        L_0x02b4:
            int r14 = r9.f27483d     // Catch:{ all -> 0x068c }
            java.util.List<u3.q1$b$b<Key, Value>> r15 = r7.f187629b     // Catch:{ all -> 0x068c }
            java.util.ArrayList r15 = (java.util.ArrayList) r15     // Catch:{ all -> 0x068c }
            java.lang.Object r15 = r15.get(r13)     // Catch:{ all -> 0x068c }
            u3.q1$b$b r15 = (p247u3.C65145q1.C65150b.C65152b) r15     // Catch:{ all -> 0x068c }
            java.util.List<Value> r15 = r15.f187562a     // Catch:{ all -> 0x068c }
            int r15 = r15.size()     // Catch:{ all -> 0x068c }
            int r14 = r14 + r15
            r9.f27483d = r14     // Catch:{ all -> 0x068c }
            if (r13 == r11) goto L_0x02ce
            int r13 = r13 + 1
            goto L_0x02b4
        L_0x02ce:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x068c }
            r7 = 0
            r2.mo85909c(r7)
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            u3.u0$a<Key, Value> r7 = r12.f187458e
            k14.c r11 = r7.f187640a
            r5.f187505g = r12
            r5.f187506h = r0
            r5.f187507i = r10
            r5.f187508j = r9
            r5.f187509n = r2
            r5.f187510o = r7
            r5.f187511p = r11
            r5.f187512q = r2
            r13 = 2
            r5.f187503e = r13
            k14.d r11 = (k14.C60942d) r11
            r13 = 0
            java.lang.Object r14 = r11.mo85908b(r13, r5)
            if (r14 != r6) goto L_0x02fa
            return r6
        L_0x02fa:
            r13 = r0
            r0 = r2
            r14 = r12
            r12 = r10
            r10 = r0
            r18 = r9
            r9 = r7
            r7 = r11
            r11 = r18
        L_0x0305:
            u3.u0<Key, Value> r2 = r9.f187641b     // Catch:{ all -> 0x067a }
            int r9 = r12.f187728a     // Catch:{ all -> 0x067a }
            int r15 = r12.mo89341a(r13)     // Catch:{ all -> 0x067a }
            int r1 = r11.f27483d     // Catch:{ all -> 0x067a }
            int r15 = r15 + r1
            java.lang.Object r1 = r14.mo89305g(r2, r13, r9, r15)     // Catch:{ all -> 0x067a }
            if (r1 == 0) goto L_0x0334
            r5.f187505g = r14     // Catch:{ all -> 0x067a }
            r5.f187506h = r13     // Catch:{ all -> 0x067a }
            r5.f187507i = r12     // Catch:{ all -> 0x067a }
            r5.f187508j = r11     // Catch:{ all -> 0x067a }
            r5.f187509n = r10     // Catch:{ all -> 0x067a }
            r5.f187510o = r7     // Catch:{ all -> 0x067a }
            r5.f187511p = r1     // Catch:{ all -> 0x067a }
            r5.f187512q = r0     // Catch:{ all -> 0x067a }
            r9 = 3
            r5.f187503e = r9     // Catch:{ all -> 0x067a }
            java.lang.Object r2 = r14.mo89307i(r2, r13, r5)     // Catch:{ all -> 0x067a }
            if (r2 != r6) goto L_0x0330
            return r6
        L_0x0330:
            r9 = r7
        L_0x0331:
            r7 = r9
        L_0x0332:
            r2 = 0
            goto L_0x0336
        L_0x0334:
            r1 = 0
            goto L_0x0332
        L_0x0336:
            r7.mo85909c(r2)
            r0.f27484d = r1
            gy3.a0 r0 = new gy3.a0
            r0.<init>()
            r1 = 0
            r0.f27482d = r1
        L_0x0343:
            T r1 = r10.f27484d
            if (r1 == 0) goto L_0x0677
            u3.q1$a r1 = r14.mo89304f(r13, r1)
            u3.q1<Key, Value> r2 = r14.f187462i
            r5.f187505g = r14
            r5.f187506h = r13
            r5.f187507i = r12
            r5.f187508j = r11
            r5.f187509n = r10
            r5.f187510o = r0
            r5.f187511p = r1
            r7 = 0
            r5.f187512q = r7
            r5.f187513r = r7
            r7 = 4
            r5.f187503e = r7
            java.lang.Object r2 = r2.mo72456d(r1, r5)
            if (r2 != r6) goto L_0x036a
            return r6
        L_0x036a:
            r15 = r13
            r9 = r14
            r13 = r11
            r14 = r12
            r11 = r0
            r12 = r10
            r10 = r1
        L_0x0371:
            r0 = r2
            u3.q1$b r0 = (p247u3.C65145q1.C65150b) r0
            boolean r1 = r0 instanceof p247u3.C65145q1.C65150b.C65152b
            if (r1 == 0) goto L_0x0456
            int r1 = r15.ordinal()
            r2 = 1
            if (r1 == r2) goto L_0x038e
            r2 = 2
            if (r1 != r2) goto L_0x0388
            r1 = r0
            u3.q1$b$b r1 = (p247u3.C65145q1.C65150b.C65152b) r1
            Key r1 = r1.f187564c
            goto L_0x0394
        L_0x0388:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r8)
            throw r0
        L_0x038e:
            r2 = 2
            r1 = r0
            u3.q1$b$b r1 = (p247u3.C65145q1.C65150b.C65152b) r1
            Key r1 = r1.f187563b
        L_0x0394:
            u3.q1<Key, Value> r7 = r9.f187462i
            r7.getClass()
            T r7 = r12.f27484d
            boolean r1 = gy3.C87412m.m108589b(r1, r7)
            r7 = 1
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x03a5
            r1 = 1
            goto L_0x03a6
        L_0x03a5:
            r1 = 0
        L_0x03a6:
            if (r1 != 0) goto L_0x03df
            if (r15 != r4) goto L_0x03ad
            java.lang.String r0 = "prevKey"
            goto L_0x03af
        L_0x03ad:
            java.lang.String r0 = "nextKey"
        L_0x03af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The same value, "
            r1.append(r2)
            T r2 = r12.f27484d
            r1.append(r2)
            java.lang.String r2 = ", was passed as the "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            r2 = 0
            java.lang.String r0 = z04.C66725r.m78729c(r0, r2, r1, r2)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x03df:
            u3.u0$a<Key, Value> r7 = r9.f187458e
            k14.c r1 = r7.f187640a
            r5.f187505g = r9
            r5.f187506h = r15
            r5.f187507i = r14
            r5.f187508j = r13
            r5.f187509n = r12
            r5.f187510o = r11
            r5.f187511p = r10
            r5.f187512q = r0
            r5.f187513r = r7
            r5.f187514s = r1
            r2 = 5
            r5.f187503e = r2
            k14.d r1 = (k14.C60942d) r1
            r21 = r7
            r2 = 0
            java.lang.Object r7 = r1.mo85908b(r2, r5)
            if (r7 != r6) goto L_0x0406
            return r6
        L_0x0406:
            r7 = r21
            r18 = r9
            r9 = r0
            r0 = r18
        L_0x040d:
            u3.u0<Key, Value> r2 = r7.f187641b     // Catch:{ all -> 0x0450 }
            int r7 = r14.f187728a     // Catch:{ all -> 0x0450 }
            r21 = r0
            r0 = r9
            u3.q1$b$b r0 = (p247u3.C65145q1.C65150b.C65152b) r0     // Catch:{ all -> 0x0450 }
            boolean r0 = r2.mo89333e(r7, r15, r0)     // Catch:{ all -> 0x0450 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0450 }
            r2 = 0
            r1.mo85909c(r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x042a
            goto L_0x0677
        L_0x042a:
            int r0 = r13.f27483d
            r1 = r9
            u3.q1$b$b r1 = (p247u3.C65145q1.C65150b.C65152b) r1
            java.util.List<Value> r2 = r1.f187562a
            int r2 = r2.size()
            int r0 = r0 + r2
            r13.f27483d = r0
            if (r15 != r4) goto L_0x0441
            Key r0 = r1.f187563b
            if (r0 == 0) goto L_0x043f
            goto L_0x0441
        L_0x043f:
            r0 = 1
            goto L_0x0448
        L_0x0441:
            if (r15 != r3) goto L_0x044a
            Key r0 = r1.f187564c
            if (r0 != 0) goto L_0x044a
            goto L_0x043f
        L_0x0448:
            r11.f27482d = r0
        L_0x044a:
            r0 = r9
            r1 = 0
            r9 = r21
            goto L_0x04d5
        L_0x0450:
            r0 = move-exception
            r2 = 0
            r1.mo85909c(r2)
            throw r0
        L_0x0456:
            boolean r1 = r0 instanceof p247u3.C65145q1.C65150b.C65151a
            if (r1 == 0) goto L_0x04d4
            u3.u0$a<Key, Value> r3 = r9.f187458e
            k14.c r1 = r3.f187640a
            r5.f187505g = r9
            r5.f187506h = r15
            r5.f187507i = r14
            r5.f187508j = r0
            r5.f187509n = r3
            r5.f187510o = r1
            r2 = 0
            r5.f187511p = r2
            r4 = 6
            r5.f187503e = r4
            k14.d r1 = (k14.C60942d) r1
            java.lang.Object r4 = r1.mo85908b(r2, r5)
            if (r4 != r6) goto L_0x0479
            return r6
        L_0x0479:
            r4 = r0
            r0 = r5
            r5 = r15
        L_0x047c:
            u3.u0<Key, Value> r2 = r3.f187641b     // Catch:{ all -> 0x04cc }
            u3.g0$a r3 = new u3.g0$a     // Catch:{ all -> 0x04cc }
            u3.q1$b$a r4 = (p247u3.C65145q1.C65150b.C65151a) r4     // Catch:{ all -> 0x04cc }
            java.lang.Throwable r4 = r4.f187561a     // Catch:{ all -> 0x04cc }
            r3.<init>(r4)     // Catch:{ all -> 0x04cc }
            boolean r4 = r2.mo89334f(r5, r3)     // Catch:{ all -> 0x04cc }
            if (r4 == 0) goto L_0x04bb
            c14.h<u3.n0<Value>> r4 = r9.f187457d     // Catch:{ all -> 0x04cc }
            u3.n0$c r7 = new u3.n0$c     // Catch:{ all -> 0x04cc }
            r8 = 0
            r7.<init>(r5, r8, r3)     // Catch:{ all -> 0x04cc }
            r0.f187505g = r5     // Catch:{ all -> 0x04cc }
            r0.f187506h = r14     // Catch:{ all -> 0x04cc }
            r0.f187507i = r1     // Catch:{ all -> 0x04cc }
            r0.f187508j = r2     // Catch:{ all -> 0x04cc }
            r3 = 0
            r0.f187509n = r3     // Catch:{ all -> 0x04b4 }
            r0.f187510o = r3     // Catch:{ all -> 0x04b4 }
            r3 = 7
            r0.f187503e = r3     // Catch:{ all -> 0x04cc }
            c14.c r4 = (c14.C54614c) r4     // Catch:{ all -> 0x04cc }
            java.lang.Object r0 = r4.mo75536o(r7, r0)     // Catch:{ all -> 0x04cc }
            if (r0 != r6) goto L_0x04ae
            return r6
        L_0x04ae:
            r3 = r1
            r0 = r2
            r4 = r14
        L_0x04b1:
            r2 = r0
            r14 = r4
            goto L_0x04bc
        L_0x04b4:
            r0 = move-exception
            r18 = r3
            r3 = r1
            r1 = r18
            goto L_0x04d0
        L_0x04bb:
            r3 = r1
        L_0x04bc:
            java.util.Map<u3.i0, u3.f2> r0 = r2.f187637j     // Catch:{ all -> 0x0121 }
            u3.f2 r1 = r14.f187729b     // Catch:{ all -> 0x0121 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0121 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0121 }
            r1 = 0
            r3.mo85909c(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x04cc:
            r0 = move-exception
            r3 = r1
            goto L_0x0122
        L_0x04d0:
            r3.mo85909c(r1)
            throw r0
        L_0x04d4:
            r1 = 0
        L_0x04d5:
            int r2 = r15.ordinal()
            r7 = 1
            if (r2 == r7) goto L_0x04de
            r2 = r4
            goto L_0x04df
        L_0x04de:
            r2 = r3
        L_0x04df:
            u3.u0$a<Key, Value> r1 = r9.f187458e
            k14.c r7 = r1.f187640a
            r5.f187505g = r9
            r5.f187506h = r15
            r5.f187507i = r14
            r5.f187508j = r13
            r5.f187509n = r12
            r5.f187510o = r11
            r5.f187511p = r10
            r5.f187512q = r0
            r5.f187513r = r2
            r5.f187514s = r1
            r5.f187515t = r7
            r21 = r0
            r0 = 8
            r5.f187503e = r0
            k14.d r7 = (k14.C60942d) r7
            r22 = r1
            r1 = 0
            java.lang.Object r0 = r7.mo85908b(r1, r5)
            if (r0 != r6) goto L_0x050b
            return r6
        L_0x050b:
            r1 = r7
            r0 = r9
            r7 = r22
            r9 = r2
            r2 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r21
        L_0x0518:
            u3.u0<Key, Value> r7 = r7.f187641b     // Catch:{ all -> 0x066c }
            r16 = r8
            u3.f2 r8 = r15.f187729b     // Catch:{ all -> 0x066c }
            u3.n0$a r8 = r7.mo89331c(r9, r8)     // Catch:{ all -> 0x066c }
            if (r8 == 0) goto L_0x056c
            r7.mo89330b(r8)     // Catch:{ all -> 0x066c }
            c14.h<u3.n0<Value>> r9 = r0.f187457d     // Catch:{ all -> 0x066c }
            r5.f187505g = r0     // Catch:{ all -> 0x066c }
            r5.f187506h = r2     // Catch:{ all -> 0x066c }
            r5.f187507i = r15     // Catch:{ all -> 0x066c }
            r5.f187508j = r14     // Catch:{ all -> 0x066c }
            r5.f187509n = r13     // Catch:{ all -> 0x066c }
            r5.f187510o = r12     // Catch:{ all -> 0x066c }
            r5.f187511p = r11     // Catch:{ all -> 0x066c }
            r5.f187512q = r10     // Catch:{ all -> 0x066c }
            r5.f187513r = r1     // Catch:{ all -> 0x066c }
            r5.f187514s = r7     // Catch:{ all -> 0x066c }
            r21 = r1
            r1 = 0
            r5.f187515t = r1     // Catch:{ all -> 0x0567 }
            r1 = 9
            r5.f187503e = r1     // Catch:{ all -> 0x0564 }
            c14.c r9 = (c14.C54614c) r9     // Catch:{ all -> 0x0564 }
            java.lang.Object r1 = r9.mo75536o(r8, r5)     // Catch:{ all -> 0x0564 }
            if (r1 != r6) goto L_0x054f
            return r6
        L_0x054f:
            r1 = r21
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r2
        L_0x0558:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0560 }
            r2 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            goto L_0x0570
        L_0x0560:
            r0 = move-exception
            r7 = r1
            goto L_0x00d0
        L_0x0564:
            r0 = move-exception
            goto L_0x066f
        L_0x0567:
            r0 = move-exception
            r7 = r21
            goto L_0x0673
        L_0x056c:
            r21 = r1
            r9 = r10
            r10 = r11
        L_0x0570:
            int r8 = r15.f187728a     // Catch:{ all -> 0x0560 }
            int r11 = r15.mo89341a(r2)     // Catch:{ all -> 0x0560 }
            r17 = r3
            int r3 = r14.f27483d     // Catch:{ all -> 0x0560 }
            int r11 = r11 + r3
            java.lang.Object r3 = r0.mo89305g(r7, r2, r8, r11)     // Catch:{ all -> 0x0560 }
            r13.f27484d = r3     // Catch:{ all -> 0x0560 }
            if (r3 != 0) goto L_0x0599
            u3.h0 r3 = r7.f187638k     // Catch:{ all -> 0x0560 }
            u3.g0 r3 = r3.mo89264b(r2)     // Catch:{ all -> 0x0560 }
            boolean r3 = r3 instanceof p247u3.C65060g0.C65061a     // Catch:{ all -> 0x0560 }
            if (r3 != 0) goto L_0x0599
            boolean r3 = r12.f27482d     // Catch:{ all -> 0x0560 }
            if (r3 == 0) goto L_0x0594
            u3.g0$c r3 = p247u3.C65060g0.C65063c.f187264b     // Catch:{ all -> 0x0560 }
            goto L_0x0596
        L_0x0594:
            u3.g0$c r3 = p247u3.C65060g0.C65063c.f187265c     // Catch:{ all -> 0x0560 }
        L_0x0596:
            r7.mo89334f(r2, r3)     // Catch:{ all -> 0x0560 }
        L_0x0599:
            r3 = r9
            u3.q1$b$b r3 = (p247u3.C65145q1.C65150b.C65152b) r3     // Catch:{ all -> 0x0560 }
            u3.n0 r3 = r7.mo89335g(r3, r2)     // Catch:{ all -> 0x0560 }
            c14.h<u3.n0<Value>> r7 = r0.f187457d     // Catch:{ all -> 0x0560 }
            r5.f187505g = r0     // Catch:{ all -> 0x0560 }
            r5.f187506h = r2     // Catch:{ all -> 0x0560 }
            r5.f187507i = r15     // Catch:{ all -> 0x0560 }
            r5.f187508j = r14     // Catch:{ all -> 0x0560 }
            r5.f187509n = r13     // Catch:{ all -> 0x0560 }
            r5.f187510o = r12     // Catch:{ all -> 0x0560 }
            r5.f187511p = r10     // Catch:{ all -> 0x0560 }
            r5.f187512q = r9     // Catch:{ all -> 0x0560 }
            r5.f187513r = r1     // Catch:{ all -> 0x0560 }
            r8 = 0
            r5.f187514s = r8     // Catch:{ all -> 0x0668 }
            r5.f187515t = r8     // Catch:{ all -> 0x0668 }
            r8 = 10
            r5.f187503e = r8     // Catch:{ all -> 0x0560 }
            c14.c r7 = (c14.C54614c) r7     // Catch:{ all -> 0x0560 }
            java.lang.Object r3 = r7.mo75536o(r3, r5)     // Catch:{ all -> 0x0560 }
            if (r3 != r6) goto L_0x05c6
            return r6
        L_0x05c6:
            r7 = r1
            r1 = r12
            r12 = r14
            r11 = r15
            r15 = r0
            r0 = r9
            r9 = r10
            r10 = r2
        L_0x05ce:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00cf }
            r2 = 0
            r7.mo85909c(r2)
            boolean r2 = r9 instanceof p247u3.C65145q1.C65146a.C65148b
            if (r2 == 0) goto L_0x05e1
            r2 = r0
            u3.q1$b$b r2 = (p247u3.C65145q1.C65150b.C65152b) r2
            Key r2 = r2.f187563b
            if (r2 != 0) goto L_0x05e1
            r7 = 1
            goto L_0x05e2
        L_0x05e1:
            r7 = 0
        L_0x05e2:
            boolean r2 = r9 instanceof p247u3.C65145q1.C65146a.C65147a
            if (r2 == 0) goto L_0x05ee
            u3.q1$b$b r0 = (p247u3.C65145q1.C65150b.C65152b) r0
            Key r0 = r0.f187564c
            if (r0 != 0) goto L_0x05ee
            r0 = 1
            goto L_0x05ef
        L_0x05ee:
            r0 = 0
        L_0x05ef:
            u3.u1<Key, Value> r2 = r15.f187466m
            if (r2 == 0) goto L_0x0656
            if (r7 != 0) goto L_0x05f7
            if (r0 == 0) goto L_0x0656
        L_0x05f7:
            u3.u0$a<Key, Value> r14 = r15.f187458e
            k14.c r2 = r14.f187640a
            r5.f187505g = r15
            r5.f187506h = r10
            r5.f187507i = r11
            r5.f187508j = r12
            r5.f187509n = r13
            r5.f187510o = r1
            r5.f187511p = r14
            r5.f187512q = r2
            r3 = 0
            r5.f187513r = r3
            r5.f187516u = r7
            r5.f187517v = r0
            r8 = 11
            r5.f187503e = r8
            k14.d r2 = (k14.C60942d) r2
            java.lang.Object r8 = r2.mo85908b(r3, r5)
            if (r8 != r6) goto L_0x061f
            return r6
        L_0x061f:
            r9 = r13
            r13 = r2
            r18 = r1
            r1 = r0
            r0 = r15
            r15 = r18
        L_0x0627:
            u3.u0<Key, Value> r2 = r14.f187641b     // Catch:{ all -> 0x0650 }
            u3.f2$a r3 = r0.f187455b     // Catch:{ all -> 0x0650 }
            u3.r1 r2 = r2.mo89329a(r3)     // Catch:{ all -> 0x0650 }
            r3 = 0
            r13.mo85909c(r3)
            if (r7 == 0) goto L_0x063a
            u3.u1<Key, Value> r3 = r0.f187466m
            r3.mo89337c(r4, r2)
        L_0x063a:
            if (r1 == 0) goto L_0x0644
            u3.u1<Key, Value> r1 = r0.f187466m
            r3 = r17
            r1.mo89337c(r3, r2)
            goto L_0x0646
        L_0x0644:
            r3 = r17
        L_0x0646:
            r14 = r0
            r13 = r10
            r0 = r15
            r10 = r9
            r18 = r12
            r12 = r11
            r11 = r18
            goto L_0x0664
        L_0x0650:
            r0 = move-exception
            r1 = 0
            r13.mo85909c(r1)
            throw r0
        L_0x0656:
            r3 = r17
            r0 = r1
            r14 = r15
            r18 = r13
            r13 = r10
            r10 = r18
            r19 = r12
            r12 = r11
            r11 = r19
        L_0x0664:
            r8 = r16
            goto L_0x0343
        L_0x0668:
            r0 = move-exception
            r7 = r1
            r1 = r8
            goto L_0x0673
        L_0x066c:
            r0 = move-exception
            r21 = r1
        L_0x066f:
            r7 = r21
            goto L_0x00d0
        L_0x0673:
            r7.mo85909c(r1)
            throw r0
        L_0x0677:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x067a:
            r0 = move-exception
            r9 = r7
            goto L_0x01c4
        L_0x067e:
            r9.mo85909c(r1)
            throw r0
        L_0x0682:
            r16 = r8
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x068c }
            r1 = r16
            r0.<init>(r1)     // Catch:{ all -> 0x068c }
            throw r0     // Catch:{ all -> 0x068c }
        L_0x068c:
            r0 = move-exception
            r1 = 0
            r2.mo85909c(r1)
            throw r0
        L_0x0692:
            r1 = r8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.mo89303e(u3.i0, u3.z, wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public final C65145q1.C65146a<Key> mo89304f(C65069i0 i0Var, Key key) {
        int i = i0Var == C65069i0.REFRESH ? this.f187463j.f187301d : this.f187463j.f187298a;
        boolean z = this.f187463j.f187300c;
        C87412m.m108594g(i0Var, "loadType");
        int ordinal = i0Var.ordinal();
        if (ordinal == 0) {
            return new C65145q1.C65146a.C65149c(key, i, z);
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new C13603j();
            } else if (key != null) {
                return new C65145q1.C65146a.C65147a(key, i, z);
            } else {
                throw new IllegalArgumentException("key cannot be null for append".toString());
            }
        } else if (key != null) {
            return new C65145q1.C65146a.C65148b(key, i, z);
        } else {
            throw new IllegalArgumentException("key cannot be null for prepend".toString());
        }
    }

    /* renamed from: g */
    public final Key mo89305g(C65173u0<Key, Value> u0Var, C65069i0 i0Var, int i, int i2) {
        int i3;
        u0Var.getClass();
        C87412m.m108594g(i0Var, "loadType");
        int ordinal = i0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i3 = u0Var.f187633f;
            } else if (ordinal == 2) {
                i3 = u0Var.f187634g;
            } else {
                throw new C13603j();
            }
            if (i == i3 && !(u0Var.f187638k.mo89264b(i0Var) instanceof C65060g0.C65061a) && i2 < this.f187463j.f187299b) {
                return i0Var == C65069i0.PREPEND ? ((C65145q1.C65150b.C65152b) C110818d0.m150914L(u0Var.f187629b)).f187563b : ((C65145q1.C65150b.C65152b) C110818d0.m150923U(u0Var.f187629b)).f187564c;
            }
            return null;
        }
        throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo89306h(C65069i0 i0Var, C65056f2 f2Var, C15601d<? super C13598b0> dVar) {
        if (i0Var.ordinal() != 0) {
            if (f2Var != null) {
                ((C58100z0) this.f187454a).mo82832d(f2Var);
            } else {
                throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
            }
        } else {
            Object d = mo89302d(dVar);
            if (d == C15911a.COROUTINE_SUSPENDED) {
                return d;
            }
        }
        return C13598b0.f38549a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo89307i(p247u3.C65173u0<Key, Value> r6, p247u3.C65069i0 r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p247u3.C65125q0.C65144h
            if (r0 == 0) goto L_0x0013
            r0 = r8
            u3.q0$h r0 = (p247u3.C65125q0.C65144h) r0
            int r1 = r0.f187552e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f187552e = r1
            goto L_0x0018
        L_0x0013:
            u3.q0$h r0 = new u3.q0$h
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f187551d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187552e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004d
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r8)
            u3.g0$b r8 = p247u3.C65060g0.C65062b.f187263b
            boolean r6 = r6.mo89334f(r7, r8)
            if (r6 == 0) goto L_0x004d
            c14.h<u3.n0<Value>> r6 = r5.f187457d
            u3.n0$c r2 = new u3.n0$c
            r4 = 0
            r2.<init>(r7, r4, r8)
            r0.f187552e = r3
            c14.c r6 = (c14.C54614c) r6
            java.lang.Object r6 = r6.mo75536o(r2, r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65125q0.mo89307i(u3.u0, u3.i0, wx3.d):java.lang.Object");
    }
}
