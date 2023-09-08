package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import e00.C45520t;
import gy3.C87412m;
import java.util.Map;
import ke3.C88144b;
import p170ic.C87687a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import v20.C90741c;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.r1 */
public final class C6550r1 extends C15053a {

    /* renamed from: d */
    public static final C6550r1 f23737d;

    /* renamed from: e */
    public static final String f23738e = "MicroMsg.JsApiOpenHKOfflinePayView";

    /* renamed from: f */
    public static final int f23739f;

    /* renamed from: g */
    public static final int f23740g = 446;

    /* renamed from: h */
    public static final String f23741h = "openHKOfflinePayView";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.r1$a */
    public static final class C6551a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23742d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23743e;

        public C6551a(C13855j jVar, C13851h1 h1Var) {
            this.f23742d = jVar;
            this.f23743e = h1Var;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            if (C6550r1.f23739f != i) {
                return;
            }
            if (i2 == -1) {
                C6550r1.f23737d.getClass();
                C90741c.m113809b(C6550r1.f23738e, "goto hkoffline pay finish", new Object[0]);
                C13849g gVar = this.f23742d.f39001d;
                String str = this.f23743e.f38990c;
                gVar.mo10774a(str, this.f23743e.f38996i + ":ok", (Map<String, Object>) null);
                return;
            }
            C6550r1.f23737d.getClass();
            C90741c.m113809b(C6550r1.f23738e, "check pay jspi fail", new Object[0]);
            C13849g gVar2 = this.f23742d.f39001d;
            String str2 = this.f23743e.f38990c;
            gVar2.mo10774a(str2, this.f23743e.f38996i + ":fail", (Map<String, Object>) null);
        }
    }

    static {
        C6550r1 r1Var = new C6550r1();
        f23737d = r1Var;
        f23739f = C87687a.m109085a(r1Var);
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        C90741c.m113809b(f23738e, "handle msg", new Object[0]);
        Map<String, Object> map = h1Var.f38983a;
        C87412m.m108593f(map, "msg.params");
        String str2 = null;
        if (map.size() == 0) {
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
        intent.putExtra("intent_jump_ui", "openHKOfflinePayView");
        Context context = jVar.f38998a;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C88144b.m109803u((MMActivity) context, ".plugin.wallet.ui.WalletJsApiAdapterUI", intent, f23739f, new C6551a(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23740g;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23741h;
    }
}
