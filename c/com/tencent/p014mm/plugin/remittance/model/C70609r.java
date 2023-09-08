package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50158kp;
import te3.C77953jp;

/* renamed from: com.tencent.mm.plugin.remittance.model.r */
public class C70609r extends C75123k0 {

    /* renamed from: d */
    public C50158kp f204281d;

    /* renamed from: e */
    public C47350c f204282e;

    /* renamed from: f */
    public C11385n f204283f;

    public C70609r(String str, String str2, int i, String str3, String str4, int i2, int i3, String str5, String str6, int i4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77953jp();
        bVar.f127067b = new C50158kp();
        bVar.f127069d = 2773;
        bVar.f127068c = "/cgi-bin/mmpay-bin/f2fsucpage";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f204282e = a;
        C77953jp jpVar = (C77953jp) a.f127055a.f127080a;
        jpVar.f227671d = str;
        jpVar.f227672e = str2;
        jpVar.f227673f = i;
        jpVar.f227674g = str3;
        jpVar.f227675h = str4;
        jpVar.f227676i = i2;
        jpVar.f227677j = i3;
        jpVar.f227678n = str5;
        jpVar.f227679o = str6;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f204283f = nVar;
        return dispatch(gVar, this.f204282e, this);
    }

    public int getType() {
        return 2773;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneF2fSuccPage", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50158kp kpVar = (C50158kp) ((C47350c) uVar).f127056b.f127083a;
        this.f204281d = kpVar;
        Log.m105925i("MicroMsg.NetSceneF2fSuccPage", "ret_code: %s, ret_msg: %s", Integer.valueOf(kpVar.f136921d), this.f204281d.f136922e);
        C11385n nVar = this.f204283f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
