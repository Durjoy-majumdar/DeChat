package je1;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C36907w;
import te3.C49013ck1;
import te3.C49157dk1;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: je1.j4 */
public final class C9327j4 extends C9255j {

    /* renamed from: g */
    public C47350c f29141g;

    /* renamed from: h */
    public C11385n f29142h;

    /* renamed from: i */
    public final String f29143i = "Finder.NetSceneFinderSearchInteractionFeed";

    /* renamed from: j */
    public int f29144j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9327j4(String str, int i, String str2, LinkedList<String> linkedList, C89349b bVar, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "requestId");
        C87412m.m108594g(linkedList, "tags");
        C49013ck1 ck12 = new C49013ck1();
        ck12.f131789d = C46523h2.f125330a.mo71860b(10834, hj12);
        ck12.f131790e = str;
        ck12.f131791f = bVar;
        ck12.f131792g = i;
        ck12.f131793h = str2;
        ck12.f131794i = linkedList;
        C49157dk1 dk12 = new C49157dk1();
        dk12.setBaseResponse(new C49966ja());
        dk12.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = ck12;
        bVar2.f127067b = dk12;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findersearchinteraction";
        bVar2.f127069d = 10834;
        this.f29141g = bVar2.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29142h = nVar;
        return dispatch(gVar, this.f29141g, this);
    }

    public int getType() {
        return 10834;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        String str2 = this.f29143i;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        String str3 = this.f29143i;
        StringBuilder sb = new StringBuilder();
        sb.append("server increatment size:");
        C47465a aVar = this.f29141g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInteractionResponse");
        sb.append(((C49157dk1) aVar).f132378d.size());
        Log.m105924i(str3, sb.toString());
        if (i2 == 0 && i3 == 0) {
            for (FinderObject dv : mo10076n1()) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83329dv(dv, this.f172736d);
            }
        }
        C11385n nVar = this.f29142h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        LinkedList<FinderObject> n1 = mo10076n1();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(n1, 10));
        for (FinderObject b : n1) {
            arrayList.add(FinderItem.C56324a.m64570b(FinderItem.Companion, b, 0, 2, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f29141g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInteractionRequest");
        C49842ig0 ig02 = ((C49013ck1) aVar).f131789d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* renamed from: n1 */
    public final LinkedList<FinderObject> mo10076n1() {
        C47465a aVar = this.f29141g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInteractionResponse");
        LinkedList<FinderObject> linkedList = ((C49157dk1) aVar).f132378d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…tionResponse).object_list");
        return linkedList;
    }
}
