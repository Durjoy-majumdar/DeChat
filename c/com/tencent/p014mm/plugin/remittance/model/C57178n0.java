package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64320dn3;
import te3.C64615or;
import te3.C64637pr;
import te3.dl4;

/* renamed from: com.tencent.mm.plugin.remittance.model.n0 */
public class C57178n0 extends C75113f0 {

    /* renamed from: r */
    public C64637pr f163879r;

    /* renamed from: s */
    public int f163880s;

    public C57178n0(String str, String str2, String str3, int i, String str4, String str5) {
        this.f163880s = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64615or();
        bVar.f127067b = new C64637pr();
        bVar.f127069d = 2717;
        bVar.f127068c = "/cgi-bin/mmpay-bin/uniontransfer_operation";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C64615or orVar = (C64615or) a.f127055a.f127080a;
        orVar.f184699e = str;
        orVar.f184698d = str2;
        orVar.f184700f = str3;
        orVar.f184701g = i;
        orVar.f184702h = str4;
        orVar.f184703i = str5;
        Log.m105919d("MicroMsg.NetSceneUnionTransferConfirm", "groupName:%s", str3);
    }

    public int getType() {
        return 2717;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUnionTransferConfirm", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C64637pr prVar = (C64637pr) ((C47350c) uVar).f127056b.f127083a;
        this.f163879r = prVar;
        Log.m105925i("MicroMsg.NetSceneUnionTransferConfirm", "ret_code: %s, ret_msg: %s", Integer.valueOf(prVar.f184886d), this.f163879r.f184887e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C64637pr prVar = (C64637pr) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = prVar.f184886d;
        this.f221038h = prVar.f184887e;
    }

    /* renamed from: r1 */
    public C64320dn3 mo80778r1() {
        if (this.f163879r.f184888f == null) {
            return null;
        }
        C64320dn3 dn32 = new C64320dn3();
        dl4 dl4 = this.f163879r.f184888f;
        dn32.f182785d = dl4.f182772d;
        dn32.f182786e = dl4.f182773e;
        dn32.f182787f = dl4.f182774f;
        dn32.f182788g = dl4.f182775g;
        dn32.f182789h = dl4.f182776h;
        return dn32;
    }
}
