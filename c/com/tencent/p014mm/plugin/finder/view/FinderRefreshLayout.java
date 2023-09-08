package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import oq3.C21803b;
import zp3.C16389w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout;", "Lcom/tencent/mm/view/refreshLayout/WxRefreshLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout$a;", "H", "Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout$a;", "getReportAction", "()Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout$a;", "setReportAction", "(Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout$a;)V", "reportAction", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderRefreshLayout */
public final class FinderRefreshLayout extends WxRefreshLayout {

    /* renamed from: H */
    public C56568a f162128H;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderRefreshLayout$a */
    public static abstract class C56568a {
        /* renamed from: a */
        public abstract void mo79874a(boolean z);

        /* renamed from: b */
        public abstract void mo79875b();
    }

    public FinderRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final RecyclerView getRecyclerView() {
        C21803b contentView = getContentView();
        return (RecyclerView) (contentView != null ? contentView.getView() : null);
    }

    public final C56568a getReportAction() {
        return this.f162128H;
    }

    public final void setReportAction(C56568a aVar) {
        this.f162128H = aVar;
    }

    /* renamed from: w */
    public void mo26639w() {
        C56568a aVar = this.f162128H;
        if (aVar != null) {
            aVar.mo79875b();
        }
    }

    /* renamed from: x */
    public void mo26640x(boolean z) {
        C56568a aVar = this.f162128H;
        if (aVar != null) {
            aVar.mo79874a(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderRefreshLayout$b */
    public static class C3972b implements C16389w {

        /* renamed from: d */
        public final FinderRefreshLayout f17932d;

        public C3972b(FinderRefreshLayout finderRefreshLayout) {
            C87412m.m108594g(finderRefreshLayout, "rlLayout");
            this.f17932d = finderRefreshLayout;
        }

        /* renamed from: a */
        public int mo3801a() {
            return 0;
        }

        /* renamed from: b */
        public void mo3802b() {
        }

        public void onChanged() {
            RecyclerView.C16613e adapter;
            RecyclerView recyclerView = this.f17932d.getRecyclerView();
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyDataSetChanged();
            }
            mo3802b();
        }

        public void onItemRangeChanged(int i, int i2) {
            RecyclerView.C16613e adapter;
            RecyclerView recyclerView = this.f17932d.getRecyclerView();
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeChanged(i + mo3801a(), i2);
            }
            mo3802b();
        }

        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.C16613e adapter;
            RecyclerView recyclerView = this.f17932d.getRecyclerView();
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeInserted(i + mo3801a(), i2);
            }
            mo3802b();
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.C16613e adapter;
            RecyclerView recyclerView = this.f17932d.getRecyclerView();
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemMoved(i + mo3801a(), i2 + mo3801a());
            }
            mo3802b();
        }

        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.C16613e adapter;
            RecyclerView recyclerView = this.f17932d.getRecyclerView();
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeRemoved(i + mo3801a(), i2);
            }
            mo3802b();
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f17932d.mo26580f(true);
            mo3802b();
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f17932d.mo26580f(true);
            mo3802b();
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            if (cVar.f24953h <= 0) {
                this.f17932d.mo26605m();
            } else {
                this.f17932d.mo26604l(true);
            }
            RecyclerView recyclerView = this.f17932d.getRecyclerView();
            if (recyclerView != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderRefreshLayout$BaseViewActionCallback", "onPreFinishRefresh", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/view/FinderRefreshLayout$BaseViewActionCallback", "onPreFinishRefresh", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
            }
            mo3802b();
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.C16613e adapter;
            RecyclerView recyclerView = this.f17932d.getRecyclerView();
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeChanged(i + mo3801a(), i2, obj);
            }
            mo3802b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(attributeSet, "attrs");
    }
}
