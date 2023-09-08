package nw3;

import nw3.C109804j;

/* renamed from: nw3.m */
public class C109810m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f328717d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328718e;

    public C109810m(C109804j jVar, int i) {
        this.f328718e = jVar;
        this.f328717d = i;
    }

    public void run() {
        synchronized (this.f328718e.f328705a) {
            for (C109804j.C109807c t : this.f328718e.f328705a) {
                t.mo161063t(this.f328717d);
            }
        }
    }
}
