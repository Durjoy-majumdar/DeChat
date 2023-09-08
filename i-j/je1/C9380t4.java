package je1;

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
import te3.C48712ah0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C52258zg0;
import zc1.C66785b;

/* renamed from: je1.t4 */
public final class C9380t4 extends C9255j {

    /* renamed from: g */
    public C47350c f29296g;

    /* renamed from: h */
    public C11385n f29297h;

    /* renamed from: i */
    public final String f29298i = "Finder.NetSceneFinerCatelogStream";

    /* renamed from: j */
    public int f29299j;

    /* renamed from: n */
    public int f29300n;

    public C9380t4(int i, int i2, int i3, C89349b bVar, C89349b bVar2) {
        super((C49712hj1) null);
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127069d = 4239;
        this.f29300n = i;
        this.f29299j = i2;
        C52258zg0 zg02 = new C52258zg0();
        C46523h2 h2Var = C46523h2.f125330a;
        zg02.f145882d = h2Var.mo71859a(4239);
        zg02.f145883e = h2Var.mo71867j();
        zg02.f145888j = i;
        zg02.f145884f = i2;
        zg02.f145885g = i3;
        zg02.f145886h = bVar;
        zg02.f145887i = bVar2;
        zg02.f145889n = C66785b.f191882e.mo90662O5();
        bVar3.f127066a = zg02;
        bVar3.f127069d = 4239;
        bVar3.f127067b = new C48712ah0();
        bVar3.f127068c = "/cgi-bin/micromsg-bin/findercatelogstream";
        this.f29296g = bVar3.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29297h = nVar;
        return dispatch(gVar, this.f29296g, this);
    }

    public int getType() {
        return 4239;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        String str2 = this.f29298i;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str + ", tabType:" + this.f29299j);
        String str3 = this.f29298i;
        StringBuilder sb = new StringBuilder();
        sb.append("server increatment size:");
        C47465a aVar = this.f29296g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCatelogStreamResponse");
        sb.append(((C48712ah0) aVar).f130512f.size());
        Log.m105924i(str3, sb.toString());
        if (i2 == 0 && i3 == 0) {
            C47465a aVar2 = this.f29296g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCatelogStreamResponse");
            C48712ah0 ah02 = (C48712ah0) aVar2;
            for (FinderObject dv : mo10111n1()) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83329dv(dv, this.f172736d);
            }
        }
        C11385n nVar = this.f29297h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        LinkedList<FinderObject> n1 = mo10111n1();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(n1, 10));
        for (FinderObject b : n1) {
            arrayList.add(FinderItem.C56324a.m64570b(FinderItem.Companion, b, 0, 2, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f29296g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCatelogStreamRequest");
        C49842ig0 ig02 = ((C52258zg0) aVar).f145882d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* renamed from: n1 */
    public final LinkedList<FinderObject> mo10111n1() {
        C47465a aVar = this.f29296g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCatelogStreamResponse");
        LinkedList<FinderObject> linkedList = ((C48712ah0) aVar).f130512f;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…gStreamResponse).`object`");
        return linkedList;
    }
}
