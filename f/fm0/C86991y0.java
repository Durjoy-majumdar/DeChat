package fm0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.pointers.PBool;
import org.json.JSONObject;
import qn3.C77382c;

/* renamed from: fm0.y0 */
public class C86991y0 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 389;
    public static final String NAME = "setTabBarBadge";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        try {
            int i2 = jSONObject.getInt(FirebaseAnalytics.C113379b.INDEX);
            String optString = jSONObject.optString("type", "none");
            String optString2 = jSONObject.optString("badgeValue", "");
            String optString3 = jSONObject.optString("badgeColor", "");
            String optString4 = jSONObject.optString("badgeTextColor", "");
            PBool pBool = new PBool();
            pBool.value = false;
            C77382c cVar = new C77382c(optString2);
            cVar.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_2;
            cVar.f225611e = 0;
            cVar.f225610d = 4;
            cVar.f225607a = true;
            cVar.mo107499d(new C86987w0(this, pBool));
            C86989x0 x0Var = new C86989x0(this, i2Var, i, i2, optString, pBool.value ? "…" : optString2, optString3, optString4);
            if (!i2Var.getRuntime().mo113039X0()) {
                x0Var.run();
            } else {
                i2Var.getRuntime().mo113020N0(x0Var);
            }
        } catch (Exception unused) {
            i2Var.mo109647a(i, mo115109j("fail"));
        }
    }
}
