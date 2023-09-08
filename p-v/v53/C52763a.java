package v53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C49190du;
import te3.C49332eu;

/* renamed from: v53.a */
public class C52763a extends C75128o0<C49332eu> {
    public C52763a(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49190du duVar = new C49190du();
        duVar.f132530e = str;
        duVar.f132531f = System.currentTimeMillis();
        bVar.f127066a = duVar;
        bVar.f127067b = new C49332eu();
        bVar.f127068c = "/cgi-bin/mmpay-bin/mktcheckmchservicepos";
        bVar.f127069d = 2553;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiCheckMchServicePos", "CgiCheckMchServicePos: %s", str);
    }
}
