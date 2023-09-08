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
import te3.C49712hj1;
import te3.C50016jo0;
import te3.C50155ko0;
import te3.C50505n71;
import zc1.C66785b;

/* renamed from: dj1.l1 */
public final class C7343l1 extends C60628i {

    /* renamed from: g */
    public C47350c f25464g;

    /* renamed from: h */
    public C11385n f25465h;

    public C7343l1(long j, long j2, String str, C89349b bVar, int i) {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 4168;
        C50016jo0 jo02 = new C50016jo0();
        jo02.f136220d = C46523h2.f125330a.mo71859a(4168);
        jo02.f136222f = C66785b.f191882e.mo90662O5();
        jo02.f136221e = j;
        jo02.f136223g = j2;
        jo02.f136225i = bVar;
        jo02.f136224h = str;
        jo02.f136226j = i;
        bVar2.f127066a = jo02;
        bVar2.f127067b = new C50155ko0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetliverewardgains";
        this.f25464g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetLiveReward", "NetSceneFinderGetLiveReward init, finderUsername = " + jo02.f136222f + ", liveId = " + j + ", objectId = " + j2 + ", objectNonceId = " + str + ",  lastBuffer = " + bVar + ", reward_type:" + i);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f25465h = nVar;
        return dispatch(gVar, this.f25464g, this);
    }

    public int getType() {
        return 4168;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderGetLiveReward", "onGYNetEnd, errType:" + i2 + ", errCode:" + i3 + ", errMsg:" + str);
        C11385n nVar = this.f25465h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public final LinkedList<C50505n71> mo8517l1() {
        C47465a aVar = this.f25464g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        LinkedList<C50505n71> linkedList = ((C50155ko0) aVar).f136906h;
        return linkedList == null ? new LinkedList<>() : linkedList;
    }
}
