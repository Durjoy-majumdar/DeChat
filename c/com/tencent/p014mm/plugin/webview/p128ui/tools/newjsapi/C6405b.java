package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.stubs.logger.Log;
import e00.C45520t;
import gy3.C87412m;
import java.util.Map;
import ke3.C88144b;
import p170ic.C87687a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b */
public final class C6405b extends C15053a {

    /* renamed from: d */
    public static final C6405b f23381d;

    /* renamed from: e */
    public static final int f23382e;

    /* renamed from: f */
    public static final int f23383f = 471;

    /* renamed from: g */
    public static final String f23384g = "requestHKCashier";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b$a */
    public static final class C6406a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23385d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23386e;

        public C6406a(C13855j jVar, C13851h1 h1Var) {
            this.f23385d = jVar;
            this.f23386e = h1Var;
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mmOnActivityResult(int r3, int r4, android.content.Intent r5) {
            /*
                r2 = this;
                int r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6405b.f23382e
                if (r5 != r3) goto L_0x0065
                r3 = -1
                java.lang.String r5 = "MicroMsg.JSApiRequestHKCashier"
                r0 = 0
                if (r4 != r3) goto L_0x0040
                java.lang.String r3 = "request hk cashier finish"
                com.tencent.stubs.logger.Log.m106505i(r5, r3)
                t83.j r3 = r2.f23385d
                t83.g r3 = r3.f39001d
                t83.h1 r4 = r2.f23386e
                java.lang.String r4 = r4.f38990c
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                t83.h1 r1 = r2.f23386e
                java.lang.String r1 = r1.f38996i
                r5.append(r1)
                java.lang.String r1 = ":ok"
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r3.mo10774a(r4, r5, r0)
                t83.j r3 = r2.f23385d
                android.content.Context r3 = r3.f38998a
                boolean r4 = r3 instanceof android.app.Activity
                if (r4 == 0) goto L_0x003a
                r0 = r3
                android.app.Activity r0 = (android.app.Activity) r0
            L_0x003a:
                if (r0 == 0) goto L_0x0065
                r0.finish()
                goto L_0x0065
            L_0x0040:
                java.lang.String r3 = "check pay jspi fail"
                com.tencent.stubs.logger.Log.m106505i(r5, r3)
                t83.j r3 = r2.f23385d
                t83.g r3 = r3.f39001d
                t83.h1 r4 = r2.f23386e
                java.lang.String r4 = r4.f38990c
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                t83.h1 r1 = r2.f23386e
                java.lang.String r1 = r1.f38996i
                r5.append(r1)
                java.lang.String r1 = ":fail"
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r3.mo10774a(r4, r5, r0)
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6405b.C6406a.mmOnActivityResult(int, int, android.content.Intent):void");
        }
    }

    static {
        C6405b bVar = new C6405b();
        f23381d = bVar;
        f23382e = C87687a.m109085a(bVar);
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m106505i("MicroMsg.JSApiRequestHKCashier", "start handle msg");
        String str2 = null;
        if (h1Var.f38983a.isEmpty()) {
            C13849g gVar = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar.mo10774a(str3, h1Var.f38996i + ":fail_missing arguments", (Map<String, Object>) null);
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("appId", (String) h1Var.f38983a.get("appId"));
        intent.putExtra("timeStamp", (String) h1Var.f38983a.get("timeStamp"));
        intent.putExtra("nonceStr", (String) h1Var.f38983a.get("nonceStr"));
        intent.putExtra("packageExt", (String) h1Var.f38983a.get("package"));
        intent.putExtra("signtype", (String) h1Var.f38983a.get("signType"));
        intent.putExtra("paySignature", (String) h1Var.f38983a.get("paySign"));
        C45520t c = jVar.mo13183c();
        if (c == null || (str = c.getCurrentUrl()) == null) {
            MMWebView mMWebView = jVar.f39002e;
            if (mMWebView != null) {
                str2 = mMWebView.getUrl();
            }
            str = str2 == null ? "" : str2;
        }
        intent.putExtra("url", str);
        intent.putExtra("source_type", 1);
        intent.putExtra("intent_jump_ui", "requestHKCashier");
        Context context = jVar.f38998a;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C88144b.m109803u((MMActivity) context, ".plugin.wallet.ui.WalletJsApiAdapterUI", intent, f23382e, new C6406a(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23383f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23384g;
    }
}
