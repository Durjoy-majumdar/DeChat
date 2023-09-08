package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.k */
public final class C1838k extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1193;
    public static final String NAME = "pushNativeWebView";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String optString = jSONObject != null ? jSONObject.optString("url") : null;
        Boolean valueOf = optString != null ? Boolean.valueOf(C112551y.m153808h(optString, "#wechat_redirect", false, 2, (Object) null)) : null;
        Boolean valueOf2 = jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("disableShareMenu", true)) : null;
        Context context = fVar != null ? fVar.getContext() : null;
        Intent intent = new Intent();
        intent.putExtra("rawUrl", optString);
        intent.putExtra("forceHideShare", valueOf2);
        intent.putExtra("needRedirect", valueOf);
        C13598b0 b0Var = C13598b0.f38549a;
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        Log.m105924i("MicroMsg.JsApiPushNativeWebView", "url: " + optString);
    }
}
