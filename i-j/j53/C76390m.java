package j53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import fr3.C75790l;
import java.util.HashMap;
import ob0.C11385n;
import org.json.JSONObject;

/* renamed from: j53.m */
public class C76390m extends C75790l {

    /* renamed from: d */
    public JSONObject f223689d;

    public C76390m(boolean z, boolean z2, String str, String str2) {
        HashMap hashMap = new HashMap();
        Log.m105919d("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "cpuId: %s, uid: %s", str, str2);
        String str3 = "1";
        hashMap.put("is_root", z ? str3 : "0");
        hashMap.put("is_device_open_touch", !z2 ? "0" : str3);
        hashMap.put("cpu_id", str);
        hashMap.put("app_uid", str2);
        setRequestData(hashMap);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.callback = nVar;
        return super.doScene(gVar, nVar);
    }

    public int getFuncId() {
        return 1669;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/paysecurity";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "alvinluo errCode: %d, errMsg: %s", Integer.valueOf(i), str);
        if (i == 0 && jSONObject != null) {
            Log.m105927v("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "alvinluo json: %s", jSONObject.toString());
            this.f223689d = jSONObject;
            C75140t0.m90124c().mo104863d(this.f223689d);
        }
    }
}
