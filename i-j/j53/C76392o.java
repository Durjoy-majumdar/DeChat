package j53;

import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75790l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import un0.C14253d;

/* renamed from: j53.o */
public class C76392o extends C75790l {

    /* renamed from: d */
    public Map<String, String> f223690d;

    /* renamed from: e */
    public String f223691e = null;

    /* renamed from: f */
    public boolean f223692f;

    public C76392o(Authen authen, boolean z, int i) {
        HashMap hashMap = new HashMap();
        this.f223690d = hashMap;
        hashMap.put("flag", "" + authen.f209367d);
        if (!Util.isNullOrNil(authen.f209383w)) {
            this.f223690d.put("first_name", authen.f209383w);
            this.f223690d.put("last_name", authen.f209384x);
            this.f223690d.put("country", authen.f209385y);
            this.f223690d.put("area", authen.f209386z);
            this.f223690d.put("city", authen.f209348A);
            this.f223690d.put("address", authen.f209349B);
            this.f223690d.put("phone_number", authen.f209350C);
            this.f223690d.put("zip_code", authen.f209351D);
            this.f223690d.put(Scopes.EMAIL, authen.f209352E);
        }
        Map<String, String> map = this.f223690d;
        map.put("business_source", i + "");
        this.f223690d.put("bank_type", authen.f209370g);
        if (authen.f209374n > 0) {
            Map<String, String> map2 = this.f223690d;
            map2.put("cre_type", authen.f209374n + "");
        }
        if (!Util.isNullOrNil(authen.f209372i)) {
            this.f223690d.put("true_name", authen.f209372i);
        }
        if (!Util.isNullOrNil(authen.f209373j)) {
            this.f223690d.put("identify_card", authen.f209373j);
        }
        this.f223690d.put("mobile_no", authen.f209375o);
        this.f223690d.put("bank_card_id", authen.f209376p);
        if (!Util.isNullOrNil(authen.f209377q)) {
            this.f223690d.put("cvv2", authen.f209377q);
        }
        if (!Util.isNullOrNil(authen.f209378r)) {
            this.f223690d.put("valid_thru", authen.f209378r);
        }
        this.f223690d.put("new_card_reset_pwd", z ? "1" : "0");
        setRequestData(this.f223690d);
    }

    public int getFuncId() {
        return C14253d.CTRL_INDEX;
    }

    public int getTenpayCgicmd() {
        return 10;
    }

    public String getToken() {
        return this.f223691e;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/resetpwdauthen";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f223691e = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        }
    }

    public boolean resend() {
        super.resend();
        ((HashMap) this.f223690d).put("is_repeat_send", "1");
        setRequestData(this.f223690d);
        this.f223692f = true;
        return true;
    }
}
