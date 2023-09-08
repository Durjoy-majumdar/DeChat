package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C77912ce0;

/* renamed from: com.tencent.mm.plugin.remittance.model.b */
public class C70581b {
    /* renamed from: a */
    public static C77912ce0 m83111a(JSONObject jSONObject) {
        C77912ce0 ce02 = new C77912ce0();
        ce02.f227129s = jSONObject.optString("business_receipt_no");
        ce02.f227131u = jSONObject.optString("extend_str");
        ce02.f227123j = jSONObject.optString("fav_desc");
        ce02.f227121h = jSONObject.optLong("fav_id", 0);
        ce02.f227122i = jSONObject.optString("fav_name");
        ce02.f227126p = jSONObject.optString("fav_price");
        ce02.f227119f = jSONObject.optLong("fav_property", 0);
        ce02.f227128r = jSONObject.optInt("fav_scope_type", 0);
        ce02.f227118e = jSONObject.optLong("fav_sub_type", 0);
        ce02.f227117d = jSONObject.optLong("fav_type", 0);
        ce02.f227125o = jSONObject.optString("favor_remarks");
        ce02.f227120g = jSONObject.optString("favor_type_desc");
        ce02.f227124n = jSONObject.optString("favor_use_manual");
        ce02.f227127q = jSONObject.optString("real_fav_fee");
        ce02.f227130t = jSONObject.optInt("unavailable");
        return ce02;
    }

    /* renamed from: b */
    public static LinkedList<C77912ce0> m83112b(JSONArray jSONArray) {
        LinkedList<C77912ce0> linkedList = new LinkedList<>();
        if (jSONArray == null) {
            return linkedList;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                linkedList.add(m83111a(jSONArray.getJSONObject(i)));
                i++;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BusiFavorInfoParser", e, "", new Object[0]);
            }
        }
        return linkedList;
    }
}
