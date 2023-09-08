package v53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.sk4;
import te3.tk4;

/* renamed from: v53.c */
public class C52765c extends C75128o0<tk4> {
    public C52765c(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        sk4 sk4 = new sk4();
        sk4.f141579e = str;
        sk4.f141580f = System.currentTimeMillis();
        bVar.f127066a = sk4;
        bVar.f127067b = new tk4();
        bVar.f127068c = "/cgi-bin/mmpay-bin/mktuncheckmchservicepos";
        bVar.f127069d = 2595;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiUnCheckMchServicePos", "CgiUnCheckMchServicePos: %s", str);
    }
}
