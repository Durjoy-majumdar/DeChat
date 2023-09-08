package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C50964qi1;
import te3.C51112ri1;
import te3.C52271zj0;

/* renamed from: je1.d3 */
public final class C9300d3 extends C60628i {

    /* renamed from: g */
    public C47350c f29075g;

    /* renamed from: h */
    public C11385n f29076h;

    public C9300d3(C89349b bVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 5839;
        C50964qi1 qi12 = new C50964qi1();
        qi12.f140326e = bVar;
        qi12.f140325d = C46523h2.f125330a.mo71859a(5839);
        bVar2.f127066a = qi12;
        bVar2.f127067b = new C51112ri1();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderrecommendevent";
        this.f29075g = bVar2.mo72403a();
        Log.m105924i("NetSceneFinderGetActivityList", "NetSceneFinderGetActivityList init ");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29076h = nVar;
        return dispatch(gVar, this.f29075g, this);
    }

    public int getType() {
        return 5839;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("NetSceneFinderGetActivityList", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        StringBuilder sb = new StringBuilder();
        sb.append("firstPage ");
        C47465a aVar = this.f29075g.f127056b.f127083a;
        C89349b bVar = null;
        C51112ri1 ri12 = aVar instanceof C51112ri1 ? (C51112ri1) aVar : null;
        if (ri12 != null) {
            bVar = ri12.f140930e;
        }
        sb.append(bVar == null);
        sb.append(", get ");
        C47465a aVar2 = this.f29075g.f127056b.f127083a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderRecommendEventResponse");
        LinkedList<C52271zj0> linkedList = ((C51112ri1) aVar2).f140929d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…EventResponse).event_list");
        sb.append(linkedList.size());
        sb.append(" activity");
        Log.m105924i("NetSceneFinderGetActivityList", sb.toString());
        C11385n nVar = this.f29076h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
