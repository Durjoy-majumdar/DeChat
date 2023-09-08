package qg1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import je1.C46523h2;
import o40.C61937h;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49712hj1;
import te3.C50235la1;
import te3.C50375ma1;

/* renamed from: qg1.h0 */
public final class C12223h0 extends C60628i {

    /* renamed from: g */
    public final String f35290g = "FLive.NetSceneFinderLiveVerify";

    /* renamed from: h */
    public C47350c f35291h;

    /* renamed from: i */
    public C11385n f35292i;

    public C12223h0() {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50235la1 la12 = new C50235la1();
        la12.f137277d = C46523h2.f125330a.mo71859a(5231);
        bVar.f127066a = la12;
        bVar.f127067b = new C50375ma1();
        bVar.f127069d = 5231;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveverify";
        this.f35291h = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f35292i = nVar;
        return dispatch(gVar, this.f35291h, this);
    }

    public int getType() {
        return 5231;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f35290g, "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            String str2 = this.f35290g;
            Log.m105924i(str2, "NetSceneFinderLiveVerify " + C61937h.m72709h(mo11955l1()));
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC, Boolean.valueOf(mo11955l1().f137923d));
        C11385n nVar = this.f35292i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public final C50375ma1 mo11955l1() {
        C47350c cVar = this.f35291h;
        C87412m.m108591d(cVar);
        C47465a aVar = cVar.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveVerifyResp");
        return (C50375ma1) aVar;
    }
}
