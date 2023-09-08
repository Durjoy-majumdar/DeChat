package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51407tk0;
import te3.C51558uk0;
import zc1.C66785b;

/* renamed from: je1.e1 */
public final class C9304e1 extends C60625c<C51558uk0> {
    public C9304e1() {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51407tk0 tk02 = new C51407tk0();
        tk02.f142255e = C66785b.f191882e.mo90662O5();
        bVar.f127066a = tk02;
        C51558uk0 uk02 = new C51558uk0();
        uk02.setBaseResponse(new C49966ja());
        uk02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = uk02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderfetchmyredpacketcover";
        bVar.f127069d = 8946;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderMyRedPackCover", "[init] username:" + tk02.f142255e);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51558uk0) eu32, "resp");
        Log.m105924i("Finder.CgiFinderMyRedPackCover", "[onCgiEnd] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
