package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.wxpaysdk.api.ResendMsgInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51584ur;
import te3.C77950j43;
import te3.C78006vr;

/* renamed from: com.tencent.mm.plugin.remittance.model.s0 */
public class C70611s0 extends C75113f0 {

    /* renamed from: r */
    public C78006vr f204284r;

    /* renamed from: s */
    public int f204285s;

    public C70611s0(int i, String str, String str2) {
        this.f204285s = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51584ur();
        bVar.f127067b = new C78006vr();
        bVar.f127069d = 2838;
        bVar.f127068c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_querydetail";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C51584ur urVar = (C51584ur) a.f127055a.f127080a;
        urVar.f143031d = str;
        urVar.f143032e = str2;
        Log.m105919d("MicroMsg.NetSceneUnionTransferQuery", "transfer_id:%s groupName:%s", str, str2);
    }

    public int getType() {
        return 2838;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUnionTransferQuery", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C78006vr vrVar = (C78006vr) ((C47350c) uVar).f127056b.f127083a;
        this.f204284r = vrVar;
        Log.m105925i("MicroMsg.NetSceneUnionTransferQuery", "ret_code: %s, ret_msg: %s", Integer.valueOf(vrVar.f228327d), this.f204284r.f228328e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C78006vr vrVar = (C78006vr) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = vrVar.f228327d;
        this.f221038h = vrVar.f228328e;
    }

    /* renamed from: r1 */
    public ResendMsgInfo mo97258r1() {
        ResendMsgInfo resendMsgInfo = new ResendMsgInfo();
        C77950j43 j432 = this.f204284r.f228334n;
        if (j432 != null) {
            resendMsgInfo.f211425d = j432.f227640d;
            resendMsgInfo.f211426e = j432.f227641e;
            resendMsgInfo.f211427f = j432.f227642f;
            resendMsgInfo.f211428g = j432.f227643g;
            resendMsgInfo.f211429h = j432.f227644h;
        }
        return resendMsgInfo;
    }
}
