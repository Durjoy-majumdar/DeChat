package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51234sf;
import te3.C51387tf;

/* renamed from: com.tencent.mm.plugin.scanner.model.p */
public final class C5157p extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f20566d;

    /* renamed from: e */
    public final C47350c f20567e;

    public C5157p(String str) {
        C87412m.m108594g(str, "url");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51234sf();
        bVar.f127067b = new C51387tf();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/finder/bizfinderliveqrcode";
        bVar.f127069d = 5900;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f20567e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizFinderLiveQrCodeReq");
        ((C51234sf) aVar).f141467d = str;
        Log.m105918d("MicroMsg.NetSceneBizFinderLiveQrCode", "#init url=" + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f20566d = nVar;
        return dispatch(gVar, this.f20567e, this);
    }

    public int getType() {
        return 5900;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBizFinderLiveQrCode", "#onGYNetEnd errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f20566d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
