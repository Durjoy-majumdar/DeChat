package f21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C52004xq;
import te3.C52152yq;

/* renamed from: f21.h */
public class C45745h extends C45737a {

    /* renamed from: j */
    public C47350c f123606j;

    /* renamed from: n */
    public C52152yq f123607n;

    /* renamed from: o */
    public C11385n f123608o;

    /* renamed from: p */
    public String f123609p;

    public C45745h(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52004xq();
        bVar.f127067b = new C52152yq();
        bVar.f127069d = 1649;
        bVar.f127068c = "/cgi-bin/mmpay-bin/setrewardqrcodephotoword";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123606j = a;
        ((C52004xq) a.f127055a.f127080a).f144803d = str;
        this.f123609p = str;
        if (str.length() >= 1 && str.length() <= 3) {
            C115669n.INSTANCE.idkeyStat(724, 0, 1, false);
        } else if (str.length() > 3) {
            C115669n.INSTANCE.idkeyStat(724, 1, 1, false);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123608o = nVar;
        return dispatch(gVar, this.f123606j, this);
    }

    public int getType() {
        return 1649;
    }

    /* renamed from: k1 */
    public void mo71232k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneQrRewardSetPhotoWord", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C52152yq yqVar = (C52152yq) ((C47350c) uVar).f127056b.f127083a;
        this.f123607n = yqVar;
        Log.m105925i("MicroMsg.NetSceneQrRewardSetPhotoWord", "retcode: %s, retmsg: %s", Integer.valueOf(yqVar.f145456d), this.f123607n.f145457e);
        if (!this.f123590h && this.f123607n.f145456d != 0) {
            this.f123591i = true;
        }
        C11385n nVar = this.f123608o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
