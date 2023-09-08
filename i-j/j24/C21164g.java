package j24;

import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import e24.C20508b;
import e24.C20509c;
import e24.C86420d;
import j24.C21181p;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o24.C21767i;
import o24.C21768j;

/* renamed from: j24.g */
public final class C21164g implements Closeable {

    /* renamed from: D */
    public static final ExecutorService f59851D;

    /* renamed from: A */
    public final C21188r f59852A;

    /* renamed from: B */
    public final C21172g f59853B;

    /* renamed from: C */
    public final Set<Integer> f59854C;

    /* renamed from: d */
    public final boolean f59855d;

    /* renamed from: e */
    public final C21169e f59856e;

    /* renamed from: f */
    public final Map<Integer, C21184q> f59857f = new LinkedHashMap();

    /* renamed from: g */
    public final String f59858g;

    /* renamed from: h */
    public int f59859h;

    /* renamed from: i */
    public int f59860i;

    /* renamed from: j */
    public boolean f59861j;

    /* renamed from: n */
    public final ScheduledExecutorService f59862n;

    /* renamed from: o */
    public final ExecutorService f59863o;

    /* renamed from: p */
    public final C21191t f59864p;

    /* renamed from: q */
    public long f59865q = 0;

    /* renamed from: r */
    public long f59866r = 0;

    /* renamed from: s */
    public long f59867s = 0;

    /* renamed from: t */
    public long f59868t = 0;

    /* renamed from: u */
    public long f59869u = 0;

    /* renamed from: v */
    public long f59870v = 0;

    /* renamed from: w */
    public long f59871w;

    /* renamed from: x */
    public C21193u f59872x = new C21193u();

    /* renamed from: y */
    public final C21193u f59873y;

    /* renamed from: z */
    public final Socket f59874z;

    /* renamed from: j24.g$a */
    public class C21165a extends C20508b {

        /* renamed from: e */
        public final /* synthetic */ int f59875e;

        /* renamed from: f */
        public final /* synthetic */ C21156b f59876f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21165a(String str, Object[] objArr, int i, C21156b bVar) {
            super(str, objArr);
            this.f59875e = i;
            this.f59876f = bVar;
        }

        /* renamed from: a */
        public void mo31966a() {
            try {
                C21164g gVar = C21164g.this;
                gVar.f59852A.mo33160i(this.f59875e, this.f59876f);
            } catch (IOException unused) {
                C21164g.this.mo33124b();
            }
        }
    }

    /* renamed from: j24.g$b */
    public class C21166b extends C20508b {

        /* renamed from: e */
        public final /* synthetic */ int f59878e;

        /* renamed from: f */
        public final /* synthetic */ long f59879f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21166b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f59878e = i;
            this.f59879f = j;
        }

        /* renamed from: a */
        public void mo31966a() {
            try {
                C21164g.this.f59852A.mo33161j(this.f59878e, this.f59879f);
            } catch (IOException unused) {
                C21164g.this.mo33124b();
            }
        }
    }

    /* renamed from: j24.g$c */
    public static class C21167c {

        /* renamed from: a */
        public Socket f59881a;

        /* renamed from: b */
        public String f59882b;

        /* renamed from: c */
        public C21768j f59883c;

        /* renamed from: d */
        public C21767i f59884d;

        /* renamed from: e */
        public C21169e f59885e = C21169e.f59888a;

        /* renamed from: f */
        public int f59886f;

        public C21167c(boolean z) {
        }
    }

    /* renamed from: j24.g$d */
    public final class C21168d extends C20508b {
        public C21168d() {
            super("OkHttp %s ping", C21164g.this.f59858g);
        }

        /* renamed from: a */
        public void mo31966a() {
            C21164g gVar;
            boolean z;
            synchronized (C21164g.this) {
                gVar = C21164g.this;
                long j = gVar.f59866r;
                long j2 = gVar.f59865q;
                if (j < j2) {
                    z = true;
                } else {
                    gVar.f59865q = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                gVar.mo33124b();
                return;
            }
            try {
                gVar.f59852A.mo33159g(false, 1, 0);
            } catch (IOException unused) {
                gVar.mo33124b();
            }
        }
    }

    /* renamed from: j24.g$e */
    public static abstract class C21169e {

        /* renamed from: a */
        public static final C21169e f59888a = new C21170a();

        /* renamed from: j24.g$e$a */
        public class C21170a extends C21169e {
            /* renamed from: b */
            public void mo32468b(C21184q qVar) {
                qVar.mo33145c(C21156b.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo32467a(C21164g gVar) {
        }

        /* renamed from: b */
        public abstract void mo32468b(C21184q qVar);
    }

    /* renamed from: j24.g$f */
    public final class C21171f extends C20508b {

        /* renamed from: e */
        public final boolean f59889e;

        /* renamed from: f */
        public final int f59890f;

        /* renamed from: g */
        public final int f59891g;

        public C21171f(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C21164g.this.f59858g, Integer.valueOf(i), Integer.valueOf(i2));
            this.f59889e = z;
            this.f59890f = i;
            this.f59891g = i2;
        }

        /* renamed from: a */
        public void mo31966a() {
            C21164g gVar = C21164g.this;
            boolean z = this.f59889e;
            int i = this.f59890f;
            int i2 = this.f59891g;
            gVar.getClass();
            try {
                gVar.f59852A.mo33159g(z, i, i2);
            } catch (IOException unused) {
                gVar.mo33124b();
            }
        }
    }

    /* renamed from: j24.g$g */
    public class C21172g extends C20508b implements C21181p.C21183b {

        /* renamed from: e */
        public final C21181p f59893e;

        public C21172g(C21181p pVar) {
            super("OkHttp %s", C21164g.this.f59858g);
            this.f59893e = pVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r0 = j24.C21156b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r4.f59894f.mo33123a(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001f */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo31966a() {
            /*
                r4 = this;
                j24.b r0 = j24.C21156b.INTERNAL_ERROR
                j24.p r1 = r4.f59893e     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r1.mo33136c(r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
            L_0x0007:
                j24.p r1 = r4.f59893e     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r2 = 0
                boolean r1 = r1.mo33135b(r2, r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                j24.b r1 = j24.C21156b.NO_ERROR     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                j24.b r0 = j24.C21156b.CANCEL     // Catch:{ IOException -> 0x001f }
                j24.g r2 = j24.C21164g.this     // Catch:{ IOException -> 0x0026 }
                r2.mo33123a(r1, r0)     // Catch:{ IOException -> 0x0026 }
                goto L_0x0026
            L_0x001b:
                r2 = move-exception
                r1 = r0
                goto L_0x002d
            L_0x001e:
                r1 = r0
            L_0x001f:
                j24.b r0 = j24.C21156b.PROTOCOL_ERROR     // Catch:{ all -> 0x002c }
                j24.g r1 = j24.C21164g.this     // Catch:{ IOException -> 0x0026 }
                r1.mo33123a(r0, r0)     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                j24.p r0 = r4.f59893e
                e24.C20509c.m22197c(r0)
                return
            L_0x002c:
                r2 = move-exception
            L_0x002d:
                j24.g r3 = j24.C21164g.this     // Catch:{ IOException -> 0x0032 }
                r3.mo33123a(r1, r0)     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                j24.p r0 = r4.f59893e
                e24.C20509c.m22197c(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: j24.C21164g.C21172g.mo31966a():void");
        }
    }

    static {
        Class<C21164g> cls = C21164g.class;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = C20509c.f57729a;
        f59851D = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new C86420d("OkHttp Http2Connection", true));
    }

    public C21164g(C21167c cVar) {
        C21167c cVar2 = cVar;
        C21193u uVar = new C21193u();
        this.f59873y = uVar;
        this.f59854C = new LinkedHashSet();
        cVar.getClass();
        this.f59864p = C21191t.f59961a;
        this.f59855d = true;
        this.f59856e = cVar2.f59885e;
        this.f59860i = 3;
        this.f59872x.mo33164b(7, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        String str = cVar2.f59882b;
        this.f59858g = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new C86420d(C20509c.m22204j("OkHttp %s Writer", str), false));
        this.f59862n = scheduledThreadPoolExecutor;
        if (cVar2.f59886f != 0) {
            C21168d dVar = new C21168d();
            long j = (long) cVar2.f59886f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j, j, TimeUnit.MILLISECONDS);
        }
        this.f59863o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C86420d(C20509c.m22204j("OkHttp %s Push Observer", str), true));
        uVar.mo33164b(7, 65535);
        uVar.mo33164b(5, 16384);
        this.f59871w = (long) uVar.mo33163a();
        this.f59874z = cVar2.f59881a;
        this.f59852A = new C21188r(cVar2.f59884d, true);
        this.f59853B = new C21172g(new C21181p(cVar2.f59883c, true));
    }

    /* renamed from: a */
    public void mo33123a(C21156b bVar, C21156b bVar2) {
        C21184q[] qVarArr = null;
        try {
            mo33130g(bVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f59857f.isEmpty()) {
                qVarArr = (C21184q[]) ((LinkedHashMap) this.f59857f).values().toArray(new C21184q[this.f59857f.size()]);
                ((LinkedHashMap) this.f59857f).clear();
            }
        }
        if (qVarArr != null) {
            for (C21184q c : qVarArr) {
                try {
                    c.mo33145c(bVar2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f59852A.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f59874z.close();
        } catch (IOException e4) {
            e = e4;
        }
        ((ScheduledThreadPoolExecutor) this.f59862n).shutdown();
        ((ThreadPoolExecutor) this.f59863o).shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo33124b() {
        try {
            C21156b bVar = C21156b.PROTOCOL_ERROR;
            mo33123a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public synchronized C21184q mo33125c(int i) {
        return (C21184q) ((LinkedHashMap) this.f59857f).get(Integer.valueOf(i));
    }

    public void close() {
        mo33123a(C21156b.NO_ERROR, C21156b.CANCEL);
    }

    /* renamed from: d */
    public final synchronized void mo33127d(C20508b bVar) {
        if (!this.f59861j) {
            ((ThreadPoolExecutor) this.f59863o).execute(bVar);
        }
    }

    /* renamed from: e */
    public synchronized C21184q mo33128e(int i) {
        C21184q remove;
        remove = this.f59857f.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public void flush() {
        C21188r rVar = this.f59852A;
        synchronized (rVar) {
            if (!rVar.f59952h) {
                rVar.f59948d.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* renamed from: g */
    public void mo33130g(C21156b bVar) {
        synchronized (this.f59852A) {
            synchronized (this) {
                if (!this.f59861j) {
                    this.f59861j = true;
                    int i = this.f59859h;
                    this.f59852A.mo33157d(i, bVar, C20509c.f57729a);
                }
            }
        }
    }

    /* renamed from: i */
    public synchronized void mo33131i(long j) {
        long j2 = this.f59870v + j;
        this.f59870v = j2;
        if (j2 >= ((long) (this.f59872x.mo33163a() / 2))) {
            mo33134l(0, this.f59870v);
            this.f59870v = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f59852A.f59951g);
        r6 = (long) r3;
        r8.f59871w -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0057 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33132j(int r9, boolean r10, o24.C21766h r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            j24.r r12 = r8.f59852A
            r12.mo33154b(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0066
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f59871w     // Catch:{ InterruptedException -> 0x0057 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            java.util.Map<java.lang.Integer, j24.q> r3 = r8.f59857f     // Catch:{ InterruptedException -> 0x0057 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0057 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0057 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0057 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0057 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0057 }
            throw r9     // Catch:{ InterruptedException -> 0x0057 }
        L_0x0031:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0055 }
            int r4 = (int) r3     // Catch:{ all -> 0x0055 }
            j24.r r3 = r8.f59852A     // Catch:{ all -> 0x0055 }
            int r3 = r3.f59951g     // Catch:{ all -> 0x0055 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0055 }
            long r4 = r8.f59871w     // Catch:{ all -> 0x0055 }
            long r6 = (long) r3     // Catch:{ all -> 0x0055 }
            long r4 = r4 - r6
            r8.f59871w = r4     // Catch:{ all -> 0x0055 }
            monitor-exit(r8)     // Catch:{ all -> 0x0055 }
            long r12 = r12 - r6
            j24.r r4 = r8.f59852A
            if (r10 == 0) goto L_0x0050
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            r4.mo33154b(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0055:
            r9 = move-exception
            goto L_0x0064
        L_0x0057:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0055 }
            r9.interrupt()     // Catch:{ all -> 0x0055 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0055 }
            r9.<init>()     // Catch:{ all -> 0x0055 }
            throw r9     // Catch:{ all -> 0x0055 }
        L_0x0064:
            monitor-exit(r8)     // Catch:{ all -> 0x0055 }
            throw r9
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j24.C21164g.mo33132j(int, boolean, o24.h, long):void");
    }

    /* renamed from: k */
    public void mo33133k(int i, C21156b bVar) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f59862n;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) scheduledExecutorService;
            scheduledThreadPoolExecutor.execute(new C21165a("OkHttp %s stream %d", new Object[]{this.f59858g, Integer.valueOf(i)}, i, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: l */
    public void mo33134l(int i, long j) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f59862n;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) scheduledExecutorService;
            scheduledThreadPoolExecutor.execute(new C21166b("OkHttp Window Update %s stream %d", new Object[]{this.f59858g, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }
}
