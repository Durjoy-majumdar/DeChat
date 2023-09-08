package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
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

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.q */
public final class C6541q extends C15053a {

    /* renamed from: d */
    public static final C6541q f23710d = new C6541q();

    /* renamed from: e */
    public static final String f23711e = "MicroMsg.JsApiFastBindCardGetResult";

    /* renamed from: f */
    public static final int f23712f = 402;

    /* renamed from: g */
    public static final String f23713g = "fastBindCardGetResult";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.q$a */
    public static final class C6542a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23714d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23715e;

        public C6542a(C13855j jVar, C13851h1 h1Var) {
            this.f23714d = jVar;
            this.f23715e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("ret", "fail");
            C13849g gVar = this.f23714d.f39001d;
            String str = this.f23715e.f38990c;
            gVar.mo10774a(str, this.f23715e.f38996i + XVFSFile.PATH_SEPARATOR_CHAR + string, (Map<String, Object>) null);
            if (bundle.getInt("closeWindow", 0) == 1) {
                Context context = this.f23714d.f38998a;
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
        Log.m105924i(f23711e, "get data");
        Bundle bundle = new Bundle();
        bundle.putString("app_id", (String) h1Var.f38983a.get("appid"));
        bundle.putString("nonce_str", (String) h1Var.f38983a.get("noncestr"));
        bundle.putString("timeStamp", (String) h1Var.f38983a.get(AppMeasurement.Param.TIMESTAMP));
        bundle.putString("package", (String) h1Var.f38983a.get("package"));
        bundle.putString("signType", (String) h1Var.f38983a.get("signtype"));
        bundle.putString("paySign", (String) h1Var.f38983a.get("paysign"));
        bundle.putString("sessionid", (String) h1Var.f38983a.get("sessionid"));
        bundle.putString("jsapiName", f23713g);
        bundle.putInt("jsapi_type", 0);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, IPCInvoke_KindaJSInvoke.class, new C6542a(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23712f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23713g;
    }
}
