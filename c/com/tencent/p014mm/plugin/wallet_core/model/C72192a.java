package com.tencent.p014mm.plugin.wallet_core.model;

import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.a */
public class C72192a {

    /* renamed from: a */
    public int f209712a;

    /* renamed from: b */
    public Orders.ShowInfo f209713b;

    /* renamed from: a */
    public static C72192a m84570a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C72192a aVar = new C72192a();
        aVar.f209712a = jSONObject.optInt("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("show_info");
        if (optJSONObject != null) {
            Orders.ShowInfo showInfo = new Orders.ShowInfo();
            showInfo.f209698d = optJSONObject.optString("name");
            showInfo.f209699e = optJSONObject.optString("value");
            showInfo.f209706o = optJSONObject.optInt("value_attr");
            showInfo.f209700f = optJSONObject.optString("name_color");
            showInfo.f209701g = optJSONObject.optString("value_color");
            aVar.f209713b = showInfo;
        }
        return aVar;
    }
}
