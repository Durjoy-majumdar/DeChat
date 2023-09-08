package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import o40.C61926c;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49255ea1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50095k81;
import te3.C51163rv3;
import te3.C64281ca1;
import te3.C64309da1;

/* renamed from: dj1.y0 */
public final class C58293y0 extends C58286q<C49255ea1> {

    /* renamed from: t */
    public final String f166915t = "CgiFinderLiveSetProductRecommendWord";

    /* renamed from: u */
    public C64309da1 f166916u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58293y0(long j, long j2, int i, String str, C50095k81 k812, C49712hj1 hj12) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(k812, "recomendWord");
        String str2 = null;
        C64309da1 da12 = new C64309da1();
        this.f166916u = da12;
        C46523h2 h2Var = C46523h2.f125330a;
        da12.f182657d = h2Var.mo71860b(10767, hj12);
        C64309da1 da13 = this.f166916u;
        C64281ca1 ca12 = new C64281ca1();
        ca12.f182455d = j;
        ca12.f182456e = j2;
        ca12.f182457f = i;
        ca12.f182458g = str == null ? "" : str;
        da13.f182658e = ca12;
        this.f166916u.f182659f = C58739j4.f168176a.mo83710g0(k812);
        h2Var.mo71865g(this.f166916u.f182657d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(j))), (C49712hj1) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f166916u;
        C49255ea1 ea12 = new C49255ea1();
        ea12.setBaseResponse(new C49966ja());
        ea12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ea12;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/finderlive_set_product_recommend_word";
        bVar.f127069d = 10767;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("init object_id:");
        C64281ca1 ca13 = this.f166916u.f182658e;
        sb.append(C61926c.m72691p(ca13 != null ? ca13.f182455d : 0));
        sb.append(",liveId:");
        C64281ca1 ca14 = this.f166916u.f182658e;
        sb.append(ca14 != null ? Long.valueOf(ca14.f182456e) : null);
        sb.append(",scene:");
        C64281ca1 ca15 = this.f166916u.f182658e;
        sb.append(ca15 != null ? Integer.valueOf(ca15.f182457f) : null);
        sb.append(",username:");
        C64281ca1 ca16 = this.f166916u.f182658e;
        sb.append(ca16 != null ? ca16.f182458g : str2);
        sb.append(',');
        sb.append(C61937h.m72709h(k812));
        Log.m105924i("CgiFinderLiveSetProductRecommendWord", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49255ea1) eu32, "resp");
        String str2 = this.f166915t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
