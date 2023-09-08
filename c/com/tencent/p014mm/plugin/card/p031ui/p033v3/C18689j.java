package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import kz0.C46818j;
import nj3.C11184p0;
import tz0.C22569f;

/* renamed from: com.tencent.mm.plugin.card.ui.v3.j */
public final class C18689j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ VipCardListUI f52258d;

    /* renamed from: e */
    public final /* synthetic */ String f52259e;

    public C18689j(VipCardListUI vipCardListUI, String str) {
        this.f52258d = vipCardListUI;
        this.f52259e = str;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            VipCardListUI vipCardListUI = this.f52258d;
            String str = this.f52259e;
            String str2 = vipCardListUI.f52201i;
            Log.m105924i(str2, "do delete card: " + str);
            vipCardListUI.mo23495O7(Boolean.TRUE);
            new C46818j(str).mo9225i().mo123062e(new C22569f(vipCardListUI, str));
            C115669n.INSTANCE.mo160131h(19747, 1, 4);
        }
    }
}
