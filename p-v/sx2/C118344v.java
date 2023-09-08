package sx2;

import dd0.C116607d;

/* renamed from: sx2.v */
public class C118344v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118339u f353693d;

    public C118344v(C118339u uVar) {
        this.f353693d = uVar;
    }

    public void run() {
        synchronized (this.f353693d.f353679a) {
            for (C116607d S5 : this.f353693d.f353679a) {
                S5.mo176199S5();
            }
        }
    }
}
