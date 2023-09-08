package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49741hr;
import te3.C49885ir;

/* renamed from: com.tencent.mm.plugin.remittance.model.g */
public class C42841g extends C75113f0 {

    /* renamed from: r */
    public C49885ir f116019r;

    public C42841g(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49741hr();
        bVar.f127067b = new C49885ir();
        bVar.f127069d = 4465;
        bVar.f127068c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_transferbefore";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C49741hr hrVar = (C49741hr) a.f127055a.f127080a;
        hrVar.f134821d = str;
        if (C72996z1.m85843n5(str)) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            hrVar.f134822e = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
        }
        hrVar.f134823f = str2;
        Log.m105919d("MicroMsg.NetSceneBeforeUnionTransfer", "userName:%s groupName:%s", str, str2);
    }

    public int getType() {
        return 4465;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBeforeUnionTransfer", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49885ir irVar = (C49885ir) ((C47350c) uVar).f127056b.f127083a;
        this.f116019r = irVar;
        Log.m105925i("MicroMsg.NetSceneBeforeUnionTransfer", "ret_code: %s, ret_msg: %s", Integer.valueOf(irVar.f135596d), this.f116019r.f135597e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C49885ir irVar = (C49885ir) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = irVar.f135596d;
        this.f221038h = irVar.f135597e;
    }
}
