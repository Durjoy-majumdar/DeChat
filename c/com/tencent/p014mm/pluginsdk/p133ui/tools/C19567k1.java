package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.MenuItem;
import fy3.C32226l;
import gy3.C87412m;
import nj3.C11184p0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.k1 */
public final class C19567k1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ QBFileMenuBottomSheetHelper f55377d;

    public C19567k1(QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper) {
        this.f55377d = qBFileMenuBottomSheetHelper;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper = this.f55377d;
        C87412m.m108593f(menuItem, "menuItem");
        QBFileMenuBottomSheetHelper.m20939a(qBFileMenuBottomSheetHelper, menuItem);
        C32226l<? super MenuItem, C13598b0> lVar = this.f55377d.f55289h;
        if (lVar != null) {
            lVar.invoke(menuItem);
        }
    }
}
