package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51988xl;
import te3.C64776vl;
import te3.C64806wl;

/* renamed from: com.tencent.mm.plugin.remittance.model.y */
public class C57180y extends C75123k0 {

    /* renamed from: d */
    public final C47350c f163883d;

    /* renamed from: e */
    public C11385n f163884e;

    /* renamed from: f */
    public C64806wl f163885f;

    public C57180y(String str, String str2, long j, String str3) {
        Log.m105925i("MicroMsg.NetScenePersonalPayCancelPay", "personalpay_order_id = %s ,trans_id = %s ,total_amount = %s，placeorder_ext = %s", str, str2, Long.valueOf(j), str3);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64806wl();
        bVar.f127067b = new C51988xl();
        bVar.f127069d = 5003;
        bVar.f127068c = "/cgi-bin/mmpay-bin/personalpaycancelpay";
        C47350c a = bVar.mo72403a();
        this.f163883d = a;
        this.f163885f = (C64806wl) a.f127055a.f127080a;
        C64776vl vlVar = new C64776vl();
        vlVar.f185917d = str;
        vlVar.f185918e = str2;
        vlVar.f185919f = j;
        vlVar.f185920g = str3;
        this.f163885f.f186144d = vlVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f163884e = nVar;
        return dispatch(gVar, this.f163883d, this);
    }

    public int getType() {
        return 5003;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetScenePersonalPayCancelPay", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C51988xl xlVar = (C51988xl) ((C47350c) uVar).f127056b.f127083a;
        }
        C11385n nVar = this.f163884e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
