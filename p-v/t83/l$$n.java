package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130067d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130068e;

    public l$$n(C48590l lVar, String str) {
        this.f130068e = lVar;
        this.f130067d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130068e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130067d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onVideoUploadoadProgress fail, ex = %s", e.getMessage());
        }
    }
}
