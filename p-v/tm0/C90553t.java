package tm0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;

/* renamed from: tm0.t */
public final class C90553t extends C90551r<C81879g> {

    /* renamed from: h */
    public static final C90554a f260179h = new C90554a((C8480h) null);

    /* renamed from: tm0.t$a */
    public static final class C90554a {
        public C90554a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo124684a(C81879g gVar, Map<String, Object> map) {
            C87412m.m108594g(gVar, "component");
            C87412m.m108594g(map, "data");
            AppBrandRuntime runtime = gVar.getRuntime();
            AppBrandInitConfig W = runtime != null ? runtime.mo113036W() : null;
            if (W == null) {
                Log.m105924i("JsApiGetSystemInfoWC", "initConfig is null, return");
            } else if (W instanceof AppBrandInitConfigWC) {
                AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) W;
                if (appBrandInitConfigWC.f234815R0.mo76931c()) {
                    HalfScreenConfig halfScreenConfig = appBrandInitConfigWC.f234815R0;
                    if (!(!halfScreenConfig.f157951n && halfScreenConfig.f157944d == -1)) {
                        Log.m105924i("JsApiGetSystemInfoWC", "half screen mode, force [screenTop] and [statusBarHeight] to 0");
                        map.put("screenTop", 0);
                        map.put("statusBarHeight", 0);
                    }
                }
            }
        }
    }

    public C90553t() {
        super(new C90534e());
    }

    /* renamed from: w */
    public void mo124683w(C81879g gVar, Map<String, Object> map) {
        C87412m.m108594g(gVar, "component");
        C87412m.m108594g(map, "data");
        f260179h.mo124684a(gVar, map);
    }
}
