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
import te3.C51624v02;
import te3.C51764w02;

/* renamed from: je1.d4 */
public final class C9301d4 extends C60628i {

    /* renamed from: g */
    public C47350c f29077g;

    /* renamed from: h */
    public C11385n f29078h;

    /* renamed from: i */
    public int f29079i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9301d4(String str, C89349b bVar, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "friendUsername");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6208;
        C51624v02 v022 = new C51624v02();
        v022.f143222d = C46523h2.f125330a.mo71860b(6208, hj12);
        v022.f143223e = bVar;
        v022.f143224f = str;
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        v022.f143225g = ((Number) X0.f38555d).floatValue();
        v022.f143226h = ((Number) X0.f38556e).floatValue();
        bVar2.f127066a = v022;
        bVar2.f127067b = new C51764w02();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/getfinderrelativepoilist";
        this.f29077g = bVar2.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29078h = nVar;
        return dispatch(gVar, this.f29077g, this);
    }

    public int getType() {
        return 6208;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderPoiRelateStream", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f29078h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
