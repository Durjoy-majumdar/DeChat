package p935cb;

import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p935cb.C79986k;

/* renamed from: cb.f */
public class C79974f implements C79986k {

    /* renamed from: a */
    public WebView f234255a;

    /* renamed from: cb.f$a */
    public class C79975a implements C79986k.C79987a {

        /* renamed from: a */
        public final /* synthetic */ WebSettings f234256a;

        public C79975a(C79974f fVar, WebSettings webSettings) {
            this.f234256a = webSettings;
        }

        public void setJavaScriptEnabled(boolean z) {
            this.f234256a.setJavaScriptEnabled(z);
        }
    }

    /* renamed from: cb.f$b */
    public class C79976b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C79986k.C79988b f234257a;

        public C79976b(C79974f fVar, C79986k.C79988b bVar) {
            this.f234257a = bVar;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f234257a.mo110147a();
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            C79986k.C79988b bVar = this.f234257a;
            String uri = webResourceRequest.getUrl().toString();
            ((C79970b) bVar).getClass();
            if (!C79973e.f234246i.equals(uri)) {
                return null;
            }
            C79986k.C79988b.C79989a b = this.f234257a.mo110170b("WAGameVConsole.html");
            return new WebResourceResponse(b.f234278a, "UTF-8", b.f234279b);
        }
    }

    /* renamed from: a */
    public void mo110152a(String str) {
        this.f234255a.evaluateJavascript(str, (ValueCallback) null);
    }

    /* renamed from: b */
    public C79986k.C79987a mo110153b() {
        return new C79975a(this, this.f234255a.getSettings());
    }

    /* renamed from: c */
    public void mo110154c(Context context) {
        this.f234255a = new WebView(context);
    }

    /* renamed from: d */
    public void mo110155d(float f) {
        this.f234255a.setTranslationY(f);
    }

    public void destroy() {
        this.f234255a.destroy();
    }

    /* renamed from: e */
    public void mo110157e(C79986k.C79988b bVar) {
        this.f234255a.setWebViewClient(new C79976b(this, bVar));
    }

    public View getView() {
        return this.f234255a;
    }

    public void loadUrl(String str) {
        this.f234255a.loadUrl(str);
    }

    public void requestLayout() {
        this.f234255a.requestLayout();
    }

    public void setVisibility(int i) {
        this.f234255a.setVisibility(i);
    }
}
