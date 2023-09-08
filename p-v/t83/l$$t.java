package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130080d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130081e;

    public l$$t(C48590l lVar, String str) {
        this.f130081e = lVar;
        this.f130080d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130081e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130080d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSelectContact fail, ex = %s", e.getMessage());
        }
    }
}
