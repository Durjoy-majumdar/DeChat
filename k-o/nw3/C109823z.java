package nw3;

import nw3.C109804j;

/* renamed from: nw3.z */
public class C109823z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f328744d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328745e;

    public C109823z(C109804j jVar, int i) {
        this.f328745e = jVar;
        this.f328744d = i;
    }

    public void run() {
        synchronized (this.f328745e.f328705a) {
            for (C109804j.C109807c c : this.f328745e.f328705a) {
                c.mo161045c(this.f328744d);
            }
        }
    }
}
