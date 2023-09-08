package u73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: u73.c1 */
public class C52458c1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ MMWebView f146578a;

    /* renamed from: b */
    public final /* synthetic */ C52473z0 f146579b;

    public C52458c1(C52473z0 z0Var, MMWebView mMWebView) {
        this.f146579b = z0Var;
        this.f146578a = mMWebView;
    }

    public void onReceiveValue(Object obj) {
        Log.m105925i(this.f146579b.f146616a, "loadJS, sys:init callback %s,view %s", (String) obj, this.f146578a.toString());
    }
}
