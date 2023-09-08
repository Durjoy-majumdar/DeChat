package nw3;

import nw3.C109804j;

/* renamed from: nw3.v */
public class C109819v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109804j f328736d;

    public C109819v(C109804j jVar) {
        this.f328736d = jVar;
    }

    public void run() {
        synchronized (this.f328736d.f328705a) {
            for (C109804j.C109807c n : this.f328736d.f328705a) {
                n.mo161057n();
            }
        }
    }
}
