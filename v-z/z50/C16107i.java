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
import te3.C50230l9;
import te3.C50370m9;

/* renamed from: z50.i */
public final class C16107i extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43270d;

    /* renamed from: e */
    public C11385n f43271e;

    public C16107i(long j, String str, boolean z) {
        C87412m.m108594g(str, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50230l9();
        bVar.f127067b = new C50370m9();
        bVar.f127069d = 3664;
        bVar.f127068c = "/cgi-bin/micromsg-bin/banlivecomment";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43270d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BanLiveCommentRequest");
        C50230l9 l9Var = (C50230l9) aVar;
        l9Var.f137263d = j;
        l9Var.f137264e = str;
        l9Var.f137265f = z;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveBanLiveComment", "BanLiveComment liveId:" + j + ", roomId:" + str + ", enableComment:" + z + ' ');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveBanLiveComment", "doScene");
        this.f43271e = nVar;
        return dispatch(gVar, this.f43270d, this);
    }

    public int getType() {
        return 3664;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveBanLiveComment", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BanLiveCommentResponse");
        C50370m9 m9Var = (C50370m9) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveBanLiveComment", "onGYNetEnd error");
        }
        C11385n nVar = this.f43271e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
