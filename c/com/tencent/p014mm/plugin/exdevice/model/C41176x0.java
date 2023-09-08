package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50458mw1;
import te3.C50603nw1;

/* renamed from: com.tencent.mm.plugin.exdevice.model.x0 */
public class C41176x0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110934d = null;

    /* renamed from: e */
    public C47350c f110935e = null;

    public C41176x0(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50458mw1();
        bVar.f127067b = new C50603nw1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getboundharddevices";
        bVar.f127069d = 539;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110935e = a;
        ((C50458mw1) a.f127055a.f127080a).f138247d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110934d = nVar;
        return dispatch(gVar, this.f110935e, this);
    }

    public int getType() {
        return 539;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneGetBoundHardDevices", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f110934d.onSceneEnd(i2, i3, str, this);
    }
}
