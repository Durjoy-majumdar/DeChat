package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44044l2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import sl0.C90220f;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k */
public final class C6502k extends C15053a {

    /* renamed from: d */
    public static final C6502k f23612d = new C6502k();

    /* renamed from: e */
    public static final String f23613e = "MicroMsg.JsApiCurrentMpInfoShow";

    /* renamed from: f */
    public static final int f23614f = C90220f.CTRL_INDEX;

    /* renamed from: g */
    public static final String f23615g = "currentMpInfoShow";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Context context = jVar.f38998a;
        if (context instanceof WebViewUI) {
            WebViewUI webViewUI = (WebViewUI) context;
            if (webViewUI.f118477N1 != null) {
                Bundle bundle = new Bundle();
                String str = (String) ((HashMap) h1Var.f38983a).get("url");
                String str2 = (String) ((HashMap) h1Var.f38983a).get("brandName");
                String str3 = (String) ((HashMap) h1Var.f38983a).get("userName");
                String str4 = f23613e;
                Log.m105918d(str4, f23615g + " brandName=" + str2 + ", userName=" + str3);
                if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(str3)) {
                    bundle.putString("key_brand_name", str2);
                    bundle.putString("key_brand_user_name", str3);
                    bundle.putString("key_url", str);
                }
                bundle.putBoolean("key_current_info_show", true);
                WebViewUIStyleHelper webViewUIStyleHelper = webViewUI.f118477N1;
                webViewUIStyleHelper.getClass();
                ((C119157j) C119157j.f356862d).mo183895z(new C44044l2(webViewUIStyleHelper, bundle));
            }
        }
        C13849g gVar = jVar.f39001d;
        String str5 = h1Var.f38990c;
        gVar.mo10774a(str5, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23614f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23615g;
    }
}
