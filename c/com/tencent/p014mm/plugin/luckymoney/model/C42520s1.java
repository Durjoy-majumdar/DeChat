package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50817pe2;
import te3.C50950qe2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.s1 */
public class C42520s1 extends C75113f0 {

    /* renamed from: r */
    public C50950qe2 f115069r;

    public C42520s1(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50817pe2();
        bVar.f127067b = new C50950qe2();
        bVar.f127069d = 2929;
        bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/businesscallbackwxhb";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C50817pe2 pe22 = (C50817pe2) a.f127055a.f127080a;
        pe22.f139724d = str;
        pe22.f139725e = str2;
        pe22.f139726f = str3;
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyBusinessCallback", "sendId: %s, %s", str, str3);
    }

    public int getType() {
        return 2929;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C50950qe2 qe22 = (C50950qe2) ((C47350c) uVar).f127056b.f127083a;
        this.f115069r = qe22;
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyBusinessCallback", "retcode: %s, retmsg: %s", Integer.valueOf(qe22.f140262d), this.f115069r.f140263e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50950qe2 qe22 = (C50950qe2) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = qe22.f140262d;
        this.f221038h = qe22.f140263e;
    }
}
