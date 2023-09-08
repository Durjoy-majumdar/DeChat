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
import te3.C49596gq2;
import te3.C49740hq2;

/* renamed from: z50.v */
public final class C16113v extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43284d;

    /* renamed from: e */
    public C11385n f43285e;

    /* renamed from: f */
    public Boolean f43286f;

    /* renamed from: g */
    public String f43287g;

    public C16113v() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49596gq2();
        bVar.f127067b = new C49740hq2();
        bVar.f127069d = 3895;
        bVar.f127068c = "/cgi-bin/micromsg-bin/liveverify";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43284d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveVerifyRequest");
        C49596gq2 gq22 = (C49596gq2) aVar;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveVerify", "live verify request.");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveVerify", "doScene");
        this.f43285e = nVar;
        return dispatch(gVar, this.f43284d, this);
    }

    public int getType() {
        return 3895;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveVerifyResponse");
        C49740hq2 hq22 = (C49740hq2) aVar;
        if (i2 == 0 && i3 == 0) {
            this.f43286f = Boolean.valueOf(hq22.f134819d);
            this.f43287g = hq22.f134820e;
            StringBuilder sb = new StringBuilder();
            sb.append("onGYNetEnd isVerify:");
            Object obj = this.f43286f;
            if (obj == null) {
                obj = "null";
            }
            sb.append(obj);
            Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveVerify", sb.toString());
        }
        C11385n nVar = this.f43285e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
