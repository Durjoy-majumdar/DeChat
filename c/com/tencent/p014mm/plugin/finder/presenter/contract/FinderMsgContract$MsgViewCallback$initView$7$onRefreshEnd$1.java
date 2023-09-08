package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$7$onRefreshEnd$1 */
public final class FinderMsgContract$MsgViewCallback$initView$7$onRefreshEnd$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160423d;

    public FinderMsgContract$MsgViewCallback$initView$7$onRefreshEnd$1(FinderMsgContract.MsgViewCallback msgViewCallback) {
        this.f160423d = msgViewCallback;
    }

    public final void run() {
        RecyclerView recyclerView = this.f160423d.f160392i;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(new C54234f());
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }
}
