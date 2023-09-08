package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50570no0;
import te3.C50708oo0;
import te3.C51163rv3;

/* renamed from: dj1.n */
public final class C45377n extends C58286q<C50708oo0> {

    /* renamed from: t */
    public final C45378a f122887t;

    /* renamed from: u */
    public final JSONObject f122888u = new JSONObject();

    /* renamed from: v */
    public C50570no0 f122889v;

    /* renamed from: dj1.n$a */
    public interface C45378a {
        /* renamed from: a */
        void mo70893a(int i, int i2, String str, C50708oo0 oo02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45377n(String str, long j, C45378a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(aVar, "callback");
        this.f122887t = aVar;
        C50570no0 no02 = new C50570no0();
        this.f122889v = no02;
        no02.f138694d = C46523h2.f125330a.mo71860b(11609, this.f172731j);
        C50570no0 no03 = this.f122889v;
        no03.f138695e = str == null ? "" : str;
        no03.f138696f = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = no03;
        C50708oo0 oo02 = new C50708oo0();
        oo02.setBaseResponse(new C49966ja());
        oo02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = oo02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetlivesonglist";
        bVar.f127069d = 11609;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122888u;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50708oo0 oo02 = (C50708oo0) eu32;
        C87412m.m108594g(oo02, "resp");
        Log.m105924i("Finder.CgiFinderLiveReward", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45378a aVar = this.f122887t;
        if (aVar != null) {
            aVar.mo70893a(i, i2, str, oo02);
        }
    }
}
