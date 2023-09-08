package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130034d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130035e;

    public l$$d0(C48590l lVar, String str) {
        this.f130035e = lVar;
        this.f130034d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130035e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130034d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onUxOplogDataReady fail, ex = %s", e.getMessage());
        }
    }
}
