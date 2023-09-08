package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;

/* renamed from: t83.v0 */
public class C48611v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130129d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130130e;

    public C48611v0(C48590l lVar, String str) {
        this.f130130e = lVar;
        this.f130129d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130130e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130129d + ")", (ValueCallback<String>) null);
        } catch (Exception unused) {
        }
    }
}
