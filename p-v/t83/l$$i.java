package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130051d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130052e;

    public l$$i(C48590l lVar, String str) {
        this.f130052e = lVar;
        this.f130051d = str;
    }

    public void run() {
        try {
            MMWebView mMWebView = this.f130052e.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f130051d + ")", (ValueCallback<String>) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiHandler", "onVoiceRecordEnd fail, ex = %s", e.getMessage());
        }
    }
}
