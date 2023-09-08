package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49712hj1;
import te3.C49850ii1;
import te3.C49994ji1;

/* renamed from: je1.h4 */
public final class C9314h4 extends C60628i {

    /* renamed from: g */
    public final String f29103g = "Finder.NetSceneFinderQRCode";

    /* renamed from: h */
    public C47350c f29104h;

    /* renamed from: i */
    public C11385n f29105i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9314h4(String str) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "username");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49850ii1 ii12 = new C49850ii1();
        ii12.f135360d = str;
        ii12.f135361e = C46523h2.f125330a.mo71859a(258);
        bVar.f127066a = ii12;
        bVar.f127067b = new C49994ji1();
        bVar.f127069d = 258;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderqrcode";
        this.f29104h = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29105i = nVar;
        return dispatch(gVar, this.f29104h, this);
    }

    public int getType() {
        return 258;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f29103g;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f29105i;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public final String mo10068l1() {
        C47350c cVar = this.f29104h;
        C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderQRCodeResponse");
        return ((C49994ji1) aVar).f136132e;
    }
}
