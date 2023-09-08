package j14;

import a14.C53942r0;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import f14.C58872c0;
import f14.C58906x;
import gy3.C87412m;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import ky3.C88334c;
import rx3.C13598b0;

/* renamed from: j14.a */
public final class C60716a implements Executor, Closeable {

    /* renamed from: n */
    public static final /* synthetic */ AtomicLongFieldUpdater f172930n = AtomicLongFieldUpdater.newUpdater(C60716a.class, "parkedWorkersStack");

    /* renamed from: o */
    public static final /* synthetic */ AtomicLongFieldUpdater f172931o = AtomicLongFieldUpdater.newUpdater(C60716a.class, "controlState");

    /* renamed from: p */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f172932p = AtomicIntegerFieldUpdater.newUpdater(C60716a.class, "_isTerminated");

    /* renamed from: q */
    public static final C58872c0 f172933q = new C58872c0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final int f172934d;

    /* renamed from: e */
    public final int f172935e;

    /* renamed from: f */
    public final long f172936f;

    /* renamed from: g */
    public final String f172937g;

    /* renamed from: h */
    public final C60721d f172938h;

    /* renamed from: i */
    public final C60721d f172939i;

    /* renamed from: j */
    public final C58906x<C60717a> f172940j;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: j14.a$a */
    public final class C60717a extends Thread {

        /* renamed from: n */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f172941n = AtomicIntegerFieldUpdater.newUpdater(C60717a.class, "workerCtl");

        /* renamed from: d */
        public final C60731n f172942d = new C60731n();

        /* renamed from: e */
        public C60718b f172943e = C60718b.DORMANT;

        /* renamed from: f */
        public long f172944f;

        /* renamed from: g */
        public long f172945g;

        /* renamed from: h */
        public int f172946h = C88334c.f255322d.mo122717f();

        /* renamed from: i */
        public boolean f172947i;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker = C60716a.f172933q;
        public volatile /* synthetic */ int workerCtl = 0;

        public C60717a(int i) {
            setDaemon(true);
            mo85657f(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: j14.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: j14.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final j14.C60725h mo85652a(boolean r11) {
            /*
                r10 = this;
                j14.a$b r0 = j14.C60716a.C60718b.CPU_ACQUIRED
                j14.a$b r1 = r10.f172943e
                r2 = 1
                r3 = 0
                if (r1 != r0) goto L_0x0009
                goto L_0x0030
            L_0x0009:
                j14.a r1 = j14.C60716a.this
            L_0x000b:
                long r6 = r1.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r8 = 42
                long r4 = r4 >> r8
                int r5 = (int) r4
                if (r5 != 0) goto L_0x001b
                r1 = 0
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = j14.C60716a.f172931o
                r5 = r1
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto L_0x000b
                r1 = 1
            L_0x002c:
                if (r1 == 0) goto L_0x0032
                r10.f172943e = r0
            L_0x0030:
                r0 = 1
                goto L_0x0033
            L_0x0032:
                r0 = 0
            L_0x0033:
                r1 = 0
                if (r0 == 0) goto L_0x007c
                if (r11 == 0) goto L_0x0070
                j14.a r11 = j14.C60716a.this
                int r11 = r11.f172934d
                int r11 = r11 * 2
                int r11 = r10.mo85655d(r11)
                if (r11 != 0) goto L_0x0045
                goto L_0x0046
            L_0x0045:
                r2 = 0
            L_0x0046:
                if (r2 == 0) goto L_0x004f
                j14.h r11 = r10.mo85656e()
                if (r11 == 0) goto L_0x004f
                goto L_0x007b
            L_0x004f:
                j14.n r11 = r10.f172942d
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = j14.C60731n.f172972b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                j14.h r0 = (j14.C60725h) r0
                if (r0 != 0) goto L_0x0063
                j14.h r11 = r11.mo85670d()
                goto L_0x0064
            L_0x0063:
                r11 = r0
            L_0x0064:
                if (r11 == 0) goto L_0x0067
                goto L_0x007b
            L_0x0067:
                if (r2 != 0) goto L_0x0077
                j14.h r11 = r10.mo85656e()
                if (r11 == 0) goto L_0x0077
                goto L_0x007b
            L_0x0070:
                j14.h r11 = r10.mo85656e()
                if (r11 == 0) goto L_0x0077
                goto L_0x007b
            L_0x0077:
                j14.h r11 = r10.mo85660i(r3)
            L_0x007b:
                return r11
            L_0x007c:
                if (r11 == 0) goto L_0x009f
                j14.n r11 = r10.f172942d
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = j14.C60731n.f172972b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                j14.h r0 = (j14.C60725h) r0
                if (r0 != 0) goto L_0x0091
                j14.h r0 = r11.mo85670d()
            L_0x0091:
                if (r0 != 0) goto L_0x00aa
                j14.a r11 = j14.C60716a.this
                j14.d r11 = r11.f172939i
                java.lang.Object r11 = r11.mo84087d()
                r0 = r11
                j14.h r0 = (j14.C60725h) r0
                goto L_0x00aa
            L_0x009f:
                j14.a r11 = j14.C60716a.this
                j14.d r11 = r11.f172939i
                java.lang.Object r11 = r11.mo84087d()
                r0 = r11
                j14.h r0 = (j14.C60725h) r0
            L_0x00aa:
                if (r0 != 0) goto L_0x00b0
                j14.h r0 = r10.mo85660i(r2)
            L_0x00b0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j14.C60716a.C60717a.mo85652a(boolean):j14.h");
        }

        /* renamed from: b */
        public final int mo85653b() {
            return this.indexInArray;
        }

        /* renamed from: c */
        public final Object mo85654c() {
            return this.nextParkedWorker;
        }

        /* renamed from: d */
        public final int mo85655d(int i) {
            int i2 = this.f172946h;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f172946h = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: e */
        public final C60725h mo85656e() {
            if (mo85655d(2) == 0) {
                C60725h hVar = (C60725h) C60716a.this.f172938h.mo84087d();
                return hVar != null ? hVar : (C60725h) C60716a.this.f172939i.mo84087d();
            }
            C60725h hVar2 = (C60725h) C60716a.this.f172939i.mo84087d();
            return hVar2 != null ? hVar2 : (C60725h) C60716a.this.f172938h.mo84087d();
        }

        /* renamed from: f */
        public final void mo85657f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C60716a.this.f172937g);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: g */
        public final void mo85658g(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: h */
        public final boolean mo85659h(C60718b bVar) {
            C60718b bVar2 = this.f172943e;
            boolean z = bVar2 == C60718b.CPU_ACQUIRED;
            if (z) {
                C60716a.f172931o.addAndGet(C60716a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.f172943e = bVar;
            }
            return z;
        }

        /* renamed from: i */
        public final C60725h mo85660i(boolean z) {
            long j;
            int i = (int) (C60716a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int d = mo85655d(i);
            C60716a aVar = C60716a.this;
            long j2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
            for (int i2 = 0; i2 < i; i2++) {
                d++;
                if (d > i) {
                    d = 1;
                }
                C60717a b = aVar.f172940j.mo84100b(d);
                if (!(b == null || b == this)) {
                    if (z) {
                        j = this.f172942d.mo85671e(b.f172942d);
                    } else {
                        C60731n nVar = this.f172942d;
                        C60731n nVar2 = b.f172942d;
                        nVar.getClass();
                        C60725h d2 = nVar2.mo85670d();
                        if (d2 != null) {
                            nVar.mo85667a(d2, false);
                            j = -1;
                        } else {
                            j = nVar.mo85672f(nVar2, false);
                        }
                    }
                    if (j == -1) {
                        C60731n nVar3 = this.f172942d;
                        nVar3.getClass();
                        C60725h hVar = (C60725h) C60731n.f172972b.getAndSet(nVar3, (Object) null);
                        return hVar == null ? nVar3.mo85670d() : hVar;
                    } else if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                j2 = 0;
            }
            this.f172945g = j2;
            return null;
        }

        public void run() {
            C60718b bVar = C60718b.PARKING;
            C60718b bVar2 = C60718b.TERMINATED;
            loop0:
            while (true) {
                boolean z = false;
                while (!C60716a.this.isTerminated() && this.f172943e != bVar2) {
                    C60725h a = mo85652a(this.f172947i);
                    if (a == null) {
                        this.f172947i = false;
                        if (this.f172945g == 0) {
                            if (this.nextParkedWorker != C60716a.f172933q) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != C60716a.f172933q) || this.workerCtl != -1 || C60716a.this.isTerminated() || this.f172943e == bVar2) {
                                        break;
                                    }
                                    mo85659h(bVar);
                                    Thread.interrupted();
                                    if (this.f172944f == 0) {
                                        this.f172944f = System.nanoTime() + C60716a.this.f172936f;
                                    }
                                    LockSupport.parkNanos(C60716a.this.f172936f);
                                    if (System.nanoTime() - this.f172944f >= 0) {
                                        this.f172944f = 0;
                                        C60716a aVar = C60716a.this;
                                        synchronized (aVar.f172940j) {
                                            if (!aVar.isTerminated()) {
                                                if (((int) (aVar.controlState & 2097151)) > aVar.f172934d) {
                                                    if (f172941n.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        mo85657f(0);
                                                        aVar.mo85646d(this, i, 0);
                                                        int andDecrement = (int) (C60716a.f172931o.getAndDecrement(aVar) & 2097151);
                                                        if (andDecrement != i) {
                                                            C60717a b = aVar.f172940j.mo84100b(andDecrement);
                                                            C87412m.m108591d(b);
                                                            C60717a aVar2 = b;
                                                            aVar.f172940j.mo84101c(i, aVar2);
                                                            aVar2.mo85657f(i);
                                                            aVar.mo85646d(aVar2, andDecrement, i);
                                                        }
                                                        aVar.f172940j.mo84101c(andDecrement, null);
                                                        C13598b0 b0Var = C13598b0.f38549a;
                                                        this.f172943e = bVar2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                C60716a.this.mo85644c(this);
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            mo85659h(bVar);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f172945g);
                            this.f172945g = 0;
                        }
                    } else {
                        this.f172945g = 0;
                        C60718b bVar3 = C60718b.BLOCKING;
                        int b2 = a.f172961e.mo85664b();
                        this.f172944f = 0;
                        if (this.f172943e == bVar) {
                            this.f172943e = bVar3;
                        }
                        if (b2 != 0 && mo85659h(bVar3)) {
                            C60716a aVar3 = C60716a.this;
                            if (!aVar3.mo85650j() && !aVar3.mo85648i(aVar3.controlState)) {
                                aVar3.mo85650j();
                            }
                        }
                        C60716a.this.getClass();
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Throwable th4 = th;
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th4);
                        }
                        if (b2 != 0) {
                            C60716a.f172931o.addAndGet(C60716a.this, -2097152);
                            if (this.f172943e != bVar2) {
                                this.f172943e = C60718b.DORMANT;
                            }
                        }
                    }
                }
            }
            mo85659h(bVar2);
            return;
        }
    }

    /* renamed from: j14.a$b */
    public enum C60718b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C60716a(int i, int i2, long j, String str) {
        this.f172934d = i;
        this.f172935e = i2;
        this.f172936f = j;
        this.f172937g = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f172938h = new C60721d();
                        this.f172939i = new C60721d();
                        this.parkedWorkersStack = 0;
                        this.f172940j = new C58906x<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: a */
    public final int mo85642a() {
        synchronized (this.f172940j) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            boolean z = false;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f172934d) {
                return 0;
            }
            if (i >= this.f172935e) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.f172940j.mo84100b(i3) == null) {
                C60717a aVar = new C60717a(i3);
                this.f172940j.mo84101c(i3, aVar);
                if (i3 == ((int) (2097151 & f172931o.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    aVar.start();
                    int i4 = i2 + 1;
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: b */
    public final void mo85643b(Runnable runnable, C60726i iVar, boolean z) {
        C60725h hVar;
        C60725h hVar2;
        ((C60722e) C60729l.f172968e).getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof C60725h) {
            hVar = (C60725h) runnable;
            hVar.f172960d = nanoTime;
            hVar.f172961e = iVar;
        } else {
            hVar = new C60728k(runnable, nanoTime, iVar);
        }
        Thread currentThread = Thread.currentThread();
        C60717a aVar = null;
        C60717a aVar2 = currentThread instanceof C60717a ? (C60717a) currentThread : null;
        if (aVar2 != null && C87412m.m108589b(C60716a.this, this)) {
            aVar = aVar2;
        }
        boolean z2 = true;
        if (aVar == null || aVar.f172943e == C60718b.TERMINATED || (hVar.f172961e.mo85664b() == 0 && aVar.f172943e == C60718b.BLOCKING)) {
            hVar2 = hVar;
        } else {
            aVar.f172947i = true;
            hVar2 = aVar.f172942d.mo85667a(hVar, z);
        }
        if (hVar2 != null) {
            if (!(hVar2.f172961e.mo85664b() == 1 ? this.f172939i.mo84084a(hVar2) : this.f172938h.mo84084a(hVar2))) {
                throw new RejectedExecutionException(this.f172937g + " was terminated");
            }
        }
        if (!z || aVar == null) {
            z2 = false;
        }
        if (hVar.f172961e.mo85664b() != 0) {
            long addAndGet = f172931o.addAndGet(this, 2097152);
            if (!z2 && !mo85650j() && !mo85648i(addAndGet)) {
                mo85650j();
            }
        } else if (!z2 && !mo85650j() && !mo85648i(this.controlState)) {
            mo85650j();
        }
    }

    /* renamed from: c */
    public final boolean mo85644c(C60717a aVar) {
        long j;
        int b;
        if (aVar.mo85654c() != f172933q) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            b = aVar.mo85653b();
            aVar.mo85658g(this.f172940j.mo84100b((int) (2097151 & j)));
        } while (!f172930n.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) b)));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f172932p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00a9
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof j14.C60716a.C60717a
            r4 = 0
            if (r3 == 0) goto L_0x0018
            j14.a$a r0 = (j14.C60716a.C60717a) r0
            goto L_0x0019
        L_0x0018:
            r0 = r4
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            j14.a r3 = j14.C60716a.this
            boolean r3 = gy3.C87412m.m108589b(r3, r9)
            if (r3 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r4
        L_0x0025:
            f14.x<j14.a$a> r3 = r9.f172940j
            monitor-enter(r3)
            long r5 = r9.controlState     // Catch:{ all -> 0x00bd }
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r6 = (int) r5
            monitor-exit(r3)
            if (r2 > r6) goto L_0x0076
            r3 = 1
        L_0x0033:
            f14.x<j14.a$a> r5 = r9.f172940j
            java.lang.Object r5 = r5.mo84100b(r3)
            gy3.C87412m.m108591d(r5)
            j14.a$a r5 = (j14.C60716a.C60717a) r5
            if (r5 == r0) goto L_0x0071
        L_0x0040:
            boolean r7 = r5.isAlive()
            if (r7 == 0) goto L_0x004f
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r7 = 10000(0x2710, double:4.9407E-320)
            r5.join(r7)
            goto L_0x0040
        L_0x004f:
            j14.n r5 = r5.f172942d
            j14.d r7 = r9.f172939i
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = j14.C60731n.f172972b
            java.lang.Object r8 = r8.getAndSet(r5, r4)
            j14.h r8 = (j14.C60725h) r8
            if (r8 == 0) goto L_0x0063
            r7.mo84084a(r8)
        L_0x0063:
            j14.h r8 = r5.mo85670d()
            if (r8 != 0) goto L_0x006b
            r8 = 0
            goto L_0x006f
        L_0x006b:
            r7.mo84084a(r8)
            r8 = 1
        L_0x006f:
            if (r8 != 0) goto L_0x0063
        L_0x0071:
            if (r3 == r6) goto L_0x0076
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0076:
            j14.d r1 = r9.f172939i
            r1.mo84085b()
            j14.d r1 = r9.f172938h
            r1.mo84085b()
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            j14.h r1 = r0.mo85652a(r2)
            if (r1 != 0) goto L_0x00aa
        L_0x0088:
            j14.d r1 = r9.f172938h
            java.lang.Object r1 = r1.mo84087d()
            j14.h r1 = (j14.C60725h) r1
            if (r1 != 0) goto L_0x00aa
            j14.d r1 = r9.f172939i
            java.lang.Object r1 = r1.mo84087d()
            j14.h r1 = (j14.C60725h) r1
            if (r1 != 0) goto L_0x00aa
            if (r0 == 0) goto L_0x00a3
            j14.a$b r1 = j14.C60716a.C60718b.TERMINATED
            r0.mo85659h(r1)
        L_0x00a3:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L_0x00a9:
            return
        L_0x00aa:
            r1.run()     // Catch:{ all -> 0x00ae }
            goto L_0x0080
        L_0x00ae:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00bb }
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch:{ all -> 0x00bb }
            r4.uncaughtException(r3, r1)     // Catch:{ all -> 0x00bb }
            goto L_0x0080
        L_0x00bb:
            r0 = move-exception
            throw r0
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j14.C60716a.close():void");
    }

    /* renamed from: d */
    public final void mo85646d(C60717a aVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = aVar.mo85654c();
                    while (true) {
                        if (c == f172933q) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            C60717a aVar2 = (C60717a) c;
                            i3 = aVar2.mo85653b();
                            if (i3 != 0) {
                                break;
                            }
                            c = aVar2.mo85654c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f172930n.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public void execute(Runnable runnable) {
        mo85643b(runnable, C60729l.f172969f, false);
    }

    /* renamed from: i */
    public final boolean mo85648i(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f172934d) {
            int a = mo85642a();
            if (a == 1 && this.f172934d > 1) {
                mo85642a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: j */
    public final boolean mo85650j() {
        C58872c0 c0Var;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            C60717a b = this.f172940j.mo84100b((int) (2097151 & j));
            if (b == null) {
                b = null;
            } else {
                long j2 = (2097152 + j) & -2097152;
                Object c = b.mo85654c();
                while (true) {
                    c0Var = f172933q;
                    if (c == c0Var) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        C60717a aVar = (C60717a) c;
                        i = aVar.mo85653b();
                        if (i != 0) {
                            break;
                        }
                        c = aVar.mo85654c();
                    }
                }
                if (i >= 0) {
                    if (f172930n.compareAndSet(this, j, ((long) i) | j2)) {
                        b.mo85658g(c0Var);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (b == null) {
                return false;
            }
            if (C60717a.f172941n.compareAndSet(b, -1, 0)) {
                LockSupport.unpark(b);
                return true;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f172940j.mo84099a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C60717a b = this.f172940j.mo84100b(i6);
            if (b != null) {
                int c = b.f172942d.mo85669c();
                int ordinal = b.f172943e.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(c);
                    sb4.append('b');
                    arrayList.add(sb4.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(c);
                        sb5.append('d');
                        arrayList.add(sb5.toString());
                    }
                } else if (ordinal == 4) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f172937g + '@' + C53942r0.m60572a(this) + "[Pool Size {core = " + this.f172934d + ", max = " + this.f172935e + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f172938h.mo84086c() + ", global blocking queue size = " + this.f172939i.mo84086c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f172934d - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
