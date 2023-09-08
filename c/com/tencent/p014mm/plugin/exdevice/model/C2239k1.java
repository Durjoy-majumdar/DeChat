package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50202l12;
import te3.C50337m12;
import te3.C50479n12;
import te3.C50622o12;

/* renamed from: com.tencent.mm.plugin.exdevice.model.k1 */
public class C2239k1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f12308d = null;

    /* renamed from: e */
    public C11385n f12309e = null;

    public C2239k1(LinkedList<C50337m12> linkedList, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50479n12();
        bVar.f127067b = new C50622o12();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getharddeviceoperticket";
        bVar.f127069d = 543;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f12308d = a;
        C50479n12 n122 = (C50479n12) a.f127055a.f127080a;
        if (!Util.isNullOrNil(str)) {
            C50202l12 l122 = new C50202l12();
            l122.f137127d = str;
            n122.f138328e = l122;
        }
        n122.f138327d = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f12309e = nVar;
        return dispatch(gVar, this.f12308d, this);
    }

    public int getType() {
        return 543;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.exdevice.NetsceneGetHardDeviceOperTicket", "GetHardDeviceOperTicket onGYNetEnd netId = %s, errType = %s, errCode = %s, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f12309e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
