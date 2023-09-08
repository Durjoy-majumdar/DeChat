package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import fr3.C75790l;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: e21.p0 */
public class C75488p0 extends C75790l {

    /* renamed from: d */
    public String f221847d = null;

    /* renamed from: e */
    public double f221848e;

    /* renamed from: f */
    public String f221849f;

    /* renamed from: g */
    public String f221850g;

    /* renamed from: h */
    public int f221851h;

    public C75488p0(double d, String str, String str2) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("fee", Math.round(100.0d * d) + "");
            hashMap.put("fee_type", str);
            hashMap.put("desc", URLEncoder.encode(str2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceQuery", e, "", new Object[0]);
        }
        this.f221848e = d;
        this.f221849f = str;
        this.f221850g = str2;
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1623;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/transfersetf2ffee";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            this.f221847d = jSONObject.optString("pay_url");
            this.f221851h = C75157y0.m90138a(jSONObject.optInt("qrcode_level"));
            this.f221850g = jSONObject.optString("desc");
            Log.m105925i("Micromsg.NetSceneTenpayRemittanceQuery", "qrcodeLevel:%s ", Integer.valueOf(this.f221851h));
        }
    }
}
