package g53;

import b63.C67210w;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wechat.aff.ting.TingClientProto;
import java.util.Map;
import ob0.C11385n;
import org.json.JSONObject;
import y43.C79029b0;

/* renamed from: g53.b */
public class C75852b extends C75857g {

    /* renamed from: A */
    public boolean f222499A = false;

    /* renamed from: B */
    public boolean f222500B;

    public C75852b(C67210w wVar, Orders orders) {
        super(wVar, orders);
        mo106137m1();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (this.f222499A) {
            C115669n.INSTANCE.idkeyStat(663, 26, 1, false);
        } else if (this.f222500B) {
            C115669n.INSTANCE.idkeyStat(663, 22, 1, false);
        }
        return super.doScene(gVar, nVar);
    }

    public int getFuncId() {
        mo106137m1();
        if (this.f222499A) {
            return 1281;
        }
        if (this.f222500B) {
            return 1305;
        }
        return TingClientProto.TingScene.TingScene_FinderLiteAppSinger_VALUE;
    }

    public int getTenpayCgicmd() {
        return 121;
    }

    public String getUri() {
        mo106137m1();
        return this.f222499A ? "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindverify" : this.f222500B ? "/cgi-bin/mmpay-bin/tenpay/lqtpaybindverify" : "/cgi-bin/mmpay-bin/tenpay/banpaybindverify";
    }

    /* renamed from: l1 */
    public void mo106136l1(Map<String, String> map) {
        mo106137m1();
        if (this.f222499A || this.f222500B) {
            map.put("busi_scene", this.f222502y.f192987e);
        }
    }

    /* renamed from: m1 */
    public final void mo106137m1() {
        this.f222499A = false;
        if (C79029b0.vx0().wx0().f192960m != null) {
            C67210w wVar = this.f222502y;
            if (wVar.f192996n != null && wVar.f192987e.equals(C79029b0.vx0().wx0().f192960m.field_bankcardType)) {
                int i = this.f222502y.f192996n.f212587e;
                if (i == 31 || i == 32 || i == 33 || i == 42 || i == 37 || i == 56) {
                    this.f222499A = true;
                } else {
                    this.f222500B = true;
                }
            }
        }
        Log.m105925i("MicroMsg.NetSceneTenpayPayVertify", "isLqtSns: %s, isLqtTs: %s", Boolean.valueOf(this.f222499A), Boolean.valueOf(this.f222500B));
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        if (i == 0) {
            return;
        }
        if (this.f222499A) {
            C115669n.INSTANCE.idkeyStat(663, 27, 1, false);
        } else if (this.f222500B) {
            C115669n.INSTANCE.idkeyStat(663, 23, 1, false);
        }
    }
}
