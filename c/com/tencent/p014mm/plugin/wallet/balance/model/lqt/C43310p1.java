package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49531g83;
import te3.C49673h83;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.p1 */
public class C43310p1 extends C75123k0 {

    /* renamed from: d */
    public C49673h83 f117146d;

    /* renamed from: e */
    public C47350c f117147e;

    /* renamed from: f */
    public C11385n f117148f;

    public C43310p1(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49531g83();
        bVar.f127067b = new C49673h83();
        bVar.f127069d = 2996;
        bVar.f127068c = "/cgi-bin/mmpay-bin/openlqbaccount";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f117147e = a;
        C49531g83 g832 = (C49531g83) a.f127055a.f127080a;
        g832.f133927d = str;
        g832.f133928e = str2;
        g832.f133929f = C71648n1.f207652a;
        Log.m105925i("MicroMsg.NetSceneOpenLqbAccount", "NetSceneOpenLqbAccount, eCardType: %s, extraData: %s", str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f117148f = nVar;
        return dispatch(gVar, this.f117147e, this);
    }

    public int getType() {
        return 2996;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneOpenLqbAccount", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C49673h83 h832 = (C49673h83) ((C47350c) uVar).f127056b.f127083a;
        this.f117146d = h832;
        Log.m105925i("MicroMsg.NetSceneOpenLqbAccount", "onGYNetEnd, retcode: %s, retmsg: %s", Integer.valueOf(h832.f134500d), this.f117146d.f134501e);
        C49673h83 h833 = this.f117146d;
        if (h833.f134500d == 0) {
            C71648n1.m84125c(h833.f134503g);
        }
        C11385n nVar = this.f117148f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
