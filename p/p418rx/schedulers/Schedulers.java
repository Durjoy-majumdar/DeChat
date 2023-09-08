package p418rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l34.C117456i;
import n34.C117605d;
import p34.C117925a;
import p34.C117932b;
import p34.C117938c;
import p34.C117942d;
import p34.C117944f;
import p34.C117947g;
import p34.C117954j;
import p34.C117964n;
import q34.C118157g;
import q34.C118160h;
import t34.C118375m;
import t34.C118378p;

/* renamed from: rx.schedulers.Schedulers */
public final class Schedulers {

    /* renamed from: d */
    public static final AtomicReference<Schedulers> f353424d = new AtomicReference<>();

    /* renamed from: a */
    public final C117456i f353425a = new C117932b(new C118160h("RxComputationScheduler-"));

    /* renamed from: b */
    public final C117456i f353426b = new C117925a(new C118160h("RxIoScheduler-"));

    /* renamed from: c */
    public final C117456i f353427c = new C117947g(new C118160h("RxNewThreadScheduler-"));

    public Schedulers() {
        C118378p.f353781e.mo183169e().getClass();
    }

    /* renamed from: a */
    public static Schedulers m166800a() {
        boolean z;
        while (true) {
            AtomicReference<Schedulers> atomicReference = f353424d;
            Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, schedulers2)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return schedulers2;
            }
            schedulers2.mo183037b();
        }
    }

    public static C117456i computation() {
        return m166800a().f353425a;
    }

    public static C117456i from(Executor executor) {
        return new C117938c(executor);
    }

    public static C117456i immediate() {
        return C117944f.f352521e;
    }

    /* renamed from: io */
    public static C117456i m166801io() {
        C117456i iVar = m166800a().f353426b;
        C117605d<C117456i, C117456i> dVar = C118375m.f353774f;
        return dVar != null ? dVar.call(iVar) : iVar;
    }

    public static C117456i newThread() {
        return m166800a().f353427c;
    }

    public static void reset() {
        Schedulers andSet = f353424d.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo183037b();
        }
    }

    public static void shutdown() {
        Schedulers a = m166800a();
        a.mo183037b();
        synchronized (a) {
            C117942d.f352516g.shutdown();
            C118157g.f353188f.shutdown();
            C118157g.f353189g.shutdown();
        }
    }

    public static void start() {
        Schedulers a = m166800a();
        synchronized (a) {
            C117456i iVar = a.f353425a;
            if (iVar instanceof C117954j) {
                ((C117954j) iVar).start();
            }
            C117456i iVar2 = a.f353426b;
            if (iVar2 instanceof C117954j) {
                ((C117954j) iVar2).start();
            }
            C117456i iVar3 = a.f353427c;
            if (iVar3 instanceof C117954j) {
                ((C117954j) iVar3).start();
            }
        }
        synchronized (a) {
            C117942d.f352516g.start();
            C118157g.f353188f.start();
            C118157g.f353189g.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static C117456i trampoline() {
        return C117964n.f352559e;
    }

    /* renamed from: b */
    public synchronized void mo183037b() {
        C117456i iVar = this.f353425a;
        if (iVar instanceof C117954j) {
            ((C117954j) iVar).shutdown();
        }
        C117456i iVar2 = this.f353426b;
        if (iVar2 instanceof C117954j) {
            ((C117954j) iVar2).shutdown();
        }
        C117456i iVar3 = this.f353427c;
        if (iVar3 instanceof C117954j) {
            ((C117954j) iVar3).shutdown();
        }
    }
}
