package w43;

import b63.C67181d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import f40.C86709a0;
import fr3.C75790l;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p823sg.C77710q;

/* renamed from: w43.c */
public class C78515c extends C75790l {

    /* renamed from: d */
    public ArrayList<Bankcard> f229969d = null;

    /* renamed from: e */
    public boolean f229970e = false;

    /* renamed from: f */
    public String f229971f;

    /* renamed from: g */
    public String f229972g;

    /* renamed from: h */
    public String f229973h;

    /* renamed from: i */
    public String f229974i;

    public C78515c(String str, PayInfo payInfo) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        setPayInfo(payInfo, hashMap, hashMap2);
        C86709a0.m107528h();
        C77710q qVar = new C77710q(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null), 0));
        this.f229974i = str;
        hashMap.put("import_code", str);
        hashMap.put("qqid", "" + qVar.toString());
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public int getTenpayCgicmd() {
        return 37;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (i == 0) {
            this.f229969d = new ArrayList<>();
            try {
                this.f229970e = "1".equals(jSONObject.optString("is_reg", "0"));
                this.f229971f = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "");
                JSONArray jSONArray = jSONObject.getJSONArray("Array");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    Bankcard c = C67181d.m79454a().mo91284c(jSONObject2);
                    if (c != null) {
                        if (2 == jSONObject2.optInt("bank_acc_type", 2)) {
                            int i3 = c.field_cardType;
                            IAutoDBItem.MAutoDBInfo mAutoDBInfo = Bankcard.f209387V2;
                            c.field_cardType = i3 | 2;
                        }
                        c.field_bankcardTail = jSONObject2.optString("bank_tail");
                        c.f209410e2 = "************" + c.field_bankcardTail;
                        c.field_trueName = jSONObject2.optString("true_name");
                        c.f209409d2 = jSONObject2.optString("cre_id");
                        c.f209424s2 = jSONObject2.optInt("cre_type", -1);
                        c.f209425t2 = this.f229974i;
                        c.f209426u2 = 1 == jSONObject2.optInt("samecardexist", 0);
                        if (c.mo99388n2()) {
                            c.field_desc = c.field_bankName;
                        } else if (c.mo99389o2()) {
                            c.field_desc = MMApplicationContext.getContext().getString(C0966R.string.krn, new Object[]{c.field_bankName, c.field_bankcardTail});
                        } else if (c.mo99394u2()) {
                            c.field_desc = MMApplicationContext.getContext().getString(C0966R.string.lbu, new Object[]{c.field_bankName, c.field_bankcardTail});
                        } else {
                            c.field_desc = MMApplicationContext.getContext().getString(C0966R.string.ksd, new Object[]{c.field_bankName, c.field_bankcardTail});
                        }
                        JSONObject optJSONObject = jSONObject2.optJSONObject("bankappservice");
                        if (optJSONObject != null) {
                            this.f229972g = optJSONObject.optString("username");
                            this.f229973h = optJSONObject.optString("app_recommend_desc");
                        }
                        this.f229969d.add(c);
                    }
                }
                Log.m105918d("MicroMsg.NetSceneTenpayQueryBindBankcard", "got data---isReg:" + this.f229970e + ",bankcard.size:" + this.f229969d.size());
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.NetSceneTenpayQueryBindBankcard", e, "", new Object[0]);
            }
        }
    }
}
