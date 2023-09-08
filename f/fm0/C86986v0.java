package fm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: fm0.v0 */
public class C86986v0 extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 197;
    private static final String NAME = "setStatusBarStyle";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C86983u0 u0Var = new C86983u0(this, jSONObject, i2Var, i);
        if (!i2Var.getRuntime().mo113039X0()) {
            u0Var.run();
        } else {
            i2Var.getRuntime().mo113020N0(u0Var);
        }
    }
}
