package b93;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import gy3.C87412m;
import z04.C112550d0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: b93.d */
public final class C39746d extends C43505b0 {

    /* renamed from: c */
    public boolean f106635c;

    /* renamed from: d */
    public boolean f106636d;

    /* renamed from: e */
    public int f106637e;

    /* renamed from: f */
    public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
        MMWebView mMWebView;
        Context activityContextIfHas;
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(webResourceRequest, "request");
        try {
            if (this.f106635c && this.f106636d) {
                String n0 = mo67777c().mo63683n0();
                String str = webView.getUrl().toString();
                String uri = webResourceRequest.getUrl().toString();
                C87412m.m108593f(uri, "request.url.toString()");
                boolean isForMainFrame = webResourceRequest.isForMainFrame();
                String str2 = Thread.currentThread().getName() + '_' + Thread.currentThread().hashCode();
                if (isForMainFrame) {
                    if (uri.equals(str)) {
                        C0258b bVar = C0258b.f802a;
                        if (bVar.mo299d(uri) && !bVar.mo297b(uri)) {
                            WebResourceResponse a = C39745a.f106634a.mo62374a(uri);
                            if (a != null) {
                                C115669n.INSTANCE.mo175911u(1951, 6);
                                Log.m105928w("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept: ok      , thread=" + str2 + ", isMainFrame=" + isForMainFrame + ", controller=" + mo67777c().hashCode() + ", reqUrl=" + uri + ", webUrl=" + str);
                                if (!((!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED) || (mMWebView = mo67777c().f117553a) == null || (activityContextIfHas = mMWebView.getActivityContextIfHas()) == null)) {
                                    C119179t tVar = C119157j.f356862d;
                                    C0259c cVar = new C0259c(uri, activityContextIfHas);
                                    C119157j jVar = (C119157j) tVar;
                                    jVar.getClass();
                                    jVar.mo183892w(cVar, 50, false);
                                }
                            } else {
                                Log.m105928w("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept: default0, thread=" + str2 + ", isMainFrame=" + isForMainFrame + ", controller=" + mo67777c().hashCode() + ", reqUrl=" + uri + ", webUrl=" + str);
                            }
                            return a;
                        }
                    }
                }
                Log.m105918d("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept: default1, thread=" + str2 + ", isMainFrame=" + isForMainFrame + ", controller=" + mo67777c().hashCode() + ", reqUrl=" + uri + ", webUrl=" + str + ", rawUrl=" + n0);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept, exp=" + th);
        }
        super.mo62378f(webView, webResourceRequest);
        return null;
    }

    /* renamed from: g */
    public boolean mo62379g(WebView webView, int i, String str, String str2) {
        C87412m.m108594g(webView, "webview");
        C87412m.m108594g(str, "description");
        C87412m.m108594g(str2, "failingUrl");
        try {
            if (this.f106635c && this.f106636d) {
                Log.m105920e("MicroMsg.WebViewHighRiskAdH5Interceptor", "interceptLoadError: errorCode" + i + ", description" + str + ", failingUrl" + str2);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.WebViewHighRiskAdH5Interceptor", "interceptLoadError, exp=" + th);
        }
        super.mo62379g(webView, i, str, str2);
        return false;
    }

    /* renamed from: h */
    public void mo62380h() {
        C0258b bVar = C0258b.f802a;
        this.f106635c = bVar.mo298c();
        boolean z = false;
        this.f106637e = 0;
        String n0 = mo67777c().mo63683n0();
        if ((n0 == null || n0.length() == 0 ? false : C112550d0.m153803w(n0, "adCgiRedirect=1", false, 2, (Object) null)) || bVar.mo299d(n0)) {
            z = true;
        }
        this.f106636d = z;
        Log.m105924i("MicroMsg.WebViewHighRiskAdH5Interceptor", "onAttachController,  isExptEnabled=" + this.f106635c + ", hasFlag=" + this.f106636d + ", this.hash=" + hashCode() + ", controller.hash=" + mo67777c().hashCode() + ", thread=" + (Thread.currentThread().getName() + '_' + Thread.currentThread().hashCode()) + ", rawUrl=" + n0);
    }

    /* renamed from: q */
    public C43505b0.C43506a mo62381q(WebView webView, WebResourceRequest webResourceRequest) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(webResourceRequest, "request");
        try {
            if (this.f106635c && this.f106636d) {
                String n0 = mo67777c().mo63683n0();
                String str = webView.getUrl().toString();
                String uri = webResourceRequest.getUrl().toString();
                C87412m.m108593f(uri, "request.url.toString()");
                String str2 = Thread.currentThread().getName() + '_' + Thread.currentThread().hashCode();
                C0258b bVar = C0258b.f802a;
                if (bVar.mo299d(uri)) {
                    if (!bVar.mo297b(uri)) {
                        webView.loadUrl(uri);
                        Log.m105924i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl : ok , thread=" + str2 + ", isForMainFrame=" + webResourceRequest.isForMainFrame() + ", reqUrl=" + uri + ", webUrl=" + str);
                        return new C43505b0.C43506a(true, true);
                    }
                }
                Log.m105924i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl : default, thread=" + str2 + ", isForMainFrame=" + webResourceRequest.isForMainFrame() + ", reqUrl=" + uri + ", webUrl=" + str);
                int i = this.f106637e + 1;
                this.f106637e = i;
                if (i == 2) {
                    C115669n.INSTANCE.mo160131h(19789, "ad_h5_multi_override", "", 0, 0, n0);
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.WebViewHighRiskAdH5Interceptor", "overrideUrl, exp=" + th);
        }
        return super.mo62381q(webView, webResourceRequest);
    }

    /* renamed from: r */
    public C43505b0.C43506a mo62382r(WebView webView, String str) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(str, "url");
        try {
            if (this.f106635c && this.f106636d) {
                mo67777c().mo63683n0();
                String str2 = webView.getUrl().toString();
                String str3 = Thread.currentThread().getName() + '_' + Thread.currentThread().hashCode();
                C0258b bVar = C0258b.f802a;
                if (bVar.mo299d(str)) {
                    if (!bVar.mo297b(str)) {
                        webView.loadUrl(str);
                        Log.m105924i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl2: ok , thread=" + str3 + ", reqUrl=" + str + ", webUrl=" + str2);
                        return new C43505b0.C43506a(true, true);
                    }
                }
                Log.m105924i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl2: default, thread=" + str3 + ", reqUrl=" + str + ", webUrl=" + str2);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.WebViewHighRiskAdH5Interceptor", "overrideUrl2, exp=" + th);
        }
        return super.mo62382r(webView, str);
    }
}
