package p964fd;

import in0.C87760d;

/* renamed from: fd.q */
public class C86840q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86826e f252102d;

    public C86840q(C86826e eVar) {
        this.f252102d = eVar;
    }

    public void run() {
        C87760d dVar = this.f252102d.f252033h;
        if (dVar != null && !dVar.isPlaying()) {
            this.f252102d.mo121270E(false, true);
        }
    }
}
