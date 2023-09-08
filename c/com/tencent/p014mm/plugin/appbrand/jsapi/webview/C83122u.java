package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87981f;
import js0.C88020k;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.u */
public class C83122u extends C87981f<C83928t1> {
    public static final int CTRL_INDEX = 300;
    public static final String NAME = "updateHTMLWebView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("htmlId");
    }

    /* renamed from: G */
    public boolean mo22381E(C83928t1 t1Var, int i, View view, JSONObject jSONObject) {
        if (jSONObject.has("backgroundColor")) {
            try {
                view.setBackgroundColor(C88020k.m109562m(jSONObject.getString("backgroundColor")));
            } catch (Exception unused) {
            }
        }
        String optString = jSONObject.optString("src", "");
        Log.m105925i("MicroMsg.AppBrand.JsApiUpdateHTMLWebView", "onUpdateView appId[%s] viewId[%d] viewHash[%d] src[%s]", t1Var.getAppId(), Integer.valueOf(i), Integer.valueOf(view.hashCode()), optString);
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        ((C40478h) view).getController().mo74061u(optString);
        return true;
    }
}
