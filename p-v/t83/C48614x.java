package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.x */
public class C48614x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130136d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130137e;

    public C48614x(C48590l lVar, String str) {
        this.f130137e = lVar;
        this.f130136d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130137e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130136d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetSmiley fail, ex = %s", e.getMessage());
        }
    }
}
