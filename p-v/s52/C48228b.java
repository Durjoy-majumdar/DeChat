package s52;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C52071y52;
import te3.C52221z52;

/* renamed from: s52.b */
public class C48228b extends C75128o0<C52221z52> {
    public C48228b(int i, int i2, int i3, int i4) {
        C52071y52 y522 = new C52071y52();
        y522.f145124d = i;
        y522.f145125e = i2;
        y522.f145126f = i3;
        y522.f145127g = i4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = y522;
        bVar.f127067b = new C52221z52();
        bVar.f127069d = 2680;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getpayfunctionswitchlist";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiGetPayFunctionSwitchList", "TpaCountry: %s", Integer.valueOf(i));
    }
}
