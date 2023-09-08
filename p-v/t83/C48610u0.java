package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.u0 */
public class C48610u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130127d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130128e;

    public C48610u0(C48590l lVar, String str) {
        this.f130128e = lVar;
        this.f130127d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130128e.f129996a;
            if (mMWebView != null) {
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130127d + ")", (ValueCallback<String>) null);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "eval onMiniProgramData, ex = %s", e);
        }
    }
}
