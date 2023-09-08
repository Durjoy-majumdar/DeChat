package o24;

import com.tencent.tav.coremedia.TimeUtil;
import gy3.C8480h;
import gy3.C87412m;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import rx3.C13598b0;

/* renamed from: o24.c */
public class C21755c extends C21762e0 {

    /* renamed from: h */
    public static final long f61677h;

    /* renamed from: i */
    public static final long f61678i;

    /* renamed from: j */
    public static C21755c f61679j;

    /* renamed from: k */
    public static final C21756a f61680k = new C21756a((C8480h) null);

    /* renamed from: e */
    public boolean f61681e;

    /* renamed from: f */
    public C21755c f61682f;

    /* renamed from: g */
    public long f61683g;

    /* renamed from: o24.c$a */
    public static final class C21756a {
        public C21756a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C21755c mo34098a() {
            Class<C21755c> cls = C21755c.class;
            C21755c cVar = C21755c.f61679j;
            C87412m.m108591d(cVar);
            C21755c cVar2 = cVar.f61682f;
            if (cVar2 == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C21755c.f61677h);
                C21755c cVar3 = C21755c.f61679j;
                C87412m.m108591d(cVar3);
                if (cVar3.f61682f != null || System.nanoTime() - nanoTime < C21755c.f61678i) {
                    return null;
                }
                return C21755c.f61679j;
            }
            long nanoTime2 = cVar2.f61683g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j = nanoTime2 / TimeUtil.SECOND_TO_US;
                cls.wait(j, (int) (nanoTime2 - (TimeUtil.SECOND_TO_US * j)));
                return null;
            }
            C21755c cVar4 = C21755c.f61679j;
            C87412m.m108591d(cVar4);
            cVar4.f61682f = cVar2.f61682f;
            cVar2.f61682f = null;
            return cVar2;
        }
    }

    /* renamed from: o24.c$b */
    public static final class C21757b extends Thread {
        public C21757b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0019, code lost:
            r1.mo31965k();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<o24.c> r0 = o24.C21755c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                o24.c$a r1 = o24.C21755c.f61680k     // Catch:{ all -> 0x0012 }
                o24.c r1 = r1.mo34098a()     // Catch:{ all -> 0x0012 }
                o24.c r2 = o24.C21755c.f61679j     // Catch:{ all -> 0x0012 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                o24.C21755c.f61679j = r1     // Catch:{ all -> 0x0012 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                r1 = move-exception
                goto L_0x001d
            L_0x0014:
                rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0012 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo31965k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001d:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: o24.C21755c.C21757b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f61677h = millis;
        f61678i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: h */
    public final void mo34096h() {
        C21755c cVar;
        long j = this.f61692c;
        boolean z = this.f61690a;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0 || z) {
            Class<C21755c> cls = C21755c.class;
            synchronized (cls) {
                if (!this.f61681e) {
                    this.f61681e = true;
                    if (f61679j == null) {
                        f61679j = new C21755c();
                        new C21757b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i != 0 && z) {
                        this.f61683g = Math.min(j, mo34104c() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        this.f61683g = j + nanoTime;
                    } else if (z) {
                        this.f61683g = mo34104c();
                    } else {
                        throw new AssertionError();
                    }
                    long j2 = this.f61683g - nanoTime;
                    C21755c cVar2 = f61679j;
                    C87412m.m108591d(cVar2);
                    while (true) {
                        cVar = cVar2.f61682f;
                        if (cVar == null) {
                            break;
                        } else if (j2 < cVar.f61683g - nanoTime) {
                            break;
                        } else {
                            C87412m.m108591d(cVar);
                            cVar2 = cVar;
                        }
                    }
                    this.f61682f = cVar;
                    cVar2.f61682f = this;
                    if (cVar2 == f61679j) {
                        cls.notify();
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean mo34097i() {
        boolean z;
        synchronized (C21755c.class) {
            z = false;
            if (this.f61681e) {
                this.f61681e = false;
                C21755c cVar = f61679j;
                while (true) {
                    if (cVar == null) {
                        z = true;
                        break;
                    }
                    C21755c cVar2 = cVar.f61682f;
                    if (cVar2 == this) {
                        cVar.f61682f = this.f61682f;
                        this.f61682f = null;
                        break;
                    }
                    cVar = cVar2;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public IOException mo33151j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: k */
    public void mo31965k() {
    }
}
