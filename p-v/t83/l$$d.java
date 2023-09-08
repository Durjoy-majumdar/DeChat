package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130032d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130033e;

    public l$$d(C48590l lVar, String str) {
        this.f130033e = lVar;
        this.f130032d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130033e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130032d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onDownloadStateChange, ex = %s", e.getMessage());
        }
    }
}
