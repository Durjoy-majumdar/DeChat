package l22;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p193la.C10480b;
import p244tt.C14092g;
import t83.C13851h1;
import t83.C13854i1;

/* renamed from: l22.a */
public class C10451a extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        C10457e eVar;
        Log.m105924i("LiteAppBridgeWebViewJsApi", "invoke " + this.f31712d);
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        synchronized (C10457e.class) {
            if (C10457e.f31688d == null) {
                C10457e.f31688d = new C10457e();
            }
            eVar = C10457e.f31688d;
        }
        String jSONObject2 = jSONObject.toString();
        eVar.getClass();
        eVar.f31691c.put(Integer.valueOf((int) this.f19814e.f31717e), this.f19814e);
        C14092g gVar = eVar.f31690b;
        C10456d dVar = new C10456d(eVar);
        C10452b bVar = (C10452b) gVar;
        bVar.getClass();
        try {
            C13851h1 c = C13854i1.m13150c(this.f31712d, jSONObject2, String.valueOf(this.f19814e.f31717e));
            ((HashMap) c.f38983a).put("liteAppId", this.f19814e.f31714b);
            ((HashMap) c.f38983a).put("liteAppUuid", Integer.valueOf(this.f19814e.f31713a));
            ((HashMap) c.f38983a).put("liteAppPtr", Long.valueOf(this.f19814e.f31715c));
            C10480b bVar2 = this.f19814e;
            bVar.f31678b = bVar2.f31715c;
            bVar.f31679c = bVar2.f31713a;
            bVar.f31677a.f129998c = mo5676d();
            bVar.f31677a.mo63613h(c, dVar);
            bVar.f31677a.f129998c = null;
        } catch (JSONException e) {
            this.f19814e.mo10783a("params error", (JSONObject) null, false);
            Log.printErrStackTrace("LiteAppJsApiBridgeWebViewHandler", e, "", new Object[0]);
        }
    }
}
