package tj0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;
import uj0.C90665a;
import uj0.C90667c;
import uj0.C90668d;

/* renamed from: tj0.c */
public class C90507c extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 688;
    public static final String NAME = "reportCanvasData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Class cls = C90665a.class;
        Log.m105924i("MicroMsg.JsApiReportCanvasData", "hy: request report canvas data");
        String optString = jSONObject.optString("eventInfo");
        int optInt = jSONObject.optInt("viewId", 0);
        if (eVar.mo114341l0() == null || eVar.mo114341l0().mo116150E0(cls) == null) {
            Log.m105928w("MicroMsg.JsApiReportCanvasData", "hy: current is not game");
            return;
        }
        C90668d V = ((C90665a) eVar.mo114341l0().mo116150E0(cls)).mo124807V();
        if (V != null) {
            Log.m105919d("MicroMsg.WAGameCanvasSecurityGuard", "hy: trigger event : %s", optString);
            V.f260490c.postToWorker(new C90667c(V, optInt, optString));
            return;
        }
        Log.m105920e("MicroMsg.JsApiReportCanvasData", "hy: guard is null!");
    }
}
