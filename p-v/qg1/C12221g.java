package qg1;

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
import te3.C51163rv3;
import te3.C51880wv0;
import te3.C52026xv0;
import zc1.C66785b;

/* renamed from: qg1.g */
public final class C12221g extends C60625c<C52026xv0> {

    /* renamed from: s */
    public final String f35285s = "CgiFinderLiveAudienceOpFanClub";

    public C12221g(int i, C89349b bVar, long j, long j2, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C51880wv0 wv02 = new C51880wv0();
        wv02.f144301d = C46523h2.f125330a.mo71859a(4143);
        wv02.f144302e = C66785b.f191882e.mo90662O5();
        wv02.f144303f = i;
        wv02.f144304g = bVar;
        wv02.f144305h = j;
        wv02.f144306i = j2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = wv02;
        C52026xv0 xv02 = new C52026xv0();
        xv02.setBaseResponse(new C49966ja());
        xv02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = xv02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderliveaudienceopfanclub";
        bVar2.f127069d = 4143;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("CgiFinderLiveAudienceOpFanClub", "init " + wv02.f144302e + ',' + wv02.f144303f + ',' + wv02.f144304g + ',' + wv02.f144305h + ',' + wv02.f144306i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52026xv0) eu32, "resp");
        String str2 = this.f35285s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
