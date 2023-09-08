package u73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: u73.b1 */
public class C52457b1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ MMWebView f146576a;

    /* renamed from: b */
    public final /* synthetic */ C52473z0 f146577b;

    public C52457b1(C52473z0 z0Var, MMWebView mMWebView) {
        this.f146577b = z0Var;
        this.f146576a = mMWebView;
    }

    public void onReceiveValue(Object obj) {
        Log.m105925i(this.f146577b.f146616a, "loadJavaScript, jsContent evaluateJavascript cb, ret = %s, view %s", (String) obj, this.f146576a.toString());
    }
}
