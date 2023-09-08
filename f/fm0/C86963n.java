package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: fm0.n */
public class C86963n extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 15;
    public static final String NAME = "navigateBack";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        gVar.mo109673t(new C86958m(this, gVar, i, jSONObject, jSONObject.optJSONObject("singlePageData")));
    }
}
