package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.n */
public class C48595n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130099d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130100e;

    public C48595n(C48590l lVar, String str) {
        this.f130100e = lVar;
        this.f130099d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130100e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130099d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange, %s", e.getMessage());
        }
    }
}
