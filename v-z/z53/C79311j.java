package z53;

import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: z53.j */
public class C79311j extends C75790l {

    /* renamed from: d */
    public String f232848d;

    /* renamed from: e */
    public String f232849e;

    /* renamed from: f */
    public String f232850f;

    /* renamed from: g */
    public String f232851g;

    /* renamed from: h */
    public String f232852h;

    public C79311j(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("channel", i + "");
        setRequestData(hashMap);
        this.f232852h = str;
    }

    public int getFuncId() {
        return 1630;
    }

    public int getTenpayCgicmd() {
        return 1630;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/realnameguidequery";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (i == 0 && jSONObject != null) {
            this.f232848d = jSONObject.optString("guide_flag");
            this.f232849e = jSONObject.optString("guide_wording");
            this.f232850f = jSONObject.optString("left_button_wording");
            this.f232851g = jSONObject.optString("right_button_wording");
        }
    }
}
