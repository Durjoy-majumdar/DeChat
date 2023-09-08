package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50697ok3;
import te3.C50843pk3;

/* renamed from: q02.k */
public class C47747k extends C75113f0 {

    /* renamed from: r */
    public C50843pk3 f128264r;

    public C47747k(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50697ok3();
        bVar.f127067b = new C50843pk3();
        bVar.f127069d = 2851;
        bVar.f127068c = "/cgi-bin/mmpay-bin/qryhpcarddetail";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        ((C50697ok3) a.f127055a.f127080a).f139240d = str;
    }

    public int getType() {
        return 2851;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneQryHoneyPayCardDetail", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50843pk3 pk32 = (C50843pk3) ((C47350c) uVar).f127056b.f127083a;
        this.f128264r = pk32;
        Log.m105925i("MicroMsg.NetSceneQryHoneyPayCardDetail", "retcode: %s, retmsg: %s", Integer.valueOf(pk32.f139805d), this.f128264r.f139806e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50843pk3 pk32 = (C50843pk3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = pk32.f139805d;
        this.f221038h = pk32.f139806e;
    }
}
