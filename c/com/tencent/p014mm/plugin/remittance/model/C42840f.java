package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ie3.C8883h;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48895br;
import te3.C49039cr;

/* renamed from: com.tencent.mm.plugin.remittance.model.f */
public class C42840f extends C75113f0 {

    /* renamed from: r */
    public C49039cr f116018r;

    public C42840f(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48895br();
        bVar.f127067b = new C49039cr();
        bVar.f127069d = 2783;
        bVar.f127068c = "/cgi-bin/mmpay-bin/beforetransfer";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C48895br brVar = (C48895br) a.f127055a.f127080a;
        brVar.f131271d = str;
        if (!C8883h.m8692c()) {
            brVar.f131272e = C8883h.f28150a;
        }
        brVar.f131273f = str2;
        Log.m105919d("MicroMsg.NetSceneBeforeTransfer", "rcver name: %s", str);
    }

    public int getType() {
        return 2783;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBeforeTransfer", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49039cr crVar = (C49039cr) ((C47350c) uVar).f127056b.f127083a;
        this.f116018r = crVar;
        Log.m105925i("MicroMsg.NetSceneBeforeTransfer", "ret_code: %s, ret_msg: %s", Integer.valueOf(crVar.f131911d), this.f116018r.f131912e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C49039cr crVar = (C49039cr) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = crVar.f131911d;
        this.f221038h = crVar.f131912e;
    }
}
