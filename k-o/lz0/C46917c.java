package lz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kz0.C46827q;
import te3.C52211z32;
import te3.C64222a42;

/* renamed from: lz0.c */
public final class C46917c extends C46827q<C64222a42> {
    public C46917c(int i, int i2) {
        C52211z32 z322 = new C52211z32();
        C64222a42 a422 = new C64222a42();
        z322.f145669d = i;
        z322.f145670e = i2;
        mo72033k(z322, a422, 1701, "/cgi-bin/mmpay-bin/mktgetmktcardhomepagev2");
        Log.m105924i("MicroMsg.CgiGetMktCardHomePageV3", "offset: " + i + ", reqnum: " + i2);
    }
}
