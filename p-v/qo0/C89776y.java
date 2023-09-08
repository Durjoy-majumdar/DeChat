package qo0;

import gy3.C87412m;

/* renamed from: qo0.y */
public final class C89776y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89750q f258144d;

    public C89776y(C89750q qVar) {
        this.f258144d = qVar;
    }

    public final void run() {
        C89741g gVar = this.f258144d.f258095f;
        if (gVar != null) {
            gVar.mo124036e();
        } else {
            C87412m.m108603p("selectDeviceBottomSheet");
            throw null;
        }
    }
}
