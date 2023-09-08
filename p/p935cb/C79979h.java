package p935cb;

import java.util.LinkedList;

/* renamed from: cb.h */
public class C79979h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79980i f234263d;

    public C79979h(C79980i iVar) {
        this.f234263d = iVar;
    }

    public void run() {
        for (String next : this.f234263d.f234268e) {
            C79973e eVar = this.f234263d.f234266c;
            if (eVar.f234253g) {
                eVar.mo110151b(next);
            } else {
                if (eVar.f234252f == null) {
                    eVar.f234252f = new LinkedList<>();
                }
                eVar.f234252f.add(next);
            }
        }
        ((LinkedList) this.f234263d.f234268e).clear();
    }
}
