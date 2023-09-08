package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.p */
public class C48599p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130107d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130108e;

    public C48599p(C48590l lVar, String str) {
        this.f130108e = lVar;
        this.f130107d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130108e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130107d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange, %s", e.getMessage());
        }
    }
}
