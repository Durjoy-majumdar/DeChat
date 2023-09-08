package yn0;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebFeature;
import gy3.C87412m;
import java.net.URL;
import rq0.C90087f;

/* renamed from: yn0.f */
public final class C53546f implements C83165i, C90087f {

    /* renamed from: d */
    public final WebView f150513d;

    /* renamed from: e */
    public Boolean f150514e;

    public C53546f(WebView webView) {
        C87412m.m108594g(webView, "webview");
        this.f150513d = webView;
    }

    /* renamed from: P0 */
    public void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback) {
        this.f150513d.evaluateJavascript(str3, valueCallback);
    }

    /* renamed from: R0 */
    public void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
        this.f150513d.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: V0 */
    public void mo63305V0() {
        Boolean bool = this.f150514e;
        Boolean bool2 = Boolean.FALSE;
        if (!C87412m.m108589b(bool, bool2)) {
            this.f150513d.onHide();
            this.f150514e = bool2;
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (obj != null) {
            if (!(str == null || str.length() == 0)) {
                this.f150513d.addJavascriptInterface(obj, str);
            }
        }
    }

    public void destroy() {
        this.f150513d.destroy();
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f150513d.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: f0 */
    public void mo63313f0() {
        Boolean bool = this.f150514e;
        Boolean bool2 = Boolean.TRUE;
        if (!C87412m.m108589b(bool, bool2)) {
            this.f150513d.onShow();
            this.f150514e = bool2;
        }
    }

    /* renamed from: n0 */
    public <T extends C40481j> T mo63321n0(Class<T> cls) {
        if (!C87412m.m108589b(C90087f.class, cls) || !this.f150513d.supportFeature(XWebFeature.INTERFACE_SHOW_HIDE)) {
            return null;
        }
        return this;
    }

    public void setJsExceptionHandler(C83164h hVar) {
    }
}
