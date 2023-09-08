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
import uz2.C52696l;
import uz2.C52709q0;
import uz2.C52711r0;
import uz2.C52733z1;

/* renamed from: lz2.d */
public final class C46921d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126150d;

    /* renamed from: e */
    public final C47350c f126151e;

    /* renamed from: f */
    public C52711r0 f126152f;

    public C46921d(String str, String str2, C52733z1 z1Var) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6889;
        bVar.f127068c = "/cgi-bin/micromsg-bin/textstatusgetbrandinfo";
        bVar.f127066a = new C52709q0();
        bVar.f127067b = new C52711r0();
        C47350c a = bVar.mo72403a();
        this.f126151e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetBrandInfoReq");
        C52709q0 q0Var = (C52709q0) aVar;
        q0Var.f147185d = str;
        q0Var.f147186e = str2;
        q0Var.f147187f = z1Var;
        StringBuilder sb = new StringBuilder();
        sb.append("url:");
        sb.append(str);
        sb.append(" signature:");
        sb.append(str2);
        sb.append(", extInfo:");
        String str3 = null;
        if (z1Var != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("pay_sign:[");
            C52696l lVar = z1Var.f147311d;
            if (lVar != null) {
                str3 = "transaction_id:" + lVar.f147154d + " pay_signature:" + lVar.f147155e;
            }
            sb4.append(str3);
            sb4.append("] source_id:");
            sb4.append(z1Var.f147312e);
            sb4.append(" mp_signature:");
            sb4.append(z1Var.f147313f);
            str3 = sb4.toString();
        }
        sb.append(str3);
        Log.m105924i("MicroMsg.TextStatus.NetSceneTextStatusGetBrandInfo", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f126150d = nVar;
        return dispatch(gVar, this.f126151e, this);
    }

    public int getType() {
        return 6889;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusGetBrandInfo", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f126151e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetBrandInfoResp");
            this.f126152f = (C52711r0) aVar;
        }
        C11385n nVar = this.f126150d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
