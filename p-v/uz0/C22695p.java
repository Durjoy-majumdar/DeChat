package uz0;

import android.graphics.Point;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import uo3.C78253a;
import wz0.C102526o;

/* renamed from: uz0.p */
public final class C22695p implements MRecyclerView.C40584e {

    /* renamed from: a */
    public final /* synthetic */ CouponAndGiftCardListV4UI f65253a;

    public C22695p(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f65253a = couponAndGiftCardListV4UI;
    }

    /* renamed from: a */
    public final boolean mo23457a(RecyclerView recyclerView, View view, int i, long j) {
        int i2;
        CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f65253a;
        C87412m.m108593f(view, "view");
        C22676g gVar = couponAndGiftCardListV4UI.f52265p;
        if (gVar != null) {
            C22668a F4 = gVar.mo35787F4(i);
            if (F4 != null && ((i2 = F4.f65199a) == 1 || i2 == 2)) {
                C78253a aVar = new C78253a(couponAndGiftCardListV4UI.getContext(), view);
                aVar.f229249r = new C14398q(couponAndGiftCardListV4UI);
                aVar.f229251t = new C14399r(couponAndGiftCardListV4UI, F4);
                Point a = C102526o.m135341a(view);
                aVar.mo71743n(a.x, a.y);
                C115669n.INSTANCE.mo160131h(19747, 3, 3);
            }
            return false;
        }
        C87412m.m108603p("mCardsCardListAdapter");
        throw null;
    }
}
