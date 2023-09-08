package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50438mr;
import te3.C50580nr;

/* renamed from: com.tencent.mm.plugin.remittance.model.p0 */
public class C42850p0 extends C75113f0 {

    /* renamed from: r */
    public C50580nr f116043r;

    public C42850p0(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50438mr();
        bVar.f127067b = new C50580nr();
        bVar.f127069d = 4808;
        bVar.f127068c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_notify";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C50438mr mrVar = (C50438mr) a.f127055a.f127080a;
        mrVar.f138163d = str;
        mrVar.f138164e = i;
        Log.m105919d("MicroMsg.NetSceneUnionTransferNotify", "transferId:%s", str);
    }

    public int getType() {
        return 4808;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUnionTransferNotify", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50580nr nrVar = (C50580nr) ((C47350c) uVar).f127056b.f127083a;
        this.f116043r = nrVar;
        Log.m105925i("MicroMsg.NetSceneUnionTransferNotify", "ret_code: %s, ret_msg: %s", Integer.valueOf(nrVar.f138722d), this.f116043r.f138723e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50580nr nrVar = (C50580nr) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = nrVar.f138722d;
        this.f221038h = nrVar.f138723e;
    }
}
