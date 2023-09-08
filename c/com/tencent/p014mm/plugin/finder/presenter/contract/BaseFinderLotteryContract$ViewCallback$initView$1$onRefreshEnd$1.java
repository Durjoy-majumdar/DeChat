package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback$initView$1$onRefreshEnd$1 */
public final class BaseFinderLotteryContract$ViewCallback$initView$1$onRefreshEnd$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f15891d;

    public BaseFinderLotteryContract$ViewCallback$initView$1$onRefreshEnd$1(RecyclerView recyclerView) {
        this.f15891d = recyclerView;
    }

    public final void run() {
        this.f15891d.setItemAnimator(new C54234f());
    }
}
