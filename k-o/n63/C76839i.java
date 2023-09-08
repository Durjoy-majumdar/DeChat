package n63;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: n63.i */
public class C76839i extends C75790l {
    public C76839i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        HashMap hashMap = new HashMap();
        hashMap.put("toUser", str);
        hashMap.put("receiverTitle", str2);
        hashMap.put("senderTitle", str3);
        hashMap.put("tempId", str4);
        hashMap.put("receiverdes", str6);
        hashMap.put("senderdes", str5);
        hashMap.put("Url", str7);
        hashMap.put("Scene", str8);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1962;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/h5sendc2cmsg";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneSendC2CMsg", "errCode " + i + " errMsg: " + str);
    }
}
