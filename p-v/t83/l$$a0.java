package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130024d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130025e;

    public l$$a0(C48590l lVar, String str) {
        this.f130025e = lVar;
        this.f130024d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130025e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130024d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchImageListReady fail, ex = %s", e.getMessage());
        }
    }
}
