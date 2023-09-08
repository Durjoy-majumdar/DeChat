package uh3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51050r22;
import te3.C51193s22;

/* renamed from: uh3.b */
public final class C52577b extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f146858d = "MicroMsg.NetSceneGetLensList";

    /* renamed from: e */
    public final C47350c f146859e;

    /* renamed from: f */
    public C11385n f146860f;

    public C52577b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51050r22();
        bVar.f127067b = new C51193s22();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlenslist";
        bVar.f127069d = 3847;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f146859e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146860f = nVar;
        return dispatch(gVar, this.f146859e, this);
    }

    public int getType() {
        return 3847;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f146858d;
        Log.m105924i(str2, "onGYNetEnd: " + i2 + ", " + i3);
        C11385n nVar = this.f146860f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        if (i2 == 4 && i3 == 2) {
            C47465a aVar = this.f146859e.f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLensListRequest");
            C51050r22 r222 = (C51050r22) aVar;
            C47465a aVar2 = this.f146859e.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLensListResponse");
            C89349b bVar = ((C51193s22) aVar2).f141281d;
            if (bVar != null) {
                r222.f140677e = bVar;
                doScene(dispatcher(), this.f146860f);
            }
        }
    }

    public int securityLimitCount() {
        return 20;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        C87412m.m108594g(uVar, "rr");
        return y$$d.EOk;
    }
}
