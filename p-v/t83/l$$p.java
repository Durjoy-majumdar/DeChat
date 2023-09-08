package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130070d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130071e;

    public l$$p(C48590l lVar, String str) {
        this.f130071e = lVar;
        this.f130070d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130071e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130070d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetKeyboardHeight fail, ex = %s", e.getMessage());
        }
    }
}
