package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C51846wl0;
import te3.C51989xl0;
import zc1.C66785b;

/* renamed from: je1.e3 */
public final class C46517e3 extends C60628i {

    /* renamed from: g */
    public C47350c f125316g;

    /* renamed from: h */
    public C11385n f125317h;

    /* renamed from: i */
    public final String f125318i = "Finder.NetSceneFinderGetBlackList";

    public C46517e3(C89349b bVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3717;
        C51846wl0 wl02 = new C51846wl0();
        wl02.f144118d = C66785b.f191882e.mo90662O5();
        wl02.f144119e = bVar;
        wl02.f144120f = C46523h2.f125330a.mo71859a(3717);
        bVar2.f127066a = wl02;
        bVar2.f127067b = new C51989xl0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetblacklist";
        this.f125316g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetBlackList", "NetSceneFinderGetBlackList");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125317h = nVar;
        return dispatch(gVar, this.f125316g, this);
    }

    public int getType() {
        return 3717;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f125318i;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f125317h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
