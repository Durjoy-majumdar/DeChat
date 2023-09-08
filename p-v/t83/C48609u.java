package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.u */
public class C48609u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130125d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130126e;

    public C48609u(C48590l lVar, String str) {
        this.f130126e = lVar;
        this.f130125d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130126e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130125d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onNfcTouch fail, ex = %s", e.getMessage());
        }
    }
}
