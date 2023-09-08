package z50;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82965h;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51914x22;
import te3.C52058y22;

/* renamed from: z50.e */
public final class C16106e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43267d;

    /* renamed from: e */
    public C52058y22 f43268e;

    /* renamed from: f */
    public C11385n f43269f;

    public C16106e(long j, String str) {
        C87412m.m108594g(str, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51914x22();
        bVar.f127067b = new C52058y22();
        bVar.f127069d = C82965h.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlivemicaudienceinfo";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneGetMicAudienceInfo", "get mic audience info id:" + j + " wechatRoomId:" + str);
        C47350c a = bVar.mo72403a();
        this.f43267d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveMicAudienceInfoRequest");
        C51914x22 x222 = (C51914x22) aVar;
        x222.f144417d = j;
        x222.f144418e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneGetMicAudienceInfo", "doScene");
        this.f43269f = nVar;
        return dispatch(gVar, this.f43267d, this);
    }

    public int getType() {
        return C82965h.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneGetMicAudienceInfo", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveMicAudienceInfoResponse");
        this.f43268e = (C52058y22) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneGetMicAudienceInfo", "onGYNetEnd error");
        }
        C11385n nVar = this.f43269f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
