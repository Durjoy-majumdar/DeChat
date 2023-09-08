package sx2;

import dd0.C116607d;

/* renamed from: sx2.s */
public class C118337s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118339u f353677d;

    public C118337s(C118339u uVar) {
        this.f353677d = uVar;
    }

    public void run() {
        synchronized (this.f353677d.f353679a) {
            for (C116607d r0 : this.f353677d.f353679a) {
                r0.mo176204r0();
            }
        }
    }
}
