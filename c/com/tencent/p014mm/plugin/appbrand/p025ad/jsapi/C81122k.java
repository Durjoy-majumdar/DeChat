package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import ai0.C79553f;
import ai0.C79570o;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.k */
public class C81122k extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 756;
    public static final String NAME = "showSplashAdMenu";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        boolean optBoolean = jSONObject.optBoolean("showMenu", false);
        String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        String optString2 = jSONObject.optString("icon", "");
        String appId = i2Var.getAppId();
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        C79570o.m96622b(appId).f233268b = optBoolean;
        C79570o.m96622b(i2Var.getAppId()).f233270d = optString;
        C79570o.m96622b(i2Var.getAppId()).f233269c = optString2;
        Log.m105925i("MicroMsg.AppBrand.JsApiShowMenuAd[AppBrandSplashAd]", "showSplashAdMenu, showMenuAd:%s, title:%s, icon:%s", Boolean.valueOf(optBoolean), optString, optString2);
        i2Var.mo109647a(i, mo115109j("ok"));
    }
}
