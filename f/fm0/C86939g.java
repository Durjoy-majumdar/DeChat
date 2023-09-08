package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;

/* renamed from: fm0.g */
public final class C86939g extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 578;
    @Deprecated
    public static final String NAME = "hideNavigationBar";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null) {
            C86936f fVar2 = new C86936f(gVar, i, this);
            if ((gVar instanceof C83780d1) || !gVar.getRuntime().mo113039X0()) {
                fVar2.run();
            } else {
                gVar.getRuntime().mo113020N0(fVar2);
            }
        }
    }
}
