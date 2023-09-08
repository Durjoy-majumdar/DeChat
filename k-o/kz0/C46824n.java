package kz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C22536y32;
import te3.C51919x32;

/* renamed from: kz0.n */
public final class C46824n extends C46827q<C22536y32> {
    public C46824n(int i, int i2, double d, double d2, int i3, int i4) {
        C51919x32 x322 = new C51919x32();
        C22536y32 y322 = new C22536y32();
        x322.f144425d = i;
        x322.f144426e = i2;
        x322.f144427f = d;
        x322.f144428g = d2;
        x322.f144429h = i3;
        x322.f144430i = i4;
        mo72033k(x322, y322, 2619, "/cgi-bin/mmpay-bin/mktgetmktcardhomepage");
        Log.m105925i("MicroMsg.CgiGetMktCardHomePage", "offset: %s, reqnum: %s, scene: %s, sortRule: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        Log.m105919d("MicroMsg.CgiGetMktCardHomePage", "lat: %s, lng: %s", Double.valueOf(d), Double.valueOf(d2));
    }
}
