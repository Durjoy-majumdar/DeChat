package kz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C49061cx1;
import te3.C49200dx1;

/* renamed from: kz0.m */
public final class C46823m extends C46827q<C49200dx1> {
    public C46823m(String str, long j, double d, double d2, int i, int i2) {
        C87412m.m108594g(str, "marchantId");
        C49061cx1 cx12 = new C49061cx1();
        C49200dx1 dx12 = new C49200dx1();
        cx12.f132009d = str;
        cx12.f132012g = j;
        cx12.f132010e = d;
        cx12.f132011f = d2;
        cx12.f132013h = i;
        cx12.f132014i = i2;
        mo72033k(cx12, dx12, 2769, "/cgi-bin/mmpay-bin/mktgetcardpkgmchinfo");
        Log.m105925i("MicroMsg.CgiGetCardPkgMchInfo", "marchantid: %s, lastReceiveTime: %s, lat: %s, long: %s", str, Long.valueOf(j), Double.valueOf(d), Double.valueOf(d2));
    }
}
