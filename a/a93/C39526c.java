package a93;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.C43592h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import di3.C86312j;
import p237sp.C48455p;
import p824tc.C48619a;
import p828wa.C53133t;
import p828wa.C53135u;

/* renamed from: a93.c */
public class C39526c extends C43592h0 {

    /* renamed from: b */
    public final /* synthetic */ C48619a.C48620a f106121b;

    /* renamed from: c */
    public final /* synthetic */ C39517b f106122c;

    public C39526c(C39517b bVar, C48619a.C48620a aVar) {
        this.f106122c = bVar;
        this.f106121b = aVar;
    }

    /* renamed from: J */
    public final WebResourceResponse mo62136J(WebResourceRequest webResourceRequest, Bundle bundle) {
        android.webkit.WebResourceResponse webResourceResponse;
        C39528h hVar = new C39528h(webResourceRequest.getUrl(), webResourceRequest.isForMainFrame(), false, webResourceRequest.hasGesture(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
        C53133t.C53134a aVar = (C53133t.C53134a) this.f106121b;
        aVar.getClass();
        aVar.mo73827d(hVar.getUrl().toString());
        C53135u uVar = C53133t.this.f148244h;
        if (uVar == null || (webResourceResponse = uVar.mo65892d(hVar, bundle)) == null) {
            webResourceResponse = C53133t.this.f148248o.mo73446b(hVar.getUrl().toString());
        }
        if (webResourceResponse != null) {
            return new WebResourceResponse(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData());
        }
        return null;
    }

    public void onLoadResource(WebView webView, String str) {
        this.f106121b.getClass();
        super.onLoadResource(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        ((C53133t.C53134a) this.f106121b).mo73825b(str);
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C53133t.C53134a aVar = (C53133t.C53134a) this.f106121b;
        C53133t tVar = C53133t.this;
        tVar.f148251r = false;
        tVar.f148250q = str;
        tVar.f148246j.f129380d.getClass();
        C53135u uVar = C53133t.this.f148244h;
        if (uVar != null) {
            uVar.mo65891c(str);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Log.m105925i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", webResourceRequest.getUrl().toString());
        WebResourceResponse J = mo62136J(webResourceRequest, new Bundle());
        if (J != null) {
            return J;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!((C48455p) C86312j.m106911c(C48455p.class)).mo60667qU(str, this.f106122c.f106101v, webView)) {
            return ((C53133t.C53134a) this.f106121b).mo73824a(str) || super.shouldOverrideUrlLoading(webView, str);
        }
        Log.m105924i("MicroMsg.LuggageMMWebViewCoreImpl", "use the downloader to download");
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Log.m105925i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", str);
        android.webkit.WebResourceResponse c = ((C53133t.C53134a) this.f106121b).mo73826c(str);
        WebResourceResponse webResourceResponse = c != null ? new WebResourceResponse(c.getMimeType(), c.getEncoding(), c.getStatusCode(), c.getReasonPhrase(), c.getResponseHeaders(), c.getData()) : null;
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
        Log.m105925i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", webResourceRequest.getUrl().toString());
        WebResourceResponse J = mo62136J(webResourceRequest, bundle);
        if (J != null) {
            return J;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }
}
