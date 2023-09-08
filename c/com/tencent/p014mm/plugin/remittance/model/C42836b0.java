package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50309lt3;
import te3.C50449mt3;

/* renamed from: com.tencent.mm.plugin.remittance.model.b0 */
public class C42836b0 extends C75123k0 {

    /* renamed from: d */
    public final C47350c f116008d;

    /* renamed from: e */
    public C11385n f116009e;

    /* renamed from: f */
    public C50449mt3 f116010f;

    public C42836b0(String str, String str2) {
        Log.m105925i("MicroMsg.NetScenePersonalPayRequestPayment", "appID = %s，out_prepay_id = %s", str, str2);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50309lt3();
        bVar.f127067b = new C50449mt3();
        bVar.f127069d = 4912;
        bVar.f127068c = "/cgi-bin/mmpay-bin/personalpayrequestpayment";
        C47350c a = bVar.mo72403a();
        this.f116008d = a;
        C50309lt3 lt32 = (C50309lt3) a.f127055a.f127080a;
        lt32.f137639d = str;
        lt32.f137640e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116009e = nVar;
        return dispatch(gVar, this.f116008d, this);
    }

    public int getType() {
        return 4912;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetScenePersonalPayRequestPayment", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f116010f = (C50449mt3) ((C47350c) uVar).f127056b.f127083a;
        }
        C11385n nVar = this.f116009e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
