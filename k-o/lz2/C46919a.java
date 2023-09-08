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
import rz2.C48206h;
import su0.C13781a;
import uz2.C52704o0;
import uz2.C52706p0;

/* renamed from: lz2.a */
public final class C46919a extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f126144d;

    /* renamed from: e */
    public C11385n f126145e;

    /* renamed from: f */
    public final C47350c f126146f;

    public C46919a(String str, int i) {
        C87412m.m108594g(str, "statusId");
        this.f126144d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5967;
        bVar.f127068c = "/cgi-bin/micromsg-bin/textstatusdeleteselfhistory";
        bVar.f127066a = new C52704o0();
        bVar.f127067b = new C52706p0();
        C47350c a = bVar.mo72403a();
        this.f126146f = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusDeleteSelfHistoryReq");
        C52704o0 o0Var = (C52704o0) aVar;
        o0Var.f147171d = str;
        o0Var.f147172e = i;
        Log.m105924i("MicroMsg.TextStatus.NetSceneDeleteSelfHistory", "statusId:" + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f126145e = nVar;
        return dispatch(gVar, this.f126146f, this);
    }

    public int getType() {
        return 5967;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneDeleteSelfHistory", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C48206h t0 = C39674e.f106452d.mo62255t0();
            String str2 = this.f126144d;
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            t0.mo72962Lo(str2, a);
        }
        C11385n nVar = this.f126145e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
