package je1;

import com.google.android.gms.actions.SearchIntents;
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
import te3.C49860ik1;
import te3.C50003jk1;

/* renamed from: je1.a5 */
public final class C46508a5 extends C60628i {

    /* renamed from: g */
    public final String f125294g = "Finder.NetSceneSuggestion";

    /* renamed from: h */
    public C47350c f125295h;

    /* renamed from: i */
    public C11385n f125296i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46508a5(String str, C89349b bVar, int i, C49712hj1 hj12) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6200;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findersearchsuggest";
        C49860ik1 ik12 = new C49860ik1();
        ik12.f135431f = bVar;
        ik12.f135430e = str;
        ik12.f135432g = i;
        ik12.f135429d = C46523h2.f125330a.mo71860b(6200, hj12);
        bVar2.f127066a = ik12;
        bVar2.f127067b = new C50003jk1();
        this.f125295h = bVar2.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125296i = nVar;
        return dispatch(gVar, this.f125295h, this);
    }

    public int getType() {
        return 6200;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f125294g;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f125296i;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
