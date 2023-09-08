package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50282ll3;
import te3.C50421ml3;

/* renamed from: si2.k */
public class C48390k extends C48382b {

    /* renamed from: r */
    public C47350c f129532r;

    /* renamed from: s */
    public C50421ml3 f129533s;

    /* renamed from: t */
    public C11385n f129534t;

    public C48390k() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50282ll3();
        bVar.f127067b = new C50421ml3();
        bVar.f127069d = 1378;
        bVar.f127068c = "/cgi-bin/mmpay-bin/tsrecordlist_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f129532r = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129534t = nVar;
        return dispatch(gVar, this.f129532r, this);
    }

    public int getType() {
        return 1378;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitQueryTransferList", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50421ml3 ml32 = (C50421ml3) ((C47350c) uVar).f127056b.f127083a;
        this.f129533s = ml32;
        Log.m105925i("MicroMsg.NetSceneBankRemitQueryTransferList", "retcode: %s, retmsg: %s", Integer.valueOf(ml32.f138100d), this.f129533s.f138101e);
        C11385n nVar = this.f129534t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50421ml3 ml32 = (C50421ml3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = ml32.f138100d;
        this.f221038h = ml32.f138101e;
    }
}
