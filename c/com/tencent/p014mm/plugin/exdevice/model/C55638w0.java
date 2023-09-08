package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101766ct2;
import te3.ti4;
import te3.ui4;

/* renamed from: com.tencent.mm.plugin.exdevice.model.w0 */
public class C55638w0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f158351d = null;

    /* renamed from: e */
    public C47350c f158352e = null;

    /* renamed from: f */
    public String f158353f = null;

    /* renamed from: g */
    public int f158354g = 0;

    public C55638w0(C101766ct2 ct22, String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ti4();
        bVar.f127067b = new ui4();
        bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/transfermsgtodevice";
        bVar.f127069d = 1717;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f158352e = bVar.mo72403a();
        Log.m105925i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "deviceid %s", str2);
        ti4 ti4 = (ti4) this.f158352e.f127055a.f127080a;
        ti4.f185564e = str;
        ti4.f185563d = str2;
        ti4.f185565f = ct22;
        ti4.f185566g = i;
        this.f158353f = str2;
        this.f158354g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f158351d = nVar;
        return dispatch(gVar, this.f158352e, this);
    }

    public int getType() {
        return 1717;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f158351d.onSceneEnd(i2, i3, str, this);
    }
}
