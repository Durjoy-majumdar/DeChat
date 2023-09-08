package kz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C48808b42;
import te3.C48955c42;

/* renamed from: kz0.o */
public final class C46825o extends C46827q<C48955c42> {
    public C46825o(int i, int i2, double d, double d2) {
        C48808b42 b422 = new C48808b42();
        C48955c42 c422 = new C48955c42();
        b422.f130932d = i;
        b422.f130933e = i2;
        b422.f130934f = d;
        b422.f130935g = d2;
        mo72033k(b422, c422, 2979, "/cgi-bin/mmpay-bin/mktgetmktinvalidtickethomepage");
        Log.m105925i("MicroMsg.CgiGetMktInvalidTicketHomePage", "offset: %s, reqnum: %s", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
