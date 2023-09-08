package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import qn1.C12883c;
import rx3.C36570n;
import te3.C49177dp0;
import te3.C49315ep0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50353m43;
import te3.C51163rv3;

/* renamed from: je1.n0 */
public final class C9341n0 extends C60625c<C49315ep0> {
    public C9341n0(long j, long j2) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C49177dp0 dp02 = new C49177dp0();
        dp02.f132464d = C46523h2.f125330a.mo71860b(8577, this.f172731j);
        dp02.f132465e = j;
        dp02.f132466f = j2;
        dp02.f132467g = (C50353m43) ((C36570n) C12883c.f36861h.mo12405a().f36869g).getValue();
        C49315ep0 ep02 = new C49315ep0();
        ep02.setBaseResponse(new C49966ja());
        ep02.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = dp02;
        bVar.f127067b = ep02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetnpssurvey";
        bVar.f127069d = 8577;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderGetNpsSurvey", "init objectId = " + j + ' ');
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49315ep0) eu32, "resp");
        Log.m105924i("Finder.CgiFinderGetNpsSurvey", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
