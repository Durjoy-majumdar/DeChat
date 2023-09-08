package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C51721vp;
import te3.C51862wp;

/* renamed from: e21.g */
public class C45534g extends C75128o0<C51862wp> {
    public C45534g(int i, String str, String str2, boolean z, String str3, int i2) {
        Log.m105925i("MicroMsg.CgiF2fShortTermQrcodeMch", "fee:%s，fee_type:%s，desc:%s payer_desc_required：%s, payer_desc_placeholder：%s, scene:%s", Integer.valueOf(i), str, str2, Boolean.valueOf(z), str3, Integer.valueOf(i2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51721vp vpVar = new C51721vp();
        vpVar.f143609f = str2;
        if (i == 0) {
            vpVar.f143607d = "";
        } else {
            vpVar.f143607d = i + "";
        }
        vpVar.f143608e = str;
        vpVar.f143610g = z;
        vpVar.f143611h = str3;
        vpVar.f143612i = i2;
        bVar.f127066a = vpVar;
        bVar.f127067b = new C51862wp();
        bVar.f127069d = 4419;
        bVar.f127068c = "/cgi-bin/mmpay-bin/sjtgetshorttermmchqr";
        mo123453j(bVar.mo72403a());
    }
}
