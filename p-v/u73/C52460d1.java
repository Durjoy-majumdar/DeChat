package u73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: u73.d1 */
public class C52460d1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ MMWebView f146584a;

    /* renamed from: b */
    public final /* synthetic */ C52473z0 f146585b;

    public C52460d1(C52473z0 z0Var, MMWebView mMWebView) {
        this.f146585b = z0Var;
        this.f146584a = mMWebView;
    }

    public void onReceiveValue(Object obj) {
        Log.m105925i(this.f146585b.f146616a, "loadJS, sys:bridged callback %s,view %s", (String) obj, this.f146584a.toString());
    }
}
