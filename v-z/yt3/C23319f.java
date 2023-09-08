package yt3;

import android.util.SparseArray;
import ot3.C21881e;
import tt3.C22553e;

/* renamed from: yt3.f */
public class C23319f {

    /* renamed from: b */
    public static volatile C23319f f67035b;

    /* renamed from: c */
    public static volatile SparseArray<C23317d> f67036c;

    /* renamed from: a */
    public final Object f67037a = new Object();

    /* renamed from: yt3.f$a */
    public class C23320a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C23317d f67038d;

        public C23320a(C23319f fVar, C23317d dVar) {
            this.f67038d = dVar;
        }

        public void run() {
            this.f67038d.mo36805c();
        }
    }

    /* renamed from: yt3.f$b */
    public class C23321b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C23317d f67039d;

        public C23321b(C23319f fVar, C23317d dVar) {
            this.f67039d = dVar;
        }

        public void run() {
            this.f67039d.mo36805c();
        }
    }

    /* renamed from: yt3.f$c */
    public class C23322c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f67040d;

        public C23322c(int i) {
            this.f67040d = i;
        }

        public void run() {
            synchronized (C23319f.this.f67037a) {
                C23317d dVar = C23319f.f67036c.get(this.f67040d);
                if (dVar != null) {
                    dVar.mo36807f();
                }
            }
        }
    }

    /* renamed from: yt3.f$d */
    public class C23323d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f67042d;

        public C23323d(int i) {
            this.f67042d = i;
        }

        public void run() {
            C23317d dVar;
            synchronized (C23319f.this.f67037a) {
                dVar = C23319f.f67036c.get(this.f67042d);
            }
            if (dVar != null && (dVar instanceof C23315a)) {
                C23315a aVar = (C23315a) dVar;
                if (!aVar.isCancelled()) {
                    aVar.mo36800a();
                }
            }
        }
    }

    public C23319f() {
        f67036c = new SparseArray<>(5);
    }

    /* renamed from: c */
    public static C23319f m27817c() {
        C23319f fVar;
        if (f67035b != null) {
            return f67035b;
        }
        synchronized (C23319f.class) {
            if (f67035b == null) {
                f67035b = new C23319f();
            }
            fVar = f67035b;
        }
        return fVar;
    }

    /* renamed from: a */
    public boolean mo36810a(C23317d dVar, C22553e eVar) {
        if (dVar == null) {
            C21881e.m25083b("Soter.SoterTaskManager", "soter: task is null. should not happen", new Object[0]);
            return false;
        } else if (eVar == null) {
            C21881e.m25083b("Soter.SoterTaskManager", "soter: instanceOnError is null. should not happen", new Object[0]);
            return false;
        } else if (!dVar.mo36808g()) {
            int hashCode = dVar.hashCode();
            if (!dVar.mo36806d()) {
                C21881e.m25084c("Soter.SoterTaskManager", "soter: not single instance. directly execute", new Object[0]);
                synchronized (this.f67037a) {
                    f67036c.put(hashCode, dVar);
                }
                C23324g.m27822a().mo36819c(new C23320a(this, dVar));
                return true;
            }
            synchronized (this.f67037a) {
                int i = 0;
                while (i < f67036c.size()) {
                    int keyAt = f67036c.keyAt(i);
                    if (f67036c.get(keyAt) == null || !f67036c.get(keyAt).getClass().getName().equals(dVar.getClass().getName())) {
                        i++;
                    } else {
                        C21881e.m25087f("Soter.SoterTaskManager", "soter: already such type of task. abandon add task", new Object[0]);
                        eVar.f61886a = 1023;
                        eVar.f61887b = "add SOTER task to queue failed. check the logcat for further information";
                        dVar.mo36804b(eVar);
                        return false;
                    }
                }
                f67036c.put(hashCode, dVar);
                C23324g.m27822a().mo36819c(new C23321b(this, dVar));
                return true;
            }
        } else {
            C21881e.m25082a("Soter.SoterTaskManager", "soter: prepare eat execute.", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public void mo36811b() {
        synchronized (this.f67037a) {
            C21881e.m25084c("Soter.SoterTaskManager", "soter: request cancel all", new Object[0]);
            if (f67036c.size() != 0) {
                for (int i = 0; i < f67036c.size(); i++) {
                    C23324g.m27822a().mo36819c(new C23322c(f67036c.keyAt(i)));
                }
            }
            f67036c.clear();
        }
    }

    /* renamed from: d */
    public void mo36812d() {
        synchronized (this.f67037a) {
            C21881e.m25084c("Soter.SoterTaskManager", "soter: request publish cancellation", new Object[0]);
            if (f67036c.size() != 0) {
                for (int i = 0; i < f67036c.size(); i++) {
                    C23324g.m27822a().mo36819c(new C23323d(f67036c.keyAt(i)));
                }
            }
        }
    }

    /* renamed from: e */
    public void mo36813e(C23317d dVar) {
        Object[] objArr = new Object[1];
        objArr[0] = dVar != null ? Integer.valueOf(dVar.hashCode()) : "null";
        C21881e.m25084c("Soter.SoterTaskManager", "soter: removing task: %d", objArr);
        if (dVar == null) {
            C21881e.m25083b("Soter.SoterTaskManager", "soter: task is null", new Object[0]);
            return;
        }
        synchronized (this.f67037a) {
            if (f67036c.get(dVar.hashCode()) == null) {
                C21881e.m25084c("Soter.SoterTaskManager", "soter: no such task: %d. maybe this task did not pass preExecute", Integer.valueOf(dVar.hashCode()));
            } else {
                f67036c.remove(dVar.hashCode());
            }
        }
    }
}
