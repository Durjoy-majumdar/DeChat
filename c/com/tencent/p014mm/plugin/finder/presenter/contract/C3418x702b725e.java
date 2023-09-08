package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$3 */
final class C3418x702b725e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePurchaseListContract.PurchaseListViewCallback f16083d;

    public C3418x702b725e(FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback) {
        this.f16083d = purchaseListViewCallback;
    }

    public final void run() {
        this.f16083d.f16069b.f16064d.requestRefresh();
    }
}
