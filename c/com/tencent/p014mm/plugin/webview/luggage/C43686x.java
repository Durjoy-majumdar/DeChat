package com.tencent.p014mm.plugin.webview.luggage;

import android.net.http.SslError;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43976g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;

/* renamed from: com.tencent.mm.plugin.webview.luggage.x */
public class C43686x extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C43658n f118055a;

    public C43686x(C43658n nVar) {
        this.f118055a = nVar;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Log.m105925i("MicroMsg.LuggageMMWebPage", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", Integer.valueOf(i), str, str2);
        this.f118055a.mo65783J(i, str, str2);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C43658n nVar = this.f118055a;
        if (nVar.f117915E == null) {
            nVar.f117915E = new C43976g(nVar.f148196d, webView);
        }
        C43658n nVar2 = this.f118055a;
        nVar2.f117915E.mo68566b(nVar2.mo67943v(), sslErrorHandler, sslError);
    }
}
