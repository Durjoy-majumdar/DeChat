package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.i0 */
public class C48587i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129975d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129976e;

    public C48587i0(C48590l lVar, String str) {
        this.f129976e = lVar;
        this.f129975d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129976e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129975d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onChatSearchDataReady fail, ex = %s", e.getMessage());
        }
    }
}
