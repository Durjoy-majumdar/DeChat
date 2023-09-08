package yn0;

import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yn0.a */
public final class C53545a {

    /* renamed from: a */
    public static final String f150510a;

    /* renamed from: b */
    public static final String f150511b;

    /* renamed from: c */
    public static final String f150512c;

    static {
        String str;
        String str2;
        String str3;
        String str4 = "{}";
        try {
            str = new JSONObject().put("err_msg", "system:function_not_exist").toString();
        } catch (JSONException unused) {
            str = str4;
        }
        C87412m.m108593f(str, "try {\n        JSONObject…ion) {\n        \"{}\"\n    }");
        f150510a = str;
        try {
            str2 = new JSONObject().put("err_msg", "system:invalid_data").toString();
        } catch (JSONException unused2) {
            str2 = str4;
        }
        C87412m.m108593f(str2, "try {\n        JSONObject…ion) {\n        \"{}\"\n    }");
        f150511b = str2;
        try {
            str3 = new JSONObject().put("err_msg", "system:invalid_api").toString();
        } catch (JSONException unused3) {
            str3 = str4;
        }
        C87412m.m108593f(str3, "try {\n        JSONObject…ion) {\n        \"{}\"\n    }");
        f150512c = str3;
        try {
            str4 = new JSONObject().put("err_msg", "system:access_denied").toString();
        } catch (JSONException unused4) {
        }
        C87412m.m108593f(str4, "try {\n        JSONObject…ion) {\n        \"{}\"\n    }");
    }
}
