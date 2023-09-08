package fm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: fm0.c1 */
public class C86929c1 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 417;
    public static final String NAME = "setTabBarStyle";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C81634a.C81643i d = i2Var.getRuntime().mo113008F().mo113985d();
        C86928b1 b1Var = new C86928b1(this, i2Var, i, jSONObject.optString("color", d.f239639b), jSONObject.optString("selectedColor", d.f239640c), jSONObject.optString("backgroundColor", d.f239641d), jSONObject.optString("borderStyle", d.f239642e));
        if (!i2Var.getRuntime().mo113039X0()) {
            b1Var.run();
        } else {
            i2Var.getRuntime().mo113020N0(b1Var);
        }
    }
}
