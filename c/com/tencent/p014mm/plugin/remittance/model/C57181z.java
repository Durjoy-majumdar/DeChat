package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48734am;
import te3.C64776vl;
import te3.C64883zl;

/* renamed from: com.tencent.mm.plugin.remittance.model.z */
public class C57181z extends C75123k0 {

    /* renamed from: d */
    public final C47350c f163886d;

    /* renamed from: e */
    public C11385n f163887e;

    /* renamed from: f */
    public C64883zl f163888f;

    public C57181z(String str, String str2, long j, String str3) {
        Log.m105925i("MicroMsg.NetScenePersonalPayCheck", "personalpay_order_id = %s ,trans_id = %s ,total_amount = %s，placeorder_ext = %s", str, str2, Long.valueOf(j), str3);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64883zl();
        bVar.f127067b = new C48734am();
        bVar.f127069d = 5047;
        bVar.f127068c = "/cgi-bin/mmpay-bin/personalpaypaycheck";
        C47350c a = bVar.mo72403a();
        this.f163886d = a;
        this.f163888f = (C64883zl) a.f127055a.f127080a;
        C64776vl vlVar = new C64776vl();
        vlVar.f185917d = str;
        vlVar.f185918e = str2;
        vlVar.f185919f = j;
        vlVar.f185920g = str3;
        this.f163888f.f186707d = vlVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f163887e = nVar;
        return dispatch(gVar, this.f163886d, this);
    }

    public int getType() {
        return 5047;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetScenePersonalPayCheck", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C48734am amVar = (C48734am) ((C47350c) uVar).f127056b.f127083a;
        }
        C11385n nVar = this.f163887e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
