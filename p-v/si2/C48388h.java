package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51619uz2;
import te3.C51760vz2;

/* renamed from: si2.h */
public class C48388h extends C48382b {

    /* renamed from: r */
    public C47350c f129524r;

    /* renamed from: s */
    public C51760vz2 f129525s;

    /* renamed from: t */
    public C11385n f129526t;

    /* renamed from: u */
    public String f129527u;

    /* renamed from: v */
    public String f129528v;

    public C48388h(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51619uz2();
        bVar.f127067b = new C51760vz2();
        bVar.f127069d = 1590;
        bVar.f127068c = "/cgi-bin/mmpay-bin/modifyexplain_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129524r = a;
        C51619uz2 uz22 = (C51619uz2) a.f127055a.f127080a;
        uz22.f143201d = str;
        uz22.f143202e = str2;
        this.f129527u = str;
        this.f129528v = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129526t = nVar;
        return dispatch(gVar, this.f129524r, this);
    }

    public int getType() {
        return 1590;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitModifyExplain", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51760vz2 vz22 = (C51760vz2) ((C47350c) uVar).f127056b.f127083a;
        this.f129525s = vz22;
        Log.m105925i("MicroMsg.NetSceneBankRemitModifyExplain", "retcode: %s, retmsg: %s", Integer.valueOf(vz22.f143786d), this.f129525s.f143787e);
        C11385n nVar = this.f129526t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C51760vz2 vz22 = (C51760vz2) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = vz22.f143786d;
        this.f221038h = vz22.f143787e;
    }
}
