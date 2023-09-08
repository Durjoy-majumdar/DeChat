package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49712hj1;
import te3.C51714vn1;
import te3.C51856wn1;

/* renamed from: je1.p4 */
public final class C46529p4 extends C60628i {

    /* renamed from: g */
    public C47350c f125352g;

    /* renamed from: h */
    public C11385n f125353h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46529p4(String str, String str2) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "friendUsername");
        C87412m.m108594g(str2, "poiId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6495;
        C51714vn1 vn12 = new C51714vn1();
        vn12.f143592d = C46523h2.f125330a.mo71859a(6495);
        vn12.f143594f = str;
        vn12.f143593e = str2;
        bVar.f127066a = vn12;
        bVar.f127067b = new C51856wn1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderunbindpoi";
        this.f125352g = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125353h = nVar;
        return dispatch(gVar, this.f125352g, this);
    }

    public int getType() {
        return 6495;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderUnBindPoiStream", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f125353h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
