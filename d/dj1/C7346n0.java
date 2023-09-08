package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49924j01;
import te3.C49966ja;
import te3.C50060k01;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: dj1.n0 */
public final class C7346n0 extends C58286q<C50060k01> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7346n0(int i, long j, long j2, String str, C89349b bVar, int i2, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        bVar = (i2 & 16) != 0 ? null : bVar;
        C87412m.m108594g(str, "objectNonceId");
        C49924j01 j012 = new C49924j01();
        j012.f135789f = i;
        j012.f135787d = C46523h2.f125330a.mo71859a(6484);
        j012.f135788e = C66785b.f191882e.mo90662O5();
        j012.f135790g = j;
        j012.f135791h = j2;
        j012.f135793j = bVar;
        j012.f135792i = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = j012;
        C50060k01 k012 = new C50060k01();
        k012.setBaseResponse(new C49966ja());
        k012.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = k012;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetlotteryhistory";
        bVar2.f127069d = 6484;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveLotteryHistory", "CgiFinderLiveLotteryHistory init, finderUsername = " + j012.f135788e + ", liveId = " + j + ", objectId = " + j2 + ", objectNonceId = " + str + ", scene = " + i + ",  lastBuffer = " + bVar);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50060k01) eu32, "resp");
        Log.m105924i("Finder.CgiFinderLiveLotteryHistory", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
