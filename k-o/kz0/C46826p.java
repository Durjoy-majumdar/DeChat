package kz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C49094d42;
import te3.C49232e42;

/* renamed from: kz0.p */
public final class C46826p extends C46827q<C49232e42> {
    public C46826p(int i, int i2, double d, double d2) {
        C49094d42 d422 = new C49094d42();
        C49232e42 e422 = new C49232e42();
        d422.f132105d = i;
        d422.f132106e = i2;
        d422.f132107f = d;
        d422.f132108g = d2;
        mo72033k(d422, e422, 2940, "/cgi-bin/mmpay-bin/mktgetmkttickethomepage");
        Log.m105925i("MicroMsg.CgiGetMktTicketHomePage", "offset: %s, reqnum: %s", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
