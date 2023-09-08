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
import te3.C48844be;
import te3.C48990ce;

/* renamed from: com.tencent.mm.plugin.scanner.model.n */
public final class C42906n extends C117747y implements C1311n {

    /* renamed from: d */
    public String f116175d;

    /* renamed from: e */
    public C11385n f116176e;

    /* renamed from: f */
    public final C47350c f116177f;

    public C42906n(String str, String str2, int i) {
        this.f116175d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48844be();
        bVar.f127067b = new C48990ce();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_retrieval";
        bVar.f127069d = 1532;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116177f = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageRetrievalRequest");
        C48844be beVar = (C48844be) aVar;
        beVar.f131063d = str2;
        beVar.f131064e = i;
        Log.m105919d("MicroMsg.NetSceneBizAiScanImageRetrieval", "alvinluo AiScanImageRetrieval requestJson: %s, type: %d", str2, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116176e = nVar;
        return dispatch(gVar, this.f116177f, this);
    }

    public int getType() {
        return 1532;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBizAiScanImageRetrieval", "alvinluo onGYNetEnd errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f116176e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
