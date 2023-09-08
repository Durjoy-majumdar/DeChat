package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lcm1/i2;", "resp", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$3 */
public final class FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$3 extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePurchaseListContract.PurchaseListPresenter f16077d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$3(FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter) {
        super(1);
        this.f16077d = purchaseListPresenter;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, "resp");
        this.f16077d.f16067g = iResponse.getHasMore() ? 1 : 0;
        if (!iResponse.getHasMore()) {
            this.f16077d.mo3755n().f16071d.setEnableRefresh(false);
            this.f16077d.mo3755n().f16071d.setEnableLoadMore(false);
        }
        FinderLivePurchaseListContract.PurchaseListViewCallback n = this.f16077d.mo3755n();
        int i = ((FinderLivePurchaseContentListLoader.C3151b) iResponse).f15077a;
        if (i > 0) {
            MMActivity mMActivity = n.f16068a;
            mMActivity.setMMTitle(mMActivity.getResources().getString(C0966R.string.mrg, new Object[]{Integer.valueOf(i)}));
        } else {
            n.f16068a.setMMTitle((int) C0966R.string.mrf);
        }
        this.f16077d.mo3755n().mo3757a(false);
        if (this.f16077d.mo3754e().mo82597F4() == 0 && this.f16077d.f16064d.getDataListJustForAdapter().size() == 0) {
            FinderLivePurchaseListContract.PurchaseListViewCallback n2 = this.f16077d.mo3755n();
            n2.mo3757a(false);
            n2.f16074g.setVisibility(0);
        }
        this.f16077d.mo3754e().notifyDataSetChanged();
        return C13598b0.f38549a;
    }
}
