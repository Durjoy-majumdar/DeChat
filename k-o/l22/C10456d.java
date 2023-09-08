package l22;

import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p193la.C10480b;
import t83.C13848e;

/* renamed from: l22.d */
public class C10456d implements C13848e {

    /* renamed from: a */
    public final /* synthetic */ C10457e f31687a;

    public C10456d(C10457e eVar) {
        this.f31687a = eVar;
    }

    /* renamed from: a */
    public void mo10774a(String str, String str2, Map<String, Object> map) {
        String str3 = str2;
        Map<String, Object> map2 = map;
        if (this.f31687a.f31691c.containsKey(Integer.valueOf(str))) {
            C10457e eVar = this.f31687a;
            eVar.getClass();
            int intValue = Integer.valueOf(str).intValue();
            C10480b bVar = eVar.f31691c.get(Integer.valueOf(intValue));
            HashMap hashMap = map2 != null ? new HashMap(map2) : new HashMap();
            hashMap.put("err_msg", str3);
            JSONObject jSONObject = new JSONObject();
            try {
                if (str3.contains("fail")) {
                    jSONObject.put("result", false);
                    jSONObject.put("errMsg", str3);
                } else {
                    jSONObject.put("result", true);
                    jSONObject.put("errMsg", "");
                }
                jSONObject.put("data", new JSONObject(hashMap));
            } catch (JSONException e) {
                Log.printErrStackTrace("LiteAppJsApiWebViewService", e, "", new Object[0]);
            }
            LiteAppCenter.jsApiCallback(bVar.f31714b, bVar.f31715c, bVar.f31716d, (long) intValue, jSONObject.toString(), false, true);
            this.f31687a.f31691c.remove(Integer.valueOf(str));
        }
    }
}
