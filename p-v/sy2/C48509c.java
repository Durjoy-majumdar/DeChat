package sy2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import eb0.C31543z5;
import eb0.C75592q0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import uy2.C52660e;
import uz2.C52724w1;
import uz2.C52727x1;

/* renamed from: sy2.c */
public final class C48509c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129740d;

    /* renamed from: e */
    public final C47350c f129741e;

    public C48509c(C52660e eVar) {
        C87412m.m108594g(eVar, "item");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4290;
        bVar.f127068c = "/cgi-bin/micromsg-bin/textstatusprivatechatsend";
        bVar.f127066a = new C52724w1();
        bVar.f127067b = new C52727x1();
        C47350c a = bVar.mo72403a();
        this.f129741e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusPrivateChatSendReq");
        C52724w1 w1Var = (C52724w1) aVar;
        w1Var.f147272d = eVar.field_tag;
        w1Var.f147273e = eVar.field_source_id;
        w1Var.f147274f = eVar.field_card_key;
        w1Var.f147275g = eVar.field_status_id;
        w1Var.f147276h = eVar.field_modify_count;
        w1Var.f147277i = eVar.field_encUsername;
        w1Var.f147278j = eVar.field_hash_username;
        w1Var.f147280o = eVar.field_session_id;
        w1Var.f147279n = MD5Util.getMD5String(C75592q0.m90789s()) + w1Var.f147280o + eVar.field_newMsgId + '_' + C31543z5.m39451a() + "_greetingReply";
        StringBuilder sb = new StringBuilder();
        sb.append("req cli_msg_id:");
        sb.append(w1Var.f147279n);
        sb.append(" msg_session_id:");
        sb.append(w1Var.f147280o);
        Log.m105918d("MicroMsg.TextStatus.NetSceneTextStatusPrivateChatSend", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f129740d = nVar;
        return dispatch(gVar, this.f129741e, this);
    }

    public int getType() {
        return 4290;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusPrivateChatSend", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f129741e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusPrivateChatSendResp");
            C52727x1 x1Var = (C52727x1) aVar;
        }
        C11385n nVar = this.f129740d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
