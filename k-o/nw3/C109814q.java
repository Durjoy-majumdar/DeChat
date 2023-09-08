package nw3;

import nw3.C109804j;

/* renamed from: nw3.q */
public class C109814q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f328725d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328726e;

    public C109814q(C109804j jVar, int i) {
        this.f328726e = jVar;
        this.f328725d = i;
    }

    public void run() {
        synchronized (this.f328726e.f328705a) {
            for (C109804j.C109807c a : this.f328726e.f328705a) {
                a.mo161043a(this.f328725d);
            }
        }
    }
}
