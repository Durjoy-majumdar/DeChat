package z53;

import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: z53.l */
public class C79313l extends C75790l {
    public C79313l(String str, String str2, String str3, Profession profession, String str4) {
        Log.m105919d("MicroMsg.NetSceneTenpaySetUserExInfo", "country: %s, province: %s, city: %s, nationality: %s", str, str2, str3, str4);
        HashMap hashMap = new HashMap();
        if (!Util.isNullOrNil(str)) {
            hashMap.put("user_country", str);
        }
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("user_province", str2);
        }
        if (!Util.isNullOrNil(str3)) {
            hashMap.put("user_city", str3);
        }
        if (profession != null) {
            Log.m105919d("MicroMsg.NetSceneTenpaySetUserExInfo", "name: %s, type: %s", profession.f209290d, Integer.valueOf(profession.f209291e));
            hashMap.put("profession_name", profession.f209290d);
            hashMap.put("profession_type", String.valueOf(profession.f209291e));
        }
        if (!Util.isNullOrNil(str4)) {
            hashMap.put("nationality", str4);
        }
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1978;
    }

    public int getTenpayCgicmd() {
        return 1978;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/setuserexinfo";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTenpaySetUserExInfo", "errCode: %s, errMsg: %s", Integer.valueOf(i), str);
    }
}
