package mv2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1706k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$d;
import te3.xl4;
import xt3.C53447b;
import xt3.C53448e;

/* renamed from: mv2.i */
public class C47107i extends C117747y implements C53448e, C1311n {

    /* renamed from: d */
    public C11385n f126583d;

    /* renamed from: e */
    public C114799u f126584e;

    /* renamed from: f */
    public C53447b<C53448e.C53450b> f126585f = null;

    /* renamed from: D */
    public void mo36515D() {
        Log.m105926v("MicroMsg.NetSceneUploadSoterASKRsa", "alvinluo NetSceneUploadSoterASKRsa doScene");
        C86709a0.m107524d().mo123460f(this);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126583d = nVar;
        return dispatch(gVar, this.f126584e, this);
    }

    public int getType() {
        return C1706k2.CTRL_INDEX;
    }

    /* renamed from: o */
    public void mo36516o(C53447b<C53448e.C53450b> bVar) {
        this.f126585f = bVar;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUploadSoterASKRsa", "alvinluo errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f126583d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa successfully");
            C53447b<C53448e.C53450b> bVar = this.f126585f;
            if (bVar != null) {
                bVar.mo36822a(new C53448e.C53450b(true));
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa failed");
        C53447b<C53448e.C53450b> bVar2 = this.f126585f;
        if (bVar2 != null) {
            bVar2.mo36822a(new C53448e.C53450b(false));
        }
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    /* renamed from: x0 */
    public void mo36517x0(Object obj) {
        C53448e.C53449a aVar = (C53448e.C53449a) obj;
        C47102b bVar = new C47102b();
        this.f126584e = bVar;
        xl4 xl4 = ((C47103c) bVar.getReqObj()).f126575a;
        xl4.f144740d = aVar.f150352b;
        xl4.f144741e = aVar.f150351a;
    }
}
