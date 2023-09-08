package tz0;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;
import te3.C51997xn;
import wz0.C53246b;

/* renamed from: tz0.e */
public final class C22566e implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CouponCardListUI f64895d;

    /* renamed from: e */
    public final /* synthetic */ C51997xn f64896e;

    /* renamed from: tz0.e$a */
    public static final class C22567a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ CouponCardListUI f64897d;

        public C22567a(CouponCardListUI couponCardListUI) {
            this.f64897d = couponCardListUI;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.add(0, 0, 1, (CharSequence) this.f64897d.f52125B);
        }
    }

    /* renamed from: tz0.e$b */
    public static final class C22568b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C51997xn f64898d;

        public C22568b(C51997xn xnVar) {
            this.f64898d = xnVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                C51997xn xnVar = this.f64898d;
                C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                C115669n.INSTANCE.mo160131h(19747, 2, 2);
            }
        }
    }

    public C22566e(CouponCardListUI couponCardListUI, C51997xn xnVar) {
        this.f64895d = couponCardListUI;
        this.f64896e = xnVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f64895d.getContext(), 1, false);
        nVar.f225771i = new C22567a(this.f64895d);
        nVar.f225782p = new C22568b(this.f64896e);
        nVar.mo107573q();
        C115669n.INSTANCE.mo160131h(19747, 2, 1);
        return false;
    }
}
