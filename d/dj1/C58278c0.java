package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51257sk0;
import te3.C64681rk0;
import tf0.C64916p1;

/* renamed from: dj1.c0 */
public final class C58278c0 extends C60625c<C51257sk0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58278c0(long j, String str, int i, int i2, C49712hj1 hj12, int i3) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "objectNonceId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64681rk0 rk02 = new C64681rk0();
        rk02.f185171d = j;
        rk02.f185174g = str;
        rk02.f185172e = i;
        rk02.f185173f = i2;
        C46523h2 h2Var = C46523h2.f125330a;
        rk02.f185175h = h2Var.mo71860b(3912, hj12);
        rk02.f185177j = i3;
        int i4 = hj12 != null ? hj12.f134675i : 0;
        rk02.f185176i = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76655Cu(j, i4);
        h2Var.mo71865g(rk02.f185175h, C26236u.m33719b(new C13604l(Integer.valueOf(i4), Long.valueOf(j))), (C49712hj1) null);
        bVar.f127066a = rk02;
        C51257sk0 sk02 = new C51257sk0();
        sk02.setBaseResponse(new C49966ja());
        sk02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = sk02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderfeedback";
        bVar.f127069d = 3912;
        mo123453j(bVar.mo72403a());
        Log.m105924i("CgiFinderLiveFeedBack", "[CgiFinderLiveFeedBack] feedId=" + j + " feedbackType=" + i + " subType=" + i2);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51257sk0) eu32, "resp");
        Log.m105924i("CgiFinderLiveFeedBack", "[CgiFinderLiveFeedBack] failed errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
