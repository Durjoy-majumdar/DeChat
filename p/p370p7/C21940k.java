package p370p7;

import java.io.IOException;

/* renamed from: p7.k */
public class C21940k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IOException f62102d;

    /* renamed from: e */
    public final /* synthetic */ C21933j f62103e;

    public C21940k(C21933j jVar, IOException iOException) {
        this.f62103e = jVar;
        this.f62102d = iOException;
    }

    public void run() {
        this.f62103e.f62069h.onLoadError(this.f62102d);
    }
}
