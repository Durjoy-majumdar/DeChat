package vk0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.C82274d;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import kg3.C76577a;
import mj0.C88734d;
import org.json.JSONObject;
import p635os.C89291d;
import uj0.C90675f;
import wi0.C90988l;

/* renamed from: vk0.m */
public final class C90819m extends C82274d {
    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "component");
        if ((fVar instanceof C90675f) || (fVar instanceof C88734d)) {
            Boolean Qq0 = ((C89291d) C86312j.m106911c(C89291d.class)).Qq0(fVar.getAppId(), ((C90988l) fVar.mo109671p(C90988l.class)).f261072r.f238585d);
            C87412m.m108593f(Qq0, "getService(IGameLiveComm…ass.java).appDebugType())");
            if (Qq0.booleanValue()) {
                Log.m105924i("MicroMsg.JsApiInsertCameraWC", "is game living");
                fVar.mo109647a(i, mo115109j("fail: " + C76577a.m92166q(fVar.getContext(), C0966R.string.a5e)));
                return;
            }
        }
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }
}
