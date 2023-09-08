package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130057d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130058e;

    public l$$j0(C48590l lVar, String str) {
        this.f130058e = lVar;
        this.f130057d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130058e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130057d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, ex = %s", e.getMessage());
        }
    }
}
