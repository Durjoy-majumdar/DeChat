package c14;

import c14.C54630l;
import f14.C58872c0;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx3.C13598b0;
import sx3.C110821n;
import sx3.C110823p;
import wx3.C15601d;

/* renamed from: c14.q */
public final class C54637q<E> implements C54622f<E> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f153156d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f153157e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f153158f;
    @Deprecated

    /* renamed from: g */
    public static final C54638a f153159g = new C54638a((Throwable) null);
    @Deprecated

    /* renamed from: h */
    public static final C58872c0 f153160h;
    @Deprecated

    /* renamed from: i */
    public static final C54639b<Object> f153161i;
    private volatile /* synthetic */ Object _state = f153161i;
    private volatile /* synthetic */ int _updating = 0;
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: c14.q$a */
    public static final class C54638a {

        /* renamed from: a */
        public final Throwable f153162a;

        public C54638a(Throwable th) {
            this.f153162a = th;
        }
    }

    /* renamed from: c14.q$b */
    public static final class C54639b<E> {

        /* renamed from: a */
        public final Object f153163a;

        /* renamed from: b */
        public final C54640c<E>[] f153164b;

        public C54639b(Object obj, C54640c<E>[] cVarArr) {
            this.f153163a = obj;
            this.f153164b = cVarArr;
        }
    }

    /* renamed from: c14.q$c */
    public static final class C54640c<E> extends C54641r<E> implements C54649x<E> {

        /* renamed from: i */
        public final C54637q<E> f153165i;

        public C54640c(C54637q<E> qVar) {
            super((C32226l) null);
            this.f153165i = qVar;
        }

        /* renamed from: q */
        public Object mo75548q(E e) {
            return super.mo75548q(e);
        }

        /* renamed from: z */
        public void mo75522z(boolean z) {
            if (z) {
                C54637q.m61490a(this.f153165i, this);
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C54637q> cls2 = C54637q.class;
        C58872c0 c0Var = new C58872c0("UNDEFINED");
        f153160h = c0Var;
        f153161i = new C54639b<>(c0Var, (C54640c<E>[]) null);
        f153156d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f153157e = AtomicIntegerFieldUpdater.newUpdater(cls2, "_updating");
        f153158f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "onCloseHandler");
    }

    /* renamed from: a */
    public static final void m61490a(C54637q qVar, C54640c cVar) {
        boolean z;
        C54640c[] cVarArr;
        C54637q qVar2 = qVar;
        do {
            Object obj = qVar2._state;
            if (!(obj instanceof C54638a)) {
                if (obj instanceof C54639b) {
                    C54639b bVar = (C54639b) obj;
                    Object obj2 = bVar.f153163a;
                    C54640c<E>[] cVarArr2 = bVar.f153164b;
                    C87412m.m108591d(cVarArr2);
                    int length = cVarArr2.length;
                    int J = C110823p.m150984J(cVarArr2, cVar);
                    z = true;
                    if (length == 1) {
                        cVarArr = null;
                    } else {
                        C54640c[] cVarArr3 = new C54640c[(length - 1)];
                        C54640c<E>[] cVarArr4 = cVarArr2;
                        C54640c[] cVarArr5 = cVarArr3;
                        C110821n.m150966m(cVarArr4, cVarArr5, 0, 0, J, 6, (Object) null);
                        C110821n.m150966m(cVarArr4, cVarArr5, J, J + 1, 0, 8, (Object) null);
                        cVarArr = cVarArr3;
                    }
                    C54639b bVar2 = new C54639b(obj2, cVarArr);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153156d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(qVar2, obj, bVar2)) {
                            if (atomicReferenceFieldUpdater.get(qVar2) != obj) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    throw new IllegalStateException(("Invalid state " + obj).toString());
                }
            } else {
                return;
            }
        } while (!z);
    }

    /* renamed from: b */
    public void mo75551b(CancellationException cancellationException) {
        mo75540w(cancellationException);
    }

    /* renamed from: c */
    public final C54638a mo75568c(E e) {
        Object obj;
        boolean z;
        if (!f153157e.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof C54638a) {
                    C54638a aVar = (C54638a) obj;
                    this._updating = 0;
                    return aVar;
                } else if (obj instanceof C54639b) {
                    C54639b bVar = new C54639b(e, ((C54639b) obj).f153164b);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153156d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    throw new IllegalStateException(("Invalid state " + obj).toString());
                }
            } finally {
                this._updating = 0;
            }
        } while (!z);
        C54640c<E>[] cVarArr = ((C54639b) obj).f153164b;
        if (cVarArr != null) {
            for (C54640c<E> q : cVarArr) {
                q.mo75548q(e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public C54649x<E> mo75552e() {
        boolean z;
        C54640c[] cVarArr;
        C54640c cVar = new C54640c(this);
        do {
            Object obj = this._state;
            if (obj instanceof C54638a) {
                cVar.mo75540w(((C54638a) obj).f153162a);
                return cVar;
            } else if (obj instanceof C54639b) {
                C54639b bVar = (C54639b) obj;
                Object obj2 = bVar.f153163a;
                if (obj2 != f153160h) {
                    cVar.mo75548q(obj2);
                }
                Object obj3 = bVar.f153163a;
                C54640c<E>[] cVarArr2 = bVar.f153164b;
                z = false;
                if (cVarArr2 == null) {
                    cVarArr = new C54640c[1];
                    for (int i = 0; i < 1; i++) {
                        cVarArr[i] = cVar;
                    }
                } else {
                    int length = cVarArr2.length;
                    Object[] copyOf = Arrays.copyOf(cVarArr2, length + 1);
                    copyOf[length] = cVar;
                    cVarArr = (C54640c[]) copyOf;
                }
                C54639b bVar2 = new C54639b(obj3, cVarArr);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153156d;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!z);
        return cVar;
    }

    /* renamed from: h */
    public boolean mo75535h() {
        return this._state instanceof C54638a;
    }

    /* renamed from: o */
    public Object mo75536o(E e, C15601d<? super C13598b0> dVar) {
        C54638a c = mo75568c(e);
        if (c == null) {
            return C13598b0.f38549a;
        }
        Throwable th = c.f153162a;
        if (th == null) {
            th = new C54636p("Channel was closed");
        }
        throw th;
    }

    /* renamed from: t */
    public Object mo75539t(E e) {
        C54638a c = mo75568c(e);
        if (c == null) {
            return C13598b0.f38549a;
        }
        Throwable th = c.f153162a;
        if (th == null) {
            th = new C54636p("Channel was closed");
        }
        return new C54630l.C54631a(th);
    }

    /* renamed from: w */
    public boolean mo75540w(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        C58872c0 c0Var;
        do {
            obj = this._state;
            z = false;
            if (obj instanceof C54638a) {
                return false;
            }
            if (obj instanceof C54639b) {
                C54638a aVar = th == null ? f153159g : new C54638a(th);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153156d;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, aVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z2 = false;
                            continue;
                            break;
                        }
                    } else {
                        z2 = true;
                        continue;
                        break;
                    }
                }
            } else {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!z2);
        C54640c<E>[] cVarArr = ((C54639b) obj).f153164b;
        if (cVarArr != null) {
            for (C54640c<E> w : cVarArr) {
                w.mo75540w(th);
            }
        }
        Object obj2 = this.onCloseHandler;
        if (!(obj2 == null || obj2 == (c0Var = C54611b.f153125f))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f153158f;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                C24564k0.m30741e(obj2, 1);
                ((C32226l) obj2).invoke(th);
            }
        }
        return true;
    }
}
