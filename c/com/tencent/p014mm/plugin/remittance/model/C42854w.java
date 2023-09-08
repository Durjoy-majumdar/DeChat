package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51167rw2;
import te3.C51308sw2;

/* renamed from: com.tencent.mm.plugin.remittance.model.w */
public class C42854w extends C75123k0 {

    /* renamed from: d */
    public C11385n f116053d;

    /* renamed from: e */
    public C47350c f116054e;

    /* renamed from: f */
    public C51308sw2 f116055f;

    public C42854w(String str, int i, int i2, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51167rw2();
        bVar.f127067b = new C51308sw2();
        bVar.f127069d = 4708;
        bVar.f127068c = "/cgi-bin/mmpay-bin/sjtpayhome";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116054e = a;
        C51167rw2 rw22 = (C51167rw2) a.f127055a.f127080a;
        rw22.f141186d = str;
        rw22.f141188f = i;
        rw22.f141189g = i2;
        rw22.f141190h = str2;
        Log.m105925i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "NetSceneMerchantPayGetQRCodeInfo, qrcode: %s,scan_scene:%s, channel :%s qrcodeSenderUsername:%s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "doScene");
        this.f116053d = nVar;
        return dispatch(gVar, this.f116054e, this);
    }

    public int getType() {
        return 4708;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C51308sw2 sw22 = (C51308sw2) ((C47350c) uVar).f127056b.f127083a;
        this.f116055f = sw22;
        Log.m105925i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "retcode: %s, retmsg: %s", Integer.valueOf(sw22.f141790d), this.f116055f.f141791e);
        C11385n nVar = this.f116053d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
