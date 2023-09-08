package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.b0 */
public class C48575b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129948d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129949e;

    public C48575b0(C48590l lVar, String str) {
        this.f129949e = lVar;
        this.f129948d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129949e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129948d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetMatchContactList fail, ex = %s", e.getMessage());
        }
    }
}
