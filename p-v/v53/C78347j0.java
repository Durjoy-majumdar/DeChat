package v53;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import org.json.JSONObject;

/* renamed from: v53.j0 */
public class C78347j0 extends C75790l {

    /* renamed from: d */
    public String f229582d;

    /* renamed from: e */
    public String f229583e;

    /* renamed from: f */
    public double f229584f;

    public int getFuncId() {
        return 1689;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/transfergetchargefee";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("Micromsg.NetSceneTransferChargeQuery", "errCode " + i + " errMsg: " + str);
        if (i != 0) {
            Log.m105924i("Micromsg.NetSceneTransferChargeQuery", "NetSceneTransferChargeQuery request error");
            return;
        }
        this.f229582d = jSONObject.optString("short_desc");
        this.f229583e = jSONObject.optString("charge_desc");
        jSONObject.optDouble("acc_fee");
        this.f229584f = jSONObject.optDouble("remain_fee") / 100.0d;
    }
}
