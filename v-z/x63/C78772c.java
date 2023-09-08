package x63;

import com.tencent.p014mm.sdk.platformtools.Log;
import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: x63.c */
public class C78772c extends C45440a {

    /* renamed from: d */
    public String f230509d = "";

    public C78772c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("pin", str);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 3;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("MicroMsg.NetScenePayUCheckPwd", "errCode " + i + " errMsg: " + str);
        this.f230509d = jSONObject.optString("payu_reference");
    }
}
