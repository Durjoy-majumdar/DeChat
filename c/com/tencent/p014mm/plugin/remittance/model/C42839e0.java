package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49181dr;
import te3.C49320er;

/* renamed from: com.tencent.mm.plugin.remittance.model.e0 */
public class C42839e0 extends C75123k0 {

    /* renamed from: d */
    public C47350c f116015d;

    /* renamed from: e */
    public C49320er f116016e;

    /* renamed from: f */
    public C11385n f116017f;

    public C42839e0(String str, String str2, String str3, String str4, long j, String str5) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49181dr();
        bVar.f127067b = new C49320er();
        bVar.f127069d = 1779;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferoldpaycheck";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116015d = a;
        C49181dr drVar = (C49181dr) a.f127055a.f127080a;
        drVar.f132477d = str;
        drVar.f132478e = str2;
        drVar.f132479f = str3;
        drVar.f132480g = str4;
        drVar.f132481h = j;
        drVar.f132482i = str5;
        Log.m105925i("MicroMsg.NetSceneRemittancePayCheck", "reqKey: %s, transfer: %s, fee: %s", str, str2, Long.valueOf(j));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116017f = nVar;
        return dispatch(gVar, this.f116015d, this);
    }

    public int getType() {
        return 1779;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneRemittancePayCheck", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49320er erVar = (C49320er) ((C47350c) uVar).f127056b.f127083a;
        this.f116016e = erVar;
        Log.m105925i("MicroMsg.NetSceneRemittancePayCheck", "ret_code: %s, ret_msg: %s", Integer.valueOf(erVar.f133078d), this.f116016e.f133079e);
        C11385n nVar = this.f116017f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
