package p34;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l34.C117456i;
import l34.C117459k;
import n34.C117603a;
import n34.C117605d;
import q34.C118160h;
import q34.C118165m;
import t34.C118372j;
import t34.C118375m;
import v34.C118646b;
import v34.C118649d;

/* renamed from: p34.b */
public final class C117932b extends C117456i implements C117954j {

    /* renamed from: g */
    public static final int f352486g;

    /* renamed from: h */
    public static final C117937c f352487h;

    /* renamed from: i */
    public static final C117936b f352488i = new C117936b((ThreadFactory) null, 0);

    /* renamed from: e */
    public final ThreadFactory f352489e;

    /* renamed from: f */
    public final AtomicReference<C117936b> f352490f = new AtomicReference<>(f352488i);

    /* renamed from: p34.b$a */
    public static final class C117933a extends C117456i.C117457a {

        /* renamed from: d */
        public final C118165m f352491d;

        /* renamed from: e */
        public final C118646b f352492e;

        /* renamed from: f */
        public final C118165m f352493f;

        /* renamed from: g */
        public final C117937c f352494g;

        /* renamed from: p34.b$a$a */
        public class C117934a implements C117603a {

            /* renamed from: d */
            public final /* synthetic */ C117603a f352495d;

            public C117934a(C117603a aVar) {
                this.f352495d = aVar;
            }

            public void call() {
                if (!C117933a.this.f352493f.f353197e) {
                    this.f352495d.call();
                }
            }
        }

        /* renamed from: p34.b$a$b */
        public class C117935b implements C117603a {

            /* renamed from: d */
            public final /* synthetic */ C117603a f352497d;

            public C117935b(C117603a aVar) {
                this.f352497d = aVar;
            }

            public void call() {
                if (!C117933a.this.f352493f.f353197e) {
                    this.f352497d.call();
                }
            }
        }

        public C117933a(C117937c cVar) {
            C118165m mVar = new C118165m();
            this.f352491d = mVar;
            C118646b bVar = new C118646b();
            this.f352492e = bVar;
            this.f352493f = new C118165m(mVar, bVar);
            this.f352494g = cVar;
        }

        /* renamed from: b */
        public C117459k mo182162b(C117603a aVar) {
            if (this.f352493f.f353197e) {
                return C118649d.f355040a;
            }
            C117937c cVar = this.f352494g;
            C117603a aVar2 = new C117934a(aVar);
            C118165m mVar = this.f352491d;
            cVar.getClass();
            C117605d<C117603a, C117603a> dVar = C118375m.f353775g;
            if (dVar != null) {
                aVar2 = (C117603a) ((C118372j) dVar).call(aVar2);
            }
            C117950i iVar = new C117950i(aVar2, mVar);
            mVar.mo182955a(iVar);
            iVar.mo182716a(cVar.f352531d.submit(iVar));
            return iVar;
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352493f.f353197e;
        }

        /* renamed from: d */
        public void mo182165d() {
            this.f352493f.mo182165d();
        }

        /* renamed from: e */
        public C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit) {
            if (this.f352493f.f353197e) {
                return C118649d.f355040a;
            }
            C117937c cVar = this.f352494g;
            C117603a bVar = new C117935b(aVar);
            C118646b bVar2 = this.f352492e;
            cVar.getClass();
            C117605d<C117603a, C117603a> dVar = C118375m.f353775g;
            if (dVar != null) {
                bVar = (C117603a) ((C118372j) dVar).call(bVar);
            }
            C117950i iVar = new C117950i(bVar, bVar2);
            bVar2.mo183370a(iVar);
            iVar.mo182716a(j <= 0 ? cVar.f352531d.submit(iVar) : cVar.f352531d.schedule(iVar, j, timeUnit));
            return iVar;
        }
    }

    /* renamed from: p34.b$b */
    public static final class C117936b {

        /* renamed from: a */
        public final int f352499a;

        /* renamed from: b */
        public final C117937c[] f352500b;

        /* renamed from: c */
        public long f352501c;

        public C117936b(ThreadFactory threadFactory, int i) {
            this.f352499a = i;
            this.f352500b = new C117937c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f352500b[i2] = new C117937c(threadFactory);
            }
        }
    }

    /* renamed from: p34.b$c */
    public static final class C117937c extends C117948h {
        public C117937c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f352486g = intValue;
        C117937c cVar = new C117937c(C118160h.f353190e);
        f352487h = cVar;
        cVar.mo182165d();
    }

    public C117932b(ThreadFactory threadFactory) {
        this.f352489e = threadFactory;
        start();
    }

    public C117456i.C117457a createWorker() {
        C117937c cVar;
        C117936b bVar = this.f352490f.get();
        int i = bVar.f352499a;
        if (i == 0) {
            cVar = f352487h;
        } else {
            C117937c[] cVarArr = bVar.f352500b;
            long j = bVar.f352501c;
            bVar.f352501c = 1 + j;
            cVar = cVarArr[(int) (j % ((long) i))];
        }
        return new C117933a(cVar);
    }

    public void shutdown() {
        C117936b bVar;
        int i;
        boolean z;
        do {
            bVar = this.f352490f.get();
            C117936b bVar2 = f352488i;
            if (bVar != bVar2) {
                AtomicReference<C117936b> atomicReference = this.f352490f;
                while (true) {
                    if (!atomicReference.compareAndSet(bVar, bVar2)) {
                        if (atomicReference.get() != bVar) {
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
                return;
            }
        } while (!z);
        for (C117937c d : bVar.f352500b) {
            d.mo182165d();
        }
    }

    public void start() {
        int i;
        boolean z;
        C117936b bVar = new C117936b(this.f352489e, f352486g);
        AtomicReference<C117936b> atomicReference = this.f352490f;
        C117936b bVar2 = f352488i;
        while (true) {
            if (!atomicReference.compareAndSet(bVar2, bVar)) {
                if (atomicReference.get() != bVar2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            for (C117937c d : bVar.f352500b) {
                d.mo182165d();
            }
        }
    }
}
