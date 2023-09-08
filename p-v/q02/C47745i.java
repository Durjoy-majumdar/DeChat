package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C52190yz2;
import te3.C52331zz2;

/* renamed from: q02.i */
public class C47745i extends C75113f0 {

    /* renamed from: r */
    public C52331zz2 f128261r;

    /* renamed from: s */
    public int f128262s;

    public C47745i(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52190yz2();
        bVar.f127067b = new C52331zz2();
        bVar.f127069d = 2742;
        bVar.f127068c = "/cgi-bin/mmpay-bin/modifyhppayernotify";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        ((C52190yz2) a.f127055a.f127080a).f145596d = i;
        this.f128262s = i;
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerNotify", "notify flag: %s", Integer.valueOf(i));
    }

    public int getType() {
        return 2742;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerNotify", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C52331zz2 zz22 = (C52331zz2) ((C47350c) uVar).f127056b.f127083a;
        this.f128261r = zz22;
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerNotify", "retcode: %s, retmsg: %s", Integer.valueOf(zz22.f146293d), this.f128261r.f146294e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C52331zz2 zz22 = (C52331zz2) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = zz22.f146293d;
        this.f221038h = zz22.f146294e;
    }
}
