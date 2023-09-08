package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130072d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130073e;

    public l$$q(C48590l lVar, String str) {
        this.f130073e = lVar;
        this.f130072d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130073e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130072d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetSmiley fail, ex = %s", e.getMessage());
        }
    }
}
