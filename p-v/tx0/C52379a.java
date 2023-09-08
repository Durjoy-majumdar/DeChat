package tx0;

import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43618m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: tx0.a */
public final class C52379a<T extends C53095a> extends C43618m1<T> {
    /* renamed from: e */
    public void mo5385e(C53096b<T>.a aVar) {
        WebView.WebViewKind currentModuleWebCoreType = WebView.getCurrentModuleWebCoreType();
        Log.m105924i("MicroMsg.GamePrefetchJsApiRequest", "[game-web-prefetch] request curWebType: " + currentModuleWebCoreType);
        super.mo5385e(aVar);
    }
}
