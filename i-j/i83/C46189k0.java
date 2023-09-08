package i83;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.WebViewTransHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: i83.k0 */
public final class C46189k0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WebViewTransHelper f124494d;

    public C46189k0(WebViewTransHelper webViewTransHelper) {
        this.f124494d = webViewTransHelper;
    }

    public final void onChanged(Object obj) {
        Log.m105924i("MicroMsg.WebViewTransHelper", "liveDataMerger -> " + obj);
        if (obj instanceof C46191m) {
            if (obj == C46191m.NeedTrans || obj == C46191m.NotSure) {
                WebViewTransHelper webViewTransHelper = this.f124494d;
                webViewTransHelper.getClass();
                Log.m105924i("MicroMsg.WebViewTransHelper", "startTrans");
                webViewTransHelper.f117508h.setValue(C46176a0.DoTrans);
                webViewTransHelper.mo67655b().mo71624c();
            } else if (this.f124494d.mo67655b().f124539v.getValue() == C46191m.NoNeedTrans) {
                C76879j.m92748s(this.f124494d.f117504d.f118667d.getContext(), this.f124494d.f117504d.f118667d.getContext().getString(C0966R.string.lgi), "");
                return;
            } else {
                C76879j.m92748s(this.f124494d.f117504d.f118667d.getContext(), this.f124494d.f117504d.f118667d.getContext().getString(C0966R.string.lgk), "");
                return;
            }
        }
        WebViewTransHelper.m46993a(this.f124494d);
    }
}
