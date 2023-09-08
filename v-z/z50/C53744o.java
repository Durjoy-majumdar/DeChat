package z50;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51258sk2;
import te3.C51408tk2;

/* renamed from: z50.o */
public final class C53744o extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150874d;

    /* renamed from: e */
    public C51408tk2 f150875e;

    /* renamed from: f */
    public C11385n f150876f;

    public C53744o(long j, String str, byte[] bArr) {
        C87412m.m108594g(str, "roomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51258sk2();
        bVar.f127067b = new C51408tk2();
        bVar.f127069d = 3797;
        bVar.f127068c = "/cgi-bin/micromsg-bin/joinlive";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveJoinLive", "join live liveId:" + j + ", roomId:" + str);
        C47350c a = bVar.mo72403a();
        this.f150874d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.JoinLiveRequest");
        C51258sk2 sk22 = (C51258sk2) aVar;
        sk22.f141574d = j;
        sk22.f141575e = str;
        sk22.f141576f = C89349b.m111674a(bArr);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveJoinLive", "doScene");
        this.f150876f = nVar;
        return dispatch(gVar, this.f150874d, this);
    }

    public int getType() {
        return 3797;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveJoinLive", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.JoinLiveResponse");
        C51408tk2 tk22 = (C51408tk2) aVar;
        this.f150875e = tk22;
        if (i2 == 0 && i3 == 0) {
            C89349b bVar = tk22.f142256d;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157196g = bVar != null ? bVar.f257327a : null;
            C11385n nVar = this.f150876f;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveJoinLive", "onGYNetEnd error");
        C11385n nVar2 = this.f150876f;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
