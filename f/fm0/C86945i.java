package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;

/* renamed from: fm0.i */
public class C86945i extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 10;
    public static final String NAME = "hideNavigationBarLoading";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        C86942h hVar = new C86942h(this, gVar, i);
        if ((gVar instanceof C83780d1) || !gVar.getRuntime().mo113039X0()) {
            hVar.run();
        } else {
            gVar.getRuntime().mo113020N0(hVar);
        }
    }
}
