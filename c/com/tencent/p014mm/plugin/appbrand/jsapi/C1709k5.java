package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ke3.C88144b;
import org.json.JSONObject;
import zd2.C91667a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.k5 */
public class C1709k5 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 406;
    public static final String NAME = "private_openUrl";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Intent intent;
        C82554k kVar = (C82554k) fVar;
        String optString = jSONObject.optString("url");
        if (Util.isNullOrNil(optString)) {
            mo1705x(kVar, i, "fail");
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("isNativeStyle", false);
        if (optBoolean) {
            Intent putExtra = new Intent().putExtra("rawUrl", optString);
            int i2 = AppBrandProcessProxyUI.f240314o;
            intent = putExtra.putExtra("appbrand_report_key_target_url", optString).putExtra("open_custom_style_url", optBoolean).putExtra("forceHideShare", true).putExtra("status_bar_style", "black");
        } else {
            Intent putExtra2 = new Intent().putExtra("rawUrl", optString);
            int i3 = AppBrandProcessProxyUI.f240314o;
            intent = putExtra2.putExtra("appbrand_report_key_target_url", optString);
        }
        intent.putExtra("ad_info", jSONObject.optString("adInfo"));
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        if (optInt > 0) {
            intent.putExtra("geta8key_scene", optInt);
        } else {
            intent.putExtra("geta8key_scene", 75);
        }
        intent.putExtra("geta8key_open_webview_appid", kVar.getAppId());
        if (kVar.getRuntime() instanceof AppBrandRuntimeWC) {
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) kVar.getRuntime();
            String optString2 = jSONObject.optString("adUxInfo", (String) null);
            if (TextUtils.isEmpty(optString2)) {
                if (appBrandRuntimeWC.mo113210l1().f234809M != null) {
                    optString2 = appBrandRuntimeWC.mo113210l1().f234809M.getString("adUxInfo");
                }
                C91667a.m115207c("AppBrandRuntime", "private_openUrl", optString2, "wechatTransitExtraData");
            } else {
                C91667a.m115207c("AppBrandRuntime", "private_openUrl", optString2, "data");
            }
            intent.putExtra(C74928u.C45093i.f122325q, optString2);
        }
        mo1704w(kVar.getContext(), intent, kVar, i);
    }

    /* renamed from: w */
    public void mo1704w(Context context, Intent intent, C82554k kVar, int i) {
        if (context != null) {
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            mo1705x(kVar, i, "ok");
            return;
        }
        mo1705x(kVar, i, "fail");
    }

    /* renamed from: x */
    public final void mo1705x(C82554k kVar, int i, String str) {
        Log.m105921e("MicroMsg.JsApiPrivateOpenUrl", "switchCallback msg:%s", str);
        if (kVar != null) {
            kVar.mo109647a(i, mo115109j(str));
        }
    }
}
