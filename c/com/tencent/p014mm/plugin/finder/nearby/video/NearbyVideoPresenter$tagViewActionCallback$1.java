package com.tencent.p014mm.plugin.finder.nearby.video;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import kn1.C10364a;
import kotlin.Metadata;
import zp3.C16389w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u0016\u0010\u0014\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u0016\u0010\u0015\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016¨\u0006\u0016"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter$tagViewActionCallback$1", "Lzp3/w;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "getAdapter", "Lrx3/b0;", "onChanged", "", "positionStart", "itemCount", "onItemRangeChanged", "", "payload", "onItemRangeInserted", "onItemRangeRemoved", "fromPosition", "toPosition", "onItemRangeMoved", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$c;", "reason", "onPreFinishRefresh", "onPreFinishLoadMore", "onPreFinishLoadMoreSmooth", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$tagViewActionCallback$1 */
public final class NearbyVideoPresenter$tagViewActionCallback$1 implements C16389w {
    public final /* synthetic */ NearbyVideoPresenter this$0;

    public NearbyVideoPresenter$tagViewActionCallback$1(NearbyVideoPresenter nearbyVideoPresenter) {
        this.this$0 = nearbyVideoPresenter;
    }

    public final WxRecyclerAdapter<?> getAdapter() {
        RecyclerView.C16613e adapter = this.this$0.getViewCallback().getRecyclerView().getAdapter();
        C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        return (WxRecyclerAdapter) adapter;
    }

    public void onChanged() {
        RefreshLoadMoreLayout c;
        C3343b<C0740i2> viewCallback = this.this$0.getViewCallback();
        if (viewCallback != null && (c = viewCallback.mo3668c()) != null) {
            c.onChanged();
        }
    }

    public void onItemRangeChanged(int i, int i2) {
        RefreshLoadMoreLayout c;
        C3343b<C0740i2> viewCallback = this.this$0.getViewCallback();
        if (viewCallback != null && (c = viewCallback.mo3668c()) != null) {
            WxRecyclerAdapter<?> adapter = getAdapter();
            c.onItemRangeChanged(i + (adapter != null ? adapter.mo85796c6() : 0), i2);
        }
    }

    public void onItemRangeInserted(int i, int i2) {
        RefreshLoadMoreLayout c;
        C3343b<C0740i2> viewCallback = this.this$0.getViewCallback();
        if (viewCallback != null && (c = viewCallback.mo3668c()) != null) {
            WxRecyclerAdapter<?> adapter = getAdapter();
            c.onItemRangeInserted(i + (adapter != null ? adapter.mo85796c6() : 0), i2);
        }
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        RefreshLoadMoreLayout c;
        C3343b<C0740i2> viewCallback = this.this$0.getViewCallback();
        if (viewCallback != null && (c = viewCallback.mo3668c()) != null) {
            WxRecyclerAdapter<?> adapter = getAdapter();
            int i4 = 0;
            int c6 = i + (adapter != null ? adapter.mo85796c6() : 0);
            WxRecyclerAdapter<?> adapter2 = getAdapter();
            if (adapter2 != null) {
                i4 = adapter2.mo85796c6();
            }
            c.onItemRangeMoved(c6, i2 + i4, i3);
        }
    }

    public void onItemRangeRemoved(int i, int i2) {
        RefreshLoadMoreLayout c;
        C3343b<C0740i2> viewCallback = this.this$0.getViewCallback();
        if (viewCallback != null && (c = viewCallback.mo3668c()) != null) {
            WxRecyclerAdapter<?> adapter = getAdapter();
            c.onItemRangeRemoved(i + (adapter != null ? adapter.mo85796c6() : 0), i2);
        }
    }

    public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        RefreshLoadMoreLayout c = this.this$0.getViewCallback().mo3668c();
        c.getClass();
        c.mo82441G(cVar);
    }

    public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.this$0.getViewCallback().mo3668c().onPreFinishLoadMoreSmooth(cVar);
        C10364a access$getNextPagePreload$p = this.this$0.nextPagePreload;
        if (access$getNextPagePreload$p != null) {
            access$getNextPagePreload$p.mo10671a(cVar.f24951f);
        }
    }

    public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.this$0.getViewCallback().mo3668c().onPreFinishRefresh(cVar);
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        RefreshLoadMoreLayout c;
        C3343b<C0740i2> viewCallback = this.this$0.getViewCallback();
        if (viewCallback != null && (c = viewCallback.mo3668c()) != null) {
            WxRecyclerAdapter<?> adapter = getAdapter();
            c.onItemRangeChanged(i + (adapter != null ? adapter.mo85796c6() : 0), i2, obj);
        }
    }
}
