package u32;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import ob0.C47350c;
import te3.C64451iq1;
import te3.C64476jq1;

/* renamed from: u32.c */
public class C65211c extends C75128o0<C64476jq1> {
    public C65211c(String str, String str2, int i, int i2) {
        C64451iq1 iq12 = new C64451iq1();
        iq12.f183721d = str;
        iq12.f183722e = str2;
        iq12.f183725h = i;
        iq12.f183726i = i2;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(C75592q0.m90789s());
        if (z1Var != null) {
            iq12.f183723f = z1Var.mo101230H4();
            iq12.f183724g = z1Var.mo101228F4();
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = iq12;
        bVar.f127067b = new C64476jq1();
        bVar.f127069d = 4787;
        bVar.f127068c = "/cgi-bin/mmpay-bin/foreignhbreceive";
        C47350c a = bVar.mo72403a();
        a.setIsUserCmd(true);
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiHKHbReceive", "nativeUrl: %s, sendId: %s", str, str2);
    }
}
