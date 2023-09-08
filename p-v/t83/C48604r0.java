package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.r0 */
public class C48604r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130116d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130117e;

    public C48604r0(C48590l lVar, String str) {
        this.f130117e = lVar;
        this.f130116d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130117e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130116d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, ex = %s", e.getMessage());
        }
    }
}
