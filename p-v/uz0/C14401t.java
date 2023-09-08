package uz0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import gy3.C87412m;
import nj3.C11184p0;

/* renamed from: uz0.t */
public final class C14401t implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CouponAndGiftCardListV4UI f39977d;

    /* renamed from: e */
    public final /* synthetic */ C22668a f39978e;

    public C14401t(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI, C22668a aVar) {
        this.f39977d = couponAndGiftCardListV4UI;
        this.f39978e = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            C22699v vVar = this.f39977d.f52264o;
            if (vVar != null) {
                vVar.mo35792e3(this.f39978e);
            } else {
                C87412m.m108603p("mViewModel");
                throw null;
            }
        }
    }
}
