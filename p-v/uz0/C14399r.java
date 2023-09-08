package uz0;

import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: uz0.r */
public final class C14399r implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CouponAndGiftCardListV4UI f39974d;

    /* renamed from: e */
    public final /* synthetic */ C22668a f39975e;

    public C14399r(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI, C22668a aVar) {
        this.f39974d = couponAndGiftCardListV4UI;
        this.f39975e = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f39974d;
        C22668a aVar = this.f39975e;
        int i2 = CouponAndGiftCardListV4UI.f52260s;
        C77407n nVar = new C77407n((Context) couponAndGiftCardListV4UI.getContext(), 1, true);
        TextView textView = new TextView(couponAndGiftCardListV4UI.getContext());
        textView.setText(couponAndGiftCardListV4UI.getString(C0966R.string.ay_));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(couponAndGiftCardListV4UI.getResources().getColor(C0966R.color.f3552xi));
        textView.setGravity(17);
        int dimensionPixelSize = couponAndGiftCardListV4UI.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
        int dimensionPixelSize2 = couponAndGiftCardListV4UI.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        nVar.mo107569n(textView, false);
        nVar.f225771i = new C14400s(couponAndGiftCardListV4UI);
        nVar.f225782p = new C14401t(couponAndGiftCardListV4UI, aVar);
        nVar.mo107573q();
    }
}
