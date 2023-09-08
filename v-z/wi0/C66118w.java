package wi0;

import com.google.android.gms.dynamite.ProviderConstants;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C64602o5;
import te3.zq4;

/* renamed from: wi0.w */
public enum C66118w {
    ;

    /* renamed from: a */
    public static C64602o5 m77934a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("AppConfig");
        C64602o5 o5Var = new C64602o5();
        if (optJSONObject != null) {
            JSONArray optJSONArray = optJSONObject.optJSONArray("VersionList");
            o5Var.f184619d = new LinkedList<>();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    zq4 zq4 = new zq4();
                    zq4.f186837d = optJSONObject2.optInt("type");
                    zq4.f186838e = optJSONObject2.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION);
                    o5Var.f184619d.add(zq4);
                }
            }
        }
        return o5Var;
    }
}
