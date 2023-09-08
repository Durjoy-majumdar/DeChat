package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50836pj;
import te3.C50967qj;

/* renamed from: com.tencent.mm.plugin.remittance.model.h */
public class C42842h extends C75123k0 {

    /* renamed from: d */
    public C47350c f116020d;

    /* renamed from: e */
    public C50967qj f116021e;

    /* renamed from: f */
    public C11385n f116022f;

    public C42842h(String str, String str2, String str3, int i, C89349b bVar, String str4) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C50836pj();
        bVar2.f127067b = new C50967qj();
        bVar2.f127069d = 1680;
        bVar2.f127068c = "/cgi-bin/mmpay-bin/busif2factqry";
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C47350c a = bVar2.mo72403a();
        this.f116020d = a;
        C50836pj pjVar = (C50836pj) a.f127055a.f127080a;
        pjVar.f139779f = str3;
        pjVar.f139777d = str;
        pjVar.f139778e = str2;
        pjVar.f139780g = i;
        pjVar.f139781h = bVar;
        pjVar.f139782i = str4;
        Log.m105925i("MicroMsg.NetSceneBusiF2fActQry", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s", str, str2, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116022f = nVar;
        return dispatch(gVar, this.f116020d, this);
    }

    public int getType() {
        return 1680;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneBusiF2fActQry", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50967qj qjVar = (C50967qj) ((C47350c) uVar).f127056b.f127083a;
        this.f116021e = qjVar;
        Log.m105925i("MicroMsg.NetSceneBusiF2fActQry", "ret_code: %s, ret_msg: %s", Integer.valueOf(qjVar.f140341d), this.f116021e.f140342e);
        C11385n nVar = this.f116022f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
