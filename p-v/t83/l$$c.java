package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130028d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130029e;

    public l$$c(C48590l lVar, String str) {
        this.f130029e = lVar;
        this.f130028d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130029e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130028d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onDownloadStateChange, ex = %s", e.getMessage());
        }
    }
}
