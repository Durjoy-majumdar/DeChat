package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1759n3;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.h */
public final class C6245h extends C15053a {

    /* renamed from: d */
    public static final C6245h f23017d = new C6245h();

    /* renamed from: e */
    public static final String f23018e = "MicroMsg.JsApiH5ReuqestQueryCashier";

    /* renamed from: f */
    public static final int f23019f = ADXml.AD_TURN_CARD_ANIMATION_TIME;

    /* renamed from: g */
    public static final String f23020g = C1759n3.NAME;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.h$a */
    public static final class C6246a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23021d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23022e;

        public C6246a(C13855j jVar, C13851h1 h1Var) {
            this.f23021d = jVar;
            this.f23022e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("ret", "fail");
            C13849g gVar = this.f23021d.f39001d;
            String str = this.f23022e.f38990c;
            gVar.mo10774a(str, this.f23022e.f38996i + XVFSFile.PATH_SEPARATOR_CHAR + string, (Map<String, Object>) null);
            if (bundle.getInt("closeWindow", 0) == 1) {
                Context context = this.f23021d.f38998a;
                if (context instanceof WebViewUI) {
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                    ((WebViewUI) context).finish();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = f23018e;
        Log.m105924i(str, "get data");
        Log.m105925i(str, "data: %s", h1Var.f38983a.toString());
        Bundle bundle = new Bundle();
        bundle.putString("appId", (String) h1Var.f38983a.get("appId"));
        bundle.putString("nonceStr", (String) h1Var.f38983a.get("nonceStr"));
        bundle.putString("timeStamp", (String) h1Var.f38983a.get("timeStamp"));
        bundle.putString("package", (String) h1Var.f38983a.get("package"));
        bundle.putString("paySign", (String) h1Var.f38983a.get("paySign"));
        bundle.putString("signType", (String) h1Var.f38983a.get("signType"));
        bundle.putString("jsapiName", C1759n3.NAME);
        bundle.putString("notifyType", C1759n3.NAME);
        bundle.putInt("jsapi_type", 0);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, IPCInvoke_KindaJSInvoke.class, new C6246a(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23019f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23020g;
    }
}
