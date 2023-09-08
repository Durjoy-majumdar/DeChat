package lz2;

import az2.C39674e;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rz2.C48201c;
import su0.C13781a;
import uz2.C52723w0;
import uz2.C52726x0;

/* renamed from: lz2.h */
public final class C46925h extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f126164d;

    /* renamed from: e */
    public C11385n f126165e;

    /* renamed from: f */
    public final C47350c f126166f;

    public C46925h(String str) {
        this.f126164d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5215;
        bVar.f127068c = "/cgi-bin/micromsg-bin/textstatusgetselfinfo";
        bVar.f127066a = new C52723w0();
        bVar.f127067b = new C52726x0();
        this.f126166f = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f126165e = nVar;
        return dispatch(gVar, this.f126166f, this);
    }

    public int getType() {
        return 5215;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfinfo", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f126166f.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfInfoResp");
            C52726x0 x0Var = (C52726x0) aVar;
            C39674e eVar = C39674e.f106452d;
            C48201c kD = eVar.mo62255t0().mo72970kD(C13781a.m13082a());
            Object[] objArr = new Object[4];
            objArr[0] = this.f126164d;
            objArr[1] = kD != null ? kD.field_StatusID : null;
            objArr[2] = Integer.valueOf(x0Var.f147292d);
            objArr[3] = Integer.valueOf(x0Var.f147294f);
            Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfinfo", "GetSelfinfo back reqStatusId:%s, curStatusId:%s like:%s ref:%s", objArr);
            if (kD != null && C87412m.m108589b(kD.field_StatusID, this.f126164d)) {
                kD.field_LikeCount = x0Var.f147292d;
                kD.field_referenceCount = x0Var.f147294f;
                eVar.mo62255t0().update(kD, new String[0]);
            }
        }
        C11385n nVar = this.f126165e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
