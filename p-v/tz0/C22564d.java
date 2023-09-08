package tz0;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import nj3.C11184p0;
import nj3.C76879j;
import p447aw.C103918d;

/* renamed from: tz0.d */
public final class C22564d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CouponCardListUI f64893d;

    /* renamed from: tz0.d$a */
    public static final class C22565a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CouponCardListUI f64894d;

        public C22565a(CouponCardListUI couponCardListUI) {
            this.f64894d = couponCardListUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125785lI(this.f64894d.getContext(), 564);
        }
    }

    public C22564d(CouponCardListUI couponCardListUI) {
        this.f64893d = couponCardListUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        Log.m105925i(this.f64893d.f52135i, "click item: %s", Integer.valueOf(itemId));
        if (itemId == 1) {
            CouponCardListUI couponCardListUI = this.f64893d;
            if (!couponCardListUI.f52075f) {
                C76879j.m92709C(couponCardListUI.getContext(), this.f64893d.getString(C0966R.string.ayo), this.f64893d.getString(C0966R.string.hif), this.f64893d.getString(C0966R.string.fyd), this.f64893d.getString(C0966R.string.bj_), false, new C22565a(this.f64893d), (DialogInterface.OnClickListener) null);
                return;
            }
            couponCardListUI.f52129F = couponCardListUI.f52128E;
            couponCardListUI.f52128E = 1;
            couponCardListUI.f52127D = menuItem.getTitle().toString();
            this.f64893d.mo23477N7();
            this.f64893d.mo23476M7(true);
            C115669n.INSTANCE.mo160131h(19747, 2, 5);
            return;
        }
        CouponCardListUI couponCardListUI2 = this.f64893d;
        couponCardListUI2.f52129F = couponCardListUI2.f52128E;
        couponCardListUI2.f52128E = itemId;
        couponCardListUI2.f52127D = menuItem.getTitle().toString();
        this.f64893d.mo23477N7();
        this.f64893d.mo23476M7(true);
        C115669n.INSTANCE.mo160131h(19747, 2, 6);
    }
}
