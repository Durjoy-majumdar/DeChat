package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;

/* renamed from: kf1.z9 */
public final class C10070z9 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9957r9 f30834d;

    public C10070z9(C9957r9 r9Var) {
        this.f30834d = r9Var;
    }

    public final void run() {
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24947b = -2;
        RefreshLoadMoreLayout c = this.f30834d.mo10460t().mo10293c();
        if (c != null) {
            c.mo82443I(cVar);
        }
    }
}
