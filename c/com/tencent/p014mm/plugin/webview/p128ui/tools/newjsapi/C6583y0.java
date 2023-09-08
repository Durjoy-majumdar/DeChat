package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.y0 */
public final class C6583y0 extends C15053a {

    /* renamed from: d */
    public static final C6583y0 f23822d = new C6583y0();

    /* renamed from: e */
    public static final String f23823e = "MicroMsg.JsApiLog";

    /* renamed from: f */
    public static final String f23824f = "log";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.y0$a */
    public static final class C6584a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13851h1 f23825d;

        public C6584a(C13851h1 h1Var) {
            this.f23825d = h1Var;
        }

        public final void run() {
            Log.m105925i(C6583y0.f23823e, "jslog : %s", (String) this.f23825d.f38983a.get("msg"));
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        ((C119157j) C119157j.f356862d).mo183875f(new C6584a(h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 0;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23824f;
    }
}
