package zp3;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;

/* renamed from: zp3.c */
public class C16380c implements C16389w {

    /* renamed from: d */
    public final RefreshLoadMoreLayout f43781d;

    public C16380c(RefreshLoadMoreLayout refreshLoadMoreLayout) {
        C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
        this.f43781d = refreshLoadMoreLayout;
    }

    /* renamed from: a */
    public void mo5115a() {
    }

    public void onChanged() {
        this.f43781d.onChanged();
        mo5115a();
    }

    public void onItemRangeChanged(int i, int i2) {
        this.f43781d.onItemRangeChanged(i + 0, i2);
        mo5115a();
    }

    public void onItemRangeInserted(int i, int i2) {
        this.f43781d.onItemRangeInserted(i + 0, i2);
        mo5115a();
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        this.f43781d.onItemRangeMoved(i + 0, i2 + 0, i3);
        mo5115a();
    }

    public void onItemRangeRemoved(int i, int i2) {
        this.f43781d.onItemRangeRemoved(i + 0, i2);
        mo5115a();
    }

    public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f43781d;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.mo82441G(cVar);
        mo5115a();
    }

    public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f43781d.onPreFinishLoadMoreSmooth(cVar);
        mo5115a();
    }

    public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f43781d.onPreFinishRefresh(cVar);
        mo5115a();
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        this.f43781d.onItemRangeChanged(i + 0, i2, obj);
        mo5115a();
    }
}
