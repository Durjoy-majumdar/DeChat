package lz2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import uz2.C52668a1;
import uz2.C52670b1;

/* renamed from: lz2.j */
public final class C10699j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f32139d;

    /* renamed from: e */
    public final C47350c f32140e;

    public C10699j() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6868;
        bVar.f127068c = "/cgi-bin/micromsg-bin/textstatusgetuserpermission";
        bVar.f127066a = new C52668a1();
        bVar.f127067b = new C52670b1();
        this.f32140e = bVar.mo72403a();
        C117407d.INSTANCE.idkeyStat(1629, 6, 1, false);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f32139d = nVar;
        return dispatch(gVar, this.f32140e, this);
    }

    public int getType() {
        return 6868;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusGetUserPermission", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i4 == 0 && i5 == 0) {
            C47465a aVar = this.f32140e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetUserPermissionResp");
            C52670b1 b1Var = (C52670b1) aVar;
            Log.m105924i("MicroMsg.TextStatus.NetSceneTextStatusGetUserPermission", "value: " + b1Var.f147062d);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LAST_INPUT_LEVEL_LONG_SYNC, Long.valueOf(b1Var.f147062d));
            if (b1Var.f147062d == 1) {
                C117407d.INSTANCE.idkeyStat(1629, 3, 1, false);
            } else {
                C117407d.INSTANCE.idkeyStat(1629, 4, 1, false);
            }
        } else {
            C117407d.INSTANCE.idkeyStat(1629, 5, 1, false);
        }
        C11385n nVar = this.f32139d;
        if (nVar != null) {
            nVar.onSceneEnd(i4, i5, str2, this);
        }
    }
}
