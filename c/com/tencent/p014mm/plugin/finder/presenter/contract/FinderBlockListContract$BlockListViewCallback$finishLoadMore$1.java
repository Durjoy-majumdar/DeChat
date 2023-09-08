package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0767q;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$finishLoadMore$1 */
public final class FinderBlockListContract$BlockListViewCallback$finishLoadMore$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f15907d;

    /* renamed from: e */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15908e;

    /* renamed from: f */
    public final /* synthetic */ List<C0767q> f15909f;

    /* renamed from: g */
    public final /* synthetic */ C8478d0 f15910g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBlockListContract$BlockListViewCallback$finishLoadMore$1(boolean z, FinderBlockListContract.BlockListViewCallback blockListViewCallback, List<C0767q> list, C8478d0 d0Var) {
        super(0);
        this.f15907d = z;
        this.f15908e = blockListViewCallback;
        this.f15909f = list;
        this.f15910g = d0Var;
    }

    public Object invoke() {
        if (this.f15907d) {
            this.f15908e.f15899d.f15897f.clear();
            this.f15908e.f15899d.f15897f.addAll(this.f15909f);
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15908e.f15903h;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82442H(0);
                RecyclerView recyclerView = this.f15908e.f15902g;
                if (recyclerView != null) {
                    RecyclerView.C16613e adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        } else {
            this.f15908e.f15899d.f15897f.addAll(this.f15909f);
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            List<C0767q> list = this.f15909f;
            cVar.f24952g = false;
            cVar.f24951f = !list.isEmpty();
            cVar.f24953h = list.size();
            RecyclerView recyclerView2 = this.f15908e.f15902g;
            if (recyclerView2 != null) {
                RecyclerView.C16613e adapter2 = recyclerView2.getAdapter();
                if (adapter2 != null) {
                    WxRecyclerAdapter<C0767q> wxRecyclerAdapter = this.f15908e.f15905j;
                    Integer valueOf = wxRecyclerAdapter != null ? Integer.valueOf(wxRecyclerAdapter.mo85796c6() + this.f15910g.f27483d) : null;
                    C87412m.m108591d(valueOf);
                    adapter2.notifyItemRangeInserted(valueOf.intValue(), this.f15909f.size());
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15908e.f15903h;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.onPreFinishLoadMoreSmooth(cVar);
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
        this.f15908e.mo3716D();
        return C13598b0.f38549a;
    }
}
