package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.math.BigDecimal;
import js0.C88020k;
import org.json.JSONObject;

/* renamed from: fm0.e0 */
public final class C86934e0 extends C82016a0<C81879g> {
    private static final int CTRL_INDEX = 413;
    public static final String NAME = "scrollWebviewTo";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81879g gVar = (C81879g) fVar;
        C83780d1 l0 = gVar instanceof C83780d1 ? (C83780d1) gVar : gVar instanceof C81925i2 ? ((C81925i2) gVar).mo114341l0() : null;
        if (l0 == null) {
            return mo115109j("fail:page don't exist");
        }
        long optLong = jSONObject.optLong("duration", 300);
        if (!jSONObject.has("scrollTop")) {
            return mo115109j("fail:invalid data");
        }
        try {
            l0.mo109673t(new C86931d0(this, l0, Math.round(C88020k.m109552c(new BigDecimal(jSONObject.getString("scrollTop")).floatValue())), optLong));
            return mo115109j("ok");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.Jsapi_scrollWebviewTo", "opt scrollTop, e = %s", e);
            return mo115109j("fail:invalid data " + Util.nullAsNil(e.getMessage()));
        }
    }
}
