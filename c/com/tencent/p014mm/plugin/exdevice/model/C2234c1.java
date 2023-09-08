package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82262v;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49966ja;
import te3.C50674of2;
import te3.C50822pf2;
import te3.C51163rv3;

/* renamed from: com.tencent.mm.plugin.exdevice.model.c1 */
public class C2234c1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f12302d = null;

    /* renamed from: e */
    public C47350c f12303e = null;

    /* renamed from: f */
    public String f12304f = null;

    public C2234c1(String str, String str2, String str3, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50674of2();
        bVar.f127067b = new C50822pf2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/device/subscribestatus";
        bVar.f127069d = C82262v.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f12303e = a;
        C50674of2 of22 = (C50674of2) a.f127055a.f127080a;
        of22.f139139d = C89349b.m111675b(str2);
        of22.f139140e = C89349b.m111675b(str3);
        of22.f139141f = i;
        this.f12304f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f12302d = nVar;
        return dispatch(gVar, this.f12303e, this);
    }

    public int getType() {
        return C82262v.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        C41166r1.Bx0().mo74334bD(this.f12304f);
        if (i2 == 0 && i3 == 0) {
            C49966ja baseResponse = ((C50822pf2) this.f12303e.f127056b.f127083a).getBaseResponse();
            int i4 = baseResponse.f135955d;
            C51163rv3 rv32 = baseResponse.f135956e;
            if (rv32.f141176e) {
                rv32.getClass();
            }
            Log.m105924i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "HardDeviceStatusSubResponse: ret=" + i4 + ",msg=" + str);
        }
        this.f12302d.onSceneEnd(i2, i3, str, this);
    }
}
