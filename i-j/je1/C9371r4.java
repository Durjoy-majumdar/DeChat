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
import te3.C49012ck0;
import te3.C49156dk0;
import te3.C49712hj1;
import te3.C52271zj0;

/* renamed from: je1.r4 */
public final class C9371r4 extends C60628i {

    /* renamed from: g */
    public C47350c f29263g;

    /* renamed from: h */
    public C11385n f29264h;

    public C9371r4(C89349b bVar, String str) {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6833;
        C49012ck0 ck02 = new C49012ck0();
        ck02.f131787e = str == null ? "" : str;
        ck02.f131788f = bVar;
        ck02.f131786d = C46523h2.f125330a.mo71859a(6833);
        bVar2.f127066a = ck02;
        bVar2.f127067b = new C49156dk0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findereventuserpage";
        this.f29263g = bVar2.mo72403a();
        Log.m105924i("NetSceneFinderGetActivityList", "NetSceneFinderGetActivityList init ");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29264h = nVar;
        return dispatch(gVar, this.f29263g, this);
    }

    public int getType() {
        return 6833;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("NetSceneFinderGetActivityList", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        StringBuilder sb = new StringBuilder();
        sb.append("firstPage ");
        C47465a aVar = this.f29263g.f127056b.f127083a;
        C89349b bVar = null;
        C49156dk0 dk02 = aVar instanceof C49156dk0 ? (C49156dk0) aVar : null;
        if (dk02 != null) {
            bVar = dk02.f132376e;
        }
        sb.append(bVar == null);
        sb.append(", get ");
        C47465a aVar2 = this.f29263g.f127056b.f127083a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderEventUserPageResponse");
        LinkedList<C52271zj0> linkedList = ((C49156dk0) aVar2).f132375d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…erPageResponse).eventList");
        sb.append(linkedList.size());
        sb.append(" activity");
        Log.m105924i("NetSceneFinderGetActivityList", sb.toString());
        C11385n nVar = this.f29264h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
