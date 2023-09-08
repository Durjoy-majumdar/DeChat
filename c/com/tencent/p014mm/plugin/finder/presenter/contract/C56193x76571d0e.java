package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.C54234f;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initRefreshLayout$2$1$onRefreshEnd$1 */
public final class C56193x76571d0e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout f160497d;

    public C56193x76571d0e(RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f160497d = refreshLoadMoreLayout;
    }

    public final void run() {
        this.f160497d.getRecyclerView().setItemAnimator(new C54234f());
    }
}
