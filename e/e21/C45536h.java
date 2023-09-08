package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C118466sp;
import te3.C51136rp;

/* renamed from: e21.h */
public class C45536h extends C75128o0<C118466sp> {
    public C45536h() {
        Log.m105924i("MicroMsg.CgiGetQrcode", "CgiF2fQrcode requeset ");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51136rp rpVar = new C51136rp();
        rpVar.f141068d = 1;
        bVar.f127066a = rpVar;
        bVar.f127067b = new C118466sp();
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2fgetqrcodev2";
        bVar.f127069d = 5174;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
    }
}
