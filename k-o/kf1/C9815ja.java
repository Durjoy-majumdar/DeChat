package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;

/* renamed from: kf1.ja */
public final class C9815ja implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9720fa f30352d;

    public C9815ja(C9720fa faVar) {
        this.f30352d = faVar;
    }

    public final void run() {
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24947b = -2;
        RefreshLoadMoreLayout c = this.f30352d.mo10325q().mo10293c();
        if (c != null) {
            c.mo82443I(cVar);
        }
    }
}
