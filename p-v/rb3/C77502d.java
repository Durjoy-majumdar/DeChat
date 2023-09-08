package rb3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: rb3.d */
public class C77502d extends C75790l {

    /* renamed from: d */
    public C77508k f225985d;

    public C77502d(String str, boolean z, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("bind_serialno", str);
        hashMap.put("bank_type", str2);
        if (z) {
            hashMap.put("query_method", "1");
        } else {
            hashMap.put("query_method", "0");
        }
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("banktype", str2);
        setWXRequestData(hashMap2);
    }

    public int getTenpayCgicmd() {
        return 57;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            try {
                C77508k kVar = new C77508k();
                this.f225985d = kVar;
                kVar.f225991a = jSONObject.optInt("credit_state");
                this.f225985d.f225992b = ((double) jSONObject.optInt("credit_amount")) / 100.0d;
                this.f225985d.f225993c = ((double) jSONObject.optInt("credit_usable")) / 100.0d;
                this.f225985d.f225994d = ((double) jSONObject.optInt("bill_amount")) / 100.0d;
                C77508k kVar2 = this.f225985d;
                jSONObject.optInt("bill_date");
                kVar2.getClass();
                this.f225985d.f225995e = ((double) jSONObject.optInt("repay_amount")) / 100.0d;
                C77508k kVar3 = this.f225985d;
                jSONObject.optInt("repay_minimum");
                kVar3.getClass();
                C77508k kVar4 = this.f225985d;
                boolean z = true;
                if (jSONObject.optInt("upgrade_amount") != 1) {
                    z = false;
                }
                kVar4.f225996f = z;
                C77508k kVar5 = this.f225985d;
                jSONObject.optInt("bill_month");
                kVar5.getClass();
                this.f225985d.f225997g = jSONObject.optString("repay_url");
                this.f225985d.f225998h = jSONObject.optString("repay_lasttime");
                this.f225985d.f226002l = jSONObject.optString("lasttime");
                JSONArray jSONArray = jSONObject.getJSONArray("jump_url_array");
                if (jSONArray != null) {
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String string = jSONObject2.getString("jump_name");
                            if ("account_rights_url".equals(string)) {
                                this.f225985d.f226000j = jSONObject2.getString("jump_url");
                            } else if ("bill_url".equals(string)) {
                                this.f225985d.f226001k = jSONObject2.getString("jump_url");
                            } else if ("card_detail_url".equals(string)) {
                                this.f225985d.f225999i = jSONObject2.getString("jump_url");
                            } else if ("know_more_url".equals(string)) {
                                this.f225985d.f226003m = jSONObject2.getString("jump_url");
                            }
                        }
                    }
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("appservice");
                if (jSONObject3 != null) {
                    this.f225985d.f226004n = new C77507j();
                    jSONObject3.getString("app_telephone");
                    C77507j jVar = this.f225985d.f226004n;
                    jSONObject3.getString("nickname");
                    jVar.getClass();
                    this.f225985d.f226004n.f225990a = jSONObject3.getString("username");
                    C77507j jVar2 = this.f225985d.f226004n;
                    jSONObject3.getString("jump_url");
                    jVar2.getClass();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", e, "", new Object[0]);
            }
        }
    }
}
