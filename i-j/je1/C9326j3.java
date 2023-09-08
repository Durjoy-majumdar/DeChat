package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49307en0;
import te3.C49447fn0;
import te3.C49712hj1;

/* renamed from: je1.j3 */
public final class C9326j3 extends C60628i {

    /* renamed from: g */
    public C47350c f29138g;

    /* renamed from: h */
    public C11385n f29139h;

    /* renamed from: i */
    public final String f29140i = "Finder.NetSceneFinderGetFollowTopicList";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9326j3(C89349b bVar, String str) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "userName");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 712;
        C49307en0 en02 = new C49307en0();
        en02.f133021d = bVar;
        en02.f133023f = C46523h2.f125330a.mo71859a(712);
        en02.f133022e = str;
        bVar2.f127066a = en02;
        bVar2.f127067b = new C49447fn0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfollowtopiclist";
        this.f29138g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetFollowTopicList", "NetSceneFinderGetFollowList init ");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29139h = nVar;
        return dispatch(gVar, this.f29138g, this);
    }

    public int getType() {
        return 712;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        String str3 = this.f29140i;
        Log.m105924i(str3, "errType " + i4 + ", errCode " + i5 + ", errMsg " + str2);
        if (i4 == 0 && i5 == 0) {
            C117407d.INSTANCE.idkeyStat(1279, 7, 1, false);
        } else {
            C117407d.INSTANCE.idkeyStat(1279, 8, 1, false);
        }
        C11385n nVar = this.f29139h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i4, i5, str2, this);
        }
    }
}
