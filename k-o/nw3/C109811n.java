package nw3;

import nw3.C109804j;

/* renamed from: nw3.n */
public class C109811n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109804j f328719d;

    public C109811n(C109804j jVar) {
        this.f328719d = jVar;
    }

    public void run() {
        synchronized (this.f328719d.f328705a) {
            for (C109804j.C109807c d0 : this.f328719d.f328705a) {
                d0.mo161047d0();
            }
        }
    }
}
