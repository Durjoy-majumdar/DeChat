package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.d */
public final class C1931d {
    /* renamed from: a */
    public static final String m1941a(String str, String str2) {
        boolean z = true;
        try {
            String string = new JSONObject(str).getString("errMsg");
            C87412m.m108593f(string, "this.getString(\"errMsg\")");
            z = true ^ C112551y.m153819s(string, str2 + XVFSFile.PATH_SEPARATOR_CHAR, false);
        } catch (JSONException unused) {
        }
        if (!z) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        String jSONObject2 = jSONObject.put("errMsg", str2 + XVFSFile.PATH_SEPARATOR_CHAR + str).toString();
        C87412m.m108593f(jSONObject2, "{\n        JSONObject().p…{this}\").toString()\n    }");
        return jSONObject2;
    }
}
