package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51592us2;
import te3.C51734vs2;

/* renamed from: com.tencent.mm.plugin.scanner.model.v */
public final class C42911v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f116191d;

    /* renamed from: e */
    public final C47350c f116192e;

    /* renamed from: f */
    public int f116193f;

    public C42911v(int i) {
        this.f116193f = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51592us2();
        bVar.f127067b = new C51734vs2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizscan_confsync";
        bVar.f127069d = 1812;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116192e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MMBizScanConfSyncReq");
        ((C51592us2) aVar).f143071d = i;
        Log.m105925i("MicroMsg.NetSceneScanConfigSync", "alvinluo scanConfigSync type: %d", Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f116191d = nVar;
        return dispatch(gVar, this.f116192e, this);
    }

    public int getType() {
        return 1812;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneScanConfigSync", "alvinluo onGYNetEnd errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f116191d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
