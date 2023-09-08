package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.Map;
import o40.C61926c;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import t83.C48590l;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.n */
public final class C6520n extends C15053a {

    /* renamed from: d */
    public static final C6520n f23666d = new C6520n();

    /* renamed from: e */
    public static String f23667e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.n$a */
    public static final class C6521a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C48590l f23668d;

        /* renamed from: e */
        public final /* synthetic */ String f23669e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6521a(C48590l lVar, String str) {
            super(0);
            this.f23668d = lVar;
            this.f23669e = str;
        }

        public Object invoke() {
            C48590l lVar = this.f23668d;
            C6520n.f23666d.getClass();
            String str = C6520n.f23667e;
            String str2 = this.f23669e;
            if (str2 == null) {
                str2 = "";
            }
            lVar.mo10774a(str, str2, (Map<String, Object>) null);
            C6520n.f23667e = "";
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C43522y yVar;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Context context = jVar.f38998a;
        if ((context instanceof WebViewUI) && (yVar = ((WebViewUI) context).f118513b1) != null) {
            Iterator<C43505b0> it = yVar.f117545S.iterator();
            while (it.hasNext()) {
                it.next().mo67783n();
            }
        }
        f23667e = h1Var.f38990c;
        Log.m105924i("MicroMsg.JsApiDoAuthCurrentUrl", "SPA-Trace, JsApiDoAuthCurrentUrl call");
        C13849g gVar = jVar.f39001d;
        String str = h1Var.f38990c;
        gVar.mo10774a(str, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 397;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "doAuthCurrentUrl";
    }

    /* renamed from: e */
    public final void mo7505e(C48590l lVar, String str) {
        C87412m.m108594g(lVar, "jsApiHandler");
        String str2 = f23667e;
        if (str2 == null || str2.length() == 0) {
            Log.m105924i("MicroMsg.JsApiDoAuthCurrentUrl", "lastCallBackID is null");
        } else {
            C61926c.m72668M(new C6521a(lVar, str));
        }
    }

    /* renamed from: f */
    public final void mo7506f(C48590l lVar, String str) {
        C87412m.m108594g(lVar, "jsApiHandler");
        mo7505e(lVar, "doAuthCurrentUrl" + ":fail " + str);
    }
}
