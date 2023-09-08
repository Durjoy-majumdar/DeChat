package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;

/* renamed from: kf1.ia */
public final class C9802ia implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9720fa f30338d;

    public C9802ia(C9720fa faVar) {
        this.f30338d = faVar;
    }

    public final void run() {
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24947b = -2;
        RefreshLoadMoreLayout c = this.f30338d.mo10325q().mo10293c();
        if (c != null) {
            c.mo82443I(cVar);
        }
    }
}
