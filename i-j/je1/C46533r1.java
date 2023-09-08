package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50571no1;
import te3.C50709oo1;
import te3.C51163rv3;

/* renamed from: je1.r1 */
public final class C46533r1 extends C60625c<C50709oo1> {

    /* renamed from: s */
    public final String f125374s = "Finder.CgiFinderUserPagePreview";

    /* renamed from: t */
    public C50571no1 f125375t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46533r1(String str, int i, String str2, int i2) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "wxUsername");
        C87412m.m108594g(str2, "poster_finderusername");
        C50571no1 no12 = new C50571no1();
        this.f125375t = no12;
        no12.f138697d = C46523h2.f125330a.mo71860b(6611, this.f172731j);
        C50571no1 no13 = this.f125375t;
        no13.f138698e = str;
        no13.f138699f = i;
        no13.f138702i = str2;
        no13.f138701h = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = no13;
        C50709oo1 oo12 = new C50709oo1();
        oo12.setBaseResponse(new C49966ja());
        oo12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = oo12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderuserpagepreview";
        bVar.f127069d = 6611;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderUserPagePreview", "init wxUsername " + str + "， " + str2);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Disable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50709oo1) eu32, "resp");
        String str2 = this.f125374s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
