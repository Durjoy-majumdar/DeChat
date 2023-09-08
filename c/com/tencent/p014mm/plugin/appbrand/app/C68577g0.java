package com.tencent.p014mm.plugin.appbrand.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandDebugUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherFolderUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.C2016q0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84499c0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84581r0;
import com.tencent.p014mm.plugin.profile.p088ui.BizBindWxaInfoUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import es0.C31689g;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import kr0.C76629w0;
import kr0.C76633z0;
import qo3.C77407n;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.app.g0 */
public final class C68577g0 extends C86301e implements C76633z0 {
    /* renamed from: Ay */
    public void mo94226Ay(Context context, String str, String str2, List<WxaAttributes.WxaEntryInfo> list) {
        Intent intent = new Intent(context, BizBindWxaInfoUI.class);
        intent.putParcelableArrayListExtra("extra_wxa_entry_info_list", new ArrayList(list));
        intent.putExtra("extra_username", str);
        intent.putExtra("extra_appid", str2);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openBizWxaEntryInfoUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openBizWxaEntryInfoUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Be0(Context context, int i) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Intent intent = new Intent();
        if (i == 3) {
            intent.putExtra("extra_get_usage_reason", 7);
        } else {
            intent.putExtra("extra_get_usage_reason", 3);
        }
        intent.putExtra("extra_enter_scene", i);
        AppBrandLauncherFolderUI.f246377f.mo56887a(context, intent);
    }

    public boolean Sm0() {
        return C84499c0.m104089c();
    }

    /* renamed from: Wm */
    public boolean mo94229Wm(Context context) {
        if (!C84499c0.m104089c()) {
            return false;
        }
        C87412m.m108594g(context, "context");
        C77407n nVar = new C77407n(context, 1, false);
        nVar.f225771i = C2016q0.f11963d;
        nVar.f225782p = new C84581r0(nVar, context);
        nVar.mo107573q();
        return true;
    }

    /* renamed from: XU */
    public void mo94230XU(Context context, int i, boolean z) {
        if (!z) {
            z = C31689g.m39501b();
        }
        Context context2 = context == null ? MMApplicationContext.getContext() : context;
        Intent addFlags = new Intent(context2, AppBrandLauncherUI.class).putExtra("extra_start_activity_click_timestamp_ms", Util.nowMilliSecond()).putExtra("extra_enter_scene", i).putExtra("extra_show_recommend", z).addFlags(context instanceof Activity ? 0 : 268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(addFlags);
        Context context3 = context2;
        C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openLauncherUI", "(Landroid/content/Context;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context3, "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openLauncherUI", "(Landroid/content/Context;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: eT */
    public void mo94231eT(Context context) {
        Context castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
        Intent intent = new Intent(MMApplicationContext.getContext(), AppBrandDebugUI.class);
        if (castActivityOrNull == null) {
            castActivityOrNull = MMApplicationContext.getContext();
            intent.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = castActivityOrNull;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "startAppBrandDebugUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        castActivityOrNull.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "startAppBrandDebugUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: pz */
    public void mo94232pz(Context context, String str, String str2, String str3, int i, String str4, C76633z0.C10404a aVar) {
        boolean z = true;
        if (!(str2 == null || str2.length() == 0)) {
            str = str2;
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (!z) {
            ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106884tG(str, new C68578p(str, aVar, i, str3, context));
        } else if (aVar != null) {
            aVar.mo5695a(-1, "Invalid username");
        }
    }
}
