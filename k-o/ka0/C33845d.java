package ka0;

import gy3.C87412m;
import org.json.JSONObject;
import rh3.C36327a;

/* renamed from: ka0.d */
public final class C33845d extends C36327a {

    /* renamed from: a */
    public int f91476a;

    /* renamed from: b */
    public int f91477b;

    /* renamed from: c */
    public int f91478c;

    /* renamed from: d */
    public int f91479d;

    /* renamed from: e */
    public String f91480e = "";

    /* renamed from: f */
    public String f91481f = "";

    /* renamed from: b */
    public C36327a mo59317b(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "jsonObj");
        this.f91477b = jSONObject.optInt("compatVersion");
        this.f91478c = jSONObject.optInt("resVersion");
        this.f91479d = jSONObject.optInt("baseVersion");
        String optString = jSONObject.optString("sha1");
        C87412m.m108593f(optString, "jsonObj.optString(\"sha1\")");
        this.f91480e = optString;
        String optString2 = jSONObject.optString("fullSha1");
        C87412m.m108593f(optString2, "jsonObj.optString(\"fullSha1\")");
        this.f91481f = optString2;
        return this;
    }

    /* renamed from: c */
    public final boolean mo59318c() {
        if (this.f91478c > 0 && this.f91479d > 0) {
            if (this.f91480e.length() > 0) {
                if (this.f91481f.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return "MaasSdkResConfig(compatVersion=" + this.f91477b + ", resVersion=" + this.f91478c + ", baseVersion=" + this.f91479d + ", sha1='" + this.f91480e + "', fullSha1='" + this.f91481f + "')";
    }
}
