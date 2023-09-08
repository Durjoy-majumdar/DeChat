package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50897q03;
import te3.C51040r03;

/* renamed from: com.tencent.mm.plugin.remittance.model.d0 */
public class C42838d0 extends C75123k0 {

    /* renamed from: d */
    public C47350c f116011d;

    /* renamed from: e */
    public C51040r03 f116012e;

    /* renamed from: f */
    public C11385n f116013f;

    /* renamed from: g */
    public String f116014g;

    public C42838d0(String str, long j, String str2) {
        Log.m105925i("Micromsg.NetSceneRemittanceMsgCheck", "transferID: %s, amount:%s msgCheckStr:%s", str, Long.valueOf(j), str2);
        this.f116014g = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50897q03();
        bVar.f127067b = new C51040r03();
        bVar.f127069d = 6230;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transfermsgcheck";
        C47350c a = bVar.mo72403a();
        this.f116011d = a;
        C50897q03 q032 = (C50897q03) a.f127055a.f127080a;
        q032.f140076d = str;
        q032.f140077e = j;
        q032.f140078f = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116013f = nVar;
        return dispatch(gVar, this.f116011d, this);
    }

    public int getType() {
        return 6230;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("Micromsg.NetSceneRemittanceMsgCheck", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51040r03 r032 = (C51040r03) ((C47350c) uVar).f127056b.f127083a;
        this.f116012e = r032;
        Log.m105925i("Micromsg.NetSceneRemittanceMsgCheck", "ret_code: %s, ret_msg: %s", Integer.valueOf(r032.f140644d), this.f116012e.f140645e);
        C11385n nVar = this.f116013f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
