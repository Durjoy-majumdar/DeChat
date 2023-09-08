package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130059d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130060e;

    public l$$k(C48590l lVar, String str) {
        this.f130060e = lVar;
        this.f130059d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130060e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130059d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onImageDownloadProgress fail, ex = %s", e.getMessage());
        }
    }
}
