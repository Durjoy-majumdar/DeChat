package p418rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import l34.C117456i;
import l34.C117459k;
import n34.C117603a;
import v34.C118644a;

/* renamed from: rx.schedulers.TestScheduler */
public class TestScheduler extends C117456i {

    /* renamed from: g */
    public static long f353428g;

    /* renamed from: e */
    public final Queue<C118250c> f353429e = new PriorityQueue(11, new C118246a());

    /* renamed from: f */
    public long f353430f;

    /* renamed from: rx.schedulers.TestScheduler$a */
    public static final class C118246a implements Comparator<C118250c> {
        /* JADX WARNING: Removed duplicated region for block: B:6:0x001c A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r9, java.lang.Object r10) {
            /*
                r8 = this;
                rx.schedulers.TestScheduler$c r9 = (p418rx.schedulers.TestScheduler.C118250c) r9
                rx.schedulers.TestScheduler$c r10 = (p418rx.schedulers.TestScheduler.C118250c) r10
                long r0 = r9.f353437a
                long r2 = r10.f353437a
                r4 = 1
                r5 = 0
                r6 = -1
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L_0x001e
                long r0 = r9.f353440d
                long r9 = r10.f353440d
                int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r2 >= 0) goto L_0x0019
            L_0x0017:
                r4 = -1
                goto L_0x0023
            L_0x0019:
                if (r2 <= 0) goto L_0x001c
                goto L_0x0023
            L_0x001c:
                r4 = 0
                goto L_0x0023
            L_0x001e:
                if (r7 >= 0) goto L_0x0021
                goto L_0x0017
            L_0x0021:
                if (r7 <= 0) goto L_0x001c
            L_0x0023:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p418rx.schedulers.TestScheduler.C118246a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$b */
    public final class C118247b extends C117456i.C117457a {

        /* renamed from: d */
        public final C118644a f353431d = new C118644a();

        /* renamed from: rx.schedulers.TestScheduler$b$a */
        public class C118248a implements C117603a {

            /* renamed from: d */
            public final /* synthetic */ C118250c f353433d;

            public C118248a(C118250c cVar) {
                this.f353433d = cVar;
            }

            public void call() {
                ((PriorityQueue) TestScheduler.this.f353429e).remove(this.f353433d);
            }
        }

        /* renamed from: rx.schedulers.TestScheduler$b$b */
        public class C118249b implements C117603a {

            /* renamed from: d */
            public final /* synthetic */ C118250c f353435d;

            public C118249b(C118250c cVar) {
                this.f353435d = cVar;
            }

            public void call() {
                ((PriorityQueue) TestScheduler.this.f353429e).remove(this.f353435d);
            }
        }

        public C118247b() {
        }

        /* renamed from: a */
        public long mo182161a() {
            return TestScheduler.this.now();
        }

        /* renamed from: b */
        public C117459k mo182162b(C117603a aVar) {
            C118250c cVar = new C118250c(this, 0, aVar);
            ((PriorityQueue) TestScheduler.this.f353429e).add(cVar);
            return new C118644a(new C118249b(cVar));
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f353431d.mo182164c();
        }

        /* renamed from: d */
        public void mo182165d() {
            this.f353431d.mo182165d();
        }

        /* renamed from: e */
        public C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit) {
            C118250c cVar = new C118250c(this, TestScheduler.this.f353430f + timeUnit.toNanos(j), aVar);
            ((PriorityQueue) TestScheduler.this.f353429e).add(cVar);
            return new C118644a(new C118248a(cVar));
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$c */
    public static final class C118250c {

        /* renamed from: a */
        public final long f353437a;

        /* renamed from: b */
        public final C117603a f353438b;

        /* renamed from: c */
        public final C117456i.C117457a f353439c;

        /* renamed from: d */
        public final long f353440d;

        public C118250c(C117456i.C117457a aVar, long j, C117603a aVar2) {
            long j2 = TestScheduler.f353428g;
            TestScheduler.f353428g = 1 + j2;
            this.f353440d = j2;
            this.f353437a = j;
            this.f353438b = aVar2;
            this.f353439c = aVar;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", new Object[]{Long.valueOf(this.f353437a), this.f353438b.toString()});
        }
    }

    /* renamed from: a */
    public final void mo183038a(long j) {
        while (!this.f353429e.isEmpty()) {
            C118250c cVar = (C118250c) ((PriorityQueue) this.f353429e).peek();
            long j2 = cVar.f353437a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f353430f;
            }
            this.f353430f = j2;
            this.f353429e.remove();
            if (!cVar.f353439c.mo182164c()) {
                cVar.f353438b.call();
            }
        }
        this.f353430f = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f353430f + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        mo183038a(timeUnit.toNanos(j));
    }

    public C117456i.C117457a createWorker() {
        return new C118247b();
    }

    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.f353430f);
    }

    public void triggerActions() {
        mo183038a(this.f353430f);
    }
}
