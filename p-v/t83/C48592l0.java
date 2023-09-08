package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.l0 */
public class C48592l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130093d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130094e;

    public C48592l0(C48590l lVar, String str) {
        this.f130094e = lVar;
        this.f130093d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130094e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130093d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback fail, ex = %s", e.getMessage());
        }
    }
}
