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
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50050jy0;
import te3.C50192ky0;
import te3.C51163rv3;

/* renamed from: qg1.j */
public final class C12226j extends C60625c<C50192ky0> {

    /* renamed from: s */
    public final String f35296s = "CgiFinderLiveFanClubGetIntimacy";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12226j(String str, C89349b bVar, long j, long j2, String str2, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "anchorFinderUserName");
        C50050jy0 jy02 = new C50050jy0();
        jy02.f136375d = C46523h2.f125330a.mo71859a(5985);
        jy02.f136376e = str;
        jy02.f136377f = bVar;
        jy02.f136379h = j;
        jy02.f136378g = j2;
        jy02.f136380i = str2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = jy02;
        C50192ky0 ky02 = new C50192ky0();
        ky02.setBaseResponse(new C49966ja());
        ky02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = ky02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivefanclubgetintimacy";
        bVar2.f127069d = 5985;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("CgiFinderLiveFanClubGetIntimacy", "init " + jy02.f136376e + ',' + jy02.f136377f + ',' + jy02.f136379h + ',' + jy02.f136378g);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50192ky0 ky02 = (C50192ky0) eu32;
        C87412m.m108594g(ky02, "resp");
        String str2 = this.f35296s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + ' ' + C61937h.m72709h(ky02));
    }
}
