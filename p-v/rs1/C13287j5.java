package rs1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import zp3.C16389w;

/* renamed from: rs1.j5 */
public final class C13287j5 implements C16389w {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout f37713d;

    /* renamed from: e */
    public final /* synthetic */ C13298k5 f37714e;

    public C13287j5(C13298k5 k5Var) {
        this.f37714e = k5Var;
        this.f37713d = k5Var.mo12750i3();
    }

    public void onChanged() {
        this.f37713d.onChanged();
    }

    public void onItemRangeChanged(int i, int i2) {
        RefreshLoadMoreLayout i3 = this.f37714e.mo12750i3();
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f37714e.f37748r;
        if (wxRecyclerAdapter != null) {
            i3.onItemRangeChanged(i + wxRecyclerAdapter.mo85796c6(), i2);
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public void onItemRangeInserted(int i, int i2) {
        RefreshLoadMoreLayout i3 = this.f37714e.mo12750i3();
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f37714e.f37748r;
        if (wxRecyclerAdapter != null) {
            i3.onItemRangeInserted(i + wxRecyclerAdapter.mo85796c6(), i2);
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        RefreshLoadMoreLayout i35 = this.f37714e.mo12750i3();
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f37714e.f37748r;
        if (wxRecyclerAdapter != null) {
            i35.onItemRangeMoved(i + wxRecyclerAdapter.mo85796c6(), i2, i3);
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public void onItemRangeRemoved(int i, int i2) {
        RefreshLoadMoreLayout i3 = this.f37714e.mo12750i3();
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f37714e.f37748r;
        if (wxRecyclerAdapter != null) {
            i3.onItemRangeRemoved(i + wxRecyclerAdapter.mo85796c6(), i2);
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f37713d.onPreFinishLoadMoreSmooth(cVar);
    }

    public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        RefreshLoadMoreLayout i3 = this.f37714e.mo12750i3();
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f37714e.f37748r;
        if (wxRecyclerAdapter != null) {
            i3.onItemRangeChanged(i + wxRecyclerAdapter.mo85796c6(), i2, obj);
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }
}
