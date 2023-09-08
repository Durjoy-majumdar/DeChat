package u32;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import ob0.C47350c;
import te3.C64371fq1;
import te3.C77936gq1;

/* renamed from: u32.b */
public class C65210b extends C75128o0<C77936gq1> {
    public C65210b(String str, String str2, String str3, int i, int i2, String str4) {
        C64371fq1 fq12 = new C64371fq1();
        fq12.f183196d = str;
        fq12.f183197e = str2;
        fq12.f183198f = str3;
        fq12.f183202j = i;
        fq12.f183203n = i2;
        fq12.f183201i = str4;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(C75592q0.m90789s());
        if (z1Var != null) {
            fq12.f183199g = z1Var.mo101230H4();
            fq12.f183200h = z1Var.mo101228F4();
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = fq12;
        bVar.f127067b = new C77936gq1();
        bVar.f127069d = 4583;
        bVar.f127068c = "/cgi-bin/mmpay-bin/foreignhbopen";
        C47350c a = bVar.mo72403a();
        a.setIsUserCmd(true);
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiHKHbOpen", "nativeUrl: %s, sendId: %s, username: %s", str, str2, str3);
    }
}
