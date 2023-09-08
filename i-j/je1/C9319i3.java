package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import fe1.C58961d;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49026cn0;
import te3.C49169dn0;
import te3.C49712hj1;

/* renamed from: je1.i3 */
public final class C9319i3 extends C60628i {

    /* renamed from: g */
    public C47350c f29110g;

    /* renamed from: h */
    public C11385n f29111h;

    /* renamed from: i */
    public final String f29112i = "Finder.NetSceneFinderGetFollowList";

    public C9319i3(C89349b bVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 713;
        C49026cn0 cn02 = new C49026cn0();
        cn02.f131834d = bVar;
        cn02.f131836f = C46523h2.f125330a.mo71859a(713);
        bVar2.f127066a = cn02;
        bVar2.f127067b = new C49169dn0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfollowlist";
        this.f29110g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetFollowList", "NetSceneFinderGetFollowList init ");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29111h = nVar;
        return dispatch(gVar, this.f29110g, this);
    }

    public int getType() {
        return 713;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        String str3 = this.f29112i;
        Log.m105924i(str3, "errType " + i4 + ", errCode " + i5 + ", errMsg " + str2);
        if (i4 == 0 && i5 == 0) {
            C117407d.INSTANCE.idkeyStat(1279, 7, 1, false);
        } else {
            C117407d.INSTANCE.idkeyStat(1279, 8, 1, false);
        }
        C47465a aVar = this.f29110g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListRequest");
        if (((C49026cn0) aVar).f131834d == null) {
            C85801v1 i6 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC;
            C47465a aVar3 = this.f29110g.f127056b.f127083a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
            i6.mo119677K(aVar2, Integer.valueOf(((C49169dn0) aVar3).f132432g));
        }
        LinkedList<FinderContact> l1 = mo10070l1();
        String str4 = this.f29112i;
        StringBuilder sb = new StringBuilder();
        sb.append("firstPage ");
        sb.append(mo10071n() == null);
        sb.append(", get ");
        sb.append(l1.size());
        sb.append(" follow contact ");
        Log.m105924i(str4, sb.toString());
        for (FinderContact j : l1) {
            C58961d.f168673a.mo84162j(j);
        }
        C11385n nVar = this.f29111h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i4, i5, str2, this);
        }
    }

    /* renamed from: l1 */
    public final LinkedList<FinderContact> mo10070l1() {
        C47465a aVar = this.f29110g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
        LinkedList<FinderContact> linkedList = ((C49169dn0) aVar).f132429d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…ListResponse).contactList");
        return linkedList;
    }

    /* renamed from: n */
    public final C89349b mo10071n() {
        C47465a aVar = this.f29110g.f127056b.f127083a;
        C49169dn0 dn02 = aVar instanceof C49169dn0 ? (C49169dn0) aVar : null;
        if (dn02 != null) {
            return dn02.f132430e;
        }
        return null;
    }
}
