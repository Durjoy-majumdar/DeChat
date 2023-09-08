package k22;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import p193la.C10479a;
import p235sm.C90233i0;
import sl0.C90223g;

/* renamed from: k22.f */
public final class C88074f {

    /* renamed from: a */
    public HashMap<String, C10479a> f254728a = new HashMap<>();

    public C88074f() {
        long currentTimeMillis = System.currentTimeMillis();
        C82870p Qf0 = ((C90233i0) C86312j.m106911c(C90233i0.class)).Qf0();
        C87412m.m108593f(Qf0, "getService(IAppBrandMagi…ateJsApiGetABTestConfig()");
        this.f254728a.put(Qf0.mo114779e(), new C88073e(Qf0));
        C90223g gVar = new C90223g();
        this.f254728a.put(gVar.mo114779e(), new C88073e(gVar));
        Log.m105925i("WxaLiteApp.LiteAppJsApiAppBrandJsApiPool", "init AppBrandServiceJsApiPool takes %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
