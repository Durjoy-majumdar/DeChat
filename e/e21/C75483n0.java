package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e21.n0 */
public class C75483n0 extends C75790l {

    /* renamed from: d */
    public boolean f221829d;

    /* renamed from: e */
    public boolean f221830e;

    /* renamed from: f */
    public int f221831f;

    /* renamed from: g */
    public int f221832g;

    /* renamed from: h */
    public int f221833h;

    /* renamed from: i */
    public int f221834i;

    /* renamed from: j */
    public long f221835j;

    /* renamed from: n */
    public String f221836n;

    /* renamed from: o */
    public List<C75480d0> f221837o;

    public C75483n0(int i, long j, int i2, int i3, int i4) {
        this.f221829d = false;
        this.f221830e = false;
        this.f221837o = new ArrayList();
        this.f221832g = i2;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "" + i);
        hashMap.put("from_timestamp", "" + j);
        hashMap.put("direction_flag", "" + i2);
        hashMap.put("num", "" + i3);
        hashMap.put("choose_flag", "" + i4);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1993;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/f2frcvrcdhissta";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "json: %s", jSONObject.toString());
        this.f221831f = jSONObject.optInt("choose_flag", 0);
        this.f221835j = jSONObject.optLong("from_timestamp", -1);
        this.f221833h = jSONObject.optInt("finish_flag", 0);
        this.f221834i = jSONObject.optInt("try_num", 0);
        this.f221836n = jSONObject.optString("retmsg", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("records");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            Log.m105924i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "empty records");
        } else {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    C75480d0 d0Var = new C75480d0();
                    d0Var.f221805a = jSONObject2.optInt("type", 0);
                    d0Var.f221806b = jSONObject2.optLong("from_timestamp", 0);
                    d0Var.f221807c = jSONObject2.optInt("total_num", 0);
                    d0Var.f221808d = jSONObject2.optInt("total_amt", 0);
                    ((ArrayList) this.f221837o).add(d0Var);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneTenpayF2fHistoryRecordList", e, "", new Object[0]);
                }
            }
        }
        if (this.f221833h == 1) {
            Log.m105924i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "finish query");
            this.f221829d = true;
        }
    }

    public C75483n0(int i, long j, int i2, int i3, int i4, int i5) {
        this.f221829d = false;
        this.f221830e = false;
        this.f221837o = new ArrayList();
        this.f221830e = true;
        this.f221832g = i2;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "" + i);
        hashMap.put("from_timestamp", "" + j);
        hashMap.put("direction_flag", "" + i2);
        hashMap.put("num", "" + i3);
        hashMap.put("choose_flag", "" + i4);
        hashMap.put("try_num", "" + i5);
        setRequestData(hashMap);
    }
}
