package ws1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50478n11;
import te3.C50621o11;
import te3.C51163rv3;

/* renamed from: ws1.c */
public final class C15593c extends C60625c<C50621o11> {
    public C15593c(String str, C89349b bVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C50478n11 n112 = new C50478n11();
        n112.f138324d = C46523h2.f125330a.mo71859a(7485);
        n112.f138326f = str;
        n112.f138325e = bVar;
        bVar2.f127066a = n112;
        C50621o11 o112 = new C50621o11();
        o112.BaseResponse = new C49966ja();
        o112.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = o112;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetvotinghistory";
        bVar2.f127069d = 7485;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("CgiFinderLiveGetVotingHistory", "[CgiFinderLiveGetVotingHistory] init");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50621o11) eu32, "resp");
        Log.m105924i("CgiFinderLiveGetVotingHistory", "[CgiFinderLiveGetVotingHistory] CgiEnd errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
