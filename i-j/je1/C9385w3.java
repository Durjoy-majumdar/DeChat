package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51525uc1;
import te3.C51678vc1;

/* renamed from: je1.w3 */
public final class C9385w3 extends C60628i {

    /* renamed from: g */
    public final int f29316g;

    /* renamed from: h */
    public final Long f29317h;

    /* renamed from: i */
    public C47350c f29318i;

    /* renamed from: j */
    public C11385n f29319j;

    public C9385w3(int i, Long l, String str, Long l2, C49712hj1 hj12) {
        super(hj12);
        this.f29316g = i;
        this.f29317h = l2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5909;
        C51525uc1 uc12 = new C51525uc1();
        if (l != null) {
            uc12.f142735e = l.longValue();
        }
        uc12.f142738h = str;
        if (l2 != null) {
            uc12.f142737g = l2.longValue();
        }
        uc12.f142736f = i;
        C49842ig0 b = C46523h2.f125330a.mo71860b(5909, hj12);
        uc12.f142734d = b;
        b.f135313e = (hj12 != null ? Integer.valueOf(hj12.f134677n) : null).intValue();
        bVar.f127066a = uc12;
        C51678vc1 vc12 = new C51678vc1();
        vc12.setBaseResponse(new C49966ja());
        bVar.f127067b = vc12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findermodevent";
        this.f29318i = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneFinderModEvent", "NetSceneFinderModEvent init eventTopicId: " + l + " userName: " + str + ", objectId:" + l2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29319j = nVar;
        return dispatch(gVar, this.f29318i, this);
    }

    public int getType() {
        return 5909;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderModEvent", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f29319j;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
