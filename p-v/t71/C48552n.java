package t71;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebFeature;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.nl4;
import te3.ol4;

/* renamed from: t71.n */
public class C48552n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129873d = null;

    /* renamed from: e */
    public C47350c f129874e = null;

    public C48552n(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new nl4();
        bVar.f127067b = new ol4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/rank/updatecover";
        bVar.f127069d = XWebFeature.INTERFACE_SHOW_HIDE;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129874e = a;
        nl4 nl4 = (nl4) a.f127055a.f127080a;
        nl4.f138658d = str;
        nl4.f138659e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129873d = nVar;
        return dispatch(gVar, this.f129874e, this);
    }

    public int getType() {
        return XWebFeature.INTERFACE_SHOW_HIDE;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneUpdateRankCoverAndMotto", "hy: scene end. errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f129873d.onSceneEnd(i2, i3, str, this);
    }
}
