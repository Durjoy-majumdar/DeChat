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
import te3.C48894bq3;
import te3.C49038cq3;

/* renamed from: z50.t */
public final class C53747t extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150883d;

    /* renamed from: e */
    public C49038cq3 f150884e;

    /* renamed from: f */
    public C11385n f150885f;

    public C53747t(long j, String str, String str2) {
        C87412m.m108594g(str, "wechatRoomId");
        C87412m.m108594g(str2, "liveMicId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48894bq3();
        bVar.f127067b = new C49038cq3();
        bVar.f127069d = 760;
        bVar.f127068c = "/cgi-bin/micromsg-bin/refreshlivemic";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150883d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RefreshLiveMicRequest");
        C48894bq3 bq32 = (C48894bq3) aVar;
        bq32.f131258d = j;
        bq32.f131259e = str;
        bq32.f131260f = str2;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveRefreshMic", "liveId:" + j + ", wechatRoomId:" + str + ", liveMicId:" + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveRefreshMic", "doScene");
        this.f150885f = nVar;
        return dispatch(gVar, this.f150883d, this);
    }

    public int getType() {
        return 760;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveRefreshMic", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RefreshLiveMicResponse");
        this.f150884e = (C49038cq3) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveRefreshMic", "onGYNetEnd error");
        }
        C11385n nVar = this.f150885f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
