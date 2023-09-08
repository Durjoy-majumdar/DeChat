package uz0;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import gy3.C87412m;

/* renamed from: uz0.n */
public final class C22693n implements LoadMoreRecyclerView.C40579c {

    /* renamed from: a */
    public final /* synthetic */ CouponAndGiftCardListV4UI f65251a;

    public C22693n(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f65251a = couponAndGiftCardListV4UI;
    }

    /* renamed from: a */
    public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
        CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f65251a;
        C22699v vVar = couponAndGiftCardListV4UI.f52264o;
        if (vVar != null) {
            vVar.mo35793f3(couponAndGiftCardListV4UI);
        } else {
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }
}
