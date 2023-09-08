package f14;

import a14.C0003z;
import a14.C53853a1;
import a14.C53896h0;
import a14.C53906j1;
import a14.C53916l;
import a14.C53921m;
import a14.C53942r0;
import a14.C53968x2;
import a14.C53969y;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66705e;

/* renamed from: f14.h */
public final class C58883h<T> extends C53853a1<T> implements C66705e, C15601d<T> {

    /* renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168524n = AtomicReferenceFieldUpdater.newUpdater(C58883h.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: g */
    public final C53896h0 f168525g;

    /* renamed from: h */
    public final C15601d<T> f168526h;

    /* renamed from: i */
    public Object f168527i = C58885i.f168529a;

    /* renamed from: j */
    public final Object f168528j = C58878f0.m68715b(getContext());

    public C58883h(C53896h0 h0Var, C15601d<? super T> dVar) {
        super(-1);
        this.f168525g = h0Var;
        this.f168526h = dVar;
    }

    /* renamed from: b */
    public void mo74475b(Object obj, Throwable th) {
        if (obj instanceof C0003z) {
            ((C0003z) obj).f2b.invoke(th);
        }
    }

    /* renamed from: d */
    public C15601d<T> mo74476d() {
        return this;
    }

    public C66705e getCallerFrame() {
        C15601d<T> dVar = this.f168526h;
        if (dVar instanceof C66705e) {
            return (C66705e) dVar;
        }
        return null;
    }

    public C66212f getContext() {
        return this.f168526h.getContext();
    }

    /* renamed from: h */
    public Object mo74480h() {
        Object obj = this.f168527i;
        this.f168527i = C58885i.f168529a;
        return obj;
    }

    /* renamed from: i */
    public final C53921m<T> mo84067i() {
        boolean z;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C58885i.f168530b;
                return null;
            } else if (obj instanceof C53921m) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168524n;
                C58872c0 c0Var = C58885i.f168530b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (C53921m) obj;
                }
            } else if (obj != C58885i.f168530b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: j */
    public final boolean mo84068j() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: k */
    public final boolean mo84069k(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C58872c0 c0Var = C58885i.f168530b;
            boolean z = false;
            boolean z2 = true;
            if (C87412m.m108589b(obj, c0Var)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168524n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, c0Var, th)) {
                        if (atomicReferenceFieldUpdater.get(this) != c0Var) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f168524n;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z2) {
                    return false;
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo84070l() {
        Object obj = this._reusableCancellableContinuation;
        C53921m mVar = obj instanceof C53921m ? (C53921m) obj : null;
        if (mVar != null) {
            mVar.mo74606l();
        }
    }

    /* renamed from: m */
    public final Throwable mo84071m(C53916l<?> lVar) {
        boolean z;
        do {
            Object obj = this._reusableCancellableContinuation;
            C58872c0 c0Var = C58885i.f168530b;
            z = false;
            if (obj == c0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168524n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, c0Var, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != c0Var) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f168524n;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!z);
        return null;
    }

    public void resumeWith(Object obj) {
        C66212f context;
        Object c;
        C66212f context2 = this.f168526h.getContext();
        Throwable r1 = Result.m168117exceptionOrNullimpl(obj);
        Object yVar = r1 == null ? obj : new C53969y(r1, false, 2, (C8480h) null);
        if (this.f168525g.mo74565h0(context2)) {
            this.f168527i = yVar;
            this.f151095f = 0;
            this.f168525g.mo74497S(context2, this);
            return;
        }
        C53906j1 a = C53968x2.f151211a.mo74642a();
        if (a.mo74572l0()) {
            this.f168527i = yVar;
            this.f151095f = 0;
            a.mo74570j0(this);
            return;
        }
        a.mo74571k0(true);
        try {
            context = getContext();
            c = C58878f0.m68716c(context, this.f168528j);
            this.f168526h.resumeWith(obj);
            C13598b0 b0Var = C13598b0.f38549a;
            C58878f0.m68714a(context, c);
            do {
            } while (a.mo74574o0());
        } catch (Throwable th) {
            try {
                mo74479g(th, (Throwable) null);
            } catch (Throwable th4) {
                a.mo74569i0(true);
                throw th4;
            }
        }
        a.mo74569i0(true);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f168525g + ", " + C53942r0.m60573b(this.f168526h) + ']';
    }
}
