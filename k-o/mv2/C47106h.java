package mv2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1908x4;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pv2.C77292s;
import te3.xl4;
import te3.yl4;
import xt3.C53447b;
import xt3.C53448e;

/* renamed from: mv2.h */
public class C47106h extends C117747y implements C53448e, C1311n {

    /* renamed from: d */
    public C11385n f126580d;

    /* renamed from: e */
    public C47350c f126581e;

    /* renamed from: f */
    public C53447b<C53448e.C53450b> f126582f = null;

    /* renamed from: D */
    public void mo36515D() {
        Log.m105926v("MicroMsg.NetSceneUploadSoterASK", "alvinluo NetSceneUploadSoterASK execute doScene");
        C86709a0.m107524d().mo123460f(this);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126580d = nVar;
        return dispatch(gVar, this.f126581e, this);
    }

    public int getType() {
        return C1908x4.CTRL_INDEX;
    }

    /* renamed from: o */
    public void mo36516o(C53447b<C53448e.C53450b> bVar) {
        this.f126582f = bVar;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUploadSoterASK", "MicroMsg.NetSceneUploadSoterASK errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f126580d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C77292s.f225403b = str;
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask successfully");
            C53447b<C53448e.C53450b> bVar = this.f126582f;
            if (bVar != null) {
                bVar.mo36822a(new C53448e.C53450b(true));
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask failed");
        C53447b<C53448e.C53450b> bVar2 = this.f126582f;
        if (bVar2 != null) {
            bVar2.mo36822a(new C53448e.C53450b(false));
        }
    }

    /* renamed from: x0 */
    public void mo36517x0(Object obj) {
        C53448e.C53449a aVar = (C53448e.C53449a) obj;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new xl4();
        bVar.f127067b = new yl4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/updatesoterask";
        bVar.f127069d = C1908x4.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126581e = a;
        xl4 xl4 = (xl4) a.f127055a.f127080a;
        xl4.f144742f = C1908x4.CTRL_INDEX;
        String str = aVar.f150352b;
        xl4.f144740d = str;
        String str2 = aVar.f150351a;
        xl4.f144741e = str2;
        Log.m105925i("MicroMsg.NetSceneUploadSoterASK", "alvinluo keyJson: %s, signature: %s", str2, str);
        Log.m105927v("MicroMsg.NetSceneUploadSoterASK", "alvinluo hashCode: %s", Integer.valueOf(hashCode()));
    }
}
