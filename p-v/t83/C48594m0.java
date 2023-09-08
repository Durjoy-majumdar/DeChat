package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.m0 */
public class C48594m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130097d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130098e;

    public C48594m0(C48590l lVar, String str) {
        this.f130098e = lVar;
        this.f130097d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130098e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130097d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchInputConfirm fail, ex = %s", e.getMessage());
        }
    }
}
