package sx2;

import dd0.C116607d;

/* renamed from: sx2.t */
public class C118338t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118339u f353678d;

    public C118338t(C118339u uVar) {
        this.f353678d = uVar;
    }

    public void run() {
        synchronized (this.f353678d.f353679a) {
            for (C116607d d0 : this.f353678d.f353679a) {
                d0.mo176201d0();
            }
        }
    }
}
