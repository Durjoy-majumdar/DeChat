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
import te3.C49248e83;
import te3.C49394f83;

/* renamed from: z50.r */
public final class C16111r extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43280d;

    /* renamed from: e */
    public C11385n f43281e;

    public C16111r(long j, String str, boolean z) {
        C87412m.m108594g(str, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49248e83();
        bVar.f127067b = new C49394f83();
        bVar.f127069d = 3712;
        bVar.f127068c = "/cgi-bin/micromsg-bin/openlivereplay";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43280d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.OpenLiveReplayRequest");
        C49248e83 e832 = (C49248e83) aVar;
        e832.f132786d = j;
        e832.f132787e = str;
        e832.f132788f = z;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveOpenReplay", "open live replay liveId:" + j + " roomId:" + str + " enableLiveReplay:" + z);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveOpenReplay", "doScene");
        this.f43281e = nVar;
        return dispatch(gVar, this.f43280d, this);
    }

    public int getType() {
        return 3712;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveOpenReplay", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.OpenLiveReplayResponse");
        C49394f83 f832 = (C49394f83) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveOpenReplay", "onGYNetEnd error");
        }
        C11385n nVar = this.f43281e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
