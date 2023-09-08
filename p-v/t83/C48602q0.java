package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.q0 */
public class C48602q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130112d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130113e;

    public C48602q0(C48590l lVar, String str) {
        this.f130113e = lVar;
        this.f130112d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130113e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130112d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, ex = %s", e.getMessage());
        }
    }
}
