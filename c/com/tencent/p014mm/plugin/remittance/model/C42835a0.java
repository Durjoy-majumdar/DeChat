package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48876bm;
import te3.C77913cm;

/* renamed from: com.tencent.mm.plugin.remittance.model.a0 */
public class C42835a0 extends C75123k0 {

    /* renamed from: d */
    public final C47350c f116005d;

    /* renamed from: e */
    public C11385n f116006e;

    /* renamed from: f */
    public C77913cm f116007f;

    public C42835a0(String str, String str2, long j) {
        Log.m105925i("MicroMsg.NetScenePersonalPayPlaceOrder", "appID = %s ，outPrepayId = %s ,,totalAmount = %s", str, str2, Long.valueOf(j));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48876bm();
        bVar.f127067b = new C77913cm();
        bVar.f127069d = 4304;
        bVar.f127068c = "/cgi-bin/mmpay-bin/personalpayplaceorder";
        C47350c a = bVar.mo72403a();
        this.f116005d = a;
        C48876bm bmVar = (C48876bm) a.f127055a.f127080a;
        bmVar.f131192d = str;
        bmVar.f131193e = str2;
        bmVar.f131194f = j;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116006e = nVar;
        return dispatch(gVar, this.f116005d, this);
    }

    public int getType() {
        return 4304;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetScenePersonalPayPlaceOrder", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f116007f = (C77913cm) ((C47350c) uVar).f127056b.f127083a;
        }
        C11385n nVar = this.f116006e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
