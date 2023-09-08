package je1;

import bo1.C0344g;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C8480h;
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
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C51565um0;
import te3.C51710vm0;
import te3.C51974xh1;

/* renamed from: je1.u4 */
public final class C9381u4 extends C9255j {

    /* renamed from: g */
    public C47350c f29301g;

    /* renamed from: h */
    public C11385n f29302h;

    /* renamed from: i */
    public final String f29303i;

    /* renamed from: j */
    public int f29304j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9381u4(String str, C89349b bVar, C49712hj1 hj12, long j, int i, int i2, C8480h hVar) {
        super(hj12);
        j = (i2 & 8) != 0 ? 0 : j;
        i = (i2 & 16) != 0 ? 0 : i;
        C87412m.m108594g(str, "finderUserName");
        this.f29303i = "Finder.NetSceneFinerGetFavFeed";
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3966;
        C51565um0 um02 = new C51565um0();
        um02.f142936f = bVar;
        C46523h2 h2Var = C46523h2.f125330a;
        um02.f142934d = h2Var.mo71860b(3966, hj12);
        um02.f142935e = str;
        um02.f142937g = i;
        um02.f142939i = j;
        um02.f142938h = h2Var.mo71867j();
        bVar2.f127066a = um02;
        bVar2.f127069d = 3966;
        bVar2.f127067b = new C51710vm0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfavlist";
        this.f29301g = bVar2.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29302h = nVar;
        return dispatch(gVar, this.f29301g, this);
    }

    public int getType() {
        return 3966;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        String str2 = this.f29303i;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        String str3 = this.f29303i;
        StringBuilder sb = new StringBuilder();
        sb.append("server increatment size:");
        C47465a aVar = this.f29301g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
        sb.append(((C51710vm0) aVar).f143556d.size());
        Log.m105924i(str3, sb.toString());
        if (i2 == 0 && i3 == 0) {
            C47465a aVar2 = this.f29301g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
            C51710vm0 vm02 = (C51710vm0) aVar2;
            C0344g gVar = C0344g.f929a;
            C51974xh1 xh12 = vm02.f143562j;
            LinkedList<FinderObject> linkedList = vm02.f143556d;
            C87412m.m108593f(linkedList, "resp.`object`");
            gVar.mo386b(xh12, linkedList, 3966);
            for (FinderObject dv : mo10112n1()) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83329dv(dv, this.f172736d);
            }
        }
        C11385n nVar = this.f29302h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        LinkedList<FinderObject> n1 = mo10112n1();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(n1, 10));
        for (FinderObject b : n1) {
            arrayList.add(FinderItem.C56324a.m64570b(FinderItem.Companion, b, 0, 2, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f29301g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListRequest");
        C49842ig0 ig02 = ((C51565um0) aVar).f142934d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* renamed from: n1 */
    public final LinkedList<FinderObject> mo10112n1() {
        C47465a aVar = this.f29301g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
        LinkedList<FinderObject> linkedList = ((C51710vm0) aVar).f143556d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…FavListResponse).`object`");
        return linkedList;
    }

    /* renamed from: o1 */
    public final int mo10113o1() {
        String str = this.f29303i;
        StringBuilder sb = new StringBuilder();
        sb.append("favCount = ");
        C47465a aVar = this.f29301g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
        sb.append(((C51710vm0) aVar).f143559g);
        Log.m105924i(str, sb.toString());
        C47465a aVar2 = this.f29301g.f127056b.f127083a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
        return ((C51710vm0) aVar2).f143559g;
    }
}
