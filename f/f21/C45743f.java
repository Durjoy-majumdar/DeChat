package f21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51724vq;
import te3.C51864wq;

/* renamed from: f21.f */
public class C45743f extends C45737a {

    /* renamed from: j */
    public C47350c f123600j;

    /* renamed from: n */
    public C51864wq f123601n;

    /* renamed from: o */
    public C11385n f123602o;

    public C45743f(String str, int i, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51724vq();
        bVar.f127067b = new C51864wq();
        bVar.f127069d = 1516;
        bVar.f127068c = "/cgi-bin/mmpay-bin/scanrewardqrcode";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123600j = a;
        C51724vq vqVar = (C51724vq) a.f127055a.f127080a;
        vqVar.f143620d = str;
        vqVar.f143621e = i;
        vqVar.f143622f = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123602o = nVar;
        return dispatch(gVar, this.f123600j, this);
    }

    public int getType() {
        return 1516;
    }

    /* renamed from: j1 */
    public boolean mo71231j1() {
        return false;
    }

    /* renamed from: k1 */
    public void mo71232k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneQrRewardScanCode", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51864wq wqVar = (C51864wq) ((C47350c) uVar).f127056b.f127083a;
        this.f123601n = wqVar;
        Log.m105925i("MicroMsg.NetSceneQrRewardScanCode", "retcode: %s, retmsg: %s", Integer.valueOf(wqVar.f144212d), this.f123601n.f144213e);
        if (!this.f123590h && this.f123601n.f144212d != 0) {
            this.f123591i = true;
        }
        C11385n nVar = this.f123602o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
