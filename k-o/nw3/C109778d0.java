package nw3;

import nw3.C109804j;

/* renamed from: nw3.d0 */
public class C109778d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109804j f328544d;

    public C109778d0(C109804j jVar) {
        this.f328544d = jVar;
    }

    public void run() {
        synchronized (this.f328544d.f328705a) {
            for (C109804j.C109807c v : this.f328544d.f328705a) {
                v.mo161065v();
            }
        }
    }
}
