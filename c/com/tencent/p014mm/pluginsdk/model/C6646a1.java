package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87203t;
import pe3.C47465a;
import te3.C51556uj3;
import te3.C51703vj3;

/* renamed from: com.tencent.mm.pluginsdk.model.a1 */
public final class C6646a1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f23958d;

    /* renamed from: e */
    public final C47350c f23959e;

    public C6646a1(String str) {
        C87412m.m108594g(str, "postId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11878;
        bVar.f127068c = "/cgi-bin/micromsg-bin/qqbrowserreport";
        bVar.f127066a = new C51556uj3();
        bVar.f127067b = new C51703vj3();
        C47350c a = bVar.mo72403a();
        this.f23959e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.QQBrowserReportReq");
        String str2 = "stat?urlid=45&oaid=" + C87203t.m108276l() + "&posid=" + str;
        Log.m105924i("MicroMsg.NetSceneQQBrowserReport", "reportString:" + str2 + ' ');
        ((C51556uj3) aVar).f142879d = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f23958d = nVar;
        return dispatch(gVar, this.f23959e, this);
    }

    public int getType() {
        return 11878;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.NetSceneQQBrowserReport", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f23959e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.QQBrowserReportResp");
            C51703vj3 vj32 = (C51703vj3) aVar;
        }
        C11385n nVar = this.f23958d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
