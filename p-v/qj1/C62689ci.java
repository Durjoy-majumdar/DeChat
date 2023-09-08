package qj1;

import f50.C58924d;
import g50.C107744b;
import g50.C59363a;
import g50.C59364c;
import h50.C108144a;
import h50.C108147c;

/* renamed from: qj1.ci */
public final class C62689ci implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12786zh f178002d;

    public C62689ci(C12786zh zhVar) {
        this.f178002d = zhVar;
    }

    public final void run() {
        C59363a d;
        C62750di diVar = (C62750di) this.f178002d.mo87687E0(C62750di.class);
        if (diVar != null) {
            diVar.mo10792g(8);
        }
        C63170ze zeVar = (C63170ze) this.f178002d.mo87687E0(C63170ze.class);
        C59364c cVar = null;
        C58924d c1 = zeVar != null ? zeVar.mo88091c1() : null;
        if (c1 instanceof C59364c) {
            cVar = (C59364c) c1;
        }
        if (cVar != null && (d = cVar.mo84474d()) != null) {
            C107744b bVar = (C107744b) d;
            C108144a aVar = bVar.f322448x;
            if (aVar != null) {
                aVar.f323829g = true;
                return;
            }
            C108147c cVar2 = bVar.f322449y;
            if (cVar2 != null) {
                cVar2.f323845a = true;
            }
        }
    }
}
