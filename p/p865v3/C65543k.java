package p865v3;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53952u;
import a14.C53956v;
import a14.C53973z1;
import c14.C54612b0;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import d14.C45253g;
import d14.C58042h;
import d14.C58068n;
import d14.C58069n0;
import d14.C58078q;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: v3.k */
public abstract class C65543k<T> {

    /* renamed from: d */
    public static final Object f188579d = new Object();

    /* renamed from: a */
    public final C54625h<Object> f188580a;

    /* renamed from: b */
    public final C53952u<C13598b0> f188581b = new C53956v((C53973z1) null);

    /* renamed from: c */
    public final AtomicBoolean f188582c = new AtomicBoolean(false);

    @C91590f(mo125468c = "androidx.paging.multicast.StoreRealActor$1", mo125469f = "StoreRealActor.kt", mo125470l = {45}, mo125471m = "invokeSuspend")
    /* renamed from: v3.k$a */
    public static final class C65544a extends C91594j implements C32227p<Object, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f188583d;

        /* renamed from: e */
        public int f188584e;

        /* renamed from: f */
        public final /* synthetic */ C65543k f188585f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65544a(C65543k kVar, C15601d dVar) {
            super(2, dVar);
            this.f188585f = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            C65544a aVar = new C65544a(this.f188585f, dVar);
            aVar.f188583d = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65544a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f188584e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f188583d;
                Object obj3 = C65543k.f188579d;
                if (obj2 == C65543k.f188579d) {
                    C65543k.m77203a(this.f188585f);
                } else {
                    C65543k kVar = this.f188585f;
                    this.f188584e = 1;
                    if (kVar.mo89624c(obj2, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.paging.multicast.StoreRealActor$2", mo125469f = "StoreRealActor.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: v3.k$b */
    public static final class C65545b extends C91594j implements C32228q<C45253g<? super Object>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C65543k f188586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65545b(C65543k kVar, C15601d dVar) {
            super(3, dVar);
            this.f188586d = kVar;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Throwable th = (Throwable) obj2;
            C15601d dVar = (C15601d) obj3;
            C87412m.m108594g((C45253g) obj, "$this$create");
            C87412m.m108594g(dVar, "continuation");
            return new C65545b(this.f188586d, dVar).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C65543k.m77203a(this.f188586d);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.paging.multicast.StoreRealActor", mo125469f = "StoreRealActor.kt", mo125470l = {74, 76}, mo125471m = "close")
    /* renamed from: v3.k$c */
    public static final class C65546c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f188587d;

        /* renamed from: e */
        public int f188588e;

        /* renamed from: f */
        public final /* synthetic */ C65543k f188589f;

        /* renamed from: g */
        public Object f188590g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65546c(C65543k kVar, C15601d dVar) {
            super(dVar);
            this.f188589f = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f188587d = obj;
            this.f188588e |= Integer.MIN_VALUE;
            return this.f188589f.mo89635b(this);
        }
    }

    public C65543k(C0000n0 n0Var) {
        C87412m.m108594g(n0Var, "scope");
        C54625h<Object> a = C54629k.m61479a(0, (C54624g) null, (C32226l) null, 6, (Object) null);
        this.f188580a = a;
        C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C58068n(new C58078q(new C58069n0(C58042h.m67195d(a), new C65544a(this, (C15601d) null)), new C65545b(this, (C15601d) null)), (C15601d<? super C58068n>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static final void m77203a(C65543k kVar) {
        if (kVar.f188582c.compareAndSet(false, true)) {
            try {
                kVar.mo89625d();
            } finally {
                C54612b0.C54613a.m61404a(kVar.f188580a, (Throwable) null, 1, (Object) null);
                ((C53956v) kVar.f188581b).mo74537j0(C13598b0.f38549a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89635b(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p865v3.C65543k.C65546c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            v3.k$c r0 = (p865v3.C65543k.C65546c) r0
            int r1 = r0.f188588e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f188588e = r1
            goto L_0x0018
        L_0x0013:
            v3.k$c r0 = new v3.k$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f188587d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f188588e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005f
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f188590g
            v3.k r2 = (p865v3.C65543k) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004f
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            c14.h<java.lang.Object> r6 = r5.f188580a
            java.lang.Object r2 = f188579d
            r0.f188590g = r5
            r0.f188588e = r4
            c14.c r6 = (c14.C54614c) r6
            java.lang.Object r6 = r6.mo75536o(r2, r0)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r2 = r5
        L_0x004f:
            a14.u<rx3.b0> r6 = r2.f188581b
            r2 = 0
            r0.f188590g = r2
            r0.f188588e = r3
            a14.v r6 = (a14.C53956v) r6
            java.lang.Object r6 = r6.mo74549z(r0)
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p865v3.C65543k.mo89635b(wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public abstract Object mo89624c(T t, C15601d<? super C13598b0> dVar);

    /* renamed from: d */
    public void mo89625d() {
    }
}
