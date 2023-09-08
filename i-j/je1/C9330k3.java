package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C52136ym0;
import te3.C52283zm0;
import zc1.C66785b;

/* renamed from: je1.k3 */
public final class C9330k3 extends C60628i {

    /* renamed from: g */
    public C47350c f29152g;

    /* renamed from: h */
    public C11385n f29153h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9330k3(C89349b bVar, long j, boolean z) {
        super((C49712hj1) null, 1, (C8480h) null);
        boolean z2 = true;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3593;
        C52136ym0 ym02 = new C52136ym0();
        ym02.f145394e = C66785b.f191882e.mo90662O5();
        ym02.f145396g = bVar;
        ym02.f145397h = j;
        ym02.f145395f = z ? 2 : 1;
        ym02.f145393d = C46523h2.f125330a.mo71859a(3593);
        bVar2.f127066a = ym02;
        bVar2.f127067b = new C52283zm0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfeedlikedlist";
        this.f29152g = bVar2.mo72403a();
        StringBuilder sb = new StringBuilder();
        sb.append("NetSceneFinderGetFriendRecommendList feedId:");
        sb.append(j);
        sb.append(", scene: $");
        sb.append(ym02.f145395f);
        sb.append(", lastBuff is Null? ");
        sb.append(bVar != null ? false : z2);
        Log.m105924i("Finder.NetSceneFinderGetFriendRecommendList", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29153h = nVar;
        return dispatch(gVar, this.f29152g, this);
    }

    public int getType() {
        return 3593;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderGetFriendRecommendList", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f29153h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
