package lz2;

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
import uz2.C52729y0;
import uz2.C52732z0;

/* renamed from: lz2.g */
public final class C46924g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126161d;

    /* renamed from: e */
    public final C47350c f126162e;

    /* renamed from: f */
    public C52732z0 f126163f;

    public C46924g(String str, C89349b bVar) {
        C87412m.m108594g(str, "statusId");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6621;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/textstatusgetselflikeds";
        bVar2.f127066a = new C52729y0();
        bVar2.f127067b = new C52732z0();
        C47350c a = bVar2.mo72403a();
        this.f126162e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfLikedsReq");
        C52729y0 y0Var = (C52729y0) aVar;
        y0Var.f147299d = str;
        y0Var.f147300e = bVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f126161d = nVar;
        return dispatch(gVar, this.f126162e, this);
    }

    public int getType() {
        return 6621;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfLikeds", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f126162e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfLikedsResp");
            this.f126163f = (C52732z0) aVar;
        }
        C11385n nVar = this.f126161d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
