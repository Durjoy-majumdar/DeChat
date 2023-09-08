package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import gy3.C87412m;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: fm0.e */
public final class C86933e extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 684;
    @Deprecated
    public static final String NAME = "hideHomeButton";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        C83780d1 a = C82644m7.m101430a(gVar);
        if (a == null) {
            C87412m.m108591d(gVar);
            gVar.mo109647a(i, mo115109j("fail:page don't exist"));
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C86930d(a, gVar, i, this));
    }
}
