package o34;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import l34.C117453e;
import l34.C117456i;
import l34.C117458j;
import m34.C117528c;
import n34.C117603a;
import p34.C117944f;
import p34.C117964n;
import p418rx.internal.util.unsafe.SpscArrayQueue;
import p418rx.internal.util.unsafe.UnsafeAccess;
import q34.C118157g;
import r34.C118221c;
import t34.C118375m;

/* renamed from: o34.n */
public final class C117668n<T> implements C117453e.C88377b<T, T> {

    /* renamed from: a */
    public final C117456i f351948a;

    /* renamed from: b */
    public final boolean f351949b;

    /* renamed from: c */
    public final int f351950c;

    /* renamed from: o34.n$a */
    public static final class C117669a<T> extends C117458j<T> implements C117603a {

        /* renamed from: h */
        public final C117458j<? super T> f351951h;

        /* renamed from: i */
        public final C117456i.C117457a f351952i;

        /* renamed from: j */
        public final C117655d<T> f351953j;

        /* renamed from: n */
        public final boolean f351954n;

        /* renamed from: o */
        public final Queue<Object> f351955o;

        /* renamed from: p */
        public final int f351956p;

        /* renamed from: q */
        public volatile boolean f351957q;

        /* renamed from: r */
        public final AtomicLong f351958r = new AtomicLong();

        /* renamed from: s */
        public final AtomicLong f351959s = new AtomicLong();

        /* renamed from: t */
        public Throwable f351960t;

        /* renamed from: u */
        public long f351961u;

        public C117669a(C117456i iVar, C117458j<? super T> jVar, boolean z, int i) {
            this.f351951h = jVar;
            this.f351952i = iVar.createWorker();
            this.f351954n = z;
            this.f351953j = C117655d.f351922a;
            i = i <= 0 ? C118157g.f353187e : i;
            this.f351956p = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.f351955o = new SpscArrayQueue(i);
            } else {
                this.f351955o = new C118221c(i);
            }
            mo182168g((long) i);
        }

        /* renamed from: a */
        public void mo122780a() {
            if (!this.f351524d.f353197e && !this.f351957q) {
                this.f351957q = true;
                mo182377j();
            }
        }

        /* renamed from: b */
        public void mo122781b(T t) {
            if (!this.f351524d.f353197e && !this.f351957q) {
                Queue<Object> queue = this.f351955o;
                this.f351953j.getClass();
                if (t == null) {
                    t = C117655d.f351924c;
                }
                if (!queue.offer(t)) {
                    onError(new C117528c());
                } else {
                    mo182377j();
                }
            }
        }

        public void call() {
            int i;
            long j;
            long j2;
            long j3 = this.f351961u;
            Queue<Object> queue = this.f351955o;
            C117458j<? super T> jVar = this.f351951h;
            C117655d<T> dVar = this.f351953j;
            long j4 = 1;
            do {
                long j5 = this.f351958r.get();
                while (true) {
                    i = (j5 > j3 ? 1 : (j5 == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f351957q;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!mo182376i(z, z2, jVar, queue)) {
                        if (z2) {
                            break;
                        }
                        dVar.getClass();
                        if (poll == C117655d.f351924c) {
                            poll = null;
                        }
                        jVar.mo122781b(poll);
                        j3++;
                        if (j3 == ((long) this.f351956p)) {
                            AtomicLong atomicLong = this.f351958r;
                            do {
                                j = atomicLong.get();
                                j2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                                if (j == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                                    break;
                                }
                                j2 = j - j3;
                                if (j2 < 0) {
                                    throw new IllegalStateException("More produced than requested: " + j2);
                                }
                            } while (!atomicLong.compareAndSet(j, j2));
                            mo182168g(j3);
                            j5 = j2;
                            j3 = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (i != 0 || !mo182376i(this.f351957q, queue.isEmpty(), jVar, queue)) {
                    this.f351961u = j3;
                    j4 = this.f351959s.addAndGet(-j4);
                } else {
                    return;
                }
            } while (j4 != 0);
        }

        /* renamed from: i */
        public boolean mo182376i(boolean z, boolean z2, C117458j<? super T> jVar, Queue<Object> queue) {
            if (jVar.f351524d.f353197e) {
                queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f351954n) {
                    Throwable th = this.f351960t;
                    if (th != null) {
                        queue.clear();
                        try {
                            jVar.onError(th);
                            return true;
                        } finally {
                            this.f351952i.mo182165d();
                        }
                    } else if (!z2) {
                        return false;
                    } else {
                        try {
                            jVar.mo122780a();
                            return true;
                        } finally {
                            this.f351952i.mo182165d();
                        }
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th4 = this.f351960t;
                    if (th4 != null) {
                        try {
                            jVar.onError(th4);
                        } catch (Throwable th5) {
                            this.f351952i.mo182165d();
                            throw th5;
                        }
                    } else {
                        jVar.mo122780a();
                    }
                    this.f351952i.mo182165d();
                    return false;
                }
            }
        }

        /* renamed from: j */
        public void mo182377j() {
            if (this.f351959s.getAndIncrement() == 0) {
                this.f351952i.mo182162b(this);
            }
        }

        public void onError(Throwable th) {
            if (this.f351524d.f353197e || this.f351957q) {
                C118375m.m166985a(th);
                return;
            }
            this.f351960t = th;
            this.f351957q = true;
            mo182377j();
        }
    }

    public C117668n(C117456i iVar, boolean z, int i) {
        this.f351948a = iVar;
        this.f351949b = z;
        this.f351950c = i <= 0 ? C118157g.f353187e : i;
    }

    public Object call(Object obj) {
        C117458j jVar = (C117458j) obj;
        C117456i iVar = this.f351948a;
        if ((iVar instanceof C117944f) || (iVar instanceof C117964n)) {
            return jVar;
        }
        C117669a aVar = new C117669a(iVar, jVar, this.f351949b, this.f351950c);
        C117458j<? super T> jVar2 = aVar.f351951h;
        jVar2.mo182169h(new C117667m(aVar));
        jVar2.mo182166e(aVar.f351952i);
        jVar2.mo182166e(aVar);
        return aVar;
    }
}
