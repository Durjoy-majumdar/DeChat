package m63;

import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: m63.e */
public class C76750e {

    /* renamed from: a */
    public String f224519a;

    /* renamed from: b */
    public String f224520b;

    /* renamed from: c */
    public String f224521c;

    /* renamed from: d */
    public String f224522d;

    /* renamed from: e */
    public String f224523e;

    /* renamed from: f */
    public String f224524f;

    /* renamed from: g */
    public String f224525g;

    /* renamed from: h */
    public String f224526h;

    /* renamed from: i */
    public String f224527i;

    public C76750e(String str, String str2, String str3) {
        this.f224519a = str;
        this.f224524f = str2;
        JSONObject jSONObject = new JSONObject(this.f224524f);
        this.f224520b = jSONObject.optString("orderId");
        jSONObject.optString("packageName");
        this.f224521c = jSONObject.optString("productId");
        jSONObject.optLong("purchaseTime");
        jSONObject.optInt("purchaseState");
        String optString = jSONObject.optString("developerPayload");
        ArrayList arrayList = new ArrayList();
        String str4 = optString;
        while (str4.indexOf("[#]") >= 0) {
            String substring = str4.substring(0, str4.indexOf("[#]"));
            str4 = str4.substring(substring.length() + 3);
            arrayList.add(substring);
        }
        arrayList.add(str4);
        if (arrayList.size() == 3) {
            this.f224522d = (String) arrayList.get(0);
            this.f224527i = (String) arrayList.get(1);
            this.f224526h = (String) arrayList.get(2);
        } else {
            this.f224522d = optString;
        }
        this.f224523e = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, jSONObject.optString("purchaseToken"));
        this.f224525g = str3;
    }

    public String toString() {
        return "PurchaseInfo(type:" + this.f224519a + "):" + this.f224524f;
    }

    public C76750e(String str, String str2, String str3, String str4) {
        this.f224521c = str;
        this.f224522d = str2;
        this.f224526h = str3;
        this.f224527i = str4;
    }
}
