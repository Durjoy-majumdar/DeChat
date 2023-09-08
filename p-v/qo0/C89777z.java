package qo0;

import gy3.C87412m;
import qo0.C89741g;

/* renamed from: qo0.z */
public final class C89777z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89750q f258145d;

    public C89777z(C89750q qVar) {
        this.f258145d = qVar;
    }

    public final void run() {
        C89741g gVar = this.f258145d.f258095f;
        if (gVar == null) {
            C87412m.m108603p("selectDeviceBottomSheet");
            throw null;
        } else if (gVar.mo124035d() && gVar.f258054g != null) {
            C89741g.C89742a aVar = gVar.f258057j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            } else {
                C87412m.m108603p("recycleViewAdapter");
                throw null;
            }
        }
    }
}
