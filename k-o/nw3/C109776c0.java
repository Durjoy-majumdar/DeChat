package nw3;

import nw3.C109804j;

/* renamed from: nw3.c0 */
public class C109776c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109804j f328541d;

    public C109776c0(C109804j jVar) {
        this.f328541d = jVar;
    }

    public void run() {
        synchronized (this.f328541d.f328705a) {
            for (C109804j.C109807c e : this.f328541d.f328705a) {
                e.mo161048e();
            }
        }
    }
}
