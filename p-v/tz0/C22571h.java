package tz0;

import android.content.DialogInterface;
import android.view.MenuItem;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.VipCardListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import nj3.C11184p0;
import nj3.C76879j;
import p447aw.C103918d;

/* renamed from: tz0.h */
public final class C22571h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ VipCardListUI f64902d;

    /* renamed from: tz0.h$a */
    public static final class C22572a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ VipCardListUI f64903d;

        public C22572a(VipCardListUI vipCardListUI) {
            this.f64903d = vipCardListUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125785lI(this.f64903d.getContext(), 564);
        }
    }

    /* renamed from: tz0.h$b */
    public static final class C22573b implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ VipCardListUI f64904a;

        /* renamed from: b */
        public final /* synthetic */ MenuItem f64905b;

        public C22573b(VipCardListUI vipCardListUI, MenuItem menuItem) {
            this.f64904a = vipCardListUI;
            this.f64905b = menuItem;
        }

        public final void onOp(Boolean bool) {
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                VipCardListUI vipCardListUI = this.f64904a;
                MenuItem menuItem = this.f64905b;
                C87412m.m108593f(menuItem, "menuItem");
                VipCardListUI.m19442M7(vipCardListUI, menuItem);
            }
        }
    }

    public C22571h(VipCardListUI vipCardListUI) {
        this.f64902d = vipCardListUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        Log.m105925i(this.f64902d.f52201i, "click item: %s", Integer.valueOf(itemId));
        if (itemId == 1) {
            VipCardListUI vipCardListUI = this.f64902d;
            if (!vipCardListUI.f52075f) {
                C76879j.m92709C(vipCardListUI.getContext(), this.f64902d.getString(C0966R.string.ayo), this.f64902d.getString(C0966R.string.hif), this.f64902d.getString(C0966R.string.fyd), this.f64902d.getString(C0966R.string.bj_), false, new C22572a(this.f64902d), (DialogInterface.OnClickListener) null);
            } else if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.CARD, new C22573b(this.f64902d, menuItem))) {
                VipCardListUI.m19442M7(this.f64902d, menuItem);
            }
        } else {
            VipCardListUI vipCardListUI2 = this.f64902d;
            vipCardListUI2.f52195K = vipCardListUI2.f52194J;
            vipCardListUI2.f52194J = itemId;
            vipCardListUI2.f52193I = menuItem.getTitle().toString();
            this.f64902d.mo23497Q7();
            this.f64902d.mo23494N7(true);
            C115669n.INSTANCE.mo160131h(19747, 1, 6);
        }
    }
}
