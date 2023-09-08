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
import te3.C49764hx;
import te3.C49910ix;

/* renamed from: z50.a */
public final class C16102a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43254d;

    /* renamed from: e */
    public C11385n f43255e;

    public C16102a(long j, String str, boolean z) {
        C87412m.m108594g(str, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49764hx();
        bVar.f127067b = new C49910ix();
        bVar.f127069d = 3583;
        bVar.f127068c = "/cgi-bin/micromsg-bin/closelive";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneCloseLive", "close live id:" + j + " wechatRoomId:" + str + " cutLive:" + z);
        C47350c a = bVar.mo72403a();
        this.f43254d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CloseLiveRequest");
        C49764hx hxVar = (C49764hx) aVar;
        hxVar.f134916d = j;
        hxVar.f134917e = str;
        hxVar.f134918f = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneCloseLive", "doScene");
        this.f43255e = nVar;
        return dispatch(gVar, this.f43254d, this);
    }

    public int getType() {
        return 3583;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneCloseLive", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CloseLiveResponse");
        C49910ix ixVar = (C49910ix) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneCloseLive", "onGYNetEnd error");
        }
        C11385n nVar = this.f43255e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
