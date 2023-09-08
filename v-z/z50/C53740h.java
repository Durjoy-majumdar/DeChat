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
import te3.C49105d7;
import te3.C49242e7;

/* renamed from: z50.h */
public final class C53740h extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150862d;

    /* renamed from: e */
    public C49242e7 f150863e;

    /* renamed from: f */
    public C11385n f150864f;

    public C53740h(long j, String str, String str2) {
        C87412m.m108594g(str, "roomId");
        C87412m.m108594g(str2, "msgId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49105d7();
        bVar.f127067b = new C49242e7();
        bVar.f127069d = 3995;
        bVar.f127068c = "/cgi-bin/micromsg-bin/applylivemic";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150862d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ApplyLiveMicRequest");
        C49105d7 d7Var = (C49105d7) aVar;
        d7Var.f132158d = j;
        d7Var.f132159e = str;
        d7Var.f132160f = str2;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveApplyLiveMic", "apply live mic, liveId:" + j + ", roomId:" + str + ", msgId:" + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveApplyLiveMic", "doScene");
        this.f150864f = nVar;
        return dispatch(gVar, this.f150862d, this);
    }

    public int getType() {
        return 3995;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveApplyLiveMic", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ApplyLiveMicResponse");
        this.f150863e = (C49242e7) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveApplyLiveMic", "onGYNetEnd error");
        }
        C11385n nVar = this.f150864f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
