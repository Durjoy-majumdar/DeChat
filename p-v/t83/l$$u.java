package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130082d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130083e;

    public l$$u(C48590l lVar, String str) {
        this.f130083e = lVar;
        this.f130082d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130083e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130082d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchDataReady fail, ex = %s", e.getMessage());
        }
    }
}
