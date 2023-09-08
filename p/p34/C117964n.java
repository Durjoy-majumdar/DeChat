package p34;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l34.C117456i;
import l34.C117459k;
import n34.C117603a;
import v34.C118644a;
import v34.C118649d;

/* renamed from: p34.n */
public final class C117964n extends C117456i {

    /* renamed from: e */
    public static final C117964n f352559e = new C117964n();

    /* renamed from: p34.n$a */
    public static final class C117965a extends C117456i.C117457a {

        /* renamed from: d */
        public final AtomicInteger f352560d = new AtomicInteger();

        /* renamed from: e */
        public final PriorityBlockingQueue<C117967b> f352561e = new PriorityBlockingQueue<>();

        /* renamed from: f */
        public final C118644a f352562f = new C118644a();

        /* renamed from: g */
        public final AtomicInteger f352563g = new AtomicInteger();

        /* renamed from: p34.n$a$a */
        public class C117966a implements C117603a {

            /* renamed from: d */
            public final /* synthetic */ C117967b f352564d;

            public C117966a(C117967b bVar) {
                this.f352564d = bVar;
            }

            public void call() {
                C117965a.this.f352561e.remove(this.f352564d);
            }
        }

        /* renamed from: b */
        public C117459k mo182162b(C117603a aVar) {
            return mo182719f(aVar, System.currentTimeMillis());
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352562f.mo182164c();
        }

        /* renamed from: d */
        public void mo182165d() {
            this.f352562f.mo182165d();
        }

        /* renamed from: e */
        public C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit) {
            long currentTimeMillis = System.currentTimeMillis() + timeUnit.toMillis(j);
            return mo182719f(new C117963m(aVar, this, currentTimeMillis), currentTimeMillis);
        }

        /* renamed from: f */
        public final C117459k mo182719f(C117603a aVar, long j) {
            if (this.f352562f.mo182164c()) {
                return C118649d.f355040a;
            }
            C117967b bVar = new C117967b(aVar, Long.valueOf(j), this.f352560d.incrementAndGet());
            this.f352561e.add(bVar);
            if (this.f352563g.getAndIncrement() != 0) {
                return new C118644a(new C117966a(bVar));
            }
            do {
                C117967b poll = this.f352561e.poll();
                if (poll != null) {
                    poll.f352566d.call();
                }
            } while (this.f352563g.decrementAndGet() > 0);
            return C118649d.f355040a;
        }
    }

    /* renamed from: p34.n$b */
    public static final class C117967b implements Comparable<C117967b> {

        /* renamed from: d */
        public final C117603a f352566d;

        /* renamed from: e */
        public final Long f352567e;

        /* renamed from: f */
        public final int f352568f;

        public C117967b(C117603a aVar, Long l, int i) {
            this.f352566d = aVar;
            this.f352567e = l;
            this.f352568f = i;
        }

        public int compareTo(Object obj) {
            C117967b bVar = (C117967b) obj;
            int compareTo = this.f352567e.compareTo(bVar.f352567e);
            if (compareTo != 0) {
                return compareTo;
            }
            int i = this.f352568f;
            int i2 = bVar.f352568f;
            C117964n nVar = C117964n.f352559e;
            if (i < i2) {
                return -1;
            }
            return i == i2 ? 0 : 1;
        }
    }

    public C117456i.C117457a createWorker() {
        return new C117965a();
    }
}
