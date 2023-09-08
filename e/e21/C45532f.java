package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C52001xp;
import te3.C52148yp;

/* renamed from: e21.f */
public class C45532f extends C75128o0<C52148yp> {
    public C45532f(int i, String str, String str2, boolean z, String str3, int i2) {
        Log.m105925i("MicroMsg.CgiF2fShortTermQrcode", "fee:%s，fee_type:%s，desc:%s， payer_desc_required：%s, payer_desc_placeholder：%s, scene:%s", Integer.valueOf(i), str, str2, Boolean.valueOf(z), str3, Integer.valueOf(i2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        C52001xp xpVar = new C52001xp();
        xpVar.f144781f = str2;
        xpVar.f144779d = i + "";
        xpVar.f144780e = str;
        xpVar.f144782g = z;
        xpVar.f144783h = str3;
        xpVar.f144784i = i2;
        bVar.f127066a = xpVar;
        bVar.f127067b = new C52148yp();
        bVar.f127069d = 1729;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2fshorttermqrcode";
        mo123453j(bVar.mo72403a());
    }
}
