package id2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: id2.j */
public class C76306j extends C75790l {

    /* renamed from: d */
    public String f223507d = "0";

    /* renamed from: e */
    public String f223508e = "";

    public C76306j(Bankcard bankcard, String str, String str2, int i, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put("oper", str2);
        if (str2.equals("changeto")) {
            if (TextUtils.isEmpty(str3)) {
                hashMap.put("verify_code", "");
            } else {
                hashMap.put("verify_code", str3);
            }
            hashMap.put("chg_fee", "" + i);
            hashMap.put("bind_serialno", bankcard.field_bindSerial);
            hashMap.put("bank_type", bankcard.field_bankcardType);
            hashMap.put("card_tail", bankcard.field_bankcardTail);
        }
        this.f223508e = bankcard.field_mobile;
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 50;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f223507d = jSONObject.optString("verify_flag");
            jSONObject.optString("limit_fee");
        }
    }
}
