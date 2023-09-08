package z73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: z73.n */
public final class C53761n {

    /* renamed from: a */
    public static final C53761n f150905a = new C53761n();

    /* renamed from: z73.n$a */
    public static final class C53762a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebSearchWebView f150906d;

        /* renamed from: e */
        public final /* synthetic */ String f150907e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53762a(BaseWebSearchWebView baseWebSearchWebView, String str) {
            super(0);
            this.f150906d = baseWebSearchWebView;
            this.f150907e = str;
        }

        public Object invoke() {
            this.f150906d.evaluateJavascript(this.f150907e, (ValueCallback<String>) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo74349a(BaseWebSearchWebView baseWebSearchWebView, String str, String str2) {
        C87412m.m108594g(baseWebSearchWebView, "webView");
        C87412m.m108594g(str, "funcName");
        C87412m.m108594g(str2, "params");
        try {
            Log.m105925i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "notifyJsEvent %s %s", str, str2);
            String format = String.format("javascript:window['%s'] && %s(%s)", Arrays.copyOf(new Object[]{str, str, str2}, 3));
            C87412m.m108593f(format, "format(format, *args)");
            C61926c.m72668M(new C53762a(baseWebSearchWebView, format));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e, "notifyJsEvent", new Object[0]);
        }
    }
}
