package c14;

import f14.C58872c0;
import f14.C58887j0;
import f14.C58891n;
import f14.C58903u;
import fy3.C32226l;
import java.util.concurrent.locks.ReentrantLock;
import rx3.C13598b0;

/* renamed from: c14.r */
public class C54641r<E> extends C54602a<E> {

    /* renamed from: g */
    public final ReentrantLock f153166g = new ReentrantLock();

    /* renamed from: h */
    public Object f153167h = C54611b.f153120a;

    public C54641r(C32226l<? super E, C13598b0> lVar) {
        super(lVar);
    }

    /* renamed from: B */
    public Object mo75510B() {
        ReentrantLock reentrantLock = this.f153166g;
        reentrantLock.lock();
        try {
            Object obj = this.f153167h;
            C58872c0 c0Var = C54611b.f153120a;
            if (obj == c0Var) {
                Object j = mo75544j();
                if (j == null) {
                    j = C54611b.f153123d;
                }
                return j;
            }
            this.f153167h = c0Var;
            C13598b0 b0Var = C13598b0.f38549a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public String mo75542d() {
        ReentrantLock reentrantLock = this.f153166g;
        reentrantLock.lock();
        try {
            return "(value=" + this.f153167h + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: l */
    public final boolean mo75546l() {
        return false;
    }

    /* renamed from: n */
    public final boolean mo75547n() {
        return false;
    }

    /* renamed from: q */
    public Object mo75548q(E e) {
        C54650y r;
        ReentrantLock reentrantLock = this.f153166g;
        reentrantLock.lock();
        try {
            C54634n<?> j = mo75544j();
            if (j != null) {
                return j;
            }
            C58887j0 j0Var = null;
            if (this.f153167h == C54611b.f153120a) {
                do {
                    r = mo75517r();
                    if (r != null) {
                        if (r instanceof C54634n) {
                            reentrantLock.unlock();
                            return r;
                        }
                    }
                } while (r.mo75525d(e, (C58891n.C58893b) null) == null);
                C13598b0 b0Var = C13598b0.f38549a;
                reentrantLock.unlock();
                r.mo75526f(e);
                return r.mo75566c();
            }
            Object obj = this.f153167h;
            if (obj != C54611b.f153120a) {
                C32226l<E, C13598b0> lVar = this.f153127d;
                if (lVar != null) {
                    j0Var = C58903u.m68763a(lVar, obj, (C58887j0) null);
                }
            }
            this.f153167h = e;
            if (j0Var == null) {
                C58872c0 c0Var = C54611b.f153121b;
                reentrantLock.unlock();
                return c0Var;
            }
            throw j0Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: v */
    public boolean mo75519v(C54648w<? super E> wVar) {
        ReentrantLock reentrantLock = this.f153166g;
        reentrantLock.lock();
        try {
            return super.mo75519v(wVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: x */
    public final boolean mo75520x() {
        return false;
    }

    /* renamed from: y */
    public final boolean mo75521y() {
        ReentrantLock reentrantLock = this.f153166g;
        reentrantLock.lock();
        try {
            return this.f153167h == C54611b.f153120a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z */
    public void mo75522z(boolean z) {
        ReentrantLock reentrantLock = this.f153166g;
        reentrantLock.lock();
        try {
            C58872c0 c0Var = C54611b.f153120a;
            Object obj = this.f153167h;
            C58887j0 j0Var = null;
            if (obj != c0Var) {
                C32226l<E, C13598b0> lVar = this.f153127d;
                if (lVar != null) {
                    j0Var = C58903u.m68763a(lVar, obj, (C58887j0) null);
                }
            }
            this.f153167h = c0Var;
            C13598b0 b0Var = C13598b0.f38549a;
            reentrantLock.unlock();
            super.mo75522z(z);
            if (j0Var != null) {
                throw j0Var;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
