package on1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import androidx.lifecycle.C0125s;
import bl3.C0317e;
import bl3.C39818r;
import c14.C54614c;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import d14.C58022c;
import d14.C58083t;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j31.C117294b;
import j31.C9276a;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import on1.C11520f0;
import on1.C11537n;
import on1.C11545o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C16387t;

/* renamed from: on1.q */
public final class C11548q<T extends C0740i2> extends C0317e {

    /* renamed from: r */
    public static final C11553c f33884r = new C11553c((C8480h) null);

    /* renamed from: s */
    public static final C13601g<C11528h0> f33885s = C36568h.m40985a(C11552b.f33901d);

    /* renamed from: d */
    public final List<T> f33886d = new ArrayList();

    /* renamed from: e */
    public final C54625h<C11537n<T>> f33887e;

    /* renamed from: f */
    public C11545o<T> f33888f;

    /* renamed from: g */
    public C11545o<T> f33889g;

    /* renamed from: h */
    public C11545o<T> f33890h;

    /* renamed from: i */
    public C11545o<T> f33891i;

    /* renamed from: j */
    public C11545o<T> f33892j;

    /* renamed from: n */
    public C16387t f33893n;

    /* renamed from: o */
    public final C13601g f33894o;

    /* renamed from: p */
    public final C45252f<C11537n<T>> f33895p;

    /* renamed from: q */
    public final C13601g f33896q;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$1", mo125469f = "Loader.kt", mo125470l = {61}, mo125471m = "invokeSuspend")
    /* renamed from: on1.q$a */
    public static final class C11549a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33897d;

        /* renamed from: e */
        public final /* synthetic */ C11548q<T> f33898e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$1$1", mo125469f = "Loader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: on1.q$a$a */
        public static final class C11550a extends C91594j implements C32228q<C45253g<? super C11520f0<T>>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f33899d;

            public C11550a(C15601d<? super C11550a> dVar) {
                super(3, dVar);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C11550a aVar = new C11550a((C15601d) obj3);
                aVar.f33899d = (Throwable) obj2;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("Finder.NewLoader", "catch :" + ((Throwable) this.f33899d));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: on1.q$a$b */
        public static final class C11551b<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C11548q<T> f33900d;

            public C11551b(C11548q<T> qVar) {
                this.f33900d = qVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C11520f0 f0Var = (C11520f0) obj;
                if (f0Var instanceof C11520f0.C11522b) {
                    C11520f0.C11522b bVar = (C11520f0.C11522b) f0Var;
                    if (bVar.f33840a instanceof C11507a) {
                        ((C11574x) ((C36570n) this.f33900d.f33894o).getValue()).f33958b.f14102a = ((C11507a) bVar.f33840a).f33807e;
                    }
                } else if (f0Var instanceof C11520f0.C11523c) {
                    C11520f0.C11523c cVar = (C11520f0.C11523c) f0Var;
                    if (cVar.f33841a instanceof C11507a) {
                        ((C11574x) ((C36570n) this.f33900d.f33894o).getValue()).f33958b.f14102a = ((C11507a) cVar.f33841a).f33807e;
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11549a(C11548q<T> qVar, C15601d<? super C11549a> dVar) {
            super(2, dVar);
            this.f33898e = qVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11549a(this.f33898e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11549a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33897d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58083t tVar = new C58083t(((C11577z) ((C36570n) this.f33898e.f33896q).getValue()).f33965c, new C11550a((C15601d<? super C11550a>) null));
                C11551b bVar = new C11551b(this.f33898e);
                this.f33897d = 1;
                if (tVar.mo31880a(bVar, this) == aVar) {
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

    /* renamed from: on1.q$b */
    public static final class C11552b extends C87413o implements C32224a<C11528h0> {

        /* renamed from: d */
        public static final C11552b f33901d = new C11552b();

        public C11552b() {
            super(0);
        }

        public Object invoke() {
            return (C11528h0) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11528h0.class);
        }
    }

    /* renamed from: on1.q$c */
    public static final class C11553c {
        public C11553c(C8480h hVar) {
        }

        /* renamed from: a */
        public static void m11370a(C11553c cVar, C11545o oVar, C0000n0 n0Var, C0125s sVar, int i, Object obj) {
            if ((i & 2) != 0) {
                n0Var = null;
            }
            if ((i & 4) != 0) {
                sVar = null;
            }
            cVar.getClass();
            C87412m.m108594g(oVar, FirebaseAnalytics.C113379b.SOURCE);
            C11528h0 h0Var = (C11528h0) ((C36570n) C11548q.f33885s).getValue();
            h0Var.getClass();
            if (n0Var == null) {
                n0Var = h0Var.getLifecycleScope();
            }
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C11525g0(sVar, oVar, (C15601d<? super C11525g0>) null), 3, (Object) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$delete$2", mo125469f = "Loader.kt", mo125470l = {225}, mo125471m = "invokeSuspend")
    /* renamed from: on1.q$d */
    public static final class C11554d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33902d;

        /* renamed from: e */
        public final /* synthetic */ C11548q<T> f33903e;

        /* renamed from: f */
        public final /* synthetic */ C11537n.C11538a<T> f33904f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11554d(C11548q<T> qVar, C11537n.C11538a<T> aVar, C15601d<? super C11554d> dVar) {
            super(2, dVar);
            this.f33903e = qVar;
            this.f33904f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11554d(this.f33903e, this.f33904f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11554d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33902d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11548q<T> qVar = this.f33903e;
                C11537n.C11538a<T> aVar2 = this.f33904f;
                this.f33902d = 1;
                if (qVar.mo11509l3(aVar2, this) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$deleteById$1", mo125469f = "Loader.kt", mo125470l = {219}, mo125471m = "invokeSuspend")
    /* renamed from: on1.q$e */
    public static final class C11555e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33905d;

        /* renamed from: e */
        public final /* synthetic */ long f33906e;

        /* renamed from: f */
        public final /* synthetic */ C11548q<T> f33907f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11555e(long j, C11548q<T> qVar, C15601d<? super C11555e> dVar) {
            super(2, dVar);
            this.f33906e = j;
            this.f33907f = qVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11555e(this.f33906e, this.f33907f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11555e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33905d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11514d dVar = new C11514d(-1, this.f33906e, 0, 4, (C8480h) null);
                C11548q<T> qVar = this.f33907f;
                this.f33905d = 1;
                if (qVar.mo11509l3(dVar, this) == aVar) {
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

    /* renamed from: on1.q$f */
    public static final class C11556f extends C87413o implements C32224a<C11577z<T>> {

        /* renamed from: d */
        public final /* synthetic */ C11548q<T> f33908d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11556f(C11548q<T> qVar) {
            super(0);
            this.f33908d = qVar;
        }

        public Object invoke() {
            return new C11577z(this.f33908d);
        }
    }

    /* renamed from: on1.q$g */
    public static final class C11557g extends C87413o implements C32224a<C11574x<T>> {

        /* renamed from: d */
        public final /* synthetic */ C11548q<T> f33909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11557g(C11548q<T> qVar) {
            super(0);
            this.f33909d = qVar;
        }

        public Object invoke() {
            return new C11574x(this.f33909d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$observeState$1", mo125469f = "Loader.kt", mo125470l = {143}, mo125471m = "invokeSuspend")
    /* renamed from: on1.q$h */
    public static final class C11558h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33910d;

        /* renamed from: e */
        public final /* synthetic */ C11548q<T> f33911e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C11520f0<T>, C13598b0> f33912f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$observeState$1$1", mo125469f = "Loader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: on1.q$h$a */
        public static final class C11559a extends C91594j implements C32228q<C45253g<? super C11520f0<T>>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f33913d;

            public C11559a(C15601d<? super C11559a> dVar) {
                super(3, dVar);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                Throwable th = (Throwable) obj2;
                C11559a aVar = new C11559a((C15601d) obj3);
                aVar.f33913d = (C45253g) obj;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("Finder.NewLoader", "observeState catch: " + ((C45253g) this.f33913d));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: on1.q$h$b */
        public static final class C11560b<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C32226l<C11520f0<T>, C13598b0> f33914d;

            public C11560b(C32226l<? super C11520f0<T>, C13598b0> lVar) {
                this.f33914d = lVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C11520f0 f0Var = (C11520f0) obj;
                Log.m105924i("Finder.NewLoader", "observeState state:" + f0Var);
                this.f33914d.invoke(f0Var);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11558h(C11548q<T> qVar, C32226l<? super C11520f0<T>, C13598b0> lVar, C15601d<? super C11558h> dVar) {
            super(2, dVar);
            this.f33911e = qVar;
            this.f33912f = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11558h(this.f33911e, this.f33912f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11558h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33910d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58083t tVar = new C58083t(((C11577z) ((C36570n) this.f33911e.f33896q).getValue()).f33965c, new C11559a((C15601d<? super C11559a>) null));
                C11560b bVar = new C11560b(this.f33912f);
                this.f33910d = 1;
                if (tVar.mo31880a(bVar, this) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$query$1", mo125469f = "Loader.kt", mo125470l = {178}, mo125471m = "invokeSuspend")
    /* renamed from: on1.q$i */
    public static final class C11561i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33915d;

        /* renamed from: e */
        public final /* synthetic */ C11548q<T> f33916e;

        /* renamed from: f */
        public final /* synthetic */ C11537n.C11542e<T> f33917f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11561i(C11548q<T> qVar, C11537n.C11542e<T> eVar, C15601d<? super C11561i> dVar) {
            super(2, dVar);
            this.f33916e = qVar;
            this.f33917f = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11561i(this.f33916e, this.f33917f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11561i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33915d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11548q<T> qVar = this.f33916e;
                C11537n.C11542e<T> eVar = this.f33917f;
                this.f33915d = 1;
                if (qVar.mo11509l3(eVar, this) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$update$2", mo125469f = "Loader.kt", mo125470l = {238}, mo125471m = "invokeSuspend")
    /* renamed from: on1.q$j */
    public static final class C11562j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33918d;

        /* renamed from: e */
        public final /* synthetic */ int f33919e;

        /* renamed from: f */
        public final /* synthetic */ T f33920f;

        /* renamed from: g */
        public final /* synthetic */ Object f33921g;

        /* renamed from: h */
        public final /* synthetic */ boolean f33922h;

        /* renamed from: i */
        public final /* synthetic */ C11548q<T> f33923i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11562j(int i, T t, Object obj, boolean z, C11548q<T> qVar, C15601d<? super C11562j> dVar) {
            super(2, dVar);
            this.f33919e = i;
            this.f33920f = t;
            this.f33921g = obj;
            this.f33922h = z;
            this.f33923i = qVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11562j(this.f33919e, this.f33920f, this.f33921g, this.f33922h, this.f33923i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11562j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33918d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11532j0 j0Var = new C11532j0(this.f33919e, -1, this.f33920f, this.f33921g, this.f33922h);
                C11548q<T> qVar = this.f33923i;
                this.f33918d = 1;
                if (qVar.mo11509l3(j0Var, this) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$updateById$1", mo125469f = "Loader.kt", mo125470l = {245}, mo125471m = "invokeSuspend")
    /* renamed from: on1.q$k */
    public static final class C11563k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33924d;

        /* renamed from: e */
        public final /* synthetic */ long f33925e;

        /* renamed from: f */
        public final /* synthetic */ T f33926f;

        /* renamed from: g */
        public final /* synthetic */ Object f33927g;

        /* renamed from: h */
        public final /* synthetic */ boolean f33928h;

        /* renamed from: i */
        public final /* synthetic */ C11548q<T> f33929i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11563k(long j, T t, Object obj, boolean z, C11548q<T> qVar, C15601d<? super C11563k> dVar) {
            super(2, dVar);
            this.f33925e = j;
            this.f33926f = t;
            this.f33927g = obj;
            this.f33928h = z;
            this.f33929i = qVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11563k(this.f33925e, this.f33926f, this.f33927g, this.f33928h, this.f33929i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11563k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33924d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11532j0 j0Var = new C11532j0(-1, this.f33925e, this.f33926f, this.f33927g, this.f33928h);
                C11548q<T> qVar = this.f33929i;
                this.f33924d = 1;
                if (qVar.mo11509l3(j0Var, this) == aVar) {
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

    public C11548q() {
        C54625h<C11537n<T>> a = C54629k.m61479a(Integer.MAX_VALUE, (C54624g) null, (C32226l) null, 6, (Object) null);
        this.f33887e = a;
        this.f33894o = C36568h.m40985a(new C11557g(this));
        this.f33895p = new C58022c(a, false, (C66212f) null, 0, (C54624g) null, 28, (C8480h) null);
        this.f33896q = C36568h.m40985a(new C11556f(this));
        C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C11549a(this, (C15601d<? super C11549a>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m11359c3(on1.C11548q r5, fy3.C32226l r6, wx3.C15601d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof on1.C11564r
            if (r0 == 0) goto L_0x0016
            r0 = r7
            on1.r r0 = (on1.C11564r) r0
            int r1 = r0.f33933g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f33933g = r1
            goto L_0x001b
        L_0x0016:
            on1.r r0 = new on1.r
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r5 = r0.f33931e
            xx3.a r7 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r0.f33933g
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            long r6 = r0.f33930d
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0047
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r5)
            long r3 = eb0.C31543z5.m39453c()
            r0.f33930d = r3
            r0.f33933g = r2
            java.lang.Object r5 = r6.invoke(r0)
            if (r5 != r7) goto L_0x0046
            goto L_0x0051
        L_0x0046:
            r6 = r3
        L_0x0047:
            long r0 = eb0.C31543z5.m39453c()
            long r0 = r0 - r6
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
        L_0x0051:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.C11548q.m11359c3(on1.q, fy3.l, wx3.d):java.lang.Object");
    }

    /* renamed from: d3 */
    public final List<T> mo11502d3() {
        return this.f33886d;
    }

    /* renamed from: e3 */
    public void mo11503e3(C11537n.C11538a<T> aVar, boolean z) {
        C87412m.m108594g(aVar, "event");
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C11554d(this, aVar, (C15601d<? super C11554d>) null), 3, (Object) null);
    }

    /* renamed from: f3 */
    public void mo11504f3(long j, boolean z) {
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C11555e(j, this, (C15601d<? super C11555e>) null), 3, (Object) null);
    }

    /* renamed from: g3 */
    public final <E> List<E> mo11505g3(Class<E> cls) {
        C87412m.m108594g(cls, "clazz");
        ArrayList arrayList = new ArrayList();
        for (T t : this.f33886d) {
            if (cls.isInstance(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: i3 */
    public void mo11506i3(T t, int i, boolean z) {
        T t2 = t;
        C87412m.m108594g(t2, "data");
        ArrayList arrayList = new ArrayList();
        arrayList.add(t2);
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C11565s(this, new C11547p(arrayList, i, 0, z, 4, (C8480h) null), (C15601d<? super C11565s>) null), 3, (Object) null);
    }

    /* renamed from: j3 */
    public final void mo11507j3(C32226l<? super C11520f0<T>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "observer");
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C11558h(this, lVar, (C15601d<? super C11558h>) null), 3, (Object) null);
    }

    /* renamed from: k3 */
    public void mo11508k3(C11537n.C11542e<T> eVar) {
        C87412m.m108594g(eVar, "event");
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C11561i(this, eVar, (C15601d<? super C11561i>) null), 3, (Object) null);
    }

    /* renamed from: l3 */
    public final Object mo11509l3(C11537n<T> nVar, C15601d<? super C13598b0> dVar) {
        if (!((C54614c) this.f33887e).mo75535h()) {
            Object o = ((C54614c) this.f33887e).mo75536o(nVar, dVar);
            return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
        }
        Log.m105924i("Finder.NewLoader", "send is closed");
        return C13598b0.f38549a;
    }

    /* renamed from: m3 */
    public void mo11510m3(int i, T t, Object obj, boolean z) {
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C11562j(i, t, obj, z, this, (C15601d<? super C11562j>) null), 3, (Object) null);
    }

    /* renamed from: n3 */
    public void mo11511n3(long j, T t, Object obj, boolean z) {
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C11563k(j, t, obj, z, this, (C15601d<? super C11563k>) null), 3, (Object) null);
    }

    public void onCleared() {
        C117294b a;
        super.onCleared();
        C11545o.C11546a[] aVarArr = new C11545o.C11546a[4];
        C11545o<T> oVar = this.f33889g;
        C11545o.C11546a aVar = null;
        aVarArr[0] = oVar != null ? oVar.getKey() : null;
        C11545o<T> oVar2 = this.f33890h;
        aVarArr[1] = oVar2 != null ? oVar2.getKey() : null;
        C11545o<T> oVar3 = this.f33892j;
        aVarArr[2] = oVar3 != null ? oVar3.getKey() : null;
        C11545o<T> oVar4 = this.f33891i;
        if (oVar4 != null) {
            aVar = oVar4.getKey();
        }
        aVarArr[3] = aVar;
        Log.m105924i("Finder.NewLoader", "clearFutureCache:4");
        for (int i = 0; i < 4; i++) {
            C11545o.C11546a aVar2 = aVarArr[i];
            if (!(aVar2 == null || (a = C9276a.f29023b.mo10053a().mo10052a(aVar2)) == null)) {
                C11575y yVar = (C11575y) a.mo10056c(false);
            }
        }
    }
}
