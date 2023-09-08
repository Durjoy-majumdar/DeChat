package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64318dm;
import te3.C64344em;
import te3.C64776vl;

/* renamed from: com.tencent.mm.plugin.remittance.model.c0 */
public class C57177c0 extends C75123k0 {

    /* renamed from: d */
    public final C47350c f163876d;

    /* renamed from: e */
    public C11385n f163877e;

    /* renamed from: f */
    public C64344em f163878f;

    public C57177c0(C64776vl vlVar) {
        Log.m105925i("MicroMsg.NetScenePersonalPaySuccPage", "personalpay_order_id = %s ,trans_id = %s ,total_amount = %s，placeorder_ext = %s", vlVar.f185917d, vlVar.f185918e, Long.valueOf(vlVar.f185919f), vlVar.f185920g);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64318dm();
        bVar.f127067b = new C64344em();
        bVar.f127069d = 4587;
        bVar.f127068c = "/cgi-bin/mmpay-bin/personalpaysuccpage";
        C47350c a = bVar.mo72403a();
        this.f163876d = a;
        ((C64318dm) a.f127055a.f127080a).f182778d = vlVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f163877e = nVar;
        return dispatch(gVar, this.f163876d, this);
    }

    public int getType() {
        return 4587;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetScenePersonalPaySuccPage", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f163878f = (C64344em) ((C47350c) uVar).f127056b.f127083a;
        }
        C11385n nVar = this.f163877e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
