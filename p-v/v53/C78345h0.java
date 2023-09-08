package v53;

import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import org.json.JSONObject;
import ub3.C78144b;

/* renamed from: v53.h0 */
public class C78345h0 extends C78342e0 {

    /* renamed from: E */
    public C78351m0 f229580E;

    public C78345h0(String str, int i) {
        super(str, i);
    }

    public int getFuncId() {
        return 2750;
    }

    public int getTenpayCgicmd() {
        return 2750;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/savebindquery";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_BALANCE_LQT_OPERATION_STRING_SYNC;
        Class cls = C78144b.class;
        super.onGYNetEnd(i, str, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("save_to_lqt_entry");
        if (optJSONObject != null) {
            ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(aVar, optJSONObject.toString());
            this.f229580E = C78351m0.m94631a(optJSONObject);
            return;
        }
        ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(aVar, "");
        this.f229580E = null;
    }
}
