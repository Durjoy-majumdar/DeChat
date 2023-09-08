package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50999qr;
import te3.C51142rr;

/* renamed from: com.tencent.mm.plugin.remittance.model.q0 */
public class C42852q0 extends C75113f0 {

    /* renamed from: r */
    public C51142rr f116046r;

    public C42852q0(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50999qr();
        bVar.f127067b = new C51142rr();
        bVar.f127069d = 2548;
        bVar.f127068c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_paycheck";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C50999qr qrVar = (C50999qr) a.f127055a.f127080a;
        qrVar.f140490d = str;
        qrVar.f140491e = str2;
        Log.m105919d("MicroMsg.NetSceneUnionTransferPayCheck", "groupName:%s", str2);
    }

    public int getType() {
        return 2548;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUnionTransferPayCheck", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51142rr rrVar = (C51142rr) ((C47350c) uVar).f127056b.f127083a;
        this.f116046r = rrVar;
        Log.m105925i("MicroMsg.NetSceneUnionTransferPayCheck", "ret_code: %s, ret_msg: %s", Integer.valueOf(rrVar.f141083d), this.f116046r.f141084e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C51142rr rrVar = (C51142rr) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = rrVar.f141083d;
        this.f221038h = rrVar.f141084e;
    }
}
