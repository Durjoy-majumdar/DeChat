package v53;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.a0 */
public class C37675a0 extends C75790l {
    public C37675a0(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("appid", URLEncoder.encode(str, "UTF-8"));
            hashMap.put(AppMeasurement.Param.TIMESTAMP, URLEncoder.encode(str2, "UTF-8"));
            hashMap.put("noncestr", URLEncoder.encode(str3, "UTF-8"));
            hashMap.put("package", URLEncoder.encode(str4, "UTF-8"));
            hashMap.put("sign", URLEncoder.encode(str5, "UTF-8"));
            setRequestData(hashMap);
            Log.m105919d("MicroMsg.NetSceneTenpayF2fJsapiCheck", "package: %s, sign: %s", str4, str5);
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneTenpayF2fJsapiCheck", e, "", new Object[0]);
        }
    }

    public int getFuncId() {
        return 1973;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/f2frcvdlistjsapicheck";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.NetSceneTenpayF2fJsapiCheck", "errCode: %d, errMsg: %s", Integer.valueOf(i), str);
    }
}
