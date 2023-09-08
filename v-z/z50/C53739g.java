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
import pe3.C89349b;
import te3.C48945c24;
import te3.C49086d24;
import te3.C50710oo2;

/* renamed from: z50.g */
public final class C53739g extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150860d;

    /* renamed from: e */
    public C11385n f150861e;

    public C53739g(long j, C50710oo2 oo22) {
        C87412m.m108594g(oo22, "status");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48945c24();
        bVar.f127067b = new C49086d24();
        bVar.f127069d = 3852;
        bVar.f127068c = "/cgi-bin/micromsg-bin/setanchorstatus";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150860d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SetAnchorStatusRequest");
        C48945c24 c242 = (C48945c24) aVar;
        c242.f131470d = j;
        c242.f131471e = C89349b.m111674a(oo22.toByteArray());
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveAnchorStatus", "liveId:" + j + " status:[" + oo22.f139283d + ", " + oo22.f139284e + ']');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150861e = nVar;
        return dispatch(gVar, this.f150860d, this);
    }

    public int getType() {
        return 3800;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveAnchorStatus", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SetAnchorStatusResponse");
        C49086d24 d242 = (C49086d24) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveAnchorStatus", "onGYNetEnd error");
        }
        C11385n nVar = this.f150861e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
