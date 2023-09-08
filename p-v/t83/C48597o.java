package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.o */
public class C48597o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130103d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130104e;

    public C48597o(C48590l lVar, String str) {
        this.f130104e = lVar;
        this.f130103d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130104e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130103d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.JsApiHandler", "onWXDeviceBluetoothStateChange, %s", e.getMessage());
        }
    }
}
