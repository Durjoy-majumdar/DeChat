package no0;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p1210qc.C118175b;
import p225rc.C89923l;
import pl0.C118022a;
import pl0.C118080q;
import pl0.C118116u;

/* renamed from: no0.g */
public class C117633g extends C118175b {
    /* renamed from: ao */
    public C118080q mo182359ao(Context context, String str, Map<String, Object> map) {
        if (context == null) {
            return null;
        }
        int d = C118116u.m166639d(map, "mapType", 1);
        int i = 0;
        int d2 = C118116u.m166639d(map, "enableDarkMode", 0);
        if (C89923l.f258408a.mo117495a()) {
            i = d2;
        }
        map.put("enableDarkMode", Integer.valueOf(i));
        map.put("isOverseasUser", Boolean.valueOf(mo1823a()));
        return d == 2 ? new C117632f(context, str, map) : new C118022a(context, str, map);
    }

    public C118080q p00(C82381f fVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null) {
            try {
                jSONObject2.put("mapType", 1);
                boolean optBoolean = jSONObject2.optBoolean("enableDarkMode", false);
                if (!C89923l.f258408a.mo117495a()) {
                    optBoolean = false;
                }
                jSONObject2.put("enableDarkMode", optBoolean ? 1 : 0);
            } catch (JSONException e) {
                Log.printInfoStack("MicroMsg.WxaMapViewFactory", "", e);
            }
        }
        if (fVar == null || jSONObject2 == null) {
            return null;
        }
        Context context = fVar.getContext();
        String optString = jSONObject2.optString("theme", "");
        int optInt = jSONObject2.optInt("mapType", 1);
        String optString2 = jSONObject2.optString("subKey", "");
        String appId = fVar.getAppId();
        String optString3 = jSONObject2.optString("pluginId", "");
        if (!TextUtils.isEmpty(optString3)) {
            appId = optString3;
        }
        int optInt2 = jSONObject2.optInt("styleId", 0);
        String b = C118116u.m166637b(fVar, jSONObject);
        int optInt3 = jSONObject2.optInt("enableDarkMode", 0);
        boolean optBoolean2 = jSONObject2.optBoolean("enableMSAA", false);
        Context context2 = context;
        HashMap hashMap = new HashMap(5);
        hashMap.put("theme", optString);
        hashMap.put("mapType", Integer.valueOf(optInt));
        hashMap.put("subKey", optString2);
        hashMap.put("subId", appId);
        hashMap.put("styleId", Integer.valueOf(optInt2));
        hashMap.put("enableDarkMode", Integer.valueOf(optInt3));
        hashMap.put("isOverseasUser", Boolean.valueOf(mo1823a()));
        hashMap.put("enableMSAA", Boolean.valueOf(optBoolean2));
        return new C118022a(context2, b, hashMap);
    }
}
