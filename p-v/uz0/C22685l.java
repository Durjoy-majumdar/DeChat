package uz0;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import gy3.C87412m;
import wz0.C22945n;

/* renamed from: uz0.l */
public final class C22685l<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ CouponAndGiftCardListV4UI f65236d;

    public C22685l(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f65236d = couponAndGiftCardListV4UI;
    }

    public void onChanged(Object obj) {
        C22707x xVar = (C22707x) obj;
        CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f65236d;
        int i = CouponAndGiftCardListV4UI.f52260s;
        couponAndGiftCardListV4UI.getClass();
        if (xVar != null) {
            int ordinal = xVar.ordinal();
            boolean z = true;
            if (ordinal == 3) {
                LoadMoreRecyclerView loadMoreRecyclerView = couponAndGiftCardListV4UI.f52262j;
                if (loadMoreRecyclerView != null) {
                    loadMoreRecyclerView.mo63430I(true);
                } else {
                    C87412m.m108603p("mCouponCardListRv");
                    throw null;
                }
            } else if (ordinal == 4) {
                LoadMoreRecyclerView loadMoreRecyclerView2 = couponAndGiftCardListV4UI.f52262j;
                if (loadMoreRecyclerView2 != null) {
                    loadMoreRecyclerView2.mo63430I(false);
                } else {
                    C87412m.m108603p("mCouponCardListRv");
                    throw null;
                }
            } else if (ordinal == 5) {
                String str = xVar.f65286d;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    C22945n.m27017q(couponAndGiftCardListV4UI.getContext(), "");
                } else {
                    C22945n.m27018r(couponAndGiftCardListV4UI.getContext(), xVar.f65286d);
                }
            }
        }
    }
}
