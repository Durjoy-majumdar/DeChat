package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130055d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130056e;

    public l$$j(C48590l lVar, String str) {
        this.f130056e = lVar;
        this.f130055d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130056e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130055d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onLocalImageUploadProgress fail, ex = %s", e.getMessage());
        }
    }
}
