package j24;

import d24.C20419r;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o24.C21754b0;
import o24.C21755c;
import o24.C21760d0;
import o24.C21762e0;
import o24.C21766h;

/* renamed from: j24.q */
public final class C21184q {

    /* renamed from: a */
    public long f59925a = 0;

    /* renamed from: b */
    public long f59926b;

    /* renamed from: c */
    public final int f59927c;

    /* renamed from: d */
    public final C21164g f59928d;

    /* renamed from: e */
    public final Deque<C20419r> f59929e;

    /* renamed from: f */
    public boolean f59930f;

    /* renamed from: g */
    public final C21186b f59931g;

    /* renamed from: h */
    public final C21185a f59932h;

    /* renamed from: i */
    public final C21187c f59933i;

    /* renamed from: j */
    public final C21187c f59934j;

    /* renamed from: k */
    public C21156b f59935k;

    /* renamed from: j24.q$a */
    public final class C21185a implements C21754b0 {

        /* renamed from: d */
        public final C21766h f59936d = new C21766h();

        /* renamed from: e */
        public boolean f59937e;

        /* renamed from: f */
        public boolean f59938f;

        public C21185a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f59934j.mo33152l();
            r11.f59939g.mo33144b();
            r9 = java.lang.Math.min(r11.f59939g.f59926b, r11.f59936d.f61695e);
            r1 = r11.f59939g;
            r1.f59926b -= r9;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33150a(boolean r12) {
            /*
                r11 = this;
                j24.q r0 = j24.C21184q.this
                monitor-enter(r0)
                j24.q r1 = j24.C21184q.this     // Catch:{ all -> 0x007b }
                j24.q$c r1 = r1.f59934j     // Catch:{ all -> 0x007b }
                r1.mo34096h()     // Catch:{ all -> 0x007b }
            L_0x000a:
                j24.q r1 = j24.C21184q.this     // Catch:{ all -> 0x0072 }
                long r2 = r1.f59926b     // Catch:{ all -> 0x0072 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f59938f     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f59937e     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                j24.b r2 = r1.f59935k     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                r1.mo33149g()     // Catch:{ all -> 0x0072 }
                goto L_0x000a
            L_0x0024:
                j24.q$c r1 = r1.f59934j     // Catch:{ all -> 0x007b }
                r1.mo33152l()     // Catch:{ all -> 0x007b }
                j24.q r1 = j24.C21184q.this     // Catch:{ all -> 0x007b }
                r1.mo33144b()     // Catch:{ all -> 0x007b }
                j24.q r1 = j24.C21184q.this     // Catch:{ all -> 0x007b }
                long r1 = r1.f59926b     // Catch:{ all -> 0x007b }
                o24.h r3 = r11.f59936d     // Catch:{ all -> 0x007b }
                long r3 = r3.f61695e     // Catch:{ all -> 0x007b }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007b }
                j24.q r1 = j24.C21184q.this     // Catch:{ all -> 0x007b }
                long r2 = r1.f59926b     // Catch:{ all -> 0x007b }
                long r2 = r2 - r9
                r1.f59926b = r2     // Catch:{ all -> 0x007b }
                monitor-exit(r0)     // Catch:{ all -> 0x007b }
                j24.q$c r0 = r1.f59934j
                r0.mo34096h()
                j24.q r0 = j24.C21184q.this     // Catch:{ all -> 0x0069 }
                j24.g r5 = r0.f59928d     // Catch:{ all -> 0x0069 }
                int r6 = r0.f59927c     // Catch:{ all -> 0x0069 }
                if (r12 == 0) goto L_0x005a
                o24.h r12 = r11.f59936d     // Catch:{ all -> 0x0069 }
                long r0 = r12.f61695e     // Catch:{ all -> 0x0069 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005a
                r12 = 1
                r7 = 1
                goto L_0x005c
            L_0x005a:
                r12 = 0
                r7 = 0
            L_0x005c:
                o24.h r8 = r11.f59936d     // Catch:{ all -> 0x0069 }
                r5.mo33132j(r6, r7, r8, r9)     // Catch:{ all -> 0x0069 }
                j24.q r12 = j24.C21184q.this
                j24.q$c r12 = r12.f59934j
                r12.mo33152l()
                return
            L_0x0069:
                r12 = move-exception
                j24.q r0 = j24.C21184q.this
                j24.q$c r0 = r0.f59934j
                r0.mo33152l()
                throw r12
            L_0x0072:
                r12 = move-exception
                j24.q r1 = j24.C21184q.this     // Catch:{ all -> 0x007b }
                j24.q$c r1 = r1.f59934j     // Catch:{ all -> 0x007b }
                r1.mo33152l()     // Catch:{ all -> 0x007b }
                throw r12     // Catch:{ all -> 0x007b }
            L_0x007b:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007b }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: j24.C21184q.C21185a.mo33150a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r13.f59936d.f61695e <= 0) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            if (r13.f59936d.f61695e <= 0) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            mo33150a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r0.f59928d.mo33132j(r0.f59927c, true, (o24.C21766h) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r1 = r13.f59939g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r13.f59937e = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
            r13.f59939g.f59928d.flush();
            r13.f59939g.mo33143a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
            r0 = r13.f59939g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r0.f59932h.f59938f != false) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r13 = this;
                j24.q r0 = j24.C21184q.this
                monitor-enter(r0)
                boolean r1 = r13.f59937e     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                j24.q r0 = j24.C21184q.this
                j24.q$a r1 = r0.f59932h
                boolean r1 = r1.f59938f
                r2 = 1
                if (r1 != 0) goto L_0x0034
                o24.h r1 = r13.f59936d
                long r3 = r1.f61695e
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0029
            L_0x001d:
                o24.h r0 = r13.f59936d
                long r0 = r0.f61695e
                int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r3 <= 0) goto L_0x0034
                r13.mo33150a(r2)
                goto L_0x001d
            L_0x0029:
                j24.g r7 = r0.f59928d
                int r8 = r0.f59927c
                r9 = 1
                r10 = 0
                r11 = 0
                r7.mo33132j(r8, r9, r10, r11)
            L_0x0034:
                j24.q r1 = j24.C21184q.this
                monitor-enter(r1)
                r13.f59937e = r2     // Catch:{ all -> 0x0047 }
                monitor-exit(r1)     // Catch:{ all -> 0x0047 }
                j24.q r0 = j24.C21184q.this
                j24.g r0 = r0.f59928d
                r0.flush()
                j24.q r0 = j24.C21184q.this
                r0.mo33143a()
                return
            L_0x0047:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0047 }
                throw r0
            L_0x004a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j24.C21184q.C21185a.close():void");
        }

        /* renamed from: f */
        public C21762e0 mo32770f() {
            return C21184q.this.f59934j;
        }

        public void flush() {
            synchronized (C21184q.this) {
                C21184q.this.mo33144b();
            }
            while (this.f59936d.f61695e > 0) {
                mo33150a(false);
                C21184q.this.f59928d.flush();
            }
        }

        /* renamed from: x */
        public void mo32354x(C21766h hVar, long j) {
            this.f59936d.mo32354x(hVar, j);
            while (this.f59936d.f61695e >= 16384) {
                mo33150a(false);
            }
        }
    }

    /* renamed from: j24.q$b */
    public final class C21186b implements C21760d0 {

        /* renamed from: d */
        public final C21766h f59940d = new C21766h();

        /* renamed from: e */
        public final C21766h f59941e = new C21766h();

        /* renamed from: f */
        public final long f59942f;

        /* renamed from: g */
        public boolean f59943g;

        /* renamed from: h */
        public boolean f59944h;

        public C21186b(long j) {
            this.f59942f = j;
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            C21156b bVar;
            long L0;
            if (j >= 0) {
                while (true) {
                    bVar = null;
                    synchronized (C21184q.this) {
                        C21184q.this.f59933i.mo34096h();
                        try {
                            C21184q qVar = C21184q.this;
                            C21156b bVar2 = qVar.f59935k;
                            if (bVar2 != null) {
                                bVar = bVar2;
                            }
                            if (!this.f59943g) {
                                if (!((ArrayDeque) qVar.f59929e).isEmpty()) {
                                    C21184q.this.getClass();
                                }
                                C21766h hVar2 = this.f59941e;
                                long j2 = hVar2.f61695e;
                                if (j2 > 0) {
                                    L0 = hVar2.mo32327L0(hVar, Math.min(j, j2));
                                    C21184q qVar2 = C21184q.this;
                                    long j3 = qVar2.f59925a + L0;
                                    qVar2.f59925a = j3;
                                    if (bVar == null && j3 >= ((long) (qVar2.f59928d.f59872x.mo33163a() / 2))) {
                                        C21184q qVar3 = C21184q.this;
                                        qVar3.f59928d.mo33134l(qVar3.f59927c, qVar3.f59925a);
                                        C21184q.this.f59925a = 0;
                                    }
                                } else if (this.f59944h || bVar != null) {
                                    L0 = -1;
                                } else {
                                    C21184q.this.mo33149g();
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            C21184q.this.f59933i.mo33152l();
                        }
                    }
                }
                C21184q.this.f59933i.mo33152l();
                if (L0 != -1) {
                    C21184q.this.f59928d.mo33131i(L0);
                    return L0;
                } else if (bVar == null) {
                    return -1;
                } else {
                    throw new C21194v(bVar);
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
        }

        public void close() {
            long j;
            synchronized (C21184q.this) {
                this.f59943g = true;
                C21766h hVar = this.f59941e;
                j = hVar.f61695e;
                hVar.skip(j);
                if (!((ArrayDeque) C21184q.this.f59929e).isEmpty()) {
                    C21184q.this.getClass();
                }
                C21184q.this.notifyAll();
            }
            if (j > 0) {
                C21184q.this.f59928d.mo33131i(j);
            }
            C21184q.this.mo33143a();
        }

        /* renamed from: f */
        public C21762e0 mo32328f() {
            return C21184q.this.f59933i;
        }
    }

    /* renamed from: j24.q$c */
    public class C21187c extends C21755c {
        public C21187c() {
        }

        /* renamed from: j */
        public IOException mo33151j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: k */
        public void mo31965k() {
            C21184q qVar = C21184q.this;
            C21156b bVar = C21156b.CANCEL;
            if (qVar.mo33146d(bVar)) {
                qVar.f59928d.mo33133k(qVar.f59927c, bVar);
            }
            C21164g gVar = C21184q.this.f59928d;
            synchronized (gVar) {
                long j = gVar.f59868t;
                long j2 = gVar.f59867s;
                if (j >= j2) {
                    gVar.f59867s = j2 + 1;
                    gVar.f59869u = System.nanoTime() + 1000000000;
                    try {
                        ScheduledExecutorService scheduledExecutorService = gVar.f59862n;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) scheduledExecutorService;
                        scheduledThreadPoolExecutor.execute(new C21173h(gVar, "OkHttp %s ping", gVar.f59858g));
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }

        /* renamed from: l */
        public void mo33152l() {
            if (mo34097i()) {
                throw mo33151j((IOException) null);
            }
        }
    }

    public C21184q(int i, C21164g gVar, boolean z, boolean z2, C20419r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f59929e = arrayDeque;
        this.f59933i = new C21187c();
        this.f59934j = new C21187c();
        this.f59935k = null;
        if (gVar != null) {
            this.f59927c = i;
            this.f59928d = gVar;
            this.f59926b = (long) gVar.f59873y.mo33163a();
            C21186b bVar = new C21186b((long) gVar.f59872x.mo33163a());
            this.f59931g = bVar;
            C21185a aVar = new C21185a();
            this.f59932h = aVar;
            bVar.f59944h = z2;
            aVar.f59938f = z;
            if (rVar != null) {
                arrayDeque.add(rVar);
            }
            if (mo33147e() && rVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo33147e() && rVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: a */
    public void mo33143a() {
        boolean z;
        boolean f;
        synchronized (this) {
            C21186b bVar = this.f59931g;
            if (!bVar.f59944h && bVar.f59943g) {
                C21185a aVar = this.f59932h;
                if (aVar.f59938f || aVar.f59937e) {
                    z = true;
                    f = mo33148f();
                }
            }
            z = false;
            f = mo33148f();
        }
        if (z) {
            mo33145c(C21156b.CANCEL);
        } else if (!f) {
            this.f59928d.mo33128e(this.f59927c);
        }
    }

    /* renamed from: b */
    public void mo33144b() {
        C21185a aVar = this.f59932h;
        if (aVar.f59937e) {
            throw new IOException("stream closed");
        } else if (aVar.f59938f) {
            throw new IOException("stream finished");
        } else if (this.f59935k != null) {
            throw new C21194v(this.f59935k);
        }
    }

    /* renamed from: c */
    public void mo33145c(C21156b bVar) {
        if (mo33146d(bVar)) {
            C21164g gVar = this.f59928d;
            gVar.f59852A.mo33160i(this.f59927c, bVar);
        }
    }

    /* renamed from: d */
    public final boolean mo33146d(C21156b bVar) {
        synchronized (this) {
            if (this.f59935k != null) {
                return false;
            }
            if (this.f59931g.f59944h && this.f59932h.f59938f) {
                return false;
            }
            this.f59935k = bVar;
            notifyAll();
            this.f59928d.mo33128e(this.f59927c);
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo33147e() {
        return this.f59928d.f59855d == ((this.f59927c & 1) == 1);
    }

    /* renamed from: f */
    public synchronized boolean mo33148f() {
        if (this.f59935k != null) {
            return false;
        }
        C21186b bVar = this.f59931g;
        if (bVar.f59944h || bVar.f59943g) {
            C21185a aVar = this.f59932h;
            if ((aVar.f59938f || aVar.f59937e) && this.f59930f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void mo33149g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
