package b70;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import k60.C99102f;
import n60.C100075f;
import o40.C61926c;
import r60.C101339a;
import r60.C101342d;
import r60.C101344e;
import r60.C101348g;
import r60.C101350i;
import rx3.C13598b0;
import t60.C101723d;
import t60.C64206c;
import t60.C64207e;
import u60.C65220d;
import u60.C65234n;
import w60.C102353e;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;

/* renamed from: b70.b */
public abstract class C92186b<T, R> extends C65220d {

    /* renamed from: f */
    public C102564a<T> f263850f;

    /* renamed from: g */
    public C101342d<R> f263851g;

    /* renamed from: h */
    public C99102f<T, R> f263852h;

    /* renamed from: i */
    public final String f263853i = "MicroMsg.Loader.ImageLoader.ImageLoadTask";

    /* renamed from: j */
    public C65234n f263854j = C65234n.Init;

    /* renamed from: n */
    public final ConcurrentLinkedQueue<C64206c<T>> f263855n;

    /* renamed from: o */
    public final ConcurrentLinkedQueue<C64207e<T, R>> f263856o;

    /* renamed from: p */
    public C102353e<R> f263857p;

    /* renamed from: b70.b$a */
    public interface C92187a<RR> {
        /* renamed from: a */
        void mo126154a(C102353e<RR> eVar);

        /* renamed from: b */
        void mo126155b(C102353e<RR> eVar);

        /* renamed from: c */
        void mo126156c();
    }

    /* renamed from: b70.b$b */
    public static final class C92188b implements C92187a<R> {

        /* renamed from: a */
        public final /* synthetic */ C92186b<T, R> f263858a;

        public C92188b(C92186b<T, R> bVar) {
            this.f263858a = bVar;
        }

        /* renamed from: a */
        public void mo126154a(C102353e<R> eVar) {
            C87412m.m108594g(eVar, "resultData");
            C92186b<T, R> bVar = this.f263858a;
            C65234n nVar = C65234n.OK;
            bVar.getClass();
            bVar.f263854j = nVar;
            this.f263858a.mo126153h(eVar);
            if ((eVar.mo141920a() ? eVar : null) != null) {
                C92186b<T, R> bVar2 = this.f263858a;
                String str = bVar2.f263853i;
                Log.m105924i(str, "[ImageLoader] onTaskDownFin. get bitmap successs. " + bVar2.f263850f + ' ' + eVar.f301453a);
                C101344e a = C101344e.f296885b.mo140836a();
                C102564a<T> aVar = bVar2.f263850f;
                a.getClass();
                C87412m.m108594g(aVar, "data");
                C61926c.m72668M(new C101348g(a, aVar, eVar));
            }
            this.f263858a.mo126152g(eVar);
            C92186b<T, R> bVar3 = this.f263858a;
            bVar3.mo11853b(bVar3.f263854j);
        }

        /* renamed from: b */
        public void mo126155b(C102353e<R> eVar) {
            C87412m.m108594g(eVar, "resultData");
            C92186b<T, R> bVar = this.f263858a;
            C65234n nVar = C65234n.OK;
            bVar.getClass();
            bVar.f263854j = nVar;
            this.f263858a.mo126153h(eVar);
            if ((eVar.mo141920a() ? eVar : null) != null) {
                C92186b<T, R> bVar2 = this.f263858a;
                String str = bVar2.f263853i;
                Log.m105924i(str, "[ImageLoader] ontaskLoadFin. get bitmap successs. " + bVar2.f263850f + ' ' + eVar.f301453a);
                C101344e a = C101344e.f296885b.mo140836a();
                C102564a<T> aVar = bVar2.f263850f;
                a.getClass();
                C87412m.m108594g(aVar, "data");
                C61926c.m72668M(new C101348g(a, aVar, eVar));
            }
            this.f263858a.mo126152g(eVar);
            C92186b<T, R> bVar3 = this.f263858a;
            bVar3.mo11853b(bVar3.f263854j);
        }

        /* renamed from: c */
        public void mo126156c() {
            C92186b<T, R> bVar = this.f263858a;
            C65234n nVar = C65234n.Fail;
            bVar.getClass();
            bVar.f263854j = nVar;
            String str = this.f263858a.f263853i;
            Log.m105924i(str, "onTaskFail " + this.f263858a.f263850f);
            C92186b<T, R> bVar2 = this.f263858a;
            bVar2.mo11853b(bVar2.f263854j);
        }
    }

    public C92186b(C102564a<T> aVar, C101342d<R> dVar, C99102f<T, R> fVar) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(dVar, "target");
        C87412m.m108594g(fVar, "REAPER");
        this.f263850f = aVar;
        this.f263851g = dVar;
        this.f263852h = fVar;
        ConcurrentLinkedQueue<C64206c<T>> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f263855n = concurrentLinkedQueue;
        ConcurrentLinkedQueue<C64207e<T, R>> concurrentLinkedQueue2 = new ConcurrentLinkedQueue<>();
        this.f263856o = concurrentLinkedQueue2;
        C99102f<T, R> fVar2 = this.f263852h;
        C64206c<T> cVar = fVar2.f290577f;
        if (cVar != null) {
            concurrentLinkedQueue.add(cVar);
        }
        concurrentLinkedQueue2.add(fVar2.f290574c);
    }

    /* renamed from: a */
    public void mo11852a() {
        System.currentTimeMillis();
        mo126144f(this.f263852h.f290573b.f293167e, new C92188b(this));
    }

    /* renamed from: c */
    public boolean mo89346c(C65220d dVar) {
        C87412m.m108594g(dVar, "newTask");
        boolean z = !(this.f263851g instanceof C101339a);
        synchronized (this) {
            if (!z) {
                if (dVar instanceof C92186b) {
                    if (this.f263857p != null) {
                        Log.m105924i(this.f263853i, "[isCanReplaceCallback] task has end! url=" + this.f263850f);
                        ConcurrentLinkedQueue<C64206c<T>> concurrentLinkedQueue = ((C92186b) dVar).f263855n;
                        ArrayList<C64206c> arrayList = new ArrayList<>();
                        for (T next : concurrentLinkedQueue) {
                            if (next instanceof C64206c) {
                                arrayList.add(next);
                            }
                        }
                        for (C64206c b : arrayList) {
                            b.mo84454b(this.f263850f, this.f263851g.f296881a, this.f263857p);
                        }
                        ConcurrentLinkedQueue<C64207e<T, R>> concurrentLinkedQueue2 = ((C92186b) dVar).f263856o;
                        ArrayList<C64207e> arrayList2 = new ArrayList<>();
                        for (T next2 : concurrentLinkedQueue2) {
                            if (next2 instanceof C64207e) {
                                arrayList2.add(next2);
                            }
                        }
                        for (C64207e eVar : arrayList2) {
                            C102564a<T> aVar = this.f263850f;
                            C101350i<?> iVar = this.f263851g.f296881a;
                            C102353e<R> eVar2 = this.f263857p;
                            eVar.mo507a(aVar, iVar, eVar2 != null ? eVar2.f301453a : null);
                        }
                    } else {
                        ConcurrentLinkedQueue<C64206c<T>> concurrentLinkedQueue3 = this.f263855n;
                        ConcurrentLinkedQueue<C64206c<T>> concurrentLinkedQueue4 = ((C92186b) dVar).f263855n;
                        ArrayList arrayList3 = new ArrayList();
                        for (T next3 : concurrentLinkedQueue4) {
                            if (next3 instanceof C64206c) {
                                arrayList3.add(next3);
                            }
                        }
                        concurrentLinkedQueue3.addAll(arrayList3);
                        ConcurrentLinkedQueue<C64207e<T, R>> concurrentLinkedQueue5 = this.f263856o;
                        ConcurrentLinkedQueue<C64207e<T, R>> concurrentLinkedQueue6 = ((C92186b) dVar).f263856o;
                        ArrayList arrayList4 = new ArrayList();
                        for (T next4 : concurrentLinkedQueue6) {
                            if (next4 instanceof C64207e) {
                                arrayList4.add(next4);
                            }
                        }
                        concurrentLinkedQueue5.addAll(arrayList4);
                    }
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return z;
    }

    /* renamed from: d */
    public String mo11854d() {
        String aVar = this.f263850f.toString();
        C87412m.m108593f(aVar, "url.toString()");
        return aVar;
    }

    /* renamed from: e */
    public final void mo126151e(C102355h<?> hVar, C65941g<R> gVar, C65941g<R> gVar2, C92186b<T, R> bVar) {
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(gVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "task");
        C99102f<T, R> fVar = this.f263852h;
        C100075f fVar2 = fVar.f290573b;
        if (fVar2.f293164b) {
            fVar.f290580i.mo137112e(this.f263850f, hVar, gVar, gVar2, fVar2, fVar);
        }
    }

    /* renamed from: f */
    public abstract void mo126144f(C100075f.C61628b bVar, C92187a<R> aVar);

    /* renamed from: g */
    public final void mo126152g(C102353e<R> eVar) {
        synchronized (this) {
            this.f263857p = eVar;
            for (C64206c b : this.f263855n) {
                b.mo84454b(this.f263850f, this.f263851g.f296881a, eVar);
            }
            for (C64207e a : this.f263856o) {
                a.mo507a(this.f263850f, this.f263851g.f296881a, eVar != null ? eVar.f301453a : null);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: h */
    public final void mo126153h(C102353e<R> eVar) {
        C101723d dVar;
        C87412m.m108594g(eVar, "resultData");
        C99102f<T, R> fVar = this.f263852h;
        if (!eVar.mo141920a()) {
            eVar = null;
        }
        if (eVar != null && (dVar = fVar.f290575d) != null) {
            dVar.mo11751b(fVar.mo138481a().f296881a);
        }
    }
}
