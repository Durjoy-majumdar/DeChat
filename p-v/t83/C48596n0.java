package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.n0 */
public class C48596n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130101d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130102e;

    public C48596n0(C48590l lVar, String str) {
        this.f130102e = lVar;
        this.f130101d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130102e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130101d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchGuideDataReady fail, ex = %s", e.getMessage());
        }
    }
}
