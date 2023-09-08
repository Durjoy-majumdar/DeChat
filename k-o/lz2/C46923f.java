package lz2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import uz2.C52719u0;
import uz2.C52721v0;

/* renamed from: lz2.f */
public final class C46923f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126157d;

    /* renamed from: e */
    public final C47350c f126158e;

    /* renamed from: f */
    public C52721v0 f126159f;

    /* renamed from: g */
    public Integer f126160g;

    public C46923f() {
        this((C89349b) null, (Long) null, (Long) null, (Long) null, (Integer) null, 31, (C8480h) null);
    }

    public C46923f(C89349b bVar, Long l, Long l2, Long l3, Integer num, int i, C8480h hVar) {
        C13598b0 b0Var = null;
        bVar = (i & 1) != 0 ? null : bVar;
        l = (i & 2) != 0 ? null : l;
        l2 = (i & 4) != 0 ? null : l2;
        l3 = (i & 8) != 0 ? null : l3;
        num = (i & 16) != 0 ? null : num;
        this.f126160g = -1;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 4245;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/textstatusgetselfhistories";
        bVar2.f127066a = new C52719u0();
        bVar2.f127067b = new C52721v0();
        C47350c a = bVar2.mo72403a();
        this.f126158e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfHistoriesReq");
        C52719u0 u0Var = (C52719u0) aVar;
        u0Var.f147255d = bVar;
        if (l != null) {
            l.longValue();
            u0Var.f147256e = l.longValue();
            this.f126160g = Integer.valueOf((int) l.longValue());
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            this.f126160g = 0;
        }
        if (num != null) {
            num.intValue();
            this.f126160g = num;
        }
        if (l2 != null) {
            l2.longValue();
            u0Var.f147257f = l2.longValue();
        }
        if (l3 != null) {
            l3.longValue();
            u0Var.f147258g = l3.longValue();
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f126157d = nVar;
        return dispatch(gVar, this.f126158e, this);
    }

    public int getType() {
        return 4245;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfHistories", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f126158e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfHistoriesResp");
            this.f126159f = (C52721v0) aVar;
        }
        C11385n nVar = this.f126157d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
