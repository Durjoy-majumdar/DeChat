package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C46115s5;
import it1.C60628i;
import java.util.LinkedList;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C50275lk0;
import te3.C51266sm0;
import te3.C51415tm0;
import zc1.C66785b;

/* renamed from: je1.g3 */
public final class C46520g3 extends C60628i implements C46115s5 {

    /* renamed from: g */
    public C47350c f125324g;

    /* renamed from: h */
    public C11385n f125325h;

    /* renamed from: i */
    public final String f125326i = "Finder.NetSceneFinderGetFansList";

    public C46520g3(C89349b bVar, long j, int i) {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3531;
        C51266sm0 sm02 = new C51266sm0();
        sm02.f141601d = C66785b.f191882e.mo90662O5();
        sm02.f141603f = bVar;
        sm02.f141604g = C46523h2.f125330a.mo71859a(3531);
        sm02.f141605h = j;
        sm02.f141606i = i;
        bVar2.f127066a = sm02;
        bVar2.f127067b = new C51415tm0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfanslist";
        this.f125324g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetFansList", "NetSceneFinderGetFansList,liveId:" + j + ",scene:" + i);
    }

    /* renamed from: H */
    public LinkedList<C50275lk0> mo71560H() {
        C47465a aVar = this.f125324g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
        return ((C51415tm0) aVar).f142289h;
    }

    /* renamed from: I0 */
    public boolean mo71561I0() {
        C47465a aVar = this.f125324g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
        return ((C51415tm0) aVar).f142286e != 0;
    }

    /* renamed from: W0 */
    public C89349b mo71562W0() {
        C47465a aVar = this.f125324g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListRequest");
        return ((C51266sm0) aVar).f141603f;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125325h = nVar;
        return dispatch(gVar, this.f125324g, this);
    }

    public int getType() {
        return 3531;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        String str3 = this.f125326i;
        Log.m105924i(str3, "errType " + i4 + ", errCode " + i5 + ", errMsg " + str2);
        if (i4 == 0 && i5 == 0) {
            C117407d.INSTANCE.idkeyStat(1279, 9, 1, false);
        } else {
            C117407d.INSTANCE.idkeyStat(1279, 10, 1, false);
        }
        C11385n nVar = this.f125325h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i4, i5, str2, this);
        }
    }

    /* renamed from: n */
    public C89349b mo71563n() {
        C47465a aVar = this.f125324g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
        return ((C51415tm0) aVar).f142288g;
    }
}
