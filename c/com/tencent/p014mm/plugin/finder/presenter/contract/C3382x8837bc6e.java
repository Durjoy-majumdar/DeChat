package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import gy3.C87412m;
import kotlin.Metadata;
import p902gm.C75979a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$5$onRefreshEnd$1 */
public final class C3382x8837bc6e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15926d;

    public C3382x8837bc6e(FinderBlockListContract.BlockListViewCallback blockListViewCallback) {
        this.f15926d = blockListViewCallback;
    }

    public final void run() {
        RecyclerView recyclerView = this.f15926d.f15902g;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(new C75979a());
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }
}
