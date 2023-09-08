package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.scanner.api.ScanImagePHashInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49131de;
import te3.C49270ee;

/* renamed from: com.tencent.mm.plugin.scanner.model.l */
public final class C42905l extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f116172d;

    /* renamed from: e */
    public final C47350c f116173e;

    /* renamed from: f */
    public long f116174f;

    public C42905l(long j, int i, ScanImagePHashInfo scanImagePHashInfo, int i2, C8480h hVar) {
        String str;
        String str2;
        i = (i2 & 2) != 0 ? 0 : i;
        this.f116174f = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49131de();
        bVar.f127067b = new C49270ee();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/imgretrieval/aiscan_image_scene_preview";
        bVar.f127069d = 5079;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116173e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageScenePreviewRequest");
        C49131de deVar = (C49131de) aVar;
        deVar.f132262g = j;
        deVar.f132263h = i;
        String str3 = "";
        deVar.f132260e = (scanImagePHashInfo == null || (str2 = scanImagePHashInfo.pHash) == null) ? str3 : str2;
        if (!(scanImagePHashInfo == null || (str = scanImagePHashInfo.pHashVersion) == null)) {
            str3 = str;
        }
        deVar.f132261f = str3;
        Log.m105925i("MicroMsg.NetSceneAiScanImageScenePreview", "alvinluo NetSceneAiScanImageScenePreview sessionId: %d, seqNum: %s", Long.valueOf(j), Integer.valueOf(i));
        Object[] objArr = new Object[2];
        String str4 = null;
        objArr[0] = scanImagePHashInfo != null ? scanImagePHashInfo.pHash : null;
        objArr[1] = scanImagePHashInfo != null ? scanImagePHashInfo.pHashVersion : str4;
        Log.m105927v("MicroMsg.NetSceneAiScanImageScenePreview", "alvinluo NetSceneAiScanImageScenePreview pHash: %s, pHashVersion: %s", objArr);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f116172d = nVar;
        return dispatch(gVar, this.f116173e, this);
    }

    public int getType() {
        return 5079;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneAiScanImageScenePreview", "alvinluo onGYNetEnd errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f116172d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
