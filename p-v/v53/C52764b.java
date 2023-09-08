package v53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C52003xp1;
import te3.C52150yp1;

/* renamed from: v53.b */
public class C52764b extends C75128o0<C52150yp1> {
    public C52764b(String str, int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C52003xp1 xp12 = new C52003xp1();
        xp12.f144797e = str;
        xp12.f144798f = i;
        xp12.f144799g = i2;
        bVar.f127066a = xp12;
        bVar.f127067b = new C52150yp1();
        bVar.f127068c = "/cgi-bin/mmpay-bin/mktfollowcardbdmch";
        bVar.f127069d = 2720;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiFollowCardBDMch", "CgiFollowCardBDMch: %s, %s, %s", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
