package p284zb;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82530h7;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: zb.u */
public class C91658u extends C82530h7 {
    /* renamed from: a */
    public void mo114862a(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "config");
        super.mo114862a(jSONObject);
        try {
            jSONObject.put("isIsolateContext", Boolean.TRUE);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WASnapshotConfigProvider", e, "put with key(" + "isIsolateContext" + ')', new Object[0]);
        }
    }
}
