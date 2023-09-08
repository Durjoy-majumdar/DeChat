package nw3;

import nw3.C109804j;

/* renamed from: nw3.e0 */
public class C109781e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109804j f328550d;

    public C109781e0(C109804j jVar) {
        this.f328550d = jVar;
    }

    public void run() {
        synchronized (this.f328550d.f328705a) {
            for (C109804j.C109807c m : this.f328550d.f328705a) {
                m.mo161056m();
            }
        }
    }
}
