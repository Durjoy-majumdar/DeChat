package fm0;

import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83887q3;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: fm0.s1 */
public class C86980s1 extends C86975r<C81879g, C83887q3> {
    @Deprecated
    public static final int CTRL_INDEX = 584;
    @Deprecated
    public static final String NAME = "private_setPageOrientation";

    public C86980s1() {
        super(C83887q3.class);
    }

    /* renamed from: w */
    public void mo121371w(C81879g gVar, JSONObject jSONObject, int i, Object obj) {
        C83887q3 q3Var = (C83887q3) obj;
        C87412m.m108594g(gVar, "env");
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(q3Var, "ext");
        String optString = jSONObject.optString("orientation", (String) null);
        if (optString == null) {
            gVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else if (C79778e.C79780b.m96933b(optString) == null) {
            gVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(mo114779e(), optString);
            C13598b0 b0Var = C13598b0.f38549a;
            q3Var.mo116470n(optString, hashMap);
            gVar.mo109647a(i, mo115109j("ok"));
        }
    }
}
