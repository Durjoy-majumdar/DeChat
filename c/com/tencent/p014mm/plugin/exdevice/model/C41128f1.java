package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49697hf2;
import te3.C51615uy3;
import te3.C51757vy3;

/* renamed from: com.tencent.mm.plugin.exdevice.model.f1 */
public class C41128f1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110796d = null;

    /* renamed from: e */
    public C47350c f110797e = null;

    public C41128f1(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51615uy3();
        bVar.f127067b = new C51757vy3();
        bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/searchwifiharddevice";
        bVar.f127069d = 1270;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110797e = a;
        C51615uy3 uy32 = (C51615uy3) a.f127055a.f127080a;
        C49697hf2 hf22 = new C49697hf2();
        uy32.f143194d = hf22;
        hf22.f134596d = str;
        hf22.f134597e = str2;
        uy32.f143195e = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110796d = nVar;
        return dispatch(gVar, this.f110797e, this);
    }

    public int getType() {
        return 1270;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneSearchWiFiHardDevice", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f110796d.onSceneEnd(i2, i3, str, this);
    }
}
