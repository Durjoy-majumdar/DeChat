package i93;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: i93.c */
public final class C33248c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebView f90199d;

    /* renamed from: e */
    public final /* synthetic */ C33250d f90200e;

    /* renamed from: f */
    public final /* synthetic */ String f90201f;

    /* renamed from: g */
    public final /* synthetic */ String f90202g;

    /* renamed from: h */
    public final /* synthetic */ int f90203h;

    /* renamed from: i93.c$a */
    public static final class C33249a<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C33250d f90204a;

        /* renamed from: b */
        public final /* synthetic */ String f90205b;

        /* renamed from: c */
        public final /* synthetic */ String f90206c;

        /* renamed from: d */
        public final /* synthetic */ int f90207d;

        public C33249a(C33250d dVar, String str, String str2, int i) {
            this.f90204a = dVar;
            this.f90205b = str;
            this.f90206c = str2;
            this.f90207d = i;
        }

        public void onReceiveValue(Object obj) {
            C119179t tVar = C119157j.f356862d;
            C119157j jVar = (C119157j) tVar;
            jVar.mo183876g(new C33247b(this.f90204a, this.f90205b, this.f90206c, (String) obj, this.f90207d), "WebViewKeyWordAuditReport");
        }
    }

    public C33248c(WebView webView, C33250d dVar, String str, String str2, int i) {
        this.f90199d = webView;
        this.f90200e = dVar;
        this.f90201f = str;
        this.f90202g = str2;
        this.f90203h = i;
    }

    public final void run() {
        WebView webView = this.f90199d;
        MMWebView mMWebView = webView instanceof MMWebView ? (MMWebView) webView : null;
        boolean z = true;
        if (mMWebView == null || !mMWebView.f122358h) {
            z = false;
        }
        if (z) {
            Log.m105924i(this.f90200e.f90208a, "onPageFinished webview has destroyed");
        } else {
            webView.evaluateJavascript("document.documentElement.innerHTML", new C33249a(this.f90200e, this.f90201f, this.f90202g, this.f90203h));
        }
    }
}
