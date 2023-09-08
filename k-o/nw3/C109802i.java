package nw3;

import nw3.C109804j;

/* renamed from: nw3.i */
public class C109802i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109804j f328704d;

    public C109802i(C109804j jVar) {
        this.f328704d = jVar;
    }

    public void run() {
        synchronized (this.f328704d.f328705a) {
            for (C109804j.C109807c b : this.f328704d.f328705a) {
                b.mo161044b();
            }
        }
    }
}
