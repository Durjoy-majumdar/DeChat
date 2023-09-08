package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.MenuItem;
import gy3.C87412m;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.j1 */
public final class C19566j1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ QBFileMenuBottomSheetHelper f55376d;

    public C19566j1(QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper) {
        this.f55376d = qBFileMenuBottomSheetHelper;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper = this.f55376d;
        C87412m.m108593f(menuItem, "menuItem");
        QBFileMenuBottomSheetHelper.m20939a(qBFileMenuBottomSheetHelper, menuItem);
        this.f55376d.getClass();
    }
}
