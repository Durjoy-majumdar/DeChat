package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.j0 */
public class C48588j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129977d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129978e;

    public C48588j0(C48590l lVar, String str) {
        this.f129978e = lVar;
        this.f129977d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129978e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129977d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetPoiInfoReturn fail, ex = %s", e.getMessage());
        }
    }
}
