package nw3;

import nw3.C109804j;

/* renamed from: nw3.x */
public class C109821x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f328740d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328741e;

    public C109821x(C109804j jVar, boolean z) {
        this.f328741e = jVar;
        this.f328740d = z;
    }

    public void run() {
        synchronized (this.f328741e.f328705a) {
            for (C109804j.C109807c l : this.f328741e.f328705a) {
                l.mo161055l(this.f328740d);
            }
        }
    }
}
