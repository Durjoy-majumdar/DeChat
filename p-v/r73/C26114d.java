package r73;

import android.webkit.JavascriptInterface;
import gy3.C87412m;

/* renamed from: r73.d */
public final class C26114d extends C47928a<C26115e> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26114d(C26115e eVar) {
        super("wxAd", eVar);
        C87412m.m108594g(eVar, "context");
    }

    @JavascriptInterface
    public final void clearAdPushMsg(String str, String str2) {
        C87412m.m108594g(str, "slotId");
        C87412m.m108594g(str2, "eventType");
        ((C26115e) this.f128614b).mo23097l0(str, str2);
    }

    @JavascriptInterface
    public final void deleteAd(String str, boolean z) {
        C87412m.m108594g(str, "msgId");
        ((C26115e) this.f128614b).mo23099w0(str, z, false);
    }

    @JavascriptInterface
    public final boolean deleteAdEx(String str, boolean z, boolean z2) {
        C87412m.m108594g(str, "msgId");
        return ((C26115e) this.f128614b).mo23099w0(str, z, z2);
    }

    @JavascriptInterface
    public final String getAdContext(int i) {
        return ((C26115e) this.f128614b).mo23092Q(i);
    }

    @JavascriptInterface
    public final void getAdPushMsg(String str, String str2) {
        C87412m.m108594g(str, "slotId");
        C87412m.m108594g(str2, "eventType");
        ((C26115e) this.f128614b).mo23100x(str, str2);
    }

    @JavascriptInterface
    public final int getCanvasBizPkgVersion() {
        return ((C26115e) this.f128614b).mo23098s0();
    }

    @JavascriptInterface
    public final String getExposedAd() {
        return ((C26115e) this.f128614b).mo23093V();
    }

    @JavascriptInterface
    public final Object getInfo(String str) {
        C87412m.m108594g(str, "key");
        return ((C26115e) this.f128614b).mo23096l(str);
    }

    @JavascriptInterface
    public final void replaceAdData(String str) {
        C87412m.m108594g(str, "data");
        ((C26115e) this.f128614b).mo23094Y(str);
    }

    @JavascriptInterface
    public final void setAdExposeParams(int i, int i2) {
        ((C26115e) this.f128614b).mo23091H(i, i2);
    }

    @JavascriptInterface
    public final void setAdInsertType(int i) {
        ((C26115e) this.f128614b).mo23095j0(i);
    }

    @JavascriptInterface
    public final boolean setQuota(int i) {
        return ((C26115e) this.f128614b).mo23090A0(i);
    }
}
