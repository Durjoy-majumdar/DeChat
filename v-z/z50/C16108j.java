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
import te3.C48919bx;
import te3.C49059cx;

/* renamed from: z50.j */
public final class C16108j extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43272d;

    /* renamed from: e */
    public C11385n f43273e;

    public C16108j(long j, String str, boolean z) {
        C87412m.m108594g(str, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48919bx();
        bVar.f127067b = new C49059cx();
        bVar.f127069d = 3530;
        bVar.f127068c = "/cgi-bin/micromsg-bin/closeapplylivemic";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveCloseApplyLiveMic", "close live id:" + j + " wechatRoomId:" + str + " isClose:" + z);
        C47350c a = bVar.mo72403a();
        this.f43272d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CloseApplyLiveMicRequest");
        C48919bx bxVar = (C48919bx) aVar;
        bxVar.f131362d = j;
        bxVar.f131363e = str;
        bxVar.f131364f = !z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveCloseApplyLiveMic", "doScene");
        this.f43273e = nVar;
        return dispatch(gVar, this.f43272d, this);
    }

    public int getType() {
        return 3530;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveCloseApplyLiveMic", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CloseApplyLiveMicResponse");
        C49059cx cxVar = (C49059cx) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveCloseApplyLiveMic", "onGYNetEnd error");
        }
        C11385n nVar = this.f43273e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
