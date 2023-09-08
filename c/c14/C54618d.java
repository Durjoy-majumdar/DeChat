package c14;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import f14.C58872c0;
import f14.C58873d;
import f14.C58891n;
import fy3.C32226l;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import rx3.C13598b0;

/* renamed from: c14.d */
public final class C54618d<E> extends C54614c<E> implements C54622f<E> {
    private volatile /* synthetic */ long _head;
    private volatile /* synthetic */ int _size;
    private volatile /* synthetic */ long _tail;

    /* renamed from: g */
    public final int f153133g;

    /* renamed from: h */
    public final ReentrantLock f153134h;

    /* renamed from: i */
    public final Object[] f153135i;

    /* renamed from: j */
    public final List<C54619a<E>> f153136j;

    /* renamed from: c14.d$a */
    public static final class C54619a<E> extends C54602a<E> implements C54649x<E> {
        private volatile /* synthetic */ long _subHead = 0;

        /* renamed from: g */
        public final C54618d<E> f153137g;

        /* renamed from: h */
        public final ReentrantLock f153138h = new ReentrantLock();

        public C54619a(C54618d<E> dVar) {
            super((C32226l) null);
            this.f153137g = dVar;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: B */
        public Object mo75510B() {
            boolean z;
            ReentrantLock reentrantLock = this.f153138h;
            reentrantLock.lock();
            try {
                Object F = mo75556F();
                boolean z2 = true;
                if ((F instanceof C54634n) || F == C54611b.f153123d) {
                    z = false;
                } else {
                    this._subHead++;
                    z = true;
                }
                reentrantLock.unlock();
                C54634n nVar = F instanceof C54634n ? (C54634n) F : null;
                if (nVar != null) {
                    mo75540w(nVar.f153155g);
                }
                if (!mo75554D()) {
                    z2 = z;
                }
                if (z2) {
                    C54618d.m61431y(this.f153137g, (C54619a) null, (C54619a) null, 3, (Object) null);
                }
                return F;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* renamed from: D */
        public final boolean mo75554D() {
            C54634n nVar;
            boolean z = false;
            while (true) {
                nVar = null;
                if (!(mo75543i() == null && (!mo75521y() || this.f153137g.mo75543i() != null)) || !this.f153138h.tryLock()) {
                    break;
                }
                try {
                    Object F = mo75556F();
                    if (F != C54611b.f153123d) {
                        if (F instanceof C54634n) {
                            nVar = (C54634n) F;
                            break;
                        }
                        C54650y r = mo75517r();
                        if (r == null) {
                            break;
                        } else if (r instanceof C54634n) {
                            break;
                        } else if (r.mo75525d(F, (C58891n.C58893b) null) != null) {
                            this._subHead++;
                            this.f153138h.unlock();
                            r.mo75526f(F);
                            z = true;
                        }
                    }
                } finally {
                    this.f153138h.unlock();
                }
            }
            this.f153138h.unlock();
            if (nVar != null) {
                mo75540w(nVar.f153155g);
            }
            return z;
        }

        /* renamed from: E */
        public final long mo75555E() {
            return this._subHead;
        }

        /* renamed from: F */
        public final Object mo75556F() {
            long j = this._subHead;
            C54634n<?> i = this.f153137g.mo75543i();
            if (j < C54618d.m61430v(this.f153137g)) {
                C54618d<E> dVar = this.f153137g;
                Object obj = dVar.f153135i[(int) (j % ((long) dVar.f153133g))];
                C54634n<?> i2 = mo75543i();
                return i2 != null ? i2 : obj;
            } else if (i != null) {
                return i;
            } else {
                C54634n<?> i3 = mo75543i();
                return i3 == null ? C54611b.f153123d : i3;
            }
        }

        /* renamed from: G */
        public final void mo75557G(long j) {
            this._subHead = j;
        }

        /* renamed from: l */
        public boolean mo75546l() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* renamed from: n */
        public boolean mo75547n() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* renamed from: w */
        public boolean mo75540w(Throwable th) {
            boolean w = super.mo75540w(th);
            if (w) {
                C54618d.m61431y(this.f153137g, (C54619a) null, this, 1, (Object) null);
                ReentrantLock reentrantLock = this.f153138h;
                reentrantLock.lock();
                try {
                    this._subHead = C54618d.m61430v(this.f153137g);
                    C13598b0 b0Var = C13598b0.f38549a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return w;
        }

        /* renamed from: x */
        public boolean mo75520x() {
            return false;
        }

        /* renamed from: y */
        public boolean mo75521y() {
            return this._subHead >= C54618d.m61430v(this.f153137g);
        }
    }

    public C54618d(int i) {
        super((C32226l) null);
        this.f153133g = i;
        if (i < 1 ? false : true) {
            this.f153134h = new ReentrantLock();
            this.f153135i = new Object[i];
            this._head = 0;
            this._tail = 0;
            this._size = 0;
            Method method = C58873d.f168511a;
            this.f153136j = new CopyOnWriteArrayList();
            return;
        }
        throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: v */
    public static final long m61430v(C54618d dVar) {
        return dVar._tail;
    }

    /* renamed from: y */
    public static void m61431y(C54618d dVar, C54619a aVar, C54619a aVar2, int i, Object obj) {
        C54610a0 s;
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        while (true) {
            ReentrantLock reentrantLock = dVar.f153134h;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    aVar.mo75557G(dVar._tail);
                    boolean isEmpty = ((CopyOnWriteArrayList) dVar.f153136j).isEmpty();
                    ((CopyOnWriteArrayList) dVar.f153136j).add(aVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (aVar2 != null) {
                ((CopyOnWriteArrayList) dVar.f153136j).remove(aVar2);
                if (dVar._head != aVar2.mo75555E()) {
                    reentrantLock.unlock();
                    return;
                }
            }
            Iterator it = ((CopyOnWriteArrayList) dVar.f153136j).iterator();
            long j = MAlarmHandler.NEXT_FIRE_INTERVAL;
            while (it.hasNext()) {
                long E = ((C54619a) it.next()).mo75555E();
                if (j > E) {
                    j = E;
                }
            }
            long j2 = dVar._tail;
            long j3 = dVar._head;
            if (j > j2) {
                j = j2;
            }
            if (j <= j3) {
                reentrantLock.unlock();
                return;
            }
            int i2 = dVar._size;
            while (j3 < j) {
                Object[] objArr = dVar.f153135i;
                int i3 = dVar.f153133g;
                objArr[(int) (j3 % ((long) i3))] = null;
                boolean z = i2 >= i3;
                j3++;
                dVar._head = j3;
                i2--;
                dVar._size = i2;
                if (z) {
                    do {
                        s = dVar.mo75549s();
                        if (s != null) {
                            if (s instanceof C54634n) {
                                continue;
                            }
                        }
                    } while (s.mo75533w((C58891n.C58893b) null) == null);
                    dVar.f153135i[(int) (j2 % ((long) dVar.f153133g))] = s.mo75531u();
                    dVar._size = i2 + 1;
                    dVar._tail = j2 + 1;
                    C13598b0 b0Var = C13598b0.f38549a;
                    reentrantLock.unlock();
                    s.mo75530t();
                    dVar.mo75553x();
                    aVar = null;
                    aVar2 = null;
                }
            }
            reentrantLock.unlock();
            return;
        }
    }

    /* renamed from: b */
    public void mo75551b(CancellationException cancellationException) {
        mo75540w(cancellationException);
        Iterator it = ((CopyOnWriteArrayList) this.f153136j).iterator();
        while (it.hasNext()) {
            C54619a aVar = (C54619a) it.next();
            aVar.mo75522z(aVar.mo75540w(cancellationException));
        }
    }

    /* renamed from: d */
    public String mo75542d() {
        return "(buffer:capacity=" + this.f153135i.length + ",size=" + this._size + ')';
    }

    /* renamed from: e */
    public C54649x<E> mo75552e() {
        C54619a aVar = new C54619a(this);
        m61431y(this, aVar, (C54619a) null, 2, (Object) null);
        return aVar;
    }

    /* renamed from: l */
    public boolean mo75546l() {
        return false;
    }

    /* renamed from: n */
    public boolean mo75547n() {
        return this._size >= this.f153133g;
    }

    /* renamed from: q */
    public Object mo75548q(E e) {
        ReentrantLock reentrantLock = this.f153134h;
        reentrantLock.lock();
        try {
            C54634n<?> j = mo75544j();
            if (j != null) {
                return j;
            }
            int i = this._size;
            if (i >= this.f153133g) {
                C58872c0 c0Var = C54611b.f153122c;
                reentrantLock.unlock();
                return c0Var;
            }
            long j2 = this._tail;
            this.f153135i[(int) (j2 % ((long) this.f153133g))] = e;
            this._size = i + 1;
            this._tail = j2 + 1;
            C13598b0 b0Var = C13598b0.f38549a;
            reentrantLock.unlock();
            mo75553x();
            return C54611b.f153121b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: w */
    public boolean mo75540w(Throwable th) {
        if (!super.mo75540w(th)) {
            return false;
        }
        mo75553x();
        return true;
    }

    /* renamed from: x */
    public final void mo75553x() {
        Iterator it = ((CopyOnWriteArrayList) this.f153136j).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            if (((C54619a) it.next()).mo75554D()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            m61431y(this, (C54619a) null, (C54619a) null, 3, (Object) null);
        }
    }
}
