package nm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: nm0.g */
public class C11223g extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 64;
    private static final String NAME = "reportIDKey";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        int i2 = i;
        JSONArray optJSONArray = jSONObject.optJSONArray("dataArray");
        if (optJSONArray == null) {
            fVar2.mo109647a(i2, mo115109j("fail"));
            return;
        }
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            try {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                C115669n.INSTANCE.idkeyStat((long) jSONObject2.optInt("id"), (long) jSONObject2.optInt("key"), (long) jSONObject2.optInt("value"), false);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.JsApiReportIDKey", "parse json failed : %s", e.getMessage());
            }
        }
        fVar2.mo109647a(i2, mo115109j("ok"));
    }
}
