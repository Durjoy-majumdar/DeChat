package z53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: z53.d */
public class C39320d extends C75790l {
    public C39320d(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i + "");
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1584;
    }

    public int getTenpayCgicmd() {
        return 1584;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/realnamesetduty";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.NetSceneAgreeDisclaimer", "errCode = " + i + ";errMsg = " + str);
    }
}
