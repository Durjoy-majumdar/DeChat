package y63;

import com.tencent.p014mm.sdk.platformtools.Util;
import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: y63.c */
public class C79059c extends C45440a {

    /* renamed from: d */
    public String f232158d;

    /* renamed from: e */
    public String f232159e;

    public C79059c() {
        this("");
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 23;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f232158d = jSONObject.optString("id");
        this.f232159e = jSONObject.optString("description");
    }

    public C79059c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("payu_reference", Util.nullAs(str, ""));
        setRequestData(hashMap);
    }
}
