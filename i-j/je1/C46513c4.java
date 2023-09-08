package je1;

import bl3.C39818r;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import os1.C62153d;
import pe3.C89349b;
import rx3.C13604l;
import te3.C49712hj1;
import te3.C51324t02;
import te3.C51475u02;

/* renamed from: je1.c4 */
public final class C46513c4 extends C60628i {

    /* renamed from: g */
    public final int f125309g;

    /* renamed from: h */
    public C47350c f125310h;

    /* renamed from: i */
    public C11385n f125311i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46513c4(String str, C89349b bVar, int i, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "friendUsername");
        this.f125309g = i;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6850;
        C51324t02 t022 = new C51324t02();
        t022.f141879d = C46523h2.f125330a.mo71860b(6850, hj12);
        t022.f141881f = bVar;
        t022.f141882g = str;
        t022.f141880e = i;
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        t022.f141883h = ((Number) X0.f38555d).floatValue();
        t022.f141884i = ((Number) X0.f38556e).floatValue();
        bVar2.f127066a = t022;
        bVar2.f127067b = new C51475u02();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/getfinderpoilist";
        this.f125310h = bVar2.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125311i = nVar;
        return dispatch(gVar, this.f125310h, this);
    }

    public int getType() {
        return 6850;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderPoiListStream", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f125311i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
