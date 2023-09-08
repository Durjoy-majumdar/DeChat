package wi2;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.bj4;
import te3.cj4;

/* renamed from: wi2.c */
public class C53180c extends C53178a {

    /* renamed from: t */
    public cj4 f148364t;

    public C53180c(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new bj4();
        bVar.f127067b = new cj4();
        bVar.f127069d = 1275;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonedelhisrcvr";
        C47350c a = bVar.mo72403a();
        this.f148360r = a;
        ((bj4) a.f127055a.f127080a).f131157d = str;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "do scene NetSceneMobileRemitDeleteRecord rcvr_id:%s ", str);
    }

    public int getType() {
        return 1275;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        cj4 cj4 = (cj4) ((C47350c) uVar).f127056b.f127083a;
        this.f148364t = cj4;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "ret_code: %s, ret_msg: %s", Integer.valueOf(cj4.f131782d), this.f148364t.f131783e);
        C11385n nVar = this.f148361s;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        cj4 cj4 = (cj4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = cj4.f131782d;
        this.f221038h = cj4.f131783e;
    }
}
