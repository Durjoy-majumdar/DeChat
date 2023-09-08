package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50401mh0;
import te3.C50779p41;
import te3.C50912q41;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: dj1.r0 */
public final class C45386r0 extends C58286q<C50912q41> {

    /* renamed from: t */
    public final String f122901t = "Finder.CgiFinderLiveModifyShopShelf";

    /* renamed from: u */
    public C45387a f122902u;

    /* renamed from: v */
    public C50779p41 f122903v;

    /* renamed from: dj1.r0$a */
    public interface C45387a {
        /* renamed from: a */
        void mo62568a(int i, int i2, String str, C50912q41 q412);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45386r0(long j, long j2, String str, C50401mh0 mh02, C45387a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "audienceUsername");
        C87412m.m108594g(mh02, "finderCmdItem");
        C87412m.m108594g(aVar, "callback");
        Integer num = null;
        this.f122902u = aVar;
        C50779p41 p412 = new C50779p41();
        this.f122903v = p412;
        p412.f139572f = j;
        p412.f139571e = j2;
        p412.f139574h = C66785b.f191882e.mo90662O5();
        this.f122903v.f139570d = C46523h2.f125330a.mo71859a(6675);
        C50779p41 p413 = this.f122903v;
        p413.f139573g = mh02;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = p413;
        C50912q41 q412 = new C50912q41();
        q412.setBaseResponse(new C49966ja());
        q412.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = q412;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivemodshopshelf";
        bVar.f127069d = 6675;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("init ");
        sb.append(this.f122903v.f139572f);
        sb.append(',');
        C50401mh0 mh03 = this.f122903v.f139573g;
        sb.append(mh03 != null ? Integer.valueOf(mh03.f138028d) : num);
        sb.append(',');
        sb.append(this.f122903v.f139574h);
        Log.m105924i("Finder.CgiFinderLiveModifyShopShelf", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50912q41 q412 = (C50912q41) eu32;
        C87412m.m108594g(q412, "resp");
        String str2 = this.f122901t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        this.f122902u.mo62568a(i, i2, str, q412);
    }
}
