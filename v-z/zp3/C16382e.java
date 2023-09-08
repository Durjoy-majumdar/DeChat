package zp3;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;

/* renamed from: zp3.e */
public class C16382e implements C16389w {
    public void onChanged() {
    }

    public void onItemRangeChanged(int i, int i2) {
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
    }

    public void onItemRangeInserted(int i, int i2) {
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
    }

    public void onItemRangeRemoved(int i, int i2) {
    }

    public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }
}
