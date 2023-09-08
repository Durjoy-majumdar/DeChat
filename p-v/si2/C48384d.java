package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51589us;
import te3.C51731vs;

/* renamed from: si2.d */
public class C48384d extends C48382b {

    /* renamed from: r */
    public C47350c f129510r;

    /* renamed from: s */
    public C51731vs f129511s;

    /* renamed from: t */
    public C11385n f129512t;

    public C48384d(String str, String str2, String str3, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51589us();
        bVar.f127067b = new C51731vs();
        bVar.f127069d = 1349;
        bVar.f127068c = "/cgi-bin/mmpay-bin/checkbankbind_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129510r = a;
        C51589us usVar = (C51589us) a.f127055a.f127080a;
        usVar.f143057d = str;
        usVar.f143058e = str2;
        usVar.f143059f = str3;
        usVar.f143060g = str4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129512t = nVar;
        return dispatch(gVar, this.f129510r, this);
    }

    public int getType() {
        return 1349;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitCheckBankBind", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51731vs vsVar = (C51731vs) ((C47350c) uVar).f127056b.f127083a;
        this.f129511s = vsVar;
        Log.m105925i("MicroMsg.NetSceneBankRemitCheckBankBind", "retcode: %s, retmsg: %s", Integer.valueOf(vsVar.f143662d), this.f129511s.f143663e);
        C11385n nVar = this.f129512t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C51731vs vsVar = (C51731vs) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = vsVar.f143662d;
        this.f221038h = vsVar.f143663e;
    }
}
