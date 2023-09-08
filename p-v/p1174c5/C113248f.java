package p1174c5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: c5.f */
public class C113248f<TResult> {

    /* renamed from: f */
    public static final ExecutorService f338846f;

    /* renamed from: g */
    public static final Executor f338847g;

    /* renamed from: h */
    public static final Executor f338848h = C113239a.f338838b.f338841a;

    /* renamed from: a */
    public final Object f338849a;

    /* renamed from: b */
    public boolean f338850b;

    /* renamed from: c */
    public TResult f338851c;

    /* renamed from: d */
    public Exception f338852d;

    /* renamed from: e */
    public List<C113246d<TResult, Void>> f338853e;

    /* renamed from: c5.f$a */
    public class C113249a implements C113246d<TResult, Void> {

        /* renamed from: a */
        public final /* synthetic */ C113252i f338854a;

        /* renamed from: b */
        public final /* synthetic */ C113246d f338855b;

        /* renamed from: c */
        public final /* synthetic */ Executor f338856c;

        public C113249a(C113248f fVar, C113252i iVar, C113246d dVar, Executor executor, C113245c cVar) {
            this.f338854a = iVar;
            this.f338855b = dVar;
            this.f338856c = executor;
        }

        /* renamed from: a */
        public Object mo165790a(C113248f fVar) {
            C113252i iVar = this.f338854a;
            C113246d dVar = this.f338855b;
            try {
                this.f338856c.execute(new C113250g((C113245c) null, iVar, dVar, fVar));
            } catch (Exception e) {
                iVar.mo165796a(new C113247e(e));
            }
            return null;
        }
    }

    static {
        C113242b bVar = C113242b.f338842c;
        f338846f = bVar.f338843a;
        f338847g = bVar.f338844b;
        new C113248f((Object) null);
        new C113248f(Boolean.TRUE);
        new C113248f(Boolean.FALSE);
        new C113248f(true);
    }

    public C113248f() {
        this.f338849a = new Object();
        this.f338853e = new ArrayList();
    }

    /* renamed from: a */
    public static <TResult> C113248f<TResult> m155038a(Callable<TResult> callable) {
        ExecutorService executorService = f338846f;
        C113252i iVar = new C113252i();
        try {
            executorService.execute(new C113251h((C113245c) null, iVar, callable));
        } catch (Exception e) {
            iVar.mo165796a(new C113247e(e));
        }
        return iVar.f338862a;
    }

    /* renamed from: b */
    public <TContinuationResult> C113248f<TContinuationResult> mo165791b(C113246d<TResult, TContinuationResult> dVar, Executor executor, C113245c cVar) {
        boolean z;
        C113252i iVar = new C113252i();
        synchronized (this.f338849a) {
            synchronized (this.f338849a) {
                z = this.f338850b;
            }
            if (!z) {
                ((ArrayList) this.f338853e).add(new C113249a(this, iVar, dVar, executor, cVar));
            }
        }
        if (z) {
            try {
                executor.execute(new C113250g(cVar, iVar, dVar, this));
            } catch (Exception e) {
                iVar.mo165796a(new C113247e(e));
            }
        }
        return iVar.f338862a;
    }

    /* renamed from: c */
    public final void mo165792c() {
        synchronized (this.f338849a) {
            for (C113246d a : this.f338853e) {
                try {
                    a.mo165790a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f338853e = null;
        }
    }

    /* renamed from: d */
    public boolean mo165793d(TResult tresult) {
        synchronized (this.f338849a) {
            if (this.f338850b) {
                return false;
            }
            this.f338850b = true;
            this.f338851c = tresult;
            this.f338849a.notifyAll();
            mo165792c();
            return true;
        }
    }

    public C113248f(TResult tresult) {
        this.f338849a = new Object();
        this.f338853e = new ArrayList();
        mo165793d(tresult);
    }

    public C113248f(boolean z) {
        Object obj = new Object();
        this.f338849a = obj;
        this.f338853e = new ArrayList();
        if (z) {
            synchronized (obj) {
                if (!this.f338850b) {
                    this.f338850b = true;
                    obj.notifyAll();
                    mo165792c();
                    return;
                }
                return;
            }
        }
        mo165793d((Object) null);
    }
}
