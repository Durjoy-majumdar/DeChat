package f21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49594gq;
import te3.C49738hq;

/* renamed from: f21.d */
public class C45742d extends C45737a {

    /* renamed from: j */
    public C47350c f123597j;

    /* renamed from: n */
    public C49738hq f123598n;

    /* renamed from: o */
    public C11385n f123599o;

    public C45742d(String str, String str2, String str3, int i, String str4, String str5) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49594gq();
        bVar.f127067b = new C49738hq();
        bVar.f127069d = 1960;
        bVar.f127068c = "/cgi-bin/mmpay-bin/rewardqrcodepaycheck";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123597j = a;
        C49594gq gqVar = (C49594gq) a.f127055a.f127080a;
        gqVar.f134191d = str;
        gqVar.f134192e = str2;
        gqVar.f134193f = str3;
        gqVar.f134194g = i;
        gqVar.f134195h = str4;
        gqVar.f134196i = str5;
        Log.m105925i("MicroMsg.NetSceneQrRewardPayCheck", "rewardid: %s, amt: %s", str2, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123599o = nVar;
        return dispatch(gVar, this.f123597j, this);
    }

    public int getType() {
        return 1960;
    }

    /* renamed from: k1 */
    public void mo71232k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneQrRewardPayCheck", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49738hq hqVar = (C49738hq) ((C47350c) uVar).f127056b.f127083a;
        this.f123598n = hqVar;
        Log.m105925i("MicroMsg.NetSceneQrRewardPayCheck", "retcode: %s, retmsg: %s", Integer.valueOf(hqVar.f134813d), this.f123598n.f134814e);
        if (!this.f123590h && this.f123598n.f134813d != 0) {
            this.f123591i = true;
        }
        C11385n nVar = this.f123599o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
