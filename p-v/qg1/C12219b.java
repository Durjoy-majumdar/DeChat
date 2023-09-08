package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51537uf0;
import te3.C51689vf0;

/* renamed from: qg1.b */
public final class C12219b extends C60625c<C51689vf0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12219b(String str, int i, int i2, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "anchorFinderUserName");
        C51537uf0 uf02 = new C51537uf0();
        uf02.f142824d = C46523h2.f125330a.mo71859a(11126);
        uf02.f142825e = str;
        uf02.f142826f = i;
        uf02.f142827g = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = uf02;
        C51689vf0 vf02 = new C51689vf0();
        vf02.setBaseResponse(new C49966ja());
        vf02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = vf02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderaudiencereservelivenotification";
        bVar.f127069d = 11126;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51689vf0 vf02 = (C51689vf0) eu32;
        C87412m.m108594g(vf02, "resp");
        Log.m105924i("Finder.FinderAudienceReserveLiveNotification", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + ' ' + C61937h.m72709h(vf02));
    }
}
