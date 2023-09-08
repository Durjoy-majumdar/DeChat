package ny1;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;

/* renamed from: ny1.j */
public class C100254j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewJSSDKVideoItem f293718d;

    /* renamed from: e */
    public final /* synthetic */ C100247i f293719e;

    public C100254j(C100247i iVar, WebViewJSSDKVideoItem webViewJSSDKVideoItem) {
        this.f293719e = iVar;
        this.f293718d = webViewJSSDKVideoItem;
    }

    public void run() {
        if (!this.f293719e.f293705h) {
            C6080m.Cx0().mo134803c("", this.f293718d.f283022e, CdnLogic.kMediaTypeAppVideo, JsApiCheckIsSupportFaceDetect.CTRL_INDEX, 2, this.f293719e.f293706i);
            this.f293719e.f293704g = System.currentTimeMillis();
        }
    }
}
