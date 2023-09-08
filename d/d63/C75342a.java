package d63;

import b63.C67181d;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: d63.a */
public class C75342a extends C67181d {

    /* renamed from: b */
    public static C75342a f221507b;

    /* renamed from: c */
    public Bankcard mo91284c(JSONObject jSONObject) {
        Bankcard c = super.mo91284c(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("cvv_length", jSONObject.optInt("cvv_length"));
            jSONObject2.put("information", jSONObject.optString("information"));
            jSONObject2.put("verified", jSONObject.optBoolean("verified"));
            jSONObject2.put("card_expiry", jSONObject.optString("card_expiry"));
            jSONObject2.put("is_credit", jSONObject.optString("bank_type").equals("CREDITCARD_PAYU"));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.BankcardPayUWrapper", e, "", new Object[0]);
        }
        c.field_ext_msg = jSONObject2.toString();
        c.field_bankcardClientType = 1;
        c.field_desc = jSONObject.optString("description");
        c.field_trueName = jSONObject.optString("name_on_card");
        if ("CREDITCARD_PAYU".equals(jSONObject.optString("bank_type"))) {
            int i = c.field_cardType;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = Bankcard.f209387V2;
            c.field_cardType = i | 2;
        } else {
            int i2 = c.field_cardType;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = Bankcard.f209387V2;
            c.field_cardType = i2 | 8;
        }
        return c;
    }
}
