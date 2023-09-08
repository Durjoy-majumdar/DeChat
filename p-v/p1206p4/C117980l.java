package p1206p4;

import p1014o4.C117693m;
import p1167z8.C112608f;
import p283z4.C119060c;

/* renamed from: p4.l */
public class C117980l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112608f f352613d;

    /* renamed from: e */
    public final /* synthetic */ C119060c f352614e;

    /* renamed from: f */
    public final /* synthetic */ C117982n f352615f;

    public C117980l(C117982n nVar, C112608f fVar, C119060c cVar) {
        this.f352615f = nVar;
        this.f352613d = fVar;
        this.f352614e = cVar;
    }

    public void run() {
        try {
            this.f352613d.get();
            C117693m.m165966c().mo182389a(C117982n.f352619z, String.format("Starting work for %s", new Object[]{this.f352615f.f352624h.f355543c}), new Throwable[0]);
            C117982n nVar = this.f352615f;
            nVar.f352637x = nVar.f352625i.mo165505e();
            this.f352614e.mo183734k(this.f352615f.f352637x);
        } catch (Throwable th) {
            this.f352614e.mo183733j(th);
        }
    }
}
