package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48756as0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C52298zr0;

/* renamed from: dj1.s */
public final class C45388s extends C60625c<C48756as0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45388s(long j, long j2, int i, String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "reportData");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C52298zr0 zr02 = new C52298zr0();
        zr02.f146187d = C46523h2.f125330a.mo71859a(8488);
        zr02.f146189f = j2;
        zr02.f146190g = i;
        zr02.f146188e = j;
        zr02.f146191h = str;
        bVar.f127066a = zr02;
        C48756as0 as02 = new C48756as0();
        as02.BaseResponse = new C49966ja();
        as02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = as02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveadreport";
        bVar.f127069d = 8488;
        mo123453j(bVar.mo72403a());
        Log.m105924i("CgiFinderLiveAdReport", "[CgiFinderLiveAdReport] feedId=" + j + " liveId=" + j2 + " scene=" + i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C48756as0) eu32, "resp");
        Log.m105924i("CgiFinderLiveAdReport", "[CgiFinderLiveAdReport] failed errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
