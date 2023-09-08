package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import sx3.C110818d0;
import te3.C50320lw3;
import te3.C64502kw3;
import te3.C64852yd;

/* renamed from: com.tencent.mm.plugin.scanner.model.o */
public final class C57321o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f164202d;

    /* renamed from: e */
    public final C47350c f164203e;

    public C57321o(List<String> list, boolean z, C64852yd ydVar) {
        C87412m.m108594g(list, "reqKeyList");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64502kw3();
        bVar.f127067b = new C50320lw3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/mmbizscan_v2_retrieval_lite";
        bVar.f127069d = 5057;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        MultiProcessMMKV multiProcessMMKV = C19021i0.f53459e;
        bVar.f127074i = multiProcessMMKV != null ? multiProcessMMKV.getInt("scan_config_retrieval_timeout", 5000) : 5000;
        C47350c a = bVar.mo72403a();
        this.f164203e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ScanV2RetrievalLiteRequest");
        C64502kw3 kw32 = (C64502kw3) aVar;
        kw32.f183989d.addAll(list);
        kw32.f183990e = z;
        if (ydVar != null) {
            kw32.f183991f = ydVar;
        }
        Object[] objArr = new Object[5];
        objArr[0] = C110818d0.m150921S(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        objArr[1] = Boolean.valueOf(z);
        Float f = null;
        objArr[2] = ydVar != null ? Float.valueOf(ydVar.f186490d) : null;
        objArr[3] = ydVar != null ? Float.valueOf(ydVar.f186491e) : null;
        objArr[4] = ydVar != null ? Float.valueOf(ydVar.f186492f) : f;
        Log.m105919d("MicroMsg.NetSceneBizAiScanImageRetrieval", "alvinluo AiScanImageRetrieval reqKeyList: %s, isClick: %s, location.latitude: %s, location.longitude: %s, location.precision: %s", objArr);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f164202d = nVar;
        return dispatch(gVar, this.f164203e, this);
    }

    public int getType() {
        return 5057;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBizAiScanImageRetrieval", "AiScanImageRetrieval onGYNetEnd errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f164202d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
