package com.tencent.p014mm.wallet_core.model;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51850wm;
import te3.C51993xm;

/* renamed from: com.tencent.mm.wallet_core.model.z */
public class C45120z extends C75123k0 {

    /* renamed from: d */
    public C11385n f122391d;

    /* renamed from: e */
    public C47350c f122392e;

    public C45120z(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51850wm();
        bVar.f127067b = new C51993xm();
        bVar.f127068c = "/cgi-bin/mmpay-bin/cancelqrpay";
        bVar.f127069d = 410;
        bVar.f127070e = 198;
        bVar.f127071f = 1000000198;
        C75228t.m90208A(str2);
        bVar.f127073h = 0;
        C47350c a = bVar.mo72403a();
        this.f122392e = a;
        C51850wm wmVar = (C51850wm) a.f127055a.f127080a;
        wmVar.f144128d = str;
        wmVar.f144129e = str2;
        wmVar.f144130f = C113146l.m154805c();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f122391d = nVar;
        return dispatch(gVar, this.f122392e, this);
    }

    public int getType() {
        return 410;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetSceneCancelQRPay", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        this.f122391d.onSceneEnd(i2, i3, str, this);
    }
}
