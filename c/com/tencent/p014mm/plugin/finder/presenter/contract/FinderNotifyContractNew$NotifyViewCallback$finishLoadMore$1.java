package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$finishLoadMore$1 */
final class FinderNotifyContractNew$NotifyViewCallback$finishLoadMore$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160560d;

    /* renamed from: e */
    public final /* synthetic */ List<C55011a> f160561e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyViewCallback$finishLoadMore$1(FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, List<? extends C55011a> list) {
        super(0);
        this.f160560d = notifyViewCallback;
        this.f160561e = list;
    }

    public Object invoke() {
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
        List<C55011a> list = this.f160561e;
        cVar.f24952g = false;
        cVar.f24951f = true ^ list.isEmpty();
        cVar.f24953h = list.size();
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f160560d.f160545g;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
        }
        return C13598b0.f38549a;
    }
}
