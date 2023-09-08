package x32;

import com.tencent.p014mm.plugin.luckymoney.model.C69251n1;
import org.json.JSONObject;

/* renamed from: x32.a */
public class C78764a extends C69251n1 {

    /* renamed from: h */
    public String f230499h;

    public int getType() {
        return 1639;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/cfrequestwxhb";
    }

    /* renamed from: k1 */
    public int mo95404k1() {
        return 0;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f230499h = jSONObject.optString("sendId");
        jSONObject.optString("reqkey");
    }
}
