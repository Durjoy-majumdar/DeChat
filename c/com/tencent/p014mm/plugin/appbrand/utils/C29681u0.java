package com.tencent.p014mm.plugin.appbrand.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherFolderUI;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import k20.C9556a;
import kr0.C34012r0;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.utils.u0 */
public class C29681u0 extends C86301e implements C34012r0 {
    /* renamed from: Nx */
    public void mo56898Nx(Context context, String str) {
        Intent intent = new Intent(context, AppBrandLauncherFolderUI.class);
        intent.putExtra(MMFragmentActivity.EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, true);
        intent.putExtra("extra_enter_scene", 4);
        intent.putExtra("extra_enter_scene_note", str);
        intent.putExtra("KEY_MODE", 2);
        intent.addFlags(context instanceof Activity ? 0 : 268435456);
        intent.addFlags(536870912);
        intent.addFlags(134217728);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaMyFavorite", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaMyFavorite", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: dn */
    public void mo56899dn(Context context, int i, String str) {
        int i2 = 14;
        if (1 == i) {
            i2 = 15;
        } else if (!(2 == i || i == 0)) {
            i2 = -1;
        }
        Intent intent = new Intent(context, AppBrandLauncherFolderUI.class);
        intent.putExtra(MMFragmentActivity.EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, true);
        intent.putExtra("extra_enter_scene", i2);
        intent.putExtra("extra_enter_scene_note", str);
        intent.putExtra("KEY_MODE", 1);
        intent.addFlags(context instanceof Activity ? 0 : 268435456);
        intent.addFlags(536870912);
        intent.addFlags(134217728);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaDesktop", "(Landroid/content/Context;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaDesktop", "(Landroid/content/Context;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
