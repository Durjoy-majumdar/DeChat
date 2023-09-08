package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
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

/* renamed from: je1.u */
public final class C60809u extends C60625c<C51257sk0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60809u(long j, String str, int i, int i2, C49712hj1 hj12, Boolean bool) {
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
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            rk02.f185177j = 2;
        }
        int i3 = hj12 != null ? hj12.f134675i : 0;
        rk02.f185176i = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j, i3);
        h2Var.mo71865g(rk02.f185175h, C26236u.m33719b(new C13604l(Integer.valueOf(i3), Long.valueOf(j))), (C49712hj1) null);
        bVar.f127066a = rk02;
        C51257sk0 sk02 = new C51257sk0();
        sk02.setBaseResponse(new C49966ja());
        sk02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = sk02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderfeedback";
        bVar.f127069d = 3912;
        mo123453j(bVar.mo72403a());
        Log.m105924i("CgiFinderFeedBack", "[CgiFinderFeedBack] feedId=" + j + " feedbackType=" + i + " subType=" + i2);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51257sk0) eu32, "resp");
    }
}
