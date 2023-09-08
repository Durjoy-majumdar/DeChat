package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.up4;
import te3.vp4;

/* renamed from: eb1.u */
public class C45647u extends C45633a implements C1311n, C116765c {

    /* renamed from: d */
    public C11385n f123438d;

    /* renamed from: e */
    public C47350c f123439e;

    public C45647u(long j, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new up4();
        bVar.f127067b = new vp4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/verifyface";
        bVar.f127069d = 797;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123439e = a;
        up4 up4 = (up4) a.f127055a.f127080a;
        up4.f143021e = j;
        up4.f143023g = str;
        up4.f143024h = str2;
    }

    /* renamed from: F */
    public String mo71155F() {
        return null;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123438d = nVar;
        return dispatch(gVar, this.f123439e, this);
    }

    public int getType() {
        return 797;
    }

    /* renamed from: o0 */
    public boolean mo71156o0() {
        return true;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        vp4 vp4 = (vp4) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            i3 = vp4.f143619f;
            Log.m105925i("MicroMsg.NetSceneFaceVerifyFace", "hy: is Verified: %b", Boolean.valueOf(i3 == 0));
        } else if (!(vp4 == null || vp4.f143619f == 0)) {
            Log.m105924i("MicroMsg.NetSceneFaceVerifyFace", "hy: has DetailRet, use it");
            i3 = vp4.f143619f;
        }
        C11385n nVar = this.f123438d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
