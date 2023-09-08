package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49578gm0;
import te3.C49712hj1;
import te3.C49723hm0;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: je1.a0 */
public final class C46504a0 extends C60625c<C49723hm0> {
    public C46504a0(String str, C89349b bVar, C49712hj1 hj12) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C49578gm0 gm02 = new C49578gm0();
        gm02.f134123d = C46523h2.f125330a.mo71860b(10149, hj12);
        gm02.f134124e = str;
        gm02.f134125f = bVar;
        C49723hm0 hm02 = new C49723hm0();
        hm02.setBaseResponse(new C49966ja());
        hm02.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = gm02;
        bVar2.f127067b = hm02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetcollectionlist";
        bVar2.f127069d = 10149;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderGetCollectionList", "init userName = " + str + ", lastBuffer:" + bVar);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49723hm0) eu32, "resp");
        Log.m105924i("Finder.CgiFinderGetCollectionList", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
