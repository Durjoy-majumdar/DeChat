package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51269sn0;
import te3.C51418tn0;

/* renamed from: je1.g0 */
public final class C9309g0 extends C60625c<C51418tn0> {

    /* renamed from: s */
    public final String f29091s = "MicroMsg.CgiFinderGetLiveIncomePage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9309g0(String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "finderUsername");
        C51269sn0 sn02 = new C51269sn0();
        sn02.f141612d = C46523h2.f125330a.mo71859a(6477);
        sn02.f141613e = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = sn02;
        C51418tn0 tn02 = new C51418tn0();
        tn02.setBaseResponse(new C49966ja());
        tn02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = tn02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetliveincomepage";
        bVar.f127069d = 6477;
        mo123453j(bVar.mo72403a());
        Log.m105924i("MicroMsg.CgiFinderGetLiveIncomePage", "init " + sn02.f141613e);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51418tn0) eu32, "resp");
        String str2 = this.f29091s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
