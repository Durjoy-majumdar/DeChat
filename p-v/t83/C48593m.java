package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.m */
public class C48593m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130095d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130096e;

    public C48593m(C48590l lVar, String str) {
        this.f130096e = lVar;
        this.f130095d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130096e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130095d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onScanWXDeviceResult, %s", e.getMessage());
        }
    }
}
