package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130078d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130079e;

    public l$$s(C48590l lVar, String str) {
        this.f130079e = lVar;
        this.f130078d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130079e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130078d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "doCallback, ex = %s", e.getMessage());
        }
    }
}
