package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C118460qp;
import te3.C50857pp;

/* renamed from: e21.i */
public class C45537i extends C75128o0<C118460qp> {
    public C45537i(int i) {
        Log.m105924i("MicroMsg.NetSceneF2fQrcodeMch", "NetSceneF2fQrcodeMch requeset ");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50857pp ppVar = new C50857pp();
        ppVar.f139888d = i;
        bVar.f127066a = ppVar;
        bVar.f127067b = new C118460qp();
        bVar.f127068c = "/cgi-bin/mmpay-bin/sjtgetonlineqr";
        bVar.f127069d = 4364;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
    }
}
