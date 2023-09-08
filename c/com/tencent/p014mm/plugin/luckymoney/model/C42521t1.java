package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.al4;
import te3.zk4;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.t1 */
public class C42521t1 extends C75113f0 {

    /* renamed from: r */
    public al4 f115070r;

    public C42521t1(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new zk4();
        bVar.f127067b = new al4();
        bVar.f127069d = 5160;
        bVar.f127068c = "/cgi-bin/mmpay-bin/unionhb/businesscallbackunionhb";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        zk4 zk4 = (zk4) a.f127055a.f127080a;
        zk4.f146055d = str;
        zk4.f146056e = str2;
        zk4.f146057f = str3;
        zk4.f146058g = 0;
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyBusinessCallbackUnion", "NetSceneLuckyMoneyBusinessCallbackUnion request sendId: %s, %s", str, str3);
    }

    public int getType() {
        return 5160;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        al4 al4 = (al4) ((C47350c) uVar).f127056b.f127083a;
        this.f115070r = al4;
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyBusinessCallbackUnion", "retcode: %s, retmsg: %s", Integer.valueOf(al4.f130621d), this.f115070r.f130622e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        al4 al4 = (al4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = al4.f130621d;
        this.f221038h = al4.f130622e;
    }
}
