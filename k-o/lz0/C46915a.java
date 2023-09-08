package lz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kz0.C46827q;
import te3.C22523py1;
import te3.C50753oy1;

/* renamed from: lz0.a */
public final class C46915a extends C46827q<C22523py1> {
    public C46915a(int i, int i2, double d, double d2, int i3, int i4) {
        C50753oy1 oy12 = new C50753oy1();
        C22523py1 py12 = new C22523py1();
        oy12.f139444d = i;
        oy12.f139445e = i2;
        oy12.f139446f = d;
        oy12.f139447g = d2;
        oy12.f139449i = i4;
        oy12.f139448h = i3;
        mo72033k(oy12, py12, 2619, "/cgi-bin/mmpay-bin/mktgetcouponhomepage");
        Log.m105924i("MicroMsg.CgiGetCouponHomePage", "offset: " + i + ", reqnum: " + i2);
        Log.m105918d("MicroMsg.CgiGetCouponHomePage", "latitude: " + d + ", longitude: " + d2);
    }
}
