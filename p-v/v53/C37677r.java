package v53;

import b63.C28266f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p281yz.C79173v;

/* renamed from: v53.r */
public class C37677r extends C75790l {
    public C37677r() {
        setRequestData(new HashMap());
    }

    public int getFuncId() {
        return 1631;
    }

    public int getTenpayCgicmd() {
        return 1631;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/queryuserwallet";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Class cls = C79173v.class;
        Log.m105924i("MicroMsg.NetSceneQueryUserWallet", "errCode is : " + i);
        if (i == 0) {
            ((C79173v) C86312j.m106911c(cls)).Gx0().f84136d.execSQL("WalletKindInfo", "delete from WalletKindInfo");
            if (jSONObject != null) {
                Log.m105924i("MicroMsg.NetSceneQueryUserWallet", "resp json " + jSONObject.toString());
                JSONArray optJSONArray = jSONObject.optJSONArray("UserWalletInfoList");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        C28266f0 f0Var = null;
                        if (optJSONObject == null) {
                            Log.m105920e("MicroMsg.WalletKindInfo", "json is null");
                        } else {
                            C28266f0 f0Var2 = new C28266f0();
                            f0Var2.field_wallet_tpa_country = optJSONObject.optString("wallet_tpa_country");
                            f0Var2.field_wallet_name = optJSONObject.optString("wallet_name");
                            f0Var2.field_wallet_selected = optJSONObject.optInt("wallet_selected");
                            f0Var2.field_wallet_type = optJSONObject.optInt("wallet_type");
                            f0Var2.field_wallet_balance = optJSONObject.optInt("wallet_balance");
                            f0Var2.field_wallet_tpa_country_mask = optJSONObject.optInt("wallet_tpa_country_mask");
                            if (Util.isNullOrNil(f0Var2.field_wallet_tpa_country)) {
                                Log.m105920e("MicroMsg.WalletKindInfo", "wallet_id is illegal");
                            } else {
                                f0Var = f0Var2;
                            }
                        }
                        if (f0Var != null) {
                            ((C79173v) C86312j.m106911c(cls)).Gx0().insert(f0Var);
                        }
                    }
                    return;
                }
                Log.m105920e("MicroMsg.NetSceneQueryUserWallet", "wallet array is null");
                return;
            }
            Log.m105920e("MicroMsg.NetSceneQueryUserWallet", "response json is null");
        }
    }
}
