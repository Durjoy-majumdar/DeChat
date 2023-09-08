package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C101766ct2;
import te3.vi4;
import te3.wi4;

/* renamed from: com.tencent.mm.plugin.exdevice.model.h1 */
public class C55637h1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f158348d = null;

    /* renamed from: e */
    public C47350c f158349e = null;

    /* renamed from: f */
    public C93366l1 f158350f;

    public C55637h1(C101766ct2 ct22, C93366l1 l1Var) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new vi4();
        bVar.f127067b = new wi4();
        bVar.f127068c = "/cgi-bin/mmiot-bin/mmiot/mmiot_transfermsgtodevice";
        bVar.f127069d = 6844;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f158349e = bVar.mo72403a();
        Log.m105925i("MicroMsg.exdevice.NetSceneTransferToIotDevice", "deviceid %s", l1Var.f269424d);
        vi4 vi4 = (vi4) this.f158349e.f127055a.f127080a;
        vi4.f185910d = l1Var.f269432o;
        vi4.f185911e = l1Var.f269424d;
        vi4.f185912f = ct22;
        this.f158350f = l1Var;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f158348d = nVar;
        return dispatch(gVar, this.f158349e, this);
    }

    public int getType() {
        return 6844;
    }

    /* renamed from: j1 */
    public wi4 mo77150j1() {
        C47465a aVar;
        C47350c cVar = this.f158349e;
        if (cVar == null || (aVar = cVar.f127056b.f127083a) == null) {
            return null;
        }
        return (wi4) aVar;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneTransferToIotDevice", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f158348d.onSceneEnd(i2, i3, str, this);
    }
}
