package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;

/* renamed from: kf1.d9 */
public final class C9689d9 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ C9673c9 f30094a;

    /* renamed from: b */
    public final /* synthetic */ RefreshLoadMoreLayout f30095b;

    public C9689d9(C9673c9 c9Var, RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f30094a = c9Var;
        this.f30095b = refreshLoadMoreLayout;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        C9673c9 c9Var = this.f30094a;
        if (c9Var.f30057p) {
            c9Var.f30050f.mo2589e(true);
            return;
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30095b;
        c9Var.getClass();
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
        cVar.f24952g = false;
        cVar.f24951f = false;
        cVar.f24953h = 0;
        refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C9673c9 c9Var = this.f30094a;
        if (!c9Var.f30057p) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = c9Var.f30053i;
            if (refreshLoadMoreLayout != null) {
                RefreshLoadMoreLayout.m66896C(refreshLoadMoreLayout, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
    }
}
