package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C50702om0;
import te3.C50848pm0;

/* renamed from: je1.f3 */
public final class C46519f3 extends C60628i {

    /* renamed from: g */
    public C47350c f125321g;

    /* renamed from: h */
    public C11385n f125322h;

    /* renamed from: i */
    public int f125323i;

    public C46519f3(String str, C89349b bVar, int i, C49712hj1 hj12) {
        super(hj12);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 5801;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetdraft";
        C50702om0 om02 = new C50702om0();
        om02.f139255e = str;
        om02.f139256f = 0;
        om02.f139257g = bVar;
        om02.f139254d = C46523h2.f125330a.mo71860b(5801, hj12);
        bVar2.f127066a = om02;
        bVar2.f127067b = new C50848pm0();
        this.f125321g = bVar2.mo72403a();
        this.f125323i = i;
        Log.m105924i("Finder.NetSceneFinderGetDraft", "NetSceneFinderGetDraft init finderUserName " + str + " lastBuffer:" + bVar);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125322h = nVar;
        return dispatch(gVar, this.f125321g, this);
    }

    public int getType() {
        return 5801;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderGetDraft", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125321g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetDraftResponse");
            C50848pm0 pm02 = (C50848pm0) aVar;
        }
        C11385n nVar = this.f125322h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
