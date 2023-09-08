package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50455mv1;
import te3.C50599nv1;

/* renamed from: si2.f */
public class C48386f extends C48382b {

    /* renamed from: r */
    public C47350c f129517r;

    /* renamed from: s */
    public C50599nv1 f129518s;

    /* renamed from: t */
    public C11385n f129519t;

    /* renamed from: u */
    public String f129520u;

    public C48386f(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50455mv1();
        bVar.f127067b = new C50599nv1();
        bVar.f127069d = 1542;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getbankinfo_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129517r = a;
        ((C50455mv1) a.f127055a.f127080a).f138229d = str;
        this.f129520u = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129519t = nVar;
        return dispatch(gVar, this.f129517r, this);
    }

    public int getType() {
        return 1542;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitGetBankInfo", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50599nv1 nv12 = (C50599nv1) ((C47350c) uVar).f127056b.f127083a;
        this.f129518s = nv12;
        Log.m105925i("MicroMsg.NetSceneBankRemitGetBankInfo", "retcode: %s, retmsg: %s", Integer.valueOf(nv12.f138798d), this.f129518s.f138799e);
        C11385n nVar = this.f129519t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50599nv1 nv12 = (C50599nv1) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = nv12.f138798d;
        this.f221038h = nv12.f138799e;
    }
}
