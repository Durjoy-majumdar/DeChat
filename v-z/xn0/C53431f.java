package xn0;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import e00.C45520t;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Map;
import rx3.C13598b0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: xn0.f */
public final class C53431f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f150323d;

    /* renamed from: e */
    public final /* synthetic */ String f150324e;

    /* renamed from: f */
    public final /* synthetic */ C53413e<Object> f150325f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53431f(String str, String str2, C53413e<Object> eVar) {
        super(0);
        this.f150323d = str;
        this.f150324e = str2;
        this.f150325f = eVar;
    }

    public Object invoke() {
        if (C112550d0.m153769E(this.f150323d, "#", 0, false, 6, (Object) null) >= 0) {
            String str = this.f150324e;
            if (!(str == null || str.length() == 0) && !C112551y.m153808h(this.f150324e, "#wechat_redirect", false, 2, (Object) null)) {
                C40478h hVar = this.f150325f.f150279G1;
                if (hVar != null) {
                    MMWebView webView = hVar.getWebView();
                    String format = String.format("window.location=\"%s\"", Arrays.copyOf(new Object[]{C84751i1.m104412a(this.f150323d)}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    webView.evaluateJavascript(format, (ValueCallback<String>) null);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("mView");
                throw null;
            }
        }
        C45520t.C45521a.m50512a(this.f150325f, this.f150323d, (Map) null, false, 6, (Object) null);
        return C13598b0.f38549a;
    }
}
