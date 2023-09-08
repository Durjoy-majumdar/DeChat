package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49735hp0;
import te3.C49880ip0;
import zc1.C66785b;

/* renamed from: qg1.u */
public final class C12231u extends C60625c<C49880ip0> {

    /* renamed from: s */
    public final String f35302s = "CgiFinderLivePurchaseContentList";

    public C12231u(C89349b bVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 10988;
        C49735hp0 hp02 = new C49735hp0();
        hp02.f134804f = bVar;
        hp02.f134802d = C46523h2.f125330a.mo71859a(10988);
        hp02.f134803e = C66785b.f191882e.mo90662O5();
        bVar2.f127066a = hp02;
        bVar2.f127067b = new C49880ip0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetpurchasedcontentlist";
        mo123453j(bVar2.mo72403a());
        Log.m105924i("CgiFinderLivePurchaseContentList", "last_buffer:" + hp02.f134804f);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49880ip0 ip02 = (C49880ip0) eu32;
        C87412m.m108594g(ip02, "resp");
        String str2 = this.f35302s;
        Log.m105924i(str2, "purchased_count:" + ip02.f135569g + ",continueFlag:" + ip02.f135568f);
    }
}
