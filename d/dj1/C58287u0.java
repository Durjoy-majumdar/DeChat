package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C52220z51;
import te3.C64847y51;

/* renamed from: dj1.u0 */
public final class C58287u0 extends C58286q<C52220z51> {

    /* renamed from: t */
    public final String f166901t = "Finder.CgiFinderLivePromoteProduct";

    /* renamed from: u */
    public C58288a f166902u;

    /* renamed from: v */
    public C64847y51 f166903v;

    /* renamed from: dj1.u0$a */
    public interface C58288a {
        /* renamed from: a */
        void mo83054a(int i, int i2, String str, C52220z51 z512);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58287u0(long j, long j2, String str, long j3, int i, long j4, int i2, C49712hj1 hj12, C58288a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "audienceUsername");
        this.f166902u = aVar;
        C64847y51 y512 = new C64847y51();
        this.f166903v = y512;
        y512.f186443f = j;
        y512.f186444g = j2;
        y512.f186442e = str;
        y512.f186445h = j3;
        y512.f186446i = i2;
        y512.f186448n = i;
        y512.f186449o = j4;
        C46523h2 h2Var = C46523h2.f125330a;
        y512.f186441d = h2Var.mo71859a(5800);
        h2Var.mo71865g(this.f166903v.f186441d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134675i : 0), Long.valueOf(j2))), (C49712hj1) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f166903v;
        C52220z51 z512 = new C52220z51();
        z512.setBaseResponse(new C49966ja());
        z512.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = z512;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivepromoteproduct";
        bVar.f127069d = 5800;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLivePromoteProduct", "CgiFinderLivePromoteProduct init " + this.f166903v.f186443f + ',' + this.f166903v.f186442e + ",productId:" + this.f166903v.f186445h + ",ad_id:" + this.f166903v.f186449o + ",promoteType:" + this.f166903v.f186448n + ",scene:" + this.f166903v.f186446i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C52220z51 z512 = (C52220z51) eu32;
        C87412m.m108594g(z512, "resp");
        String str2 = this.f166901t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C58288a aVar = this.f166902u;
        if (aVar != null) {
            aVar.mo83054a(i, i2, str, z512);
        }
    }
}
