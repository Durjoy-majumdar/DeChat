package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48901bs3;
import te3.C49045cs3;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.c2 */
public class C42514c2 extends C75123k0 {

    /* renamed from: d */
    public final C47350c f115066d;

    /* renamed from: e */
    public C11385n f115067e;

    public C42514c2(String str, String str2, int i, String str3, String str4) {
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyReport", "NetSceneLuckyMoneyReport() sendId:%s unique_id:%s reportType:%s sendUsername:%s recvUserName:%s", str, str2, Integer.valueOf(i), str3, str4);
        C47350c.C47352b bVar = new C47350c.C47352b();
        C48901bs3 bs32 = new C48901bs3();
        bs32.f131288d = str;
        bs32.f131289e = str2;
        bs32.f131290f = i;
        bs32.f131291g = str3;
        bs32.f131292h = str4;
        bVar.f127066a = bs32;
        bVar.f127067b = new C49045cs3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/wxhbreport";
        bVar.f127069d = 2715;
        this.f115066d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f115067e = nVar;
        return dispatch(gVar, this.f115066d, this);
    }

    public int getType() {
        return 2715;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.NetSceneLuckyMoneyReport", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C49045cs3 cs32 = (C49045cs3) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f115067e.onSceneEnd(i2, i3, str, this);
    }
}
