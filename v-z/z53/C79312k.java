package z53;

import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: z53.k */
public class C79312k extends C75790l {

    /* renamed from: d */
    public int f232853d;

    /* renamed from: e */
    public int f232854e;

    /* renamed from: f */
    public Profession[] f232855f = null;

    /* renamed from: g */
    public String[] f232856g = null;

    public C79312k(String str) {
        HashMap hashMap = new HashMap();
        if (!Util.isNullOrNil(str)) {
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        }
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1976;
    }

    public int getTenpayCgicmd() {
        return 1976;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/getuserexinfo";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTenpayGetUserExInfo", "errCode: %s, errMsg: %s", Integer.valueOf(i), str);
        Log.m105919d("MicroMsg.NetSceneTenpayGetUserExInfo", "json: %s", jSONObject.toString());
        this.f232853d = jSONObject.optInt("need_area");
        this.f232854e = jSONObject.optInt("need_profession");
        JSONArray optJSONArray = jSONObject.optJSONArray("array");
        if (optJSONArray != null) {
            this.f232855f = new Profession[optJSONArray.length()];
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("profession_name");
                    int optInt = optJSONObject.optInt("profession_type");
                    if (!Util.isNullOrNil(optString)) {
                        this.f232855f[i2] = new Profession(optString, optInt);
                    } else {
                        Log.m105924i("MicroMsg.NetSceneTenpayGetUserExInfo", "empty profession_name!");
                    }
                }
            }
        }
        jSONObject.optInt("need_nationality");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("nationality_exclude_array");
        if (optJSONArray2 != null) {
            this.f232856g = new String[optJSONArray2.length()];
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                this.f232856g[i3] = optJSONArray2.optString(i3);
            }
        }
    }
}
