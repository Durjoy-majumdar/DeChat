package gy0;

import android.webkit.JavascriptInterface;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import q73.C89546e;
import r73.C47928a;

/* renamed from: gy0.a */
public final class C87409a extends C47928a<C87410b> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87409a(C87410b bVar) {
        super("wxBizCanvas", bVar);
        C87412m.m108594g(bVar, "context");
    }

    @JavascriptInterface
    public final void adRequest(String str, String str2, String str3) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str2, "subType");
        C87412m.m108594g(str3, "callback");
        ((C87410b) this.f128614b).mo118098W0(str, str2, str3);
    }

    @JavascriptInterface
    public final void canvasRequest(Number number, String str, String str2) {
        C87412m.m108594g(number, "businessId");
        C87412m.m108594g(str, "reqJson");
        C87412m.m108594g(str2, "callback");
        ((C87410b) this.f128614b).mo118097P(number, str, str2);
    }

    @JavascriptInterface
    public final void deleteCanvasCard(String str) {
        C87412m.m108594g(str, "fieldId");
        ((C87410b) this.f128614b).mo118096O0(str);
    }

    @JavascriptInterface
    public final String getData() {
        return ((C87410b) this.f128614b).getData();
    }

    @JavascriptInterface
    public final Object getInfo(String str) {
        C87412m.m108594g(str, "key");
        return ((C87410b) this.f128614b).mo118100l(str);
    }

    @JavascriptInterface
    public final void onItemClick(String str, int i) {
        C87412m.m108594g(str, "fieldId");
        ((C87410b) this.f128614b).mo118101v0(str, i);
    }

    @JavascriptInterface
    public final void preloadImage(String str) {
        C87412m.m108594g(str, "url");
        new C89546e().mo109803b(str, new ImageDecodeConfig());
    }
}
