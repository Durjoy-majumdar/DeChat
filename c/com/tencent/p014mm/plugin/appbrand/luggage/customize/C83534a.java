package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.a */
public class C83534a implements C40469j0 {
    /* renamed from: JF */
    public void mo56167JF(Context context, String str, String str2, C40469j0.C40470a aVar) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            Log.m105929w("MicroMsg.AppBrand.CustomizeExternalToolsHelper", "openWebViewActivity with empty url, stack:%s", android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        if (context == null) {
            context = MMApplicationContext.getContext();
        } else {
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
            if (castActivityOrNull != null) {
                context = castActivityOrNull;
            }
        }
        Intent putExtra = new Intent().putExtra("rawUrl", str);
        int i2 = AppBrandProcessProxyUI.f240314o;
        Intent putExtra2 = putExtra.putExtra("appbrand_report_key_target_url", str);
        putExtra2.putExtra("rawUrl", str);
        Log.m105925i("MicroMsg.AppBrand.CustomizeExternalToolsHelper", "orientation:%s", str2);
        if (!Util.isNullOrNil(str2)) {
            if (!str2.equals("landscape")) {
                i = str2.equals("portrait") ? 1 : str2.equals("auto") ? 4 : -1;
            }
            putExtra2.putExtra("screen_orientation", i);
        }
        if (!(context instanceof Activity)) {
            putExtra2.addFlags(268435456);
        }
        if (aVar != null) {
            putExtra2.putExtra("show_native_web_view", aVar.f108757a);
            putExtra2.putExtra("KRightBtn", aVar.f108758b);
            if (aVar.f108759c instanceof C81879g) {
                putExtra2.putExtra("geta8key_scene", 76);
                putExtra2.putExtra("geta8key_open_webview_appid", aVar.f108759c.getAppId());
            }
        }
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", putExtra2, (Bundle) null);
    }
}
