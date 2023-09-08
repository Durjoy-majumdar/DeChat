package nw3;

import nw3.C109804j;

/* renamed from: nw3.t */
public class C109817t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f328733d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328734e;

    public C109817t(C109804j jVar, int i) {
        this.f328734e = jVar;
        this.f328733d = i;
    }

    public void run() {
        synchronized (this.f328734e.f328705a) {
            for (C109804j.C109807c k : this.f328734e.f328705a) {
                k.mo161054k(this.f328733d);
            }
        }
    }
}
