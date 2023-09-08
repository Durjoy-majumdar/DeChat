package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e21.o0 */
public class C75485o0 extends C75790l {

    /* renamed from: d */
    public int f221838d;

    /* renamed from: e */
    public int f221839e;

    /* renamed from: f */
    public long f221840f;

    /* renamed from: g */
    public int f221841g;

    /* renamed from: h */
    public List<C75479d> f221842h = new ArrayList();

    /* renamed from: i */
    public int f221843i;

    /* renamed from: j */
    public boolean f221844j = false;

    public C75485o0(int i, long j, String str, int i2) {
        this.f221843i = i2;
        HashMap hashMap = new HashMap();
        hashMap.put("type", String.valueOf(i));
        hashMap.put("from_timestamp", String.valueOf(j));
        hashMap.put("last_bill_id", str);
        hashMap.put("num", String.valueOf(i2));
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1963;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/f2frcvdlist";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f221838d = jSONObject.optInt("total_num");
        this.f221839e = jSONObject.optInt("total_amt");
        this.f221840f = jSONObject.optLong("from_timestamp", 0);
        this.f221841g = jSONObject.optInt("type", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("records");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            Log.m105924i("MicroMsg.NetSceneTenpayF2fRecordList", "empty records");
        } else {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    ((ArrayList) this.f221842h).add(C75479d.m90510a(optJSONArray.getJSONObject(i2)));
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneTenpayF2fRecordList", e, "", new Object[0]);
                }
            }
        }
        if (((ArrayList) this.f221842h).size() < this.f221843i) {
            Log.m105924i("MicroMsg.NetSceneTenpayF2fRecordList", "finish query");
            this.f221844j = true;
        }
    }
}
