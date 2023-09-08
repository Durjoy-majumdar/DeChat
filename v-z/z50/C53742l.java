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
import te3.C48937c10;
import te3.C49077d10;

/* renamed from: z50.l */
public final class C53742l extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150868d;

    /* renamed from: e */
    public C49077d10 f150869e;

    /* renamed from: f */
    public C11385n f150870f;

    public C53742l(String str, String str2) {
        C87412m.m108594g(str, "liveName");
        C87412m.m108594g(str2, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48937c10();
        bVar.f127067b = new C49077d10();
        bVar.f127069d = 3501;
        bVar.f127068c = "/cgi-bin/micromsg-bin/createlive";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveCreateLive", "create live name:" + str + " roomId:" + str2);
        C47350c a = bVar.mo72403a();
        this.f150868d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CreateLiveRequest");
        C48937c10 c102 = (C48937c10) aVar;
        c102.f131437d = str;
        c102.f131438e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveCreateLive", "doScene");
        this.f150870f = nVar;
        return dispatch(gVar, this.f150868d, this);
    }

    public int getType() {
        return 3501;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveCreateLive", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CreateLiveResponse");
        this.f150869e = (C49077d10) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveCreateLive", "onGYNetEnd error");
        }
        C11385n nVar = this.f150870f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
