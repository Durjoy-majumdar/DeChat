package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130086d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130087e;

    public l$$w(C48590l lVar, String str) {
        this.f130087e = lVar;
        this.f130086d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130087e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130086d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchInputChange fail, ex = %s", e.getMessage());
        }
    }
}
