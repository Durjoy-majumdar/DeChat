package d70;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed;
import di3.C86301e;
import ei3.C86522b;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: d70.d */
public final class C31092d extends C86301e implements C31091c {
    /* renamed from: WY */
    public C82870p mo57974WY() {
        return new JsApiOnWebPageUrlExposed();
    }
}
