package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import te3.C64717sy1;
import te3.C64742ty1;

/* renamed from: je1.v1 */
public final class C60810v1 extends C89132b<C64742ty1> {
    public C60810v1(double d, double d2) {
        C64717sy1 sy12 = new C64717sy1();
        sy12.f185454e = d;
        sy12.f185453d = d2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = sy12;
        bVar.f127067b = new C64742ty1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcurlocation";
        bVar.f127069d = 665;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C64742ty1 ty12 = (C64742ty1) eu32;
        Log.m105924i("Cgi.GetCurrentLocation", "onCgiBack errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
    }
}
