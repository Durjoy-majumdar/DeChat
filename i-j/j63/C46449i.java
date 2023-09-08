package j63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50417mk3;
import te3.C50559nk3;

/* renamed from: j63.i */
public class C46449i extends C75113f0 {

    /* renamed from: r */
    public C47350c f125127r;

    /* renamed from: s */
    public C50559nk3 f125128s;

    /* renamed from: t */
    public C11385n f125129t;

    public C46449i(long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50417mk3();
        bVar.f127067b = new C50559nk3();
        bVar.f127069d = 2931;
        bVar.f127068c = "/cgi-bin/mmpay-bin/qrycancelecarddesc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125127r = a;
        ((C50417mk3) a.f127055a.f127080a).f138086d = j;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125129t = nVar;
        return dispatch(gVar, this.f125127r, this);
    }

    public int getType() {
        return 2931;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneQryECardLogout", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50559nk3 nk32 = (C50559nk3) ((C47350c) uVar).f127056b.f127083a;
        this.f125128s = nk32;
        Log.m105925i("MicroMsg.NetSceneQryECardLogout", "retcode: %s, retmsg: %s", Integer.valueOf(nk32.f138642d), this.f125128s.f138643e);
        C11385n nVar = this.f125129t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50559nk3 nk32 = (C50559nk3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = nk32.f138642d;
        this.f221038h = nk32.f138643e;
    }
}
