package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.luggage.sdk.processes.C80249b;
import com.tencent.p014mm.plugin.appbrand.C84258t;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di0.C86297n;
import di0.C86299o;
import es0.C7931z;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.r0 */
public final class C84581r0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Context f246792d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.r0$a */
    public static final class C84582a implements C86297n {
        /* renamed from: a */
        public void mo1541a(int i, String str) {
        }

        public void onSuccess() {
        }
    }

    public C84581r0(C77407n nVar, Context context) {
        this.f246792d = context;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (40 == menuItem.getItemId()) {
            AppBrandProcessesManager.f246131g.mo116962a().mo111405r(C80249b.KILL_TYPE_SILENT);
            return;
        }
        boolean z = false;
        if (30 == menuItem.getItemId()) {
            Context context = this.f246792d;
            Intent intent = new Intent(this.f246792d, AppBrandDebugUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUIForceEntryConfig$showChooseSheet$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUIForceEntryConfig$showChooseSheet$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        String str = null;
        if (20 == menuItem.getItemId()) {
            C84258t tVar = C84258t.f246113a;
            C86299o oVar = new C86299o();
            MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("AppBrandLauncherUIForceEntryConfig");
            C87412m.m108593f(singleMMKV, "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")");
            String string = singleMMKV.getString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", (String) null);
            if (string == null) {
                string = "wxb6d22f922f37b35a";
            }
            oVar.f250930b = string;
            oVar.f250939k = 1112;
            oVar.f250937i = new C7931z(1, (int[]) null);
            tVar.mo116939a(oVar, new C84582a());
            return;
        }
        MultiProcessMMKV singleMMKV2 = MultiProcessMMKV.getSingleMMKV("AppBrandLauncherUIForceEntryConfig");
        C87412m.m108593f(singleMMKV2, "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")");
        singleMMKV2.clearAll();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            MultiProcessMMKV singleMMKV3 = MultiProcessMMKV.getSingleMMKV("AppBrandLauncherUIForceEntryConfig");
            C87412m.m108593f(singleMMKV3, "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")");
            singleMMKV3.putBoolean("KEY_FORCE_NATIVE_LAUNCHER", true);
        } else if (itemId == 1 || itemId == 2 || itemId == 3) {
            MultiProcessMMKV singleMMKV4 = MultiProcessMMKV.getSingleMMKV("AppBrandLauncherUIForceEntryConfig");
            C87412m.m108593f(singleMMKV4, "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")");
            singleMMKV4.putBoolean("KEY_FORCE_WE_USE_FAKE_NATIVE", true);
            MultiProcessMMKV singleMMKV5 = MultiProcessMMKV.getSingleMMKV("AppBrandLauncherUIForceEntryConfig");
            C87412m.m108593f(singleMMKV5, "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")");
            if (itemId == 2) {
                str = "wx6bd2fb149a93a9c5";
            }
            singleMMKV5.putString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", str);
            MultiProcessMMKV singleMMKV6 = MultiProcessMMKV.getSingleMMKV("AppBrandLauncherUIForceEntryConfig");
            C87412m.m108593f(singleMMKV6, "getSingleMMKV(\"AppBrandL…ncherUIForceEntryConfig\")");
            if (itemId == 3) {
                z = true;
            }
            singleMMKV6.putBoolean("KEY_FORCE_FAKE_NATIVE_DEBUG", z);
        }
    }
}
