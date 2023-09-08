package je1;

import bo1.C0344g;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C50716oq0;
import te3.C50861pq0;
import te3.C51974xh1;

/* renamed from: je1.l3 */
public final class C9333l3 extends C60628i {

    /* renamed from: g */
    public C47350c f29154g;

    /* renamed from: h */
    public C11385n f29155h;

    /* renamed from: i */
    public final String f29156i = "Finder.NetSceneFinderGetHotWordTopicFeed";

    public C9333l3(C89349b bVar, int i, C89349b bVar2, C49712hj1 hj12) {
        super(hj12);
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127069d = WearableStatusCodes.UNKNOWN_CAPABILITY;
        C50716oq0 oq02 = new C50716oq0();
        oq02.f139313g = bVar;
        oq02.f139310d = C46523h2.f125330a.mo71860b(WearableStatusCodes.UNKNOWN_CAPABILITY, hj12);
        oq02.f139311e = i;
        oq02.f139312f = bVar2;
        bVar3.f127066a = oq02;
        bVar3.f127067b = new C50861pq0();
        bVar3.f127068c = "/cgi-bin/micromsg-bin/finderhotwordstream";
        this.f29154g = bVar3.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetHotWordTopicFeed", "NetSceneFinderGetHotWordTopicFeed get word init");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29155h = nVar;
        return dispatch(gVar, this.f29154g, this);
    }

    public int getType() {
        return WearableStatusCodes.UNKNOWN_CAPABILITY;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f29156i;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            Log.m105924i(this.f29156i, C9311g2.f29093a.mo10062a(mo10077l1()));
            C47465a aVar = this.f29154g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderHotWordStreamResp");
            C0344g gVar = C0344g.f929a;
            LinkedList<FinderObject> linkedList = ((C50861pq0) aVar).f139901d;
            C87412m.m108593f(linkedList, "resp.object_list");
            gVar.mo386b((C51974xh1) null, linkedList, WearableStatusCodes.UNKNOWN_CAPABILITY);
        }
        C11385n nVar = this.f29155h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C49712hj1 hj12 = this.f172736d;
        if (hj12 != null) {
            for (FinderObject j802 : mo10077l1()) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(j802, hj12.f134675i);
            }
        }
    }

    /* renamed from: l1 */
    public final LinkedList<FinderObject> mo10077l1() {
        C47465a aVar = this.f29154g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderHotWordStreamResp");
        LinkedList<FinderObject> linkedList = ((C50861pq0) aVar).f139901d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…rdStreamResp).object_list");
        return linkedList;
    }
}
