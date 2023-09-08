package qj0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import p935cb.C79970b;
import p935cb.C79973e;
import p935cb.C79986k;

/* renamed from: qj0.a */
public class C89680a implements C79986k {

    /* renamed from: a */
    public WebView f257924a;

    /* renamed from: qj0.a$a */
    public class C89681a implements C79986k.C79987a {

        /* renamed from: a */
        public final /* synthetic */ WebSettings f257925a;

        public C89681a(C89680a aVar, WebSettings webSettings) {
            this.f257925a = webSettings;
        }

        public void setJavaScriptEnabled(boolean z) {
            this.f257925a.setJavaScriptEnabled(z);
        }
    }

    /* renamed from: qj0.a$b */
    public class C89682b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C79986k.C79988b f257926a;

        public C89682b(C89680a aVar, C79986k.C79988b bVar) {
            this.f257926a = bVar;
        }

        /* renamed from: J */
        public final WebResourceResponse mo124007J(String str) {
            ((C79970b) this.f257926a).getClass();
            if (!C79973e.f234246i.equals(str)) {
                return null;
            }
            C79986k.C79988b.C79989a b = this.f257926a.mo110170b("WAGameVConsole.html");
            return new WebResourceResponse(b.f234278a, "UTF-8", b.f234279b);
        }

        public void onPageFinished(WebView webView, String str) {
            this.f257926a.mo110147a();
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return mo124007J(str);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
            return mo124007J(webResourceRequest.getUrl().toString());
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return mo124007J(webResourceRequest.getUrl().toString());
        }
    }

    /* renamed from: a */
    public void mo110152a(String str) {
        this.f257924a.evaluateJavascript(str, (ValueCallback<String>) null);
    }

    /* renamed from: b */
    public C79986k.C79987a mo110153b() {
        return new C89681a(this, this.f257924a.getSettings());
    }

    /* renamed from: c */
    public void mo110154c(Context context) {
        this.f257924a = new WebView(context);
    }

    /* renamed from: d */
    public void mo110155d(float f) {
        this.f257924a.setTranslationY(f);
    }

    public void destroy() {
        this.f257924a.destroy();
    }

    /* renamed from: e */
    public void mo110157e(C79986k.C79988b bVar) {
        this.f257924a.setWebViewClient(new C89682b(this, bVar));
    }

    public View getView() {
        return this.f257924a;
    }

    public void loadUrl(String str) {
        this.f257924a.loadUrl(str);
    }

    public void requestLayout() {
        this.f257924a.requestLayout();
    }

    public void setVisibility(int i) {
        this.f257924a.setVisibility(i);
    }
}
