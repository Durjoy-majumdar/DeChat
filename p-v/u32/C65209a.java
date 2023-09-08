package u32;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C64322dq1;
import te3.C77923eq1;

/* renamed from: u32.a */
public class C65209a extends C75128o0<C77923eq1> {
    public C65209a(String str, String str2, int i, int i2, int i3, int i4) {
        C64322dq1 dq12 = new C64322dq1();
        dq12.f182797d = str;
        dq12.f182800g = str2;
        dq12.f182798e = i;
        dq12.f182799f = i2;
        dq12.f182801h = i3;
        dq12.f182802i = i4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = dq12;
        bVar.f127067b = new C77923eq1();
        bVar.f127069d = 4889;
        bVar.f127068c = "/cgi-bin/mmpay-bin/foreignhbdetail";
        C47350c a = bVar.mo72403a();
        a.setIsUserCmd(true);
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiHKHbDetail", "nativeurl: %s, sendid: %s, limit: %s, offset: %s, scene: %s", str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4));
    }
}
