package c53;

import b63.C67181d;
import b63.C67198p0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wechat.aff.ting.TingClientProto;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;

/* renamed from: c53.c */
public class C67343c extends C75790l {

    /* renamed from: d */
    public double f193190d;

    /* renamed from: e */
    public String f193191e;

    /* renamed from: f */
    public String f193192f;

    public C67343c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return TingClientProto.TingScene.TingScene_FinderProfileCategory_VALUE;
    }

    public int getTenpayCgicmd() {
        return 123;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/webankloanordershow";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (i == 0) {
            this.f193191e = jSONObject.optString("fee_type");
            this.f193190d = jSONObject.optDouble("total_fee") / 100.0d;
            JSONArray optJSONArray = jSONObject.optJSONArray("Array");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f193192f = ((JSONObject) optJSONArray.opt(0)).optString("desc");
            }
            C67198p0 Cx0 = ((C79173v) C86312j.m106911c(C79173v.class)).Cx0();
            JSONObject optJSONObject = jSONObject.optJSONObject("bindqueryresp");
            Cx0.f192926a.clear();
            if (optJSONObject == null) {
                Log.m105920e("MicroMsg.WalletRepaymentBankcardMgr", "parse from json error,json is null");
                return;
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("Array");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                Log.m105920e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list is null");
            } else {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    C67181d a = C67181d.m79454a();
                    JSONObject jSONObject2 = null;
                    try {
                        jSONObject2 = (JSONObject) optJSONArray2.get(i2);
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.WalletRepaymentBankcardMgr", e, "", new Object[0]);
                    }
                    if (jSONObject2 != null) {
                        Bankcard c = a.mo91284c(jSONObject2);
                        if (c.mo99388n2()) {
                            c.field_desc = c.field_bankName;
                        } else if (c.mo99389o2()) {
                            c.field_desc = MMApplicationContext.getContext().getString(C0966R.string.krn, new Object[]{c.field_bankName, c.field_bankcardTail});
                        } else if (c.mo99394u2()) {
                            c.field_desc = MMApplicationContext.getContext().getString(C0966R.string.lbu, new Object[]{c.field_bankName, c.field_bankcardTail});
                        } else {
                            c.field_desc = MMApplicationContext.getContext().getString(C0966R.string.ksd, new Object[]{c.field_bankName, c.field_bankcardTail});
                        }
                        Cx0.f192926a.add(c);
                    }
                }
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("user_info");
            if (optJSONObject2 != null) {
                Cx0.f192927b = optJSONObject2.optString("last_card_bind_serialno");
            } else {
                Log.m105920e("MicroMsg.WalletRepaymentBankcardMgr", "user_info is null");
            }
        }
    }
}
