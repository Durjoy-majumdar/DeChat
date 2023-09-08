package u60;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import u60.C65220d;
import u60.C65235o;
import v60.C65551d;

/* renamed from: u60.f */
public final class C65222f<T extends C65220d> implements C101960c {

    /* renamed from: a */
    public final C65551d f187745a;

    /* renamed from: b */
    public C65219a f187746b;

    /* renamed from: c */
    public C65219a f187747c;

    /* renamed from: d */
    public final LinkedList<C65231j<T>> f187748d = new LinkedList<>();

    /* renamed from: e */
    public final LinkedList<C65232k<C65220d, C65231j<T>>> f187749e = new LinkedList<>();

    /* renamed from: f */
    public final LinkedList<C65232k<C65220d, C65231j<T>>> f187750f = new LinkedList<>();

    /* renamed from: u60.f$a */
    public static final class C65223a implements C65235o.C65236a {

        /* renamed from: a */
        public final /* synthetic */ C65222f<T> f187751a;

        /* renamed from: u60.f$a$a */
        public static final class C65224a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C65222f<T> f187752d;

            /* renamed from: e */
            public final /* synthetic */ C65220d f187753e;

            /* renamed from: f */
            public final /* synthetic */ C65234n f187754f;

            /* renamed from: u60.f$a$a$a */
            public /* synthetic */ class C65225a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f187755a;

                static {
                    int[] iArr = new int[C65234n.values().length];
                    iArr[4] = 1;
                    f187755a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65224a(C65222f<T> fVar, C65220d dVar, C65234n nVar) {
                super(0);
                this.f187752d = fVar;
                this.f187753e = dVar;
                this.f187754f = nVar;
            }

            public Object invoke() {
                T t;
                LinkedList<C65232k<C65220d, C65231j<T>>> linkedList = this.f187752d.f187750f;
                C65220d dVar = this.f187753e;
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C65220d) ((C65232k) t).f187766a).mo11854d(), dVar.mo11854d())) {
                        break;
                    }
                }
                C65232k kVar = (C65232k) t;
                if (kVar != null) {
                    C65222f<T> fVar = this.f187752d;
                    C65220d dVar2 = this.f187753e;
                    C65234n nVar = this.f187754f;
                    fVar.f187750f.remove(kVar);
                    for (B b : kVar.f187767b) {
                        if (b != null) {
                            C87412m.m108592e(dVar2, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.callPrepareInUI.<no name provided>.onTaskStatusCallback.<no name provided>.invoke$lambda-2$lambda-1");
                            C87412m.m108593f(nVar, "status");
                            b.mo539a(dVar2, nVar);
                        }
                    }
                }
                C65222f<T> fVar2 = this.f187752d;
                C65220d dVar3 = this.f187753e;
                C87412m.m108593f(dVar3, ScopedStorageUtil.WorkProfiles.PROFILE_WORK);
                C65234n nVar2 = this.f187754f;
                C87412m.m108593f(nVar2, "status");
                fVar2.getClass();
                C61926c.m72668M(new C65229h(fVar2, dVar3, nVar2));
                C65234n nVar3 = this.f187754f;
                if ((nVar3 == null ? -1 : C65225a.f187755a[nVar3.ordinal()]) == 1) {
                    Log.m105924i("MicroMsg.Loader.DefaultTaskLoader", this.f187752d.mo89351e() + "workStat wait");
                } else {
                    this.f187752d.mo89350d();
                }
                return C13598b0.f38549a;
            }
        }

        public C65223a(C65222f<T> fVar) {
            this.f187751a = fVar;
        }

        /* renamed from: a */
        public final void mo89355a(C65220d dVar, C65234n nVar) {
            C61926c.m72668M(new C65224a(this.f187751a, dVar, nVar));
        }
    }

    /* renamed from: u60.f$b */
    public static final class C65226b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65222f<T> f187756d;

        /* renamed from: e */
        public final /* synthetic */ C65231j<T> f187757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65226b(C65222f<T> fVar, C65231j<T> jVar) {
            super(0);
            this.f187756d = fVar;
            this.f187757e = jVar;
        }

        public Object invoke() {
            LinkedList<C65231j<T>> linkedList = this.f187756d.f187748d;
            C65231j<T> jVar = this.f187757e;
            boolean z = true;
            if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C87412m.m108589b((C65231j) it.next(), jVar)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                this.f187756d.f187748d.add(this.f187757e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u60.f$c */
    public static final class C65227c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65222f<T> f187758d;

        /* renamed from: e */
        public final /* synthetic */ C65231j<T> f187759e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65227c(C65222f<T> fVar, C65231j<T> jVar) {
            super(0);
            this.f187758d = fVar;
            this.f187759e = jVar;
        }

        public Object invoke() {
            this.f187758d.f187748d.remove(this.f187759e);
            return C13598b0.f38549a;
        }
    }

    public C65222f(C65551d dVar) {
        C87412m.m108594g(dVar, "configuration");
        this.f187745a = dVar;
    }

    /* renamed from: a */
    public void mo89347a(Runnable runnable) {
        C87412m.m108594g(runnable, "runnable");
        if (this.f187747c == null) {
            this.f187747c = this.f187745a.mo89640d();
        }
        C65219a aVar = this.f187747c;
        if (aVar != null) {
            aVar.execute(runnable);
        }
    }

    /* renamed from: b */
    public final void mo89348b(T t) {
        C87412m.m108594g(t, "t");
        mo89349c(t, (C65231j) null);
    }

    /* renamed from: c */
    public final void mo89349c(T t, C65231j<T> jVar) {
        C87412m.m108594g(t, "t");
        C61926c.m72668M(new C65221e(this, t, false, jVar));
    }

    /* renamed from: d */
    public final boolean mo89350d() {
        if (this.f187749e.size() <= 0) {
            Log.m105924i("MicroMsg.Loader.DefaultTaskLoader", mo89351e() + "DefaultTaskLoader mPendingQueue is empty");
            return false;
        } else if (this.f187750f.size() >= this.f187745a.mo89638b()) {
            return false;
        } else {
            C65232k<C65220d, C65231j<T>> remove = this.f187749e.remove(0);
            C87412m.m108593f(remove, "mPendingQueue.removeAt(0)");
            C65232k kVar = remove;
            this.f187750f.add(kVar);
            if (!this.f187745a.mo89637a().mo89636a((C65220d) kVar.f187766a)) {
                Log.m105928w("MicroMsg.Loader.DefaultTaskLoader", mo89351e() + " block retryStrategy " + kVar.f187766a + " callback size=" + kVar.f187767b.size());
                for (B b : kVar.f187767b) {
                    if (b != null) {
                        A a = kVar.f187766a;
                        C87412m.m108592e(a, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.callPrepareInUI$lambda-1");
                        b.mo539a((C65220d) a, C65234n.Block);
                    }
                }
                return true;
            }
            execute(new C65235o((C65220d) kVar.f187766a, this, new C65223a(this)));
            return true;
        }
    }

    /* renamed from: e */
    public final String mo89351e() {
        return "name:" + this.f187745a.name() + "_this:" + hashCode() + '_';
    }

    public void execute(Runnable runnable) {
        C87412m.m108594g(runnable, "runnable");
        if (this.f187746b == null) {
            this.f187746b = this.f187745a.mo89639c();
        }
        C65219a aVar = this.f187746b;
        if (aVar != null) {
            aVar.execute(runnable);
        }
    }

    /* renamed from: f */
    public final void mo89353f(C65231j<T> jVar) {
        C87412m.m108594g(jVar, "callback");
        C61926c.m72668M(new C65226b(this, jVar));
    }

    /* renamed from: g */
    public final void mo89354g(C65231j<T> jVar) {
        C87412m.m108594g(jVar, "callback");
        C61926c.m72668M(new C65227c(this, jVar));
    }
}
