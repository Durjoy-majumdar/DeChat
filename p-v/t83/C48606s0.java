package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.s0 */
public class C48606s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130120d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130121e;

    public C48606s0(C48590l lVar, String str) {
        this.f130121e = lVar;
        this.f130120d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130121e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130120d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, ex = %s", e.getMessage());
        }
    }
}
