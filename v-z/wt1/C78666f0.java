package wt1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import lt3.C21460a;
import p623nr.C76956i;
import pv2.C77290d;
import tt3.C22551c;
import wt1.C78709x;
import z04.C112551y;

/* renamed from: wt1.f0 */
public final class C78666f0 implements C76956i.C76959c {

    /* renamed from: a */
    public final /* synthetic */ C78709x f230366a;

    public C78666f0(C78709x xVar) {
        this.f230366a = xVar;
    }

    /* renamed from: a */
    public void mo107283a(int i) {
    }

    /* renamed from: b */
    public void mo107284b(C22551c cVar) {
        C87412m.m108594g(cVar, "result");
        int i = cVar.f61886a;
        if (i == 1006) {
            Log.m105920e("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: failed upload: model is null or necessary elements null");
            C77290d.m93109g(4, -1000223, -1, "gen auth key failed: unexpected! generated but cannot get");
        } else if (i == 6) {
            C77290d.m93109g(4, -1000223, -1, "gen auth key failed");
            if (!Util.isNullOrNil(cVar.f61887b)) {
                String str = cVar.f61887b;
                C87412m.m108593f(str, "result.errMsg");
                if (C112551y.m153819s(str, "java.security.ProviderException", false)) {
                    C78709x xVar = this.f230366a;
                    xVar.mo108647c3(new C78709x.C78719b.C78721b(xVar.getString(C0966R.string.amp)));
                    return;
                }
            }
            if (C21460a.m24273g() == 1 && !Util.isNullOrNil(cVar.f61887b) && C87412m.m108589b(cVar.f61887b, "errmsg not specified")) {
                C78709x xVar2 = this.f230366a;
                xVar2.mo108647c3(new C78709x.C78719b.C78721b(xVar2.getString(C0966R.string.amq)));
                return;
            }
        } else if (i == 1004) {
            Log.m105920e("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: update pay auth key failed. remove");
            C77290d.m93109g(5, 4, cVar.f61886a, "upload auth key failed");
        } else if (i == 4 || i == 3) {
            Log.m105920e("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: gen auth key failed");
            C77290d.m93109g(2, -1000223, -1, "gen ask failed");
        } else if (i == 1003) {
            Log.m105920e("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "alvinluo upload ask failed");
            C77290d.m93109g(3, 4, cVar.f61886a, cVar.f61887b);
        } else {
            Log.m105920e("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "alvinluo unknown error when prepare auth key");
            C77290d.m93109g(1000, -1000223, cVar.f61886a, cVar.f61887b);
        }
        C115669n.INSTANCE.mo175911u(1104, 34);
        C78709x xVar3 = this.f230366a;
        xVar3.mo108647c3(new C78709x.C78719b.C78721b(xVar3.getString(C0966R.string.amo)));
    }

    /* renamed from: c */
    public void mo107285c(C22551c cVar) {
        C87412m.m108594g(cVar, "result");
        this.f230366a.mo108648d3(C78709x.C78710a.C78712b.f230422a);
    }
}
