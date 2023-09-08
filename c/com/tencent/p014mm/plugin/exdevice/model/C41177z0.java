package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49115d92;
import te3.C49252e92;

/* renamed from: com.tencent.mm.plugin.exdevice.model.z0 */
public class C41177z0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110936d = null;

    /* renamed from: e */
    public C47350c f110937e = null;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110936d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49115d92();
        bVar.f127067b = new C49252e92();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/rank/getsportdevicelist";
        bVar.f127069d = 1267;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110937e = a;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 1267;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneGetSportDeviceList", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f110936d.onSceneEnd(i2, i3, str, this);
    }
}
