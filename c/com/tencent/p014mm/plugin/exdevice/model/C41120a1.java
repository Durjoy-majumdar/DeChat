package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48689ab2;
import te3.C52239za2;

/* renamed from: com.tencent.mm.plugin.exdevice.model.a1 */
public class C41120a1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110782d = null;

    /* renamed from: e */
    public C47350c f110783e = null;

    public C41120a1() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52239za2();
        bVar.f127067b = new C48689ab2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/get_user_bind_iot_device_info";
        bVar.f127069d = 6693;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f110783e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110782d = nVar;
        return dispatch(gVar, this.f110783e, this);
    }

    public int getType() {
        return 6693;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneGetUserBindIotDeviceInfo", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f110782d.onSceneEnd(i2, i3, str, this);
    }
}
