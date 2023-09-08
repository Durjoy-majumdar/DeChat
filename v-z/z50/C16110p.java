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
import te3.C49023cm2;
import te3.C49166dm2;

/* renamed from: z50.p */
public final class C16110p extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43278d;

    /* renamed from: e */
    public C11385n f43279e;

    public C16110p(long j, String str, String str2) {
        C87412m.m108594g(str, "wechatRoomId");
        C87412m.m108594g(str2, "username");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49023cm2();
        bVar.f127067b = new C49166dm2();
        bVar.f127069d = 3559;
        bVar.f127068c = "/cgi-bin/micromsg-bin/kickaudience";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43278d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.KickAudienceRequest");
        C49023cm2 cm22 = (C49023cm2) aVar;
        cm22.f131826d = j;
        cm22.f131827e = str;
        cm22.f131828f = str2;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveKickAudience", "kick audience liveId:" + j + ", roomId:" + str + ", username:" + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f43279e = nVar;
        return dispatch(gVar, this.f43278d, this);
    }

    public int getType() {
        return 3559;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveKickAudience", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.KickAudienceResponse");
        C49166dm2 dm22 = (C49166dm2) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveKickAudience", "onGYNetEnd error");
        }
        C11385n nVar = this.f43279e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
