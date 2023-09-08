package d53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import java.util.Map;
import ob0.C11385n;
import org.json.JSONObject;

/* renamed from: d53.f */
public class C75330f extends C75327c {
    public C75330f(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C115669n.INSTANCE.idkeyStat(663, 20, 1, false);
        return super.doScene(gVar, nVar);
    }

    public int getFuncId() {
        return 1259;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/lqtpaybindauthen";
    }

    /* renamed from: l1 */
    public void mo105665l1(Map<String, String> map) {
        map.put("busi_scene", this.f221493C.f209370g);
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        if (i != 0) {
            C115669n.INSTANCE.idkeyStat(663, 21, 1, false);
        }
    }
}
