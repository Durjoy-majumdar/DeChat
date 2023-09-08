package r73;

import android.webkit.JavascriptInterface;
import gy3.C87412m;

/* renamed from: r73.t */
public final class C47946t extends C47928a<C47947u> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47946t(C47947u uVar) {
        super("wxVideoPrefetcher", uVar);
        C87412m.m108594g(uVar, "context");
    }

    @JavascriptInterface
    public final void cacheVideo(String str) {
        C87412m.m108594g(str, "data");
        ((C47947u) this.f128614b).mo63711c0(str);
    }
}
