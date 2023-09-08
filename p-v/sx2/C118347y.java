package sx2;

import dd0.C116607d;

/* renamed from: sx2.y */
public class C118347y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118339u f353699d;

    public C118347y(C118339u uVar) {
        this.f353699d = uVar;
    }

    public void run() {
        synchronized (this.f353699d.f353679a) {
            for (C116607d C2 : this.f353699d.f353679a) {
                C2.mo176185C2();
            }
        }
    }
}
