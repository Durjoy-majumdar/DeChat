package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.t */
public class C83121t extends C83122u {
    public static final int CTRL_INDEX = 1165;
    public static final String NAME = "updateGameHTMLWebView";

    /* renamed from: E */
    public /* bridge */ /* synthetic */ boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        mo115361G((C83928t1) hVar, i, view, jSONObject);
        return true;
    }

    /* renamed from: G */
    public boolean mo115361G(C83928t1 t1Var, int i, View view, JSONObject jSONObject) {
        super.mo22381E(t1Var, i, view, jSONObject);
        String optString = jSONObject.optString("evaluateJavascript", "");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        ((C40478h) view).getController().mo74055a(optString);
        return true;
    }
}
