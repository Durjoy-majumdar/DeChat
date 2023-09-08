package u43;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C50573np;
import te3.C50711op;

/* renamed from: u43.b */
public class C52449b extends C75128o0<C50711op> {
    public C52449b(long j, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50573np npVar = new C50573np();
        npVar.f138708d = j;
        npVar.f138709e = str;
        npVar.f138710f = str2;
        bVar.f127066a = npVar;
        bVar.f127067b = new C50711op();
        bVar.f127068c = "/cgi-bin/mmpay-bin/tenpay/getfreefeedetail";
        bVar.f127069d = 1236;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiGetFreeFeeDetail", "get free fee detail: %s, %s, %s", Long.valueOf(j), str, str2);
    }
}
