package pd2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pd2.c */
public class C77081c extends C75790l {

    /* renamed from: d */
    public List<C77083g> f225142d = null;

    /* renamed from: e */
    public List<C62260b> f225143e = null;

    /* renamed from: f */
    public int f225144f;

    /* renamed from: g */
    public String f225145g;

    public C77081c(int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Limit", i + "");
        hashMap.put("Offset", i2 + "");
        hashMap.put("Extbuf", str);
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 105;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("MicroMsg.NetScenePatchQueryUserRoll", "errCode " + i + " errMsg: " + str);
        this.f225142d = new LinkedList();
        try {
            this.f225144f = jSONObject.getInt("TotalNum");
            jSONObject.getInt("RecNum");
            this.f225145g = jSONObject.optString("Extbuf");
            JSONArray jSONArray = jSONObject.getJSONArray("UserRollList");
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    C77083g gVar = new C77083g();
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    gVar.f225157o = jSONObject2.optInt("PayType");
                    gVar.f225149d = jSONObject2.optString("Transid");
                    gVar.f225150e = jSONObject2.optDouble("TotalFee");
                    gVar.f225151f = jSONObject2.optString("GoodsName");
                    gVar.f225152g = jSONObject2.optInt("CreateTime");
                    gVar.f225154i = jSONObject2.optInt("ModifyTime");
                    gVar.f225155j = jSONObject2.optString("FeeType");
                    gVar.f225161s = jSONObject2.optString("AppThumbUrl");
                    gVar.f225153h = jSONObject2.optString("TradeStateName");
                    gVar.f225166x = jSONObject2.optString("StatusColor");
                    gVar.f225167y = jSONObject2.optString("FeeColor");
                    gVar.f225168z = jSONObject2.optDouble("ActualPayFee");
                    gVar.f225148A = jSONObject2.optString("BillId");
                    this.f225142d.add(gVar);
                }
            }
            this.f225143e = new LinkedList();
            JSONArray optJSONArray = jSONObject.optJSONArray("month_info");
            if (optJSONArray != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i3);
                    C62260b bVar = new C62260b();
                    bVar.f176975d = jSONObject3.optInt("year");
                    bVar.f176976e = jSONObject3.optInt("month");
                    bVar.f176977f = jSONObject3.optString("feetext");
                    this.f225143e.add(bVar);
                }
            }
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.NetScenePatchQueryUserRoll", "Parse Json exp:" + e.getLocalizedMessage());
        }
    }
}
