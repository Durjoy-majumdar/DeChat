package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;

/* renamed from: fm0.p1 */
public class C86971p1 extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 150;
    public static final String NAME = "switchTab";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        String optString = jSONObject.optString("url");
        if (!gVar.getRuntime().mo113008F().mo113985d().mo113990a(optString)) {
            gVar.mo109647a(i, mo115109j("fail:can not switch to non-TabBar page"));
            return;
        }
        C86967o1 o1Var = new C86967o1(this, gVar, optString, i);
        if ((gVar instanceof C83780d1) || !gVar.getRuntime().mo113039X0()) {
            o1Var.run();
        } else {
            gVar.getRuntime().mo113020N0(o1Var);
        }
    }
}
