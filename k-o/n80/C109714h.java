package n80;

import u80.C111145g;
import w80.C111742d;

/* renamed from: n80.h */
public final class C109714h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109715i f328395d;

    /* renamed from: e */
    public final /* synthetic */ C111742d.C65942b f328396e;

    public C109714h(C109715i iVar, C111742d.C65942b bVar) {
        this.f328395d = iVar;
        this.f328396e = bVar;
    }

    public final void run() {
        C111145g gVar = this.f328395d.f328404h;
        if (gVar != null) {
            gVar.mo158471l();
        }
        C111742d.f334647a.mo163471q(this.f328396e);
        this.f328395d.f328405i = null;
    }
}
