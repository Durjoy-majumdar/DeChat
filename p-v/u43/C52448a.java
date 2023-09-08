package u43;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C49903iv1;
import te3.C50042jv1;

/* renamed from: u43.a */
public class C52448a extends C75128o0<C50042jv1> {
    public C52448a() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49903iv1();
        bVar.f127067b = new C50042jv1();
        bVar.f127068c = "/cgi-bin/mmpay-bin/tenpay/getbalancemenu";
        bVar.f127069d = 2567;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105924i("MicroMsg.CgiGetBalanceMenu", "get balance menu");
    }
}
