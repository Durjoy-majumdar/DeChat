package z50;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C48854bg3;
import te3.C49000cg3;

/* renamed from: z50.s */
public final class C53746s extends C117747y implements C1311n {

    /* renamed from: d */
    public String f150879d;

    /* renamed from: e */
    public C47350c f150880e;

    /* renamed from: f */
    public C48854bg3 f150881f;

    /* renamed from: g */
    public C11385n f150882g;

    public C53746s(String str, int i, long j, byte[] bArr, String str2) {
        C87412m.m108594g(str, "content");
        C87412m.m108594g(bArr, "liveCookies");
        C87412m.m108594g(str2, "wechatRoomId");
        this.f150879d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48854bg3();
        bVar.f127067b = new C49000cg3();
        bVar.f127069d = 904;
        bVar.f127068c = "/cgi-bin/micromsg-bin/postlivemessage";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150880e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PostLiveMessageRequest");
        C48854bg3 bg32 = (C48854bg3) aVar;
        this.f150881f = bg32;
        bg32.f131104f = this.f150879d;
        bg32.f131103e = i;
        bg32.f131102d = C89349b.m111674a(bArr);
        C48854bg3 bg33 = this.f150881f;
        if (bg33 != null) {
            bg33.f131105g = j;
        }
        if (bg33 != null) {
            bg33.f131106h = str2;
        }
        if (bg33 != null) {
            bg33.f131107i = C75592q0.m90789s() + System.currentTimeMillis();
        }
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLivePostLiveMessage", "post msg content:" + this.f150879d + ", msgType:" + i + ", liveId:" + j + ", roomId:" + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLivePostLiveMessage", "doScene");
        this.f150882g = nVar;
        return dispatch(gVar, this.f150880e, this);
    }

    public int getType() {
        return 904;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLivePostLiveMessage", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PostLiveMessageResponse");
        C49000cg3 cg32 = (C49000cg3) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLivePostLiveMessage", "onGYNetEnd error");
        }
        C11385n nVar = this.f150882g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
