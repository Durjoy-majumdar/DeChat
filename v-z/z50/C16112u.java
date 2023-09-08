package z50;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.j44;
import te3.k44;

/* renamed from: z50.u */
public final class C16112u extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43282d;

    /* renamed from: e */
    public C11385n f43283e;

    public C16112u(long j, String str) {
        C87412m.m108594g(str, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new j44();
        bVar.f127067b = new k44();
        bVar.f127069d = 3557;
        bVar.f127068c = "/cgi-bin/micromsg-bin/sharelive";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43282d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ShareLiveRequest");
        j44 j44 = (j44) aVar;
        j44.f135861d = j;
        j44.f135862e = str;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveShareLive", "liveId:" + j + " wechatRoomId:" + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveShareLive", "doScene");
        this.f43283e = nVar;
        return dispatch(gVar, this.f43282d, this);
    }

    public int getType() {
        return 3557;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveShareLive", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ShareLiveResponse");
        k44 k44 = (k44) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveShareLive", "onGYNetEnd error");
        }
        C11385n nVar = this.f43283e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
