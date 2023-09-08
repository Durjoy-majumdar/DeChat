package com.tencent.p014mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84493c;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84496e;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85028b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import k20.C9556a;
import lp0.C88619a;
import nj3.C76874e0;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.v */
public class C83694v extends C88619a {
    public C83694v() {
        super(10);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        if (!((C85028b) C86312j.m106911c(C85028b.class)).d80()) {
            int i = d1Var.getRuntime().mo113051d0().f261072r.f238585d;
            Set<C84498l> set = C84496e.f246615a;
            e0Var.mo107142f(this.f255896a, context.getString(C0966R.string.f7588kg));
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        String str2;
        C90988l d0 = d1Var.getRuntime().mo113051d0();
        String str3 = d0.f261062e;
        int i = d0.f261072r.f238585d;
        Set<C84498l> set = C84496e.f246615a;
        C83231l.m102146g(str, C83231l.C83235e.HANG);
        String str4 = d0.f261062e;
        int i2 = d0.f261072r.f238585d;
        String str5 = d0.f261061d;
        String str6 = d0.f261063f;
        if (!Util.isNullOrNil(str4)) {
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            Intent addFlags = new Intent().setClassName(context, "com.tencent.mm.ui.LauncherUI").addFlags(268435456).addFlags(67108864).addFlags(536870912);
            Map<String, String> map = C84496e.f246616b;
            synchronized (map) {
                str2 = (String) ((HashMap) map).get(str4);
            }
            String nullAsNil = Util.nullAsNil(str2);
            if (addFlags != null) {
                addFlags.putExtra(C84493c.C84494a.appId.mo117175a(), str4);
                addFlags.putExtra(C84493c.C84494a.versionType.mo117175a(), i2);
                addFlags.putExtra(C84493c.C84494a.appName.mo117175a(), str5);
                addFlags.putExtra(C84493c.C84494a.iconURL.mo117175a(), str6);
                addFlags.putExtra(C84493c.C84494a.customText.mo117175a(), nullAsNil);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(addFlags);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/banner/AppBrandStickyBannerLogic$ClientLogic", "stickOnChatting", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/ui/banner/AppBrandStickyBannerLogic$ClientLogic", "stickOnChatting", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (context instanceof Activity) {
                try {
                    ((Activity) context).moveTaskToBack(false);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandStickyBannerLogic.ClientLogic", "stickOnChatting e = %s", e.getMessage());
                }
            }
        }
        C84240s.m103840f(str, d1Var.mo116162Q0(), 13, "", Util.nowSecond(), 1, 0);
    }
}
