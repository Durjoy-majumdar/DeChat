package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49714hk;
import te3.C49858ik;

/* renamed from: si2.c */
public class C48383c extends C48382b {

    /* renamed from: r */
    public C47350c f129507r;

    /* renamed from: s */
    public C49858ik f129508s;

    /* renamed from: t */
    public C11385n f129509t;

    public C48383c(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49714hk();
        bVar.f127067b = new C49858ik();
        bVar.f127069d = 1340;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busscb_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129507r = a;
        C49714hk hkVar = (C49714hk) a.f127055a.f127080a;
        hkVar.f134692d = str;
        hkVar.f134693e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129509t = nVar;
        return dispatch(gVar, this.f129507r, this);
    }

    public int getType() {
        return 1340;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitBusinessCallback", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49858ik ikVar = (C49858ik) ((C47350c) uVar).f127056b.f127083a;
        this.f129508s = ikVar;
        Log.m105925i("MicroMsg.NetSceneBankRemitBusinessCallback", "retcode: %s, retmsg: %s", Integer.valueOf(ikVar.f135427d), this.f129508s.f135428e);
        C11385n nVar = this.f129509t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C49858ik ikVar = (C49858ik) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = ikVar.f135427d;
        this.f221038h = ikVar.f135428e;
    }
}
