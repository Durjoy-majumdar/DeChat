package nw3;

import java.util.List;
import nw3.C109804j;

/* renamed from: nw3.y */
public class C109822y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f328742d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328743e;

    public C109822y(C109804j jVar, List list) {
        this.f328743e = jVar;
        this.f328742d = list;
    }

    public void run() {
        synchronized (this.f328743e.f328705a) {
            for (C109804j.C109807c s : this.f328743e.f328705a) {
                s.mo161062s(this.f328742d);
            }
        }
    }
}
