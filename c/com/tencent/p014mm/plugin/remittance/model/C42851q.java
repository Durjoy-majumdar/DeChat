package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49318eq;
import te3.C49457fq;

/* renamed from: com.tencent.mm.plugin.remittance.model.q */
public class C42851q extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f116044d;

    /* renamed from: e */
    public C11385n f116045e;

    public C42851q(String str, String str2, String str3, String str4, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49318eq();
        bVar.f127067b = new C49457fq();
        bVar.f127069d = 1273;
        bVar.f127068c = "/cgi-bin/mmpay-bin/f2fpaycheck";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116044d = a;
        C49318eq eqVar = (C49318eq) a.f127055a.f127080a;
        eqVar.f133069d = str;
        eqVar.f133070e = str2;
        eqVar.f133071f = str3;
        eqVar.f133072g = str4;
        eqVar.f133073h = i;
        Log.m105919d("MicroMsg.NetSceneF2fPayCheck", "NetSceneF2fPayCheck, f2fId: %s, transId: %s, extendStr: %s, amount: %s", str, str2, str3, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116045e = nVar;
        return dispatch(gVar, this.f116044d, this);
    }

    public int getType() {
        return 1273;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f116045e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
