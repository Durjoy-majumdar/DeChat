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
import te3.C51163rv3;
import te3.C51177rz0;
import te3.C51316sz0;

/* renamed from: dj1.e0 */
public final class C45352e0 extends C58286q<C51316sz0> {

    /* renamed from: t */
    public final String f122839t = "Finder.CgiFinderLiveGetCouponList";

    /* renamed from: u */
    public C45353a f122840u;

    /* renamed from: v */
    public C51177rz0 f122841v;

    /* renamed from: dj1.e0$a */
    public interface C45353a {
        /* renamed from: a */
        void mo70888a(int i, int i2, String str, C51316sz0 sz02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45352e0(long j, long j2, String str, C89349b bVar, C45353a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "anchorUsername");
        C87412m.m108594g(aVar, "callback");
        this.f122840u = aVar;
        C51177rz0 rz02 = new C51177rz0();
        this.f122841v = rz02;
        rz02.f141226d = C46523h2.f125330a.mo71859a(4033);
        C51177rz0 rz03 = this.f122841v;
        rz03.f141229g = j;
        rz03.f141228f = j2;
        rz03.f141227e = str;
        rz03.f141230h = bVar;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = rz03;
        C51316sz0 sz02 = new C51316sz0();
        sz02.setBaseResponse(new C49966ja());
        sz02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = sz02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetcouponlist";
        bVar2.f127069d = 4033;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetCouponList", "init " + this.f122841v.f141229g + ", " + this.f122841v.f141227e);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51316sz0 sz02 = (C51316sz0) eu32;
        C87412m.m108594g(sz02, "resp");
        String str2 = this.f122839t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            String str3 = this.f122839t;
            Log.m105924i(str3, "coupon list result:" + C61937h.m72709h(sz02));
        }
        this.f122840u.mo70888a(i, i2, str, sz02);
    }
}
