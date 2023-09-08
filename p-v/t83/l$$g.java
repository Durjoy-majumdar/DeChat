package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130043d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130044e;

    public l$$g(C48590l lVar, String str) {
        this.f130044e = lVar;
        this.f130043d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130044e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130043d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onActivityStateChanged, ex = %s", e.getMessage());
        }
    }
}
