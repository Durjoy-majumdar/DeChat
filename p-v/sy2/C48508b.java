package sy2;

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
import uz2.C52694k0;
import uz2.C52697l0;
import uz2.C52715s1;
import uz2.C52717t1;

/* renamed from: sy2.b */
public final class C48508b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129737d;

    /* renamed from: e */
    public final C47350c f129738e;

    /* renamed from: f */
    public C52717t1 f129739f;

    public C48508b(LinkedList<C52694k0> linkedList) {
        C87412m.m108594g(linkedList, "cmds");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5907;
        bVar.f127068c = "/cgi-bin/micromsg-bin/textstatusoplog";
        bVar.f127066a = new C52715s1();
        bVar.f127067b = new C52717t1();
        C47350c a = bVar.mo72403a();
        this.f129738e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusOplogReq");
        ((C52715s1) aVar).f147216d = linkedList;
        StringBuilder sb = new StringBuilder();
        sb.append("req cmds:");
        StringBuilder sb4 = new StringBuilder("items:");
        for (C52694k0 k0Var : linkedList) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(k0Var);
            sb5.append('-');
            sb5.append(k0Var.f147151d);
            sb5.append(',');
            sb4.append(sb5.toString());
        }
        String sb6 = sb4.toString();
        C87412m.m108593f(sb6, "sb.toString()");
        sb.append(sb6);
        Log.m105924i("MicroMsg.TextStatus.NetSceneTextStatusOplog", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f129737d = nVar;
        return dispatch(gVar, this.f129738e, this);
    }

    public int getType() {
        return 5907;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusOplog", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f129738e.f127056b.f127083a;
            String str2 = null;
            this.f129739f = aVar instanceof C52717t1 ? (C52717t1) aVar : null;
            StringBuilder sb = new StringBuilder();
            sb.append("rsp:");
            C52717t1 t1Var = this.f129739f;
            if (t1Var != null) {
                StringBuilder sb4 = new StringBuilder("items:");
                LinkedList<C52697l0> linkedList = t1Var.f147221d;
                if (linkedList != null) {
                    for (C52697l0 l0Var : linkedList) {
                        sb4.append(l0Var + '-' + l0Var.f147156d + '-' + l0Var.f147157e + '-' + l0Var.f147158f);
                    }
                }
                str2 = sb4.toString();
                C87412m.m108593f(str2, "sb.toString()");
            }
            sb.append(str2);
            Log.m105924i("MicroMsg.TextStatus.NetSceneTextStatusOplog", sb.toString());
        }
        C11385n nVar = this.f129737d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
