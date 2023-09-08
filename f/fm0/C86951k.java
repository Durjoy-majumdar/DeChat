package fm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: fm0.k */
public class C86951k extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "hideTabBar";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C86948j jVar = new C86948j(this, i2Var, i, jSONObject);
        if (!i2Var.getRuntime().mo113039X0()) {
            jVar.run();
        } else {
            i2Var.getRuntime().mo113020N0(jVar);
        }
    }
}
