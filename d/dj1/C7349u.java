package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50737ov0;
import te3.C50880pv0;
import te3.C51163rv3;

/* renamed from: dj1.u */
public final class C7349u extends C58286q<C50880pv0> {

    /* renamed from: t */
    public C50737ov0 f25474t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7349u(int i, long j, C89349b bVar, String str) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "finderUserName");
        C50737ov0 ov02 = new C50737ov0();
        this.f25474t = ov02;
        ov02.f139384d = i;
        ov02.f139385e = j;
        ov02.f139386f = C46523h2.f125330a.mo71859a(4013);
        C50737ov0 ov03 = this.f25474t;
        ov03.f139387g = bVar;
        ov03.f139388h = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = ov03;
        C50880pv0 pv02 = new C50880pv0();
        pv02.setBaseResponse(new C49966ja());
        pv02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = pv02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderliveattendlottery";
        bVar2.f127069d = 4013;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveAttendLottery", "init " + this.f25474t.f139384d + ", " + this.f25474t.f139385e);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50880pv0 pv02 = (C50880pv0) eu32;
        C87412m.m108594g(pv02, "resp");
        Log.m105924i("Finder.CgiFinderLiveAttendLottery", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            Log.m105924i("Finder.CgiFinderLiveAttendLottery", "coupon list result:" + C61937h.m72709h(pv02));
        }
    }
}
