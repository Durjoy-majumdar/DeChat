package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49020cl3;
import te3.C49163dl3;

/* renamed from: si2.j */
public class C48389j extends C48382b {

    /* renamed from: r */
    public C47350c f129529r;

    /* renamed from: s */
    public C49163dl3 f129530s;

    /* renamed from: t */
    public C11385n f129531t;

    public C48389j(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49020cl3();
        bVar.f127067b = new C49163dl3();
        bVar.f127069d = 1579;
        bVar.f127068c = "/cgi-bin/mmpay-bin/querydetail_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129529r = a;
        ((C49020cl3) a.f127055a.f127080a).f131816d = str;
        Log.m105925i("MicroMsg.NetSceneBankRemitQueryDetail", "bill id: %s", str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129531t = nVar;
        return dispatch(gVar, this.f129529r, this);
    }

    public int getType() {
        return 1579;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitQueryDetail", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f129530s = (C49163dl3) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f129531t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C49163dl3 dl32 = (C49163dl3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = dl32.f132401d;
        this.f221038h = dl32.f132402e;
    }
}
