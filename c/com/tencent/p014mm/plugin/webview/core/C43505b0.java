package com.tencent.p014mm.plugin.webview.core;

import android.content.Intent;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import gy3.C87412m;
import te3.C52018xt1;

/* renamed from: com.tencent.mm.plugin.webview.core.b0 */
public class C43505b0 {

    /* renamed from: a */
    public BaseWebViewController f117636a;

    /* renamed from: b */
    public final int f117637b = -1;

    /* renamed from: com.tencent.mm.plugin.webview.core.b0$a */
    public static final class C43506a {

        /* renamed from: a */
        public final boolean f117638a;

        /* renamed from: b */
        public final boolean f117639b;

        public C43506a(boolean z, boolean z2) {
            this.f117638a = z;
            this.f117639b = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C43506a)) {
                return false;
            }
            C43506a aVar = (C43506a) obj;
            return this.f117638a == aVar.f117638a && this.f117639b == aVar.f117639b;
        }

        public int hashCode() {
            boolean z = this.f117638a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f117639b;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "OverrideUrlResult(override=" + this.f117638a + ", result=" + this.f117639b + ')';
        }
    }

    /* renamed from: a */
    public int mo67775a(String str) {
        C87412m.m108594g(str, "url");
        return -1;
    }

    /* renamed from: b */
    public C43519u mo67776b() {
        return null;
    }

    /* renamed from: c */
    public final BaseWebViewController mo67777c() {
        BaseWebViewController baseWebViewController = this.f117636a;
        if (baseWebViewController != null) {
            return baseWebViewController;
        }
        C87412m.m108603p("controller");
        throw null;
    }

    /* renamed from: d */
    public C43558z mo63687d() {
        return null;
    }

    /* renamed from: e */
    public int mo67778e() {
        return this.f117637b;
    }

    /* renamed from: f */
    public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
        C87412m.m108594g(webView, "webview");
        C87412m.m108594g(webResourceRequest, "request");
        return null;
    }

    /* renamed from: g */
    public boolean mo62379g(WebView webView, int i, String str, String str2) {
        C87412m.m108594g(webView, "webview");
        C87412m.m108594g(str, "description");
        C87412m.m108594g(str2, "failingUrl");
        return false;
    }

    /* renamed from: h */
    public void mo62380h() {
    }

    /* renamed from: i */
    public boolean mo67779i() {
        return false;
    }

    /* renamed from: j */
    public boolean mo67780j(String str, boolean z, int i) {
        C87412m.m108594g(str, "url");
        return false;
    }

    /* renamed from: k */
    public boolean mo67781k(String str) {
        C87412m.m108594g(str, "url");
        return true;
    }

    /* renamed from: l */
    public boolean mo67782l(int i, String str, C52018xt1 xt12) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(xt12, "resp");
        return false;
    }

    /* renamed from: m */
    public boolean mo63688m(String str) {
        C87412m.m108594g(str, "url");
        return false;
    }

    /* renamed from: n */
    public boolean mo67783n() {
        return false;
    }

    /* renamed from: o */
    public boolean mo67784o(String str) {
        C87412m.m108594g(str, "url");
        return false;
    }

    /* renamed from: p */
    public boolean mo67785p(String str, Intent intent) {
        C87412m.m108594g(str, "url");
        return false;
    }

    /* renamed from: q */
    public C43506a mo62381q(WebView webView, WebResourceRequest webResourceRequest) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(webResourceRequest, "request");
        return new C43506a(false, false);
    }

    /* renamed from: r */
    public C43506a mo62382r(WebView webView, String str) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(str, "url");
        return new C43506a(false, false);
    }

    /* renamed from: s */
    public boolean mo63689s(int i, boolean z, String str, String str2) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "fullUrl");
        return false;
    }

    /* renamed from: t */
    public boolean mo67786t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo67787u() {
        return false;
    }
}
