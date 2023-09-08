package sx2;

import dd0.C116607d;

/* renamed from: sx2.r */
public class C118336r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118339u f353676d;

    public C118336r(C118339u uVar) {
        this.f353676d = uVar;
    }

    public void run() {
        synchronized (this.f353676d.f353679a) {
            for (C116607d F5 : this.f353676d.f353679a) {
                F5.mo176186F5();
            }
        }
    }
}
