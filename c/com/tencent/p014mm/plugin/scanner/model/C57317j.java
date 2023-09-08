package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75604z3;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51957xd;
import te3.C64230ae;
import te3.C64799wd;
import te3.C64852yd;
import te3.C64877zd;

/* renamed from: com.tencent.mm.plugin.scanner.model.j */
public final class C57317j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f164190d;

    /* renamed from: e */
    public final C47350c f164191e;

    /* renamed from: f */
    public int f164192f;

    /* renamed from: g */
    public long f164193g;

    public C57317j(byte[] bArr, int i, int i2, int i3, long j, int i4, boolean z, boolean z2, int i5, int i6, GoodsObject goodsObject, C64799wd wdVar, C51957xd xdVar, C64852yd ydVar) {
        byte[] bArr2 = bArr;
        long j2 = j;
        GoodsObject goodsObject2 = goodsObject;
        C64852yd ydVar2 = ydVar;
        C87412m.m108594g(bArr2, "imageData");
        this.f164192f = i;
        this.f164193g = j2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64877zd();
        bVar.f127067b = new C64230ae();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image";
        bVar.f127069d = 2580;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f164191e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageRequest");
        C64877zd zdVar = (C64877zd) aVar;
        zdVar.f186655f = i2;
        zdVar.f186654e = i3;
        zdVar.f186653d = C89349b.m111674a(bArr);
        zdVar.f186661o = j2;
        zdVar.f186660n = i4;
        zdVar.f186663q = z;
        zdVar.f186662p = z2;
        zdVar.f186665s = i5;
        zdVar.f186666t = i6;
        if (goodsObject2 != null) {
            zdVar.f186664r = goodsObject2;
        }
        zdVar.f186668v = wdVar;
        zdVar.f186669w = xdVar;
        zdVar.f186667u = ydVar2;
        zdVar.f186670x = C75604z3.m90844p();
        Object[] objArr = new Object[3];
        Float f = null;
        objArr[0] = ydVar2 != null ? Float.valueOf(ydVar2.f186490d) : null;
        objArr[1] = ydVar2 != null ? Float.valueOf(ydVar2.f186491e) : null;
        objArr[2] = ydVar2 != null ? Float.valueOf(ydVar2.f186492f) : f;
        Log.m105927v("MicroMsg.NetSceneAiScanImage", "alvinluo uploadImage location: %s, %s, %s", objArr);
        Log.m105925i("MicroMsg.NetSceneAiScanImage", "alvinluo NetSceneAiScanImage imageSize: %d, sessionId: %d, scanId: %s, requestType: %d, mode: %d, source: %d, usingAI: %b, isAiCrop: %b, originWidth: %d, originHeight: %d, mode: %d, send_srv_time: %d", Integer.valueOf(bArr2.length), Long.valueOf(j), Integer.valueOf(zdVar.f186660n), Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(zdVar.f186655f), Long.valueOf(zdVar.f186670x));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f164190d = nVar;
        return dispatch(gVar, this.f164191e, this);
    }

    public int getType() {
        return 2580;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneAiScanImage", "alvinluo onGYNetEnd errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f164190d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
