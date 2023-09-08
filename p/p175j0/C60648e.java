package p175j0;

import a14.C53921m;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import p175j0.C60683t0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C66447b;

/* renamed from: j0.e */
public final class C60648e implements C60683t0 {

    /* renamed from: d */
    public final C32224a<C13598b0> f172758d;

    /* renamed from: e */
    public final Object f172759e = new Object();

    /* renamed from: f */
    public Throwable f172760f;

    /* renamed from: g */
    public List<C60649a<?>> f172761g = new ArrayList();

    /* renamed from: h */
    public List<C60649a<?>> f172762h = new ArrayList();

    /* renamed from: j0.e$a */
    public static final class C60649a<R> {

        /* renamed from: a */
        public final C32226l<Long, R> f172763a;

        /* renamed from: b */
        public final C15601d<R> f172764b;

        public C60649a(C32226l<? super Long, ? extends R> lVar, C15601d<? super R> dVar) {
            C87412m.m108594g(lVar, "onFrame");
            C87412m.m108594g(dVar, "continuation");
            this.f172763a = lVar;
            this.f172764b = dVar;
        }
    }

    /* renamed from: j0.e$b */
    public static final class C60650b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60648e f172765d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C60649a<R>> f172766e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60650b(C60648e eVar, C8479f0<C60649a<R>> f0Var) {
            super(1);
            this.f172765d = eVar;
            this.f172766e = f0Var;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C60648e eVar = this.f172765d;
            Object obj2 = eVar.f172759e;
            C8479f0<C60649a<R>> f0Var = this.f172766e;
            synchronized (obj2) {
                List<C60649a<?>> list = eVar.f172761g;
                T t = f0Var.f27484d;
                if (t != null) {
                    list.remove((C60649a) t);
                } else {
                    C87412m.m108603p("awaiter");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C60648e(C32224a<C13598b0> aVar) {
        this.f172758d = aVar;
    }

    /* renamed from: d */
    public <R> Object mo74976d(C32226l<? super Long, ? extends R> lVar, C15601d<? super R> dVar) {
        C32224a<C13598b0> aVar;
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C8479f0 f0Var = new C8479f0();
        synchronized (this.f172759e) {
            Throwable th = this.f172760f;
            if (th != null) {
                Result.Companion companion = Result.Companion;
                mVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th)));
            } else {
                f0Var.f27484d = new C60649a(lVar, mVar);
                boolean z = !this.f172761g.isEmpty();
                List<C60649a<?>> list = this.f172761g;
                T t = f0Var.f27484d;
                if (t != null) {
                    list.add((C60649a) t);
                    boolean z2 = !z;
                    mVar.mo74599v(new C60650b(this, f0Var));
                    if (z2 && (aVar = this.f172758d) != null) {
                        try {
                            aVar.invoke();
                        } catch (Throwable th4) {
                            synchronized (this.f172759e) {
                                if (this.f172760f == null) {
                                    this.f172760f = th4;
                                    List<C60649a<?>> list2 = this.f172761g;
                                    int size = list2.size();
                                    for (int i = 0; i < size; i++) {
                                        C15601d<R> dVar2 = list2.get(i).f172764b;
                                        Result.Companion companion2 = Result.Companion;
                                        dVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th4)));
                                    }
                                    this.f172761g.clear();
                                    C13598b0 b0Var = C13598b0.f38549a;
                                }
                            }
                        }
                    }
                } else {
                    C87412m.m108603p("awaiter");
                    throw null;
                }
            }
        }
        return mVar.mo74608o();
    }

    /* renamed from: e */
    public final boolean mo85592e() {
        boolean z;
        synchronized (this.f172759e) {
            z = !this.f172761g.isEmpty();
        }
        return z;
    }

    /* renamed from: f */
    public final void mo85593f(long j) {
        Object obj;
        synchronized (this.f172759e) {
            List<C60649a<?>> list = this.f172761g;
            this.f172761g = this.f172762h;
            this.f172762h = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C60649a aVar = list.get(i);
                C15601d<R> dVar = aVar.f172764b;
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.m168114constructorimpl(aVar.f172763a.invoke(Long.valueOf(j)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
                }
                dVar.resumeWith(obj);
            }
            list.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public C66212f.C15602c<?> getKey() {
        return C60683t0.C60684a.f172855d;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }
}
