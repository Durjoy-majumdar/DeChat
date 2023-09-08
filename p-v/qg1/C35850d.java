package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49950j61;
import te3.C49966ja;
import te3.C50086k61;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: qg1.d */
public final class C35850d extends C60625c<C50086k61> {

    /* renamed from: s */
    public final String f95683s = "Finder.CgiFinderLiveActivitiyClickReport";

    /* renamed from: t */
    public C49950j61 f95684t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35850d(String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "activityId");
        C49950j61 j612 = new C49950j61();
        this.f95684t = j612;
        j612.f135891f = str;
        j612.f135892g = 1;
        j612.f135890e = C66785b.f191882e.mo90662O5();
        this.f95684t.f135889d = C46523h2.f125330a.mo71859a(5246);
        Log.m105924i("Finder.CgiFinderLiveActivitiyClickReport", "CgiFinderLiveActivitiyClickReport init " + str + '}');
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f95684t;
        C50086k61 k612 = new C50086k61();
        k612.setBaseResponse(new C49966ja());
        k612.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = k612;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivequestactivityclickreport";
        bVar.f127069d = 5246;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50086k61) eu32, "resp");
        String str2 = this.f95683s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
