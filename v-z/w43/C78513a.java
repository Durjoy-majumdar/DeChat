package w43;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: w43.a */
public class C78513a extends C75790l {

    /* renamed from: d */
    public int f229967d;

    /* renamed from: e */
    public String f229968e;

    public C78513a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("bankcard_type", str);
        hashMap.put("bind_serial", str2);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1540;
    }

    public int getTenpayCgicmd() {
        return 1540;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/unbindbanner";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (i != 0) {
            return;
        }
        if (jSONObject != null) {
            this.f229967d = jSONObject.optInt("unbindbannerlevel", 0);
            this.f229968e = jSONObject.optString("unbindbannerwording");
            return;
        }
        Log.m105920e("MicroMsg.NetSceneGetUnbindInfo", "json is null");
    }
}
