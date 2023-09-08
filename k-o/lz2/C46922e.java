package lz2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import uz2.C52714s0;
import uz2.C52716t0;
import uz2.C52728y;

/* renamed from: lz2.e */
public final class C46922e extends C117747y implements C1311n {

    /* renamed from: d */
    public final Integer f126153d;

    /* renamed from: e */
    public C11385n f126154e;

    /* renamed from: f */
    public final C47350c f126155f;

    /* renamed from: g */
    public C52716t0 f126156g;

    public C46922e(long j, Long l, Long l2, Long l3, Integer num) {
        this.f126153d = num;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4255;
        bVar.f127068c = "/cgi-bin/micromsg-bin/textstatusgeticonconfig";
        bVar.f127066a = new C52714s0();
        bVar.f127067b = new C52716t0();
        C47350c a = bVar.mo72403a();
        this.f126155f = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetIconConfigReq");
        C52714s0 s0Var = (C52714s0) aVar;
        s0Var.f147211d = j;
        long j2 = 0;
        s0Var.f147212e = l != null ? l.longValue() : 0;
        s0Var.f147213f = l2 != null ? l2.longValue() : 0;
        C52728y yVar = new C52728y();
        yVar.f147297d = "weapp_panel";
        yVar.f147298e = l3 != null ? l3.longValue() : j2;
        LinkedList<C52728y> linkedList = new LinkedList<>();
        linkedList.add(yVar);
        s0Var.f147215h = linkedList;
        s0Var.f147214g = num != null ? num.intValue() : 0;
        Log.m105924i("MicroMsg.TextStatus.NetSceneTextStatusGetIconConfig", "key:" + j + " coverAgendaKey:" + l + " keyValueConfigKey:" + l2 + " flag:" + num);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f126154e = nVar;
        return dispatch(gVar, this.f126155f, this);
    }

    public int getType() {
        return 4255;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusGetIconConfig", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f126155f.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetIconConfigResp");
            this.f126156g = (C52716t0) aVar;
        }
        C11385n nVar = this.f126154e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
