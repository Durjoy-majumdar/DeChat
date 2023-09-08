package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.g0 */
public class C48585g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129973d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f129974e;

    public C48585g0(C48590l lVar, String str) {
        this.f129974e = lVar;
        this.f129973d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f129974e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f129973d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onGetVertSearchEntriesData fail, ex = %s", e.getMessage());
        }
    }
}
