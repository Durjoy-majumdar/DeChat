package yd1;

import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C49982je3;

/* renamed from: yd1.a */
public final class C15962a {

    /* renamed from: a */
    public static final C15962a f42858a = new C15962a();

    /* renamed from: a */
    public final JSONObject mo14614a(C49982je3 je32, int i, String str) {
        C87412m.m108594g(str, "tabKey");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, i);
            StringBuilder sb = new StringBuilder();
            String str2 = null;
            String str3 = je32 != null ? je32.f136060o : null;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            sb.append(str3);
            sb.append('-');
            String str5 = je32 != null ? je32.f136061p : null;
            if (str5 == null) {
                str5 = str4;
            }
            sb.append(str5);
            sb.append('-');
            String str6 = je32 != null ? je32.f136062q : null;
            if (str6 == null) {
                str6 = str4;
            }
            sb.append(str6);
            sb.append('-');
            if (je32 != null) {
                str2 = je32.f136056h;
            }
            if (str2 != null) {
                str4 = str2;
            }
            sb.append(str4);
            jSONObject.put("poi_info", sb.toString());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
