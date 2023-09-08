package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130041d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130042e;

    public l$$f(C48590l lVar, String str) {
        this.f130042e = lVar;
        this.f130041d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130042e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130041d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onActivityStateChanged, ex = %s", e.getMessage());
        }
    }
}
