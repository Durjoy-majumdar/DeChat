package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49582gn0;
import te3.C49712hj1;
import te3.C49727hn0;
import te3.C49966ja;
import te3.C50317lw0;
import te3.C51163rv3;

/* renamed from: je1.d0 */
public final class C46514d0 extends C60625c<C49727hn0> {

    /* renamed from: s */
    public final C50317lw0 f125312s;

    /* renamed from: t */
    public final String f125313t = "Finder.CgiFinderGetFriendBoxLiveMsg";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46514d0(byte[] bArr, C50317lw0 lw02, C89349b bVar, long j, long j2, String str, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(lw02, "boxId");
        C87412m.m108594g(str, "anchorUserName");
        this.f125312s = lw02;
        C49582gn0 gn02 = new C49582gn0();
        gn02.f134133d = C46523h2.f125330a.mo71860b(11261, hj12);
        gn02.f134134e = C89349b.m111674a(bArr);
        gn02.f134135f = lw02;
        gn02.f134136g = bVar;
        gn02.f134137h = j;
        gn02.f134138i = j2;
        gn02.f134139j = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = gn02;
        C49727hn0 hn02 = new C49727hn0();
        hn02.setBaseResponse(new C49966ja());
        hn02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = hn02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfriendboxlivemsg";
        bVar2.f127069d = 11261;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderGetFriendBoxLiveMsg", "CgiFinderGetFriendBoxLiveMsg init ");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49727hn0) eu32, "resp");
        String str2 = this.f125313t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
