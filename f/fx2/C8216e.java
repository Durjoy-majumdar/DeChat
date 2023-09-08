package fx2;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fx2.e */
public final class C8216e extends C82268c<C82381f> {
    public static final String NAME = "reportKeyValue";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        try {
            C87412m.m108591d(jSONObject);
            JSONArray jSONArray = jSONObject.getJSONArray("dataArray");
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string = jSONObject2.getString("key");
                C87412m.m108593f(string, "jsonObject.getString(\"key\")");
                int parseInt = Integer.parseInt(string);
                String string2 = jSONObject2.getString("value");
                Log.m105925i("MicroMsg.SurfaceApp.JsApiReportKeyValue", "report kv_%d{value='%s'}", Integer.valueOf(parseInt), string2);
                C115669n.INSTANCE.kvStat(parseInt, string2);
            }
            if (fVar != null) {
                fVar.mo109647a(i, mo115109j("ok"));
            }
        } catch (JSONException unused) {
        }
        if (fVar != null) {
            fVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
