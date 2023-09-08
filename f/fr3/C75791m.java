package fr3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.SetPwdInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75120i;
import com.tencent.p014mm.wallet_core.tenpay.model.C75160b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: fr3.m */
public abstract class C75791m extends C75160b implements C45119n {

    /* renamed from: d */
    public Map<String, String> f222382d = new HashMap();

    /* renamed from: e */
    public int f222383e = 0;

    /* renamed from: f */
    public boolean f222384f = false;

    /* renamed from: g */
    public int f222385g = 0;

    /* renamed from: h */
    public int f222386h = 0;

    /* renamed from: i */
    public String f222387i = null;

    /* renamed from: j */
    public JSONObject f222388j = null;

    /* renamed from: n */
    public String f222389n;

    /* renamed from: o */
    public String f222390o;

    /* renamed from: p */
    public String f222391p;

    /* renamed from: q */
    public String f222392q;

    /* renamed from: r */
    public String f222393r;

    /* renamed from: s */
    public RealnameGuideHelper f222394s;

    /* renamed from: t */
    public boolean f222395t = false;

    /* renamed from: u */
    public int f222396u = 0;

    /* renamed from: v */
    public String f222397v;

    /* renamed from: w */
    public int f222398w = -1;

    public boolean canRetry() {
        return false;
    }

    /* renamed from: j1 */
    public boolean mo105664j1() {
        return false;
    }

    /* renamed from: k1 */
    public void mo106090k1(String str, String str2, int i, int i2, String str3, String str4) {
        ((HashMap) this.f222382d).put("req_key", str);
        ((HashMap) this.f222382d).put(FirebaseAnalytics.C113379b.TRANSACTION_ID, str2);
        Map<String, String> map = this.f222382d;
        ((HashMap) map).put("pay_scene", i + "");
        ((HashMap) this.f222382d).put("bank_type", str3);
        Map<String, String> map2 = this.f222382d;
        ((HashMap) map2).put("channel", i2 + "");
        ((HashMap) this.f222382d).put("bind_serial", str4);
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        boolean z;
        if (!this.f222384f) {
            this.f222386h = i;
            this.f222387i = str;
            this.f222388j = jSONObject;
            this.f222384f = true;
            if (jSONObject != null) {
                this.f222383e = jSONObject.optInt("query_order_flag", 0);
            }
        }
        if (jSONObject == null || !jSONObject.has("real_name_info")) {
            z = false;
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
            this.f222389n = optJSONObject.optString("guide_flag");
            this.f222390o = optJSONObject.optString("guide_wording");
            this.f222391p = optJSONObject.optString("left_button_wording");
            this.f222392q = optJSONObject.optString("right_button_wording");
            this.f222393r = optJSONObject.optString("upload_credit_url");
            z = true;
        }
        SetPwdInfo setPwdInfo = null;
        if (jSONObject != null && jSONObject.has("set_pwd_info")) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("set_pwd_info");
            setPwdInfo = new SetPwdInfo();
            setPwdInfo.f209339e = optJSONObject2.optString("guide_wording");
            setPwdInfo.f209340f = optJSONObject2.optString("left_button_wording");
            setPwdInfo.f209341g = optJSONObject2.optString("right_button_wording");
            setPwdInfo.f209338d = optJSONObject2.optInt("send_pwd_msg");
            z = true;
        }
        if (z && ("1".equals(this.f222389n) || "2".equals(this.f222389n) || setPwdInfo != null)) {
            RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
            this.f222394s = realnameGuideHelper;
            String str2 = this.f222389n;
            String str3 = this.f222390o;
            String str4 = this.f222391p;
            String str5 = this.f222392q;
            String str6 = this.f222393r;
            realnameGuideHelper.f209330d = setPwdInfo;
            realnameGuideHelper.f209331e = str2;
            realnameGuideHelper.f209332f = str3;
            realnameGuideHelper.f209333g = str4;
            realnameGuideHelper.f209334h = str5;
            realnameGuideHelper.f209335i = str6;
            realnameGuideHelper.f209337n = 0;
        }
        this.f222397v = jSONObject.optString("forget_pwd_url", "");
        this.f222398w = jSONObject.optInt("is_clear_failure", -1);
        Log.m105925i("MicroMsg.NetSceneTenpayDelayQueryBase", "forget_pwd_url %s", this.f222397v);
        this.f222395t = true;
        super.onGYNetEnd(i, str, jSONObject);
    }

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTenpayDelayQueryBase", "always callback: %s,%s", Integer.valueOf(iVar.f221053b), iVar.f221054c);
        super.onGYNetEnd2(iVar, jSONObject);
        if (!this.f222395t && !this.f222384f) {
            this.f222385g = iVar.f221052a;
            this.f222386h = iVar.f221053b;
            this.f222387i = iVar.f221054c;
            if (jSONObject != null) {
                this.f222383e = jSONObject.optInt("query_order_flag", 0);
                this.f222388j = jSONObject;
            }
            this.f222384f = true;
        }
    }
}
