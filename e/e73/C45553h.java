package e73;

import com.tencent.p014mm.autogen.events.GetWcPaySignEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import mv2.C21541f;
import ob0.C11385n;
import ob0.C47350c;
import pv2.C77292s;
import te3.fi4;
import te3.gi4;
import xt3.C53447b;
import xt3.C53448e;

/* renamed from: e73.h */
public class C45553h extends C21541f implements C53448e {

    /* renamed from: d */
    public C11385n f123226d;

    /* renamed from: e */
    public C53447b<C53448e.C53450b> f123227e = null;

    /* renamed from: f */
    public C47350c f123228f;

    /* renamed from: g */
    public String f123229g;

    public C45553h(String str) {
        this.f123229g = str;
    }

    /* renamed from: D */
    public void mo36515D() {
        C86709a0.m107524d().mo123460f(this);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123226d = nVar;
        return dispatch(gVar, this.f123228f, this);
    }

    public int getType() {
        return 1665;
    }

    /* renamed from: j1 */
    public void mo33748j1() {
        Log.m105924i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: authkey required");
        C11385n nVar = this.f123226d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
        if (this.f123227e != null) {
            Log.m105920e("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "alvinluo pay auth key expired when upload pay auth key");
            this.f123227e.mo36822a(new C53448e.C53450b(false));
        }
    }

    /* renamed from: k1 */
    public void mo33749k1(int i, int i2, String str) {
        Log.m105925i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: onError: errType: %d, errcode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        C11385n nVar = this.f123226d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
    }

    /* renamed from: l1 */
    public void mo33750l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "alvinluo onGYNetEnd errType: %d , errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f123226d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C77292s.f225404c = str;
        C53447b<C53448e.C53450b> bVar = this.f123227e;
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
        this.f123227e = bVar;
    }

    /* renamed from: x0 */
    public void mo36517x0(Object obj) {
        C53448e.C53449a aVar = (C53448e.C53449a) obj;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new fi4();
        bVar.f127067b = new gi4();
        bVar.f127068c = "/cgi-bin/mmpay-bin/touchlockupdateauthkey";
        bVar.f127069d = 1244;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123228f = a;
        fi4 fi4 = (fi4) a.f127055a.f127080a;
        fi4.f133524d = aVar.f150351a;
        fi4.f133526f = aVar.f150352b;
        fi4.f133525e = this.f123229g;
        GetWcPaySignEvent getWcPaySignEvent = new GetWcPaySignEvent();
        getWcPaySignEvent.f107602d.f107604a = this.f123229g;
        getWcPaySignEvent.publish();
        String str = getWcPaySignEvent.f107603e.f107605a;
        fi4.f133527g = str;
        Log.m105927v("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "alvinluo wcpaysign: %s", str);
    }
}
