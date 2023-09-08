package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50863pr0;
import te3.C51163rv3;
import te3.C64414h71;
import te3.C64616or0;

/* renamed from: dj1.p */
public final class C58285p extends C58286q<C50863pr0> {

    /* renamed from: t */
    public final String f166898t = "Finder.CgiFinderLikeLive";

    /* renamed from: u */
    public C64616or0 f166899u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58285p(C49842ig0 ig02, byte[] bArr, long j, int i, long j2, int i2, String str, String str2, C49712hj1 hj12, C64414h71 h712) {
        super(hj12);
        C87412m.m108594g(ig02, "finderBaseRequest");
        C87412m.m108594g(str, "nonceId");
        C87412m.m108594g(str2, "finderUsername");
        C64616or0 or02 = new C64616or0();
        this.f166899u = or02;
        or02.f184704d = ig02;
        or02.f184705e = j;
        or02.f184707g = C89349b.m111674a(bArr);
        C64616or0 or03 = this.f166899u;
        or03.f184708h = j2;
        or03.f184709i = 0;
        boolean z = false;
        or03.f184710j = 0;
        or03.f184711n = C58739j4.f168176a.mo83718n();
        C64616or0 or04 = this.f166899u;
        or04.f184706f = (long) i;
        or04.f184712o = i2;
        or04.f184714q = str;
        or04.f184715r = str2;
        or04.f184716s = h712;
        Integer num = null;
        C46523h2.f125330a.mo71865g(or04.f184704d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(j2))), (C49712hj1) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f166899u;
        C50863pr0 pr02 = new C50863pr0();
        pr02.setBaseResponse(new C49966ja());
        pr02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = pr02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlikelive";
        bVar.f127069d = 564;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("[likeInfo]like live id:");
        sb.append(j);
        sb.append(" objectId:");
        sb.append(j2);
        sb.append(" count:");
        sb.append(i);
        sb.append(",finder_username is empty:");
        sb.append(this.f166899u.f184715r == null ? true : z);
        sb.append(",live_identity:");
        C49842ig0 ig03 = this.f166899u.f184704d;
        sb.append(ig03 != null ? Integer.valueOf(ig03.f135318j) : num);
        Log.m105924i("Finder.CgiFinderLikeLive", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50863pr0) eu32, "resp");
        String str2 = this.f166898t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
