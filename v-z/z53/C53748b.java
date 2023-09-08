package z53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C49729hn3;
import te3.C50853pn3;

/* renamed from: z53.b */
public class C53748b extends C75128o0<C49729hn3> {
    public C53748b(String str, String str2, int i, String str3) {
        C50853pn3 pn32 = new C50853pn3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        pn32.f139841d = str;
        pn32.f139842e = str2;
        pn32.f139843f = i;
        pn32.f139844g = str3;
        bVar.f127066a = pn32;
        bVar.f127067b = new C49729hn3();
        bVar.f127069d = 1923;
        bVar.f127068c = "/cgi-bin/mmpay-bin/tenpay/realnamesendsms";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiRealnameSendSms", "send sms: %s, %s, isRetry: %s", str2, str, Integer.valueOf(i));
    }
}
