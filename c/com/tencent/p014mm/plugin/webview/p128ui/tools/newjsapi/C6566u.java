package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C5852g;
import com.tencent.p014mm.sdk.platformtools.Log;
import d93.C45298c;
import e00.C45520t;
import gy3.C87412m;
import java.util.HashMap;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u */
public final class C6566u extends C15053a {

    /* renamed from: d */
    public static final C6566u f23781d = new C6566u();

    /* renamed from: e */
    public static final int f23782e = JsApiQueryDownloadTask.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23783f = "privateGetContext";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C45298c U;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        HashMap hashMap = new HashMap();
        C45520t c = jVar.mo13183c();
        BaseWebViewController baseWebViewController = c instanceof BaseWebViewController ? (BaseWebViewController) c : null;
        hashMap.put("currentRequestId", Integer.valueOf((baseWebViewController == null || (U = baseWebViewController.mo67698U()) == null) ? 0 : U.f122692i));
        Context context = jVar.f38998a;
        if (context instanceof C5852g) {
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.core.IWebViewJsApiStub");
            int s6 = ((C5852g) context).mo6896s6();
            if (s6 != 0) {
                hashMap.put("lastRequestId", Integer.valueOf(s6));
            }
        }
        Log.m105924i("MicroMsg.JsApiGetContext", "privateGetContext currentRequestId=" + hashMap.get("currentRequestId") + ", lastRequestId=" + hashMap.get("lastRequestId"));
        C13849g gVar = jVar.f39001d;
        String str = h1Var.f38990c;
        gVar.mo10774a(str, h1Var.f38996i + ":ok", hashMap);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23782e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23783f;
    }
}
