package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewRedesignInputFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.HashMap;
import t83.C13851h1;
import t83.C48590l;
import t83.C48614x;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$h */
public class WebViewUI$$h implements WebViewRedesignInputFooter.C44291g {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f118602a;

    public WebViewUI$$h(WebViewUI webViewUI) {
        this.f118602a = webViewUI;
    }

    /* renamed from: a */
    public boolean mo68341a(String str) {
        C48590l lVar = this.f118602a.f118508Z;
        if (lVar == null) {
            return true;
        }
        if (!lVar.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "not ready");
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("smiley", str);
        MMHandlerThread.postToMainThread(new C48614x(lVar, C13851h1.C13852a.m13143c("onGetSmiley", hashMap, lVar.f130011p, lVar.f130012q)));
        return true;
    }
}
