package fm0;

import android.text.TextUtils;
import bu0.C79847p;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;
import wq0.C91062d;

/* renamed from: fm0.q0 */
public class C86973q0 extends C82268c<C82554k> {
    private static final int CTRL_INDEX = 238;
    private static final String NAME = "setNavigationBarRightButton";

    public C86973q0() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        C83780d1 l0 = kVar instanceof C83780d1 ? (C83780d1) kVar : ((C81925i2) kVar).mo114341l0();
        C81925i2 b = C82644m7.m101431b(kVar);
        boolean optBoolean = jSONObject.optBoolean("hide", false);
        if (l0 == null) {
            kVar.mo109647a(i, mo115109j("fail:page don't exist"));
        } else if (b == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid js component"));
        } else {
            l0.mo116193r1(!optBoolean);
            if (optBoolean || !(!(this instanceof C86977r1))) {
                kVar.mo109647a(i, mo115109j("ok"));
                return;
            }
            String optString = jSONObject.optString("iconPath");
            if (!TextUtils.isEmpty(optString)) {
                C79847p pVar = new C79847p(optString, new C86966o0(this, kVar, i), b);
                pVar.f233993f = new C86969p0(this, l0, kVar, i);
                pVar.mo110025b();
                return;
            }
            kVar.mo109647a(i, mo115109j("ok"));
        }
    }
}
