package d53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import java.util.Map;
import ob0.C11385n;
import org.json.JSONObject;

/* renamed from: d53.c */
public class C75327c extends C75326b {
    public C75327c(Authen authen, Orders orders, boolean z) {
        super(authen, orders, false);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        return super.doScene(gVar, nVar);
    }

    public int getFuncId() {
        return 1600;
    }

    public int getTenpayCgicmd() {
        return 120;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/banpaybindauthen";
    }

    /* renamed from: l1 */
    public void mo105665l1(Map<String, String> map) {
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
    }
}
