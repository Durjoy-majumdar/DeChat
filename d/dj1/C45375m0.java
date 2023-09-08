package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49219e21;
import te3.C49335eu3;
import te3.C49366f21;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: dj1.m0 */
public final class C45375m0 extends C58286q<C49366f21> {

    /* renamed from: t */
    public final String f122884t = "Finder.CgiFinderLiveIssueCoupon";

    /* renamed from: u */
    public C45376a f122885u;

    /* renamed from: v */
    public C49219e21 f122886v;

    /* renamed from: dj1.m0$a */
    public interface C45376a {
        /* renamed from: a */
        void mo70892a(int i, int i2, String str, C49366f21 f212);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45375m0(long j, long j2, String str, String str2, int i, C45376a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, "stockId");
        C87412m.m108594g(aVar, "callback");
        this.f122885u = aVar;
        C49219e21 e212 = new C49219e21();
        this.f122886v = e212;
        e212.f132638d = C46523h2.f125330a.mo71859a(5941);
        C49219e21 e213 = this.f122886v;
        e213.f132641g = j;
        e213.f132640f = j2;
        e213.f132639e = str;
        e213.f132642h = str2;
        e213.f132643i = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = e213;
        C49366f21 f212 = new C49366f21();
        f212.setBaseResponse(new C49966ja());
        f212.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = f212;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveissuecoupon";
        bVar.f127069d = 5941;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveIssueCoupon", "init " + this.f122886v.f132641g + ", " + this.f122886v.f132639e);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49366f21 f212 = (C49366f21) eu32;
        C87412m.m108594g(f212, "resp");
        String str2 = this.f122884t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        this.f122885u.mo70892a(i, i2, str, f212);
    }
}
