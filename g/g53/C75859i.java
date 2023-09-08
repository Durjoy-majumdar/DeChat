package g53;

import b63.C67210w;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import java.util.Map;
import ob0.C11385n;
import org.json.JSONObject;

/* renamed from: g53.i */
public class C75859i extends C75852b {
    public C75859i(C67210w wVar, Orders orders) {
        super(wVar, orders);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C115669n.INSTANCE.idkeyStat(663, 26, 1, false);
        return super.doScene(gVar, nVar);
    }

    public int getFuncId() {
        return 1281;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindverify";
    }

    /* renamed from: l1 */
    public void mo106136l1(Map<String, String> map) {
        map.put("busi_scene", this.f222502y.f192987e);
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        C115669n.INSTANCE.idkeyStat(663, 27, 1, false);
    }
}
