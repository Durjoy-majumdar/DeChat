package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48866bk;
import te3.C49011ck;
import te3.C77925f4;

/* renamed from: com.tencent.mm.plugin.remittance.model.m */
public class C42846m extends C75123k0 {

    /* renamed from: d */
    public C47350c f116029d;

    /* renamed from: e */
    public C49011ck f116030e;

    /* renamed from: f */
    public C11385n f116031f;

    public C42846m(C77925f4 f4Var, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48866bk();
        bVar.f127067b = new C49011ck();
        bVar.f127069d = 2702;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2funlockfavor";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116029d = a;
        C48866bk bkVar = (C48866bk) a.f127055a.f127080a;
        bkVar.f131158d = f4Var;
        bkVar.f131159e = str;
        C115669n.INSTANCE.mo175911u(886, 0);
        Log.m105925i("MicroMsg.NetSceneBusiF2fUnlockFavor", "NetSceneBusiF2fUnlockFavor, f2fId: %s, transId: %s, amount: %s", f4Var.f227322d, f4Var.f227323e, Integer.valueOf(f4Var.f227331p));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116031f = nVar;
        return dispatch(gVar, this.f116029d, this);
    }

    public int getType() {
        return 2702;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneBusiF2fUnlockFavor", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49011ck ckVar = (C49011ck) ((C47350c) uVar).f127056b.f127083a;
        this.f116030e = ckVar;
        Log.m105925i("MicroMsg.NetSceneBusiF2fUnlockFavor", "ret_code: %s, ret_msg: %s", Integer.valueOf(ckVar.f131784d), this.f116030e.f131785e);
        C115669n.INSTANCE.mo175911u(886, 1);
        C11385n nVar = this.f116031f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
