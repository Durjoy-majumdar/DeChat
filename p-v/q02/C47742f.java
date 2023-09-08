package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50539ng2;
import te3.C50678og2;

/* renamed from: q02.f */
public class C47742f extends C75113f0 {

    /* renamed from: r */
    public C50678og2 f128257r;

    public C47742f() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50539ng2();
        bVar.f127067b = new C50678og2();
        bVar.f127069d = 2725;
        bVar.f127068c = "/cgi-bin/mmpay-bin/honeypayerlist";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C50539ng2 ng22 = (C50539ng2) a.f127055a.f127080a;
    }

    public int getType() {
        return 2725;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneHoneyPayerList", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50678og2 og22 = (C50678og2) ((C47350c) uVar).f127056b.f127083a;
        this.f128257r = og22;
        Log.m105925i("MicroMsg.NetSceneHoneyPayerList", "retcode: %s, retmsg: %s", Integer.valueOf(og22.f139154d), this.f128257r.f139155e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50678og2 og22 = (C50678og2) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = og22.f139154d;
        this.f221038h = og22.f139155e;
    }
}
