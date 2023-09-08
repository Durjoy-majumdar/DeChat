package fm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: fm0.l1 */
public class C86957l1 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "showTabBar";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C86953k1 k1Var = new C86953k1(this, i2Var, i, jSONObject);
        if (!i2Var.getRuntime().mo113039X0()) {
            k1Var.run();
        } else {
            i2Var.getRuntime().mo113020N0(k1Var);
        }
    }
}
