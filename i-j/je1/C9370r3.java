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
import te3.C51278sp0;
import te3.C51427tp0;

/* renamed from: je1.r3 */
public final class C9370r3 extends C60628i {

    /* renamed from: g */
    public C47350c f29261g;

    /* renamed from: h */
    public C11385n f29262h;

    public C9370r3(int i) {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3528;
        C51278sp0 sp02 = new C51278sp0();
        sp02.f141661e = i;
        sp02.f141660d = C46523h2.f125330a.mo71859a(3528);
        bVar.f127066a = sp02;
        bVar.f127067b = new C51427tp0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergettagcontact";
        this.f29261g = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetTagContact", "NetSceneFinderGetTagContact");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29262h = nVar;
        return dispatch(gVar, this.f29261g, this);
    }

    public int getType() {
        return 3528;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderGetTagContact", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f29262h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
