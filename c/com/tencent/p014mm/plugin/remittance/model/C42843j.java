package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51699vj;
import te3.C51839wj;
import te3.C77925f4;

/* renamed from: com.tencent.mm.plugin.remittance.model.j */
public class C42843j extends C75123k0 {

    /* renamed from: d */
    public C47350c f116023d;

    /* renamed from: e */
    public C51839wj f116024e;

    /* renamed from: f */
    public C11385n f116025f;

    public C42843j(C77925f4 f4Var, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51699vj();
        bVar.f127067b = new C51839wj();
        bVar.f127069d = 1241;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2fpaycheck";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116023d = a;
        C51699vj vjVar = (C51699vj) a.f127055a.f127080a;
        vjVar.f143494d = f4Var;
        vjVar.f143495e = str;
        Log.m105925i("MicroMsg.NetSceneBusiF2fPayCheck", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s req: %s", f4Var.f227322d, f4Var.f227323e, Integer.valueOf(f4Var.f227331p), C70580a.m83108b(f4Var));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116025f = nVar;
        return dispatch(gVar, this.f116023d, this);
    }

    public int getType() {
        return 1241;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneBusiF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51839wj wjVar = (C51839wj) ((C47350c) uVar).f127056b.f127083a;
        this.f116024e = wjVar;
        Log.m105925i("MicroMsg.NetSceneBusiF2fPayCheck", "ret_code: %s, ret_msg: %s", Integer.valueOf(wjVar.f144070d), this.f116024e.f144071e);
        C11385n nVar = this.f116025f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
