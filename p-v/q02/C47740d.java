package q02;

import b63.C113146l;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51029qy1;
import te3.C51175ry1;

/* renamed from: q02.d */
public class C47740d extends C75113f0 {

    /* renamed from: r */
    public C51175ry1 f128255r;

    public C47740d(String str, long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51029qy1();
        bVar.f127067b = new C51175ry1();
        bVar.f127069d = 2630;
        bVar.f127068c = "/cgi-bin/mmpay-bin/createhpcardtoken";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C51029qy1 qy12 = (C51029qy1) a.f127055a.f127080a;
        qy12.f140613d = str;
        qy12.f140614e = j;
        qy12.f140615f = C113146l.m154806d();
        Log.m105925i("MicroMsg.NetSceneGetCreateTokenSign", "take_message: %s, credit_line: %s", str, Long.valueOf(j));
    }

    public int getType() {
        return 2630;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetCreateTokenSign", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51175ry1 ry12 = (C51175ry1) ((C47350c) uVar).f127056b.f127083a;
        this.f128255r = ry12;
        Log.m105925i("MicroMsg.NetSceneGetCreateTokenSign", "retcode: %s, retmsg: %s", Integer.valueOf(ry12.f141216d), this.f128255r.f141217e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C51175ry1 ry12 = (C51175ry1) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = ry12.f141216d;
        this.f221038h = ry12.f141217e;
    }
}
