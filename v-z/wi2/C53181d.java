package wi2;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.jj4;
import te3.kj4;

/* renamed from: wi2.d */
public class C53181d extends C53178a {

    /* renamed from: u */
    public static final /* synthetic */ int f148365u = 0;

    /* renamed from: t */
    public kj4 f148366t;

    public C53181d(boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new jj4();
        bVar.f127067b = new kj4();
        bVar.f127069d = 2952;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonehomepage";
        C47350c a = bVar.mo72403a();
        this.f148360r = a;
        ((jj4) a.f127055a.f127080a).f136161d = z;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "do scene NetSceneMobileRemitGetHomePage, is signed：%s", Boolean.valueOf(z));
    }

    public int getType() {
        return 2952;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        kj4 kj4 = (kj4) ((C47350c) uVar).f127056b.f127083a;
        this.f148366t = kj4;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "ret_code: %s, ret_msg: %s", Integer.valueOf(kj4.f136821d), this.f148366t.f136822e);
        C11385n nVar = this.f148361s;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        kj4 kj4 = (kj4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = kj4.f136821d;
        this.f221038h = kj4.f136822e;
    }
}
