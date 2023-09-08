package z50;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49482fx;
import te3.C49623gx;

/* renamed from: z50.k */
public final class C53741k extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150865d;

    /* renamed from: e */
    public C49482fx f150866e;

    /* renamed from: f */
    public C11385n f150867f;

    public C53741k(long j, String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "wechatRoomId");
        C87412m.m108594g(str2, "msgId");
        C87412m.m108594g(str3, "micId");
        C87412m.m108594g(str4, "micSdkId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49482fx();
        bVar.f127067b = new C49623gx();
        bVar.f127069d = 3509;
        bVar.f127068c = "/cgi-bin/micromsg-bin/closelivemic";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150865d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CloseLiveMicRequest");
        C49482fx fxVar = (C49482fx) aVar;
        this.f150866e = fxVar;
        fxVar.f133720d = j;
        fxVar.f133721e = str;
        fxVar.f133722f = str2;
        if (!TextUtils.isEmpty(str3)) {
            this.f150866e.f133723g = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            this.f150866e.f133724h = str4;
        }
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveCloseLiveMic", "liveId:" + j + ", wechatRoomId:" + str + ", msgId:" + str2 + ", micId:" + str3 + ", micSdkId:" + str4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150867f = nVar;
        return dispatch(gVar, this.f150865d, this);
    }

    public int getType() {
        return 3509;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveCloseLiveMic", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CloseLiveMicResponse");
        C49623gx gxVar = (C49623gx) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveCloseLiveMic", "onGYNetEnd error");
        }
        C11385n nVar = this.f150867f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
