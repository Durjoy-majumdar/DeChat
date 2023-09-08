package p34;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l34.C117456i;
import l34.C117459k;
import n34.C117603a;
import t34.C118375m;
import v34.C118644a;
import v34.C118646b;
import v34.C118647c;
import v34.C118649d;

/* renamed from: p34.c */
public final class C117938c extends C117456i {

    /* renamed from: e */
    public final Executor f352502e;

    /* renamed from: p34.c$a */
    public static final class C117939a extends C117456i.C117457a implements Runnable {

        /* renamed from: d */
        public final Executor f352503d;

        /* renamed from: e */
        public final C118646b f352504e = new C118646b();

        /* renamed from: f */
        public final ConcurrentLinkedQueue<C117950i> f352505f = new ConcurrentLinkedQueue<>();

        /* renamed from: g */
        public final AtomicInteger f352506g = new AtomicInteger();

        /* renamed from: h */
        public final ScheduledExecutorService f352507h = C117942d.m166326a();

        /* renamed from: p34.c$a$a */
        public class C117940a implements C117603a {

            /* renamed from: d */
            public final /* synthetic */ C118647c f352508d;

            public C117940a(C118647c cVar) {
                this.f352508d = cVar;
            }

            public void call() {
                C117939a.this.f352504e.mo183372e(this.f352508d);
            }
        }

        /* renamed from: p34.c$a$b */
        public class C117941b implements C117603a {

            /* renamed from: d */
            public final /* synthetic */ C118647c f352510d;

            /* renamed from: e */
            public final /* synthetic */ C117603a f352511e;

            /* renamed from: f */
            public final /* synthetic */ C117459k f352512f;

            public C117941b(C118647c cVar, C117603a aVar, C117459k kVar) {
                this.f352510d = cVar;
                this.f352511e = aVar;
                this.f352512f = kVar;
            }

            public void call() {
                if (!this.f352510d.mo182164c()) {
                    C117459k b = C117939a.this.mo182162b(this.f352511e);
                    this.f352510d.mo183373a(b);
                    if (b.getClass() == C117950i.class) {
                        ((C117950i) b).f352533d.mo182955a(this.f352512f);
                    }
                }
            }
        }

        public C117939a(Executor executor) {
            this.f352503d = executor;
        }

        /* renamed from: b */
        public C117459k mo182162b(C117603a aVar) {
            if (this.f352504e.f355036e) {
                return C118649d.f355040a;
            }
            C117950i iVar = new C117950i(aVar, this.f352504e);
            this.f352504e.mo183370a(iVar);
            this.f352505f.offer(iVar);
            if (this.f352506g.getAndIncrement() == 0) {
                try {
                    this.f352503d.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f352504e.mo183372e(iVar);
                    this.f352506g.decrementAndGet();
                    C118375m.m166985a(e);
                    throw e;
                }
            }
            return iVar;
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352504e.f355036e;
        }

        /* renamed from: d */
        public void mo182165d() {
            this.f352504e.mo182165d();
            this.f352505f.clear();
        }

        /* renamed from: e */
        public C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo182162b(aVar);
            }
            if (this.f352504e.f355036e) {
                return C118649d.f355040a;
            }
            C118647c cVar = new C118647c();
            C118647c cVar2 = new C118647c();
            cVar2.mo183373a(cVar);
            this.f352504e.mo183370a(cVar2);
            C118644a aVar2 = new C118644a(new C117940a(cVar2));
            C117950i iVar = new C117950i(new C117941b(cVar2, aVar, aVar2));
            cVar.mo183373a(iVar);
            try {
                iVar.mo182716a(this.f352507h.schedule(iVar, j, timeUnit));
                return aVar2;
            } catch (RejectedExecutionException e) {
                C118375m.m166985a(e);
                throw e;
            }
        }

        public void run() {
            while (!this.f352504e.f355036e) {
                C117950i poll = this.f352505f.poll();
                if (poll != null) {
                    if (!poll.f352533d.f353197e) {
                        if (!this.f352504e.f355036e) {
                            poll.run();
                        } else {
                            this.f352505f.clear();
                            return;
                        }
                    }
                    if (this.f352506g.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f352505f.clear();
        }
    }

    public C117938c(Executor executor) {
        this.f352502e = executor;
    }

    public C117456i.C117457a createWorker() {
        return new C117939a(this.f352502e);
    }
}
