package sx0;

import android.webkit.JavascriptInterface;
import gy3.C87412m;
import r73.C47928a;

/* renamed from: sx0.a */
public final class C48487a extends C47928a<C48488b> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48487a(C48488b bVar) {
        super("WxGameJsCoreNative", bVar);
        C87412m.m108594g(bVar, "context");
    }

    @JavascriptInterface
    public final void error(String str) {
        ((C48488b) this.f128614b).error(str);
    }

    @JavascriptInterface
    public final void log(String str) {
        ((C48488b) this.f128614b).mo60867u(str);
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        ((C48488b) this.f128614b).mo60868v(str);
    }
}
