package kr0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82547i7;
import gy3.C87412m;
import org.json.JSONObject;
import p284zb.C91658u;
import rx3.C13598b0;

/* renamed from: kr0.h1 */
public final class C88275h1 extends C91658u {
    /* renamed from: a */
    public void mo114862a(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "config");
        super.mo114862a(jSONObject);
        C82547i7.C82548a aVar = C82547i7.f241644a;
        JSONObject jSONObject2 = new JSONObject();
        aVar.mo114875a(jSONObject2, "env", "WeChat");
        C13598b0 b0Var = C13598b0.f38549a;
        aVar.mo114875a(jSONObject, "host", jSONObject2);
    }
}
