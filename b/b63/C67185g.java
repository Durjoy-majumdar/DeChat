package b63;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: b63.g */
public class C67185g {

    /* renamed from: d */
    public static C67185g f192889d;

    /* renamed from: a */
    public int f192890a = 0;

    /* renamed from: b */
    public String f192891b;

    /* renamed from: c */
    public JSONObject f192892c;

    /* renamed from: a */
    public static C67185g m79463a() {
        if (f192889d == null) {
            f192889d = new C67185g();
        }
        return f192889d;
    }

    /* renamed from: b */
    public boolean mo91288b() {
        return this.f192890a == 1 && !Util.isNullOrNil(this.f192891b);
    }

    /* renamed from: c */
    public void mo91289c(JSONObject jSONObject) {
        this.f192892c = jSONObject;
        if (jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("bind_newcard_switch");
                this.f192890a = optJSONObject.optInt("forbid_bind_card");
                this.f192891b = optJSONObject.optString("forbid_word");
            } catch (Exception e) {
                this.f192890a = 0;
                this.f192891b = "";
                Log.printErrStackTrace("MicroMsg.BindQueryComplexSwitchInfo", e, "", new Object[0]);
            }
        } else {
            this.f192890a = 0;
            this.f192891b = "";
        }
        Log.m105925i("MicroMsg.BindQueryComplexSwitchInfo", "feed result %s forbid_bind_card %s forbid_word %s", this.f192892c, Integer.valueOf(this.f192890a), this.f192891b);
    }
}
