package q52;

import android.content.res.AssetManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import gy3.C87412m;
import java.io.IOException;
import java.io.InputStream;
import zp3.C23564m;

/* renamed from: q52.m */
public final class C89475m extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C89468h f257537a;

    public C89475m(C89468h hVar) {
        this.f257537a = hVar;
    }

    public void onPageFinished(WebView webView, String str) {
        Log.m105924i("MBInspectorImpl", "webView page finished");
        C89468h hVar = this.f257537a;
        hVar.f257524j = true;
        C23564m.m28136f(new C89471i(hVar));
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(webResourceRequest, "request");
        if (!C87412m.m108589b(webResourceRequest.getUrl().toString(), this.f257537a.f257517c)) {
            return null;
        }
        AssetManager assets = MMApplicationContext.getContext().getAssets();
        try {
            InputStream open = assets.open("wxa_library/" + this.f257537a.f257516b, 3);
            C87412m.m108593f(open, "assets.open(\"wxa_library…setManager.ACCESS_BUFFER)");
            String mimeTypeByFilePath = MimeTypeUtil.getMimeTypeByFilePath(this.f257537a.f257516b);
            Log.m105924i("MBInspectorImpl", "fetch WAGameVConsole.html ok");
            return new WebResourceResponse(mimeTypeByFilePath, "UTF-8", open);
        } catch (IOException unused) {
            Log.m105920e("MBInspectorImpl", "read WAGameVConsole.html failed...");
            return null;
        }
    }
}
