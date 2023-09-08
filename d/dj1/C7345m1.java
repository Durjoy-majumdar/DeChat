package dj1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import je1.C46523h2;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49088d31;
import te3.C49538gb1;
import te3.C49712hj1;
import te3.C49924j01;
import te3.C50060k01;
import zc1.C66785b;

/* renamed from: dj1.m1 */
public final class C7345m1 extends C60628i {

    /* renamed from: g */
    public C47350c f25466g;

    /* renamed from: h */
    public C11385n f25467h;

    /* renamed from: i */
    public int f25468i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7345m1(int i, long j, long j2, String str, C89349b bVar, int i2, int i3) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "objectNonceId");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6484;
        C49924j01 j012 = new C49924j01();
        j012.f135789f = i;
        j012.f135787d = C46523h2.f125330a.mo71859a(6484);
        j012.f135788e = C66785b.f191882e.mo90662O5();
        j012.f135790g = j;
        j012.f135791h = j2;
        j012.f135793j = bVar;
        j012.f135792i = str;
        j012.f135794n = i2;
        j012.f135795o = i3;
        bVar2.f127066a = j012;
        bVar2.f127067b = new C50060k01();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetlotteryhistory";
        this.f25466g = bVar2.mo72403a();
        Log.m105924i("NetSceneFinderLiveLotteryHistory", "NetSceneFinderLiveLotteryHistory init, finderUsername = " + j012.f135788e + ", liveId = " + j + ", objectId = " + j2 + ", objectNonceId = " + str + ", scene = " + i + ",  lastBuffer = " + bVar + ", getType:" + i2 + ",supportMultiType:" + i3);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f25467h = nVar;
        return dispatch(gVar, this.f25466g, this);
    }

    public int getType() {
        return 6484;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("NetSceneFinderLiveLotteryHistory", "onGYNetEnd, errType:" + i2 + ", errCode:" + i3 + ", errMsg:" + str);
        C11385n nVar = this.f25467h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public final LinkedList<C49088d31> mo8519l1() {
        C47465a aVar = this.f25466g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetLotteryHistoryResponse");
        C49538gb1 gb12 = ((C50060k01) aVar).f136491d;
        LinkedList<C49088d31> linkedList = gb12 != null ? gb12.f133948d : null;
        return linkedList == null ? new LinkedList<>() : linkedList;
    }
}
