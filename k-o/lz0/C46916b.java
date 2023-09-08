package lz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kz0.C46827q;
import te3.C22530u32;
import te3.C51339t32;

/* renamed from: lz0.b */
public final class C46916b extends C46827q<C22530u32> {
    public C46916b(int i, int i2, double d, double d2, int i3) {
        C51339t32 t322 = new C51339t32();
        C22530u32 u322 = new C22530u32();
        t322.f141922d = i;
        t322.f141923e = i2;
        t322.f141924f = d;
        t322.f141925g = d2;
        t322.f141926h = i3;
        mo72033k(t322, u322, 2833, "/cgi-bin/mmpay-bin/mktgetmembercardhomepage");
        Log.m105924i("MicroMsg.CgiGetMemberCardHomePage", "offset: " + i + ", reqnum: " + i2);
        Log.m105918d("MicroMsg.CgiGetMemberCardHomePage", "latitude: " + d + ", longitude: " + d2);
    }
}
