package z53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C50154kn3;
import te3.C50288ln3;

/* renamed from: z53.c */
public class C53749c extends C75128o0<C50288ln3> {
    public C53749c(String str, String str2, String str3, String str4) {
        C50154kn3 kn32 = new C50154kn3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        kn32.f136899e = str2;
        kn32.f136900f = str3;
        kn32.f136898d = str;
        kn32.f136901g = str4;
        bVar.f127066a = kn32;
        bVar.f127067b = new C50288ln3();
        bVar.f127069d = 2752;
        bVar.f127068c = "/cgi-bin/mmpay-bin/tenpay/realnameverifysms";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiRealnameVerifySms", "verify sms: %s, %s, reqkey: %s", str3, str2, str);
    }
}
