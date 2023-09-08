package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import di3.C86312j;
import h81.C32735h;
import ob0.C47350c;
import te3.C51661v82;
import te3.C78007w82;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.e */
public class C42516e extends C75128o0<C78007w82> {
    public C42516e(String str, int i) {
        C51661v82 v822 = new C51661v82();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = v822;
        bVar.f127067b = new C78007w82();
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_envelope_transfer_new_cgi, 1) == 1;
        if (z) {
            bVar.f127069d = 3857;
            bVar.f127068c = "/cgi-bin/micromsg-bin/getshowsourcenew";
        } else {
            bVar.f127069d = 2620;
            bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/getshowsource";
        }
        v822.f143386d = str;
        v822.f143387e = i;
        Log.m105925i("MicroMsg.CgiGetShowSource", "request，isNew: %s，type：%s, lastPageData：%s", Boolean.valueOf(z), Integer.valueOf(i), str);
        mo123453j(bVar.mo72403a());
    }
}
