package nw3;

import nw3.C109804j;

/* renamed from: nw3.a0 */
public class C109771a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f328530d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328531e;

    public C109771a0(C109804j jVar, int i) {
        this.f328531e = jVar;
        this.f328530d = i;
    }

    public void run() {
        synchronized (this.f328531e.f328705a) {
            for (C109804j.C109807c f : this.f328531e.f328705a) {
                f.mo161049f(this.f328530d);
            }
        }
    }
}
