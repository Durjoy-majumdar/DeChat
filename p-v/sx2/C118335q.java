package sx2;

import dd0.C116607d;

/* renamed from: sx2.q */
public class C118335q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118339u f353675d;

    public C118335q(C118339u uVar) {
        this.f353675d = uVar;
    }

    public void run() {
        synchronized (this.f353675d.f353679a) {
            for (C116607d v1 : this.f353675d.f353679a) {
                v1.mo176205v1();
            }
        }
    }
}
