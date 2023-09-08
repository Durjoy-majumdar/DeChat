package mv2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C47350c;
import te3.sn4;
import te3.tn4;
import xt3.C53447b;
import xt3.C53448e;

/* renamed from: mv2.g */
public class C47105g extends C21541f implements C53448e {

    /* renamed from: d */
    public C11385n f126577d;

    /* renamed from: e */
    public C53447b<C53448e.C53450b> f126578e = null;

    /* renamed from: f */
    public C47350c f126579f;

    /* renamed from: D */
    public void mo36515D() {
        C86709a0.m107524d().mo123460f(this);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126577d = nVar;
        return dispatch(gVar, this.f126579f, this);
    }

    public int getType() {
        return 1185;
    }

    /* renamed from: j1 */
    public void mo33748j1() {
        Log.m105924i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy:NetSceneSoterMPUpdateAuthKey authkey required");
        C11385n nVar = this.f126577d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
        C53447b<C53448e.C53450b> bVar = this.f126578e;
        if (bVar != null) {
            bVar.mo36822a(new C53448e.C53450b(false));
        }
    }

    /* renamed from: k1 */
    public void mo33749k1(int i, int i2, String str) {
        Log.m105925i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy: NetSceneSoterMPUpdateAuthKey onError: errType: %d, errcode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        C11385n nVar = this.f126577d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
    }

    /* renamed from: l1 */
    public void mo33750l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy: NetSceneSoterMPUpdateAuthKey onGYNetEnd errType: %d , errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f126577d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C53447b<C53448e.C53450b> bVar = this.f126578e;
        if (bVar == null) {
            return;
        }
        if (i2 == 0 && i3 == 0) {
            bVar.mo36822a(new C53448e.C53450b(true));
        } else {
            bVar.mo36822a(new C53448e.C53450b(false));
        }
    }

    /* renamed from: o */
    public void mo36516o(C53447b<C53448e.C53450b> bVar) {
        this.f126578e = bVar;
    }

    /* renamed from: x0 */
    public void mo36517x0(Object obj) {
        C53448e.C53449a aVar = (C53448e.C53449a) obj;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new sn4();
        bVar.f127067b = new tn4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/uploadsoterauthkey";
        bVar.f127069d = 1185;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126579f = a;
        sn4 sn4 = (sn4) a.f127055a.f127080a;
        sn4.f141639d = aVar.f150351a;
        sn4.f141640e = aVar.f150352b;
    }
}
