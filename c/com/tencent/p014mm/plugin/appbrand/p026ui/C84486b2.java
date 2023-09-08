package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.view.MenuItem;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.b2 */
public class C84486b2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f246590d;

    public C84486b2(AppBrandProfileUI appBrandProfileUI) {
        this.f246590d = appBrandProfileUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        AppBrandProfileUI appBrandProfileUI = this.f246590d;
        C77407n nVar = appBrandProfileUI.f246457p;
        if (nVar == null || !nVar.mo107563h()) {
            C77407n nVar2 = new C77407n((Context) appBrandProfileUI, 1, false);
            appBrandProfileUI.f246457p = nVar2;
            nVar2.f225771i = new C84531g2(appBrandProfileUI);
            nVar2.f225782p = new C84568o1(appBrandProfileUI);
        }
        appBrandProfileUI.f246457p.mo107573q();
        this.f246590d.mo117090L7(27, 1);
        return true;
    }
}
