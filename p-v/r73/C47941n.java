package r73;

import android.webkit.JavascriptInterface;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;

/* renamed from: r73.n */
public final class C47941n extends C47928a<C47942o> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47941n(C47942o oVar) {
        super("wxMessage", oVar);
        C87412m.m108594g(oVar, "context");
    }

    @JavascriptInterface
    public final void postMessage(String str, String str2) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str2, "targetOrigin");
        ((C47942o) this.f128614b).mo72710M(str, str2);
    }
}
