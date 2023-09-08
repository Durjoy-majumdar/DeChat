package g53;

import b63.C67210w;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import java.util.Map;
import ob0.C11385n;
import org.json.JSONObject;

/* renamed from: g53.e */
public class C75855e extends C75852b {
    public C75855e(C67210w wVar, Orders orders) {
        super(wVar, orders);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C115669n.INSTANCE.idkeyStat(663, 22, 1, false);
        return super.doScene(gVar, nVar);
    }

    public int getFuncId() {
        return 1305;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/lqtpaybindverify";
    }

    /* renamed from: l1 */
    public void mo106136l1(Map<String, String> map) {
        map.put("busi_scene", this.f222502y.f192987e);
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        C115669n.INSTANCE.idkeyStat(663, 23, 1, false);
    }
}
