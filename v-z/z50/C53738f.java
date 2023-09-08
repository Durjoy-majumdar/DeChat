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
import te3.C51321t0;
import te3.C51472u0;

/* renamed from: z50.f */
public final class C53738f extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150858d;

    /* renamed from: e */
    public C11385n f150859e;

    public C53738f(long j, String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "audience");
        C87412m.m108594g(str2, "roomId");
        C87412m.m108594g(str3, "liveMicId");
        C87412m.m108594g(str4, "msgId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51321t0();
        bVar.f127067b = new C51472u0();
        bVar.f127069d = 3800;
        bVar.f127068c = "/cgi-bin/micromsg-bin/acceptlivemic";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150858d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AcceptLiveMicRequest");
        C51321t0 t0Var = (C51321t0) aVar;
        t0Var.f141861d = j;
        t0Var.f141862e = str;
        t0Var.f141863f = str2;
        t0Var.f141865h = str3;
        t0Var.f141864g = str4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveAcceptLiveMic", "doScene");
        this.f150859e = nVar;
        return dispatch(gVar, this.f150858d, this);
    }

    public int getType() {
        return 3800;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveAcceptLiveMic", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AcceptLiveMicResponse");
        C51472u0 u0Var = (C51472u0) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveAcceptLiveMic", "onGYNetEnd error");
        }
        C11385n nVar = this.f150859e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
