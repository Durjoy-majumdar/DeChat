package yt3;

import ot3.C21881e;
import tt3.C22553e;
import tt3.C64998b;

/* renamed from: yt3.d */
public abstract class C23317d {

    /* renamed from: a */
    public C64998b f67031a;

    /* renamed from: b */
    public boolean f67032b = false;

    /* renamed from: yt3.d$a */
    public class C23318a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C22553e f67033d;

        public C23318a(C22553e eVar) {
            this.f67033d = eVar;
        }

        public void run() {
            C23317d dVar = C23317d.this;
            C22553e eVar = this.f67033d;
            C64998b bVar = dVar.f67031a;
            if (bVar != null && !dVar.f67032b) {
                bVar.mo24821a(eVar);
                dVar.f67032b = true;
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo36804b(C22553e eVar) {
        if (this.f67032b) {
            C21881e.m25087f("Soter.BaseSoterTask", "soter: warning: already removed the task!", new Object[0]);
            return;
        }
        mo36802e(eVar);
        C23319f.m27817c().mo36813e(this);
        C23324g.m27822a().mo36818b(new C23318a(eVar));
    }

    /* renamed from: c */
    public abstract void mo36805c();

    /* renamed from: d */
    public abstract boolean mo36806d();

    /* renamed from: e */
    public abstract void mo36802e(C22553e eVar);

    /* renamed from: f */
    public abstract void mo36807f();

    /* renamed from: g */
    public abstract boolean mo36808g();
}
