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
import te3.C51572un2;
import te3.C51715vn2;

/* renamed from: z50.q */
public final class C53745q extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150877d;

    /* renamed from: e */
    public C11385n f150878e;

    public C53745q(long j, String str, int i) {
        C87412m.m108594g(str, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51572un2();
        bVar.f127067b = new C51715vn2();
        bVar.f127069d = 3957;
        bVar.f127068c = "/cgi-bin/micromsg-bin/likelive";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150877d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LikeLiveRequest");
        C51572un2 un22 = (C51572un2) aVar;
        un22.f142963d = j;
        un22.f142964e = str;
        un22.f142965f = (long) i;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveLike", "LikeLive liveId:" + j + ", roomId:" + str + ", likeCount:" + i);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveLike", "doScene");
        this.f150878e = nVar;
        return dispatch(gVar, this.f150877d, this);
    }

    public int getType() {
        return 3957;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveLike", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LikeLiveResponse");
        C51715vn2 vn22 = (C51715vn2) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveLike", "onGYNetEnd error");
        }
        C11385n nVar = this.f150878e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
