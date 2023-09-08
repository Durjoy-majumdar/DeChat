package j53;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: j53.j */
public class C33518j extends C75790l {
    public C33518j(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("auth_token", str);
        hashMap.put("passwd", str2 + "");
        hashMap.put(AppMeasurement.Param.TIMESTAMP, System.currentTimeMillis() + "");
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 2514;
    }

    public int getTenpayCgicmd() {
        return 2514;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/resetpaypwdbyface";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneResetPayPwdByFace", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", Integer.valueOf(i), str, jSONObject);
        if (i == 0) {
            jSONObject.optString("retcode");
            jSONObject.optString("retmsg");
        }
    }
}
