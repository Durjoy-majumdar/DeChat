package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50578nq;
import te3.C50715oq;

/* renamed from: com.tencent.mm.plugin.scanner.model.q */
public class C42907q extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f116178d;

    /* renamed from: e */
    public C11385n f116179e;

    public C42907q(String str, C89349b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C50578nq();
        bVar2.f127067b = new C50715oq();
        bVar2.f127069d = 4561;
        bVar2.f127068c = "/cgi-bin/mmpay-bin/report_qrcode_scan_identify_scene";
        C47350c a = bVar2.mo72403a();
        this.f116178d = a;
        C50578nq nqVar = (C50578nq) a.f127055a.f127080a;
        nqVar.f138715d = str;
        nqVar.f138716e = bVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116179e = nVar;
        return dispatch(gVar, this.f116178d, this);
    }

    public int getType() {
        return 4561;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneF2fQrcodeScanIdentify", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C50715oq oqVar = (C50715oq) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f116179e.onSceneEnd(i2, i3, str, this);
    }
}
