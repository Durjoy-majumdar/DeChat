package km0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import p224ra.C89909e;

/* renamed from: km0.d */
public final class C88227d {
    /* renamed from: a */
    public static final String m109877a(C82381f fVar, C88225b bVar, JSONObject jSONObject) {
        C87412m.m108594g(bVar, "referrerPolicyContainer");
        C87412m.m108594g(jSONObject, "data");
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.Referrers", "updateReferrers, component is null");
            return null;
        }
        C88224a aVar = (C88224a) C89909e.m112436a(C88224a.class);
        if (aVar == null) {
            Log.m105928w("MicroMsg.AppBrand.Referrers", "updateReferrers, referrerHelper is null");
            return null;
        }
        if (bVar.getReferrerPolicy() == null) {
            bVar.setReferrerPolicy(aVar.mo117491e4());
        }
        C88226c f2 = aVar.mo117493f2(jSONObject, fVar);
        if (f2 != null) {
            bVar.setReferrerPolicy(f2);
        }
        Log.m105924i("MicroMsg.AppBrand.Referrers", "updateReferrers, referrerPolicy: " + bVar.getReferrerPolicy());
        if (C88226c.NO_REFERRER == bVar.getReferrerPolicy()) {
            return null;
        }
        String A4 = aVar.mo117489A4(fVar);
        Log.m105924i("MicroMsg.AppBrand.Referrers", "updateReferrers, mReferrer: " + A4);
        return A4;
    }
}
