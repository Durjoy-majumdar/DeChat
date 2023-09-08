package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50738ov1;
import te3.C50881pv1;

/* renamed from: si2.g */
public class C48387g extends C48382b {

    /* renamed from: r */
    public C47350c f129521r;

    /* renamed from: s */
    public C50881pv1 f129522s;

    /* renamed from: t */
    public C11385n f129523t;

    public C48387g() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50738ov1();
        bVar.f127067b = new C50881pv1();
        bVar.f127069d = 1399;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getbanklist_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129521r = a;
        C50738ov1 ov12 = (C50738ov1) a.f127055a.f127080a;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129523t = nVar;
        return dispatch(gVar, this.f129521r, this);
    }

    public int getType() {
        return 1399;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitGetBankList", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50881pv1 pv12 = (C50881pv1) ((C47350c) uVar).f127056b.f127083a;
        this.f129522s = pv12;
        Log.m105925i("MicroMsg.NetSceneBankRemitGetBankList", "retcode: %s, retmsg: %s", Integer.valueOf(pv12.f139998d), this.f129522s.f139999e);
        if (!this.f221039i && this.f129522s.f139998d != 0) {
            this.f221040j = true;
        }
        C11385n nVar = this.f129523t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50881pv1 pv12 = (C50881pv1) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = pv12.f139998d;
        this.f221038h = pv12.f139999e;
    }
}
