package e21;

import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: e21.m0 */
public class C75482m0 extends C75790l {

    /* renamed from: d */
    public int f221826d;

    /* renamed from: e */
    public int f221827e;

    /* renamed from: f */
    public String f221828f;

    public C75482m0(String str, int i, long j) {
        this.f221828f = str;
        HashMap hashMap = new HashMap();
        hashMap.put("bill_id", str);
        hashMap.put("type", String.valueOf(i));
        hashMap.put("from_timestamp", String.valueOf(j));
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1964;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/f2frmrcvdrcd";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f221826d = jSONObject.optInt("total_num", 0);
        this.f221827e = jSONObject.optInt("total_amt", 0);
        jSONObject.optInt("type", 0);
        jSONObject.optLong("from_timestamp", 0);
    }
}
