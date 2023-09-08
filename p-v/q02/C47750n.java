package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.ok4;
import te3.pk4;

/* renamed from: q02.n */
public class C47750n extends C75113f0 {

    /* renamed from: r */
    public pk4 f128267r;

    public C47750n(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ok4();
        bVar.f127067b = new pk4();
        bVar.f127069d = 2659;
        bVar.f127068c = "/cgi-bin/mmpay-bin/unbindhpcard";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        ok4 ok4 = (ok4) a.f127055a.f127080a;
        ok4.f139241d = str;
        ok4.f139242e = str2;
    }

    public int getType() {
        return 2659;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUnbindHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        pk4 pk4 = (pk4) ((C47350c) uVar).f127056b.f127083a;
        this.f128267r = pk4;
        Log.m105925i("MicroMsg.NetSceneUnbindHoneyPayCard", "retcode: %s, retmsg: %s", Integer.valueOf(pk4.f139815d), this.f128267r.f139816e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        pk4 pk4 = (pk4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = pk4.f139815d;
        this.f221038h = pk4.f139816e;
    }
}
