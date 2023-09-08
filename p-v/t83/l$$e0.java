package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130038d;

    /* renamed from: e */
    public final /* synthetic */ String f130039e;

    /* renamed from: f */
    public final /* synthetic */ C48590l f130040f;

    public l$$e0(C48590l lVar, String str, String str2) {
        this.f130040f = lVar;
        this.f130038d = str;
        this.f130039e = str2;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130040f.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130038d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "%s fail, ex = %s", this.f130039e, e.getMessage());
        }
    }
}
