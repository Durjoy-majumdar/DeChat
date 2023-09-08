package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.json.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.ck */
final class C113600ck extends C113592ce {

    /* renamed from: f */
    public static final String f339983f = "name";

    /* renamed from: g */
    public static final String f339984g = "host";

    /* renamed from: h */
    public static final String f339985h = "host_test";

    /* renamed from: i */
    public static final String f339986i = "https";

    /* renamed from: j */
    public static final String f339987j = "status";

    /* renamed from: b */
    private void m156505b(JSONObject jSONObject) {
        C113603cm cmVar = (C113603cm) JsonUtils.parseToModel(jSONObject, C113603cm.class, new Object[0]);
        C113605co coVar = this.f339971b;
        coVar.f339999a = cmVar.f339997a;
        coVar.f340000b = cmVar.f339998b;
    }

    /* renamed from: a */
    public final void mo171933a(JSONObject jSONObject) {
        C113626di diVar;
        if (jSONObject != null) {
            String optString = jSONObject.optString("name", (String) null);
            if (!TextUtils.isEmpty(optString) && (diVar = (C113626di) mo171915b(optString)) != null) {
                boolean z = true;
                int optInt = jSONObject.optInt("status", 1);
                String optString2 = jSONObject.optString("host", (String) null);
                String optString3 = jSONObject.optString(f339985h, (String) null);
                boolean optBoolean = jSONObject.optBoolean(f339986i, true);
                diVar.f340004c = optInt != 0;
                diVar.f340003b = optBoolean;
                if (!TextUtils.isEmpty(optString2)) {
                    diVar.f340023d = optString2;
                }
                if (!TextUtils.isEmpty(optString3)) {
                    diVar.f340024e = optString3;
                }
                if (optInt != 2) {
                    z = false;
                }
                diVar.f340002a = z;
            }
        }
    }
}
