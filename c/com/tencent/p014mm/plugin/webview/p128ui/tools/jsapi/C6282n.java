package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ke3.C88144b;
import p170ic.C87687a;
import p225rc.C89916g;
import p225rc.g$$f;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.n */
public final class C6282n extends C15053a {

    /* renamed from: d */
    public static final C6282n f23098d;

    /* renamed from: e */
    public static final int f23099e = JsApiInstallDownloadTask.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23100f = "requestKidsPayRechargePayment";

    /* renamed from: g */
    public static final int f23101g;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.n$a */
    public static final class C6283a implements g$$f {

        /* renamed from: a */
        public final /* synthetic */ C13851h1 f23102a;

        /* renamed from: b */
        public final /* synthetic */ C13855j f23103b;

        public C6283a(C13851h1 h1Var, C13855j jVar) {
            this.f23102a = h1Var;
            this.f23103b = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (r1 == null) goto L_0x002d;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo1596b(int r6, int r7, android.content.Intent r8) {
            /*
                r5 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "MicroMsg.JsApiRequestKidsPayRechargePayment"
                java.lang.String r4 = "on Activity result: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
                int r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6282n.f23101g
                if (r6 == r1) goto L_0x0016
                return r3
            L_0x0016:
                r6 = 0
                if (r8 == 0) goto L_0x002d
                java.lang.String r1 = "ret"
                java.lang.String r1 = r8.getStringExtra(r1)
                if (r1 == 0) goto L_0x002d
                r2 = -1
                if (r7 != r2) goto L_0x0026
                r7 = 1
                goto L_0x0027
            L_0x0026:
                r7 = 0
            L_0x0027:
                if (r7 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r1 = r6
            L_0x002b:
                if (r1 != 0) goto L_0x002f
            L_0x002d:
                java.lang.String r1 = "fail"
            L_0x002f:
                t83.h1 r7 = r5.f23102a
                java.lang.String r7 = r7.f38996i
                java.lang.String r2 = "msg.function"
                gy3.C87412m.m108593f(r7, r2)
                boolean r7 = z04.C112551y.m153819s(r1, r7, r3)
                if (r7 != 0) goto L_0x0051
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                t83.h1 r2 = r5.f23102a
                java.lang.String r2 = r2.f38996i
                r7.append(r2)
                r7.append(r1)
                java.lang.String r1 = r7.toString()
            L_0x0051:
                t83.j r7 = r5.f23103b
                t83.g r7 = r7.f39001d
                t83.h1 r2 = r5.f23102a
                java.lang.String r2 = r2.f38990c
                r7.mo10774a(r2, r1, r6)
                t83.j r7 = r5.f23103b
                android.content.Context r7 = r7.f38998a
                boolean r1 = r7 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
                if (r1 == 0) goto L_0x0067
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r7 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r7
                goto L_0x0068
            L_0x0067:
                r7 = r6
            L_0x0068:
                if (r7 == 0) goto L_0x007d
                if (r8 == 0) goto L_0x0075
                java.lang.String r1 = "closeWindow"
                int r8 = r8.getIntExtra(r1, r3)
                if (r8 != r0) goto L_0x0075
                r3 = 1
            L_0x0075:
                if (r3 == 0) goto L_0x0078
                r6 = r7
            L_0x0078:
                if (r6 == 0) goto L_0x007d
                r6.finish()
            L_0x007d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6282n.C6283a.mo1596b(int, int, android.content.Intent):boolean");
        }
    }

    static {
        C6282n nVar = new C6282n();
        f23098d = nVar;
        f23101g = C87687a.m109085a(nVar);
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiRequestKidsPayRechargePayment", "handled, params: " + h1Var.f38983a);
        Bundle bundle = new Bundle();
        bundle.putString("appId", (String) h1Var.f38983a.get("appId"));
        bundle.putString("timeStamp", (String) h1Var.f38983a.get("timeStamp"));
        bundle.putString("package", (String) h1Var.f38983a.get("package"));
        bundle.putString("nonceStr", (String) h1Var.f38983a.get("nonceStr"));
        bundle.putString("paySign", (String) h1Var.f38983a.get("paySign"));
        bundle.putString("signType", (String) h1Var.f38983a.get("signType"));
        bundle.putString("webViewUrl", (String) h1Var.f38983a.get("url"));
        f23098d.getClass();
        bundle.putString("jsapiName", f23100f);
        C89916g.m112446a(jVar.f38998a).mo124232f(new C6283a(h1Var, jVar));
        C88144b.m109795m(jVar.f38998a, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new Intent().putExtras(bundle), f23101g);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23099e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23100f;
    }
}
