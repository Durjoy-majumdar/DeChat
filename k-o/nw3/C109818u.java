package nw3;

import nw3.C109804j;

/* renamed from: nw3.u */
public class C109818u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109804j f328735d;

    public C109818u(C109804j jVar) {
        this.f328735d = jVar;
    }

    public void run() {
        synchronized (this.f328735d.f328705a) {
            for (C109804j.C109807c r : this.f328735d.f328705a) {
                r.mo161061r();
            }
        }
    }
}
