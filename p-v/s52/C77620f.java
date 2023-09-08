package s52;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: s52.f */
public class C77620f extends C75790l {

    /* renamed from: d */
    public C77619d f226284d;

    public C77620f() {
        setRequestData(new HashMap());
    }

    public int getTenpayCgicmd() {
        return 2713;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/geteuinfo";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("MicroMsg.NetSceneGetEUInfo", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            try {
                this.f226284d = new C77619d(jSONObject.toString());
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MALL_INDEX_GDPR_CACHE_STRING_SYNC, jSONObject.toString());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NetSceneGetEUInfo", e, "", new Object[0]);
            }
        }
    }
}
